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
        fly(10);
	}
    public void fly(int distance){
        //Element temp = this;
        boolean isShot = false;
        Point p = super.getOrigin();
        /*
        //Point pBfr = p;
        if ((p.getAbsis()+distance) >58){
            distance = 58 - p.getAbsis();
        }
        p.translate(distance,0);
		if (Game.moveElement(this, p)) {
            for (int i = 0; i < Game.zombieList.size(); i++){
                if ((Game.zombieList.get(i).getOrigin().getAbsis() - Game.zombieList.get(i).getDistance()) <p.getAbsis()){
                    Game.zombieList.get(i).shot(this.getPower());
                    System.out.println(Game.zombieList.get(i).getLife());
                    break;
                }
            }
            super.setOrigin(p);
        }
        if (p.getAbsis() == 58){
            Game.deleteElement(this);
            //Game.bulletList.remove(this);
        }
        System.out.println("Bullet: "+Game.bulletList.size());
        // Game.bulletList.remove(this);
        */
        while (distance > 0) {
			p.translate(1, 0);
			distance--;
			if (!Game.moveElement(this, p, true)) {
				if (Zombie.containsZombie(Game.getElements(p))) { //
					distance = 0;
					for (Element e : Game.getElements(p)) {
						if (Zombie.isZombie(e)) {
							((Zombie)e).shot(power);
						}
					}
					Game.deleteElement(this);
				} else {
					Game.moveElement(this, p, false);
					super.setOrigin(p);					
				}
			} else {
				super.setOrigin(p);
			}
			if (p.getAbsis() >= 60) {
				distance = 0;
			}
		}
    }

    public void kill(Zombie z) {
		z.shot(power);
		Game.deleteElement(this);
	}
}