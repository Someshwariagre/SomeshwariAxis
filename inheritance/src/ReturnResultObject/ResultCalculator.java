package ReturnResultObject;

public class ResultCalculator {
        public Result calculateResult (Student student){
            int total = student.mark1 + student.mark2;
            Result result = new Result();
            result.studentId = student.student_id;
            if ((total / 2) < 60) {
                result.grade = "false";
            } else {
                result.grade = "True";
            }
            return result;
        }
    }
