import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Priority {
    public static void main(String[] args) {


        List<StudentMarks> studentInfo = new ArrayList<>();
        studentInfo.add(new StudentMarks(80,81));
        studentInfo.add(new StudentMarks(60,91));
        studentInfo.add(new StudentMarks(75,51));
        studentInfo.add(new StudentMarks(85,56));
        studentInfo.add(new StudentMarks(95,88));
        studentInfo.add(new StudentMarks(65,65));

        List<StudentMarks> marks = new ArrayList<>();
        PriorityQueue<StudentMarks> priorityQueue = new PriorityQueue<>(studentInfo);
        int top3 = 0;
        while(!priorityQueue.isEmpty())
        {
            if(top3 == 3)
                break;
            marks.add(priorityQueue.poll());
            top3++;
        }

        System.out.println(marks);
    }
}
