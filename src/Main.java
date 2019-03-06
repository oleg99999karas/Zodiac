import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String r="";
        System.out.print("Введите день (1-31): ");
        int day = scanner.nextInt();
        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();
        if ( (month==1 && day>=20) || ( month==2 && day<=18 ))
        {
            r="Водолей";
        }
        if ( (month==2 && day>=19) || ( month==3 && day<=20 ))
        {
            r="Рыбы";
        }
        if ( (month==3 && day>=21) || ( month==4 && day<=19 ))
        {
            r="Овен";
        }
        if ( (month==4 && day>=20) || ( month==5 && day<=20 ))
        {
            r="Телец";
        }
        if ( (month==5 && day>=21) || ( month==6 && day<=21 ))
        {
            r="Близнецы";
        }
        if ( (month==6 && day>=22) || ( month==7 && day<=22 ))
        {
            r="Рак";
        }
        if ( (month==7 && day>=23) || ( month==8 && day<=22 ))
        {
            r="Лев";
        }
        if ( (month==8 && day>=23) || ( month==9 && day<=22 ))
        {
            r="Дева";
        }
        if ( (month==9 && day>=23) || ( month==10 && day<=22 ))
        {
            r="Весы";
        }
        if ( (month==10 && day>=23) || ( month==11 && day<=22 ))
        {
            r="Скорпион";
        }
        if ( (month==11 && day>=23) || ( month==12 && day<=21 ))
        {
            r="Стрелец";
        }
        if ( (month==12 && day>=22) || ( month==1 && day<=19 ))
        {
            r="Козерог";
        }
        System.out.println("Знак зодиака: " + r);

    }
}
