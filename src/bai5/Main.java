package bai5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi của bạn: ");
        String str = scanner.nextLine();

        String current = "" + str.charAt(0);
        String max = current;

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) > str.charAt(i - 1)){
                current += str.charAt(i);
            }else{
                current = "" + str.charAt(i);
            }
            if(current.length() > max.length()){
                max = current;
            }
        }
        System.out.println(max);
    }
}
