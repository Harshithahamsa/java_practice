package com.te.annotationjava.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PetConfig.class,AnimalConfig.class})
public class AllConfigFile {

}
