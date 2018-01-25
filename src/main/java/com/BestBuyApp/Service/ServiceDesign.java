package com.BestBuyApp.Service;

import com.BestBuyApp.Model.Brand;

import java.util.List;

public interface ServiceDesign {
    String createBrand(Brand newBrand);
    List<Brand> showAllBrands();
    Brand getBrand(String id);
    String updateBrand(Brand brand);
    String deleteBrand(String id);
}
