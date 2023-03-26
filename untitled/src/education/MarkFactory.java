package education;

public class MarkFactory {
    public Mark createMark(MarkType markType) {
        Mark mark = null;
        switch (markType) {
            case EXAM:
                mark = new MarkExam();
                break;
            case MODULE:
                mark = new MarkModule();
                break;
            case SEMINAR:
                mark = new MarkSeminar();
                break;
            case SEMESTER:
                mark = new MarkSemester();
                break;

        }
        return mark;
    }
}
