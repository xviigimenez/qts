import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

class cantina extends JFrame implements ActionListener
{
  JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17,label18;
  JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21;
  JButton button1,button2,button3;

  public static void main(String args[])
  {

    JFrame janela = new cantina();
    janela.setUndecorated(true);
    janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setVisible(true);
   }

  cantina()
  {
    setTitle("Cantina");
    setBounds(200,50,1000,800);
    setBackground(new Color(230,251,255));
    setLayout(new GridLayout(14,3));
    getContentPane().setBackground(Color.cyan);
    label1 = new JLabel("Produto:");
    label2 = new JLabel("Preço Un.");
    label3 = new JLabel("Quantidade:");
    label4 = new JLabel("Almoço");
    label5 = new JLabel("Suco de Fruta");
    label6 = new JLabel("Suco com Leite");
    label7 = new JLabel("Fogazza");
    label8 = new JLabel("4 Queijos");
    label9 = new JLabel("Esfiha");
    label10 = new JLabel("Pão de Queijo");
    label11 = new JLabel("Pizza Salgada ");
    label12 = new JLabel("Presunto e Queijo");
    label13 = new JLabel("Calabresa");
    label14 = new JLabel("TOTAL:");
    label15 = new JLabel("");
    label16 = new JLabel("");
    label17 = new JLabel("");
    label18 = new JLabel("");
    t1 = new JTextField("R$7,50");
    t1.setEditable(false);
    t2 = new JTextField("R$2,80");
    t2.setEditable(false);
    t3 = new JTextField("R$3,20");
    t3.setEditable(false);
    t4 = new JTextField("R$4,10");
    t4.setEditable(false);
    t5 = new JTextField("R$2,80");
    t5.setEditable(false);
    t6 = new JTextField("R$2,80");
    t6.setEditable(false);
    t7 = new JTextField("R$2,80");
    t7.setEditable(false);
    t8 = new JTextField("R$2,80");
    t8.setEditable(false);
    t9 = new JTextField("R$2,80");
    t9.setEditable(false);
    t10 = new JTextField("R$2,80");
    t10.setEditable(false);
    t11 = new JTextField();
    t12 = new JTextField();
    t13 = new JTextField();
    t14 = new JTextField();
    t15 = new JTextField();
    t16 = new JTextField();
    t17 = new JTextField();
    t18 = new JTextField();
    t19 = new JTextField();
    t20 = new JTextField();
    t21 = new JTextField();
    t21.setEditable(false);
    button1 = new JButton("Calcular");
    button1.addActionListener(this);
    button2 = new JButton("Limpar");
    button2.addActionListener(this);
    button3 = new JButton("Sair");
    button3.addActionListener(this);
    add(label1); add(label2); add(label3);
    add(label4); add(t1); add(t11);
    add(label5); add(t2); add(t12);
    add(label6); add(t3); add(t13);
    add(label7); add(t4); add(t14);
    add(label8); add(t5); add(t15);
    add(label9); add(t6); add(t16);
    add(label10); add(t7); add(t17);
    add(label11); add(t8); add(t18);
    add(label12); add(t9); add(t19);
    add(label13); add(t10); add(t20);
    add(label15);add(label14); add(t21);
    add(label16);add(label17); add(label18);
    add(button1); add(button2); add(button3);
  }

  private double parseDouble(String palavra){
    if(palavra.isEmpty()){
       return 0.00;
     }
    else{
        return Double.parseDouble(palavra);
    }
  }

  private void Clear(JTextField palavra){
    palavra.setText("");
  }

  public void actionPerformed(ActionEvent e)
  {

    if (e.getSource()==button1){
        try{
            double almoco,sucofruta, sucoleite, fogazza, queijos, esfiha, paodquejo, pizza, presequeijo, calabresa, total;
            DecimalFormat formato = new DecimalFormat("0.00");

            almoco = parseDouble(t11.getText())* 7.50d;
            sucofruta =  parseDouble(t12.getText()) * 2.80d;
            sucoleite =  parseDouble(t13.getText()) * 3.20d;
            fogazza =  parseDouble(t14.getText()) * 4.10d;
            queijos =  parseDouble(t15.getText()) * 2.80d;
            esfiha =  parseDouble(t16.getText()) * 2.80d;
            paodquejo =  parseDouble(t17.getText()) * 2.80d;
            pizza =  parseDouble(t18.getText()) * 2.80d;
            presequeijo =  parseDouble(t19.getText()) * 2.80d;
            calabresa =  parseDouble(t20.getText()) * 2.80d;

            total = almoco + sucofruta + sucoleite + fogazza + queijos + esfiha + paodquejo + pizza + presequeijo + calabresa;

            t21.setText("R$ "+ formato.format(total));
        }
        catch (NumberFormatException erro){
        t21.setText("Erro");
        }
    }

    if(e.getSource()==button2){
        Clear(t11);
        Clear(t12);
        Clear(t13);
        Clear(t14);
        Clear(t15);
        Clear(t16);
        Clear(t17);
        Clear(t18);
        Clear(t19);
        Clear(t20);
        Clear(t21);
    }

    if(e.getSource()==button3){
        System.exit(0);
    }
  }
}