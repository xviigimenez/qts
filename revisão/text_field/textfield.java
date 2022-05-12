packae JTextField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class textfield extends JFrame implements ActionListener {
	JTextArea ta1, ta2;
	JTextField t1;
	JButton b1, b2;

}

public static void main(String args[]) {
	JFrame janela = new JTextField();
	janela.setUndecorated(true);
	janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setVisible(true);
}

JTextField() {
	setBounds(150,50,400,280);
	setTitle("Uso do JTextArea");
	getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
	t1 = new JTextField(40);
	t1.addActionListener(this);
	b1 = new JButton("Copia tudo");
	b1.addActionListener(this);
	b2 = new JButton("Copia seleção");
	b2.addActionListener(this);
	ta1 = new JTextArea
}