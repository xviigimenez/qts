import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class cadastro extends JFrame implements ItemListener {
	JLabel label_titulo, label_nome, label_endereco, label_telefone, label_sexo, label_estado_civil, label_grau_de_ensino;
	JTextField texto_nome, texto_endereco, texto_telefone;
	JRadioButton radio_masculino, radio_feminino, radio_casado, radio_solteiro, radio_divorciado, radio_viuvo;
	JCheckBox check_fundamental_1, check_fundamental_2, check_medio, check_tecnico, check_superior;
	JPanel painel_1, painel_2, painel_3;
	ButtonGroup grupo_1, grupo_2;
	string nome, endereco, telefone;
	public static void main(String args[]) {
		JFrame janela = new cadastro();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

	cadastro() {
		getContentPane().setBackground(new Color(180,180,180));
		setTitle("Cadastro de usuário");
		setBounds(250,50,250,70);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		label_titulo = new JLabel("Cadastro de usuário");
		label_nome = new JLabel("Nome: ");
		label_nome.setFont(new Font("Comic sans",Font.PLAIN,2));
		label_nome.setForeground(Color.yellow);
		label_endereco = new JLabel("Endereço: ");
		label_endereco.setFont(new Font("Comic sans",Font.PLAIN,2));
		label_endereco.setForeground(Color.green);
		label_telefone = new JLabel("Nome: ");
		label_telefone.setFont(new Font("Comic sans",Font.PLAIN,2));
		label_telefone.setForeground(Color.yellow);
		label_sexo = new JLabel1("Sexo");
		label_sexo.setFont(new Font("Comic sans",Font.PLAIN,2));
		label_sexo.setForeground(Color.green);
		label_estado_civil = new JLabel("Estado civil");
		label_estado_civil.setFont(new Font("Comic sans", Font.PLAIN,2));
		label_estado_civil.setForeground(new Font("Comic sans",
		label_grau_de_ensino = new JLabel("Grau de ensino");
		texto_nome = new JTextField(16);
		texto_endereco = new JTextField(16);
		texto_telefone = new JTextField(12);
		radio_masculino = new JRadioButton("Masculino");
		radio_feminino = new JRadioButton("Feminino");
		radio_casado = new JRadioButton("Casado");
		radio_solteiro = new JRadioButton("Solteiro");
		radio_divorciado = new JRadioButton("Divorciado");
		radio_viuvo = new JRadioButton("Viúvo");
		check_fundamental_1 = new JCheckBox("Ensino Fundamental I");
		check_fundamental_2 = new JCheckBox("Ensino Fundamental II");
		check_medio = new JCheckBox("Ensino Médio");
		check_tecnico = new JCheckBox("Ensino Técnico");
		check_superior = new JCheckBox("Ensino Superior");
		grupo_1 = new ButtonGroup();
		grupo_2 = new ButtonGroup();
		painel_1.setLayout(new FlowLayout(FlowLayout.CENTER));
		painel_1.setBackground(new Color(200,200,200));
		painel_2.setLayout(new FlowLayout(FlowLayout.CENTER));
		painel_2.setBackground(new Color(180,180,180));
		painel_3.setLayout(new FlowLayout(FlowLayout.CENTER));
		painel_3.setBackground(new Color(200,200,200));
		add(label_titulo);
		painel_1.add(label_nome);
		painel_1.add(texto_nome);
		painel_1.add(label_endereco);
		painel_1.add(texto_endereco);
		painel_1.add(label_telefone);
		painel_1.add(texto_telefone);
		painel_2.add(radio_masculino);
		painel_2.add(radio_feminino);
		painel_2.add(radio_casado);
		painel_2.add(radio_solteiro);
		painel_2.add(radio_divorciado);
		painel_2.add(radio_viuvo);
		painel_3.add(check_fundamental_1);
		painel_3.add(check_fundamental_2);
		painel_3.add(check_medio);
		painel_3.add(check_tecnico);
		painel_3.add(check_superior);
		add(painel_1);
		add(painel_2);
		add(painel_3);
	}
	public void itemStateChanged(ItemEvent e) {
		if (texto_
	}
}
