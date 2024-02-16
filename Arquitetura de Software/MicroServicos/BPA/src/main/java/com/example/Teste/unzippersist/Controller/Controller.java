package com.example.Teste.unzippersist.Controller;

import com.example.Teste.unzippersist.Service.ServiceDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

@RestController
@RequestMapping("/teste")

public class Controller {

    @Autowired
    ServiceDados serviceDados;

    @GetMapping
    public void teste() throws IOException {
        serviceDados.leitorCsv(serviceDados.leitorZip());
    }



}
