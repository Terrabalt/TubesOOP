public class CrazyZombie extends Zombie{
    
    public CrazyZombie(int x, int y){
        super(3,x,y);
        super.setShow('C');
    }
    
    public void update(){
        super.walk(2);
    }
}