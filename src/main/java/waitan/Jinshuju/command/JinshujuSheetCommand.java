package waitan.Jinshuju.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class JinshujuSheetCommand {
    private String form;
    private String form_name;
    private GitIssueEntryCommand entry;
}
