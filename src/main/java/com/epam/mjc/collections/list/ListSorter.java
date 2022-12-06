package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
        for (int i=0;i<sourceList.size()-1;++i){
            for(int j=0;j<sourceList.size()-i-1; ++j){
                int compareResult = new ListComparator().compare(sourceList.get(j),sourceList.get(j+1));
                if (compareResult==1){
                    Collections.swap(sourceList,j,j+1);
                }

            }
        }
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aInt = (int) Integer.parseInt(a);
        int bInt = (int) Integer.parseInt(b);
        int aRes = func(aInt);
        int bRes = func(bInt);
        if (aRes==bRes){
            if (aInt==bInt){
                return 0;
            }
            if (aInt>bInt){
                return 1;
            }
        }
        if (aRes>bRes)
            return 1;
        return -1;
    }
    public int func(int x){
        return (5*x*x+3);
    }
}
