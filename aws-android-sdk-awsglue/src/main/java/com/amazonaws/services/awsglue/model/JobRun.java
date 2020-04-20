/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a job run.
 * </p>
 */
public class JobRun implements Serializable {
    /**
     * <p>
     * The ID of this job run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String id;

    /**
     * <p>
     * The number of the attempt to run this job.
     * </p>
     */
    private Integer attempt;

    /**
     * <p>
     * The ID of the previous run of this job. For example, the
     * <code>JobRunId</code> specified in the <code>StartJobRun</code> action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String previousRunId;

    /**
     * <p>
     * The name of the trigger that started this job run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String triggerName;

    /**
     * <p>
     * The name of the job definition being used in this run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String jobName;

    /**
     * <p>
     * The date and time at which this job run was started.
     * </p>
     */
    private java.util.Date startedOn;

    /**
     * <p>
     * The last time that this job run was modified.
     * </p>
     */
    private java.util.Date lastModifiedOn;

    /**
     * <p>
     * The date and time that this job run completed.
     * </p>
     */
    private java.util.Date completedOn;

    /**
     * <p>
     * The current state of the job run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     */
    private String jobRunState;

    /**
     * <p>
     * The job arguments associated with this run. For this job run, they
     * replace the default arguments set in the job definition itself.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script
     * consumes, as well as arguments that AWS Glue itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own job arguments,
     * see the <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html"
     * >Calling AWS Glue APIs in Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the key-value pairs that AWS Glue consumes to set
     * up your job, see the <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html"
     * >Special Parameters Used by AWS Glue</a> topic in the developer guide.
     * </p>
     */
    private java.util.Map<String, String> arguments;

    /**
     * <p>
     * An error message associated with this job run.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * A list of predecessors to this job run.
     * </p>
     */
    private java.util.List<Predecessor> predecessorRuns;

    /**
     * <p>
     * This field is deprecated. Use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) allocated to this
     * JobRun. From 2 to 100 DPUs can be allocated; the default is 10. A DPU is
     * a relative measure of processing power that consists of 4 vCPUs of
     * compute capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     */
    private Integer allocatedCapacity;

    /**
     * <p>
     * The amount of time (in seconds) that the job run consumed resources.
     * </p>
     */
    private Integer executionTime;

    /**
     * <p>
     * The <code>JobRun</code> timeout in minutes. This is the maximum time that
     * a job run can consume resources before it is terminated and enters
     * <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * This overrides the timeout value set in the parent job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer timeout;

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that can be allocated
     * when this job runs. A DPU is a relative measure of processing power that
     * consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/https:/aws.amazon.com/glue/pricing/"
     * >AWS Glue pricing page</a>.
     * </p>
     * <p>
     * Do not set <code>Max Capacity</code> if using <code>WorkerType</code> and
     * <code>NumberOfWorkers</code>.
     * </p>
     * <p>
     * The value that can be allocated for <code>MaxCapacity</code> depends on
     * whether you are running a Python shell job or an Apache Spark ETL job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify a Python shell job (<code>JobCommand.Name</code>=
     * "pythonshell"), you can allocate either 0.0625 or 1 DPU. The default is
     * 0.0625 DPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you specify an Apache Spark ETL job (<code>JobCommand.Name</code>=
     * "glueetl"), you can allocate from 2 to 100 DPUs. The default is 10 DPUs.
     * This job type cannot have a fractional DPU allocation.
     * </p>
     * </li>
     * </ul>
     */
    private Double maxCapacity;

    /**
     * <p>
     * The type of predefined worker that is allocated when a job runs. Accepts
     * a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU,
     * 16 GB of memory and a 50GB disk, and 2 executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB
     * of memory and a 64GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB
     * of memory and a 128GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     */
    private String workerType;

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are
     * allocated when a job runs.
     * </p>
     * <p>
     * The maximum number of workers you can define are 299 for
     * <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     */
    private Integer numberOfWorkers;

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used
     * with this job run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String securityConfiguration;

    /**
     * <p>
     * The name of the log group for secure logging that can be server-side
     * encrypted in Amazon CloudWatch using AWS KMS. This name can be
     * <code>/aws-glue/jobs/</code>, in which case the default encryption is
     * <code>NONE</code>. If you add a role name and
     * <code>SecurityConfiguration</code> name (in other words,
     * <code>/aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/</code>),
     * then that security configuration is used to encrypt the log group.
     * </p>
     */
    private String logGroupName;

    /**
     * <p>
     * Specifies configuration properties of a job run notification.
     * </p>
     */
    private NotificationProperty notificationProperty;

    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS
     * Glue supports. The Python version indicates the version supported for
     * jobs of type Spark.
     * </p>
     * <p>
     * For more information about the available AWS Glue versions and
     * corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue
     * version</a> in the developer guide.
     * </p>
     * <p>
     * Jobs that are created without specifying a Glue version default to Glue
     * 0.9.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^\w+\.\w+$<br/>
     */
    private String glueVersion;

    /**
     * <p>
     * The ID of this job run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The ID of this job run.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of this job run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param id <p>
     *            The ID of this job run.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of this job run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param id <p>
     *            The ID of this job run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The number of the attempt to run this job.
     * </p>
     *
     * @return <p>
     *         The number of the attempt to run this job.
     *         </p>
     */
    public Integer getAttempt() {
        return attempt;
    }

    /**
     * <p>
     * The number of the attempt to run this job.
     * </p>
     *
     * @param attempt <p>
     *            The number of the attempt to run this job.
     *            </p>
     */
    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    /**
     * <p>
     * The number of the attempt to run this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attempt <p>
     *            The number of the attempt to run this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withAttempt(Integer attempt) {
        this.attempt = attempt;
        return this;
    }

    /**
     * <p>
     * The ID of the previous run of this job. For example, the
     * <code>JobRunId</code> specified in the <code>StartJobRun</code> action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The ID of the previous run of this job. For example, the
     *         <code>JobRunId</code> specified in the <code>StartJobRun</code>
     *         action.
     *         </p>
     */
    public String getPreviousRunId() {
        return previousRunId;
    }

