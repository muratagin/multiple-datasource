package com.muratagin.multipledatasource.controller;

import com.muratagin.multipledatasource.entity.Bug;
import com.muratagin.multipledatasource.entity.Flower;
import com.muratagin.multipledatasource.entity.Season;
import com.muratagin.multipledatasource.service.BugService;
import com.muratagin.multipledatasource.service.FlowerService;
import com.muratagin.multipledatasource.service.SeasonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class TestController {

    private BugService bugService;
    private FlowerService flowerService;
    private SeasonService seasonService;

    @GetMapping("/bugs")
    public List<Bug> getBugs() {
        return bugService.getAllBugs();
    }

    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        return flowerService.getAllFlowers();
    }

    @GetMapping("/seasons")
    public List<Season> getSeasons() {
        return seasonService.getAllSeasons();
    }
}
