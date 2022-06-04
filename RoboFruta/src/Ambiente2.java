public class Ambiente2 {
    private int tamanho;//tamanho da matriz
    public int getTamanho() {
        return tamanho;
    }

    private char[][] matriz;//matriz de caractéres
    public char[][] getMatriz() {
        return matriz;
    }
    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }

    public Ambiente2(int tamanho){//construtor do objeto ambiente
        this.tamanho=tamanho;
    }

    public void matriz(int x,int y){
        int linhas=getTamanho();
        int colunas=getTamanho();
        matriz = new char[linhas][colunas];//matriz ambiente
        for(int i=0;i<getTamanho();i++){
            for(int j=0;j<getTamanho();j++){
                matriz[i][j]='O';//espaços vazios
                if(matriz[i][j]==matriz[x][y]){
                    matriz[x][y]='o';//fruta
                }
            }
            matriz[0][0]='■';//personagem
        }
    }

    public void mostrarMatriz(){     
        for(int i=0;i<getTamanho();i++){
            for(int j=0;j<getTamanho();j++){
                System.out.print(matriz[i][j]+" ");//espaço para melhor vizualização
            }
            System.out.println(" ");//espaço necessário
        }
    }
}
