public class Main {

    public static void main(String[] args) {

        Submission s = new Submission("CS101", "public class A {}", "A.java");

        Rubric rubric = new Rubric(28);
        ScoreCalculator calc = new ScoreCalculator(rubric);

        int plagiarism = 60;
        int codeQuality = 80;

        int total = calc.calculate(plagiarism, codeQuality);

        ReportWriter writer = new ReportWriter();
        String file = writer.write(s, plagiarism, codeQuality, total);

        System.out.println("Saved as: " + file);
    }
}