import java.util.Scanner;
public class Robo2 {
    //posições do robô no eixo
    protected int x=0;
    protected int y=0;
    protected String cor; // ainda tem que descobrir como mudar a cor do caractére(nem sei se é só na interface ou se da pra fazer no temrinal)
    Scanner input=new Scanner(System.in);

    public Robo2(/*String cor*/){ //construtor do objeto robô(cor está comentado pra facilitar na velocidade dos testes)
        x=0;
        y=0;
        //this.cor=cor;
    }

    public void mover(String movimento){;//ainda tem que trabalha na excessão
        //fazer o movimento propriamente dito,talvez usar o setMatriz(?)
        if(movimento.equals("up")){
            x--;
        }
        else if(movimento.equals("down")){
            x++;
        }
        else if(movimento.equals("right")){
            y++;
        }
        else if(movimento.equals("left")){
            y--;
        }
    }
    //condição pro fim do jogo
    public boolean comeufruta(int frutaX,int frutaY){
        if(x==frutaX && y==frutaY){
            return true;
        }
        //else
        return false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
