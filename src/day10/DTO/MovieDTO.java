package src.day10.DTO;

public class MovieDTO {
    public int setStartDate;
    //영화제목
    String Title;
    //개봉일
    int StartDate;
    //주인공
    String actor;
    //장르
    String gener;
    //런닝타임
    String runningTime;
    //등급
    String grade;

    public String getTitle() {
        return Title;
    }

    public int getStartDate() {
        return StartDate;
    }

    public String getActor() {
        return actor;
    }

    public String getGener() {
        return gener;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public String getGrade() {
        return grade;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setStartDate(int startDate) {
        StartDate = startDate;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void moviePrint(MovieDTO movie){
        System.out.println(this.Title);
        System.out.println("배우 : "+this.actor);
        System.out.println("기본정보 : " +this.grade+"세 이상,"+this.runningTime+"분");
        System.out.println("개봉일 : "+this.StartDate);
        System.out.println("-".repeat(50));

    }
}
