public class Main {
    public static void main(String[] args)
    {
        Programmer programmer=new Programmer("Suzana","Li",23);
        System.out.println(programmer);
        Programmer.met();
        Programmer.met("coding the Frontend");
    }
}