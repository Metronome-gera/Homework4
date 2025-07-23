//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Задача №1
        byte age = 19;
        if ( age >=18){
            System.out.println("Вы достигли совершеннолетия");
        }else{
            System.out.printf("Вы не достигли 18 лет, прийдется немного подождать");
        }
        byte temperature = 2;
        if ( temperature > 5){
            System.out.printf("На улице тепло, можно идти без шапки");
        }else{
            System.out.printf("На улице "+temperature+" градусов, надо надеть шапку  ");
        }
// Задача №2
        byte speed = 70;
        if ( speed > 60){
            System.out.printf("  Ваша скорость "+speed+" километров в час, прийдётся заплатить штраф   ");
        }else{
            System.out.printf("Ваша скорость "+speed+" километров в час можно ехать спокойно");
        }
// Задача №3
        byte peopleAge = 14;
        if (peopleAge >=2 && peopleAge <=6){
            System.out.printf("Ваш возраст "+peopleAge+" вы должны ходить в детский сад");
        } ;
        if (peopleAge >=7 && peopleAge <=17){
            System.out.printf("Ваш возраст "+peopleAge+" вы должны учится в школе");
        }
             //Жи есть
        if (peopleAge >=18 && peopleAge <=24){
            System.out.printf("Ваш возраст "+peopleAge+" скорее всего вы учитесь в университете");
        }
        if (peopleAge >24){
            System.out.printf("Ваш возраст "+peopleAge+" скорее всего вы уже ходите на работу");
        }
// Задача №4
        byte agePeople = 16;
        if (agePeople <=5){
            System.out.printf("   Ваш возраст "+agePeople+" вы не можете кататся на этом атракционе");
        }
        if (agePeople >5 && agePeople <14){
            System.out.printf("   Ваш возраст "+agePeople+" вы можете кататся на этом аттракционе, но только с сопроваждающим взрослым");
        }
        if (agePeople >14){
            System.out.printf("   Ваш возраст "+agePeople+" вы можете кататся на этом аттракционе");
        }
// Задача №5
        byte van = 102;
        byte vanSit = 60;
        byte vanStand = (byte) (van-vanSit);
// Задача №6
        byte traveler = 100;
        if (traveler<=vanSit){
            System.out.printf("В вагоне остались как сидячие так и стоячие места");
        }
        if (traveler>vanSit && traveler<=van){
            System.out.printf("В вагоне остались только сидячие места");
        }
        if (traveler>van){
            System.out.printf("В вагоне не осталось свободных мест");
        }
// Задача №7
        int one;
        int two;
        int three;
        one=1;
        two=2;
        three=3;
        if (one>two){
            System.out.printf("   one");
        }
        if (two>three){
            System.out.printf("   two");
        }else{
            System.out.printf("  three");
        }


    }
}