import java.util.Scanner;

public class Visitas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaLlegadaHoras;
        int horaLlegadaMinutos;
        int horaSalidaHoras;
        int horaSalidaMinutos;
        int edad;
        String nombre;

        int totalVisitas = 0;
        int tiempoTotal = 0;

        System.out.print("Nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Edad: ");
        edad = scanner.nextInt();

        for (int i = 1; i <= 7; i++) {
            System.out.println("Día " + i + ":");

            System.out.print("Hora de llegada - horas (en formato de 24 horas): ");
            horaLlegadaHoras = scanner.nextInt();
            System.out.print("Hora de llegada - minutos: ");
            horaLlegadaMinutos = scanner.nextInt();

            System.out.print("Hora de salida - horas (en formato de 24 horas): ");
            horaSalidaHoras = scanner.nextInt();
            System.out.print("Hora de salida - minutos: ");
            horaSalidaMinutos = scanner.nextInt();

            int tiempoEstadiaHoras = horaSalidaHoras - horaLlegadaHoras;
            int tiempoEstadiaMinutos = horaSalidaMinutos - horaLlegadaMinutos;
            if (tiempoEstadiaMinutos < 0) {
                tiempoEstadiaHoras--;
                tiempoEstadiaMinutos += 60;
            }

            totalVisitas++;
            tiempoTotal += tiempoEstadiaHoras;

            System.out.println("\nInformación de la visita:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad + " años");
            System.out.println("Hora de llegada: " + horaLlegadaHoras + ":" + horaLlegadaMinutos + " horas");
            System.out.println("Hora de salida: " + horaSalidaHoras + ":" + horaSalidaMinutos + " horas");
            System.out.println("Tiempo de estadía: " + tiempoEstadiaHoras + " horas y " + tiempoEstadiaMinutos + " minutos");
            System.out.println();
        }

        double tiempoPromedio = (double) tiempoTotal / totalVisitas;

        System.out.println("Resumen de las visitas:");
        System.out.println("Total de visitas: " + totalVisitas);
        System.out.println("Tiempo promedio de estadía: " + tiempoPromedio + " horas");

        if (edad >= 18) {
            System.out.println("El visitante es mayor de edad.");
        } else {
            System.out.println("El visitante es menor de edad.");
        }
    }
}


















