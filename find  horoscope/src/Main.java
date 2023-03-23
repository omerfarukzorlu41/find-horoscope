import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day,month;
        boolean dayError = false,monthError = false;
        String horoscope ="";
        System.out.print("What month were you born?: ");
        month = scanner.nextInt();
        System.out.print("What is the day you were born?: ");
        day = scanner.nextInt();

        if(month == 1){
            if(1 <= day && day <=21){
                horoscope="Your zodiac sign: Capricorn";
            }else if(day >= 22 && day <= 31){
                horoscope="Your zodiac sign: Aquarius";
            }else{
                dayError = true;
            }
        }else if(month == 2){
            if(1 <= day && day <=19){
                horoscope="Your zodiac sign: Aquarius";
            }else if(day >= 20 && day <= 28){
                horoscope="Your zodiac sign: Pisces";
            }else{
                dayError = true;
            }

        }else if(month == 3){
            if(1 <= day && day <=20){
                horoscope="Your zodiac sign: Pisces";
            }else if(day >= 21 && day <= 31){
                horoscope="Your zodiac sign: Aries";
            }else{
                dayError = true;
            }
        }else if(month == 4){
            if(1 <= day && day <=20){
                horoscope="Your zodiac sign: Aries";
            }else if(day >= 21 && day <= 30){
                horoscope="Your zodiac sign: Taurus";
            }else{
                dayError = true;
            }
        }else if(month == 5){
            if(1 <= day && day <=21){
                horoscope="Your zodiac sign: Taurus";
            }else if(day >= 22 && day <= 31){
                horoscope="Your zodiac sign: Gemini";
            }else{
                dayError = true;
            }
        }else if(month == 6){
            if(1 <= day && day <=22){
                horoscope="Your zodiac sign: Gemini";
            }else if(day >= 23 && day <= 30){
                horoscope="Your zodiac sign: Cancer";
            }else{
                dayError = true;
            }
        }else if(month == 7){
            if(1 <= day && day <=22){
                horoscope="Your zodiac sign: Cancer";
            }else if(day >= 23 && day <= 31){
                horoscope="Your zodiac sign: Leo";
            }else{
                dayError = true;
            }
        }else if(month == 8){
            if(1 <= day && day <=22){
                horoscope="Your zodiac sign: Leo";
            }else if(day >= 23 && day <= 30){
                horoscope="Your zodiac sign: Virgo";
            }else{
                dayError = true;
            }
        }else if(month == 9){
            if(1 <= day && day <=22){
                horoscope="Your zodiac sign: Virgo";
            }else if(day >= 23 && day <= 31){
                horoscope="Your zodiac sign: Libra";
            }else{
                dayError = true;
            }
        }else if(month == 10){
            if(1 <= day && day <=22){
                horoscope="Your zodiac sign: Libra";
            }else if(day >= 23 && day <= 31){
                horoscope="Your zodiac sign: Scorpio";
            }else{
                dayError = true;
            }
        }else if(month == 11){
            if(1 <= day && day <=21){
                horoscope="Your zodiac sign: Scorpio";
            }else if(day >= 22 && day <= 30){
                horoscope="Your zodiac sign: Sagittarius";
            }else{
                dayError = true;
            }
        }else if(month == 12){
            if(1 <= day && day <=21){
                horoscope="Your zodiac sign: Sagittarius";
            }else if(day >= 22 && day <= 31){
                horoscope="Your zodiac sign: Capricorn";
            }else{
                dayError = true;
            }
        }else{
           monthError = true;
        }
        if(dayError){
            System.out.println("Please enter your birthday correctly...");
        }else if(monthError){
            System.out.println("Please enter your month of birth correctly...");
        }else{
            System.out.println(horoscope);
        }
    }
}
