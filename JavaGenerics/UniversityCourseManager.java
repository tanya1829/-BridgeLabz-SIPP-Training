package JavaGenerics;
import java.util.*;

// ===== Abstract Course Type =====
abstract class CourseType {
    private String title;

    public CourseType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void evaluate();
}

// ===== Concrete Course Types =====
class ExamCourse extends CourseType {
    public ExamCourse(String title) {
        super(title);
    }

    @Override
    public void evaluate() {
        System.out.println(getTitle() + " is evaluated via Exams.");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String title) {
        super(title);
    }

    @Override
    public void evaluate() {
        System.out.println(getTitle() + " is evaluated via Assignments.");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String title) {
        super(title);
    }

    @Override
    public void evaluate() {
        System.out.println(getTitle() + " is evaluated via Research Work.");
    }
}

// ===== Generic Course Class =====
class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public void evaluateCourse() {
        courseType.evaluate();
    }
}

// ===== Utility Class for Wildcard Method =====
class CourseUtils {
    public static void evaluateAllCourses(List<? extends CourseType> courseList) {
        for (CourseType course : courseList) {
            course.evaluate();
        }
    }
}

// ===== Main Application Class =====
public class UniversityCourseManager {
    public static void main(String[] args) {
        // Create individual course objects
        Course<ExamCourse> math = new Course<>(new ExamCourse("Mathematics"));
        Course<AssignmentCourse> english = new Course<>(new AssignmentCourse("English Literature"));
        Course<ResearchCourse> ai = new Course<>(new ResearchCourse("AI Research"));

        // Store courses in a list for evaluation
        List<CourseType> courseList = new ArrayList<>();
        courseList.add(math.getCourseType());
        courseList.add(english.getCourseType());
        courseList.add(ai.getCourseType());

        // Evaluate all using wildcard method
        System.out.println("== Course Evaluations ==");
        CourseUtils.evaluateAllCourses(courseList);
    }
}

