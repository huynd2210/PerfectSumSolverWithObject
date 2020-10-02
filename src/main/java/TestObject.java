import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import perfectsum.ObjectWithInteger;

@AllArgsConstructor
public class TestObject implements ObjectWithInteger {
    public String dummyString;
    public boolean dummyBoolean;
    public Integer testInteger;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.dummyString);
        sb.append(" ");
        sb.append(this.testInteger);
        return sb.toString();
    }

    @Override
    public Integer getInteger() {
        return this.testInteger;
    }
}
