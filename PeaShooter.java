public class PeaShooter extends Plant{
    
    public PeaShooter(int x,int y){
        super(3,350, x,y);
        super.setShow('P');
        Game.sunflowerPoints-=350;
    }

    public void update(){
        super.shoot(1);
    }

}