import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Game{
    public static Arena arena;
    public static int sunflowerPoints;
    public static List<Element> elements;
    public static boolean end;

    // public int getSunflowerPoints(){
    //     return sunflowerPoints;
    // }


    // public void setSunflowerPoints(int score){
    //     sunflowerPoints = score;
    // }

    public Game(){
        Game.arena = new Arena();
        sunflowerPoints = 10000;
        elements = new ArrayList<Element>();
        end = false;
    }

    public static void skip(){
        while (!end){
            if ((arena.row1[1] == 'C') || (arena.row1[1] == 'R') || (arena.row2[1] == 'C') || (arena.row2[1] == 'R') || (arena.row3[1] == 'C') || (arena.row3[1] == 'R') || (arena.row4[1] == 'C') || (arena.row4[1] == 'R')){ // cek ada zombie diujung ato ngga
                end = true;
                break;
            } else {
                List<Element> cElements = new ArrayList<Element>(elements);
                for (Element element : cElements){
                    element.update();
                }
                addZombies();
            }
        }
    }

    public static void addElement(Element elmt){
        if (arena.addElement(elmt)) {
			elements.add(elmt);
		}
    }

    public static void deleteElement(Element elmt){
		if (elements.contains(elmt)) {
			arena.deleteElement(elmt.getOrigin());
			elements.remove(elmt);
		}
    }
	
    public static boolean moveElement(Element elmt, Point p){ 
	// bila elemen di p kosong, pindah elmt ke p dan return true. bila tidak, hanya return false.
        return arena.moveElement(elmt, p);
    }
    
    public static void addPlants(int x, int y, String type){
        Plant plant;
        if (type.equals("P") || (type.equals("p"))){
            plant = new PeaShooter(x, y);
            addElement(plant);
        } else if (type.equals("S") || (type.equals("s"))){
            plant = new SnowPea(x,y);
            addElement(plant);
        } else {
            System.out.println("Input tipe salah");
        }
    }

    public static void addZombies(){
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

    public static void printCommand(){
        System.out.println("COMMAND :");
        System.out.println("SKIP");
        System.out.println("ADDPLANT <row> <distance> <type>");
        System.out.println("row : 1 - 4 from top to bottom");
        System.out.println("distance : 1 - 59 from left to right");
        System.out.println("Type : P for PeaShooter ; S for SnowPea");
    }
}