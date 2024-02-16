package com.csvReaderMicroService.csvReaderMicroService.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
public class CompanyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "cnpj")
    String cnpj;

    @Column(name = "nameCompany")
    String nameCompany;

    @Column(name = "cvmCode")
    Long cvmCode;

    @OneToMany(mappedBy = "company",cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("company")
    List<InformacoesTrimestraisBalancoPatrimonialConsolidado> balancos;

    public CompanyModel(String cnpj, String nameCompany, Long cvmCode) {
        this.cnpj = cnpj;
        this.nameCompany = nameCompany;
        this.cvmCode = cvmCode;
    }
}
