
package guru.springframework.api.domain;

import java.util.HashMap;
import java.util.Map;

public class Timezone {

    private String offset;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
