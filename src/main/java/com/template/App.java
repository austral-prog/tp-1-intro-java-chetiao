package com.template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {

        return a + b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        // TODO: Implement this method


        return number % 2 == 0;
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        // TODO: Implement this method
        if (a < b) {return b;}
        else {return a;}
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        // TODO: Implement this method
        if (n < 0) {
            return 1;
        }
        int result = 1;
        int i = 1;
        while (i <= n) {
            result = result * i;
            i++;
        }
        return result;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        // TODO: Implement this method
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        String reversedString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString = reversedString + input.charAt(i);
        }
        return reversedString;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        // TODO: Implement this method
        int min = array[0];

        for (int i = 0; i < array.length; i++) {if (array[i] < min){min = array[i];}}

        return min;

    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        // TODO: Implement this method

        int sumadeto = 0;
        for (int i = 0; i < array.length; i++) {sumadeto += array[i];}
        return sumadeto;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        // TODO: Implement this method
        return  (celsius * 1.8) + 32;
    }

    // 11. Sum of Elements in a List
    public int sumList(List<Integer> list) {
        // TODO: Implement this method
        int suma = 0;

        for (int i = 0; i < list.size(); i++) {
            suma += list.get(i);
        }
        return suma;
    }

    // 12. Find the Largest Element in a List
    public int findMax(List<Integer> list) {
        if (list.size() == 0) {throw new IllegalArgumentException("list is empty");}

        int max = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {max = list.get(i);}
        }
        return max;
    }

    // 13. Filter Even Numbers from a List
    public List<Integer> filterEvenNumbers(List<Integer> list) {
        // TODO: Implement this method
        List<Integer> pares = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                pares.add(list.get(i));
            }
        }
        return pares;


    }

    // 14. Concatenate Two Lists
    public List<String> concatenateLists(List<String> list1, List<String> list2) {
        // TODO: Implement this method

        List<String> listatotal = new ArrayList<>();

        listatotal.addAll(list1);
        listatotal.addAll(list2);

        return listatotal;
    }

    // 15. Check if List Contains Element
    public boolean listContains(List<String> list, String element) {
        // TODO: Implement this method
        if (list.contains(element)) {return true;}
        return false;
    }

    // 16. Convert Strings to Uppercase
    public List<String> toUpperCase(List<String> list) {
        // TODO: Implement this method
        for (int i = 0; i < list.size(); i++) {
        list.set(i, list.get(i).toUpperCase());}
        return list;
    }

    // 17. Remove Duplicates from a List
    public List<Integer> removeDuplicates(List<Integer> list) {
        // TODO: Implement this method
    Set<Integer> set = new HashSet<>(list);
    return new ArrayList<>(set);
    }

    // 18. Convert List to Set for Unique Elements
    public Set<Integer> listToSet(List<Integer> list) {
        // TODO: Implement this method
        Set<Integer> set = new HashSet<>(list);
        return set;
    }


    // 19. Check if Map Contains Key
    public boolean mapContainsKey(Map<String, String> map, String key) {
        // TODO: Implement this method
        return map.containsKey(key);
    }

    // 20. Check if Map Contains Value
    public boolean mapContainsValue(Map<String, String> map, String value) {
        // TODO: Implement this method
        return  map.containsValue(value);
    }

    // 21. Iterate Over a Map
    public List<String> iterateMap(Map<String, String> map) {
        // TODO: Implement this method
        List<String> valuesList = new ArrayList<>();

        for (String value : map.values()) {
            valuesList.add(value);
        }

        return valuesList;
    }
}

