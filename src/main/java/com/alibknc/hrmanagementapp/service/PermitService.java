package com.alibknc.hrmanagementapp.service;

import com.alibknc.hrmanagementapp.client.dto.response.PermitDto;
import com.alibknc.hrmanagementapp.client.dto.mapper.PermitMapper;
import com.alibknc.hrmanagementapp.data.entity.Permit;
import com.alibknc.hrmanagementapp.data.repository.PermitRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Slf4j
@Service
public class PermitService {

    private final PermitRepository permitRepository;
    private final PermitMapper permitMapper;

    public List<PermitDto> getAllPermits() {
        List<Permit> permitList = permitRepository.findAll();

        return permitList.stream()
                .map(permitMapper::toPermitDto)
                .collect(Collectors.toList());
    }

    public PermitDto createPermit(PermitDto permit) {
        permitRepository.save(permitMapper.toPermit(permit));
        return permit;
    }
}
