public class PeaShooter extends Plant{
    
    public PeaShooter(int x,int y){
        super(3,x,y);
        super.setShow('P');
    }

    public void shoot(){
        super.shoot(1);
    }

}