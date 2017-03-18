package cookle.essync;

import cookle.essync.job.MysqlESSync;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by huseyina on 3/3/2017.
 */
@SpringBootApplication
@EnableElasticsearchRepositories
@EnableJpaRepositories("cookle.core.dao")
@ComponentScan({"cookle.essync.job", "cookle.crawler.model.domain"})
@EntityScan({"cookle.crawler.model.domain","cookle.core.model.domain"})
public class Mysql2ES implements CommandLineRunner {
    @Autowired
    private MysqlESSync mysqlESSync;

    @Override
    public void run(String... strings) throws Exception {
        mysqlESSync.run();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Mysql2ES.class).close();
    }

}
