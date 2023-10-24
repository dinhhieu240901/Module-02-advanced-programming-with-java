package com.codegym.baitap.apj_find_maximum_consecutive_increasingly;

public class LongestConsecutiveSubstring {

    public static String find(String str) {
        // Thêm ký tự trắng vào cuối chuỗi để xử lý trường hợp chuỗi con tăng dần ở cuối chuỗi
        str = str + " ";
        // Biến lưu trữ chuỗi con lớn nhất
        String longest = "";
        // Biến lưu trữ chuỗi con hiện tại, bắt đầu với ký tự đầu tiên của chuỗi
        StringBuilder current = new StringBuilder();
        current.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)> current.charAt(current.length() - 1)) {
                current.append(str.charAt(i));
            } else {
                if (current.length() > longest.length()) {
                    longest = current.toString();
                }
                current = new StringBuilder(String.valueOf(str.charAt(i)));
            }
        }
        return longest;
    }
        public static String find1(String str) {
            int maxLength = 0;
            int length = 1;
            int maxStart = 0;
            int start = 0;
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) > str.charAt(i - 1)) {
                    length++;
                } else {
                    if (length > maxLength) {
                        maxLength = length;
                        maxStart = start;
                    }
                    length = 1;
                    start = i;
                }
            }
            if (length > maxLength) {
                maxLength = length;
                maxStart = start;
            }
            return str.substring(maxStart, maxStart + maxLength);
        }

    public static void main(String[] args) {
        String input = "abcabcdgabcmnxy";
        String longestSubstring = find1(input);
        System.out.println("Chuỗi con có độ dài lớn nhất: " + longestSubstring);
    }
}
