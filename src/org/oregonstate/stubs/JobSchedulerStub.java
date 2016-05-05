package org.oregonstate.stubs;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;

import java.util.List;

/**
 * @author Denis Bogdanas <bogdanad@oregonstate.edu> Created on 5/4/2016.
 */
public class JobSchedulerStub extends JobScheduler {
    @Override
    public int schedule(JobInfo jobInfo) {
        return 0;
    }

    @Override
    public void cancel(int i) {

    }

    @Override
    public void cancelAll() {

    }

    @Override
    public List<JobInfo> getAllPendingJobs() {
        return null;
    }
}
