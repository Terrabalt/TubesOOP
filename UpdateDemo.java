public class UpdateDemo{
    public static void main(String[] args){
        Game game = new Game();
        game.addZombies();
        game.addPlants(1, 1, 'P');
        game.addPlants(1, 2, 'S');
        for (Element element : Game.elements){
            System.out.println("before");
            element.update();
            System.out.println(element.getClass());
        }
    }
}