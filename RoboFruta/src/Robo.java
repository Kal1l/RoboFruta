import java.util.Scanner;

public class Robo{


    protected  int x = 0;
    protected  int y = 0;
    protected String cor;
    protected int[][] pos = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

    public Robo(int x, int y, String cor, int[][]pos ) {
        this.x = x;
        this.y = y;
        this.cor = cor;
        this.pos = pos;
    }


    public Robo() {
    }

    public void inicializarRobo(){

        pos[0][0] = 1;
    
    }


    public int mover(){

      
        Scanner input = new Scanner(System.in);
        
        int[][] pos = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

        int movimento;

        movimento = input.nextInt();
        
      switch (movimento){

        case 1:

        pos[x++][y]= 1;
      

        for(int n[]:pos ){
            for(int v: n ){
                System.out.printf("%d  " , v );
                
            }
            System.out.printf("%n");
        }


     break;  
     

        case 2:

        pos[x--][y]= 1;
      

        for(int n[]:pos ){
            for(int v: n ){
                System.out.printf("%d  " , v );
                
            }
            System.out.printf("%n");
        }
     break; 
        
    
    
    };



    
    return pos[0][0];}
    

   



}
