/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a log stream, which is a sequence of log events from a single
 * emitter of logs.
 * </p>
 */
public class LogStream implements Serializable {
    /**
     * <p>
     * The name of the log stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String logStreamName;

    /**
     * <p>
     * The creation time of the stream, expressed as the number of milliseconds
     * after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long creationTime;

    /**
     * <p>
     * The time of the first event, expressed as the number of milliseconds
     * after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long firstEventTimestamp;

    /**
     * <p>
     * the time of the most recent log event in the log stream in CloudWatch
     * Logs. This number is expressed as the number of milliseconds after Jan 1,
     * 1970 00:00:00 UTC. lastEventTime updates on an eventual consistency
     * basis. It typically updates in less than an hour from ingestion, but may
     * take longer in some rare situations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long lastEventTimestamp;

    /**
     * <p>
     * The ingestion time, expressed as the number of milliseconds after Jan 1,
     * 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long lastIngestionTime;

    /**
     * <p>
     * The sequence token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String uploadSequenceToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log stream.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The number of bytes stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long storedBytes;

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return <p>
     *         The name of the log stream.
     *         </p>
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamName <p>
     *            The name of the log stream.
     *            </p>
     */
    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamName <p>
     *            The name of the log stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogStream withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * <p>
     * The creation time of the stream, expressed as the number of milliseconds
     * after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The creation time of the stream, expressed as the number of
     *         milliseconds after Jan 1, 1970 00:00:00 UTC.
     *         </p>
     */
    public Long getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The creation time of the stream, expressed as the number of milliseconds
     * after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime <p>
     *            The creation time of the stream, expressed as the number of
     *            milliseconds after Jan 1, 1970 00:00:00 UTC.
     *            </p>
     */
    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the stream, expressed as the number of milliseconds
     * after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime <p>
     *            The creation time of the stream, expressed as the number of
     *            milliseconds after Jan 1, 1970 00:00:00 UTC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogStream withCreationTime(Long creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The time of the first event, expressed as the number of milliseconds
     * after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The time of the first event, expressed as the number of
     *         milliseconds after Jan 1, 1970 00:00:00 UTC.
     *         </p>
     */
    public Long getFirstEventTimestamp() {
        return firstEventTimestamp;
    }

    /**
     * <p>
     * The time of the first event, expressed as the number of milliseconds
     * after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param firstEventTimestamp <p>
     *            The time of the first event, expressed as the number of
     *            milliseconds after Jan 1, 1970 00:00:00 UTC.
     *            </p>
     */
    public void setFirstEventTimestamp(Long firstEventTimestamp) {
        this.firstEventTimestamp = firstEventTimestamp;
    }

    /**
     * <p>
     * The time of the first event, expressed as the number of milliseconds
     * after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param firstEventTimestamp <p>
     *            The time of the first event, expressed as the number of
     *            milliseconds after Jan 1, 1970 00:00:00 UTC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogStream withFirstEventTimestamp(Long firstEventTimestamp) {
        this.firstEventTimestamp = firstEventTimestamp;
        return this;
    }

    /**
     * <p>
     * the time of the most recent log event in the log stream in CloudWatch
     * Logs. This number is expressed as the number of milliseconds after Jan 1,
     * 1970 00:00:00 UTC. lastEventTime updates on an eventual consistency
     * basis. It typically updates in less than an hour from ingestion, but may
     * take longer in some rare situations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         the time of the most recent log event in the log stream in
     *         CloudWatch Logs. This number is expressed as the number of
     *         milliseconds after Jan 1, 1970 00:00:00 UTC. lastEventTime
     *         updates on an eventual consistency basis. It typically updates in
     *         less than an hour from ingestion, but may take longer in some
     *         rare situations.
     *         </p>
     */
    public Long getLastEventTimestamp() {
        return lastEventTimestamp;
    }

    /**
     * <p>
     * the time of the most recent log event in the log stream in CloudWatch
     * Logs. This number is expressed as the number of milliseconds after Jan 1,
     * 1970 00:00:00 UTC. lastEventTime updates on an eventual consistency
     * basis. It typically updates in less than an hour from ingestion, but may
     * take longer in some rare situations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param lastEventTimestamp <p>
     *            the time of the most recent log event in the log stream in
     *            CloudWatch Logs. This number is expressed as the number of
     *            milliseconds after Jan 1, 1970 00:00:00 UTC. lastEventTime
     *            updates on an eventual consistency basis. It typically updates
     *            in less than an hour from ingestion, but may take longer in
     *            some rare situations.
     *            </p>
     */
    public void setLastEventTimestamp(Long lastEventTimestamp) {
        this.lastEventTimestamp = lastEventTimestamp;
    }

    /**
     * <p>
     * the time of the most recent log event in the log stream in CloudWatch
     * Logs. This number is expressed as the number of milliseconds after Jan 1,
     * 1970 00:00:00 UTC. lastEventTime updates on an eventual consistency
     * basis. It typically updates in less than an hour from ingestion, but may
     * take longer in some rare situations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param lastEventTimestamp <p>
     *            the time of the most recent log event in the log stream in
     *            CloudWatch Logs. This number is expressed as the number of
     *            milliseconds after Jan 1, 1970 00:00:00 UTC. lastEventTime
     *            updates on an eventual consistency basis. It typically updates
     *            in less than an hour from ingestion, but may take longer in
     *            some rare situations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogStream withLastEventTimestamp(Long lastEventTimestamp) {
        this.lastEventTimestamp = lastEventTimestamp;
        return this;
    }

    /**
     * <p>
     * The ingestion time, expressed as the number of milliseconds after Jan 1,
     * 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The ingestion time, expressed as the number of milliseconds after
     *         Jan 1, 1970 00:00:00 UTC.
     *         </p>
     */
    public Long getLastIngestionTime() {
        return lastIngestionTime;
    }

    /**
     * <p>
     * The ingestion time, expressed as the number of milliseconds after Jan 1,
     * 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param lastIngestionTime <p>
     *            The ingestion time, expressed as the number of milliseconds
     *            after Jan 1, 1970 00:00:00 UTC.
     *            </p>
     */
    public void setLastIngestionTime(Long lastIngestionTime) {
        this.lastIngestionTime = lastIngestionTime;
    }

    /**
     * <p>
     * The ingestion time, expressed as the number of milliseconds after Jan 1,
     * 1970 00:00:00 UTC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param lastIngestionTime <p>
     *            The ingestion time, expressed as the number of milliseconds
     *            after Jan 1, 1970 00:00:00 UTC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogStream withLastIngestionTime(Long lastIngestionTime) {
        this.lastIngestionTime = lastIngestionTime;
        return this;
    }

    /**
     * <p>
     * The sequence token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The sequence token.
     *         </p>
     */
    public String getUploadSequenceToken() {
        return uploadSequenceToken;
    }

    /**
     * <p>
     * The sequence token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param uploadSequenceToken <p>
     *            The sequence token.
     *            </p>
     */
    public void setUploadSequenceToken(String uploadSequenceToken) {
        this.uploadSequenceToken = uploadSequenceToken;
    }

    /**
     * <p>
     * The sequence token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param uploadSequenceToken <p>
     *            The sequence token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogStream withUploadSequenceToken(String uploadSequenceToken) {
        this.uploadSequenceToken = uploadSequenceToken;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log stream.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the log stream.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log stream.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the log stream.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the log stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogStream withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The number of bytes stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of bytes stored.
     *         </p>
     */
    public Long getStoredBytes() {
        return storedBytes;
    }

    /**
     * <p>
     * The number of bytes stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param storedBytes <p>
     *            The number of bytes stored.
     *            </p>
     */
    public void setStoredBytes(Long storedBytes) {
        this.storedBytes = storedBytes;
    }

    /**
     * <p>
     * The number of bytes stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param storedBytes <p>
     *            The number of bytes stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogStream withStoredBytes(Long storedBytes) {
        this.storedBytes = storedBytes;
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
        if (getLogStreamName() != null)
            sb.append("logStreamName: " + getLogStreamName() + ",");
        if (getCreationTime() != null)
            sb.append("creationTime: " + getCreationTime() + ",");
        if (getFirstEventTimestamp() != null)
            sb.append("firstEventTimestamp: " + getFirstEventTimestamp() + ",");
        if (getLastEventTimestamp() != null)
            sb.append("lastEventTimestamp: " + getLastEventTimestamp() + ",");
        if (getLastIngestionTime() != null)
            sb.append("lastIngestionTime: " + getLastIngestionTime() + ",");
        if (getUploadSequenceToken() != null)
            sb.append("uploadSequenceToken: " + getUploadSequenceToken() + ",");
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getStoredBytes() != null)
            sb.append("storedBytes: " + getStoredBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLogStreamName() == null) ? 0 : getLogStreamName().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getFirstEventTimestamp() == null) ? 0 : getFirstEventTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getLastEventTimestamp() == null) ? 0 : getLastEventTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getLastIngestionTime() == null) ? 0 : getLastIngestionTime().hashCode());
        hashCode = prime * hashCode
                + ((getUploadSequenceToken() == null) ? 0 : getUploadSequenceToken().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getStoredBytes() == null) ? 0 : getStoredBytes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogStream == false)
            return false;
        LogStream other = (LogStream) obj;

        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null)
            return false;
        if (other.getLogStreamName() != null
                && other.getLogStreamName().equals(this.getLogStreamName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFirstEventTimestamp() == null ^ this.getFirstEventTimestamp() == null)
            return false;
        if (other.getFirstEventTimestamp() != null
                && other.getFirstEventTimestamp().equals(this.getFirstEventTimestamp()) == false)
            return false;
        if (other.getLastEventTimestamp() == null ^ this.getLastEventTimestamp() == null)
            return false;
        if (other.getLastEventTimestamp() != null
                && other.getLastEventTimestamp().equals(this.getLastEventTimestamp()) == false)
            return false;
        if (other.getLastIngestionTime() == null ^ this.getLastIngestionTime() == null)
            return false;
        if (other.getLastIngestionTime() != null
                && other.getLastIngestionTime().equals(this.getLastIngestionTime()) == false)
            return false;
        if (other.getUploadSequenceToken() == null ^ this.getUploadSequenceToken() == null)
            return false;
        if (other.getUploadSequenceToken() != null
                && other.getUploadSequenceToken().equals(this.getUploadSequenceToken()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStoredBytes() == null ^ this.getStoredBytes() == null)
            return false;
        if (other.getStoredBytes() != null
                && other.getStoredBytes().equals(this.getStoredBytes()) == false)
            return false;
        return true;
    }
}
