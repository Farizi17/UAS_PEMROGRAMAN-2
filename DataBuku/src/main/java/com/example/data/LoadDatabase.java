package com.example.data;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(DataRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Data(1234567L, "12345678","Tengelam Dalam Do'a",
                    "Moh. Syarif", "2014", 200000L )));
            log.info("Preloading" + repository.save(new Data(1234567L, "23564789", "Dalam Selimut Do'aa",
                    "Ahmad Munawar", "2002", 3500000L )));
            log.info("Preloading" + repository.save(new Data(1242465L, "85694123", "Cinta Dalam Do'a",
                    "Zainal Abidin", "2020", 150000L )));
        };
    }
}
