package com.renanmuniz.webhook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {

    @PostMapping("/risk/feedzai/transaction/response")
    public String asyncRiskAnalysis(@RequestBody String payload) {
      log.info("payload recebido: " + payload);
      return payload;
    }

}
