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
 * Status and error information about the most recent crawl.
 * </p>
 */
public class LastCrawlInfo implements Serializable {
    /**
     * <p>
     * Status of the last crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, CANCELLED, FAILED
     */
    private String status;

    /**
     * <p>
     * If an error occurred, the error information about the last crawl.
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
     * The log group for the last crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     */
    private String logGroup;

    /**
     * <p>
     * The log stream for the last crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String logStream;

    /**
     * <p>
     * The prefix for a message about this crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String messagePrefix;

    /**
     * <p>
     * The time at which the crawl started.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * Status of the last crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, CANCELLED, FAILED
     *
     * @return <p>
     *         Status of the last crawl.
     *         </p>
     * @see LastCrawlStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Status of the last crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, CANCELLED, FAILED
     *
     * @param status <p>
     *            Status of the last crawl.
     *            </p>
     * @see LastCrawlStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the last crawl.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, CANCELLED, FAILED
     *
     * @param status <p>
     *            Status of the last crawl.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LastCrawlStatus
     */
    public LastCrawlInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Status of the last crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, CANCELLED, FAILED
     *
     * @param status <p>
     *            Status of the last crawl.
     *            </p>
     * @see LastCrawlStatus
     */
    public void setStatus(LastCrawlStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Status of the last crawl.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, CANCELLED, FAILED
     *
     * @param status <p>
     *            Status of the last crawl.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LastCrawlStatus
     */
    public LastCrawlInfo withStatus(LastCrawlStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If an error occurred, the error information about the last crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         If an error occurred, the error information about the last crawl.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * If an error occurred, the error information about the last crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param errorMessage <p>
     *            If an error occurred, the error information about the last
     *            crawl.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * If an error occurred, the error information about the last crawl.
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
     *            If an error occurred, the error information about the last
     *            crawl.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LastCrawlInfo withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * <p>
     * The log group for the last crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return <p>
     *         The log group for the last crawl.
     *         </p>
     */
    public String getLogGroup() {
        return logGroup;
    }

    /**
     * <p>
     * The log group for the last crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroup <p>
     *            The log group for the last crawl.
     *            </p>
     */
    public void setLogGroup(String logGroup) {
        this.logGroup = logGroup;
    }

    /**
     * <p>
     * The log group for the last crawl.
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
     *            The log group for the last crawl.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LastCrawlInfo withLogGroup(String logGroup) {
        this.logGroup = logGroup;
        return this;
    }

    /**
     * <p>
     * The log stream for the last crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return <p>
     *         The log stream for the last crawl.
     *         </p>
     */
    public String getLogStream() {
        return logStream;
    }

    /**
     * <p>
     * The log stream for the last crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStream <p>
     *            The log stream for the last crawl.
     *            </p>
     */
    public void setLogStream(String logStream) {
        this.logStream = logStream;
    }

    /**
     * <p>
     * The log stream for the last crawl.
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
     *            The log stream for the last crawl.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LastCrawlInfo withLogStream(String logStream) {
        this.logStream = logStream;
        return this;
    }

    /**
     * <p>
     * The prefix for a message about this crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The prefix for a message about this crawl.
     *         </p>
     */
    public String getMessagePrefix() {
        return messagePrefix;
    }

    /**
     * <p>
     * The prefix for a message about this crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param messagePrefix <p>
     *            The prefix for a message about this crawl.
     *            </p>
     */
    public void setMessagePrefix(String messagePrefix) {
        this.messagePrefix = messagePrefix;
    }

    /**
     * <p>
     * The prefix for a message about this crawl.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param messagePrefix <p>
     *            The prefix for a message about this crawl.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LastCrawlInfo withMessagePrefix(String messagePrefix) {
        this.messagePrefix = messagePrefix;
        return this;
    }

    /**
     * <p>
     * The time at which the crawl started.
     * </p>
     *
     * @return <p>
     *         The time at which the crawl started.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The time at which the crawl started.
     * </p>
     *
     * @param startTime <p>
     *            The time at which the crawl started.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time at which the crawl started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The time at which the crawl started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LastCrawlInfo withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage() + ",");
        if (getLogGroup() != null)
            sb.append("LogGroup: " + getLogGroup() + ",");
        if (getLogStream() != null)
            sb.append("LogStream: " + getLogStream() + ",");
        if (getMessagePrefix() != null)
            sb.append("MessagePrefix: " + getMessagePrefix() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getLogGroup() == null) ? 0 : getLogGroup().hashCode());
        hashCode = prime * hashCode + ((getLogStream() == null) ? 0 : getLogStream().hashCode());
        hashCode = prime * hashCode
                + ((getMessagePrefix() == null) ? 0 : getMessagePrefix().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LastCrawlInfo == false)
            return false;
        LastCrawlInfo other = (LastCrawlInfo) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        if (other.getMessagePrefix() == null ^ this.getMessagePrefix() == null)
            return false;
        if (other.getMessagePrefix() != null
                && other.getMessagePrefix().equals(this.getMessagePrefix()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }
}
