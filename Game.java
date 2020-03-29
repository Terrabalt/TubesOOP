import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Game{
    public static Arena arena;
    public static int sunflowerPoints;
    public static List<Zombie> zombies; //dibuat generic(?)
    public static List<Plant> plants; //dibuat generic(?)
    public static boolean end;

    // public int getSunflowerPoints(){
    //     return sunflowerPoints;
    // }


    // public void setSunflowerPoints(int score){
    //     sunflowerPoints = score;
    // }

    public Game(){
        Game.arena = new Arena();
        sunflowerPoints = 0;
        zombies = new ArrayList<Zombie>(); //buat generic euy
        plants = new ArrayList<Plant>(); //buat generic euy
        end = false;
    }

    public static void begin(){
        while (!end){
            if ((arena.row1[0] == 'C') || (arena.row1[0] == 'R') || (arena.row2[0] == 'C') || (arena.row2[0] == 'R') || (arena.row3[0] == 'C') || (arena.row3[0] == 'R') || (arena.row4[0] == 'C') || (arena.row4[0] == 'R')){ // cek ada zombie diujung ato ngga
                end = true;
                break;
            } else {}

            
        }
    }

    public static void skip(){
            System.out.print("Menjalankan zombie-zombie");
        for (Zombie zombie : zombies){
            zombie.walk();
        }
            System.out.println("");
    }

    public static boolean addElement(Element elmt){
        if (elmt.getOrigin().getOrdinat() == 1){
            if (arena.row1[elmt.getOrigin().getAbsis()-1] == ' '){
                arena.row1[elmt.getOrigin().getAbsis()-1] = elmt.getShow();
				return true;
            } else {
                System.out.println("Sudah terisi");
				return false;
            }
        } else if (elmt.getOrigin().getOrdinat() == 2){
            if (arena.row2[elmt.getOrigin().getAbsis()-1] == ' '){
                arena.row2[elmt.getOrigin().getAbsis()-1] = elmt.getShow();  
				return true; 
            } else {
                System.out.println("Sudah terisi");
				return false;
            }
        } else if (elmt.getOrigin().getOrdinat() == 3){
            if (arena.row3[elmt.getOrigin().getAbsis()-1] == ' '){
                arena.row3[elmt.getOrigin().getAbsis()-1] = elmt.getShow();  
				return true; 
            } else {
                System.out.println("Sudah terisi");
				return false;
            }
        } else if (elmt.getOrigin().getOrdinat() == 4){
            if (arena.row4[elmt.getOrigin().getAbsis()-1] == ' '){
                arena.row4[elmt.getOrigin().getAbsis()-1] = elmt.getShow();  
				return true; 
            } else {
                System.out.println("Sudah terisi");
				return false;
            }
        } else {
            System.out.println("Masukan ordinat tidak valid");
			return false;
        }
    }

    public static void deleteElement(Element elmt){
        if (elmt.getOrigin().getOrdinat() == 1){
            arena.row1[elmt.getOrigin().getAbsis()-1] = ' ';
        } else if (elmt.getOrigin().getOrdinat() == 2){
            arena.row2[elmt.getOrigin().getAbsis()-1] = ' ';
        } else if (elmt.getOrigin().getOrdinat() == 3){
            arena.row3[elmt.getOrigin().getAbsis()-1] = ' ';
        } else if (elmt.getOrigin().getOrdinat() == 4){
            arena.row4[elmt.getOrigin().getAbsis()-1] = ' ';
        } else {}
    }

    public static boolean moveElement(Element elmt, Point p){ 
	// bila elemen di p kosong, pindah elmt ke p dan return true. bila tidak, hanya return false.
        if (p.getOrdinat() == 1){
			if (arena.row1[p.getAbsis()-1] == ' ') {
				arena.row1[p.getAbsis()-1] = elmt.getShow();
				deleteElement(elmt);
				return true;
			} else {
				return false;
			}
        } else if (p.getOrdinat() == 2){
			if (arena.row2[p.getAbsis()-1] == ' ') {
				arena.row2[p.getAbsis()-1] = elmt.getShow();
				deleteElement(elmt);
				return true;
			} else {
				return false;
			}
        } else if (p.getOrdinat() == 3){
			if (arena.row3[p.getAbsis()-1] == ' ') {
				arena.row3[p.getAbsis()-1] = elmt.getShow();
				deleteElement(elmt);
				return true;
			} else {
				return false;
			}
        } else if (p.getOrdinat() == 4){
			if (arena.row4[p.getAbsis()-1] == ' ') {
				arena.row4[p.getAbsis()-1] = elmt.getShow();
				deleteElement(elmt);
				return true;
			} else {
				return false;
			}
        } else {
            System.out.println("Titik tidak valid");
			return false;
        }
    }
    
    public void addPlants(int x, int y, char type){
        Plant plant;
        if ((type == 'P') || (type == 'p')){
            plant = new PeaShooter(x, y);
            addElement(plant);
        } else if ((type == 'S') || (type == 's')){
            plant = new SnowPea(x,y);
            addElement(plant);
        } else {
            System.out.println("Input tipe salah");
        }
    }

    public void addZombies(){
        Random random = new Random();
        int randomNumb = random.nextInt(4);
        int randomZombie = random.nextInt(2);
        Zombie zombie;
        if (randomZombie == 0){
            zombie = new CrazyZombie(59, randomNumb+1);
        } else {
            zombie = new RobotZombie(59, randomNumb+1);
        }
        if (addElement(zombie)) {
			zombies.add(zombie);
		}            
    }

    }