package game2;
public class Ambiente {
    protected char[][] matriz = new char[5][5];
    public Ambiente(){}

    public void matriz (int frutaX,int frutaY,int roboX,int roboY,int robo2X,int robo2Y){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                matriz[i][j]='.';
                if(matriz[i][j]==matriz[roboX][roboY]){
                    matriz[roboX][roboY]='■';
                }
                else if(matriz[i][j]==matriz[robo2X][robo2Y]){
                    matriz[robo2X][robo2Y]='O';
                }
                else if(matriz[i][j]==matriz[frutaX][frutaY]){
                    matriz[frutaX][frutaY]='*';
                }
            }
        }
    }
    public void mostrarMatriz(){     
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(matriz[i][j]+" ");//espaço para melhor vizualização
            }
            System.out.println(" ");
    }
}
    
    public char[][] getMatriz() {
        return matriz;
    }
}
