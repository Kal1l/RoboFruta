public class Ambiente2 {
    private int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    private int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public Ambiente2(int x,int y){
        this.x=x;
        this.y=y;
    }

    public void matriz(){
        int linhas=getX();
        int colunas=getY();
        int[][] matriz = new int[linhas][colunas];
        for(int i=0;i<linhas;i++){
            for(int j=0;j<colunas;j++){
                matriz[i][j]=0;
            }
        }
        for(int i=0;i<linhas;i++){
            for(int j=0;j<colunas;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
