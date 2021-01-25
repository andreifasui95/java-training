package code._4_student_effort.secondChallenge;

public class Running implements Shoe {

   private String color;
   private Integer size;

    public Running(String color, Integer size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getSize() {
        return size;
    }
}
