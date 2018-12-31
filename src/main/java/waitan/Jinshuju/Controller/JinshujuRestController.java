package waitan.Jinshuju.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import waitan.Jinshuju.command.JinshujuSheetCommand;

@Slf4j
@RestController
@RequestMapping("/api")
public class JinshujuRestController {

    @PostMapping("/jinshuju/sheet")
    public ResponseEntity getJinshujuSheet(@RequestBody JinshujuSheetCommand sheet) {
        log.info(sheet.getEntry().toString());
        return ResponseEntity.ok().build();
    }
}
