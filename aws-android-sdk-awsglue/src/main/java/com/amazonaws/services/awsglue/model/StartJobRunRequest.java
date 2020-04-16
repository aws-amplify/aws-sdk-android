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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts a job run using a job definition.
 * </p>
 */
public class StartJobRunRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the job definition to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String jobName;

    /**
     * <p>
     * The ID of a previous <code>JobRun</code> to retry.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String jobRunId;

    /**
     * <p>
     * The job arguments specifically for this run. For this job run, they
     * replace the default arguments set in the job definition itself.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script
     * consumes, as well as arguments that AWS Glue itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments,
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
     * This field is deprecated. Use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) to allocate to this
     * JobRun. From 2 to 100 DPUs can be allocated; the default is 10. A DPU is
     * a relative measure of processing power that consists of 4 vCPUs of
     * compute capacity and 16 GB of memory. For more information, see the <a
     * href
     * ="https://docs.aws.amazon.com/https:/aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     */
    private Integer allocatedCapacity;

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
     * whether you are running a Python shell job, or an Apache Spark ETL job:
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
     * Specifies configuration properties of a job run notification.
     * </p>
     */
    private NotificationProperty notificationProperty;

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
     * The name of the job definition to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the job definition to use.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The name of the job definition to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param jobName <p>
     *            The name of the job definition to use.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job definition to use.
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
     *            The name of the job definition to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartJobRunRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The ID of a previous <code>JobRun</code> to retry.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The ID of a previous <code>JobRun</code> to retry.
     *         </p>
     */
    public String getJobRunId() {
        return jobRunId;
    }

    /**
     * <p>
     * The ID of a previous <code>JobRun</code> to retry.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param jobRunId <p>
     *            The ID of a previous <code>JobRun</code> to retry.
     *            </p>
     */
    public void setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
    }

    /**
     * <p>
     * The ID of a previous <code>JobRun</code> to retry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param jobRunId <p>
     *            The ID of a previous <code>JobRun</code> to retry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartJobRunRequest withJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
        return this;
    }

    /**
     * <p>
     * The job arguments specifically for this run. For this job run, they
     * replace the default arguments set in the job definition itself.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script
     * consumes, as well as arguments that AWS Glue itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments,
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
     *         The job arguments specifically for this run. For this job run,
     *         they replace the default arguments set in the job definition
     *         itself.
     *         </p>
     *         <p>
     *         You can specify arguments here that your own job-execution script
     *         consumes, as well as arguments that AWS Glue itself consumes.
     *         </p>
     *         <p>
     *         For information about how to specify and consume your own Job
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
     * The job arguments specifically for this run. For this job run, they
     * replace the default arguments set in the job definition itself.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script
     * consumes, as well as arguments that AWS Glue itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments,
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
     *            The job arguments specifically for this run. For this job run,
     *            they replace the default arguments set in the job definition
     *            itself.
     *            </p>
     *            <p>
     *            You can specify arguments here that your own job-execution
     *            script consumes, as well as arguments that AWS Glue itself
     *            consumes.
     *            </p>
     *            <p>
     *            For information about how to specify and consume your own Job
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
     * The job arguments specifically for this run. For this job run, they
     * replace the default arguments set in the job definition itself.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script
     * consumes, as well as arguments that AWS Glue itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments,
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
     *            The job arguments specifically for this run. For this job run,
     *            they replace the default arguments set in the job definition
     *            itself.
     *            </p>
     *            <p>
     *            You can specify arguments here that your own job-execution
     *            script consumes, as well as arguments that AWS Glue itself
     *            consumes.
     *            </p>
     *            <p>
     *            For information about how to specify and consume your own Job
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
    public StartJobRunRequest withArguments(java.util.Map<String, String> arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * <p>
     * The job arguments specifically for this run. For this job run, they
     * replace the default arguments set in the job definition itself.
     * </p>
     * <p>
     * You can specify arguments here that your own job-execution script
     * consumes, as well as arguments that AWS Glue itself consumes.
     * </p>
     * <p>
     * For information about how to specify and consume your own Job arguments,
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
    public StartJobRunRequest addArgumentsEntry(String key, String value) {
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
    public StartJobRunRequest clearArgumentsEntries() {
        this.arguments = null;
        return this;
    }

    /**
     * <p>
     * This field is deprecated. Use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) to allocate to this
     * JobRun. From 2 to 100 DPUs can be allocated; the default is 10. A DPU is
     * a relative measure of processing power that consists of 4 vCPUs of
     * compute capacity and 16 GB of memory. For more information, see the <a
     * href
     * ="https://docs.aws.amazon.com/https:/aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     *
     * @return <p>
     *         This field is deprecated. Use <code>MaxCapacity</code> instead.
     *         </p>
     *         <p>
     *         The number of AWS Glue data processing units (DPUs) to allocate
     *         to this JobRun. From 2 to 100 DPUs can be allocated; the default
     *         is 10. A DPU is a relative measure of processing power that
     *         consists of 4 vCPUs of compute capacity and 16 GB of memory. For
     *         more information, see the <a href=
     *         "https://docs.aws.amazon.com/https:/aws.amazon.com/glue/pricing/"
     *         >AWS Glue pricing page</a>.
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
     * The number of AWS Glue data processing units (DPUs) to allocate to this
     * JobRun. From 2 to 100 DPUs can be allocated; the default is 10. A DPU is
     * a relative measure of processing power that consists of 4 vCPUs of
     * compute capacity and 16 GB of memory. For more information, see the <a
     * href
     * ="https://docs.aws.amazon.com/https:/aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     *
     * @param allocatedCapacity <p>
     *            This field is deprecated. Use <code>MaxCapacity</code>
     *            instead.
     *            </p>
     *            <p>
     *            The number of AWS Glue data processing units (DPUs) to
     *            allocate to this JobRun. From 2 to 100 DPUs can be allocated;
     *            the default is 10. A DPU is a relative measure of processing
     *            power that consists of 4 vCPUs of compute capacity and 16 GB
     *            of memory. For more information, see the <a href=
     *            "https://docs.aws.amazon.com/https:/aws.amazon.com/glue/pricing/"
     *            >AWS Glue pricing page</a>.
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
     * The number of AWS Glue data processing units (DPUs) to allocate to this
     * JobRun. From 2 to 100 DPUs can be allocated; the default is 10. A DPU is
     * a relative measure of processing power that consists of 4 vCPUs of
     * compute capacity and 16 GB of memory. For more information, see the <a
     * href
     * ="https://docs.aws.amazon.com/https:/aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
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
     *            The number of AWS Glue data processing units (DPUs) to
     *            allocate to this JobRun. From 2 to 100 DPUs can be allocated;
     *            the default is 10. A DPU is a relative measure of processing
     *            power that consists of 4 vCPUs of compute capacity and 16 GB
     *            of memory. For more information, see the <a href=
     *            "https://docs.aws.amazon.com/https:/aws.amazon.com/glue/pricing/"
     *            >AWS Glue pricing page</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartJobRunRequest withAllocatedCapacity(Integer allocatedCapacity) {
        this.allocatedCapacity = allocatedCapacity;
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
    public StartJobRunRequest withTimeout(Integer timeout) {
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
     * whether you are running a Python shell job, or an Apache Spark ETL job:
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
     *         depends on whether you are running a Python shell job, or an
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
     * whether you are running a Python shell job, or an Apache Spark ETL job:
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
     *            depends on whether you are running a Python shell job, or an
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
     * whether you are running a Python shell job, or an Apache Spark ETL job:
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
     *            depends on whether you are running a Python shell job, or an
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
    public StartJobRunRequest withMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
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
    public StartJobRunRequest withSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
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
    public StartJobRunRequest withNotificationProperty(NotificationProperty notificationProperty) {
        this.notificationProperty = notificationProperty;
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
    public StartJobRunRequest withWorkerType(String workerType) {
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
    public StartJobRunRequest withWorkerType(WorkerType workerType) {
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
    public StartJobRunRequest withNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
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
        if (getJobName() != null)
            sb.append("JobName: " + getJobName() + ",");
        if (getJobRunId() != null)
            sb.append("JobRunId: " + getJobRunId() + ",");
        if (getArguments() != null)
            sb.append("Arguments: " + getArguments() + ",");
        if (getAllocatedCapacity() != null)
            sb.append("AllocatedCapacity: " + getAllocatedCapacity() + ",");
        if (getTimeout() != null)
            sb.append("Timeout: " + getTimeout() + ",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: " + getMaxCapacity() + ",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: " + getSecurityConfiguration() + ",");
        if (getNotificationProperty() != null)
            sb.append("NotificationProperty: " + getNotificationProperty() + ",");
        if (getWorkerType() != null)
            sb.append("WorkerType: " + getWorkerType() + ",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: " + getNumberOfWorkers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobRunId() == null) ? 0 : getJobRunId().hashCode());
        hashCode = prime * hashCode + ((getArguments() == null) ? 0 : getArguments().hashCode());
        hashCode = prime * hashCode
                + ((getAllocatedCapacity() == null) ? 0 : getAllocatedCapacity().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode
                + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationProperty() == null) ? 0 : getNotificationProperty().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartJobRunRequest == false)
            return false;
        StartJobRunRequest other = (StartJobRunRequest) obj;

        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobRunId() == null ^ this.getJobRunId() == null)
            return false;
        if (other.getJobRunId() != null && other.getJobRunId().equals(this.getJobRunId()) == false)
            return false;
        if (other.getArguments() == null ^ this.getArguments() == null)
            return false;
        if (other.getArguments() != null
                && other.getArguments().equals(this.getArguments()) == false)
            return false;
        if (other.getAllocatedCapacity() == null ^ this.getAllocatedCapacity() == null)
            return false;
        if (other.getAllocatedCapacity() != null
                && other.getAllocatedCapacity().equals(this.getAllocatedCapacity()) == false)
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
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null
                && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        if (other.getNotificationProperty() == null ^ this.getNotificationProperty() == null)
            return false;
        if (other.getNotificationProperty() != null
                && other.getNotificationProperty().equals(this.getNotificationProperty()) == false)
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
        return true;
    }
}
