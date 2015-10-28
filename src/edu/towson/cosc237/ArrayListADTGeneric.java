/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cosc237;

import java.util.Scanner;

/**
 *
 * @author skaza
 */

public class ArrayListADTGeneric { 
    public static final int SIZE = 20; 
    public static void main(String[] args)  { 
        Scanner input = new Scanner(System.in); 
        UnorderedArrayList<Integer> list = new UnorderedArrayList<Integer>(SIZE); 
        UnorderedArrayList<Integer> list2; 
        Integer n; 
        int index; 
        list.insertEnd(200); 
        list.insertEnd(15); 
        list.insertEnd(3); 
        list.insertEnd(10); 
        list.insertEnd(100); 
        list.insertEnd(37); 
        System.out.println("Testing .insertEnd. Inserted in the list values: 200 15 3 10 100 37"); 
        System.out.println("The original list is: "); 
        list.print(); 
        System.out.print("Testing .search. Enter value to search for: "); 
        n = input.nextInt(); 
        index = list.search(n); 
        if(index != -1) 
            System.out.println("Found " + n + " in the element with index " + index); 
        else 
            System.out.println(n + " not found in this list"); 
        System.out.print("Testing .remove. Enter value to remove from list: "); 
        n = input.nextInt(); 
       list.remove(n); 
        System.out.println("The list after removing " + n + " is: "); 
        list.print(); 
        list2 = copyList(list); 
        System.out.println("Testing client method copyList. The copy list (list2) is: "); 
        list2.print(); 
        n = list2.retrieveAt(0); 
        System.out.println("Testing .retrieveAt. First element in list2 is: " + n); 
        list2.replaceAt(0, 25); 
        System.out.println("Testing .replaceAt. Changed the first element in list2 to 25. "); 
        System.out.println("After change, list2 is: "); 
        list2.print(); 
        System.out.println("Was the original list changed? If not, list2 is a deep copy! The original list is: "); 
        list.print(); 
        System.out.println("Testing .bubbleSort. The original list sortd is: "); 
        list.bubbleSort(); 
        list.print(); 
    }

    public static UnorderedArrayList<Integer> copyList (UnorderedArrayList<Integer> otherList) { 
        UnorderedArrayList<Integer> tempList = new UnorderedArrayList<Integer>(otherList.maxListSize()); 
        Integer n; 
        for (int i = 0; i < otherList.listSize(); i++) { 
            n =  otherList.retrieveAt(i); 
            tempList.insertEnd(n); 
        } 
        return tempList; 
    } 
} 
