package com.BestBuyApp.Repository;

import com.BestBuyApp.Model.Brand;

import java.util.List;

public interface RepositoryDesign {

    boolean createBrand(Brand newBrand);
    List<Brand> showAllBrands();
    Brand getBrand(String id);
    boolean updateBrand(Brand brand);
    boolean deleteBrand(String id);
}
