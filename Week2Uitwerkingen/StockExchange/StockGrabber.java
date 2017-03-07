import java.util.ArrayList;

public class StockGrabber implements Observable {
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    public StockGrabber(){
        // a list to hold all observers
        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver) {
        // TODO
    }

    public void unregister(Observer newObserver) {
        // TODO
    }

    public void notifyObserver() {

        for(Observer observer : observers){
            observer.update(ibmPrice, applPrice, googPrice);
        }
    }

    public void setIBMPrice(double newIBMPrice){

        this.ibmPrice = newIBMPrice;
        notifyObserver();

    }

    public void setAAPLPrice(double newAAPLPrice){

        this.applPrice = newAAPLPrice;
        notifyObserver();
    }

    public void setGOOGPrice(double newGOOGPrice){

        this.googPrice = newGOOGPrice;
        notifyObserver();
    }
}
