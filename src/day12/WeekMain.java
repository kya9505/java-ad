package day12;

import day01.Calculator;

import java.util.Calendar;

public class WeekMain {
    public static void main(String[] args) {
        Week today = null;

        //자바 calendar 클래스 : 컴에서 제공하는 날짜, 요일 시간을 얻어올때 사용
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);

    }
}