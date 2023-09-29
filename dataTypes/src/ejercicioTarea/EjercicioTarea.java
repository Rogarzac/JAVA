package ejercicioTarea;

public class EjercicioTarea {
    public static void main(String[] args) {
        int precioIphone = 20000; // Precio de un iPhone 15
        int cantidadIphones = 3; // Cantidad de iPhones a comprar
        int totalSinDescuento = precioIphone * cantidadIphones; // Costo total sin descuento
        double precioDescuento = totalSinDescuento; // Inicializar precioDescuento

        // Verificar si el total supera los 25 mil pesos para aplicar el descuento
        if (totalSinDescuento > 25000) {
            double descuento = totalSinDescuento * 0.10; // 10% de descuento
            precioDescuento = totalSinDescuento - descuento; // Aplicar el descuento
        }

        // Costo total con el descuento aplicado
        System.out.println("Costo total sin descuento: $" + totalSinDescuento);
        System.out.println("Costo total con descuento: $" + precioDescuento);

        // Calcular el pago mensual si eligen la opción de 12 meses sin intereses
        int mesesSinIntereses = 12;
        double costoMensual = precioDescuento / mesesSinIntereses;
        System.out.println("Pago mensual (12 meses sin intereses): $" + costoMensual);
    }
}
