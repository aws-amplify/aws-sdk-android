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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new job definition.
 * </p>
 */
public class CreateJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name you assign to this job definition. It must be unique in your
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * Description of the job being defined.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String description;

    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     */
    private String logUri;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role associated with
     * this job.
     * </p>
     */
    private String role;

    /**
     * <p>
     * An <code>ExecutionProperty</code> specifying the maximum number of
     * concurrent runs allowed for this job.
     * </p>
     */
    private ExecutionProperty executionProperty;

    /**
     * <p>
     * The <code>JobCommand</code> that executes this job.
     * </p>
     */
    private JobCommand command;

    /**
     * <p>
     * The default arguments for this job.
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
    private java.util.Map<String, String> defaultArguments;

    /**
     * <p>
     * Non-overridable arguments for this job, specified as name-value pairs.
     * </p>
     */
    private java.util.Map<String, String> nonOverridableArguments;

    /**
     * <p>
     * The connections used for this job.
     * </p>
     */
    private ConnectionsList connections;

    /**
     * <p>
     * The maximum number of times to retry this job if it fails.
     * </p>
     */
    private Integer maxRetries;

    /**
     * <p>
     * This parameter is deprecated. Use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) to allocate to this
     * Job. You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a
     * relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     */
    private Integer allocatedCapacity;

    /**
     * <p>
     * The job timeout in minutes. This is the maximum time that a job run can
     * consume resources before it is terminated and enters <code>TIMEOUT</code>
     * status. The default is 2,880 minutes (48 hours).
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
     * information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
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
     * The name of the <code>SecurityConfiguration</code> structure to be used
     * with this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String securityConfiguration;

    /**
     * <p>
     * The tags to use with this job. You may use tags to limit access to the
     * job. For more information about tags in AWS Glue, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS
     * Tags in AWS Glue</a> in the developer guide.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Specifies configuration properties of a job notification.
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
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU,
     * 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU,
     * 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
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
     * The name you assign to this job definition. It must be unique in your
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name you assign to this job definition. It must be unique in
     *         your account.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name you assign to this job definition. It must be unique in your
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name you assign to this job definition. It must be unique
     *            in your account.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name you assign to this job definition. It must be unique in your
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name you assign to this job definition. It must be unique
     *            in your account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Description of the job being defined.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Description of the job being defined.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Description of the job being defined.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param description <p>
     *            Description of the job being defined.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the job being defined.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param description <p>
     *            Description of the job being defined.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     *
     * @return <p>
     *         This field is reserved for future use.
     *         </p>
     */
    public String getLogUri() {
        return logUri;
    }

    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     *
     * @param logUri <p>
     *            This field is reserved for future use.
     *            </p>
     */
    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }

    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logUri <p>
     *            This field is reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withLogUri(String logUri) {
        this.logUri = logUri;
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role associated with
     * this job.
     * </p>
     *
     * @return <p>
     *         The name or Amazon Resource Name (ARN) of the IAM role associated
     *         with this job.
     *         </p>
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role associated with
     * this job.
     * </p>
     *
     * @param role <p>
     *            The name or Amazon Resource Name (ARN) of the IAM role
     *            associated with this job.
     *            </p>
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role associated with
     * this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param role <p>
     *            The name or Amazon Resource Name (ARN) of the IAM role
     *            associated with this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * An <code>ExecutionProperty</code> specifying the maximum number of
     * concurrent runs allowed for this job.
     * </p>
     *
     * @return <p>
     *         An <code>ExecutionProperty</code> specifying the maximum number
     *         of concurrent runs allowed for this job.
     *         </p>
     */
    public ExecutionProperty getExecutionProperty() {
        return executionProperty;
    }

    /**
     * <p>
     * An <code>ExecutionProperty</code> specifying the maximum number of
     * concurrent runs allowed for this job.
     * </p>
     *
     * @param executionProperty <p>
     *            An <code>ExecutionProperty</code> specifying the maximum
     *            number of concurrent runs allowed for this job.
     *            </p>
     */
    public void setExecutionProperty(ExecutionProperty executionProperty) {
        this.executionProperty = executionProperty;
    }

    /**
     * <p>
     * An <code>ExecutionProperty</code> specifying the maximum number of
     * concurrent runs allowed for this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionProperty <p>
     *            An <code>ExecutionProperty</code> specifying the maximum
     *            number of concurrent runs allowed for this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withExecutionProperty(ExecutionProperty executionProperty) {
        this.executionProperty = executionProperty;
        return this;
    }

    /**
     * <p>
     * The <code>JobCommand</code> that executes this job.
     * </p>
     *
     * @return <p>
     *         The <code>JobCommand</code> that executes this job.
     *         </p>
     */
    public JobCommand getCommand() {
        return command;
    }

    /**
     * <p>
     * The <code>JobCommand</code> that executes this job.
     * </p>
     *
     * @param command <p>
     *            The <code>JobCommand</code> that executes this job.
     *            </p>
     */
    public void setCommand(JobCommand command) {
        this.command = command;
    }

    /**
     * <p>
     * The <code>JobCommand</code> that executes this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param command <p>
     *            The <code>JobCommand</code> that executes this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withCommand(JobCommand command) {
        this.command = command;
        return this;
    }

    /**
     * <p>
     * The default arguments for this job.
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
     *         The default arguments for this job.
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
    public java.util.Map<String, String> getDefaultArguments() {
        return defaultArguments;
    }

    /**
     * <p>
     * The default arguments for this job.
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
     * @param defaultArguments <p>
     *            The default arguments for this job.
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
    public void setDefaultArguments(java.util.Map<String, String> defaultArguments) {
        this.defaultArguments = defaultArguments;
    }

    /**
     * <p>
     * The default arguments for this job.
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
     * @param defaultArguments <p>
     *            The default arguments for this job.
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
    public CreateJobRequest withDefaultArguments(java.util.Map<String, String> defaultArguments) {
        this.defaultArguments = defaultArguments;
        return this;
    }

    /**
     * <p>
     * The default arguments for this job.
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
     * The method adds a new key-value pair into DefaultArguments parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into DefaultArguments.
     * @param value The corresponding value of the entry to be added into
     *            DefaultArguments.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest addDefaultArgumentsEntry(String key, String value) {
        if (null == this.defaultArguments) {
            this.defaultArguments = new java.util.HashMap<String, String>();
        }
        if (this.defaultArguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.defaultArguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DefaultArguments.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateJobRequest clearDefaultArgumentsEntries() {
        this.defaultArguments = null;
        return this;
    }

    /**
     * <p>
     * Non-overridable arguments for this job, specified as name-value pairs.
     * </p>
     *
     * @return <p>
     *         Non-overridable arguments for this job, specified as name-value
     *         pairs.
     *         </p>
     */
    public java.util.Map<String, String> getNonOverridableArguments() {
        return nonOverridableArguments;
    }

    /**
     * <p>
     * Non-overridable arguments for this job, specified as name-value pairs.
     * </p>
     *
     * @param nonOverridableArguments <p>
     *            Non-overridable arguments for this job, specified as
     *            name-value pairs.
     *            </p>
     */
    public void setNonOverridableArguments(java.util.Map<String, String> nonOverridableArguments) {
        this.nonOverridableArguments = nonOverridableArguments;
    }

    /**
     * <p>
     * Non-overridable arguments for this job, specified as name-value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nonOverridableArguments <p>
     *            Non-overridable arguments for this job, specified as
     *            name-value pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withNonOverridableArguments(
            java.util.Map<String, String> nonOverridableArguments) {
        this.nonOverridableArguments = nonOverridableArguments;
        return this;
    }

    /**
     * <p>
     * Non-overridable arguments for this job, specified as name-value pairs.
     * </p>
     * <p>
     * The method adds a new key-value pair into NonOverridableArguments
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into NonOverridableArguments.
     * @param value The corresponding value of the entry to be added into
     *            NonOverridableArguments.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest addNonOverridableArgumentsEntry(String key, String value) {
        if (null == this.nonOverridableArguments) {
            this.nonOverridableArguments = new java.util.HashMap<String, String>();
        }
        if (this.nonOverridableArguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.nonOverridableArguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into NonOverridableArguments.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateJobRequest clearNonOverridableArgumentsEntries() {
        this.nonOverridableArguments = null;
        return this;
    }

    /**
     * <p>
     * The connections used for this job.
     * </p>
     *
     * @return <p>
     *         The connections used for this job.
     *         </p>
     */
    public ConnectionsList getConnections() {
        return connections;
    }

    /**
     * <p>
     * The connections used for this job.
     * </p>
     *
     * @param connections <p>
     *            The connections used for this job.
     *            </p>
     */
    public void setConnections(ConnectionsList connections) {
        this.connections = connections;
    }

    /**
     * <p>
     * The connections used for this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connections <p>
     *            The connections used for this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withConnections(ConnectionsList connections) {
        this.connections = connections;
        return this;
    }

    /**
     * <p>
     * The maximum number of times to retry this job if it fails.
     * </p>
     *
     * @return <p>
     *         The maximum number of times to retry this job if it fails.
     *         </p>
     */
    public Integer getMaxRetries() {
        return maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry this job if it fails.
     * </p>
     *
     * @param maxRetries <p>
     *            The maximum number of times to retry this job if it fails.
     *            </p>
     */
    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry this job if it fails.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRetries <p>
     *            The maximum number of times to retry this job if it fails.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    /**
     * <p>
     * This parameter is deprecated. Use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) to allocate to this
     * Job. You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a
     * relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     *
     * @return <p>
     *         This parameter is deprecated. Use <code>MaxCapacity</code>
     *         instead.
     *         </p>
     *         <p>
     *         The number of AWS Glue data processing units (DPUs) to allocate
     *         to this Job. You can allocate from 2 to 100 DPUs; the default is
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
     * This parameter is deprecated. Use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) to allocate to this
     * Job. You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a
     * relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     *
     * @param allocatedCapacity <p>
     *            This parameter is deprecated. Use <code>MaxCapacity</code>
     *            instead.
     *            </p>
     *            <p>
     *            The number of AWS Glue data processing units (DPUs) to
     *            allocate to this Job. You can allocate from 2 to 100 DPUs; the
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
     * This parameter is deprecated. Use <code>MaxCapacity</code> instead.
     * </p>
     * <p>
     * The number of AWS Glue data processing units (DPUs) to allocate to this
     * Job. You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a
     * relative measure of processing power that consists of 4 vCPUs of compute
     * capacity and 16 GB of memory. For more information, see the <a
     * href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing page</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocatedCapacity <p>
     *            This parameter is deprecated. Use <code>MaxCapacity</code>
     *            instead.
     *            </p>
     *            <p>
     *            The number of AWS Glue data processing units (DPUs) to
     *            allocate to this Job. You can allocate from 2 to 100 DPUs; the
     *            default is 10. A DPU is a relative measure of processing power
     *            that consists of 4 vCPUs of compute capacity and 16 GB of
     *            memory. For more information, see the <a
     *            href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing
     *            page</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withAllocatedCapacity(Integer allocatedCapacity) {
        this.allocatedCapacity = allocatedCapacity;
        return this;
    }

    /**
     * <p>
     * The job timeout in minutes. This is the maximum time that a job run can
     * consume resources before it is terminated and enters <code>TIMEOUT</code>
     * status. The default is 2,880 minutes (48 hours).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The job timeout in minutes. This is the maximum time that a job
     *         run can consume resources before it is terminated and enters
     *         <code>TIMEOUT</code> status. The default is 2,880 minutes (48
     *         hours).
     *         </p>
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * <p>
     * The job timeout in minutes. This is the maximum time that a job run can
     * consume resources before it is terminated and enters <code>TIMEOUT</code>
     * status. The default is 2,880 minutes (48 hours).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeout <p>
     *            The job timeout in minutes. This is the maximum time that a
     *            job run can consume resources before it is terminated and
     *            enters <code>TIMEOUT</code> status. The default is 2,880
     *            minutes (48 hours).
     *            </p>
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The job timeout in minutes. This is the maximum time that a job run can
     * consume resources before it is terminated and enters <code>TIMEOUT</code>
     * status. The default is 2,880 minutes (48 hours).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeout <p>
     *            The job timeout in minutes. This is the maximum time that a
     *            job run can consume resources before it is terminated and
     *            enters <code>TIMEOUT</code> status. The default is 2,880
     *            minutes (48 hours).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that can be allocated
     * when this job runs. A DPU is a relative measure of processing power that
     * consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
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
     *         16 GB of memory. For more information, see the <a
     *         href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing
     *         page</a>.
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
     * information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
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
     *            href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing
     *            page</a>.
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
     * information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
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
     *            href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing
     *            page</a>.
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
    public CreateJobRequest withMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used
     * with this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the <code>SecurityConfiguration</code> structure to
     *         be used with this job.
     *         </p>
     */
    public String getSecurityConfiguration() {
        return securityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used
     * with this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param securityConfiguration <p>
     *            The name of the <code>SecurityConfiguration</code> structure
     *            to be used with this job.
     *            </p>
     */
    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used
     * with this job.
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
     *            to be used with this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
        return this;
    }

    /**
     * <p>
     * The tags to use with this job. You may use tags to limit access to the
     * job. For more information about tags in AWS Glue, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS
     * Tags in AWS Glue</a> in the developer guide.
     * </p>
     *
     * @return <p>
     *         The tags to use with this job. You may use tags to limit access
     *         to the job. For more information about tags in AWS Glue, see <a
     *         href
     *         ="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html"
     *         >AWS Tags in AWS Glue</a> in the developer guide.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to use with this job. You may use tags to limit access to the
     * job. For more information about tags in AWS Glue, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS
     * Tags in AWS Glue</a> in the developer guide.
     * </p>
     *
     * @param tags <p>
     *            The tags to use with this job. You may use tags to limit
     *            access to the job. For more information about tags in AWS
     *            Glue, see <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html"
     *            >AWS Tags in AWS Glue</a> in the developer guide.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to use with this job. You may use tags to limit access to the
     * job. For more information about tags in AWS Glue, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS
     * Tags in AWS Glue</a> in the developer guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to use with this job. You may use tags to limit
     *            access to the job. For more information about tags in AWS
     *            Glue, see <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html"
     *            >AWS Tags in AWS Glue</a> in the developer guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags to use with this job. You may use tags to limit access to the
     * job. For more information about tags in AWS Glue, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS
     * Tags in AWS Glue</a> in the developer guide.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateJobRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Specifies configuration properties of a job notification.
     * </p>
     *
     * @return <p>
     *         Specifies configuration properties of a job notification.
     *         </p>
     */
    public NotificationProperty getNotificationProperty() {
        return notificationProperty;
    }

    /**
     * <p>
     * Specifies configuration properties of a job notification.
     * </p>
     *
     * @param notificationProperty <p>
     *            Specifies configuration properties of a job notification.
     *            </p>
     */
    public void setNotificationProperty(NotificationProperty notificationProperty) {
        this.notificationProperty = notificationProperty;
    }

    /**
     * <p>
     * Specifies configuration properties of a job notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationProperty <p>
     *            Specifies configuration properties of a job notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withNotificationProperty(NotificationProperty notificationProperty) {
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
    public CreateJobRequest withGlueVersion(String glueVersion) {
        this.glueVersion = glueVersion;
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
    public CreateJobRequest withNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
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
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU,
     * 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU,
     * 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
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
     *         For the <code>G.1X</code> worker type, each worker maps to 1 DPU
     *         (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1 executor
     *         per worker. We recommend this worker type for memory-intensive
     *         jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.2X</code> worker type, each worker maps to 2 DPU
     *         (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1 executor
     *         per worker. We recommend this worker type for memory-intensive
     *         jobs.
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
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU,
     * 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU,
     * 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
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
     *            For the <code>G.1X</code> worker type, each worker maps to 1
     *            DPU (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1
     *            executor per worker. We recommend this worker type for
     *            memory-intensive jobs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker maps to 2
     *            DPU (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1
     *            executor per worker. We recommend this worker type for
     *            memory-intensive jobs.
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
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU,
     * 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU,
     * 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
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
     *            For the <code>G.1X</code> worker type, each worker maps to 1
     *            DPU (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1
     *            executor per worker. We recommend this worker type for
     *            memory-intensive jobs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker maps to 2
     *            DPU (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1
     *            executor per worker. We recommend this worker type for
     *            memory-intensive jobs.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkerType
     */
    public CreateJobRequest withWorkerType(String workerType) {
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
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU,
     * 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU,
     * 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
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
     *            For the <code>G.1X</code> worker type, each worker maps to 1
     *            DPU (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1
     *            executor per worker. We recommend this worker type for
     *            memory-intensive jobs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker maps to 2
     *            DPU (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1
     *            executor per worker. We recommend this worker type for
     *            memory-intensive jobs.
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
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU,
     * 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU,
     * 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We
     * recommend this worker type for memory-intensive jobs.
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
     *            For the <code>G.1X</code> worker type, each worker maps to 1
     *            DPU (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1
     *            executor per worker. We recommend this worker type for
     *            memory-intensive jobs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker maps to 2
     *            DPU (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1
     *            executor per worker. We recommend this worker type for
     *            memory-intensive jobs.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkerType
     */
    public CreateJobRequest withWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getLogUri() != null)
            sb.append("LogUri: " + getLogUri() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole() + ",");
        if (getExecutionProperty() != null)
            sb.append("ExecutionProperty: " + getExecutionProperty() + ",");
        if (getCommand() != null)
            sb.append("Command: " + getCommand() + ",");
        if (getDefaultArguments() != null)
            sb.append("DefaultArguments: " + getDefaultArguments() + ",");
        if (getNonOverridableArguments() != null)
            sb.append("NonOverridableArguments: " + getNonOverridableArguments() + ",");
        if (getConnections() != null)
            sb.append("Connections: " + getConnections() + ",");
        if (getMaxRetries() != null)
            sb.append("MaxRetries: " + getMaxRetries() + ",");
        if (getAllocatedCapacity() != null)
            sb.append("AllocatedCapacity: " + getAllocatedCapacity() + ",");
        if (getTimeout() != null)
            sb.append("Timeout: " + getTimeout() + ",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: " + getMaxCapacity() + ",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: " + getSecurityConfiguration() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getNotificationProperty() != null)
            sb.append("NotificationProperty: " + getNotificationProperty() + ",");
        if (getGlueVersion() != null)
            sb.append("GlueVersion: " + getGlueVersion() + ",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: " + getNumberOfWorkers() + ",");
        if (getWorkerType() != null)
            sb.append("WorkerType: " + getWorkerType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLogUri() == null) ? 0 : getLogUri().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionProperty() == null) ? 0 : getExecutionProperty().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultArguments() == null) ? 0 : getDefaultArguments().hashCode());
        hashCode = prime
                * hashCode
                + ((getNonOverridableArguments() == null) ? 0 : getNonOverridableArguments()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getConnections() == null) ? 0 : getConnections().hashCode());
        hashCode = prime * hashCode + ((getMaxRetries() == null) ? 0 : getMaxRetries().hashCode());
        hashCode = prime * hashCode
                + ((getAllocatedCapacity() == null) ? 0 : getAllocatedCapacity().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode
                + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationProperty() == null) ? 0 : getNotificationProperty().hashCode());
        hashCode = prime * hashCode
                + ((getGlueVersion() == null) ? 0 : getGlueVersion().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobRequest == false)
            return false;
        CreateJobRequest other = (CreateJobRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLogUri() == null ^ this.getLogUri() == null)
            return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getExecutionProperty() == null ^ this.getExecutionProperty() == null)
            return false;
        if (other.getExecutionProperty() != null
                && other.getExecutionProperty().equals(this.getExecutionProperty()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getDefaultArguments() == null ^ this.getDefaultArguments() == null)
            return false;
        if (other.getDefaultArguments() != null
                && other.getDefaultArguments().equals(this.getDefaultArguments()) == false)
            return false;
        if (other.getNonOverridableArguments() == null ^ this.getNonOverridableArguments() == null)
            return false;
        if (other.getNonOverridableArguments() != null
                && other.getNonOverridableArguments().equals(this.getNonOverridableArguments()) == false)
            return false;
        if (other.getConnections() == null ^ this.getConnections() == null)
            return false;
        if (other.getConnections() != null
                && other.getConnections().equals(this.getConnections()) == false)
            return false;
        if (other.getMaxRetries() == null ^ this.getMaxRetries() == null)
            return false;
        if (other.getMaxRetries() != null
                && other.getMaxRetries().equals(this.getMaxRetries()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        if (other.getNumberOfWorkers() == null ^ this.getNumberOfWorkers() == null)
            return false;
        if (other.getNumberOfWorkers() != null
                && other.getNumberOfWorkers().equals(this.getNumberOfWorkers()) == false)
            return false;
        if (other.getWorkerType() == null ^ this.getWorkerType() == null)
            return false;
        if (other.getWorkerType() != null
                && other.getWorkerType().equals(this.getWorkerType()) == false)
            return false;
        return true;
    }
}
