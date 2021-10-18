package ro.fasttrackit.curs6;

public class Exercises {
    public static void main(String[] args){
        System.out.println("This is my homework");
        String[] names = {"Ana", "Dana", "Daria"};
        printLongerThan(names, 4);

    }

    static void printLongerThan(String[] names, int minLength){
        for (String name:names){
            if (name.length()>= minLength){
                System.out.println(name);
            }
        }
    }
}
