import java.util.Scanner;  // Import the Scanner class


class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    
    Game game = new Game();
    System.out.println("WELCOME TO PLANT VS ZOMBIES");
    System.out.println("LET'S START THE GAME, SHALL WE?");
    System.out.println("");
    System.out.println("");
    Game.arena.printArena();
    System.out.println("Sunflower Points = " + Game.sunflowerPoints);
    while (!Game.end){
      Game.printCommand();
      String str = input.next();
      if (str.equals("SKIP")){
        Game.skip();
      } else if (str.equals("ADDPLANT")){
          int x = input.nextInt();
          int y = input.nextInt();
          String type = input.next();
          Game.addPlants(x, y, type);
          Game.skip();
      } else {
          System.out.println("Command salah!");
      }    
      Game.arena.printArena();
      System.out.println("Sunflower Points = " + Game.sunflowerPoints);
      System.out.println("");
      System.out.println("");
    }
    if (Game.end){
      System.out.println("GAME OVER");
      System.out.println("Points = " + Game.sunflowerPoints);
    }
    input.close();
  }
}    
    
/*    
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
    Game.arena.printArena();*/
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
