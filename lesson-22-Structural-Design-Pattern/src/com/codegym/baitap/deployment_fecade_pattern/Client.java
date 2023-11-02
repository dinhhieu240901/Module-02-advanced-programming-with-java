package com.codegym.baitap.deployment_fecade_pattern;

import java.util.List;

public class Client {

    public void print(){
        RandomListFacade randomListFacade = new RandomListFacade();
        randomListFacade.generateAndPrintRandomEvenNumbers(5);
    }
}
