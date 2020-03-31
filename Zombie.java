public abstract class Zombie extends Element{
    private int life;
    protected int distance;

    public Zombie(int life, int distance, int x, int y){
        super(x,y);
        this.life = life;
        this.distance = distance;
    }

    public Zombie(int life, Point p){
        super(p);
        this.life = life;
    }

    public int getLife(){
        return life;
    }

    public void setLife(int life){
        this.life = life;
    }

    
    public int getDistance(){
        return distance;
    }

    public void setDistance(int dist){
        distance = dist;
    }
    
	public void walk() {
		walk(1);
	}
	
    protected void walk(int distance){
        Point p = super.getOrigin();
        p.translate(-distance,0);
        while (distance > 0) {
			if (Game.moveElement(this, p)) {
				super.setOrigin(p);
				distance = 0;
			} else {
				distance--;
				p.translate(1,0);
			}
		}
    }

    // public void eat (Plant p);
        
    public void shot(int power){
        if ((life-power) > power){
            setLife(getLife()-power);
            Game.sunflowerPoints += 1;
        } else {
            setLife(0);
        }
        if (life == 0){ 
            Game.deleteElement(this);
        }
    } 

}