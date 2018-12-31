package waitan.Jinshuju.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import waitan.Jinshuju.application.JinshujuSheetCommandHandler;
import waitan.Jinshuju.command.JinshujuSheetCommand;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class JinshujuRestController {
    private final JinshujuSheetCommandHandler jinshujuSheetCommandHandler;

    @PostMapping("/jinshuju/sheet")
    public ResponseEntity getJinshujuSheet(@RequestBody JinshujuSheetCommand command) {
        log.info(command.getEntry().toString());
        return jinshujuSheetCommandHandler.handle(command);
    }
}
