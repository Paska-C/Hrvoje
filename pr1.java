import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.TimeUnit;


public class pr1 {

    private static LocalTime time = LocalTime.now();
    private static void twentyChecker(int th, int tmin, int tsec) throws InterruptedException {
        if(time.getSecond() == tsec && time.getMinute() == tmin && time.getHour() == th){
            System.out.println("Zvonilo je");
            TimeUnit.MINUTES.sleep(20);
        }
    }

    private static void fiveChecker(int h, int min, int sec) throws InterruptedException{
            if(time.getSecond() == sec && time.getMinute() == min && time.getHour() == h){
                System.out.println("Zvonilo je");
                TimeUnit.MINUTES.sleep(5);
            }


        }

        private static void normalizedDate(){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.ENGLISH);
            String fTime = formatter.format(time);
            System.out.println(fTime);
        }

        private static void checkAll() throws InterruptedException{
            fiveChecker(8,45,0);
            fiveChecker(9,35, 0);
            twentyChecker(10,25,0);
            fiveChecker(11,30,0);
            fiveChecker(12,20,0);
            fiveChecker(13,10,0);
            fiveChecker(14,0,0);
            fiveChecker(14,50,0);
        }

        private static void ringerTime() {
            int h = time.getHour();
            int min = time.getMinute();
            int sec = time.getSecond();
        if (h <= 8 && min <=45 ){
            System.out.println(Math.abs(h-8) + ":" + Math.abs(min-45) +":" + Math.abs(sec-60));
            }
        if((h == 8 && min > 45) || (h == 9 && min <= 35)){
            System.out.println(Math.abs(h-9) + ":" + Math.abs(min-35) +":" + Math.abs(sec-60));
        }
        if((h == 9 && min > 35) || (h == 10 && min <= 25)){
            System.out.println(Math.abs(h-10) + ":" + Math.abs(min-25) +":" + Math.abs(sec-60));
        }
        if((h == 10 && min > 25) || (h == 11 && min <= 30))
        {
            System.out.println(Math.abs(h-11) + ":" + Math.abs(min-30) +":" + Math.abs(sec-60));
        }
        if((h == 11 && min > 30) || (h == 12 && min <= 20))
        {
            System.out.println(Math.abs(h-12) + ":" + Math.abs(min-20) +":" + Math.abs(sec-60));
        }
        if((h == 12 && min >20) || (h == 13 && min <= 10))
        {
            System.out.println(Math.abs(h-13) + ":" + Math.abs(min-10) +":" + Math.abs(sec-60));
        }
        if(h == 13 && min > 10){
            System.out.println(Math.abs(h-14) + ":" + Math.abs(min-60) +":" + Math.abs(sec-60));
            }
        if(h == 14)
        {
            System.out.println(Math.abs(h-14) + ":" + Math.abs(min-50) +":" + Math.abs(sec-60));
        }
        }

    public static void main(String[] args) throws InterruptedException {

        while(true)
        {
            normalizedDate();
            ringerTime();
            time = LocalTime.now();
            checkAll();
            TimeUnit.SECONDS.sleep(1);


           }
        }
    }


