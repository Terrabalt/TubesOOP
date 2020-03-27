public abstract class Zombie{
    private int life;
    private Point origin;
    private char show;

    public Zombie(int life, int x, int y){
        this.life = life;
        Point p = new Point(x,y);
        this.origin = p;
    }

    public int getLife(){
        return life;
    }

    public Point getPoint(){
        return origin;
    }
    
    public char getShow(){
        return show;
    }

    public void setShow(char a){
        show = a;
    }
//    public abstract void walk();

//    public void eat(Plant p)
}