
import java.util.Arrays;
public class StudentDetails {

        public static void main(String[] args) {
            Student s1[] = new Student[]{
                    new Student(1, "somu", new int[]{10, 20, 30, 40, 50, 60}),
                    new Student(2, "Sampatti", new int[]{70, 80, 90, 45, 54, 65}),
                    new Student(3, "Smita", new int[]{45, 20, 65, 40, 50, 45}),
                    new Student(4, "Mahesh", new int[]{10, 89, 30, 85, 63, 60}),
                    new Student(5, "Veeresh", new int[]{45, 20, 93, 40, 76, 60}),
                    new Student(6, "Rudresh", new int[]{63, 20, 87, 40, 50, 99}),
                    new Student(7, "Preeti", new int[]{35, 64, 30, 65, 50, 67}),
                    new Student(8, "Aisjwarya", new int[]{10, 20, 30, 40, 50, 60}),
                    new Student(9, "Praveen", new int[]{10, 20, 30, 40, 50, 60}),
                    new Student(10, "Jyoti", new int[]{10, 20, 30, 40, 50, 60})
       };
            for (int i = 0; i < 10; i++) {
//                System.out.println(s1[i]);
                average(s1[i].getMarks(),s1[i].getName());

}

        }
    public static void average(int[] arr,String s){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i];
        }
        System.out.println("sum of marks of " +s+ " is = "+sum);
        System.out.println("avg of the marks of " +s+ " is = "+sum/6);

    }

    static class Student{
        private int rollNo ;
        private String name;
        private  int[] marks;

        public Student(int rollNo, String name, int[] marks) {
            super();
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public int getRollNo() {
            return rollNo;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setMarks(int[] marks) {
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public int[] getMarks() {
            return marks;
        }

        public Student(int rollNo) {
            this.rollNo = rollNo;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollNo=" + rollNo +
                    ", name='" + name + '\'' +
                    ", marks=" + Arrays.toString(marks) +
                    '}';
        }


        }
    }

