//package projeto.pkgtry;
import javax.swing.*;
import java.util.Scanner;//Interface gráfica

public class javatry {
    public static void main(String[] args){
        int n=0;
        try{
            n=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            if(n==0){
                System.out.println("O número é zero");
            }
            if(n>0){
                System.out.println("O número é positivo");
            }
            else{
                System.out.println("O número é negativo");
            }
            if(n%2 == 0){
                JOptionPane.showMessageDialog(null,"O número é par");
            }
            else{
                JOptionPane.showMessageDialog(null,"O número é ímpar");
            }
            
        }

        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Digite apenas números");
        }
    }
}
