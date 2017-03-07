/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tpa.generic.rest.sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * 
 * NB: the lines @ComponentScan and @EnableMongoRepositories are very important, 
 * to load in the classpath all the generic classes.
 * 
 * @author Alexandre Veremme @ The POC Agency | alex [at] the-poc-agency.com
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.tpa.generic.rest", "com.tpa.generic.tools"})
@EnableMongoRepositories(basePackages = {"com.tpa.generic.rest"})
public class Server implements CommandLineRunner {

    protected static Logger logger = LogManager.getLogger();
        
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Server.class);

        // We launch the server...
        app.run(args);
    }

    @Override
    public void run(String... arg0) {
        logger.debug("Server is ready and online!");
    }
}
