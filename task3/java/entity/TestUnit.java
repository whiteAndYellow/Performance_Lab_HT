package entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestUnit {
    private int id;
    private String title;
    private String value;
    private List<TestUnit> values;

    public TestUnit() {
    }


    public TestUnit( int id, String title, String value, List<TestUnit> values) {
        this.id = id;
        this.title = title;
        this.value = value;
        this.values = values;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<TestUnit> getValues() {
        return values;
    }

    public void setValues(List<TestUnit> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "entity.TestUnit{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", value='" + value + '\'' +
                ", values=" + values +
                '}';
    }
}
