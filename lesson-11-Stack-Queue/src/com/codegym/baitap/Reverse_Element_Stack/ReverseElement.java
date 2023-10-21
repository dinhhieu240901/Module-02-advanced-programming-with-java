package com.codegym.baitap.Reverse_Element_Stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseElement<E> {

  Stack<E> stack = new Stack<>();
  Stack<E> wStack = new Stack<>();

  //  public String reverseString(String s) {
  //    String[] words = s.split(" ");
  //    for (String word : words) {
  //      wStack.push(word);
  //    }
  //    for(int i = 0 ; i < words.length;i++){
  //         words[i]= wStack.pop();
  //    }
  //    s = Arrays.toString(words);
  //    return s;
  //  }
  public void reverse(E[] array) {
    for (E element : array) {
      stack.push(element);
    }
    for (int i = 0; i < array.length; i++) {
      array[i] = stack.pop();
    }
  }

  public void printArray(E[] array) {
    StringBuilder s = new StringBuilder();
    s.append("[");
    for (int i = 0; i < array.length; i++) {
      s.append(array[i]);
      if (i < array.length - 1) {
        s.append(", ");
      }
    }
    s.append("]");
    System.out.println(s);
  }
}
