public class ScoreCalculator {

    private final Rubric rubric;

    public ScoreCalculator(Rubric rubric) {
        this.rubric = rubric;
    }

    public int calculate(int plagiarismScore, int codeQualityScore) {
        return plagiarismScore + codeQualityScore + rubric.getBonus();
    }
}