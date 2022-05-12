import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class bandeiras extends JFrame implements ActionListener {
	JLabel label1, label2, label3, label4, label5;
	JButton b1, b2, b3, b4, b5;
	ImageIcon br = new ImageIcon ("imagens/br.png");
	ImageIcon jp = new ImageIcon ("imagens/jp.png");
	ImageIcon ch = new ImageIcon ("imagens/ch.jpg");
	ImageIcon ag = new ImageIcon ("imagens/ag.jpg");
	ImageIcon eu = new ImageIcon ("imagens/eu.png");
	public static void main(String[] args) {
		JFrame janela = new bandeiras();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	bandeiras() {
		setBounds(300,50,600,650);
		getContentPane().setBackground(new Color(150,150,150));
        getContentPane().setLayout(new GridLayout(5,2));
		b1 = new JButton("Brasil");	b1.addActionListener(this);
		b2 = new JButton("Japao"); b2.addActionListener(this);
		b3 = new JButton("China"); b3.addActionListener(this);
		b4 = new JButton("Argentina"); b4.addActionListener(this);
		b5 = new JButton("Estados Unidos"); b5.addActionListener(this);
		label1 = new JLabel(br); label1.setVisible(false);
		label2 = new JLabel(jp); label2.setVisible(false);
		label3 = new JLabel(ch); label3.setVisible(false);
		label4 = new JLabel(ag); label4.setVisible(false);
		label5 = new JLabel(eu); label5.setVisible(false);
		add(b1); add(label1);
		add(b2); add(label2);
		add(b3); add(label3);
		add(b4); add(label4);
		add(b5); add(label5);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b1) {
			label1.setVisible(true);
		}
		if (e.getSource()==b2) {
			label2.setVisible(true);
		}
		if (e.getSource()==b3) {
			label3.setVisible(true);
		}
		if (e.getSource()==b4) {
			label4.setVisible(true);
		}
		if (e.getSource()==b5) {
			label5.setVisible(true);
		}
	}
}
