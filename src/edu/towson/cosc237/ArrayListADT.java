/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cosc237;

/**
 *
 * @author skaza
 */
public interface ArrayListADT<T> extends Cloneable { 
    public boolean isEmpty(); //Method to determine whether the list is empty. 
    public boolean isFull();  //Method to determine whether the list is full. 
    public int listSize();    //Method to return the number of elements in the list. 
    public int maxListSize(); //Method to return the maximum size of the list. 
    public void print();      //Method to output the elements of the list. 
    public Object clone();    //Returns a copy of objects data in store. Clones only the references, not the objects 
    public boolean isItemAtEqual(int location, T item); //Method to determine whether item is the same as the item in the list at location. 
    public void insertAt(int location, T insertItem);   //Method to insert insertItem in the list at the position 
    public void insertEnd(T insertItem); //Method to insert insertItem at the end of the list. 
    public void removeAt(int location);  //Method to remove the item from the list at location. 
    public T retrieveAt(int location);   //Method to retrieve the element from the list at location. 
    public void replaceAt(int location, T repItem); //Method to replace the element in the list at location with repItem. 
    public void clearList();  //Method to remove all the elements from the list. 
    public int search(T searchItem);     //Method to determine whether searchItem is in the list. 
    public void remove(T removeItem);    //Method to remove an item from the list. 
}