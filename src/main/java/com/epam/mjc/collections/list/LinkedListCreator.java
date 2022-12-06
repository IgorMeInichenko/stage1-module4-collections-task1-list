package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> result = new LinkedList<>();
        for (Integer x: sourceList){
            if (x%2==0){
                result.add(result.size(),x);
            }
            else{
                result.add(0,x);
            }
        }
        return result;
    }
}
