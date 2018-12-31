package waitan.Jinshuju.application;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import waitan.Jinshuju.command.JinshujuSheetCommand;
import waitan.Jinshuju.model.GitIssue;

@Service
@RequiredArgsConstructor
public class JinshujuSheetCommandHandler {

    @Value("${git.token}")
    private String token;

    @Value("${git.url}")
    private String url;

    public ResponseEntity handle(JinshujuSheetCommand command) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", token);
        GitIssue issue = GitIssue.of(command.getEntry().getField_1());
        HttpEntity request = new HttpEntity(issue, headers);
        return restTemplate.postForEntity(url, request, HttpEntity.class);
    }
}
