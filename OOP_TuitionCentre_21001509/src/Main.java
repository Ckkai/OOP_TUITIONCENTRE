import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Tuition Mika = new Tuition();
        Mika.setName("Sia Tuition Centre");
        Head CheKu = new Head();
        CheKu.setName("Patrick","Sia","Jian Jie");
        Mika.setHeadmaster(CheKu);

        StudentBatch V23 = new StudentBatch();

        for (int i=0;i<10;i++){
            Student student = new Student();
            student.setName("Student","NO",""+i);
            student.setAddress("718","Padang Hilirian","Kuala Terengganu","21000","Terengganu");
            for (int z = 0 ; z <5 ; z++){
                student.setMarks((float)Math.random() * 100, z);
            }
            School sester = new School();
            sester.setAddress("1","Jalan Pasir Panjang","Kuala Terengganu","21000","Terengganu");
            sester.setName("SMS KT");
            student.setSchool(sester);
            V23.add(student);
        }
        Mika.setStudentBatch(V23);
        for(int i = 0; i < 5 ; i++){
            Teacher teacher = new Teacher();
            teacher.setName("Teacher", "Number", "" + i);
            teacher.setAddress("1" , "Jalan Pasir Panjang" , "Kuala Terengganu", "21000", "Terengganu");
            Random random = new Random();
            teacher.setNum(random.nextInt(20));
            teacher.setQuali("PHD");
            Mika.addTeam(teacher);
        }
        Mika.getPerformance();
    }
}