import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre vendedor:");
        String nombreVendedor = scanner.nextLine();

        System.out.println("Cantidad de productos vendidos:");
        short cantidadProductos = scanner.nextShort();

        System.out.println("Ingrese valor producto 1:");
        float producto1 = scanner.nextFloat();

        System.out.println("Ingrese valor producto 2:");
        float producto2 = scanner.nextFloat();

        System.out.println("Ingrese valor producto 3:");
        float producto3 = scanner.nextFloat();

        System.out.println("Ingrese valor producto 4:");
        float producto4 = scanner.nextFloat();

        System.out.println("Ingrese valor producto 5:");
        float producto5 = scanner.nextFloat();

        System.out.println("Ingrese valor producto 6:");
        float producto6 = scanner.nextFloat();

        System.out.println("Ingrese valor producto 7:");
        float producto7 = scanner.nextFloat();

        double comisiones = 0;

        if (producto1 >= 100000) {
            comisiones = comisiones + (producto1 * 0.10);
        } else {
            comisiones = comisiones + (producto1 * 0.05);
        }

        if (producto2 >= 100000) {
            comisiones = comisiones + (producto2 * 0.10);
        } else {
            comisiones = comisiones + (producto2 * 0.05);
        }

        if (producto3 >= 100000) {
            comisiones = comisiones + (producto3 * 0.10);
        } else {
            comisiones = comisiones + (producto3 * 0.05);
        }

        if (producto4 >= 100000) {
            comisiones = comisiones + (producto4 * 0.10);
        } else {
            comisiones = comisiones + (producto4 * 0.05);
        }

        if (producto5 >= 100000) {
            comisiones = comisiones + (producto5 * 0.10);
        } else {
            comisiones = comisiones + (producto5 * 0.05);
        }

        if (producto6 >= 100000) {
            comisiones = comisiones + (producto6 * 0.10);
        } else {
            comisiones = comisiones + (producto6 * 0.05);
        }

        if (producto7 >= 100000) {
            comisiones = comisiones + (producto7 * 0.10);
        } else {
            comisiones = comisiones + (producto7 * 0.05);
        }

        double totalVentas = producto1 + producto2 + producto3 + producto4 + producto5 + producto6 + producto7;
        double salarioTotal = (double) (comisiones + 1000000);

        System.out.println("Vendedor: " + nombreVendedor);
        System.out.println("Total ventas: " + (int)totalVentas);
        System.out.println("Comisiones: " + (int)comisiones);
        System.out.println("Salario total: " + (int)salarioTotal);
    }
}
