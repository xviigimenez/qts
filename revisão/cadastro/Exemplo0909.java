import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo0909 extends JFrame implements ItemListener
{
  JLabel label1;
  JCheckBox c1,c2;
  int negrito = 0,italico = 0;
  public static void main(String args[])
  {
    JFrame janela = new Exemplo0909();
    janela.setUndecorated(true);
    janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setVisible(true);
  }

  Exemplo0909()
  {
    getContentPane().setBackground(new Color(180,180,180));
    setTitle("Uso do JCheckBox");
    setBounds(250,50,250,70);
    getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
    label1 = new JLabel("Java");
    label1.setFont(new Font("Arial",Font.PLAIN,20));
    label1.setForeground(Color.black);
    c1 = new JCheckBox("Negrito");
    c1.setBackground(new Color(180,180,180));
    c1.addItemListener(this);
    c2 = new JCheckBox("Italico");
    c2.setBackground(new Color(180,180,180));
    c2.addItemListener(this);
    getContentPane().add(label1);
    getContentPane().add(c1);
    getContentPane().add(c2);
  }

  public void itemStateChanged(ItemEvent e)// define a mudança(objeto) de acordo com o item selecionado
  {
    if(e.getSource()==c1)
    {
      if(e.getStateChange()==ItemEvent.SELECTED)
        negrito = Font.BOLD;
      else
        negrito = Font.PLAIN;
    }
    if(e.getSource()==c2)
    {
      if(e.getStateChange()==ItemEvent.SELECTED)
        italico = Font.ITALIC;
      else
        italico = Font.PLAIN;
    }
    label1.setFont(new Font("Arial",negrito+italico,20));

  }
}