public interface IntEx
{
    int Sum(int x,int y);

    default void hello()
    {
        System.out.println("hello");
    }
    static void goodByi()
    {
        System.out.println("Good Bye");
    }
}
