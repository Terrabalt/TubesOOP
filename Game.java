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
        sunflowerPoints = 0;
        elements = new ArrayList<Element>();
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
		List<Element> cElements = new ArrayList<Element>(elements);
        for (Element element : cElements){
            element.update();
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