package com;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Office {
    private String name;
    private String location;
    private int numberOfEmployees;

    Office(String name, String location, int numberOfEmployees) {
        this.name = name;
        this.location = location;
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public static List<Office> listOffices=new ArrayList<Office>();


    public static int getOfficeList(String location){
        return listOffices.stream().filter(o -> o.getLocation()==location).collect(Collectors.toList()).size();
    }
    public static int getEmployeeListof10(){
        return listOffices.stream().filter(o -> o.getNumberOfEmployees()<10).collect(Collectors.toList()).size();
    }
    public static int getEmployeeListof100(){
        return listOffices.stream().filter(o -> o.getNumberOfEmployees()>100).collect(Collectors.toList()).size();
    }
    public static int getEmployeeByName(String name){
        return listOffices.stream().filter(o -> o.getName() == name).collect(Collectors.toList()).size();
    }

    public static boolean checkNameOrder(Office office){
        String pattern="[/A-K]";
        Pattern r = Pattern.compile(pattern);
        Matcher m=r.matcher(office.getName());
        return m.find();
    }

    public static int getNameByOrder(){
        return listOffices.stream().filter(Office::checkNameOrder).collect(Collectors.toList()).size();
    }

    public static boolean checkNameOrderVowel(Office office){
        String pattern="[/AEIOU]";
        Pattern r = Pattern.compile(pattern);
        Matcher m=r.matcher(office.getName());
        return m.find() || office.getNumberOfEmployees()>15;
    }

    public static boolean checkNoOfEmployees(Office office){
        return office.getNumberOfEmployees() >15 ;
    }

    public static int getNameByOrderVowel(){
        return listOffices.stream().filter(Office::checkNameOrderVowel).collect(Collectors.toList()).size();
    }


}