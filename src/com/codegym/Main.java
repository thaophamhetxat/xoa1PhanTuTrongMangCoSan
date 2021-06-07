package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.printf("show arr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + "\t");
        }
        //Nhập X là phần tử cần xoá
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n" + "enter number delete: ");
        number = scanner.nextInt();
        int newArr = arr.length;
//Tìm X xem có xuất hiện trong mảng không. Nếu xuất hiện chỉ ra vị trí của X. Giả sử vị trí này là: i=number
        //Thực hiện xoá phần tử X khỏi mảng
        //Duyệt mảng từ vị trí cần xoá (number) đến cuối mảng (arr.length-1)

        for (int i = number; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];

        }
        newArr--;
        // Gán phần tử 0 ở vị trí cuối newarr cho phần tử ở vị trí newarr + 1
        //Kết thúc duyệt mảng. In ra mảng.

        System.out.printf("new arr: ");
        for (int i = 0; i < newArr + 1; i++) {
            System.out.printf(arr[i] + "\t");
        }


    }
}
