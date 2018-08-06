package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;
        double bmi;

        // Nhập cân nặng, chiều cao
        System.out.println("Enter your weight (kilogram): ");
        weight = scanner.nextDouble();

        System.out.println("Enter your height (meter): ");
        height = scanner.nextDouble();

        // Tính chỉ số bmi
        bmi = weight / Math.pow(height, 2);

        // Phân loại và hiển thị kết
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");

    }
}
