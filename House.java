import java.util.ArrayList; //import ArrayList 
//This is a House class and extends Building
public class House extends Building {
  private ArrayList<String> residents; //names of residents stored in here
  private boolean hasDiningRoom; //true or false if house has dining room
  private boolean hasElevator; 

  /**
   * Constructs a House by taking in name, address, floor, hasDining. Initializes name, address, floor through super class
   * @param name String name of resident
   * @param address String address of house
   * @param floor String number of floors in house
   * @param hasDining Boolean if house has dining or not
   */
  public House(String name, String address, int floor, boolean hasDining, boolean hasElevator) {
    super(name, address, floor); 
    residents = new ArrayList<>(); 
    this.hasDiningRoom = hasDining; 
    this.hasElevator = hasElevator; 
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Constructs a one story house, sets hasElevator to false, and floor to 1
   * @param name String name of house
   * @param address String address of house
   * @param hasDining boolean true/false if house has dining room 
   */
  public House(String name, String address, boolean hasDining) {
    super(name, address, 1); 
    residents = new ArrayList<>(); 
    this.hasDiningRoom = hasDining; 
    this.hasElevator = false; 
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Construct house with address and hasDining boolean
   * @param address String address of house
   * @param hasDining boolean hasDining true/false
   */
  public House(String address, boolean hasDining) {
    super(address);
    this.hasDiningRoom = hasDining; 
    this.hasElevator = false; 
  }

  /**
   * If House has dining room or not
   * @return boolean true/false if house has dining room
   */
  public boolean hasDiningRoom() { 
    return this.hasDiningRoom; 
  }

  /**
   * If house has elevator
   * @return true/false if house has elevator 
   */
  public boolean hasElevator() {
    return this.hasElevator(); 
  }

  /**
   * Number of residents in house
   * @return an int, or number of residents in house
   */
  public int nResidents() {
    return residents.size(); 
  }

  /**
   * Throws exception if resident already in house, otherwise adds resident to house
   * @param name String name of resident
   */
  public void moveIn(String name) { 
    if (residents.contains(name)) { 
      throw new RuntimeException(name + " is already in the house"); 
    }
    else {
      this.residents.add(name); 
    }
  }

  /**
   * Throws exception if residents not in name, otherwise removes the resident from house
   * @param name String name of resident
   * @return String name of resident who moved out
   */
  public String moveOut(String name) { 
    if (!residents.contains(name)) { 
      throw new RuntimeException(name + " is not in the house");
    }
    else {
      this.residents.remove(name); 
      return name; 
    }
  }

  /**
   * If person is resident or not in House object
   * @param person String name of resident
   * @return true/false if resident lives in the house or not
   */
  public boolean isResident(String person) { 
    if(this.residents.contains(person)) { 
      return true; 
    }
    else {
      return false; 
    }
  }
  
  /**
   * prints out options users can do in the House class
   */
  public void showOptions() {
    System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n) \n moveIn(n) \n moveOut(n) \n nResident() \n isResident(n)");
  }
  

  public void goToFloor(int floorNum) {
    if (this.activeFloor == -1) {
        throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
    }
    if (floorNum < 1 || floorNum > this.nFloors) {
        throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors +".");
    }
    if(!hasElevator){
      if((this.activeFloor) + 1 == floorNum || this.activeFloor -1 == floorNum) {
        System.out.println("You are now on floor #" + floorNum + " of " + this.name);
        this.activeFloor = floorNum;
      }
      else{
        throw new RuntimeException("You can only go one floor at a time by stairs"); 
      }
    }
    else{
      System.out.println("You are now on floor #" + floorNum + " of " + this.name);
      this.activeFloor = floorNum;
    }
  }

  //Testing the house class
  public static void main(String[] args) {
    House home = new House("Hubbard", "123 Name St.", 3, true, false);
    home.moveIn("Isabelle"); 
    home.moveIn("Dani"); 

    home.isResident("Isabelle"); 
  }

}