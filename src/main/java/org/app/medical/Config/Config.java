//package org.app.medical.Config;
//
//
//import org.app.medical.Model.Gen;
//import org.app.medical.Repository.GenRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class Config {
//
//    @Bean
//    CommandLineRunner commandLineRunner(GenRepository genRepository){
//        return args -> {
//            Gen gen = Gen.builder()
//                    .ensembl_ID("34ergdfwe234")
//                    .build();
//
//            genRepository.save(gen);
//        };
//    }
//}
