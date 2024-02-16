package com.csvReaderMicroService.csvReaderMicroService.service;

import com.csvReaderMicroService.csvReaderMicroService.Model.CompanyModel;
import com.csvReaderMicroService.csvReaderMicroService.Model.InformacoesTrimestraisBalancoPatrimonialConsolidado;
import com.csvReaderMicroService.csvReaderMicroService.Repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public InformacoesTrimestraisBalancoPatrimonialConsolidado identifyCompany
            (InformacoesTrimestraisBalancoPatrimonialConsolidado informacoesObjeto){

        CompanyModel company=companyRepository
                .findByCvmCode(informacoesObjeto.getCadastroCVM())
                .orElse(companyRepository.save(
                        new CompanyModel(informacoesObjeto.getCnpjCia(),
                                informacoesObjeto.getNomeCia(),
                                informacoesObjeto.getCadastroCVM())
                ));

        informacoesObjeto.setCompany(company);
        return informacoesObjeto;
    }


}
