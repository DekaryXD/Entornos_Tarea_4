package ed.tarea04;

/**
 * @author Marcos Yus Torio
 * @version 11.21
 */

public class ControladorCuentaBancaria {

    public static void main(String[] args) {

        // crea
        CuentaBancaria miCuenta = new CuentaBancaria("Jorge Izquierdo", "00491500051234567892");

        operacionesCuenta(miCuenta, "ingresar", 1000);

        System.out.println(miCuenta.toString());
    }

    /**
     * Segun lo introducido en los parametros realizara las siguientes acciones
     * @param miCuenta El objeto con el que se realizara las operaciones
     * @param operacion El tipo de operacion que se ha de realizar ya sea ingresar o retirar
     * @param cantidad El monto total a ingresar o retirar
     */
    private static void operacionesCuenta(CuentaBancaria miCuenta, String operacion, float cantidad) {
        if (operacion.equals("ingresar")) {
            try {
                miCuenta.ingresar(cantidad);
            } catch (Exception e) {
                System.err.print(e.getMessage());
                System.out.println("Error en el método ingresar. ");
            }
        } else if (operacion.equals("retirar")) {

            try {
                miCuenta.retirar(cantidad);
            } catch (Exception e) {
                System.err.print(e.getMessage());
                System.out.println("Error en el método retirar. ");
            }
        }
    }
}
