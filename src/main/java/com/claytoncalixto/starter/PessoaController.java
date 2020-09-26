package com.claytoncalixto.starter;

import com.claytoncalixto.starter.model.Pessoa;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    @RequestMapping(value="/nome-completo", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa getNomePessoa(){
        var pessoa = new Pessoa();
        pessoa.setNome("Clayton Roberto");
        pessoa.setSobrenome("Silva");

        return pessoa;
    }
}
