package io.pivotal;

import io.pivotal.domain.City;
import io.pivotal.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CitiesController {

    @Autowired
    CityRepository cityRepository;

    @GetMapping("/city")
    public Optional getCity(@Param("id") String id){
        Long cityId = new Long (1);
        return cityRepository.findById(cityId);
    }
}
