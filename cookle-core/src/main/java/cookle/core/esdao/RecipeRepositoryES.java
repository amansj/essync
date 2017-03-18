package cookle.core.esdao;

import cookle.core.esmodel.RecipeEntityES;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by huseyina on 3/3/2017.
 */
public interface RecipeRepositoryES extends ElasticsearchRepository<RecipeEntityES, Integer>, PagingAndSortingRepository<RecipeEntityES, Integer> {
    List<RecipeEntityES> findByName(String name);
}

