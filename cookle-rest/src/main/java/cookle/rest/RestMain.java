package cookle.rest;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "cookle.core.esdao")
public class RestMain {

    public static void main(String[] args) {
        SpringApplication.run(RestMain.class, args);
    }
}
