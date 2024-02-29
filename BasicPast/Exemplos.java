public class Exemplos {

    public static void main(String[] args){

        //Tipos primitivos

        int a = 10;
        float b = 10.5f;
        double c = 10.5;
        boolean e = true;

        double x = a;
        int y = (int) c; //casting
        float z = b;

        //Estrutura de controle 
        if(a > 10){
            System.out.println("Faço alguma coisa...");
        }
        else if (b < 50){
            System.out.println("Faço outra coisa...");
        }
        else{
            System.out.println("Faz ainda outra coisa...");
        }

        //Repetidores
        for(int i = 0; i < 100; i++){
            System.out.println("Valor: " + i);
        }

        boolean executar = true;
        int contador = 0;
        String[] letras = new String[]{"A", "B", "C"};

        while (executar && contador < letras.length){
            String letra = letras[contador];
            System.out.println("Letra: " + letra);
            contador++;
        }
    }


}
