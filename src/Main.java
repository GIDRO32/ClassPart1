class yourInfo
{
    String name;
    int age;
    double phonePower;
    //1.7 declaring setters and getters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setPhonePower(double phonePower)
    {
        this.phonePower = phonePower;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public double getPhonePower()
    {
        return this.phonePower;
    }
}
public class Main {
    public static void main(String[] args)
    {
        //1.7 calling setters and getters
        yourInfo account = new yourInfo();
        account.setName("Sasha");
        account.setAge(18);
        account.setPhonePower(76.4);
        System.out.println("Name: " + account.getName());
        System.out.println("Age: " + account.getAge());
        System.out.println("Phone power:" + account.getPhonePower() + "/100");
    }
}