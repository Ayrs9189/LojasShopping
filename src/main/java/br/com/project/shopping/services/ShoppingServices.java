package br.com.project.shopping.services;

import br.com.project.shopping.models.ShoppingModel;
import br.com.project.shopping.repositories.ShoppingRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingServices {

    final ShoppingRepository shoppingRepository;

    public ShoppingServices(ShoppingRepository shoppingRepository) {
        this.shoppingRepository = shoppingRepository;
    }

    @Transactional
    public ShoppingModel save(ShoppingModel shoppingModel) {
        return shoppingRepository.save(shoppingModel);

    }
    public List<ShoppingModel> findAll() {
        return shoppingRepository.findAll();

    }
}
