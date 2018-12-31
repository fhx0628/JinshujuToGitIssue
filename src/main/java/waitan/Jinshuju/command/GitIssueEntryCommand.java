package waitan.Jinshuju.command;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
public class GitIssueEntryCommand {
    private Integer serial_number;
    private String field_1;
    private String field_2;
    private String field_4;
    private String creator_name;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private String info_remote_ip;
}
