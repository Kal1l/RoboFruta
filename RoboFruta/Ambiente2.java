public class Ambiente2 {
    protected char[][] matriz = new char[5][5];//matriz ambiente
    public char[][] getMatriz() {
        return matriz;
    }
    
    public Ambiente2(){//construtor do objeto ambiente
    }

    public void matriz(int frutaX,int frutaY,int roboX,int roboY){   
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                matriz[i][j]='.';//espaços vazios
                if(matriz[i][j]==matriz[frutaX][frutaY]/*fruta X e Y são as coordenadas do spawn da fruta */){
                    matriz[frutaX][frutaY]='*';//fruta
                }
                if(matriz[i][j]==matriz[roboX][roboY]/*robo X e Y são as coordenadas do robô */){
                    matriz[roboX][roboY]='■';//personagem
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
}
