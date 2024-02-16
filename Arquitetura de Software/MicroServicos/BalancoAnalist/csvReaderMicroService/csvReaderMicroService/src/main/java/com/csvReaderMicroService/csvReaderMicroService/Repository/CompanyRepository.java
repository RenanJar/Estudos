package com.csvReaderMicroService.csvReaderMicroService.Repository;

import com.csvReaderMicroService.csvReaderMicroService.Model.CompanyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyModel, Long> {

    public Optional<CompanyModel> findByCvmCode(Long cvmCode);


}
