import java.util.Scanner;
import exception.*;
import game1.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        Ambiente ambiente=new Ambiente();
        System.out.println("Insira a cor do robo(■)");
        String cor=input.next();
        Robo robo=new Robo(cor);
        //coordenadas das fruta geradas no próprio main
        int frutaX, frutaY;
        System.out.println("Insira a posição da fruta(posições 0-4)");
        frutaX=input.nextInt();
        frutaY=input.nextInt();
        //verificador do loop
        boolean verificador = true;
        //loop para posições inválidas no eixo para a posição da fruta
        while(verificador){
            if(frutaX >= 5 || frutaY >= 5 || frutaX < 0 || frutaY < 0){
                System.out.println("Posição invalida, insira novamente(posições 0-4): ");
                frutaX = input.nextInt();
                frutaY = input.nextInt();
            } else{
                verificador = !verificador;
            }
        }
        //Matriz inicial do programa
        ambiente.matriz(frutaX,frutaY,0,0);
        ambiente.mostrarMatriz();
        String movimento;
        int roboX;int roboY;
        //loop do jogo
        do{
           movimento=input.next();
            try {
                robo.mover(movimento);
            } catch (MovimentoInvalidoException e) {
                //excessão pra caso ocorra um movimento invalido
                System.out.println(e);
            }
            //coordenadas do robô são puxadas da classe robô
            roboX=robo.getX();
            roboY=robo.getY();
            //matriz ambiente
            ambiente.matriz(frutaX,frutaY,roboX,roboY);
            ambiente.mostrarMatriz();
        }while(robo.comeufruta(frutaX,frutaY)==false);//condição para o fim do jogo: persongaem alcançar as coordenadas da fruta no eixo
        System.out.println("Você ganhou!");
        input.close();
    }
}
