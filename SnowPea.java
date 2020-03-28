public class SnowPea extends Plant{
    
    public SnowPea(int x, int y){
        super(5,x,y);
        super.setShow('S');
    }
    
    public void shoot(){
        super.shoot(3);
    }

}