import java.util.Scanner;

public class notasprincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int promedio;
        int matematica;
        int fisica;
        int quimica;
        int biologia;
        int informatica;
        int primerresultado;


        System.out.println("Digite la nota de fisica: ");
        fisica = sc.nextInt();
        System.out.println("Digite la nota de matematica: ");
        matematica = sc.nextInt();
        System.out.println("Digite la nota de quimica: ");
        quimica = sc.nextInt();
        System.out.println("Digite la nota de biologia: ");
        biologia = sc.nextInt();
        System.out.println("Digite la nota de informatica: ");
        informatica = sc.nextInt();
        sc.close();

      primerresultado = fisica+matematica+quimica+biologia+informatica;
      promedio = primerresultado / 5;

      if(promedio <= 5.99 ){
          System.out.println("Tu calificacion es mala");

      }else if(promedio >= 6 && promedio <= 8){
          System.out.println("Tu calificacion es buena");
      }else if(promedio > 8 ){
          System.out.println("Tu calificacion es muy buena");
      }






    }
}
