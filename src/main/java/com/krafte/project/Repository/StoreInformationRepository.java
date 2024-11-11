package com.krafte.project.Repository;

import org.springframework.data.repository.CrudRepository;
import com.krafte.project.Entity.StoreInformation;

import java.util.List;

public interface StoreInformationRepository extends CrudRepository<StoreInformation, Integer> {
    List<StoreInformation> findByStoreName(String name);
    List<StoreInformation> findByStorePhoneNumber(String phoneNumber);
}
