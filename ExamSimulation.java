import java.util.*;

// Generic Result class
class Result<T> {
    private T value;

    public Result(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

// ExamSystem to manage results
class ExamSystem {
    private final Map<String, Result<?>> results = new HashMap<>();

    // synchronized = only one thread saves result at a time
    public synchronized void saveResult(String rollNo, Result<?> result) {
        System.out.println("Saving result for: " + rollNo);
        results.put(rollNo, result);
        try {
            Thread.sleep(500); // simulate delay in saving
        } catch (InterruptedException e) {
            System.err.println("Error saving result for: " + rollNo);
        }
        System.out.println(rollNo + " submitted exam ");
    }

    public void showResults() {
        System.out.println("\n--- Final Results ---");
        for (Map.Entry<String, Result<?>> entry : results.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

// Student class as a Thread
class Student extends Thread {
    private final String rollNo;
    private final ExamSystem examSystem;
    private final int marks; // demo: assigning marks directly

    public Student(String rollNo, ExamSystem examSystem, int marks) {
        this.rollNo = rollNo;
        this.examSystem = examSystem;
        this.marks = marks;
    }

    @Override
    public void run() {
        try {
            System.out.println(rollNo + " is writing exam...");
            Thread.sleep((long) (Math.random() * 2000)); // simulate exam writing
            examSystem.saveResult(rollNo, new Result<>(marks));
        } catch (InterruptedException e) {
            System.err.println(rollNo + " faced an issue during exam.");
        }
    }
}

// Main Program
public class ExamSimulation {
    public static void main(String[] args) {
        ExamSystem examSystem = new ExamSystem();

        // Create students (threads)
        Student s1 = new Student("AU101", examSystem, 47);
        Student s2 = new Student("AU102", examSystem, 92);
        Student s3 = new Student("AU103", examSystem, 15);

        // Start exam threads
        s1.start();
        s2.start();
        s3.start();

        // Wait for all students to finish
        try {
            s1.join();
            s2.join();
            s3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Show final results
        examSystem.showResults();
    }
}