    /**
     * <p>
     * The ID of the previous run of this job. For example, the
     * <code>JobRunId</code> specified in the <code>StartJobRun</code> action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param previousRunId <p>
     *            The ID of the previous run of this job. For example, the
     *            <code>JobRunId</code> specified in the
     *            <code>StartJobRun</code> action.
     *            </p>
     */
    public void setPreviousRunId(String previousRunId) {
        this.previousRunId = previousRunId;
    }

    /**
     * <p>
     * The ID of the previous run of this job. For example, the
     * <code>JobRunId</code> specified in the <code>StartJobRun</code> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param previousRunId <p>
     *            The ID of the previous run of this job. For example, the
     *            <code>JobRunId</code> specified in the
     *            <code>StartJobRun</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withPreviousRunId(String previousRunId) {
        this.previousRunId = previousRunId;
        return this;
    }

    /**
     * <p>
     * The name of the trigger that started this job run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the trigger that started this job run.
     *         </p>
     */
    public String getTriggerName() {
        return triggerName;
    }

    /**
     * <p>
     * The name of the trigger that started this job run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param triggerName <p>
     *            The name of the trigger that started this job run.
     *            </p>
     */
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    /**
     * <p>
     * The name of the trigger that started this job run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param triggerName <p>
     *            The name of the trigger that started this job run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }

    /**
     * <p>
     * The name of the job definition being used in this run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the job definition being used in this run.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The name of the job definition being used in this run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param jobName <p>
     *            The name of the job definition being used in this run.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job definition being used in this run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param jobName <p>
     *            The name of the job definition being used in this run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The date and time at which this job run was started.
     * </p>
     *
     * @return <p>
     *         The date and time at which this job run was started.
     *         </p>
     */
    public java.util.Date getStartedOn() {
        return startedOn;
    }

