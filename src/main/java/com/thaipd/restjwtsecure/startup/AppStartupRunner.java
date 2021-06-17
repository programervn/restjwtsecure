package com.thaipd.restjwtsecure.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartupRunner implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppStartupRunner.class);
    public static int counter;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.debug("Application started with option names : {}", args.getOptionNames());
        logger.debug("*** AppStartupRunner was called");
    }
}
