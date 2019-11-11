package com.redefine.quartz.scheduler;

import com.redefine.quartz.utils.StackTraceString;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;

/**
 * @author : Kaustav Sarkar
 * @since : 12/11/2019
 **/
public class QuartzServlet extends HttpServlet {

    private final QuartzScheduler scheduler = QuartzScheduler.QUARTZ_SCHEDULER;

    /**
     * @param servletConfig
     */
    @Override
    public void init(ServletConfig servletConfig) {
        try {
           scheduler.createQuartzInstance();
        } catch (SchedulerException e) {
            log(StackTraceString.getStackTraceString(e));
        }
    }

    @Override
    public void destroy() {
        try {
            scheduler.shutdownQuartzInstance();
        } catch (SchedulerException e) {
            log("Problem while shutting down the scheduler", e);
        }
    }
}
