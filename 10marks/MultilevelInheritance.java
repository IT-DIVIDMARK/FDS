// Write a program for multilevel inheritance such that country is inherited from continent.
            // State is inherited from country. Display the place, state, country and continent.
// Base class: Continent
class Continent {
    String continentName;

    // Constructor to initialize continent name
    public Continent(String continentName) {
        this.continentName = continentName;
    }

    // Method to display continent name
    public void displayContinent() {
        System.out.println("Continent: " + continentName);
    }
}

// Derived class: Country inherits from Continent
class Country extends Continent {
    String countryName;

    // Constructor to initialize continent and country names
    public Country(String continentName, String countryName) {
        super(continentName); // Call the parent class (Continent) constructor
        this.countryName = countryName;
    }

    // Method to display country name
    public void displayCountry() {
        System.out.println("Country: " + countryName);
    }
}

// Derived class: State inherits from Country
class State extends Country {
    String stateName;
    String placeName;

    // Constructor to initialize continent, country, state, and place names
    public State(String continentName, String countryName, String stateName, String placeName) {
        super(continentName, countryName); // Call the parent class (Country) constructor
        this.stateName = stateName;
        this.placeName = placeName;
    }

    // Method to display state and place names
    public void displayStateAndPlace() {
        System.out.println("State: " + stateName);
        System.out.println("Place: " + placeName);
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {
        // Create an object of State and initialize all details
        State myPlace = new State("Asia", "India", "Maharashtra", "Mumbai");

        // Display the place, state, country, and continent
        myPlace.displayContinent();
        myPlace.displayCountry();
        myPlace.displayStateAndPlace();
    }
}
