import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Game{
    public static Arena arena;
    public static int sunflowerPoints;
    public static List<Plant> plantList;
    public static List<Zombie> zombieList;
    public static List<Bullet> bulletList;
    public static boolean end;

    public int getSunflowerPoints(){
        return sunflowerPoints;
    }

    public void setSunflowerPoints(int score){
        sunflowerPoints = score;
    }

    public Game(){
        Game.arena = new Arena();
        sunflowerPoints = 3000;
        plantList = new ArrayList<Plant>();
        zombieList = new ArrayList<Zombie>();
        bulletList = new ArrayList<Bullet>();
        end = false;
    }

    /*
    public static void skip(){
        if (!end){
            if ((arena.row1[1] == 'C') || (arena.row1[1] == 'R') || (arena.row2[1] == 'C') || (arena.row2[1] == 'R') || (arena.row3[1] == 'C') || (arena.row3[1] == 'R') || (arena.row4[1] == 'C') || (arena.row4[1] == 'R')){ // cek ada zombie diujung ato ngga
                end = true;
            } else {
                for (Element element : plantList){
                    element.update();
                }
                for (Element element : zombieList){
                    element.update();
                }
                for (Element element : bulletList){
                    element.update();
                }
            }
        }
    }

    public static boolean addElement(Element elmt){
        if (arena.addElement(elmt)) {
            return true;
            /*
            Character showElmt = elmt.getShow();
            if (showElmt.equals('P') || showElmt.equals('S')){
                plantList.add(elmt);
            } else if (showElmt.equals('R') || showElmt.equals('C')){
                zombieList.add(elmt);
            } else if (showElmt.equals('-')){
                bulletList.add(elmt);
            }
            */
		} else {
            return false;
        }
    }

    public static void deleteElement(Element elmt){
        Character showElmt = elmt.getShow();
        if (showElmt.equals("P") || showElmt.equals("S")){
            if (plantList.contains(elmt)) {
                arena.deleteElement(elmt.getOrigin());
                plantList.remove(elmt);
            }
        } else if (showElmt.equals("R") || showElmt.equals("C")){
            if (zombieList.contains(elmt)) {
                arena.deleteElement(elmt.getOrigin());
                zombieList.remove(elmt);
            }
        } else if (showElmt.equals("-")){
            if (bulletList.contains(elmt)) {
                arena.deleteElement(elmt.getOrigin());
                bulletList.remove(elmt);
            }
        }
        */
    public static void skip() { 
        List<Element> cElements = new ArrayList<Element>(elements);
        for (Element element : cElements){
			if (elements.contains(element)) {
				element.update();
			}
        }
        addZombies();
        if ((arena.row1[1] == 'C') || (arena.row1[1] == 'R') || (arena.row2[1] == 'C') || (arena.row2[1] == 'R') || (arena.row3[1] == 'C') || (arena.row3[1] == 'R') || (arena.row4[1] == 'C') || (arena.row4[1] == 'R')){ // cek ada zombie diujung ato ngga
            end = true;
        }
    }

    public static void addElement(Element elmt, boolean mustNotOverlap){
		if (mustNotOverlap) {
			if (arena.addElement(elmt)) {
				elements.add(elmt);
			}
		} else {
			elements.add(elmt);
			arena.addElement(elmt);
		}
    }

    public static void deleteElement(Element elmt){
		if (elements.contains(elmt)) {
			arena.deleteElement(elmt.getOrigin());
			elements.remove(elmt);
			if (elmt.getShow() == 'R' || elmt.getShow() == 'C') {
				sunflowerPoints += 50;
			} 
		}
    }
	
    public static boolean moveElement(Element elmt, Point p, boolean mustNotOverlap) { 
	// bila elemen di p kosong, pindah elmt ke p dan return true. bila tidak, hanya return false.
		if (mustNotOverlap) {
			return arena.moveElement(elmt, p);
		} else {
			arena.moveElement(elmt, p);
			return true;
		}
    }
	
	public static List<Element> getElements(Point p) {
        List<Element> cElements = new ArrayList<Element>();
        for (Element element : elements){
            if(element.getOrigin().equals(p)) {
				cElements.add(element);
			}
        }
		return cElements;		
	}
    
    public static void addPlants(int x, int y, String type){
        Plant plant;
        if (type.equals("P") || (type.equals("p"))){
            plant = new PeaShooter(x, y);
            /*
            if (Game.addElement(plant)){
                plantList.add(plant);
            } else {
                System.out.println("Tidak dapat menambah Pea");
            }
        } else if (type.equals("S") || (type.equals("s"))){
            plant = new SnowPea(x,y);
            if (Game.addElement(plant)){
                plantList.add(plant);
            } else{
                System.out.println("Tidak dapat menambah SnowPea");
            }
            */
            addElement(plant, true);
			if (!elements.contains(plant)) {
				sunflowerPoints += 350;
			}
        } else if (type.equals("S") || (type.equals("s"))){
            plant = new SnowPea(x,y);
            addElement(plant, true);
			if (!elements.contains(plant)) {
				sunflowerPoints += 600;
			}
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
            zombie = new CrazyZombie(58, randomNumb+1);
        } else {
            zombie = new RobotZombie(58, randomNumb+1);
        /*}
        if (Game.addElement(zombie)){
            zombieList.add(zombie);
        }
        }
        addElement(zombie, true);  
        */    
    }

    public static void printCommand(){
        System.out.println("COMMAND :");
        System.out.println("PLAY");
        System.out.println("SKIP");
        System.out.println("PEA for PeaShooter");
        System.out.println("SNOWPEA for SnowPea");
        System.out.println("<row> : 1 - 4 from top to bottom");
        System.out.println("<distance> : 1 - 58 from left to right");
    }
}