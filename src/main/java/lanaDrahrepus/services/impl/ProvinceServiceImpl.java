package lanaDrahrepus.services.impl;

import lanaDrahrepus.model.Province;
import lanaDrahrepus.repository.ProvinceRepo;
import lanaDrahrepus.services.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    ProvinceRepo provinceRepo;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepo.findAll();
    }

    @Override
    public Province findById(Integer id) {
        return provinceRepo.findOne(id);
    }

    @Override
    public void save(Province province) {
        provinceRepo.save(province);
    }

    @Override
    public void remove(Integer id) {
        provinceRepo.delete(id);
    }
}
