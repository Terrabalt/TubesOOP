public abstract class Element{
    private Point origin;
    private char show;

    public Element(Point origin){
        this.origin = origin;
    }

    public Element(int x, int y){
        Point point = new Point(x,y);
        this.origin = point;
    }
    
    public Point getOrigin(){
        return origin;
    }
    
    public char getShow(){
        return show;
    }

    public void setShow(char a){
        show = a;
    }

    public void setOrigin(int x, int y){
        origin = new Point(x,y);
    }

    public void setOrigin(Point point){
        origin = point;
    }
    




}