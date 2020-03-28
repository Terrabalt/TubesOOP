import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    int x = input.nextInt();
    int y = input.nextInt();
    
    Game game = new Game();
    Arena arena = new Arena();
    arena.printArena();
    char type = 'P'; 
    game.addPlants(x,y,type);
    game.addZombies();
    arena.printArena();
    input.close();
  }
}