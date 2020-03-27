public abstract class Plant{
    private int life;
    private Point origin;
    private char show;

    public Plant(int life,int x,int y){
        this.life = life;
        this.origin = new Point(x,y);
    }

    public int getLife(){
        return life;
    }

    public Point getOrigin(){
        return origin;
    }

    public char getShow(){
        return show;
    }

    public void setLife(int life){
        this.life = life;
    }
    
    public void setPoint(int x, int y){
        Point p = new Point(x,y);
        this.origin = p;
    }
    
    public void setShow(char a){
        this.show = a;
    }
    
//    public abstract void shoot();


    
}