import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Exemplo0910 extends JFrame implements ItemListener
{
  float n1 = 0,result = 0;
  JLabel label1,label2;
  JTextField t1, t2;
  JPanel p1,p2; // declara dois paineis que compartilham as mesmas propriedades
  JRadioButton radio1,radio2,radio3;
  ButtonGroup radiogroup; // declaração do objeto radiogroup
  public static void main(String args[])
  {
    JFrame janela = new Exemplo0910();
    janela.setUndecorated(true);
    janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setVisible(true);
  }

  Exemplo0910()
  {
    setTitle("Uso de botoes de Radio ");
    setBounds(230,50,340,120);
    getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
    label1 = new JLabel("Digite um valor");
    label1.setForeground(Color.blue);
    label2 = new JLabel("% do Valor :");
    label2.setForeground(Color.blue);
    t1 = new JTextField(5);   t2 = new JTextField(5);
    p1 = new JPanel();        p2 = new JPanel();
    t2.setEditable(false);
    radio1 = new JRadioButton("10% do valor");
    radio2 = new JRadioButton("20% do valor");
    radio3 = new JRadioButton("30% do valor");
    // habilitar teclas de atalho
    radio1.setMnemonic(KeyEvent.VK_1);
    radio2.setMnemonic(KeyEvent.VK_2);
    radio3.setMnemonic(KeyEvent.VK_3);
    radiogroup = new ButtonGroup();
    // registra o evento dos botões de radio(opção)
    radiogroup.add(radio1); radio1.addItemListener(this);
    radiogroup.add(radio2); radio2.addItemListener(this);
    radiogroup.add(radio3); radio3.addItemListener(this);
    p1.setLayout(new FlowLayout(FlowLayout.CENTER));
    p1.setBackground(new Color(200,200,200));
    p2.setLayout(new GridLayout(2,3));
    p2.setBackground(new Color(200,200,200));
   //este painel(p1)agrupa a Jlabel1"digite um valor" e a JtextField1
    p1.add(label1);  p1.add(t1);
   // o painel(p2) agrupa o restante do layout
   p2.add(radio1);  p2.add(radio2);  p2.add(radio3);
   p2.add(label2);  p2.add(t2);
   // adicionar os paineis p1 e p2(agrupados anteriormente)
    add(p1); add(p2);
  }

  public void itemStateChanged(ItemEvent e)
  {
    if (t1.getText().length()==0)
		return;
      try
      {
        n1 = Float.parseFloat(t1.getText());

        if (e.getSource()==radio1)  result = (n1 * 10)/100;
        if (e.getSource()==radio2)  result = (n1 * 20)/100;
        if (e.getSource()==radio3)  result = (n1 * 30)/100;
      }
      catch(NumberFormatException erro)
      {
        t2.setText("erro");  return;
      }
      t2.setText("" + result);
  }
}