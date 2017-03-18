package cookle.essync.esdao;

import cookle.essync.esmodel.RecipeEntityES;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by huseyina on 3/3/2017.
 */
public interface RecipeRepositoryES extends ElasticsearchRepository<RecipeEntityES, Integer>, PagingAndSortingRepository<RecipeEntityES, Integer> {
}

