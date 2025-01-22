package src.day10;

import src.day10.DTO.MovieDTO;

public class movieMain {
    public static void main(String[] args) {
        MovieDTO movie1 = new MovieDTO(); // 클래스 호출하여 변수 movie1 생성(인스턴스)

        movie1.setTitle("검은 수녀들"); //MovieDTO의 멤버목록 그대로 movie1가 형성됨
        movie1.setStartDate(20250124);
        movie1.setActor("송혜교");
        movie1.setRunningTime("150");
        movie1.setGrade("15");

//        System.out.println(movie1.Title);
//        System.out.println("배우 : "+movie1.actor);
//        System.out.println("기본정보 : " +movie1.grade+","+movie1.runningTime);
//        System.out.println("개봉일 : "+movie1.StartDate);
//        System.out.println("--------------------------------------------------");
//        System.out.println(hitman2.Title);
//        System.out.println("배우 : "+hitman2.actor);
//        System.out.println("기본정보 : " +hitman2.grade+","+hitman2.runningTime);
//        System.out.println("개봉일 : "+hitman2.StartDate);
//    }

        movie1.moviePrint(movie1);
//      itman2.moviePrint(hitman2);

            InputMovieSc movieSc = new InputMovieSc();
            MovieDTO movie2 = new MovieDTO();
            movieSc.inputObject(movie2);
            movie2.moviePrint(movie2);
//
  }
}
