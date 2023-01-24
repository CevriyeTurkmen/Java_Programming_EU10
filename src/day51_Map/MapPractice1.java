package day51_Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

/*
        for (String employeekey : employeeMap.keySet()) {

            if (employeeMap.get(employeekey).equalsIgnoreCase("m")){
                employeeMap.replace(employeekey,"Male");
            }

            if (employeeMap.get(employeekey).equalsIgnoreCase("F")){
                employeeMap.replace(employeekey,"Female");
            }

        }

 */

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {

            if (entry.getValue().equalsIgnoreCase("m")) {
                //employeeMap.replace(entry.getKey(), "male");
                entry.setValue("male");

            }
            if (entry.getValue().equalsIgnoreCase("F")){
                entry.setValue("female");
               // employeeMap.replace(entry.getKey(),"female");
            }


        }

        System.out.println(employeeMap);

        System.out.println("-------------------------------------------------------------");


        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase("Female")){
                System.out.println(entry.getKey());}

        }

    }
}