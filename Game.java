public class Game{
    public static Arena arena;
    public int score;
    public static Zombie[] zombies; //dibuat generic(?)
    public static Plant[] plants; //dibuat generic(?)


    public Game(){
        Game.arena = new Arena();
        score = 0;
    }

    public void begin(){
        
    }

    public void skip(){
        
    }
}