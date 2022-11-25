/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

import ExcepcionesPropias.DepositarLimiteException;
import ExcepcionesPropias.LimiteCantidadDeposito;
import ExcepcionesPropias.SaldoInsuficienteException;

/**
 *
 * @author AlamLR
 */
public class Cuenta {
    double saldo;
    public static int counter = 0;

    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Retirando..."+ monto);
        if(saldo<monto)
            throw new SaldoInsuficienteException();
        else
            this.saldo -= monto;
    }
    
    public void depositar(double monto)throws DepositarLimiteException, LimiteCantidadDeposito{
        if(counter ==3) throw new DepositarLimiteException();
        counter++;
        
        if(monto>15_000) throw new LimiteCantidadDeposito();
        System.out.println("Depositando..." + monto);
        this.saldo += monto;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
    
    
   
    
}
