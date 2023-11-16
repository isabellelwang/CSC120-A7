import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        System.out.println(myMap);

        //adding at least ten more buildings
        myMap.addBuilding(new House("Hubbard House", "3 Green St, Northampton, MA 01060", 4, false, false));
        myMap.addBuilding(new House("Washburn House", "1183 Main St, Worcester, MA 01603", 4,false, false)); 
        myMap.addBuilding(new Cafe("Campuse Cafe", "100 Elm St, Northampton, MA 01063", 1, 190, 13, 14, 30)); 
        myMap.addBuilding(new Cafe("Compass Cafe", "7 Neilson Drive, Northampton, MA 01063", 4, 100, 8, 4, 15));
        myMap.addBuilding(new Building("Burton Hall", "46 College Ln, Northampton, MA 01063", 4)); 
        myMap.addBuilding(new Building("Seelye Hall", "2 Seelye Dr, Northampton, MA 01060", 4)); 
        myMap.addBuilding(new House("Capen House", "26 Prospect St, Northampton, MA 01060", 4, false, false)); 
        myMap.addBuilding(new House ("Wilder House", "1 Mandelle Rd, Northampton, MA 01063", 4, true, true));
        myMap.addBuilding(new Library("Nielson Library", " Neilson Drive, Northampton, MA 01063", 4, true));
        myMap.addBuilding(new Library("Werner Josten Library", "Mendenhall Center, 122 Green St, Northampton, MA 01063", 1, false));
    }
    
}
