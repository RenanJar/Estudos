package com.cambio.cambioservice.Controler;

import com.cambio.cambioservice.Model.CambioModel;
import com.cambio.cambioservice.repository.CambioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;

@RestController
@RequestMapping("/cambio-service")
public class CambioController {

    @Autowired
    private Environment environment;

    @Autowired
    private CambioRepository repository;

    @GetMapping(value = "/{amount}/{from}/{to}")
    public CambioModel getcambio(
            @PathVariable ("amount") BigDecimal amount,
            @PathVariable ("from") String from,
            @PathVariable ("to") String to
    ){

        var cambio = repository.findByFromAndTo(from,to);
        if(cambio == null)throw new RuntimeException("Currency Unsupported");

        var port= environment.getProperty("local.server.port");
        cambio.setEnvironment(port);
        BigDecimal conversionFactor = cambio.getConversionFactor();
        BigDecimal convertedValue = conversionFactor.multiply(amount);
        cambio.setConvertedValue(convertedValue.setScale(2, RoundingMode.CEILING));
        cambio.setEnvironment(port);
        return cambio;
    }


}
