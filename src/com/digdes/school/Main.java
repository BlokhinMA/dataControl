package com.digdes.school;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        JavaSchoolStarter starter = new JavaSchoolStarter();

        try {

            List<Map<String,Object>> result1 = starter.execute("INSERT VALUES 'lastName' = 'Fedorov' , 'id'=1, 'age'=40, 'active'=true");
            System.out.println("Inserted row: " + result1);
            List<Map<String,Object>> result2 = starter.execute("INSERT VALUES 'lastName' = 'Ivanov' , 'id'=2, 'age'=39, 'active'=true");
            System.out.println("Inserted row: " + result2);
            List<Map<String,Object>> result3 = starter.execute("INSERT VALUES 'lastName' = 'Petrov' , 'id'=3, 'age'=41, 'active'=true");
            System.out.println("Inserted row: " + result3);
            List<Map<String,Object>> result4 = starter.execute("UPDATE VALUES 'active' = null where 'age' = 41 AND 'active' = true OR 'id' > 3 AND 'id' < 5");
            System.out.println("Updated row(s): " + result4);
            /*List<Map<String,Object>> result5 = starter.execute("DELETE WHERE 'id'>=2");
            System.out.println("Deleted row(s): " + result5);
            List<Map<String,Object>> result6 = starter.execute("SELECT WHERE 'age'>=40");
            System.out.println("Selected row(s): " + result6);*/

        } catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
