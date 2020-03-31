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
    public void update() {
		fly(2);
	}
    public void fly(int distance){
        Point p = super.getOrigin();
        p.translate(distance,0);
		if(p.getAbsis() >= 60) {
			Game.deleteElement(this);
		} else
		if (Game.moveElement(this, p, false)) {
			super.setOrigin(p);
        }    
    }

//    public void kill(Zombie z);

}