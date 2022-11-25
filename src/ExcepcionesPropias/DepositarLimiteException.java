/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExcepcionesPropias;

/**
 *
 * @author AlamLR
 */
public class DepositarLimiteException extends Exception{
    public DepositarLimiteException(){
        super("Numero de llamadas metodo ha alcanzado el limite");
    }
}
