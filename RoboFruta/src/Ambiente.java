
public class Ambiente {

    private int linhas;
    private int colunas;

    public Ambiente(int linhas,int colunas) {
        this.colunas=colunas;
        this.linhas=linhas;
    }
    public void setLinhas(int linhas){
        this.linhas = linhas;
    }
    public int getLinhas() {
        return linhas;
    }
    public void setColunas(int colunas){
        this.colunas=colunas;
    } 
    public int getColunas() {
        return colunas;
    }
    public void matrizAmbiente(){
        final int linhas = 4;
        final int colunas = 4;
        int[][] m = new int[linhas][colunas];
        for(int l = 0; l<linhas;l++){
            for(int c = 0; c<colunas;c++){
                m[l][c] = new SecureRandom().nextInt(1);
            }
     }
        for(int l = 0; l<linhas;l++){
            for(int c = 0; c<colunas;c++){
                System.out.printf("%d  " , m[l][c] );
            
            }
            System.out.printf("%n");
        } 
    }
    }
    
    

    


