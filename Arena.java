public class Arena{

    public char[] row1; 
    public char[] row2; 
    public char[] row3; 
    public char[] row4; 
    
    public Arena(){
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

    public char getArray (int x, int y){
        char[] arr = new char[60];
        if (x == 1){
            arr = row1;
        } else if (x == 2){
            arr = row2;
        } else if (x == 3){
            arr = row3;
        } else if (x == 4){
            arr = row4;
        } else {} 
        return arr[y-1];
    }

    public char getArray (Point p){
        int x = p.getAbsis();
        int y = p.getOrdinat();
        return getArray(x, y);
    }
}
