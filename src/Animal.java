public class Animal
{
    private int legs;
    private int arms;
    public  Animal()
    {
        this.arms = 2;
        this.legs = 2;
    }
    public  Animal(int i, int l)
    {
        this.arms = i;
        this.legs = l;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getArms() {
        return arms;
    }

    public void setArms(int arms) {
        this.arms = arms;
    }
}
