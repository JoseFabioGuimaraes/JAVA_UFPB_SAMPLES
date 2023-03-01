public class Aula02 {
    public static void main(String [] args){

        //  CADASTRO DO PACIENTE
        String nome = "Teste";
        int idade = 20;
        double altura = 1.77;
        double peso = 99.7;
        boolean fumante = false;

        //respostas
        boolean PraticaAtividade = true;
        int AtividadeSemana = 4;
        boolean DorSentida = true;
        int IntensidadeDor = 6;

        if(PraticaAtividade == true){
            System.out.println("O paciente pratica atividade física!");
            if (AtividadeSemana > 3){
                System.out.println("Boa quantidade de endorfina");
            }else{
                System.out.println("Precisa melhorar");
            }
        }else{
            System.out.println("O paciente não pratica");
        }
        if(DorSentida == true){
            System.out.println("O paciente sente dor!");
            if(IntensidadeDor >5){
                System.out.println("o paciente sente dor");
            }
        }else{
            System.out.println("o Paciente não tem dor");
        }
    }

}
//switchcase