package ba.sum.fpmoz.optika.repositories;

import ba.sum.fpmoz.optika.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {}