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

/**
 * <p>
 * Defines a condition under which a trigger fires.
 * </p>
 */
public class Condition implements Serializable {
    /**
     * <p>
     * A logical operator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS
     */
    private String logicalOperator;

    /**
     * <p>
     * The name of the job whose <code>JobRuns</code> this condition applies to,
     * and on which this trigger waits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String jobName;

    /**
     * <p>
     * The condition state. Currently, the only job states that a trigger can
     * listen for are <code>SUCCEEDED</code>, <code>STOPPED</code>,
     * <code>FAILED</code>, and <code>TIMEOUT</code>. The only crawler states
     * that a trigger can listen for are <code>SUCCEEDED</code>,
     * <code>FAILED</code>, and <code>CANCELLED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     */
    private String state;

    /**
     * <p>
     * The name of the crawler to which this condition applies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String crawlerName;

    /**
     * <p>
     * The state of the crawler to which this condition applies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, CANCELLING, CANCELLED, SUCCEEDED, FAILED
     */
    private String crawlState;

    /**
     * <p>
     * A logical operator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS
     *
     * @return <p>
     *         A logical operator.
     *         </p>
     * @see LogicalOperator
     */
    public String getLogicalOperator() {
        return logicalOperator;
    }

    /**
     * <p>
     * A logical operator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS
     *
     * @param logicalOperator <p>
     *            A logical operator.
     *            </p>
     * @see LogicalOperator
     */
    public void setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
    }

    /**
     * <p>
     * A logical operator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS
     *
     * @param logicalOperator <p>
     *            A logical operator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogicalOperator
     */
    public Condition withLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
        return this;
    }

    /**
     * <p>
     * A logical operator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS
     *
     * @param logicalOperator <p>
     *            A logical operator.
     *            </p>
     * @see LogicalOperator
     */
    public void setLogicalOperator(LogicalOperator logicalOperator) {
        this.logicalOperator = logicalOperator.toString();
    }

    /**
     * <p>
     * A logical operator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS
     *
     * @param logicalOperator <p>
     *            A logical operator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogicalOperator
     */
    public Condition withLogicalOperator(LogicalOperator logicalOperator) {
        this.logicalOperator = logicalOperator.toString();
        return this;
    }

    /**
     * <p>
     * The name of the job whose <code>JobRuns</code> this condition applies to,
     * and on which this trigger waits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the job whose <code>JobRuns</code> this condition
     *         applies to, and on which this trigger waits.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The name of the job whose <code>JobRuns</code> this condition applies to,
     * and on which this trigger waits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param jobName <p>
     *            The name of the job whose <code>JobRuns</code> this condition
     *            applies to, and on which this trigger waits.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job whose <code>JobRuns</code> this condition applies to,
     * and on which this trigger waits.
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
     *            The name of the job whose <code>JobRuns</code> this condition
     *            applies to, and on which this trigger waits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The condition state. Currently, the only job states that a trigger can
     * listen for are <code>SUCCEEDED</code>, <code>STOPPED</code>,
     * <code>FAILED</code>, and <code>TIMEOUT</code>. The only crawler states
     * that a trigger can listen for are <code>SUCCEEDED</code>,
     * <code>FAILED</code>, and <code>CANCELLED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @return <p>
     *         The condition state. Currently, the only job states that a
     *         trigger can listen for are <code>SUCCEEDED</code>,
     *         <code>STOPPED</code>, <code>FAILED</code>, and
     *         <code>TIMEOUT</code>. The only crawler states that a trigger can
     *         listen for are <code>SUCCEEDED</code>, <code>FAILED</code>, and
     *         <code>CANCELLED</code>.
     *         </p>
     * @see JobRunState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The condition state. Currently, the only job states that a trigger can
     * listen for are <code>SUCCEEDED</code>, <code>STOPPED</code>,
     * <code>FAILED</code>, and <code>TIMEOUT</code>. The only crawler states
     * that a trigger can listen for are <code>SUCCEEDED</code>,
     * <code>FAILED</code>, and <code>CANCELLED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @param state <p>
     *            The condition state. Currently, the only job states that a
     *            trigger can listen for are <code>SUCCEEDED</code>,
     *            <code>STOPPED</code>, <code>FAILED</code>, and
     *            <code>TIMEOUT</code>. The only crawler states that a trigger
     *            can listen for are <code>SUCCEEDED</code>, <code>FAILED</code>
     *            , and <code>CANCELLED</code>.
     *            </p>
     * @see JobRunState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The condition state. Currently, the only job states that a trigger can
     * listen for are <code>SUCCEEDED</code>, <code>STOPPED</code>,
     * <code>FAILED</code>, and <code>TIMEOUT</code>. The only crawler states
     * that a trigger can listen for are <code>SUCCEEDED</code>,
     * <code>FAILED</code>, and <code>CANCELLED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @param state <p>
     *            The condition state. Currently, the only job states that a
     *            trigger can listen for are <code>SUCCEEDED</code>,
     *            <code>STOPPED</code>, <code>FAILED</code>, and
     *            <code>TIMEOUT</code>. The only crawler states that a trigger
     *            can listen for are <code>SUCCEEDED</code>, <code>FAILED</code>
     *            , and <code>CANCELLED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobRunState
     */
    public Condition withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The condition state. Currently, the only job states that a trigger can
     * listen for are <code>SUCCEEDED</code>, <code>STOPPED</code>,
     * <code>FAILED</code>, and <code>TIMEOUT</code>. The only crawler states
     * that a trigger can listen for are <code>SUCCEEDED</code>,
     * <code>FAILED</code>, and <code>CANCELLED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @param state <p>
     *            The condition state. Currently, the only job states that a
     *            trigger can listen for are <code>SUCCEEDED</code>,
     *            <code>STOPPED</code>, <code>FAILED</code>, and
     *            <code>TIMEOUT</code>. The only crawler states that a trigger
     *            can listen for are <code>SUCCEEDED</code>, <code>FAILED</code>
     *            , and <code>CANCELLED</code>.
     *            </p>
     * @see JobRunState
     */
    public void setState(JobRunState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The condition state. Currently, the only job states that a trigger can
     * listen for are <code>SUCCEEDED</code>, <code>STOPPED</code>,
     * <code>FAILED</code>, and <code>TIMEOUT</code>. The only crawler states
     * that a trigger can listen for are <code>SUCCEEDED</code>,
     * <code>FAILED</code>, and <code>CANCELLED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED,
     * FAILED, TIMEOUT
     *
     * @param state <p>
     *            The condition state. Currently, the only job states that a
     *            trigger can listen for are <code>SUCCEEDED</code>,
     *            <code>STOPPED</code>, <code>FAILED</code>, and
     *            <code>TIMEOUT</code>. The only crawler states that a trigger
     *            can listen for are <code>SUCCEEDED</code>, <code>FAILED</code>
     *            , and <code>CANCELLED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobRunState
     */
    public Condition withState(JobRunState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The name of the crawler to which this condition applies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the crawler to which this condition applies.
     *         </p>
     */
    public String getCrawlerName() {
        return crawlerName;
    }

    /**
     * <p>
     * The name of the crawler to which this condition applies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param crawlerName <p>
     *            The name of the crawler to which this condition applies.
     *            </p>
     */
    public void setCrawlerName(String crawlerName) {
        this.crawlerName = crawlerName;
    }

    /**
     * <p>
     * The name of the crawler to which this condition applies.
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
     *            The name of the crawler to which this condition applies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withCrawlerName(String crawlerName) {
        this.crawlerName = crawlerName;
        return this;
    }

    /**
     * <p>
     * The state of the crawler to which this condition applies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, CANCELLING, CANCELLED, SUCCEEDED, FAILED
     *
     * @return <p>
     *         The state of the crawler to which this condition applies.
     *         </p>
     * @see CrawlState
     */
    public String getCrawlState() {
        return crawlState;
    }

    /**
     * <p>
     * The state of the crawler to which this condition applies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, CANCELLING, CANCELLED, SUCCEEDED, FAILED
     *
     * @param crawlState <p>
     *            The state of the crawler to which this condition applies.
     *            </p>
     * @see CrawlState
     */
    public void setCrawlState(String crawlState) {
        this.crawlState = crawlState;
    }

    /**
     * <p>
     * The state of the crawler to which this condition applies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, CANCELLING, CANCELLED, SUCCEEDED, FAILED
     *
     * @param crawlState <p>
     *            The state of the crawler to which this condition applies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CrawlState
     */
    public Condition withCrawlState(String crawlState) {
        this.crawlState = crawlState;
        return this;
    }

    /**
     * <p>
     * The state of the crawler to which this condition applies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, CANCELLING, CANCELLED, SUCCEEDED, FAILED
     *
     * @param crawlState <p>
     *            The state of the crawler to which this condition applies.
     *            </p>
     * @see CrawlState
     */
    public void setCrawlState(CrawlState crawlState) {
        this.crawlState = crawlState.toString();
    }

    /**
     * <p>
     * The state of the crawler to which this condition applies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, CANCELLING, CANCELLED, SUCCEEDED, FAILED
     *
     * @param crawlState <p>
     *            The state of the crawler to which this condition applies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CrawlState
     */
    public Condition withCrawlState(CrawlState crawlState) {
        this.crawlState = crawlState.toString();
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
        if (getLogicalOperator() != null)
            sb.append("LogicalOperator: " + getLogicalOperator() + ",");
        if (getJobName() != null)
            sb.append("JobName: " + getJobName() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getCrawlerName() != null)
            sb.append("CrawlerName: " + getCrawlerName() + ",");
        if (getCrawlState() != null)
            sb.append("CrawlState: " + getCrawlState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLogicalOperator() == null) ? 0 : getLogicalOperator().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getCrawlerName() == null) ? 0 : getCrawlerName().hashCode());
        hashCode = prime * hashCode + ((getCrawlState() == null) ? 0 : getCrawlState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Condition == false)
            return false;
        Condition other = (Condition) obj;

        if (other.getLogicalOperator() == null ^ this.getLogicalOperator() == null)
            return false;
        if (other.getLogicalOperator() != null
                && other.getLogicalOperator().equals(this.getLogicalOperator()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCrawlerName() == null ^ this.getCrawlerName() == null)
            return false;
        if (other.getCrawlerName() != null
                && other.getCrawlerName().equals(this.getCrawlerName()) == false)
            return false;
        if (other.getCrawlState() == null ^ this.getCrawlState() == null)
            return false;
        if (other.getCrawlState() != null
                && other.getCrawlState().equals(this.getCrawlState()) == false)
            return false;
        return true;
    }
}
