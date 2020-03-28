public abstract class Plant extends Element{
    private int life;

    public Plant(int life,int x,int y){
        super(x,y);
        this.life = life;
    }

    public Plant(int life, Point p){
        super(p);
        this.life = life;
    }

    public int getLife(){
        return life;
    }

    public void setLife(int life){
        this.life = life;
    }
        
    public void shoot(int power){
        Bullet bullet = new Bullet(power,super.getOrigin().getAbsis()+1, super.getOrigin().getOrdinat());
        
    }

    public void eaten(int power){
        if (life >= power){
            setLife(getLife()-power);
        } else {
            setLife(0);
        }
    }


    
}