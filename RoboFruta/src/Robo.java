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


    public Robo(int x2, int y2, Object cor2, int i) {
    }

    public void inicializarRobo(){
        

    }


    public int mover(){
        Ambiente ambiente = new Ambiente(x,y, pos);
        Scanner input = new Scanner(System.in);
        
        int[][] pos = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

        pos = ambiente.getM();

        

        int movimento;

    

        movimento = input.nextInt();

      

        /*switch (pos.hashCode()){
            case "Up".hashCode() : 
            return pos[x++];/* */
        
        

        
        //pra baixo
      if(movimento==1){
        

        for(int[] n:pos ){
            for(int v:n ){
                System.out.printf("%d  " , v );
                
            }
            System.out.printf("%n");
        }
      };
      //pra cima
      if(movimento==2){
        for(int l = 0; l<x;l++){
            for(int c = 0; c<y;c++){
                pos[l][c] = '0';
            }
        }

        for(int l = 0; l<x;l--){
            for(int c = 0; c<y;c++){
                System.out.printf("%d  " , pos[l--] );
                
            }
            System.out.printf("%n");
        }
      };
      //pra direita
      if(movimento==3){
        for(int l = 0; l<x;l++){
            for(int c = 0; c<y;c++){
                pos[l][c] = '0';
            }
        }

        for(int l = 0; l<x;l++){
            for(int c = 0; c<y;c++){
                System.out.printf("%d  " , pos[c++] );
                
            }
            System.out.printf("%n");
        }
      };
      //pra esquerda
      if(movimento==4){
        for(int l = 0; l<x;l++){
            for(int c = 0; c<y;c++){
                pos[l][c] = '0';
            }
        }

        for(int l = 0; l<x;l++){
            for(int c = 0; c<y;c++){
                System.out.printf("%d  " , pos[c--] );
                
            }
            System.out.printf("%n");
        }
    
    
        

    
    }return mover();
    

   



}
}
