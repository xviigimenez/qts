import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class BancodoBrasil extends JFrame implements ActionListener{
	JLabel label1,label2;
	JPasswordField p1;
	JTextField t1;
    public static void main(String[] args) {
    JFrame janela = new BancodoBrasil();
    janela.setUndecorated(true);
    janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setVisible(true);
    }

BancodoBrasil(){

	setIconImage(Icone);
	setTitle("Banco do Brasil");
	setBounds (300, 50, 350, 90);
	getContentPane().setBackground(new Color (255,216,0));
	getContentPane().setLayout(new GridLayout(2,2));
	label1 = new JLabel ("login");
	label1.setForeground(new Color(0,19,127));;
	label1.setFont(new Font("Segoe UI",Font .BOLD, 20));
	label2 = new JLabel ("senha");
	label2.setForeground(new Color(0,19,127));
	label2.setFont(new Font("Segoe UI",Font .BOLD, 20));
	t1 = new JTextField();
	t1.setForeground(Color.black);
	p1 = new JPasswordField();
	p1.setEchoChar('*');
	p1.addActionListener(this);
	getContentPane().add(label1);
	getContentPane().add(t1);
	getContentPane().add(label2);
	getContentPane().add(p1);
}



public void actionPerformed(ActionEvent e){
	if (new String(t1.getText()).equals("sistema")){
	if (new String(p1.getPassword()).equals("12345")){
    		JFrame janela = new BancodoBrasil2();
    		janela.setUndecorated(true);
   			janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		janela.setVisible(true);
	}
	 else
		JOptionPane.showMessageDialog(null, "Senha ou login invalidos");
    }
	  else
		JOptionPane.showMessageDialog(null, "Senha ou login invalidos");
	}
}
class BancodoBrasil2 extends JFrame implements ActionListener{
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	JButton b1,b2;

BancodoBrasil2(){
	Image Icone = Toolkit.getDefaultToolkit().getImage("J://HD/trabalhos/2ºano/Técnico/Coisas usaveis/icones/1.jpg");
	setIconImage(Icone);
	setTitle("Banco do Brasil");
	setBounds (400, 400, 450, 210);
	getContentPane().setBackground(new Color (255,216,0));
	getContentPane().setLayout(new GridLayout(4,2));
	l1 = new JLabel ("Banco");
	l1.setForeground(new Color(0,19,127));
	l1.setFont(new Font("Segoe UI",Font .BOLD, 20));
	l2 = new JLabel ("Agência");
	l2.setForeground(new Color(0,19,127));
	l2.setFont(new Font("Segoe UI",Font .BOLD, 20));
	l3 = new JLabel ("Conta");
	l3.setForeground(new Color(0,19,127));
	l3.setFont(new Font("Segoe UI",Font .BOLD, 20));
	t1 = new JTextField();
	t1.setForeground(Color.black);
	t2 = new JTextField();
	t2.setForeground(Color.black);
	t3 = new JTextField();
	t3.setForeground(Color.black);
	b1 = new JButton ("OK");
	b2 = new JButton ("Limpar");
	b1.addActionListener(this);
	b2.addActionListener(this);

	getContentPane().add(l1);    	getContentPane().add(t1);
 	getContentPane().add(l2);    	getContentPane().add(t2);
 	getContentPane().add(l3);    	getContentPane().add(t3);
 	getContentPane().add(b1);    	getContentPane().add(b2);


}

public void actionPerformed(ActionEvent e){

if (e.getSource()==b2)
    	{
    		t1.setText("");
    		t2.setText("");
    		t3.setText("");
    		return;
    	}

if (e.getSource() == b1){
if (new String(t1.getText()).equals("033")){
	if (new String(t2.getText()).equals("109")){
	if (new String(t3.getText()).equals("22353")){
	JFrame janela = new BancodoBrasil3();
    		janela.setUndecorated(true);
   			janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		janela.setVisible(true);
	}
	 else
		JOptionPane.showMessageDialog(null, "Senha ou login invalidos");
    }
	  else
		JOptionPane.showMessageDialog(null, "Senha ou login invalidos");
	}
	  else
		JOptionPane.showMessageDialog(null, "Senha ou login invalidos");
}
}
}

