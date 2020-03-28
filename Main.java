import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    
    Game game = new Game();
    char typeP = 'P'; 
    char typeS = 'S';
    Game.arena.printArena();
    System.out.println("MULAI!");

    game.addZombies();
    Game.arena.printArena();
    game.addZombies();
    Game.arena.printArena();
    game.addZombies();
    Game.arena.printArena();
    game.addZombies();
    Game.arena.printArena();
    game.addZombies();
    Game.arena.printArena();
    game.addZombies();
    Game.arena.printArena();
    game.addZombies();
    Game.arena.printArena();
    
/*      int x = input.nextInt();
      int y = input.nextInt();
      String type = input.next();
      if (type.equals("pea")){
        game.addPlants(x,y,typeP);
      } else {
        game.addPlants(x,y,typeS);
      }
      game.addZombies();
      Game.arena.printArena();   
      System.out.println("Selanjutnya");   

       x = input.nextInt();
       y = input.nextInt();
       type = input.next();
      if (type.equals("pea")){
        game.addPlants(x,y,typeP);
      } else {
        game.addPlants(x,y,typeS);
      }
      game.addZombies();
      Game.arena.printArena();   
      System.out.println("Selanjutnya");   

       x = input.nextInt();
       y = input.nextInt();
       type = input.next();
      if (type.equals("pea")){
        game.addPlants(x,y,typeP);
      } else {
        game.addPlants(x,y,typeS);
      }
      game.addZombies();
      Game.arena.printArena();   
      System.out.println("Selanjutnya");   
*/

      input.close();
  }
}