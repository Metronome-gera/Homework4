//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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

        byte speed = 70;
        if ( speed > 60){
            System.out.printf("  Ваша скорость "+speed+" километров в час, прийдётся заплатить штраф   ");
        }else{
            System.out.printf("Ваша скорость "+speed+" километров в час можно ехать спокойно");
        }
        byte peopleAge = 14;
        if (peopleAge >=2 && peopleAge <=6){
            System.out.printf("Ваш возраст "+peopleAge+" вы должны ходить в детский сад");
        } ;
        if (peopleAge >=7 && peopleAge <=17){
            System.out.printf("Ваш возраст "+peopleAge+" вы должны учится в школе");
        }
        if (peopleAge >=18 && peopleAge <=24){
            System.out.printf("Ваш возраст "+peopleAge+" скорее всего вы учитесь в университете");
        }
        if (peopleAge >24){
            System.out.printf("Ваш возраст "+peopleAge+" скорее всего вы уже ходите на работу");
        }
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
        byte people = 40;


    }
}