package game3;
import exception.MovimentoInvalidoException;
public class RoboInteligente extends Robo{
    private boolean erro1=false,erro2=false,erro3=false,erro4=false;//verificadores de erro

    public RoboInteligente(String cor) {
        //herda construtor da classe robô
        super(cor);
    }
    public void mover(int movimento) throws MovimentoInvalidoException{
        if(movimento==1){
            //no primeiro erro verificador passa a se verdadeiro
            if(x-1<0 && erro1==false){
                erro1=true;
                throw new MovimentoInvalidoException();
            }
            //dessa forma quando ocorrer o erro denovo, o próximo movimento do robô se torna válido
            else if(x-1<0 && erro1==true){
                 x++;
            }
            //e caso não ocorra o erro ele se move normalmente
            x--;
        }
        else if(movimento==2){
            if(x+1>4 && erro2==false){
                erro2=true;
                throw new MovimentoInvalidoException();
            }
            else if(x+1>4 && erro1==true){
                 x--;
            }
            x++;
        }
        else if(movimento==3){
            if(y+1>4 && erro3==false){
                erro2=true;
                throw new MovimentoInvalidoException();
            }
            else if(y+1>4 && erro3==true){
                 y--;
            }
            y++;
        }
        else if(movimento==4){
            if(y-1<0 && erro4==false){
                erro2=true;
                throw new MovimentoInvalidoException();
            }
            else if(y-1<0 && erro4==true){
                 y++;
            }
            y--;
        }
        else{
            throw new MovimentoInvalidoException();
        }
    }
}