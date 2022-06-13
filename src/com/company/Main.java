package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        City деген класс тузунуз. (code, name, ...)
Эгерде code так сан болсо TreeSetke салыныз.
Аларды чонунан кичинесине караган тартипте чыгарыныз.
         */
        Set<City>cities = new HashSet<>();
        cities.add(new City(1,"Bishkek"));
        cities.add(new City(2,"Ankara"));
        cities.add(new City(3,"Moskva"));
        cities.add(new City(4,"Almata"));
        cities.add(new City(5,"Osh"));
        cities.add(new City(6,"Tashkent"));
        cities.add(new City(7,"Astana"));
        cities.add(new City(8,"Sankt-Peterburg"));
        cities.add(new City(9,"Penza"));


        Set<City> citySet = new TreeSet<>();
        for (City city : cities) {
            if(city.getCode()%2==1){
                citySet.add(city);
            }
        }
        citySet.forEach(System.out::println);
//

    }
}
