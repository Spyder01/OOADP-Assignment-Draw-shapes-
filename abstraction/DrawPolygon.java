package abstraction;

import implementation.Interface;


// Refined Abstract class
public class DrawPolygon extends Abstraction {
    
    public DrawPolygon (Interface implementer) {
        super (implementer);
    } 

    @Override
    public void draw () {
        this.getInterface().draw();
    }
}