package com.alibknc.hrmanagementapp.controller;

import com.alibknc.hrmanagementapp.client.dto.response.PermitDto;
import com.alibknc.hrmanagementapp.service.PermitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

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
}
