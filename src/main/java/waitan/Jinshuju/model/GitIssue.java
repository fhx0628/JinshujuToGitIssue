package waitan.Jinshuju.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class GitIssue {
    private String title;
    private String body;
    private List<String> assignees;

    public static GitIssue of(String body) {
        GitIssue issue = new GitIssue();
        issue.title =  "create a bug";
        issue.assignees = Arrays.asList("fhx0628");
        issue.body = body;
        return issue;
    }
}
