public class Robo{
   //linhas
   protected int x=0;
   //colunas
   protected int y=0;
   protected int[][]posição = new int[x][y];
   protected String cor;

   public Robo(int[][] posição,String cor){
      this.posição=posição;
      this.cor=cor;
   }

   public int mover(){
      String movimento=new String();
      //pra baixo
      if(movimento=="d"){
         return posição[x++][y];
      };
      //pra cima
      if(movimento=="u"){
         return posição[x--][y];
      };
      //pra direita
      if(movimento=="r"){
         return posição[x][y++];
      };
      //pra esquerda
      if(movimento=="l"){
         return posição[x][y--];
      };
   }
}