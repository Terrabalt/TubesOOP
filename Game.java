import java.util.Random;

public class Game{
    public static Arena arena;
    public static int sunflowerPoints;
    public static Zombie[] zombies; //dibuat generic(?)
    public static Plant[] plants; //dibuat generic(?)

    public static int getSunflowerPoints(){
        return sunflowerPoints;
    }

    public void setSunflowerPoints(int score){
        sunflowerPoints = score;
    }

    public Game(){
        Game.arena = new Arena();
        sunflowerPoints = 0;
    }

    public void begin(){
        
    }

    public void skip(){
        
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

    public static void deleteElmt(){
        
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
            zombie = new CrazyZombie(59, randomNumb);
        } else {
            zombie = new RobotZombie(59, randomNumb);
        }
        addElement(zombie);            
    }

    }