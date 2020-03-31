import java.util.Scanner;  // Import the Scanner class
import java.util.Random;


class Main {
  protected static Scanner input = new Scanner(System.in); // Create a Scanner object
  protected static Random random = new Random();

  public static String command(){
    System.out.println("Masukkan perintah");
    String cmd = input.next();
    while((!cmd.equals("PEA")) && (!cmd.equals("SNOWPEA")) && (!cmd.equals("PLAY")) && (!cmd.equals("END")) && (!cmd.equals("SKIP")) && (cmd.equals("COMMAND"))){
      cmd = input.next();
    }
    return cmd;
  }

  public static Point getPosition(){
    System.out.println("Masukkan posisi x");
    int x = input.nextInt();
    while (x < 1 || x > 58){
      x = input.nextInt();
    }
    System.out.println("Masukkan posisi y");
    int y = input.nextInt();
    while (y < 0 || y > 4){
      y = input.nextInt();
    }
    Point p = new Point(x, (y));
    return p;
  }
  public static void main(String[] args) {
    Game game = new Game();

    // GAMEPLAY
    System.out.println("Welcome to Plants vs Zombies");
    Game.printCommand();
    String cmd = Main.command();
    int timer = 1;
  // execute command
    while (!cmd.equals("END")){
      if (cmd.equals("PLAY")){
        game.addZombies();
        //Game.skip();
        System.out.println("Selamat bermain!");
      } else if(cmd.equals("PEA")){
        Point temp = Main.getPosition();
        game.addPlants(temp.getAbsis(), temp.getOrdinat(), "P");
        Game.skip();
      } else if(cmd.equals("SNOWPEA")){
        Point temp = Main.getPosition();
        game.addPlants(temp.getAbsis(), temp.getOrdinat(), "S");
        Game.skip();
      } else if(cmd.equals("SKIP")){
        Game.skip();
      } else if (cmd.equals("COMMAND")){
        Game.printCommand();
      }

      if (timer %2 == 0){       //set sunflower points
        Game.sunflowerPoints += 100;
      }
      Game.arena.printArena();  //print arena
      System.out.println("Sunflower points: " + Game.sunflowerPoints);
      if (timer % 5 == 0){      // add zombie
        if (timer <20){
          game.addZombies();
        }
      }
      timer += 1; //update timer
      cmd = Main.command();   //receive command
    }
  }
}