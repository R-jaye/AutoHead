/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoHead;

/**
 *
 * @author J.RILEY
 */
public class CarAccessory {
    
    // Data Member
    
    private double iStereo = 103.49;
    private double ModifiedBody = 500.78;
    private double CustomisedTint = 2000;
    private double Leather = 1003.90;
    private double GPS = 180.29;

    public double getiStereo() {
        return iStereo;
    }

    public void setiStereo(double iStereo) {
        this.iStereo = iStereo;
    }

    public double getModifiedBody() {
        return ModifiedBody;
    }

    public void setModifiedBody(double Modified) {
        this.ModifiedBody = Modified;
    }

    public double getCustomisedTint() {
        return CustomisedTint;
    }

    public void setCustomisedTint(double Customised) {
        this.CustomisedTint = Customised;
    }

    public double getLeather() {
        return Leather;
    }

    public void setLeather(double Leather) {
        this.Leather = Leather;
    }

    public double getGPS() {
        return GPS;
    }

    public void setGPS(double GPS) {
        this.GPS = GPS;
    }
    
public double AccessoryCost;    
public double GetAmount() {
    AccessoryCost = iStereo + ModifiedBody + CustomisedTint + Leather + GPS;
    return AccessoryCost;
}
}
