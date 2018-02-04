package com.BestBuyApp.Service;

import com.BestBuyApp.Model.Brand;
import com.BestBuyApp.Repository.RepositoryDesign;
import com.BestBuyApp.exceptions.BadRequestException;
import com.BestBuyApp.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService implements ServiceDesign {

    @Autowired
    RepositoryDesign repositoryAccess;

    @Override
    public String createBrand(Brand newBrand) {

        //try catch
        if(repositoryAccess.createBrand(newBrand))
            return "Brand Created successfully";
        else
            throw new BadRequestException("Invalid Brand Creation");

    }

    @Override
    public List<Brand> showAllBrands() {
         return repositoryAccess.showAllBrands();
    }

    @Override
    public Brand getBrand(String id) {
        Brand brand = repositoryAccess.getBrand(id);
        if(brand!=null)
            return brand;
        else
            throw new ResourceNotFoundException("No brand with ID:" + id);
    }

    @Override
    public String updateBrand(Brand brand) {
        if(repositoryAccess.updateBrand(brand))
            return "Brand"+ brand.get_id() +"data Updated";
        else
            throw new ResourceNotFoundException("No brand with ID:" + brand.get_id());
    }

    @Override
    public String deleteBrand(String id) {
        if(repositoryAccess.deleteBrand(id))
            return "Brand with Id:"+ id+" deleted !!";
        else
            throw new ResourceNotFoundException("No brand with ID:" + id);
    }
}
