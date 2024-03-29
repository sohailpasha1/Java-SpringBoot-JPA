package com.service.impl;

import com.repository.TouristRepository;
import com.entity.Tourist;
import com.exception.AgeLimitException;
import com.service.TouristService;
import com.utils.ConstantUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class TouristServiceImpl implements TouristService {

    @Autowired
    private TouristRepository touristRepo;

    @Override
    public Tourist saveTouristDetails(Tourist tourist) throws AgeLimitException {
        if (tourist.getAge() > 90) {
            throw new AgeLimitException(ConstantUtils.AGE_LIMIT_MESSAGE);
        }
        return touristRepo.save(tourist);;
    }

     @Override
    public void deleteTouristByIdService(Long id) {
        repo.deleteById(id);
    }

    @Override
    public ResponseEntity<Tourist> fetchTouristByIdService(Long id) {
        return new ResponseEntity<>(repo.findById(id).get(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Tourist>> fetchTouristByNameService(String name) {
        return new ResponseEntity<>(repo.findByName(name), HttpStatus.OK);
    }
}
