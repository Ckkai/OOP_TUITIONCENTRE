import java.util.ArrayList;
public class Tuition {
    private String name;
    private Head headmaster;
    Teacher team[] = new Teacher[5];
    private StudentBatch studentBatch;
    private int teamsz = 0;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public void addTeam(Teacher teacher) {
        this.team[teamsz] = teacher;
        teamsz++;
    }

    public void setStudentBatch(StudentBatch studentBatch) {this.studentBatch = studentBatch;}

    public void setHeadmaster(Head headmaster) {this.headmaster = headmaster;}

    public int getTeamsz() {return teamsz;}

    public int getBatchSize() {return studentBatch.getBatchSz();}

    public float getAvgPerformance(int index) {return studentBatch.getAvgPerformance(index);}

    public String getHeadmaster() {
        return headmaster.getName();
    }

    public void getPerformance() {
        System.out.println(getName());
        System.out.println("Headmaster: " + getHeadmaster());
        System.out.println("Team size: " + getTeamsz());
        System.out.println("Batch size: " + getBatchSize());
        for (int i = 0; i < 5; i++) {
            System.out.println("The Average score for the subject " + i + ": " + getAvgPerformance(i));
            System.out.println("The minimum score for subject " + i + ": " + studentBatch.getMin(i));
            System.out.println("The maximum score for subject " + i + ": " + studentBatch.getMax(i));
        }
    }
}