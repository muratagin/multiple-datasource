package com.muratagin.multipledatasource.service;

import com.muratagin.multipledatasource.aspect.DataSource;
import com.muratagin.multipledatasource.entity.Season;
import com.muratagin.multipledatasource.repository.SeasonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SeasonService {

    private SeasonRepository seasonRepository;

    @DataSource("third")
    public List<Season> getAllSeasons() {
        return seasonRepository.findAll();
    }
}
