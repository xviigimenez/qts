import javax.swing.*;
class excecao_try_catch2 {

    
    public static void main(String[] args) {
       
    String aux= JOptionPane.showInputDialog("Digite um número de 0 a 9");
    if(aux!=null){
            try{
                int x=Integer.parseInt(aux);
                String extenso="";
                switch(x){
                    case 0 : extenso="zero";break;
                    case 1 : extenso="um";break;
                    case 2 : extenso="dois";break;
                    case 3 : extenso="tres";break;
                    case 4 : extenso="quatro";break;
                    case 5 : extenso="cinco";break;
                    case 6 : extenso="seis";break;
                    case 7 : extenso="sete";break;
                    case 8 : extenso="oito";break;
                    case 9 : extenso="nove";break;
                    default : extenso="número desconhecido";

                }
                JOptionPane.showMessageDialog(null,"Número fornecido: "+ extenso);
            }
            catch(NumberFormatException erro){
                JOptionPane.showMessageDialog(null,"Digite números!!!","Erro",JOptionPane.ERROR_MESSAGE);
            }
    }
    
    }
}
