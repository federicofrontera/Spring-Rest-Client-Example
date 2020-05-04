package guru.springframework.api.domain;

import java.util.List;

public class UserData {
    List<User> results;

    public List<User> getResults() {
        return results;
    }

    public void setResults(List<User> results) {
        this.results = results;
    }
}
