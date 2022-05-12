import javax.swing.*;

class excecao_try_catch
{
    public static void main(String args[]) {
        try {
            int numero1,numero2,total;
            numero1=Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro número?"));
            numero2=Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo número?"));
            total=numero1/numero2;
            JOptionPane.showMessageDialog(null,"O resultado é = " +total);
        } catch (ArithmeticException erro) {
            JOptionPane.showMessageDialog(null,"Erro na divisão por zero","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
}