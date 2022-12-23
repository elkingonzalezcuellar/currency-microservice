package com.fxservice.controller;

import com.fxservice.entity.Fxrate;
import com.fxservice.service.FxrateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fxrates")
public class FxrateController {

    @Autowired
    private FxrateService fxrateService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<Fxrate> getAll(){
        return fxrateService.getAll();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public Fxrate create(@RequestBody Fxrate fx){
        return fxrateService.create(fx);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping
    public Fxrate update(@RequestBody Fxrate fx){
        return fxrateService.update(fx);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping
    public void delete(@RequestBody Fxrate fx){
        fxrateService.delete(fx);
    }


}
