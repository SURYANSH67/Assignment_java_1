package com.test.collectionCall;

import java.util.ArrayList;
import java.util.HashSet;
//import java.util.LinkedList;
import java.util.List;
//import java.util.Scanner;
import java.util.Set;

public class TestCode {
	public static void main(String[]args) {
		 // List Implementation (ArrayList)
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Banana"); // Allows duplicate

        System.out.println("List Elements: " + list);

        // Set Implementation (HashSet)
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Banana"); // Will be ignored as Set does not allow duplicates

        System.out.println("Set Elements: " + set);
    }
}
