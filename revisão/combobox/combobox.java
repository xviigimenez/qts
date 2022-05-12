import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class combobox extends JFrame implements ActionListener, ItemListener {
	JLabel label1;
	JTextField t1, t2, t3;
	JComboBox combo;
	JButton b1, b2, b3, b4, b5, b6;
	
	public static void main(String args[]) {
		JFrame janela = new combobox();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	combobox() {
		setTitle("Uso do JComboBox");
		setBounds(200,50,400,170);
		getContentPane().setBackground(new Color(190,190,190));
		label1 = new JLabel("Conteúdo");
		label1.setForeground(Color.blue);
		label1.setFont(new Font("Arial", Font.BOLD, 15));
		b1 = new JButton("Mostra texto");
		b1.addActionListener(this);
		b2 = new JButton("Mostra índice");
		b2.addActionListener(this);
		b3 = new JButton("Adiciona item");
		b3.addActionListener(this);
		b4 = new JButton("Remove item");
		b4.addActionListener(this);
		b5 = new JButton("Remove todos");
		b5.addActionListener(this);
		b6 = new JButton("Quantia de itens");
		b6.addActionListener(this);
		t1 = new JTextField();
		t2 = new JTextField();
		String[] cores = {"Branco", "Vermelho", "Azul", "Verde"};
		combo = new JComboBox(cores);
		combo.addItemListener(this);
		setLayout(new GridLayout(5,2));
		add(label1);
		add(combo);
		add(b1);
		add(b4);
		add(b2);
		add(b5);
		add(b3);
		add(t1);
		add(b6);
		add(t2);
		
	}
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==b1) {
				label1.setText("Texto: " + combo.getSelectedItem());
			}
			if (e.getSource()== b2)
				label1.setText("Indice: " + combo.getSelectedIndex());
			if (e.getSource()== b3 || t1.getText().length() != 0) 
			{
				combo.addItem(t1.getText());
				t1.setText("");
			}
			if (e.getSource() == b4)
				combo.removeItemAt(combo.getSelectedIndex());
			if (e.getSource() == b5)
				combo.removeAllItems();
			if (e.getSource() == b6)
				t2.setText("" + combo.getItemCount());
			}
			
			public void itemStateChanged(ItemEvent e)
			{
				t1.setText("" + combo.getSelectedItem());
			}
}