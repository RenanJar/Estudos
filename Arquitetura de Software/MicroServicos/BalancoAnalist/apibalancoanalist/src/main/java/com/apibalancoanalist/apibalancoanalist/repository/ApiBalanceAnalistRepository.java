package com.apibalancoanalist.apibalancoanalist.repository;

import com.apibalancoanalist.apibalancoanalist.model.InformacoesTrimestraisBalancoPatrimonialConsolidado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ApiBalanceAnalistRepository
        extends JpaRepository<InformacoesTrimestraisBalancoPatrimonialConsolidado, Long> {

        @Query(nativeQuery = true, value = "SELECT * " +
                "FROM db_Balanco.tb_itr_balanco_trimestral_consolidado " +
                "where cadastro_cvm = (:cadastroCvm) " +
                "and ordem_exerc = 'ULTIMO'" +
                "and data_referencia = (:dateReference)")
        Optional<List<InformacoesTrimestraisBalancoPatrimonialConsolidado>> findBalanceByCadastroCvm(Long cadastroCvm, String dateReference);


}
