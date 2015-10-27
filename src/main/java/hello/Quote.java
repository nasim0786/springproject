package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private Value value1;
    private Value value2;

    public Quote() {
    }

    public Value getType() {
        return value1;
    }

    public void setType(Value value1) {
        this.value1 = value1;
    }

    public Value getValue() {
        return value2;
    }

    public void setValue(Value value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + value1 + '\'' +
                ", value=" + value2 +
                '}';
    }
}