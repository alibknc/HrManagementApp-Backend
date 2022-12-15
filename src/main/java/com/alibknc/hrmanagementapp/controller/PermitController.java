package com.alibknc.hrmanagementapp.controller;

import com.alibknc.hrmanagementapp.client.dto.request.CreatePermitRequest;
import com.alibknc.hrmanagementapp.client.dto.response.PermitDto;
import com.alibknc.hrmanagementapp.service.PermitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

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
    public ResponseEntity<Void> createPermit(@Valid @RequestBody CreatePermitRequest permit) {
        permitService.createPermit(permit);
        return ResponseEntity.ok().build();
    }

    @CrossOrigin("http://localhost:3000")
    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deletePermit(@PathVariable UUID id) {
        permitService.deletePermit(id);
    }
}
