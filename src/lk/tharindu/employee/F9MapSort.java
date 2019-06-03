package lk.tharindu.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class F9MapSort {
    public static void main(String[] args) {


        Map<String,Integer> students= new HashMap<>();

        students.put("tharindu",85);
        students.put("Lakshan",25);
        students.put("kamal",55);
        students.put("ruwan",45);
        students.put("janith",69);
        students.put("amal",78);


        Integer passmark = 60;

        students.entrySet().stream().filter(e->e.getValue()>=passmark)
                .sorted((s1,s2)-> -s1.getValue().compareTo(s2.getValue())).collect(Collectors.toList())
                .stream().forEach(s-> System.out.println(s.getKey()));

        //System.out.println(stream);

        List<String> strings=new ArrayList<>();
        students.entrySet().stream().filter(e->e.getValue()>=passmark)
                .sorted((s1,s2)-> -s1.getValue().compareTo(s2.getValue()))
                .peek(s -> strings.add(s.getKey())).collect(Collectors.toList());
        System.out.println("------------");
        System.out.println(strings);


        Map<Integer,String> vehicles= new HashMap<>();

        vehicles.put(10,"car");
        vehicles.put(13,"SUV");
        vehicles.put(20,"Jeep");
        vehicles.put(12,"Bus");
        vehicles.put(16,"Plane");
        vehicles.put(15,"ship");
        vehicles.put(11,"Lorry");

        List<String> strings1 = new ArrayList<>();
        List<Integer> integers= new ArrayList<>();

        vehicles.entrySet().stream()
                .sorted((s1,s2)-> -s1.getKey().compareTo(s2.getKey()))
                .peek(i-> integers.add(i.getKey()))
                .filter(e->e.getValue() != "ship")
                .peek(s-> strings1.add(s.getValue()))
                .collect(Collectors.toList());


        System.out.println("------------");
        System.out.println("------------");
       System.out.println(strings1);

        System.out.println("------------");
        System.out.println(integers);


    }
}
