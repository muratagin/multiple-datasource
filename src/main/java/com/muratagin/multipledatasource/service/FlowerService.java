package com.muratagin.multipledatasource.service;

import com.muratagin.multipledatasource.aspect.DataSource;
import com.muratagin.multipledatasource.entity.Flower;
import com.muratagin.multipledatasource.repository.FlowerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FlowerService {

    private FlowerRepository flowerRepository;

    @DataSource("second")
    public List<Flower> getAllFlowers() {
        return flowerRepository.findAll();
    }
}