    /**
     * <p>
     * The date and time at which this job run was started.
     * </p>
     *
     * @param startedOn <p>
     *            The date and time at which this job run was started.
     *            </p>
     */
    public void setStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
    }

    /**
     * <p>
     * The date and time at which this job run was started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startedOn <p>
     *            The date and time at which this job run was started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
        return this;
    }

    /**
     * <p>
     * The last time that this job run was modified.
     * </p>
     *
     * @return <p>
     *         The last time that this job run was modified.
     *         </p>
     */
    public java.util.Date getLastModifiedOn() {
        return lastModifiedOn;
    }

    /**
     * <p>
     * The last time that this job run was modified.
     * </p>
     *
     * @param lastModifiedOn <p>
     *            The last time that this job run was modified.
     *            </p>
     */
    public void setLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * <p>
     * The last time that this job run was modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedOn <p>
     *            The last time that this job run was modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
        return this;
    }

    /**
     * <p>
     * The date and time that this job run completed.
     * </p>
     *
     * @return <p>
     *         The date and time that this job run completed.
     *         </p>
     */
    public java.util.Date getCompletedOn() {
        return completedOn;
    }

    /**
     * <p>
     * The date and time that this job run completed.
     * </p>
     *
     * @param completedOn <p>
     *            The date and time that this job run completed.
     *            </p>
     */
    public void setCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
    }

    /**
     * <p>
     * The date and time that this job run completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completedOn <p>
     *            The date and time that this job run completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
        return this;
    }

    /**
     * <p>
     * The current state of the job run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @return <p>
     *         The current state of the job run.
     *         </p>
     * @see JobRunState
     */
    public String getJobRunState() {
        return jobRunState;
    }

    /**
     * <p>
     * The current state of the job run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @param jobRunState <p>
     *            The current state of the job run.
     *            </p>
     * @see JobRunState
     */
    public void setJobRunState(String jobRunState) {
        this.jobRunState = jobRunState;
    }

    /**
     * <p>
     * The current state of the job run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @param jobRunState <p>
     *            The current state of the job run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobRunState
     */
    public JobRun withJobRunState(String jobRunState) {
        this.jobRunState = jobRunState;
        return this;
    }

    /**
     * <p>
     * The current state of the job run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @param jobRunState <p>
     *            The current state of the job run.
     *            </p>
     * @see JobRunState
     */
    public void setJobRunState(JobRunState jobRunState) {
        this.jobRunState = jobRunState.toString();
    }

    /**
     * <p>
     * The current state of the job run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @param jobRunState <p>
     *            The current state of the job run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobRunState
     */
    public JobRun withJobRunState(JobRunState jobRunState) {
        this.jobRunState = jobRunState.toString();
        return this;
    }

    /**
     * <p>
     * The job arguments associated with this run. For this job run, they
     * replace the default arguments set in the job definition itself.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script
     * consumes, as well as arguments that AWS Glue itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own job arguments,
     * see the <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html"
     * >Calling AWS Glue APIs in Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the key-value pairs that AWS Glue consumes to set
     * up your job, see the <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html"
     * >Special Parameters Used by AWS Glue</a> topic in the developer guide.
     * </p>
     *
     * @return <p>
     *         The job arguments associated with this run. For this job run,
     *         they replace the default arguments set in the job definition
     *         itself.
     *         </p>
     *         <p>
     *         You can specify arguments here that your own job-execution script
     *         consumes, as well as arguments that AWS Glue itself consumes.
     *         </p>
     *         <p>
     *         For information about how to specify and consume your own job
     *         arguments, see the <a href=
     *         "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html"
     *         >Calling AWS Glue APIs in Python</a> topic in the developer
     *         guide.
     *         </p>
     *         <p>
     *         For information about the key-value pairs that AWS Glue consumes
     *         to set up your job, see the <a href=
     *         "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html"
     *         >Special Parameters Used by AWS Glue</a> topic in the developer
     *         guide.
     *         </p>
     */
    public java.util.Map<String, String> getArguments() {
        return arguments;
    }

    /**
     * <p>
     * The job arguments associated with this run. For this job run, they
     * replace the default arguments set in the job definition itself.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script
     * consumes, as well as arguments that AWS Glue itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own job arguments,
     * see the <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html"
     * >Calling AWS Glue APIs in Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the key-value pairs that AWS Glue consumes to set
     * up your job, see the <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html"
     * >Special Parameters Used by AWS Glue</a> topic in the developer guide.
     * </p>
     *
     * @param arguments <p>
     *            The job arguments associated with this run. For this job run,
     *            they replace the default arguments set in the job definition
     *            itself.
     *            </p>
     *            <p>
     *            You can specify arguments here that your own job-execution
     *            script consumes, as well as arguments that AWS Glue itself
     *            consumes.
     *            </p>
     *            <p>
     *            For information about how to specify and consume your own job
     *            arguments, see the <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html"
     *            >Calling AWS Glue APIs in Python</a> topic in the developer
     *            guide.
     *            </p>
     *            <p>
     *            For information about the key-value pairs that AWS Glue
     *            consumes to set up your job, see the <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html"
     *            >Special Parameters Used by AWS Glue</a> topic in the
     *            developer guide.
     *            </p>
     */
    public void setArguments(java.util.Map<String, String> arguments) {
        this.arguments = arguments;
    }

    /**
     * <p>
     * The job arguments associated with this run. For this job run, they
     * replace the default arguments set in the job definition itself.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script
     * consumes, as well as arguments that AWS Glue itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own job arguments,
     * see the <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html"
     * >Calling AWS Glue APIs in Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the key-value pairs that AWS Glue consumes to set
     * up your job, see the <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html"
     * >Special Parameters Used by AWS Glue</a> topic in the developer guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arguments <p>
     *            The job arguments associated with this run. For this job run,
     *            they replace the default arguments set in the job definition
     *            itself.
     *            </p>
     *            <p>
     *            You can specify arguments here that your own job-execution
     *            script consumes, as well as arguments that AWS Glue itself
     *            consumes.
     *            </p>
     *            <p>
     *            For information about how to specify and consume your own job
     *            arguments, see the <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html"
     *            >Calling AWS Glue APIs in Python</a> topic in the developer
     *            guide.
     *            </p>
     *            <p>
     *            For information about the key-value pairs that AWS Glue
     *            consumes to set up your job, see the <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html"
     *            >Special Parameters Used by AWS Glue</a> topic in the
     *            developer guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withArguments(java.util.Map<String, String> arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * <p>
     * The job arguments associated with this run. For this job run, they
     * replace the default arguments set in the job definition itself.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script
     * consumes, as well as arguments that AWS Glue itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own job arguments,
     * see the <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html"
     * >Calling AWS Glue APIs in Python</a> topic in the developer guide.
     * </p>
     * <p>
     * For information about the key-value pairs that AWS Glue consumes to set
     * up your job, see the <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html"
     * >Special Parameters Used by AWS Glue</a> topic in the developer guide.
     * </p>
     * <p>
     * The method adds a new key-value pair into Arguments parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Arguments.
     * @param value The corresponding value of the entry to be added into
     *            Arguments.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun addArgumentsEntry(String key, String value) {
        if (null == this.arguments) {
            this.arguments = new java.util.HashMap<String, String>();
        }
        if (this.arguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.arguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Arguments.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public JobRun clearArgumentsEntries() {
        this.arguments = null;
        return this;
    }

    /**
     * <p>
     * An error message associated with this job run.
     * </p>
     *
     * @return <p>
     *         An error message associated with this job run.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * An error message associated with this job run.
     * </p>
     *
     * @param errorMessage <p>
     *            An error message associated with this job run.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An error message associated with this job run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorMessage <p>
     *            An error message associated with this job run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * <p>
     * A list of predecessors to this job run.
     * </p>
     *
     * @return <p>
     *         A list of predecessors to this job run.
     *         </p>
     */
    public java.util.List<Predecessor> getPredecessorRuns() {
        return predecessorRuns;
    }

    /**
     * <p>
     * A list of predecessors to this job run.
     * </p>
     *
     * @param predecessorRuns <p>
     *            A list of predecessors to this job run.
     *            </p>
     */
    public void setPredecessorRuns(java.util.Collection<Predecessor> predecessorRuns) {
        if (predecessorRuns == null) {
            this.predecessorRuns = null;
            return;
        }

        this.predecessorRuns = new java.util.ArrayList<Predecessor>(predecessorRuns);
    }

    /**
     * <p>
     * A list of predecessors to this job run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param predecessorRuns <p>
     *            A list of predecessors to this job run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withPredecessorRuns(Predecessor... predecessorRuns) {
        if (getPredecessorRuns() == null) {
            this.predecessorRuns = new java.util.ArrayList<Predecessor>(predecessorRuns.length);
        }
        for (Predecessor value : predecessorRuns) {
            this.predecessorRuns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of predecessors to this job run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param predecessorRuns <p>
     *            A list of predecessors to this job run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withPredecessorRuns(java.util.Collection<Predecessor> predecessorRuns) {
        setPredecessorRuns(predecessorRuns);
        return this;
    }

    /**
     * <p>
     * This field is deprecated. Use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) allocated to this
     * JobRun. From 2 to 100 DPUs can be allocated; the default is 10. A DPU is
     * a relative measure of processing power that consists of 4 vCPUs of
     * compute capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     *
     * @return <p>
     *         This field is deprecated. Use <code>MaxCapacity</code> instead.
     *         </p>
     *         <p>
     *         The number of AWS Glue data processing units (DPUs) allocated to
     *         this JobRun. From 2 to 100 DPUs can be allocated; the default is
     *         10. A DPU is a relative measure of processing power that consists
     *         of 4 vCPUs of compute capacity and 16 GB of memory. For more
     *         information, see the <a
     *         href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing
     *         page</a>.
     *         </p>
     */
    public Integer getAllocatedCapacity() {
        return allocatedCapacity;
    }

    /**
     * <p>
     * This field is deprecated. Use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) allocated to this
     * JobRun. From 2 to 100 DPUs can be allocated; the default is 10. A DPU is
     * a relative measure of processing power that consists of 4 vCPUs of
     * compute capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     *
     * @param allocatedCapacity <p>
     *            This field is deprecated. Use <code>MaxCapacity</code>
     *            instead.
     *            </p>
     *            <p>
     *            The number of AWS Glue data processing units (DPUs) allocated
     *            to this JobRun. From 2 to 100 DPUs can be allocated; the
     *            default is 10. A DPU is a relative measure of processing power
     *            that consists of 4 vCPUs of compute capacity and 16 GB of
     *            memory. For more information, see the <a
     *            href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing
     *            page</a>.
     *            </p>
     */
    public void setAllocatedCapacity(Integer allocatedCapacity) {
        this.allocatedCapacity = allocatedCapacity;
    }

    /**
     * <p>
     * This field is deprecated. Use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) allocated to this
     * JobRun. From 2 to 100 DPUs can be allocated; the default is 10. A DPU is
     * a relative measure of processing power that consists of 4 vCPUs of
     * compute capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocatedCapacity <p>
     *            This field is deprecated. Use <code>MaxCapacity</code>
     *            instead.
     *            </p>
     *            <p>
     *            The number of AWS Glue data processing units (DPUs) allocated
     *            to this JobRun. From 2 to 100 DPUs can be allocated; the
     *            default is 10. A DPU is a relative measure of processing power
     *            that consists of 4 vCPUs of compute capacity and 16 GB of
     *            memory. For more information, see the <a
     *            href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing
     *            page</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withAllocatedCapacity(Integer allocatedCapacity) {
        this.allocatedCapacity = allocatedCapacity;
        return this;
    }

    /**
     * <p>
     * The amount of time (in seconds) that the job run consumed resources.
     * </p>
     *
     * @return <p>
     *         The amount of time (in seconds) that the job run consumed
     *         resources.
     *         </p>
     */
    public Integer getExecutionTime() {
        return executionTime;
    }

    /**
     * <p>
     * The amount of time (in seconds) that the job run consumed resources.
     * </p>
     *
     * @param executionTime <p>
     *            The amount of time (in seconds) that the job run consumed
     *            resources.
     *            </p>
     */
    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    /**
     * <p>
     * The amount of time (in seconds) that the job run consumed resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionTime <p>
     *            The amount of time (in seconds) that the job run consumed
     *            resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
        return this;
    }

    /**
     * <p>
     * The <code>JobRun</code> timeout in minutes. This is the maximum time that
     * a job run can consume resources before it is terminated and enters
     * <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * This overrides the timeout value set in the parent job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The <code>JobRun</code> timeout in minutes. This is the maximum
     *         time that a job run can consume resources before it is terminated
     *         and enters <code>TIMEOUT</code> status. The default is 2,880
     *         minutes (48 hours). This overrides the timeout value set in the
     *         parent job.
     *         </p>
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * <p>
     * The <code>JobRun</code> timeout in minutes. This is the maximum time that
     * a job run can consume resources before it is terminated and enters
     * <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * This overrides the timeout value set in the parent job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeout <p>
     *            The <code>JobRun</code> timeout in minutes. This is the
     *            maximum time that a job run can consume resources before it is
     *            terminated and enters <code>TIMEOUT</code> status. The default
     *            is 2,880 minutes (48 hours). This overrides the timeout value
     *            set in the parent job.
     *            </p>
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The <code>JobRun</code> timeout in minutes. This is the maximum time that
     * a job run can consume resources before it is terminated and enters
     * <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * This overrides the timeout value set in the parent job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeout <p>
     *            The <code>JobRun</code> timeout in minutes. This is the
     *            maximum time that a job run can consume resources before it is
     *            terminated and enters <code>TIMEOUT</code> status. The default
     *            is 2,880 minutes (48 hours). This overrides the timeout value
     *            set in the parent job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that can be allocated
     * when this job runs. A DPU is a relative measure of processing power that
     * consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/https:/aws.amazon.com/glue/pricing/"
     * >AWS Glue pricing page</a>.
     * </p>
     * <p>
     * Do not set <code>Max Capacity</code> if using <code>WorkerType</code> and
     * <code>NumberOfWorkers</code>.
     * </p>
     * <p>
     * The value that can be allocated for <code>MaxCapacity</code> depends on
     * whether you are running a Python shell job or an Apache Spark ETL job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify a Python shell job (<code>JobCommand.Name</code>=
     * "pythonshell"), you can allocate either 0.0625 or 1 DPU. The default is
     * 0.0625 DPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you specify an Apache Spark ETL job (<code>JobCommand.Name</code>=
     * "glueetl"), you can allocate from 2 to 100 DPUs. The default is 10 DPUs.
     * This job type cannot have a fractional DPU allocation.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The number of AWS Glue data processing units (DPUs) that can be
     *         allocated when this job runs. A DPU is a relative measure of
     *         processing power that consists of 4 vCPUs of compute capacity and
     *         16 GB of memory. For more information, see the <a href=
     *         "https://docs.aws.amazon.com/https:/aws.amazon.com/glue/pricing/"
     *         >AWS Glue pricing page</a>.
     *         </p>
     *         <p>
     *         Do not set <code>Max Capacity</code> if using
     *         <code>WorkerType</code> and <code>NumberOfWorkers</code>.
     *         </p>
     *         <p>
     *         The value that can be allocated for <code>MaxCapacity</code>
     *         depends on whether you are running a Python shell job or an
     *         Apache Spark ETL job:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         When you specify a Python shell job (
     *         <code>JobCommand.Name</code>="pythonshell"), you can allocate
     *         either 0.0625 or 1 DPU. The default is 0.0625 DPU.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When you specify an Apache Spark ETL job (
     *         <code>JobCommand.Name</code>="glueetl"), you can allocate from 2
     *         to 100 DPUs. The default is 10 DPUs. This job type cannot have a
     *         fractional DPU allocation.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Double getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that can be allocated
     * when this job runs. A DPU is a relative measure of processing power that
     * consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/https:/aws.amazon.com/glue/pricing/"
     * >AWS Glue pricing page</a>.
     * </p>
     * <p>
     * Do not set <code>Max Capacity</code> if using <code>WorkerType</code> and
     * <code>NumberOfWorkers</code>.
     * </p>
     * <p>
     * The value that can be allocated for <code>MaxCapacity</code> depends on
     * whether you are running a Python shell job or an Apache Spark ETL job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify a Python shell job (<code>JobCommand.Name</code>=
     * "pythonshell"), you can allocate either 0.0625 or 1 DPU. The default is
     * 0.0625 DPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you specify an Apache Spark ETL job (<code>JobCommand.Name</code>=
     * "glueetl"), you can allocate from 2 to 100 DPUs. The default is 10 DPUs.
     * This job type cannot have a fractional DPU allocation.
     * </p>
     * </li>
     * </ul>
     *
     * @param maxCapacity <p>
     *            The number of AWS Glue data processing units (DPUs) that can
     *            be allocated when this job runs. A DPU is a relative measure
     *            of processing power that consists of 4 vCPUs of compute
     *            capacity and 16 GB of memory. For more information, see the <a
     *            href=
     *            "https://docs.aws.amazon.com/https:/aws.amazon.com/glue/pricing/"
     *            >AWS Glue pricing page</a>.
     *            </p>
     *            <p>
     *            Do not set <code>Max Capacity</code> if using
     *            <code>WorkerType</code> and <code>NumberOfWorkers</code>.
     *            </p>
     *            <p>
     *            The value that can be allocated for <code>MaxCapacity</code>
     *            depends on whether you are running a Python shell job or an
     *            Apache Spark ETL job:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            When you specify a Python shell job (
     *            <code>JobCommand.Name</code>="pythonshell"), you can allocate
     *            either 0.0625 or 1 DPU. The default is 0.0625 DPU.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            When you specify an Apache Spark ETL job (
     *            <code>JobCommand.Name</code>="glueetl"), you can allocate from
     *            2 to 100 DPUs. The default is 10 DPUs. This job type cannot
     *            have a fractional DPU allocation.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that can be allocated
     * when this job runs. A DPU is a relative measure of processing power that
     * consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/https:/aws.amazon.com/glue/pricing/"
     * >AWS Glue pricing page</a>.
     * </p>
     * <p>
     * Do not set <code>Max Capacity</code> if using <code>WorkerType</code> and
     * <code>NumberOfWorkers</code>.
     * </p>
     * <p>
     * The value that can be allocated for <code>MaxCapacity</code> depends on
     * whether you are running a Python shell job or an Apache Spark ETL job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify a Python shell job (<code>JobCommand.Name</code>=
     * "pythonshell"), you can allocate either 0.0625 or 1 DPU. The default is
     * 0.0625 DPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you specify an Apache Spark ETL job (<code>JobCommand.Name</code>=
     * "glueetl"), you can allocate from 2 to 100 DPUs. The default is 10 DPUs.
     * This job type cannot have a fractional DPU allocation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxCapacity <p>
     *            The number of AWS Glue data processing units (DPUs) that can
     *            be allocated when this job runs. A DPU is a relative measure
     *            of processing power that consists of 4 vCPUs of compute
     *            capacity and 16 GB of memory. For more information, see the <a
     *            href=
     *            "https://docs.aws.amazon.com/https:/aws.amazon.com/glue/pricing/"
     *            >AWS Glue pricing page</a>.
     *            </p>
     *            <p>
     *            Do not set <code>Max Capacity</code> if using
     *            <code>WorkerType</code> and <code>NumberOfWorkers</code>.
     *            </p>
     *            <p>
     *            The value that can be allocated for <code>MaxCapacity</code>
     *            depends on whether you are running a Python shell job or an
     *            Apache Spark ETL job:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            When you specify a Python shell job (
     *            <code>JobCommand.Name</code>="pythonshell"), you can allocate
     *            either 0.0625 or 1 DPU. The default is 0.0625 DPU.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            When you specify an Apache Spark ETL job (
     *            <code>JobCommand.Name</code>="glueetl"), you can allocate from
     *            2 to 100 DPUs. The default is 10 DPUs. This job type cannot
     *            have a fractional DPU allocation.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when a job runs. Accepts
     * a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU,
     * 16 GB of memory and a 50GB disk, and 2 executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB
     * of memory and a 64GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB
     * of memory and a 128GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @return <p>
     *         The type of predefined worker that is allocated when a job runs.
     *         Accepts a value of Standard, G.1X, or G.2X.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For the <code>Standard</code> worker type, each worker provides 4
     *         vCPU, 16 GB of memory and a 50GB disk, and 2 executors per
     *         worker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.1X</code> worker type, each worker provides 4
     *         vCPU, 16 GB of memory and a 64GB disk, and 1 executor per worker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.2X</code> worker type, each worker provides 8
     *         vCPU, 32 GB of memory and a 128GB disk, and 1 executor per
     *         worker.
     *         </p>
     *         </li>
     *         </ul>
     * @see WorkerType
     */
    public String getWorkerType() {
        return workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when a job runs. Accepts
     * a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU,
     * 16 GB of memory and a 50GB disk, and 2 executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB
     * of memory and a 64GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB
     * of memory and a 128GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @param workerType <p>
     *            The type of predefined worker that is allocated when a job
     *            runs. Accepts a value of Standard, G.1X, or G.2X.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For the <code>Standard</code> worker type, each worker
     *            provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     *            executors per worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.1X</code> worker type, each worker provides 4
     *            vCPU, 16 GB of memory and a 64GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker provides 8
     *            vCPU, 32 GB of memory and a 128GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            </ul>
     * @see WorkerType
     */
    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when a job runs. Accepts
     * a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU,
     * 16 GB of memory and a 50GB disk, and 2 executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB
     * of memory and a 64GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB
     * of memory and a 128GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @param workerType <p>
     *            The type of predefined worker that is allocated when a job
     *            runs. Accepts a value of Standard, G.1X, or G.2X.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For the <code>Standard</code> worker type, each worker
     *            provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     *            executors per worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.1X</code> worker type, each worker provides 4
     *            vCPU, 16 GB of memory and a 64GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker provides 8
     *            vCPU, 32 GB of memory and a 128GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkerType
     */
    public JobRun withWorkerType(String workerType) {
        this.workerType = workerType;
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when a job runs. Accepts
     * a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU,
     * 16 GB of memory and a 50GB disk, and 2 executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB
     * of memory and a 64GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB
     * of memory and a 128GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @param workerType <p>
     *            The type of predefined worker that is allocated when a job
     *            runs. Accepts a value of Standard, G.1X, or G.2X.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For the <code>Standard</code> worker type, each worker
     *            provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     *            executors per worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.1X</code> worker type, each worker provides 4
     *            vCPU, 16 GB of memory and a 64GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker provides 8
     *            vCPU, 32 GB of memory and a 128GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            </ul>
     * @see WorkerType
     */
    public void setWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when a job runs. Accepts
     * a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU,
     * 16 GB of memory and a 50GB disk, and 2 executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB
     * of memory and a 64GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB
     * of memory and a 128GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @param workerType <p>
     *            The type of predefined worker that is allocated when a job
     *            runs. Accepts a value of Standard, G.1X, or G.2X.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For the <code>Standard</code> worker type, each worker
     *            provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     *            executors per worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.1X</code> worker type, each worker provides 4
     *            vCPU, 16 GB of memory and a 64GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker provides 8
     *            vCPU, 32 GB of memory and a 128GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkerType
     */
    public JobRun withWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
        return this;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are
     * allocated when a job runs.
     * </p>
     * <p>
     * The maximum number of workers you can define are 299 for
     * <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     *
     * @return <p>
     *         The number of workers of a defined <code>workerType</code> that
     *         are allocated when a job runs.
     *         </p>
     *         <p>
     *         The maximum number of workers you can define are 299 for
     *         <code>G.1X</code>, and 149 for <code>G.2X</code>.
     *         </p>
     */
    public Integer getNumberOfWorkers() {
        return numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are
     * allocated when a job runs.
     * </p>
     * <p>
     * The maximum number of workers you can define are 299 for
     * <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     *
     * @param numberOfWorkers <p>
     *            The number of workers of a defined <code>workerType</code>
     *            that are allocated when a job runs.
     *            </p>
     *            <p>
     *            The maximum number of workers you can define are 299 for
     *            <code>G.1X</code>, and 149 for <code>G.2X</code>.
     *            </p>
     */
    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are
     * allocated when a job runs.
     * </p>
     * <p>
     * The maximum number of workers you can define are 299 for
     * <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfWorkers <p>
     *            The number of workers of a defined <code>workerType</code>
     *            that are allocated when a job runs.
     *            </p>
     *            <p>
     *            The maximum number of workers you can define are 299 for
     *            <code>G.1X</code>, and 149 for <code>G.2X</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
        return this;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used
     * with this job run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the <code>SecurityConfiguration</code> structure to
     *         be used with this job run.
     *         </p>
     */
    public String getSecurityConfiguration() {
        return securityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used
     * with this job run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param securityConfiguration <p>
     *            The name of the <code>SecurityConfiguration</code> structure
     *            to be used with this job run.
     *            </p>
     */
    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used
     * with this job run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param securityConfiguration <p>
     *            The name of the <code>SecurityConfiguration</code> structure
     *            to be used with this job run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
        return this;
    }

    /**
     * <p>
     * The name of the log group for secure logging that can be server-side
     * encrypted in Amazon CloudWatch using AWS KMS. This name can be
     * <code>/aws-glue/jobs/</code>, in which case the default encryption is
     * <code>NONE</code>. If you add a role name and
     * <code>SecurityConfiguration</code> name (in other words,
     * <code>/aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/</code>),
     * then that security configuration is used to encrypt the log group.
     * </p>
     *
     * @return <p>
     *         The name of the log group for secure logging that can be
     *         server-side encrypted in Amazon CloudWatch using AWS KMS. This
     *         name can be <code>/aws-glue/jobs/</code>, in which case the
     *         default encryption is <code>NONE</code>. If you add a role name
     *         and <code>SecurityConfiguration</code> name (in other words,
     *         <code>/aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/</code>
     *         ), then that security configuration is used to encrypt the log
     *         group.
     *         </p>
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * <p>
     * The name of the log group for secure logging that can be server-side
     * encrypted in Amazon CloudWatch using AWS KMS. This name can be
     * <code>/aws-glue/jobs/</code>, in which case the default encryption is
     * <code>NONE</code>. If you add a role name and
     * <code>SecurityConfiguration</code> name (in other words,
     * <code>/aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/</code>),
     * then that security configuration is used to encrypt the log group.
     * </p>
     *
     * @param logGroupName <p>
     *            The name of the log group for secure logging that can be
     *            server-side encrypted in Amazon CloudWatch using AWS KMS. This
     *            name can be <code>/aws-glue/jobs/</code>, in which case the
     *            default encryption is <code>NONE</code>. If you add a role
     *            name and <code>SecurityConfiguration</code> name (in other
     *            words,
     *            <code>/aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/</code>
     *            ), then that security configuration is used to encrypt the log
     *            group.
     *            </p>
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group for secure logging that can be server-side
     * encrypted in Amazon CloudWatch using AWS KMS. This name can be
     * <code>/aws-glue/jobs/</code>, in which case the default encryption is
     * <code>NONE</code>. If you add a role name and
     * <code>SecurityConfiguration</code> name (in other words,
     * <code>/aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/</code>),
     * then that security configuration is used to encrypt the log group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logGroupName <p>
     *            The name of the log group for secure logging that can be
     *            server-side encrypted in Amazon CloudWatch using AWS KMS. This
     *            name can be <code>/aws-glue/jobs/</code>, in which case the
     *            default encryption is <code>NONE</code>. If you add a role
     *            name and <code>SecurityConfiguration</code> name (in other
     *            words,
     *            <code>/aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/</code>
     *            ), then that security configuration is used to encrypt the log
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * <p>
     * Specifies configuration properties of a job run notification.
     * </p>
     *
     * @return <p>
     *         Specifies configuration properties of a job run notification.
     *         </p>
     */
    public NotificationProperty getNotificationProperty() {
        return notificationProperty;
    }

    /**
     * <p>
     * Specifies configuration properties of a job run notification.
     * </p>
     *
     * @param notificationProperty <p>
     *            Specifies configuration properties of a job run notification.
     *            </p>
     */
    public void setNotificationProperty(NotificationProperty notificationProperty) {
        this.notificationProperty = notificationProperty;
    }

    /**
     * <p>
     * Specifies configuration properties of a job run notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationProperty <p>
     *            Specifies configuration properties of a job run notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withNotificationProperty(NotificationProperty notificationProperty) {
        this.notificationProperty = notificationProperty;
        return this;
    }

    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS
     * Glue supports. The Python version indicates the version supported for
     * jobs of type Spark.
     * </p>
     * <p>
     * For more information about the available AWS Glue versions and
     * corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue
     * version</a> in the developer guide.
     * </p>
     * <p>
     * Jobs that are created without specifying a Glue version default to Glue
     * 0.9.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^\w+\.\w+$<br/>
     *
     * @return <p>
     *         Glue version determines the versions of Apache Spark and Python
     *         that AWS Glue supports. The Python version indicates the version
     *         supported for jobs of type Spark.
     *         </p>
     *         <p>
     *         For more information about the available AWS Glue versions and
     *         corresponding Spark and Python versions, see <a
     *         href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html"
     *         >Glue version</a> in the developer guide.
     *         </p>
     *         <p>
     *         Jobs that are created without specifying a Glue version default
     *         to Glue 0.9.
     *         </p>
     */
    public String getGlueVersion() {
        return glueVersion;
    }

    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS
     * Glue supports. The Python version indicates the version supported for
     * jobs of type Spark.
     * </p>
     * <p>
     * For more information about the available AWS Glue versions and
     * corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue
     * version</a> in the developer guide.
     * </p>
     * <p>
     * Jobs that are created without specifying a Glue version default to Glue
     * 0.9.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^\w+\.\w+$<br/>
     *
     * @param glueVersion <p>
     *            Glue version determines the versions of Apache Spark and
     *            Python that AWS Glue supports. The Python version indicates
     *            the version supported for jobs of type Spark.
     *            </p>
     *            <p>
     *            For more information about the available AWS Glue versions and
     *            corresponding Spark and Python versions, see <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue
     *            version</a> in the developer guide.
     *            </p>
     *            <p>
     *            Jobs that are created without specifying a Glue version
     *            default to Glue 0.9.
     *            </p>
     */
    public void setGlueVersion(String glueVersion) {
        this.glueVersion = glueVersion;
    }

    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS
     * Glue supports. The Python version indicates the version supported for
     * jobs of type Spark.
     * </p>
     * <p>
     * For more information about the available AWS Glue versions and
     * corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue
     * version</a> in the developer guide.
     * </p>
     * <p>
     * Jobs that are created without specifying a Glue version default to Glue
     * 0.9.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^\w+\.\w+$<br/>
     *
     * @param glueVersion <p>
     *            Glue version determines the versions of Apache Spark and
     *            Python that AWS Glue supports. The Python version indicates
     *            the version supported for jobs of type Spark.
     *            </p>
     *            <p>
     *            For more information about the available AWS Glue versions and
     *            corresponding Spark and Python versions, see <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue
     *            version</a> in the developer guide.
     *            </p>
     *            <p>
     *            Jobs that are created without specifying a Glue version
     *            default to Glue 0.9.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobRun withGlueVersion(String glueVersion) {
        this.glueVersion = glueVersion;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getAttempt() != null)
            sb.append("Attempt: " + getAttempt() + ",");
        if (getPreviousRunId() != null)
            sb.append("PreviousRunId: " + getPreviousRunId() + ",");
        if (getTriggerName() != null)
            sb.append("TriggerName: " + getTriggerName() + ",");
        if (getJobName() != null)
            sb.append("JobName: " + getJobName() + ",");
        if (getStartedOn() != null)
            sb.append("StartedOn: " + getStartedOn() + ",");
        if (getLastModifiedOn() != null)
            sb.append("LastModifiedOn: " + getLastModifiedOn() + ",");
        if (getCompletedOn() != null)
            sb.append("CompletedOn: " + getCompletedOn() + ",");
        if (getJobRunState() != null)
            sb.append("JobRunState: " + getJobRunState() + ",");
        if (getArguments() != null)
            sb.append("Arguments: " + getArguments() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage() + ",");
        if (getPredecessorRuns() != null)
            sb.append("PredecessorRuns: " + getPredecessorRuns() + ",");
        if (getAllocatedCapacity() != null)
            sb.append("AllocatedCapacity: " + getAllocatedCapacity() + ",");
        if (getExecutionTime() != null)
            sb.append("ExecutionTime: " + getExecutionTime() + ",");
        if (getTimeout() != null)
            sb.append("Timeout: " + getTimeout() + ",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: " + getMaxCapacity() + ",");
        if (getWorkerType() != null)
            sb.append("WorkerType: " + getWorkerType() + ",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: " + getNumberOfWorkers() + ",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: " + getSecurityConfiguration() + ",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getNotificationProperty() != null)
            sb.append("NotificationProperty: " + getNotificationProperty() + ",");
        if (getGlueVersion() != null)
            sb.append("GlueVersion: " + getGlueVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getAttempt() == null) ? 0 : getAttempt().hashCode());
        hashCode = prime * hashCode
                + ((getPreviousRunId() == null) ? 0 : getPreviousRunId().hashCode());
        hashCode = prime * hashCode
                + ((getTriggerName() == null) ? 0 : getTriggerName().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getStartedOn() == null) ? 0 : getStartedOn().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedOn() == null) ? 0 : getLastModifiedOn().hashCode());
        hashCode = prime * hashCode
                + ((getCompletedOn() == null) ? 0 : getCompletedOn().hashCode());
        hashCode = prime * hashCode
                + ((getJobRunState() == null) ? 0 : getJobRunState().hashCode());
        hashCode = prime * hashCode + ((getArguments() == null) ? 0 : getArguments().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode
                + ((getPredecessorRuns() == null) ? 0 : getPredecessorRuns().hashCode());
        hashCode = prime * hashCode
                + ((getAllocatedCapacity() == null) ? 0 : getAllocatedCapacity().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionTime() == null) ? 0 : getExecutionTime().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode
                + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationProperty() == null) ? 0 : getNotificationProperty().hashCode());
        hashCode = prime * hashCode
                + ((getGlueVersion() == null) ? 0 : getGlueVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobRun == false)
            return false;
        JobRun other = (JobRun) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAttempt() == null ^ this.getAttempt() == null)
            return false;
        if (other.getAttempt() != null && other.getAttempt().equals(this.getAttempt()) == false)
            return false;
        if (other.getPreviousRunId() == null ^ this.getPreviousRunId() == null)
            return false;
        if (other.getPreviousRunId() != null
                && other.getPreviousRunId().equals(this.getPreviousRunId()) == false)
            return false;
        if (other.getTriggerName() == null ^ this.getTriggerName() == null)
            return false;
        if (other.getTriggerName() != null
                && other.getTriggerName().equals(this.getTriggerName()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getStartedOn() == null ^ this.getStartedOn() == null)
            return false;
        if (other.getStartedOn() != null
                && other.getStartedOn().equals(this.getStartedOn()) == false)
            return false;
        if (other.getLastModifiedOn() == null ^ this.getLastModifiedOn() == null)
            return false;
        if (other.getLastModifiedOn() != null
                && other.getLastModifiedOn().equals(this.getLastModifiedOn()) == false)
            return false;
        if (other.getCompletedOn() == null ^ this.getCompletedOn() == null)
            return false;
        if (other.getCompletedOn() != null
                && other.getCompletedOn().equals(this.getCompletedOn()) == false)
            return false;
        if (other.getJobRunState() == null ^ this.getJobRunState() == null)
            return false;
        if (other.getJobRunState() != null
                && other.getJobRunState().equals(this.getJobRunState()) == false)
            return false;
        if (other.getArguments() == null ^ this.getArguments() == null)
            return false;
        if (other.getArguments() != null
                && other.getArguments().equals(this.getArguments()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getPredecessorRuns() == null ^ this.getPredecessorRuns() == null)
            return false;
        if (other.getPredecessorRuns() != null
                && other.getPredecessorRuns().equals(this.getPredecessorRuns()) == false)
            return false;
        if (other.getAllocatedCapacity() == null ^ this.getAllocatedCapacity() == null)
            return false;
        if (other.getAllocatedCapacity() != null
                && other.getAllocatedCapacity().equals(this.getAllocatedCapacity()) == false)
            return false;
        if (other.getExecutionTime() == null ^ this.getExecutionTime() == null)
            return false;
        if (other.getExecutionTime() != null
                && other.getExecutionTime().equals(this.getExecutionTime()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null
                && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        if (other.getWorkerType() == null ^ this.getWorkerType() == null)
            return false;
        if (other.getWorkerType() != null
                && other.getWorkerType().equals(this.getWorkerType()) == false)
            return false;
        if (other.getNumberOfWorkers() == null ^ this.getNumberOfWorkers() == null)
            return false;
        if (other.getNumberOfWorkers() != null
                && other.getNumberOfWorkers().equals(this.getNumberOfWorkers()) == false)
            return false;
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null
                && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getNotificationProperty() == null ^ this.getNotificationProperty() == null)
            return false;
        if (other.getNotificationProperty() != null
                && other.getNotificationProperty().equals(this.getNotificationProperty()) == false)
            return false;
        if (other.getGlueVersion() == null ^ this.getGlueVersion() == null)
            return false;
        if (other.getGlueVersion() != null
                && other.getGlueVersion().equals(this.getGlueVersion()) == false)
            return false;
        return true;
    }
}
