import java.util.Random;

public class Game{
    public static Arena arena;
    public static int sunflowerPoints;
    public static Box<Zombie> zombies; //dibuat generic(?)
    public static Box<Plant> plants; //dibuat generic(?)
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

//        zombies = new Zombie[240]; //buat generic euy
//        plants = new Plant[240]; //buat generic euy
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
        for (int i=0; i<240; i++){
//            zombies[i].walk(); gimana pake genericnya :( )
        }
    }

    public static void addElement(Element elmt){
        if (elmt.getOrigin().getOrdinat() == 1){
            if (arena.row1[elmt.getOrigin().getAbsis()-1] == ' '){
                arena.row1[elmt.getOrigin().getAbsis()-1] = elmt.getShow();
            } else {
                System.out.println("Sudah terisi");
            }
        } else if (elmt.getOrigin().getOrdinat() == 2){
            if (arena.row2[elmt.getOrigin().getAbsis()-1] == ' '){
                arena.row2[elmt.getOrigin().getAbsis()-1] = elmt.getShow();   
            } else {
                System.out.println("Sudah terisi");
            }
        } else if (elmt.getOrigin().getOrdinat() == 3){
            if (arena.row3[elmt.getOrigin().getAbsis()-1] == ' '){
                arena.row3[elmt.getOrigin().getAbsis()-1] = elmt.getShow();   
            } else {
                System.out.println("Sudah terisi");
            }
        } else if (elmt.getOrigin().getOrdinat() == 4){
            if (arena.row4[elmt.getOrigin().getAbsis()-1] == ' '){
                arena.row4[elmt.getOrigin().getAbsis()-1] = elmt.getShow();   
            } else {
                System.out.println("Sudah terisi");
            }
        } else {
            System.out.println("Masukan ordinat tidak valid");
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

    public static void moveElement(Element elmt, Point p){ //tambahin syarat kalau depannya ada sesuatu?
        if (p.getOrdinat() == 1){
            arena.row1[p.getAbsis()-1] = elmt.getShow();
            deleteElement(elmt);
        } else if (p.getOrdinat() == 2){
            arena.row2[p.getAbsis()-1] = elmt.getShow();
            deleteElement(elmt);
        } else if (p.getOrdinat() == 3){
            arena.row3[p.getAbsis()-1] = elmt.getShow();
            deleteElement(elmt);
        } else if (p.getOrdinat() == 4){
            arena.row4[p.getAbsis()-1] = elmt.getShow();
            deleteElement(elmt);
        } else {
            System.out.println("Titik tidak valid");
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
        addElement(zombie);            
    }

    }