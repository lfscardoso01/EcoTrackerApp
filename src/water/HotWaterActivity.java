/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package water;

/**
 * Represents a hot water consumption record.
 * @author lfscardoso
 */
public class HotWaterActivity extends WaterActivity {
    
    private double initialTemperature;
    private double finalTemperature;
    private double emissionFactor;
    

    public HotWaterActivity(int id, String date,double duration, double volume,double initialTemperature,double finalTemperature,double emissionFactor) {

        super(id, date, duration, volume);

        this.initialTemperature = initialTemperature;
        this.finalTemperature = finalTemperature;
        this.emissionFactor = emissionFactor;
    }
    
}
