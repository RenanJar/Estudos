package com.example.Teste.unzippersist.Model;

import com.example.Teste.unzippersist.Repository.ArquivoStrategy;
import lombok.Getter;
import lombok.Setter;
import net.sf.jsefa.csv.annotation.CsvDataType;
import net.sf.jsefa.csv.annotation.CsvField;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Setter
@Getter
@Table(name = "tb_ItrBalancoTrimestralConsolidado")
@CsvDataType(name = "InformacoesTrimestraisBalancoPatrimonialConsolidado")
public class InformacoesTrimestraisBalancoPatrimonialConsolidado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CNPJ")
    @CsvField(pos=1)
    private String cnpjCia;

    @Column(name = "DataReferencia")
    @CsvField(pos=2)
    private String dataRefer;

    @Column(name = "versao")
    @CsvField(pos=3)
    private Long versao;

    @Column(name = "nomeCia")
    @CsvField(pos=4)
    private String nomeCia;

    @Column(name = "cadastroCvm")
    @CsvField(pos=5)
    private Long cadastroCVM;

    @Column(name = "grupoDfp")
    @CsvField(pos=6)
    private String grupoDfp;

    @Column(name = "moeda")
    @CsvField(pos=7)
    private String moeda;

    @Column(name = "escalaMoeda")
    @CsvField(pos=8)
    private String escalaMoeda;

    @Column(name = "ordemExerc")
    @CsvField(pos=9)
    private String ordemExerc;

    @Column(name = "dataFimExercicio")
    @CsvField(pos=10)
    private String dataFimExercicio;

    @Column(name = "codigoConta")
    @CsvField(pos=11)
    private String codigoConta;

    @Column(name="descricaoConta")
    @CsvField(pos=12)
    private String descricaoConta;

    @Column(name = "valorConta")
    @CsvField(pos=13)
    private BigDecimal valorConta;

    @Column(name = "contaFixa")
    @CsvField(pos=14)
    private String contaFixa;





    public InformacoesTrimestraisBalancoPatrimonialConsolidado() {
    }

    public InformacoesTrimestraisBalancoPatrimonialConsolidado(Long id, String cnpjCia,
                                                               String dataRefer, Long versao,String nomeCia,
                                                               Long cadastroCVM, String grupoDfp, String moeda,
                                                               String escalaMoeda, String ordemExerc, String dataFimExercicio,
                                                               String codigoConta,String descricaoConta, BigDecimal valorConta, String contaFixa) {
        this.id = id;
        this.cnpjCia = cnpjCia;
        this.dataRefer = dataRefer;
        this.versao = versao;
        this.nomeCia = nomeCia;
        this.cadastroCVM = cadastroCVM;
        this.grupoDfp = grupoDfp;
        this.moeda = moeda;
        this.escalaMoeda = escalaMoeda;
        this.ordemExerc = ordemExerc;
        this.dataFimExercicio = dataFimExercicio;
        this.codigoConta = codigoConta;
        this.descricaoConta = descricaoConta;
        this.valorConta = valorConta;
        this.contaFixa = contaFixa;
    }
}
