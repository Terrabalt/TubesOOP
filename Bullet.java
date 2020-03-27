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
    
    public int getPower(){
        return power;
    }
    public Point getOrigin(){
        return origin;
    }

    public void setOrigin(int x, int y){
        origin.setAbsis(x);
        origin.setOrdinat(y);
    }

    public void setShow(char a){
        show = a;
    }

    public void setPower(int power){
        this.power = power;
    }
    
//    public void fly();

//    public void kill(Zombie z);

}