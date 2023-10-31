package com.codegym.thuchanh.Test;

public class ThuKy {
   private final String name;

    private ThuKy(String name) {
        this.name = name;
    }
    private static ThuKy thuky;
    public static synchronized ThuKy getInstance(String name){
        if(thuky==null){
            //tạo mới
            thuky = new ThuKy(name);
        }
        return thuky;
    }

    @Override
    public String toString() {
        return "ThuKy{" +
                "name='" + name + '\'' +
                '}';
    }
}
