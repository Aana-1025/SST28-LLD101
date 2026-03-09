public class EvaluationPipeline {

    private final ScoreCalculator calc;
    private final ReportWriter writer;

    public EvaluationPipeline() {
        Rubric rubric = new Rubric(28);
        this.calc = new ScoreCalculator(rubric);
        this.writer = new ReportWriter();
    }

    public void evaluate(Submission s, int plag, int code) {

        int total = calc.calculate(plag, code);

        writer.write(s, plag, code, total);
    }
}