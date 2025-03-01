package cuentas.clientes;

/**
 * Clase Principal para la ejecución del programa de cuenta bancaria
 * @author Jaime González Fernández
 * @since 1.0
 */
public class Main {

    /**
     * Método Principal
     * @param LLama al método operativa_cuenta 
     */
    public static void main(String[] args) {
            operativa_cuenta(5);
    }

    /**
     * Método para la operativa de la cuenta
     * @param Devuelve la cantidad 
     */
    private static void operativa_cuenta(float cantidad) {
        Cuenta cuenta1;
        double saldoActual;

        /**
         * Crea un objeto de tipo cuenta con atributos ya asignados
         */
        cuenta1 = new Cuenta("Rafael Nadal Parera","1000-2365-85-1230456789",2500,0);
        
        /**
         * Imprime el saldo actual
         */
        System.out.println("El saldo actual es:"+ cuenta1.estado() );

        try {
            /**
             * Intento de retirada de dinero
             */
            cuenta1.retirar(2300);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            /**
             * Intento de ingreso de dinero
             */
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
