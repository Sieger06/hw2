import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double dog = 8;
        System.out.println(dog);
        double cat = 3.6;
        System.out.println(cat);
        double paper = 763789;
        System.out.println(paper);
        dog = dog - 4;
        System.out.println(dog);
        cat = cat - 4;
        System.out.println(cat);
        paper = paper - 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксёров " + totalWeight + "кг");
        var different = secondBoxer - firstBoxer;
        System.out.println("Разница в весе составляет " + different + "кг");
        different = (firstBoxer + secondBoxer) % firstBoxer;
        System.out.println("Разница в весе составляет " + different + "кг");

        double time = 640;
        double worker = time / 8;
        System.out.println("Всего рабоников в компании " + worker + " человек");
        worker = worker + 94;
        double time1 = time / worker;
        System.out.println("Если в компании работает " + worker + " человек, то всего " + time1 + " часов работы может быть поделено между сотрудниками");
    }
}