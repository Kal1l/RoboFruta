import java.util.Scanner;
public class Robo2 {
    //posições do robô no eixo
    protected int x;
    protected int y;
    protected String cor;// ainda tem que descobrir como mudar a cor do caractére(nem sei se é só na interface ou se da pra fazer no temrinal)
    Ambiente2 ambiente =new Ambiente2(4);
    protected char[][]matriz=ambiente.getMatriz();//matriz que puxa a matriz do ambiente
    Scanner input=new Scanner(System.in);

    public Robo2(int x,int y,String cor){//construtor do objeto robô
        this.x=x;
        this.y=y;
        this.cor=cor;
    }

    public int mover(){
        ambiente.matriz(x,y);//aqui pode ser só um getMatriz(?)
        String movimento=input.next();
        //fazer o movimento propriamente dito,talvez usar o setMatriz(?)
        if(movimento=="up"){     
        }
        else if(movimento=="down"){
        }
        else if(movimento=="right"){
        }
        else if(movimento=="left"){
        }
        input.reset();
        input.close();
    }
    //fazer um contador para acabar o jogo, fazer um loopíng pra movimenta enquanto estiver nesse loop(fazer com boolean(?))
}
