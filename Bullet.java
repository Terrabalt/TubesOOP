public class Bullet{
    private char show;
    private Point origin;
    private int power;
    
    public Bullet(int power, Point p){
        this.power = power;
        this.show = '-';
        this.origin = p;
    }
    public char getShow(){
        return show;
    }

//    public void fly();

}