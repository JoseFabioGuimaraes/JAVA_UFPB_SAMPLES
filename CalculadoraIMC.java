///IMC CALCULADORA
import javax.swing.JOptionPane;
public class helloWorld {

    public static void main(String [] args){
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        //int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")); isso vai ser usado no futuro.
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua Altura"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Peso"));
        double CalculoIMC = peso/(altura*altura);
        JOptionPane.showMessageDialog( null , nome +String.format(" Seu imc é: %.1f",CalculoIMC));

        if (CalculoIMC <18.00){
            JOptionPane.showMessageDialog(null,"Você está abaixo do peso ideal");
        } else if(CalculoIMC >= 18 && CalculoIMC <=24.9){
            JOptionPane.showMessageDialog(null,"Você está no peso ideal");
        } else{
            JOptionPane.showMessageDialog(null,"Você está acima do peso");
        }
    }
}
