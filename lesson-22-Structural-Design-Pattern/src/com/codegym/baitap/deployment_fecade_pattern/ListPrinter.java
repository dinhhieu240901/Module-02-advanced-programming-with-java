package com.codegym.baitap.deployment_fecade_pattern;

import java.util.List;

public class ListPrinter {
    public void printList(List<Integer> numbers){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < numbers.size(); i++) {
            sb.append(numbers.get(i));
            if (i < numbers.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        System.out.println(sb.toString());
    }
}