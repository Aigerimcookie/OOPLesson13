public class Humans implements IntAnimal,IntEx

{
    private String name;
    private int age;

    public Humans()
    {
        this.name = "noname";
        this.age = -1;
    }
    public Humans(String name2,int age)
    {
        this.name = name2;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int age2 = 12;

    @Override
    public String Female(int i) {
        return null;
    }

    @Override
    public int Sum(int x, int y) {
        return x+y;
    }
}
