package com.redefine.quartz.scheduler;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author : Kaustav Sarkar
 * @since : 12/11/2019
 **/
public enum QuartzScheduler {
    QUARTZ_SCHEDULER;
    QuartzScheduler() {

    }
    private Scheduler scheduler;

    public void createQuartzInstance() throws SchedulerException {
        scheduler = StdSchedulerFactory.getDefaultScheduler();
    }

    public void startQuartzInstance() throws SchedulerException {
        scheduler.start();
    }

    public void shutdownQuartzInstance() throws SchedulerException {
        scheduler.shutdown();
    }


}
