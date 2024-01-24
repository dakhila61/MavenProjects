public class Student {
    private final String name = "Akhila";

    private String getName(){
        return name;
    }
    public static void main(String[] args){
        Student student1 = new Student();
        System.out.println("Name returned from the method getName "+student1.getName());
    }
}
