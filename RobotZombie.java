public class RobotZombie extends Zombie{
    
    public RobotZombie(int x, int y){
        super(6,x,y);
        super.setShow('R');
    }
    
    public void update(){
        super.walk(4);
    }
}
