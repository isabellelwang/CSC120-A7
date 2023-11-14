/* This is a stub for the Cafe class */
public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /**
     * Constructs a Cafe with information of name, address, floors, coffee ounrces, sugar packets, creams, and cups. 
     * Constructs name, address, floor through super class
     * Prints out you have built a cafe.
     * @param name String that is the name of the shop
     * @param address String address of the cafe
     * @param floors int number of floors of the cafe
     * @param nCoffeeOunces int number of coffee ounces in the cafe
     * @param nSugarPackets  int number of sugar packets
     * @param nCreams int number of creams for coffee
     * @param nCups int number of cups for coffee
     */
    public Cafe(String name, String address, int floors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, floors); 
        this.nCoffeeOunces = nCoffeeOunces;  
        this.nSugarPackets = nSugarPackets; 
        this.nCreams = nCreams; 
        this.nCups = nCups; 

        System.out.println("You have built a cafe: ☕");
    }
    
    /**
     * Void method that throws exception if coffee ounces, sugar packets, creams subracted is 0 or less
     * Otherwise decreases inventory of sugar packets, creams, cups, coffee ounces
     * @param size int number of coffee ounces for coffee
     * @param nSugarPackets int number of sugar packets for coffee
     * @param nCreams int number of creams wanted for coffee
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if(nCoffeeOunces - size <= 0 || this.nSugarPackets - nSugarPackets <= 0 || this.nCreams - nCreams <= 0) {
            throw new RuntimeException("We are out of stock!"); 
        }
        else {
            nCoffeeOunces -= size; 
            this.nSugarPackets -= nSugarPackets; 
            this.nCreams -= nCreams; 
            this.nCups -= nCups;  
        }
    }

    public void sellCoffee(int size, int Creams) {
        if(nCoffeeOunces - size <= 0 || this.nCreams - nCreams <= 0) {
            throw new RuntimeException("We are out of stock!"); 
        }
        else {
            this.nCups -= nCups; 
            this.nCoffeeOunces -= size; 
            this.nCreams -= nCreams; 
        }
    }
    

    /**
     * Adds coffee ounces, sugar packets, creams, cups to inventory 
     * @param nCoffeeOunces int number of coffee ounces
     * @param nSugarPackets int number of sugar packets
     * @param nCreams int number of creams
     * @param nCups int number of cups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) { 
        this.nCoffeeOunces += nCoffeeOunces; 
        this.nSugarPackets += nSugarPackets; 
        this.nCreams += nCreams; 
        this.nCups += nCups; 
    }

    private void restock(int nSugarPackets, int nCreams) {
        this.nCoffeeOunces += nCoffeeOunces; 
        this.nSugarPackets += nSugarPackets; 
    }

    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n) \n sellCoffee() \n restock(nOunces, nSugar, nCream, nCups)");
    }
    
    

    //Testing 
    public static void main(String[] args) {
        Cafe Familiars = new Cafe("Familiars", "456 Food St.", 1, 2, 3, 4, 2);
        Familiars.restock(2, 2, 2, 2); 

        
    }
    
}
