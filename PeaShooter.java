public class PeaShooter extends Plant{
    
    public PeaShooter(int x,int y){
        super(3,x,y);
        super.setShow('P');
    }

    public void update(){
        super.shoot(1);
    }

}