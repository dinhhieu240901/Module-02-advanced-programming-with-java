package com.codegym.thuchanh.Bubble_Sort;

public class bubbleSort {
    static int[] list = {1,10,8,5,9,3,4,2,3,-4};
    public static void BubbleSort(int[] list){
        //tạo một biến để giúp chúng ta biết có cần thực hiện thao tác tráo đổi thứ tự hay không
        boolean  needNextPass=true;
        for(int i = 1 ; i < list.length && needNextPass;i++){
              needNextPass = false;
              //chạy vòng lặp để so sánh các phần tử liền kề trong mảng
            for (int j = 0; j < list.length-i ; j++) {
                if(list[j] > list[j+1]){
                    //thay đổi list j với list j + 1
                    int temp = list[j];
                    list[j]= list[j+1];
                    list[j+1]=temp;
                    needNextPass = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        BubbleSort(list);
        for (int j : list) {
            System.out.print(j + " ");
        }

    }
}
