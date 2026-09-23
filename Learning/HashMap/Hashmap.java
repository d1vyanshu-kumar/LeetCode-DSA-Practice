package Learning.HashMap;

import java.util.HashMap;
import java.util.Objects;

public class Hashmap {


    public static class Myclass {
    
        int regNo;
        int hashcode;

        Myclass(int regNo) {
            this.regNo = regNo;
            this.hashcode = Objects.hashCode(this.regNo);
        }
        // We override hashCode() here because we are using this custom object as a key in a HashMap.
        // HashMap uses the hashCode to determine which bucket to store the key-value pair in.
        @Override
        public int hashCode() {
            return hashcode;
        }
        // We must also override equals(). After HashMap finds the correct bucket using hashCode(),
        // it uses equals() to check if the key we are looking for matches the key stored in that bucket.
        @Override
        public boolean equals(Object obj) {
            Myclass temp = (Myclass) obj;
            return this.regNo == temp.regNo;  // Compare the actual values (regNo)
        }
        
    }

    public static class ranking {
    
        int rank;

        ranking(int rank) {
            this.rank = rank;
        }

        @Override
        public boolean equals(Object obj) {
            ranking temp = (ranking) obj;
            return this.rank == temp.rank;  // Compare the actual values (rank)
        }

        @Override
        public String toString() {
            
            return "[rank = " + this.rank + "]";
        }
    }
    

    public static void main(String[] args) {
        
        // HashMap<Integer,String> map = new HashMap<>();

        // map.put(1, "hello");
        // map.put(2, "hell");
        // map.put(3, "hel");
        // map.put(4, "he");
        // map.put(5, "h");

        // System.out.println(map);
        // System.out.println(map.get(5));
        // System.out.println(map.get(100));
        // System.out.println(map.getOrDefault(100,"not there"));
        // System.out.println(map.containsKey(1));

        // Mapping the class registration number to the school ranking.

        HashMap<Integer, Integer> classRankning = new HashMap<>();

        classRankning.put(111, 1);
        classRankning.put(232, 10);
        classRankning.put(544, 3);

        // System.out.println(classRankning);



        HashMap<Myclass, ranking > classRankning2 = new HashMap<>();

        classRankning2.put(new Myclass(111), new ranking(1));
        classRankning2.put(new Myclass(232), new ranking(10));
        classRankning2.put(new Myclass(544), new ranking(3));

        System.out.println(classRankning2.get(new Myclass(111)));
        System.out.println(classRankning2.containsValue(new ranking(3)));

    }
}
