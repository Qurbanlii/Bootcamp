package Arrays;
public class arrays {
    
    public static void main(String[] args) {
        String student1 = "Ali";
        String student2 = "Huseyn";
        String student3 = "Murad";
        String student4 = "Ramal";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("-----------------------------");

        String[] student = new String[4];
        student[0] = "Ali";
        student[1] = "Huseyn";
        student[2] = "Murad";
        student[3] = "Ramal";

        for(int i=0;i<student.length;i++) {
            System.out.println(student[i]);
        }
    }
}
