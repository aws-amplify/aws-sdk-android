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
 * The details of a crawl in the workflow.
 * </p>
 */
public class Crawl implements Serializable {
    /**
     * <p>
     * The state of the crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, CANCELLING, CANCELLED, SUCCEEDED, FAILED
     */
    private String state;

    /**
     * <p>
     * The date and time on which the crawl started.
     * </p>
     */
    private java.util.Date startedOn;

    /**
     * <p>
     * The date and time on which the crawl completed.
     * </p>
     */
    private java.util.Date completedOn;

    /**
     * <p>
     * The error message associated with the crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String errorMessage;

    /**
     * <p>
     * The log group associated with the crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     */
    private String logGroup;

    /**
     * <p>
     * The log stream associated with the crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String logStream;

    /**
     * <p>
     * The state of the crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, CANCELLING, CANCELLED, SUCCEEDED, FAILED
     *
     * @return <p>
     *         The state of the crawler.
     *         </p>
     * @see CrawlState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, CANCELLING, CANCELLED, SUCCEEDED, FAILED
     *
     * @param state <p>
     *            The state of the crawler.
     *            </p>
     * @see CrawlState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the crawler.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, CANCELLING, CANCELLED, SUCCEEDED, FAILED
     *
     * @param state <p>
     *            The state of the crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CrawlState
     */
    public Crawl withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, CANCELLING, CANCELLED, SUCCEEDED, FAILED
     *
     * @param state <p>
     *            The state of the crawler.
     *            </p>
     * @see CrawlState
     */
    public void setState(CrawlState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the crawler.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, CANCELLING, CANCELLED, SUCCEEDED, FAILED
     *
     * @param state <p>
     *            The state of the crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CrawlState
     */
    public Crawl withState(CrawlState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date and time on which the crawl started.
     * </p>
     *
     * @return <p>
     *         The date and time on which the crawl started.
     *         </p>
     */
    public java.util.Date getStartedOn() {
        return startedOn;
    }

    /**
     * <p>
     * The date and time on which the crawl started.
     * </p>
     *
     * @param startedOn <p>
     *            The date and time on which the crawl started.
     *            </p>
     */
    public void setStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
    }

    /**
     * <p>
     * The date and time on which the crawl started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startedOn <p>
     *            The date and time on which the crawl started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawl withStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
        return this;
    }

    /**
     * <p>
     * The date and time on which the crawl completed.
     * </p>
     *
     * @return <p>
     *         The date and time on which the crawl completed.
     *         </p>
     */
    public java.util.Date getCompletedOn() {
        return completedOn;
    }

    /**
     * <p>
     * The date and time on which the crawl completed.
     * </p>
     *
     * @param completedOn <p>
     *            The date and time on which the crawl completed.
     *            </p>
     */
    public void setCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
    }

    /**
     * <p>
     * The date and time on which the crawl completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completedOn <p>
     *            The date and time on which the crawl completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawl withCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
        return this;
    }

    /**
     * <p>
     * The error message associated with the crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The error message associated with the crawl.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * The error message associated with the crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param errorMessage <p>
     *            The error message associated with the crawl.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message associated with the crawl.
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
     * @param errorMessage <p>
     *            The error message associated with the crawl.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawl withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * <p>
     * The log group associated with the crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return <p>
     *         The log group associated with the crawl.
     *         </p>
     */
    public String getLogGroup() {
        return logGroup;
    }

    /**
     * <p>
     * The log group associated with the crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroup <p>
     *            The log group associated with the crawl.
     *            </p>
     */
    public void setLogGroup(String logGroup) {
        this.logGroup = logGroup;
    }

    /**
     * <p>
     * The log group associated with the crawl.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroup <p>
     *            The log group associated with the crawl.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawl withLogGroup(String logGroup) {
        this.logGroup = logGroup;
        return this;
    }

    /**
     * <p>
     * The log stream associated with the crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return <p>
     *         The log stream associated with the crawl.
     *         </p>
     */
    public String getLogStream() {
        return logStream;
    }

    /**
     * <p>
     * The log stream associated with the crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStream <p>
     *            The log stream associated with the crawl.
     *            </p>
     */
    public void setLogStream(String logStream) {
        this.logStream = logStream;
    }

    /**
     * <p>
     * The log stream associated with the crawl.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStream <p>
     *            The log stream associated with the crawl.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Crawl withLogStream(String logStream) {
        this.logStream = logStream;
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
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStartedOn() != null)
            sb.append("StartedOn: " + getStartedOn() + ",");
        if (getCompletedOn() != null)
            sb.append("CompletedOn: " + getCompletedOn() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage() + ",");
        if (getLogGroup() != null)
            sb.append("LogGroup: " + getLogGroup() + ",");
        if (getLogStream() != null)
            sb.append("LogStream: " + getLogStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStartedOn() == null) ? 0 : getStartedOn().hashCode());
        hashCode = prime * hashCode
                + ((getCompletedOn() == null) ? 0 : getCompletedOn().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getLogGroup() == null) ? 0 : getLogGroup().hashCode());
        hashCode = prime * hashCode + ((getLogStream() == null) ? 0 : getLogStream().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Crawl == false)
            return false;
        Crawl other = (Crawl) obj;

        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStartedOn() == null ^ this.getStartedOn() == null)
            return false;
        if (other.getStartedOn() != null
                && other.getStartedOn().equals(this.getStartedOn()) == false)
            return false;
        if (other.getCompletedOn() == null ^ this.getCompletedOn() == null)
            return false;
        if (other.getCompletedOn() != null
                && other.getCompletedOn().equals(this.getCompletedOn()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getLogGroup() == null ^ this.getLogGroup() == null)
            return false;
        if (other.getLogGroup() != null && other.getLogGroup().equals(this.getLogGroup()) == false)
            return false;
        if (other.getLogStream() == null ^ this.getLogStream() == null)
            return false;
        if (other.getLogStream() != null
                && other.getLogStream().equals(this.getLogStream()) == false)
            return false;
        return true;
    }
}
