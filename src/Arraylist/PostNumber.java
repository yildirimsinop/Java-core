package Arraylist;

import java.util.HashMap;
import java.util.HashSet;


    public class PostNumber {

        private HashMap<String, Integer> hashMap;

        private HashSet<String> hashSet;

        public PostNumber(){
            hashMap = new HashMap<>();
            hashSet = new HashSet<>();

        }

        public void addBy(String name, int number){
            hashMap.put(name, number);
            hashSet.add(name);

        }
        public int getNumber(String name){
            return hashMap.get(name);

        }
        public int getMapSize(){
            return hashMap.size();


        }

        public int getSetSize(){
            return hashSet.size();
        }

        public HashSet<String> getHashSet(){
            return hashSet;
        }
    }

