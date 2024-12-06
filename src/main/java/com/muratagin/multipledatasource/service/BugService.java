package com.muratagin.multipledatasource.service;

import com.muratagin.multipledatasource.aspect.DataSource;
import com.muratagin.multipledatasource.entity.Bug;
import com.muratagin.multipledatasource.repository.BugRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BugService {

    private BugRepository bugRepository;

    @DataSource("first")
    public List<Bug> getAllBugs() {
        return bugRepository.findAll();
    }
}
