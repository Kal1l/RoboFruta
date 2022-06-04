import java.util.Scanner;
import java.util.ArrayList;
public class Robo2 {
    protected int x;
    protected int y;
    protected String cor;


    public Robo2(int x,int y,String cor){
        this.x=x;
        this.y=y;
        this.cor=cor;
    }
    
    public int mover(){
        Ambiente2 ambiente =new Ambiente2(4,4);
        Scanner input=new Scanner(System.in);
        int movimento=input.nextInt();
        if(movimento=="up"){
            
        };
        else if(movimento=="down"){

        }
        else if(movimento=="right"){

        }
        else if(movimento=="left"){

        }
        input.close();
    }
}
