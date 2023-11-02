package com.codegym.baitap.deployment_fecade_pattern;

import java.util.List;

public class RandomListFacade {
    private RandomList randomList ;
    private ListFilter listFilter ;
    private ListPrinter listPrinter;
    public RandomListFacade(){
        randomList = new RandomList();
        listFilter = new ListFilter();
        listPrinter = new ListPrinter();
    }
    public void generateAndPrintRandomEvenNumbers(int size) {
        List<Integer> randomNumbers = randomList.generateList(size,100,1000);
        List<Integer> evenNumbers = listFilter.filterOdd(randomNumbers);
        listPrinter.printList(evenNumbers);
    }
}

