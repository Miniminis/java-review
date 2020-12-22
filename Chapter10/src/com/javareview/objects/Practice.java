package com.javareview.objects;

public class Practice {
    public static void run() {
        MyDate myDate1 = new MyDate(1994, 4, 19);
        MyDate myDate2 = new MyDate(1994, 4, 19);

        System.out.println(myDate2.equals(myDate1));
        System.out.println(myDate1.hashCode());
        System.out.println(myDate2.hashCode());
    }
}

class MyDate {

    int year;
    int month;
    int day;

    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MyDate) {
            MyDate myDate = (MyDate) obj;
            if((year == myDate.year)
                    && (month == myDate.month)
                    && (day == myDate.day)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        String fullDate = Integer.toString(year)+Integer.toString(month)+Integer.toString(day);
        return Integer.parseInt(fullDate);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
