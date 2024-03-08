/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas_diseno;

/**
 *
 * @author JRamR
 */
public class SensorProxy {
    
    public String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public SensorProxy(String tipo){
        this.tipo=tipo;
    }
    
    public String read(){
        return tipo;
    }
    
}
