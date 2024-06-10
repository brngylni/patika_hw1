package util;

import building.implementation.House;
import building.implementation.Resort;
import building.implementation.Villa;

import java.util.ArrayList;
import java.util.List;

public class BuildingProducer {

    public static List<House> getHouseList(){
        List<House> houses = new ArrayList<>();
        houses.add(new House(375850, 100, 3, 1));
        houses.add(new House(550000, 140, 5, 1));
        houses.add(new House(643000, 200, 5, 2));
        houses.add(new House(1250000, 300, 8, 3));
        return houses;
    }
    public static List<Villa> getVillaList(){
        List<Villa> villas = new ArrayList<>();
        villas.add(new Villa(375850, 100, 3, 1));
        villas.add(new Villa(550000, 140, 5, 1));
        villas.add(new Villa(643000, 200, 5, 2));
        villas.add(new Villa(1250000, 300, 8, 3));
        return villas;
    }
    public static List<Resort> getResortList(){
        List<Resort> resorts = new ArrayList<>();
        resorts.add(new Resort(375850, 100, 3, 1));
        resorts.add(new Resort(550000, 140, 5, 1));
        resorts.add(new Resort(643000, 200, 5, 2));
        resorts.add(new Resort(1250000, 300, 8, 3));
        return resorts;
    }





}
