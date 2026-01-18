package bai2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi của bạn: ");
        String str = scanner.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar =  str.charAt(i);
            if(result.isEmpty() || currentChar > result.charAt(result.length()-1))
            {
                result += currentChar;
            }
        }
        System.out.println("Chuỗi tăng dần lớn nhất : " + result);



    }
}
