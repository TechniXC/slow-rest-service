package ru.jug.jpoint.fastrestservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.jug.jpoint.fastrestservice.dto.InfoDto;

import static java.lang.Thread.sleep;

@Slf4j
@RestController
public class SlowController {

    @GetMapping("/")
    public ResponseEntity<InfoDto> getInfo() throws InterruptedException {
        sleep(6000);
        return new ResponseEntity<>(new InfoDto("Steady", "Poke"), HttpStatus.OK);
    }
}
