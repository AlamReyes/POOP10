/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExcepcionesPropias;

/**
 *
 * @author AlamLR
 */
public class LimiteCantidadDeposito extends Exception{
    public LimiteCantidadDeposito(){
        super("Cantidad de deposito superada");
    }
}
