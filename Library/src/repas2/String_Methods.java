package repas2;

import java.util.ArrayList;
import java.util.HashMap;

public class String_Methods {

    public static void main(String[] args) {
        
        // String to integer
        System.out.println("---------StringToInteger-----------");
        System.out.println();
        String strNum = "100";
        int num1 = Integer.valueOf(strNum);
        System.out.println(num1 + 2);
        int num2 = Integer.parseInt(strNum);
        System.out.println(num2 + 4);
        
        // String Methods
        System.out.println();
        System.out.println("---------String_Methods-----------");
        System.out.println();
        
        String mundo = "Hola mundo!";
        System.out.println(mundo);
        System.out.println(mundo.length());
        System.out.println(mundo.indexOf("mundo"));
        System.out.println(mundo.charAt(7));
        System.out.println(mundo.compareTo("hola MunDo!"));
        System.out.println(mundo.compareToIgnoreCase("hola MunDo!"));
        System.out.println(mundo.toLowerCase().contains("hola".toLowerCase()));
        System.out.println(mundo.endsWith("mundo!"));
        System.out.println(mundo.replace("mundo", "mondo"));
        System.out.println(mundo.replaceAll("\\s", "_"));
        System.out.println("Hola mundo mundo!".replaceFirst("mundo", "buen"));
        System.out.println(mundo.toLowerCase());
        System.out.println(mundo.toUpperCase());
        
        // HASHMAP
        System.out.println();
        System.out.println("---------HashMap-----------");
        System.out.println();
        
        ArrayList<String> arrayList;
        arrayList = new ArrayList<>();
        
        arrayList.add("LOL");
        arrayList.add("LOL2");
        System.out.println(arrayList.get(1));
        
        // HashMap<KEY,VALUE> nom_map = new HashMap<KEY,VALUE>();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(152, "Primer");
        map.put(12, "Segon");
        map.put(890, "Tercer");
        map.put(10, "Quart");
        System.out.println(map.get(152));
        System.out.println(map.get(12));
        System.out.println(map.size());
        
        map.remove(12);
        System.out.println(map.get(12));
        System.out.println(map.containsKey(12));
        
        System.out.print("Totes les keys: ");
        System.out.println(map.keySet());
        
        System.out.print("Tots els valors: ");
        System.out.println(map.values());
        
        System.out.print("Is it empty? ");
        System.out.println(map.isEmpty());
    }

}
