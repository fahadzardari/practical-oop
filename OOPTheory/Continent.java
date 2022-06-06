import java.util.ArrayList;

class Continent {
    String cname;
    double size;
    ArrayList<Country> list_of_countries = new ArrayList<Country>();

    Continent(String name, double size, ArrayList<Country> list_of_countries) {
        this.cname = name;
        this.size = size;
        this.list_of_countries = list_of_countries;
    }

    void display() {
        for (int i = 0; i < list_of_countries.size(); i++) {
            list_of_countries.get(i).display();
        }
    }

}

class Country {
    String conname;
    City capital;
    ArrayList<City> list_of_cities = new ArrayList<City>();

    Country(String c, String[] cities, long[] populations) {

        this.conname = c;

        capital = new City(cities[0], populations[0]);

        for (int i = 0; i < cities.length; i++) {
            list_of_cities.add(new City(cities[i], populations[0]));
        }

    }

    void display() {
        System.out.println("Country :" + conname);
        System.out.println("Capital");

        capital.display();
    }

    void displayCities() {
        for (int i = 0; i < list_of_cities.size(); i++) {
            list_of_cities.get(i).display();
        }
    }

    public String toString() {

        return "Country name = " + conname + "\nCapital Name = " + capital.getName();
    }

    class City {
        String cityname;
        long population;

        City(String cityname, long pop) {
            this.cityname = cityname;
            population = pop;
        }

        String getName() {
            return cityname;
        }

        void display() {
            System.out.println("Name: " + cityname);
            System.out.println("poputlation " + population);

        }

    }

}

public class Demo {
    public static void main(String[] args) {
        String[] pakistan_city_names = { "Islamabad", "Karachi", "Hyderabad" };
        long[] pakistan_city_population = { 4900990, 132132134, 122123 };
        Country Pakistan = new Country("Pakistan", pakistan_city_names, pakistan_city_population);
        String[] usa_city_names = { "Washington DC", "Austin", "Los Angeles" };
        long[] usa_city_population = { 490099012, 132132, 12212312 };
        Country USA = new Country("USA", usa_city_names, usa_city_population);
        ArrayList<Country> list_of_countries = new ArrayList<Country>();
        list_of_countries.add(USA);
        list_of_countries.add(Pakistan);

        Continent apnaContinent = new Continent("Apna Continent", 12121233, list_of_countries);
        apnaContinent.display();
    }
}