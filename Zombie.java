public abstract class Zombie extends Element{
    private int life;

    public Zombie(int life, int x, int y){
        super(x,y);
        this.life = life;
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

    public void walk(int distance){
        Point p = super.getOrigin();
        p.translate(-distance,0);
        super.setOrigin(p);
        
    }

    // public void eat (Plant p);
        
    public void shot(int power){
        if (life >= power){
            setLife(getLife()-power);
            Game.sunflowerPoints += 1;
        } else {
            setLife(0);
        }
    } 

}