import java.util.Scanner;

public class LibroCalificaciones {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int estudiantes = lector.nextInt();
        while (estudiantes<=0) {
            System.out.println("la cantidad de estudiantes no puede ser cero ni negativo, intentelo nuevamente");
             System.out.print("Ingrese la cantidad de estudiantes: ");
             estudiantes = lector.nextInt();
        }
        int[] notas = new int[estudiantes];
        for (int e = 0; e < estudiantes; e++) {
            System.out.print("Ingrese la nota del estudiante (de 0 a 100)" + (e+1) + ": ");
            notas[e] = lector.nextInt();
        }
        int[] Conteocategorias = new int[5];
        for (int nota : notas) {
            if (nota >= 0 && nota <= 59) {
                Conteocategorias[0]++;
            } else if (nota >= 60 && nota <= 69) {
                Conteocategorias[1]++;
            } else if (nota >= 70 && nota <= 79) {
                Conteocategorias[2]++;
            } else if (nota >= 80 && nota <= 89) {
                Conteocategorias[3]++;
            } else if (nota >= 90 && nota <= 100) {
               Conteocategorias[4]++;
            }
        }
        String[] categorias = {"Reprobado", "Regular", "Bueno", "Muy bueno", "Excelente"};

        for (int e = 0; e < 5; e++) {
            System.out.print(categorias[e] + " (" + Conteocategorias[e] + ") : ");
            for (int i = 0; i < Conteocategorias[e]; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Total de estudiantes en el grupo: " + estudiantes);
        lector.close();

    }
}
