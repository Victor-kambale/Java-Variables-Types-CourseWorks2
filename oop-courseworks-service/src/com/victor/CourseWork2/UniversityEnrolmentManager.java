package com.victor.CourseWork2;

public class UniversityEnrolmentManager {

    public static int absoluteGlobalEnrolment = 0;

    public String trackedCourseName;
    public int courseRegisteredCount;

    public UniversityEnrolmentManager(String trackedCourseName, int courseRegisteredCount) {
        this.trackedCourseName = trackedCourseName;
        this.courseRegisteredCount = courseRegisteredCount;
        absoluteGlobalEnrolment += courseRegisteredCount;
    }

    public void evaluatePerformance(double targetPassRate) {
        double anticipatedPassingStudents = (this.courseRegisteredCount * targetPassRate) / 100.0;

        System.out.println("---------------------------------------------------------");
        System.out.println(" Registered Module : " + this.trackedCourseName);
        System.out.println(" Active Count      : " + this.courseRegisteredCount +
                " Registered Students");
        System.out.println(" Pass Projections   : " + (int) anticipatedPassingStudents +
                " Expected to Pass (" + targetPassRate + "%)");
    }

    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------");
        System.out.println(" IUEA CENTRALIZED COURSEWORK 2 ACADEMIC ENROLMENT REGISTRY ");
        System.out.println("---------------------------------------------------------");

        UniversityEnrolmentManager classOne = new UniversityEnrolmentManager(
                "Applied Object-Oriented Programming", 55);
        UniversityEnrolmentManager classTwo = new UniversityEnrolmentManager(
                "Data Structures & Algorithms", 48);
        UniversityEnrolmentManager classThree = new UniversityEnrolmentManager(
                "Responsive Web Design", 62);

        System.out.println(" RUNNING LOCAL INSTANCE METRICS EVALUATION STACKS ");
        classOne.evaluatePerformance(85.0);
        classTwo.evaluatePerformance(78.5);
        classThree.evaluatePerformance(92.3);

        System.out.println("---------------------------------------------------------");
        System.out.println(" COMBINED UNIVERSITY-WIDE ADMINISTRATIVE ANALYTICS SUMMARY: ");
        System.out.println(" Cumulative Global For Enrollment Total: "
                + UniversityEnrolmentManager.absoluteGlobalEnrolment +
                " Students Total");
        System.out.println("---------------------------------------------------------");
    }
}