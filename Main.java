import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    int x = input.nextInt();
    int y = input.nextInt();
    
    Game game = new Game();
    Arena arena = new Arena();
    arena.printArena();
    Plant plantA = new PeaShooter(x,y);
    arena.addPlant(plantA);
    arena.printArena();
    arena.addPlant(plantA);
    input.close();
  }
}