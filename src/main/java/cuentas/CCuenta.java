package cuentas;

/**
 * Clase CCuenta con la que creamos objetos CCuenta con el nombre del propietario, el número de la cuenta, su saldo, tipo de interés, obtenemos su estado e ingresamos o retiramos saldo. 
 * 
 * @author Gabriel Pérez López
 */

public class CCuenta {

    /**
     * @return obtenemos el valor del atributo nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre parámetro con el que se establece el valor de la variable nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return obtenemos el valor de la variable cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta parámetro con el que se establece el valor de la variable cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return obtenemos el valor de la variable saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo parámetro con el que se establece el valor de la variable saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return obtenemos el valor de la variable tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés parámetro con el que se establece el valor de la variable tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacío de la clase CCuenta
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de la clase CCcuenta
     * 
     * @param nom parámetro con el que damos valor a la variable nombre
     * @param cue parámetro con el que damos valor a la variable cuenta
     * @param sal parámetro con el que damos valor a la variable saldo
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método que llama al método getSaldo() para consultar el estado de la cuenta
     * 
     * @return devuelve el estado de la cuenta llamando al método getSaldo() para obtener su saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método con el que ingresamos una cantidad en la cuenta
     * 
     * @param cantidad parámetro con el que ingresamos una cantidad en la cuenta
     * @throws Exception nos avisa de que el parámetro no puede ser negativo
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método con el que retiramos una cantidad de la cuenta
     * 
     * @param cantidad parámetro con el que retiramos una cantidad de la cuenta
     * @throws Exception nos avisa de que el parámetro no puede ser negativo ni mayor a la cantidad devuelta por el método estado()
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
