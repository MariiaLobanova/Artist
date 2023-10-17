package annotation;

public class CreatingsAnnotations {
    public static void main(String[] args) {

        Cat myCat = new Cat ("Murka");

        if(myCat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("it is very important");
        }else {
            System.out.println("It is not");
        }
    }
}
