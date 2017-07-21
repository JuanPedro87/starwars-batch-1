package com.starwars.batch.processor;

import com.starwars.batch.domain.People;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;

/**
 * Created by jpcs1 on 21/07/17.
 */
public class PeopleProcessor implements ItemProcessor<People,People>{

    public static final String NA_GREANDER = "n/a";
    public static final String DROID_GENDER = "droid";

    @Override
    public People process(People people) throws Exception {
        if(NA_GREANDER.equalsIgnoreCase(people.getGender())) {
            people.setGender(DROID_GENDER);
        }
        return people;
    }



}
