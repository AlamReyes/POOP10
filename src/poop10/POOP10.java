/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

import ExcepcionesPropias.DepositarLimiteException;
import ExcepcionesPropias.LimiteCantidadDeposito;
import ExcepcionesPropias.SaldoInsuficienteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlamLR
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuenta cuenta = new Cuenta();
        
        
        try {
            cuenta.depositar(15_000);
            // intenta agregar mas de 3 ejecuciones de depositar y el error se ejecutara
            System.out.println("Saldo de cuenta:" + cuenta.getSaldo());
            cuenta.retirar(10_000);
            System.out.println("Saldo Cuenta"+ cuenta.getSaldo());
            


//            cuenta.retirar(10_000);
//            System.out.println("Saldo de Cuenta " + cuenta.getSaldo());
            
        } catch (SaldoInsuficienteException | DepositarLimiteException | LimiteCantidadDeposito ex) {
            Logger.getLogger(POOP10.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
