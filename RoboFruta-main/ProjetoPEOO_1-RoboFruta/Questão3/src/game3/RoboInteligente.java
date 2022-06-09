package game3;
import exception.MovimentoInvalidoException;
public class RoboInteligente extends Robo{
    //encontrar alguma forma de randomizar o próximo movimento que o robo inteligente fizer
    private boolean erro1=false,erro2=false,erro3=false,erro4=false;
    public RoboInteligente(String cor) {
        super(cor);
    }

    public void mover(int movimento) throws MovimentoInvalidoException{
        if(movimento==1){
            if(x-1<0 && erro1==false){
                erro1=true;
                throw new MovimentoInvalidoException();
            }
            else if(x-1<0 && erro1==true){
                 x++;
            }
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
    }
}