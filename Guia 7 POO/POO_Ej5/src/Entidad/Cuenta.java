/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Maxi
 */
public class Cuenta {
    public int numeroDeCuenta;
    public long dni;
    public int saldo;
    
    public Cuenta(){
    
}   
    public Cuenta(long dni,int saldo, int numeroDeCuenta,int interes){
    this.dni=dni;
    this.numeroDeCuenta=numeroDeCuenta;
    this.saldo=saldo;
    interes=interes;
            
}

    public Cuenta(int numeroDeCuenta, long dni, int saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
   
    
}

