package problem.hardware.invoice;

public class Date {

          private  int month;
          private int day;
          private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public void displayDate(){
        System.out.printf("%d/%d/%d",day,month,year);
    }
}

