package org.example;

import building.Building;
import building.implementation.House;
import building.implementation.Resort;
import building.implementation.Villa;
import util.BuildingProducer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<House> houses = BuildingProducer.getHouseList();
        List<Villa> villas = BuildingProducer.getVillaList();
        List<Resort> resorts = BuildingProducer.getResortList();

    }



    public static double getTotalPrice(List<Building> buildings){
        return buildings.stream().mapToDouble(Building::getPrice).sum();
    }
    public static double getAveragesquareMeter(List<Building> buildings){
        return buildings.stream().mapToDouble(Building::getSqmtr).average().orElse(0);
    }
    public static List<Building> filterByRoomsHalls(int rooms, int halls, List<Building> buildings){
        return buildings.stream().filter(x -> x.getHalls()==halls && x.getRooms() == rooms).toList();
    }








}