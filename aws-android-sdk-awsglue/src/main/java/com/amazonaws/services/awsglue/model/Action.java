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
 * Defines an action to be initiated by a trigger.
 * </p>
 */
public class Action implements Serializable {
    /**
     * <p>
     * The name of a job to be executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String jobName;

    /**
     * <p>
     * The job arguments used when this trigger fires. For this job run, they
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
     * The name of the <code>SecurityConfiguration</code> structure to be used
     * with this action.
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
     * The name of the crawler to be used with this action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String crawlerName;

    /**
     * <p>
     * The name of a job to be executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of a job to be executed.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The name of a job to be executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param jobName <p>
     *            The name of a job to be executed.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of a job to be executed.
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
     *            The name of a job to be executed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The job arguments used when this trigger fires. For this job run, they
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
     *         The job arguments used when this trigger fires. For this job run,
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
     * The job arguments used when this trigger fires. For this job run, they
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
     *            The job arguments used when this trigger fires. For this job
     *            run, they replace the default arguments set in the job
     *            definition itself.
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
     * The job arguments used when this trigger fires. For this job run, they
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
     *            The job arguments used when this trigger fires. For this job
     *            run, they replace the default arguments set in the job
     *            definition itself.
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
    public Action withArguments(java.util.Map<String, String> arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * <p>
     * The job arguments used when this trigger fires. For this job run, they
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
    public Action addArgumentsEntry(String key, String value) {
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
    public Action clearArgumentsEntries() {
        this.arguments = null;
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
    public Action withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used
     * with this action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the <code>SecurityConfiguration</code> structure to
     *         be used with this action.
     *         </p>
     */
    public String getSecurityConfiguration() {
        return securityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used
     * with this action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param securityConfiguration <p>
     *            The name of the <code>SecurityConfiguration</code> structure
     *            to be used with this action.
     *            </p>
     */
    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used
     * with this action.
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
     *            to be used with this action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withSecurityConfiguration(String securityConfiguration) {
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
    public Action withNotificationProperty(NotificationProperty notificationProperty) {
        this.notificationProperty = notificationProperty;
        return this;
    }

    /**
     * <p>
     * The name of the crawler to be used with this action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the crawler to be used with this action.
     *         </p>
     */
    public String getCrawlerName() {
        return crawlerName;
    }

    /**
     * <p>
     * The name of the crawler to be used with this action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param crawlerName <p>
     *            The name of the crawler to be used with this action.
     *            </p>
     */
    public void setCrawlerName(String crawlerName) {
        this.crawlerName = crawlerName;
    }

    /**
     * <p>
     * The name of the crawler to be used with this action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param crawlerName <p>
     *            The name of the crawler to be used with this action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withCrawlerName(String crawlerName) {
        this.crawlerName = crawlerName;
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
        if (getArguments() != null)
            sb.append("Arguments: " + getArguments() + ",");
        if (getTimeout() != null)
            sb.append("Timeout: " + getTimeout() + ",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: " + getSecurityConfiguration() + ",");
        if (getNotificationProperty() != null)
            sb.append("NotificationProperty: " + getNotificationProperty() + ",");
        if (getCrawlerName() != null)
            sb.append("CrawlerName: " + getCrawlerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getArguments() == null) ? 0 : getArguments().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationProperty() == null) ? 0 : getNotificationProperty().hashCode());
        hashCode = prime * hashCode
                + ((getCrawlerName() == null) ? 0 : getCrawlerName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Action == false)
            return false;
        Action other = (Action) obj;

        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getArguments() == null ^ this.getArguments() == null)
            return false;
        if (other.getArguments() != null
                && other.getArguments().equals(this.getArguments()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
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
        if (other.getCrawlerName() == null ^ this.getCrawlerName() == null)
            return false;
        if (other.getCrawlerName() != null
                && other.getCrawlerName().equals(this.getCrawlerName()) == false)
            return false;
        return true;
    }
}
