public class Box<Element>{
    private Element elmt;


    public void add(Element elmt){
        this.elmt = elmt;
    }
    public Element get(){
        return elmt;
    }

}