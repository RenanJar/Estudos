package com.example.Teste.unzippersist.Repository;

import com.example.Teste.unzippersist.Model.InformacoesTrimestraisBalancoPatrimonialConsolidado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformacoesTrimestraisBalancoPatrimonialConsolidadoRepository
        extends JpaRepository<InformacoesTrimestraisBalancoPatrimonialConsolidado,Long> {
}
