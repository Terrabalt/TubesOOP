import java.util.Scanner;  // Import the Scanner class
import java.util.Random;

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
	
    Random random = new Random();
    int randomX = random.nextInt(10) + 1;
    int randomY = random.nextInt(4) + 1;
	int randomPType = random.nextInt(2);
	if (randomPType == 1) {
		game.addPlants(randomX, randomY,'p');
	} else {
		game.addPlants(randomX, randomY,'s');		
	}
    Game.arena.printArena();
    randomX = random.nextInt(10) + 1;
    randomY = random.nextInt(4) + 1;
	randomPType = random.nextInt(2);
	if (randomPType == 1) {
		game.addPlants(randomX, randomY,'p');
	} else {
		game.addPlants(randomX, randomY,'s');		
	}
    Game.arena.printArena();
	Game.skip();
    Game.arena.printArena();
	Game.skip();
    Game.arena.printArena();
/*    game.addZombies();
    Game.arena.printArena();
    game.addZombies();
    Game.arena.printArena();
    game.addZombies();
    Game.arena.printArena();
    game.addZombies();
    Game.arena.printArena();
    game.addZombies();
    Game.arena.printArena();
    
      int x = input.nextInt();
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