public class ReportWriter {

    public String write(Submission s, int plagiarism, int codeQuality, int totalScore) {

        String filename = "report-" + s.roll + ".txt";

        System.out.println("=== Report ===");
        System.out.println("Student Roll: " + s.roll);
        System.out.println("File: " + s.filename);
        System.out.println("Plagiarism Score: " + plagiarism);
        System.out.println("Code Quality Score: " + codeQuality);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Saved as: " + filename);

        return filename;
    }
}