package src.day10;

import src.day10.DTO.MovieDTO;

import java.util.Scanner;

public class InputMovieSc {
    static final Scanner input = new Scanner(System.in);

    public MovieDTO inputObject(MovieDTO movie) { //MovieDTO의 inpuObjct 메소드 형성하고 MovieDTO의 변수 movie를 선언
        System.out.println("영화 제목 입력");
        movie.setTitle(input.nextLine());

        System.out.println("상영날짜입력");
        movie.setStartDate(input.nextInt());
        input.nextLine();
        System.out.println("출연배우 입력");
        movie.setActor(input.nextLine());

        System.out.println("런닝타임 입력");
        movie.setRunningTime(input.nextLine());

        System.out.println("관람등급 입력");
        movie.setGrade(input.nextLine());

        return movie;

    }
}
