package JavaGenerics;
import java.util.*;

// ===== Abstract Base Class for Job Roles =====
abstract class JobRole {
    private String title;

    public JobRole(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void evaluateResume();
}

// ===== Concrete Job Roles =====
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    public void evaluateResume() {
        System.out.println(getTitle() + ": Resume screened for Java, DSA, and System Design.");
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }

    @Override
    public void evaluateResume() {
        System.out.println(getTitle() + ": Resume screened for Python, ML, and Data Analysis.");
    }
}

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public void evaluateResume() {
        System.out.println(getTitle() + ": Resume screened for Product Strategy and Communication Skills.");
    }
}

// ===== Generic Resume Class =====
class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public void processResume() {
        jobRole.evaluateResume();
    }
}

// ===== Utility Class with Wildcard Method =====
class ResumeProcessor {
    public static void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole role : resumes) {
            role.evaluateResume();
        }
    }
}

// ===== Main Application Class =====
public class ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer());
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist());
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager());

        // Individual processing
        System.out.println("== Individual Resume Processing ==");
        seResume.processResume();
        dsResume.processResume();
        pmResume.processResume();

        // Batch screening using wildcard method
        List<JobRole> resumeList = new ArrayList<>();
        resumeList.add(new SoftwareEngineer());
        resumeList.add(new DataScientist());
        resumeList.add(new ProductManager());

        System.out.println("\n== Batch Resume Screening ==");
        ResumeProcessor.screenResumes(resumeList);
    }
}


