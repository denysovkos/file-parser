package Matchers;

public class Result {
    public Integer lineOffset;
    public Integer charOffset;

    public Result(Integer lineOffset, Integer charOffset) {
        this.lineOffset = lineOffset;
        this.charOffset = charOffset;
    }

    @Override
    public String toString() {
        return "[lineOffset=" + this.lineOffset + ", " + "charOffset=" + this.charOffset+"]";
    }
}
