package abstraction;

import implementation.Interface;


// ABstract class
public abstract class Abstraction {
    private Interface implementer; 

    Abstraction (Interface implementer) {
        this.implementer = implementer;
    }

    protected Interface getInterface () {
        return this.implementer;
    }

    public abstract void draw ();
}

