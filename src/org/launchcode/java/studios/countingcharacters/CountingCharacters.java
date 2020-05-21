package org.launchcode.java.studios.countingcharacters;
//import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {
        String test = "apple";
        count(test);
    }
    public static void count(String test){
        //HashMap<Character, Integer> hashData = new HashMap<>();
        char [] charactersInString = test.toCharArray();
        for(char item : charactersInString){
            int sum = 0;
            for(char element :  charactersInString){
          //     hashData.put(element, 1);

                if(item == element){
                    sum++;
                }
            }
            System.out.println(item + " : " + sum);
        }
//        int sum = 0;
//        for(char item : stringToArray){
            //containsKey
    }
}
