package game2;
public class Ambiente {
    protected char[][] matriz = new char[5][5];
    public Ambiente(){}

    public void matriz(int frutaX,int frutaY,int roboX,int roboY){  //adaptar para 2 robôs na matriz (concluído?)
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                matriz[i][j]='.';
                if(matriz[i][j]==matriz[frutaX][frutaY]){
                    matriz[frutaX][frutaY]='*';
                if(matriz[i][j]==matriz[roboX][roboY]/*robo X e Y são as coordenadas do robô */){
                    matriz[roboX][roboY]='●';
                    matriz[roboX][roboY]='■';//personagem
                    }
                }
            }
        }
    }
    public void mostrarMatriz(){     
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(matriz[i][j]+" ");//espaço para melhor vizualização
            }
            System.out.println(" ");//espaço necessário
        }
    }

    public char[][] getMatriz() {
        return matriz;
    }
}
