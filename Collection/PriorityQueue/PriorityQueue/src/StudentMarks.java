import java.util.Comparator;

public class StudentMarks implements Comparable<StudentMarks> {
    private final int marksInMaths;
    private final int marksInPhysics;

    public StudentMarks(int marksInMaths,int marksInPhysics)
    {
        this.marksInMaths = marksInMaths;
        this.marksInPhysics = marksInPhysics;
    }

    public int getMarksInMaths() {
        return marksInMaths;
    }

    public int getMarksInPhysics() {
        return marksInPhysics;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "marksInMaths=" + marksInMaths +
                ", marksInPhysics=" + marksInPhysics +
                '}';
    }


    @Override
    public int compareTo(StudentMarks o) {
        System.out.println("Compare()To Method is called...");
        return o.marksInMaths - this.marksInMaths;
    }
}
