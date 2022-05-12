import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// imc = peso/altura²
// abaixo de 18.5 - abaixo do peso
// entre 18.6 e 24.9 - peso ideal
// entre 25.0 e 29.9 - levemente acima do peso
// entre 30.0 e 34.9 - obesidade grau I
// entre 35.0 e 39.9 - obesidade grau II (severa)
// acima de 40.0 - obesidade grau III (mórbida)
class imc extends JFrame implements ActionListener {
    JLabel label_peso, label_altura, label_imc;
    JTextField text_peso, text_altura, text_imc;
    JButton botao_calcular, botao_limpar;

    public static void main(String args[]) {
        JFrame janela=new imc();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    imc() {
        setTitle("Índice de massa corporal");
        setBounds(400,100,400,100);
        getContentPane().setBackground(new Color(150,150,150));
        getContentPane().setLayout(new GridLayout(2,0));
        label_peso = new JLabel("Peso"); label_peso.setForeground(Color.black); label_peso.setFont(new Font("",Font.BOLD,14));
        label_altura = new JLabel("Altura"); label_altura.setForeground(Color.black); label_altura.setFont(new Font("",Font.BOLD,14));
        label_imc = new JLabel("IMC"); label_imc.setForeground(Color.black); label_imc.setFont(new Font("",Font.BOLD,14));
        botao_calcular = new JButton ("Calcular"); botao_calcular.addActionListener(this); botao_calcular.setForeground(Color.black); botao_calcular.setBackground(Color.white);
        botao_limpar = new JButton ("Limpar"); botao_limpar.addActionListener(this); botao_limpar.setForeground(Color.black); botao_limpar.setBackground(Color.white);
        text_peso = new JTextField();
        text_altura = new JTextField();
        text_imc = new JTextField();
        add(label_peso); add(text_peso);
        add(label_altura); add(text_altura);
        add(label_imc); add(text_imc);
        add(botao_calcular); add(botao_limpar);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==botao_limpar) {
            text_peso.setText("");
            text_altura.setText("");
            text_imc.setText("");
            return;
        }
        float peso=0, altura=0, imc=0;
        try {
            peso = Float.parseFloat(text_peso.getText());
            altura = Float.parseFloat(text_altura.getText());
        }
        catch (NumberFormatException Erro) {
            text_imc.setText("Erro");
            return;
        }
        if (e.getSource()==botao_calcular) {
            imc=peso/(altura*altura);
            text_imc.setText(""+imc);
        }
    }
}
