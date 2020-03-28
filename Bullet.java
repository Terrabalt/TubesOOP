public class Bullet extends Element{
    private int power;
    
    public Bullet(int power, Point p){
        super(p);
        this.power = power;
        super.setShow('-');
    }
    
    public Bullet(int power, int x, int y){
        super(x,y);
        this.power = power;
        super.setShow('-');
    }

    public int getPower(){
        return power;
    }

    public void setPower(int power){
        this.power = power;
    }
    
    public void fly(int distance){
        Point p = super.getOrigin();
        p.translate(-distance,0);
        Game.moveElement(this, p);
        super.setOrigin(p);        
    }

//    public void kill(Zombie z);

}