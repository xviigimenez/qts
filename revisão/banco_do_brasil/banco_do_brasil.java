import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class senha extends JFrame implements ActionListener
 {
 	JLabel label1, label2, label3, label4 ;
 	JTextField t1;
 	JPasswordField p1;

  ImageIcon icone = new ImageIcon(");

    public static void main(String[] args) {
    	JFrame janela = new senha();
    	janela.setUndecorated (true);
    	janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    	janela.setDefaultCloseOperation (JFrame.HIDE_ON_CLOSE);
    	janela.setVisible(true);

    	}

	      senha()
    	{
    		setTitle("BANCO DO BRASIL");
    		setBounds(250, 100, 350, 250);
    		getContentPane().setBackground(new Color(245,237,80));
    		getContentPane().setLayout(new GridLayout(3,2));
    		label1 = new JLabel("Digite a senha");
    		label1.setForeground(Color.blue);
    		label2 = new JLabel("Validação");
    		label2.setForeground(Color.blue);
    		label1.setFont(new Font("", Font.BOLD,15));
            label2.setFont(new Font("", Font.BOLD,15));
            label3 = new JLabel(icone);
            label4 = new JLabel("Bem-Vindo !");
            label4.setForeground(Color.blue);
            label4.setFont(new Font("", Font.BOLD,15));
            p1 = new JPasswordField();
            p1.setFont(new Font("", Font.BOLD,20));
            p1.setEchoChar('*');
            p1.addActionListener(this);
            t1 = new JTextField();
            t1.setFont(new Font("", Font.BOLD,15));
            t1.setForeground(Color.black);
            t1.setEditable(false);
            getContentPane().add(label3);
            getContentPane().add(label4);
            getContentPane().add(label1);
            getContentPane().add(p1);
            getContentPane().add(label2);
            getContentPane().add(t1);

    	}
    	public void actionPerformed(ActionEvent e)
    	{
    		if (new String(p1.getPassword()).equals("12345"))
    		{
    			t1.setText("Senha válida");

    	JFrame janela = new agencia();
    	janela.setUndecorated (true);
    	janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    	janela.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    	janela.setVisible(true);
    	    }

            else
    	    t1.setText("Senha inválida");
       }
   }
   
   class agencia extends JFrame implements ActionListener
 {
 	JLabel label1, label2, label3, label4, label5 ;
 	JTextField t1, t2, t3;
 	JButton b1, b2;

 ImageIcon icone = new ImageIcon ("");

	      agencia()
    	{
    	setTitle("BANCO DO BRASIL");
    	setBounds(250, 50, 250, 400);
    	getContentPane().setBackground(new Color(245,237,80));
    	getContentPane().setLayout(new GridLayout(5,2));
        label1 = new JLabel (icone);
		label2 = new JLabel ("Bem-Vindo!");
		label2.setForeground(Color.blue);
		label2.setFont(new Font("",Font .BOLD, 15));
		label3 = new JLabel ("Banco");
		label3.setForeground(Color.blue);
		label3.setFont(new Font("",Font .BOLD, 15));
		label4 = new JLabel ("Agência");
		label4.setForeground(Color.blue);
		label4.setFont(new Font("",Font .BOLD, 15));
		label5 = new JLabel ("Conta");
		label5.setForeground(Color.blue);
		label5.setFont(new Font("",Font .BOLD, 15));
		t1 = new JTextField();
		t1.setFont(new Font("",Font .BOLD,20));				t2 = new JTextField();
		                                                    t2.setFont(new Font("",Font .BOLD,20));
	    t3 = new JTextField();
	    t3.setFont(new Font("",Font .BOLD,20));
		b1 = new JButton("OK");		b1.addActionListener(this);
		b2 = new JButton("Limpar");			b2.addActionListener(this);
		b1.setBackground(new Color (72,164,255));
		b1.setForeground(Color.white);
		b2.setBackground(new Color (72,164,255));
		b2.setForeground(Color.white);
		getContentPane().add(label1);			getContentPane().add(label2);
		getContentPane().add(label3);			getContentPane().add(t1);
		getContentPane().add(label4);			getContentPane().add(t2);
		getContentPane().add(label5);			getContentPane().add(t3);
		getContentPane().add(b1); 					getContentPane().add(b2);


    	}
    	public void actionPerformed(ActionEvent e)
    	{
		if (new String(t1.getText()).equals("033") && new String(t2.getText()).equals("109")
    			 && new String(t3.getText()).equals("22353") && (e.getSource()==b1) )
    		{

    	JFrame janela = new banco_do_brasil();
    	janela.setUndecorated (true);
    	janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    	janela.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    	janela.setVisible(true);

    	    }

    	    if (e.getSource()==b2)
    		{
               t1.setText("");     t2.setText("");    t3.setText("");
    		return;
            }
   }
 }


public class banco_do_brasil extends JFrame implements ActionListener{
	JLabel l1, l2, l3, l4, l5, l6;
	JButton b1, b2;
	JTextField t1, t2, t3, t4;
//	JPanel p1;

	ImageIcon icone = new ImageIcon ("C:/Users/Simone/Desktop/fatec_IPI_POO/exercícios_resolvidos_java6/banco.gif");

	banco_do_brasil () {
		setTitle("Banco do Brasil");
		setBounds(300, 150, 350, 400);
		getContentPane().setBackground(new Color(245,237,80));
		getContentPane().setLayout(new GridLayout(6,2));
		l1 = new JLabel ("Valor Deposito");
		l1.setForeground(Color.blue);
		l1.setFont(new Font("",Font .BOLD, 15));
		l2 = new JLabel ("Valor Saque");
		l2.setForeground(Color.blue);
		l2.setFont(new Font("",Font .BOLD, 15));
		l3 = new JLabel ("Valor Transferencia");
		l3.setForeground(Color.blue);
		l3.setFont(new Font("",Font .BOLD, 15));
		l5 = new JLabel (icone);
		l6 = new JLabel ("Seja Bem Vindo!");
		l6.setForeground(Color.blue);
		l6.setFont(new Font("",Font .BOLD, 15));
		t1 = new JTextField();
		t1.setFont(new Font("",Font .BOLD, 15));
		t2 = new JTextField();
		t2.setFont(new Font("",Font .BOLD, 15));
		t3 = new JTextField();
		t3.setFont(new Font("",Font .BOLD, 15));
		b1 = new JButton("Calcular");		b1.addActionListener(this);
		b2 = new JButton("Limpar");			b2.addActionListener(this);
		b1.setBackground(new Color (72,164,255));
		b1.setForeground(Color.white);
		b2.setBackground(new Color (72,164,255));
		b2.setForeground(Color.white);
		l4 = new JLabel ("Saldo Atual:");
		l4.setForeground(Color.blue);
		l4.setFont(new Font("",Font .BOLD, 15));
		t4 = new JTextField();				t4.setEditable(false);
		getContentPane().add(l5);           getContentPane().add(l6);
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
    		t1.setText("");     t2.setText("");    t3.setText(""); t4.setText(""); return;
    	}

    	if (e.getSource()==b1){

    		float n1=0,n2=0,n3=0, aux=0;


    	n1 = Float.parseFloat (t1.getText());
    	n2 = Float.parseFloat (t2.getText());
    	n3 = Float.parseFloat (t3.getText());




    	if (n3>=1000)
    	{
    		n3 = n3 - 16.8f;
    		aux = (n1-n2) - (n3);
    		t4.setText(""+aux);
    	}

    	else
    	{
    		n3 = n3 - 5.9f;
    		aux = (n1-n2) - (n3);
    		t4.setText(""+aux);
    	}


        }
    	}


}
