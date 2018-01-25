package com.BestBuyApp.Repository;

import com.BestBuyApp.Model.Brand;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@Repository
public class BrandsRepository implements RepositoryDesign {


    HashMap<String,Brand> brandsStore = new HashMap<>();

    public BrandsRepository(){
        Brand brand1 = new Brand("1","BestBuy","Hello from BestBuy");
        Brand brand2 = new Brand("2","BestBuy1","Hello from BestBuy1");
        brandsStore.put("1",brand1);
        brandsStore.put("2",brand2);
    }

    @Override
    public boolean createBrand(Brand newBrand) {
        Brand brand = new Brand(brandsStore.size()+"",newBrand.get_name(),newBrand.get_description());
        if(brand!=null){
            brandsStore.put(brandsStore.size()+1+"",newBrand);
            return true;
        }
        return false;
    }

    @Override
    public List<Brand> showAllBrands() {
        List<Brand> brandsList = new LinkedList<>(brandsStore.values());
        return brandsList;
    }

    @Override
    public Brand getBrand(String id) {
        if(brandsStore.containsKey(id))
            return brandsStore.get(id);
        else
            return null;
    }

    @Override
    public boolean updateBrand(Brand brand) {
        if(brandsStore.containsKey(brand.get_id())){
            brandsStore.put(brand.get_id(),brand);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteBrand(String id) {
        if(brandsStore.containsKey(id)){
            brandsStore.remove(id);
            return true;
        }
        return false;
    }
}
