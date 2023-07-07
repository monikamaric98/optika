package ba.sum.fpmoz.optika.repositories;

import ba.sum.fpmoz.optika.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Long> {}