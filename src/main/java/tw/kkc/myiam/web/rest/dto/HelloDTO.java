package tw.kkc.myiam.web.rest.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class HelloDTO implements Serializable {

    @Serial private static final long serialVersionUID = 1686005763188157911L;

    private String name;

    private Long id;

    public HelloDTO() {
        // Empty constructor needed for Jackson.
    }

    public HelloDTO(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HelloDTO)) {
            return false;
        }
        return id != null && id.equals(((HelloDTO) o).id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.id);
    }
}
