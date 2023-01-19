package br.com.project.shopping.repositories;

import br.com.project.shopping.models.ShoppingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShoppingRepository extends JpaRepository<ShoppingModel, UUID> {
}
