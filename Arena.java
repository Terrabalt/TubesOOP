public class Arena{
    static public int score;
    private char[] row1; 
    private char[] row2; 
    private char[] row3; 
    private char[] row4; 
    
    public Arena(){
        Arena.score = 0;
        this.row1 = new char[60];
        this.row2 = new char[60];
        this.row3 = new char[60];
        this.row4 = new char[60];

        row1[0] = '*';
        row1[59] = '*'; 
        for (int i= 1; i < 59; i++ ){
            row1[i] = ' ';            
        }
        row2[0] = '*';
        row2[59] = '*'; 
        for (int i= 1; i < 59; i++ ){
            row2[i] = ' ';            
        }
        row3[0] = '*';
        row3[59] = '*'; 
        for (int i= 1; i < 59; i++ ){
            row3[i] = ' ';            
        }
        row4[0] = '*';
        row4[59] = '*'; 
        for (int i= 1; i < 59; i++ ){
            row4[i] = ' ';            
        }
    }

    public void printArena(){
        //line 1
        for (int i= 0; i < 60; i++ ){
            System.out.print('*');            
        }
        System.out.print('\n');
        //row 1
        for (int i= 0; i < 60; i++ ){
            System.out.print(row1[i]);            
        }
        System.out.print('\n');
        //line 2
        for (int i= 0; i < 60; i++ ){
            System.out.print('*');            
        }
        System.out.print('\n');
        //row 2
        for (int i= 0; i < 60; i++ ){
            System.out.print(row2[i]);            
        }
        System.out.print('\n');
        //line 3
        for (int i= 0; i < 60; i++ ){
            System.out.print('*');            
        }
        System.out.print('\n');
        //row 3
        for (int i= 0; i < 60; i++ ){
            System.out.print(row3[i]);            
        }
        System.out.print('\n');
        //line 4
        for (int i= 0; i < 60; i++ ){
            System.out.print('*');            
        }
        System.out.print('\n');
        //row 4
        for (int i= 0; i < 60; i++ ){
            System.out.print(row4[i]);            
        }
        System.out.print('\n');
        //line 5
        for (int i= 0; i < 60; i++ ){
            System.out.print('*');            
        }
        System.out.print('\n');
    }
        public void addPlant (Plant plant) {
            if (plant.getOrigin().getOrdinat() == 1){
                if (row1[plant.getOrigin().getAbsis()-1] == ' '){
                    row1[plant.getOrigin().getAbsis()-1] = plant.getShow(); 
                    System.out.println("---" + row1[plant.getOrigin().getAbsis()-1] + "---");
                } else {
                    System.out.println("Sudah terisi");
                }
            } else if (plant.getOrigin().getOrdinat() == 2){
                if (row2[plant.getOrigin().getAbsis()-1] == ' '){
                    row2[plant.getOrigin().getAbsis()-1] = plant.getShow();   
                } else {
                    System.out.println("Sudah terisi");
                }
            } else if (plant.getOrigin().getOrdinat() == 3){
                if (row3[plant.getOrigin().getAbsis()-1] == ' '){
                    row3[plant.getOrigin().getAbsis()-1] = plant.getShow();   
                } else {
                    System.out.println("Sudah terisi");
                }
            } else if (plant.getOrigin().getOrdinat() == 4){
                if (row4[plant.getOrigin().getAbsis()-1] == ' '){
                    row4[plant.getOrigin().getAbsis()-1] = plant.getShow();   
                } else {
                    System.out.println("Sudah terisi");
                }
            } else {
                System.out.println("Masukan tidak valid");
            }
        }


    }