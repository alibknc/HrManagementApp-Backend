package com.alibknc.hrmanagementapp.controller;

import com.alibknc.hrmanagementapp.client.dto.response.PermitDto;
import com.alibknc.hrmanagementapp.service.PermitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/v1/permits")
public class PermitController {

    private final PermitService permitService;

    public PermitController(PermitService permitService) {
        this.permitService = permitService;
    }

    @GetMapping
    public ResponseEntity<List<PermitDto>> getAllPermits() {
        return ResponseEntity.ok(permitService.getAllPermits());
    }

    @PostMapping
    public ResponseEntity<Object> createPermit(@Valid @RequestBody PermitDto permit) {
        return ResponseEntity.ok(permitService.createPermit(permit));
    }
}
