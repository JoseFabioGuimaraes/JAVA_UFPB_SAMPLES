import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {
        int idade;
        //instaciando um objeto do tipo Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt(); //inteiro
        String nome = sc.next();
        System.out.println("Seu nome é: "+nome+" e sua idade é:"+idade);


    }
}
