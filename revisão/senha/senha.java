import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class senha extends JFrame implements ActionListener
{
  JLabel label_usuario,label_senha,label_validacao;
  JTextField text_usuario;
  JPasswordField password_senha;

  public static void main(String args[])
  {
    JFrame janela = new senha();
    janela.setUndecorated(true);
    janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setVisible(true);
   }

  senha()
  {
    setTitle("Login de usuário");
    setBounds(400,150,400,150);
    setBackground(new Color(150,150,150));
    setLayout(new GridLayout(2,1));
    label_usuario = new JLabel("Usuário:"); label_usuario.setForeground(Color.black); label_usuario.setFont(new Font("",Font.BOLD,14));
    label_senha = new JLabel("Senha:"); label_senha.setForeground(Color.black); label_senha.setFont(new Font("",Font.BOLD,14));
    label_validacao = new JLabel(""); label_validacao.setBackground(Color.white); label_validacao.setForeground(Color.black); label_validacao.setFont(new Font("",Font.BOLD,14));
    text_usuario = new JTextField(); text_usuario.addActionListener(this);
    password_senha = new JPasswordField(); password_senha.setEchoChar('*'); password_senha.addActionListener(this);
    add(label_usuario); add(text_usuario);
    add(label_validacao);
    add(label_senha); add(password_senha);
  }
  public void actionPerformed(ActionEvent e)
  {
    if (new String(text_usuario.getText()).equals("JAVA")) {
        if (new String(password_senha.getPassword()).equals("12345"))
            label_validacao.setText("Senha correta.");
        else
            label_validacao.setText("Senha incorreta.");
    }
    else
        label_validacao.setText("Login inválido.");
  }
}
