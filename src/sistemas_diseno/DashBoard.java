/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas_diseno;

/**
 *
 * @author JRamR
 */
public class DashBoard {
    private SensorProxy sensor=new SensorProxy("Temperatura: 50C");
    
    public void updateData(){
          for (int i = 0; i < 2; i++) {
            System.out.println(sensor.read());
            sensor.setTipo("Luz:ON");
        }
    }
    
    public void updateDisplay(){
        System.out.println("Display Updated");
        
    }
    
}
