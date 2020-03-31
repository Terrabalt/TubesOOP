public class RobotZombie extends Zombie{
    
    public RobotZombie(int x, int y){
        super(25,5,x,y);
        super.setShow('R');
    }
    
    public void update(){
        super.walk(distance);
    }
}
