package com.apibalancoanalist.apibalancoanalist.controller;

import com.apibalancoanalist.apibalancoanalist.model.InformacoesTrimestraisBalancoPatrimonialConsolidado;
import com.apibalancoanalist.apibalancoanalist.repository.ApiBalanceAnalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/apibalanceanalist")
public class ApiBalanceAnalistController {

    @Autowired
    ApiBalanceAnalistRepository apiBalanceAnalistRepository;

    @GetMapping
    public ResponseEntity<List<InformacoesTrimestraisBalancoPatrimonialConsolidado>> buscarbalanco(){
        return ResponseEntity.ok(apiBalanceAnalistRepository.findBalanceByCadastroCvm(80209L,"2022-03-31").orElse(Collections.emptyList()));
    }




}
