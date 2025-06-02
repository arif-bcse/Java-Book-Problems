package Chapter_8;

public class Time3 {
    private int secondSinceMidNight;
    int Hour,Minute,Second;
    public Time3(){
        this(0,0,0);
    }

    public Time3(int hour) {
        this(hour,0,0);
    }
    public Time3(int hour,int minute){
        this(hour,minute,0);
    }
    public Time3(int hour,int minute,int Second){
      if(hour<0 || hour>=24 || minute <0 || minute >=60 || Second <0 || Second >=60){
          throw new IllegalArgumentException("This is out of Range");
      }
      else {
          this.secondSinceMidNight=(hour*3600)+minute*60+Second;}

    }
    public int gethour(){
        return secondSinceMidNight/3600;
    }
    public int getminute(){
        return (secondSinceMidNight%3600)/60;
    }
    public int  getsec(){
        return (secondSinceMidNight%3600)%60;
    }
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", gethour(), getminute(), getsec());
    }
    public static void main(String[] args) {
        Time3[] t=new Time3[4];

      t[0]=new Time3();

     t[1]=new Time3(10);
      t[2]=new Time3(14,3);
     t[3] =new Time3(20,2,45);
for(int i=0;i<4;i++){
    System.out.println(t[i].secondSinceMidNight);
    System.out.println(t[i].toUniversalString());
}
    }
}
