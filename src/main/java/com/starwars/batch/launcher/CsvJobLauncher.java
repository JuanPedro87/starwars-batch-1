package com.starwars.batch.launcher;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by jpcs1 on 21/07/17.
 */
@Component
public class CsvJobLauncher {
    private JobLauncher jobLauncher;
    private Job csvJob;

    public CsvJobLauncher(JobLauncher jobLauncher,Job csvJob) {
        this.jobLauncher = jobLauncher;
        this.csvJob = csvJob;
    }

    @Scheduled(fixedDelay = 15000)
    public void run() throws Exception {

        JobParameters jobParameter = new JobParametersBuilder().addLong("time", System.currentTimeMillis()).toJobParameters();

        jobLauncher.run(csvJob, new JobParameters());
    }
}
