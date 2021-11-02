/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aamrah
 */
class VitalSign {
    private int BP;
    private boolean BPStatus;
    //constructer
    public VitalSign(int BP) {
        this.BP = BP;
        this.BPStatus = isBPHigh();
    }
    //method
    public boolean isBPHigh()
    {
        if (this.BP<120 && this.BP>90)
        {
            return false;
          
        }
        return true;
    }
    //getters and setters
    public int getBP() {
        return BP;
    }

    public void setBP(int BP) {
        this.BP = BP;
    }

    public boolean isBPStatus() {
        return BPStatus;
    }

    public void setBPStatus(boolean BPStatus) {
        this.BPStatus = BPStatus;
    }
    
    
}
