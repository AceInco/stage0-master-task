package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if(year < 0 || month < 0 || month > 12){
            System.out.println("invalid date");
            return;
        }
        else{
            switch (month){
                case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
                case 4, 6, 9, 11 -> System.out.println(30);
                case 2 -> System.out.println((year % 4 == 0 && year % 10 != 0) || (year % 10 == 0 && year % 400 == 0) ? 29 : 28);
            }
        }
    }

}
