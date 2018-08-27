import java.util.ArrayList;
import java.util.List;

public class lesson2_13
{
    public static void main(String[] args) {
        Humans humans = new Humans();
        System.out.println(humans.getName() + " " + humans.getAge());
//        System.out.println(humans.age2);
        String name = humans.getName();
        System.out.println();
        Humans humans1 = new Humans("Dima",23);
        System.out.println(humans1.getName() + " " + humans1.getAge());

        humans.hello();

        IntEx.goodByi();



//        humans.Eating();
//        System.out.println(humans.Female(1));
//        humans.Eating();

//
//        if(4 ==4 )
//        {
//            System.out.println("8");
//        }
//        System.out.println("no");
    }
}
