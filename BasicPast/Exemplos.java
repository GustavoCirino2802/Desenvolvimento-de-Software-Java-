

/************************************************************************************
 * AULA: ProgramaÃ§Ã£o BÃ¡sica Java
 * 
 * 1. Tipos de variÃ¡veis var, int, short, long, float, double, bool e String;
 * 2. Operadores de atribuiÃ§Ã£o, aritmÃ©ticos, relacionais, lÃ³gicos e unÃ¡rios;
 * 3. Estruturas de decisÃ£o if/else, ternÃ¡rias e switch;
 * 4. Estruturas de repetiÃ§Ã£o while, do/while, for, for avanÃ§ado;
 * 5. Arrays.
 * 
 ***********************************************************************************/

public class Exemplos {

    public static void imprimir(String str){
        System.out.println(str);
    }



    public static void main(String[] args) {
  
      // 1. Tipos de variÃ¡veis var, int, short, long, float, double, bool e string;
      // 2. Operadores de atribuiÃ§Ã£o, aritmÃ©ticos, relacionais, lÃ³gicos e unÃ¡rios;
  
      int a = 15;
      var b = 10; // inferÃªncia de tipo dinÃ¢mico (fracamente tipado)
      short c = 5;
      var d = 10;
      float e = 10.5f;
      double f = 10.5;
      boolean g = true;
      String h = "OlÃ¡, mundo!";
  
      // System.out.println("O valor da variÃ¡vel a Ã©: " + a);
      System.out.printf("O valor da variÃ¡vel a Ã©: %d%n", a);
  
      System.out.printf("O valor da variÃ¡vel b Ã©: %d%n", b);
  
      System.out.printf("O valor mÃ­nimo de int Ã© %d e o valor mÃ¡ximo Ã© %d %n", Integer.MIN_VALUE, Integer.MAX_VALUE);
      System.out.printf("O valor mÃ­nimo de short Ã© %d e o valor mÃ¡ximo Ã© %d%n", Short.MIN_VALUE, Short.MAX_VALUE);
      System.out.printf("O valor mÃ­nimo de long Ã© %d e o valor mÃ¡ximo Ã© %d%n", Long.MIN_VALUE, Long.MAX_VALUE);
      System.out.printf("O valor mÃ­nimo de float Ã© %f e o valor mÃ¡ximo Ã© %f%n", Float.MIN_VALUE, Float.MAX_VALUE);
      System.out.printf("O valor mÃ­nimo de double Ã© %f e o valor mÃ¡ximo Ã© %f%n", Double.MIN_VALUE, Double.MAX_VALUE);
  
      //imprimir("--------->>>A + B: " + (a + b));
      //imprimir("--------->>>A + B: " + somar(a + b));

      int retornoSoma = Calculadora.somar(a, b);
      imprimir("A + B: " + retornoSoma);

      int retornoSub = Calculadora.subtrair(a, b);
      imprimir("A - B: " + retornoSub );

      int retornoMulti = Calculadora.multiplicar(a, b);
      imprimir("A * B: " + retornoMulti);

      int retornoDiv = Calculadora.dividir(a, b);
      imprimir("A / B: " + retornoDiv);

      imprimir("A % B: " + (a % b));
      imprimir("A + B x C: " + (a + b * c));
      imprimir("(A + B) x C: " + ((a + b) * c));
  
      // Operadores aritmÃ©ticos de atribuiÃ§Ã£o (=, *=, /=, +=, -=)
      System.out.println("d += a: " + (d += a));
      System.out.println("d -= a: " + (d -= a));
      System.out.println("d *= a: " + (d *= a));
      System.out.println("d /= a: " + (d /= a));
  
      // Operadores relacionais (==, !=, <, >, <=, >=) e lÃ³gicos (!, &&, ||) e unÃ¡rios
      // (++, --):
      System.out.println("A == B: " + (a == b));
      System.out.println("A != B: " + (a != b));
      System.out.println("A < B: " + (a < b));
      System.out.println("A > B: " + (a > b));
      System.out.println("A <= B: " + (a <= b));
      System.out.println("A >= B: " + (a >= b));
  
      System.out.println("A Ã© igual a B e C Ã© maior do A: " + (a == b && c > a));
      // b = 15;
      // c = 25;
      System.out.println("A Ã© igual a B ou A Ã© maior do C: " + (a == b || c > a));
  
      // 3. Estruturas de decisÃ£o if/else, ternÃ¡rias e switch/array;
      System.out.printf("Valores A = %d, B = %d, C = %d %n", a, b, c);
  
      if (a == b) {
        System.out.println("A == B");
      } else {
        System.out.println("A != B");
      }
  
      var msg = a == b ? "A == B" : "A != B";
      System.out.println(msg);
  
      int[] dias = new int[] { 2, 3, 4, 5, 6 };
      try {
        switch (dias[6]) {
          case 2:
            System.out.println("Segunda-feira");
            break;
          case 3:
            System.out.println("TerÃ§a-feira");
            break;
          case 4:
            System.out.println("Quarta-feira");
            break;
          case 5:
            System.out.println("Quinta-feira");
            break;
          case 6:
            System.out.println("Sexta-feira");
            break;
          default:
            System.out.println("Ã‰ final de semana!");
            break;
        }
      } catch (Exception ex) {
        System.out.println("Deu algum erro...");
      }
  
      // 4. Estruturas de repetiÃ§Ã£o while, do/while, for, for avanÃ§ado;
      // 5. Arrays.
  
      boolean executar = true;
      int contador = 0;
      String[] nomes = new String[] { "JoÃ£o", "Pedro", "Paulo", "Tiago", "Ana", "Maria" };
  
      System.out.println("------while--------");
      while (executar && contador < nomes.length) {
        var nome = nomes[contador];
        System.out.println(nome);
        contador++;
      }
  
      contador = 0;
      System.out.println("-----do/while--------");
      do {
        var nome = nomes[contador];
        System.out.println(nome);
        contador++;
      } while (executar && contador < nomes.length);
  
      System.out.println("-------for--------");
      for (int i = 0; i < nomes.length; i++) {
        var nome = nomes[i];
        System.out.println(nome);
      }
  
      System.out.println("-------for avanÃ§ado--------");
      for (var nome : nomes) {
        System.out.println(nome);
      }
  
    }
  
  }