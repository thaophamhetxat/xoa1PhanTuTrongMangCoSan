package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
        int[] arr = {1, 2, 3, 0, 5, 6, 7, 8, 9, 0};
        System.out.printf("show arr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + "\t");
        }
        //Nhập X là phần tử cần xoá
        int number;
        int position;
        int newArr = arr.length-1;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("\n" + "enter number delete: ");
        number = scanner.nextInt();
        System.out.printf("\n" + "enter position delete: ");
        position = scanner.nextInt();

//Tìm X xem có xuất hiện trong mảng không. Nếu xuất hiện chỉ ra vị trí của X. Giả sử vị trí này là: i=number
        //Thực hiện xoá phần tử X khỏi mảng
        //Duyệt mảng từ vị trí cần xoá (number) đến cuối mảng (arr.length-1)
        if (position <= 0 || position > 10) {
            System.out.println("position no in arr");
        } else {
            for (int i = position - 1; i < arr.length - 1; i++) {
                arr[i] = number;
                arr[i] = arr[i + 1];

            }
            newArr--;
        }


        // Gán phần tử 0 ở vị trí cuối newarr cho phần tử ở vị trí newarr + 1
        //Kết thúc duyệt mảng. In ra mảng.

        System.out.print("new arr: ");
        for (int i = 0; i < newArr +1; i++) {
            System.out.print(arr[i]);
        }


    }
}
