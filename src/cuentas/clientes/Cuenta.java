package cuentas.clientes;

/**
 * Clase para cuenta bancaria
 * Realiza operaciones para el ingreso y retirada de dinero
 * @author Jaime González Fernández
 * @since 1.0
 */
public class Cuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * @return Devuelve nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param Establece nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Devuelve cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param Establece cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return Devuelve saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param Establece saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return Devuleve tipo de Interes
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param Establece tipo de Interes
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    

    /**
     * Constructor Sin parámetros
     */
    public Cuenta()
    {
        nombre ="";
        cuenta="";
        saldo=0;
        tipoInteres=0;
    }

    /**
     * Constructor con parámetros
     * @param Nombre Titular
     * @param Número de cuenta
     * @param Saldo cuenta
     * @param Intereses 
     */
    public Cuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }

    /**
     * Obtiene saldo de la cuenta
     * @return Saldo disponible
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingreso de dinero
     * @param Cantidad a ingresar
     * @throws Excepción que no permite que se negativo 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Sacar dinero
     * @param Cantidad a retirar 
     * @throws Excepción que no permite que sea negativo o si no hay dinero suficiente
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