class BancodoBrasil3 extends JFrame implements ActionListener {
	JLabel l1, l2, l3, l4, bb, vazio;
	JButton b1, b2;
	JTextField t1, t2, t3, t4;

BancodoBrasil3(){
	Image Icone = Toolkit.getDefaultToolkit().getImage("J://HD/trabalhos/2ºano/Técnico/Coisas usaveis/icones/1.jpg");
		setTitle("Banco do Brasil");
		setBounds(300, 150, 500, 500);
		getContentPane().setBackground(new Color(255,216,0));
		getContentPane().setLayout(new GridLayout(6,2));

		bb = new JLabel ("Banco do Brasil", JLabel.CENTER);
		bb.setForeground(new Color(0,19,127));
		bb.setFont(new Font("Estrangelo Edessa",Font .BOLD, 26));
		vazio = new JLabel (" ");
		l1 = new JLabel ("Valor Deposito");
		l1.setForeground(new Color(0,19,127));
		l1.setFont(new Font("Segoe UI",Font .BOLD, 20));
		l2 = new JLabel ("Valor Saque");
		l2.setForeground(new Color(0,19,127));
		l2.setFont(new Font("Segoe UI",Font .BOLD, 20));
		l3 = new JLabel ("Valor Transferencia");
		l3.setForeground(new Color(0,19,127));
		l3.setFont(new Font("Segoe UI",Font .BOLD, 20));
		t1 = new JTextField();				t2 = new JTextField();
		t3 = new JTextField();
		b1 = new JButton("Calcular");		b1.addActionListener(this);
		b2 = new JButton("Limpar");			b2.addActionListener(this);
		l4 = new JLabel ("Saldo Atual:");
		l4.setForeground(new Color(0,19,127));
		l4.setFont(new Font("Segoe UI",Font .BOLD, 20));
		t1.setFont(new Font("Segoe UI", Font .BOLD, 20));
		t1.setForeground(new Color(0,19,127));
		t1.setBackground(new Color(255,216,0));
		t1.setText("0");
		t2.setFont(new Font("Segoe UI", Font .BOLD, 20));
		t2.setForeground(new Color(0,19,127));
		t2.setBackground(new Color(255,216,0));
		t2.setText("0");
		t3.setFont(new Font("Segoe UI", Font .BOLD, 20));
		t3.setForeground(new Color(0,19,127));
		t3.setBackground(new Color(255,216,0));
		t3.setText("0");
		t4 = new JTextField();				t4.setEditable(false);
		t4.setFont(new Font("Segoe UI", Font .ITALIC, 20));
		t4.setForeground(new Color(0,19,127));
		t4.setBackground(new Color(255,216,0));
		b1.setFont(new Font("Segoe UI", Font .BOLD, 20));
		b1.setForeground(new Color(255,216,0));
		b1.setBackground(new Color(0,19,127));
		b2.setFont(new Font("Segoe UI", Font .BOLD, 20));
		b2.setForeground(new Color(255,216,0));
		b2.setBackground(new Color(0,19,127));
		getContentPane().add(bb);           getContentPane().add(vazio);
		getContentPane().add(l1);			getContentPane().add(t1);
		getContentPane().add(l2);			getContentPane().add(t2);
		getContentPane().add(l3);			getContentPane().add(t3);
		getContentPane().add(b1);			getContentPane().add(b2);
		getContentPane().add(l4); 			getContentPane().add(t4);
	}
	     public void actionPerformed (ActionEvent e)
    {
    	if (e.getSource()==b2)
    	{
    		t1.setText("0");     t2.setText("0");    t3.setText("0"); t4.setText("0"); return;
    	}

    	if (e.getSource()==b1){
    		float n1=0,n2=0,n3=0, aux=0;


    	n1 = Float.parseFloat (t1.getText());
    	n2 = Float.parseFloat (t2.getText());
    	n3 = Float.parseFloat (t3.getText());

        aux = n1-n2-n3;
	if (aux < 0)
		{
	JOptionPane.showMessageDialog(null, "impossivel realizar essa transferência.");
		}

		else
		{
    	t4.setText(""+aux);
    	JOptionPane.showMessageDialog(null, "transferência realizada.");
    	t1.setText("0");     t2.setText("0");    t3.setText("0"); t4.setText("0"); return;
        }
    	}
        }


}























