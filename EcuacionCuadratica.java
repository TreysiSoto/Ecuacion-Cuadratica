import java.util.Scanner;

public class EcuCuadratica 
{
    public static void main(String[] args) 
    {
            try (Scanner scanner = new Scanner(System.in))
             {
                System.out.println("Ingresar el valor de a: ");// función de salida
                double a = scanner.nextDouble();

                System.out.println("Ingresar el valor de b: ");
                double b = scanner.nextDouble();

                System.out.println("Ingresar el valor de c: ");
                double c = scanner.nextDouble();
                
                double discriminante = calcularDiscriminante(a, b, c);

                if (discriminante < 0){
                    System.out.println("Ecuaciones sin raíces reales");
                }
                   else {
                        calcularRaices(a, b, discriminante);
                    }
            }
        }
                private static double calcularDiscriminante(double a, double b, double c){
                return Math.pow(b,2) - 4 * a * c;
            }

            private static void calcularRaices(double a, double b, double discriminante)
            {
            double x1=(-b +Math.sqrt(discriminante))/(2 * a);
            double x2=(-b -Math.sqrt(discriminante))/(2 * a);

          if (x1==x2)
            {
                System.out.println("La ecuación tiene solo una raíz real, x1 y x2 ="+ x1);

            }
            else {
                 System.out.println("Hay dos números reales: x1 = " + x1 + " y  x2 = " + x2);
              }

      }
    
}
