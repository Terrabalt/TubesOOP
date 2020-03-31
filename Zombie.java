import java.util.List;

public abstract class Zombie extends Element{
    private int life;
    protected int distance;

	public static boolean isZombie(Element e) {
		return e.getShow() == 'R' || e.getShow() == 'C';
	}
	
	public static boolean containsZombie(List<Element> e) {
        for (Element element : e){
            if (isZombie(element)) {
				return true;
			}
        }
		return false;		
	}
	
    public Zombie(int life, int x, int y){
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
        while (distance > 0) {
			p.translate(-1, 0);
			distance--;
			if (!Game.moveElement(this, p, true)) {
				if (Plant.containsPlant(Game.getElements(p))) { //
					distance = 0;
					for (Element e : Game.getElements(p)) {
						if (Plant.isPlant(e)) {
							((Plant)e).eaten(1);
						}
					}
				} else if (!Zombie.containsZombie(Game.getElements(p))){
					Game.moveElement(this, p, false);
					super.setOrigin(p);					
					for (Element e : Game.getElements(p)) {
						if (e.getShow() == '-') {
							((Bullet)e).kill(this);
						}
					}
				}
			} else {
				super.setOrigin(p);
			}
			if (p.getAbsis() <= 1) {
				distance = 0;
			}
		}
    }
        
    public void shot(int power){
        if ((life-power) > power){
            setLife(getLife()-power);
        } else {
            setLife(0);
        }
        if (life == 0){ 
            Game.deleteElement(this);
        }
    } 

}