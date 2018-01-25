package com.BestBuyApp.Controller;

import com.BestBuyApp.Model.Brand;
import com.BestBuyApp.Service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController(value = "/")
public class BrandController implements ControllerDesign  {

    @Autowired
    BrandService brandService;


    @Override
    @PostMapping(value = "/create")
    public String createBrand(@RequestBody Brand newBrand) {
        System.out.println("******************"+newBrand.get_id() + newBrand.get_name());
         return brandService.createBrand(newBrand);
    }

    @Override
    @GetMapping(value = "/")
    public List<Brand> showAllBrands() {
        return brandService.showAllBrands();
    }

    @Override
    @GetMapping(value = "/getBrand={id}")
    public Brand getBrand(@PathVariable("id")String id) {
        return brandService.getBrand(id);
    }

    @Override
    @PostMapping(value = "/update")
    public String updateBrand(@RequestBody Brand brand) {
        return brandService.updateBrand(brand);
    }

    @Override
    @PostMapping(value = "/deleteBrand={id}")
    public String deleteBrand(@PathVariable("id")String id) {
        return brandService.deleteBrand(id);
    }
}
