public class StudentBatch {
    private Student students[]= new Student[10];
    private int size = 0;
    private float total = 0;
    private float average = 0;
    private float min=999;
    private float max=0;
    public void add(Student student){
        students[size] = student;
        size ++;
    }
    public int getBatchSz(){
        return students.length;
    }
    public float getMax(int number){
        for(int i=0;i< students.length;i++){
            if (students[i].getMarks(number)>max){
                max = students[i].getMarks(number);
            }
        }
        return max;
    }
    public float getMin(int number){
        for(int i=0;i< students.length;i++){
            if (students[i].getMarks(number)<min){
                min = students[i].getMarks(number);
            }
        }
        return min;
    }
    public float getAvgPerformance(int number) {

        for(int i = 0; i < students.length;  i++){
            total += students[i].getMarks(number);
        }

        average = total / students.length;

        return average;
    }
}