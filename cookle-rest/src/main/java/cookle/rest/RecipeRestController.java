package cookle.rest;

import cookle.core.esdao.RecipeRepositoryES;
import cookle.core.esmodel.RecipeEntityES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RecipeRestController {

    @Autowired
    private RecipeRepositoryES recipeRepositoryES;

    @RequestMapping("/recipe/by-name")
    public List<RecipeEntityES> greeting(@RequestParam(value = "name", defaultValue = "pasta") String name) {
        String nameTmp=name.toString()+"";
        System.out.print(nameTmp.length());
        return recipeRepositoryES.findByName(nameTmp);
    }

    @RequestMapping("/recipe/all")
    public List<RecipeEntityES> greeting() {
        List<RecipeEntityES> list = new ArrayList<>();
        //recipeRepositoryES.findAll().forEach(list::add);
        for(RecipeEntityES re:recipeRepositoryES.findAll())
            list.add(re);
        return list;
    }
}
