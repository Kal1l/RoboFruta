package game2;
import exception.MovimentoInvalidoException;
import java.util.Random;
public class Robo {
    protected int x=0;
    protected int y=0;
    protected String cor; 

    public Robo(String cor){
        x=0;
        y=0;
        this.cor=cor;
    }

    public void mover(String movimento) throws MovimentoInvalidoException {;
        if(movimento.equals("up")){
            if(x-1<0) throw new MovimentoInvalidoException();
            x--;
        }
        else if(movimento.equals("down")){
            if(x+1>4) throw new MovimentoInvalidoException();
            x++;
        }
        else if(movimento.equals("right")){
            if(y+1>4) throw new MovimentoInvalidoException();
            y++;
        }
        else if(movimento.equals("left")){
            if(y-1<0) throw new MovimentoInvalidoException();
            y--;
        }
        else{
            throw new MovimentoInvalidoException();
        }
    }

        public void mover(int movimento) throws MovimentoInvalidoException{
        if(movimento==1){
            if(x-1<0) throw new MovimentoInvalidoException();
            x--;
        }
        else if(movimento==2){
            if(x+1>4) throw new MovimentoInvalidoException();
            x++;
        }
        else if(movimento==3){
            if(y+1>4) throw new MovimentoInvalidoException();
            y++;
        }
        else if(movimento==4){
            if(y-1<0) throw new MovimentoInvalidoException();
            y--;
        }
        else{
            throw new MovimentoInvalidoException();
        }
    }
        //método de gera número aleatório
        public int aleatorio(){
            Random random=new Random();
            for(int i =0;i<=5;){
                return random.nextInt(0,5)
                +0;

            }
            return 0;
        }
    public boolean comeufruta(int frutaX,int frutaY){
        if(x==frutaX && y==frutaY){
            return true;
        }
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
    public String getCor(){
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
}