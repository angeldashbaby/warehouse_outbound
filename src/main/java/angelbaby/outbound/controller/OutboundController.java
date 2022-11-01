package angelbaby.outbound.controller;

import angelbaby.outbound.services.OutboundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.ParseException;

@RestController
@RequestMapping("/api/outbound")
public class OutboundController {

    @Autowired
    private OutboundService service;

    @GetMapping
    public String getOutboundList() {
        try {
            return service.getOutboundList().toString();
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping
    public String postOutbound(@RequestBody String payload) {
        try {
            return service.postOutbound(payload);
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }





}
