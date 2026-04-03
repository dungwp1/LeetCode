import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

public class D43_1700_Number_of_Students_Unable_to_Eat_Lunch {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> sandwich = new ArrayDeque<>();
        Queue<Integer> student = new ArrayDeque<>();
        int rotationCount = 0;
        for (int s : students) {
            student.add(s);
        }
        for (int s : sandwiches) {
            sandwich.add(s);
        }
        while (rotationCount < student.size()) {
            if (!sandwich.isEmpty() && Objects.equals(student.peek(), sandwich.peek())) {
                student.poll();
                sandwich.poll();
                rotationCount = 0;
            } else if (!sandwich.isEmpty() && !Objects.equals(student.peek(), sandwich.peek())) {
                student.add(student.poll());
                rotationCount++;
            }
        }
        return student.size();
    }
}
