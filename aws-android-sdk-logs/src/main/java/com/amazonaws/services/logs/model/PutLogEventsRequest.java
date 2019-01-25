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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Uploads a batch of log events to the specified log stream.
 * </p>
 * <p>
 * You must include the sequence token obtained from the response of the
 * previous call. An upload in a newly created log stream does not require a
 * sequence token. You can also get the sequence token using
 * <a>DescribeLogStreams</a>. If you call <code>PutLogEvents</code> twice within
 * a narrow time period using the same value for <code>sequenceToken</code>,
 * both calls may be successful, or one may be rejected.
 * </p>
 * <p>
 * The batch of events must satisfy the following constraints:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The maximum batch size is 1,048,576 bytes, and this size is calculated as the
 * sum of all event messages in UTF-8, plus 26 bytes for each log event.
 * </p>
 * </li>
 * <li>
 * <p>
 * None of the log events in the batch can be more than 2 hours in the future.
 * </p>
 * </li>
 * <li>
 * <p>
 * None of the log events in the batch can be older than 14 days or the
 * retention period of the log group.
 * </p>
 * </li>
 * <li>
 * <p>
 * The log events in the batch must be in chronological ordered by their time
 * stamp. The time stamp is the time the event occurred, expressed as the number
 * of milliseconds after Jan 1, 1970 00:00:00 UTC. (In AWS Tools for PowerShell
 * and the AWS SDK for .NET, the timestamp is specified in .NET format:
 * yyyy-mm-ddThh:mm:ss. For example, 2017-09-15T13:45:30.)
 * </p>
 * </li>
 * <li>
 * <p>
 * The maximum number of log events in a batch is 10,000.
 * </p>
 * </li>
 * <li>
 * <p>
 * A batch of log events in a single request cannot span more than 24 hours.
 * Otherwise, the operation fails.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If a call to PutLogEvents returns "UnrecognizedClientException" the most
 * likely cause is an invalid AWS access key ID or secret key.
 * </p>
 */
public class PutLogEventsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     */
    private String logGroupName;

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
     * The log events.
     * </p>
     */
    private java.util.List<InputLogEvent> logEvents;

    /**
     * <p>
     * The sequence token obtained from the response of the previous
     * <code>PutLogEvents</code> call. An upload in a newly created log stream
     * does not require a sequence token. You can also get the sequence token
     * using <a>DescribeLogStreams</a>. If you call <code>PutLogEvents</code>
     * twice within a narrow time period using the same value for
     * <code>sequenceToken</code>, both calls may be successful, or one may be
     * rejected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String sequenceToken;

    /**
     * Default constructor for PutLogEventsRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public PutLogEventsRequest() {
    }

    /**
     * Constructs a new PutLogEventsRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param logGroupName <p>
     *            The name of the log group.
     *            </p>
     * @param logStreamName <p>
     *            The name of the log stream.
     *            </p>
     * @param logEvents <p>
     *            The log events.
     *            </p>
     */
    public PutLogEventsRequest(String logGroupName, String logStreamName,
            java.util.List<InputLogEvent> logEvents) {
        setLogGroupName(logGroupName);
        setLogStreamName(logStreamName);
        setLogEvents(logEvents);
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return <p>
     *         The name of the log group.
     *         </p>
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            The name of the log group.
     *            </p>
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            The name of the log group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLogEventsRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
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
    public PutLogEventsRequest withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * <p>
     * The log events.
     * </p>
     *
     * @return <p>
     *         The log events.
     *         </p>
     */
    public java.util.List<InputLogEvent> getLogEvents() {
        return logEvents;
    }

    /**
     * <p>
     * The log events.
     * </p>
     *
     * @param logEvents <p>
     *            The log events.
     *            </p>
     */
    public void setLogEvents(java.util.Collection<InputLogEvent> logEvents) {
        if (logEvents == null) {
            this.logEvents = null;
            return;
        }

        this.logEvents = new java.util.ArrayList<InputLogEvent>(logEvents);
    }

    /**
     * <p>
     * The log events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logEvents <p>
     *            The log events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLogEventsRequest withLogEvents(InputLogEvent... logEvents) {
        if (getLogEvents() == null) {
            this.logEvents = new java.util.ArrayList<InputLogEvent>(logEvents.length);
        }
        for (InputLogEvent value : logEvents) {
            this.logEvents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The log events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logEvents <p>
     *            The log events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLogEventsRequest withLogEvents(java.util.Collection<InputLogEvent> logEvents) {
        setLogEvents(logEvents);
        return this;
    }

    /**
     * <p>
     * The sequence token obtained from the response of the previous
     * <code>PutLogEvents</code> call. An upload in a newly created log stream
     * does not require a sequence token. You can also get the sequence token
     * using <a>DescribeLogStreams</a>. If you call <code>PutLogEvents</code>
     * twice within a narrow time period using the same value for
     * <code>sequenceToken</code>, both calls may be successful, or one may be
     * rejected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The sequence token obtained from the response of the previous
     *         <code>PutLogEvents</code> call. An upload in a newly created log
     *         stream does not require a sequence token. You can also get the
     *         sequence token using <a>DescribeLogStreams</a>. If you call
     *         <code>PutLogEvents</code> twice within a narrow time period using
     *         the same value for <code>sequenceToken</code>, both calls may be
     *         successful, or one may be rejected.
     *         </p>
     */
    public String getSequenceToken() {
        return sequenceToken;
    }

    /**
     * <p>
     * The sequence token obtained from the response of the previous
     * <code>PutLogEvents</code> call. An upload in a newly created log stream
     * does not require a sequence token. You can also get the sequence token
     * using <a>DescribeLogStreams</a>. If you call <code>PutLogEvents</code>
     * twice within a narrow time period using the same value for
     * <code>sequenceToken</code>, both calls may be successful, or one may be
     * rejected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param sequenceToken <p>
     *            The sequence token obtained from the response of the previous
     *            <code>PutLogEvents</code> call. An upload in a newly created
     *            log stream does not require a sequence token. You can also get
     *            the sequence token using <a>DescribeLogStreams</a>. If you
     *            call <code>PutLogEvents</code> twice within a narrow time
     *            period using the same value for <code>sequenceToken</code>,
     *            both calls may be successful, or one may be rejected.
     *            </p>
     */
    public void setSequenceToken(String sequenceToken) {
        this.sequenceToken = sequenceToken;
    }

    /**
     * <p>
     * The sequence token obtained from the response of the previous
     * <code>PutLogEvents</code> call. An upload in a newly created log stream
     * does not require a sequence token. You can also get the sequence token
     * using <a>DescribeLogStreams</a>. If you call <code>PutLogEvents</code>
     * twice within a narrow time period using the same value for
     * <code>sequenceToken</code>, both calls may be successful, or one may be
     * rejected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param sequenceToken <p>
     *            The sequence token obtained from the response of the previous
     *            <code>PutLogEvents</code> call. An upload in a newly created
     *            log stream does not require a sequence token. You can also get
     *            the sequence token using <a>DescribeLogStreams</a>. If you
     *            call <code>PutLogEvents</code> twice within a narrow time
     *            period using the same value for <code>sequenceToken</code>,
     *            both calls may be successful, or one may be rejected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLogEventsRequest withSequenceToken(String sequenceToken) {
        this.sequenceToken = sequenceToken;
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
        if (getLogGroupName() != null)
            sb.append("logGroupName: " + getLogGroupName() + ",");
        if (getLogStreamName() != null)
            sb.append("logStreamName: " + getLogStreamName() + ",");
        if (getLogEvents() != null)
            sb.append("logEvents: " + getLogEvents() + ",");
        if (getSequenceToken() != null)
            sb.append("sequenceToken: " + getSequenceToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getLogStreamName() == null) ? 0 : getLogStreamName().hashCode());
        hashCode = prime * hashCode + ((getLogEvents() == null) ? 0 : getLogEvents().hashCode());
        hashCode = prime * hashCode
                + ((getSequenceToken() == null) ? 0 : getSequenceToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLogEventsRequest == false)
            return false;
        PutLogEventsRequest other = (PutLogEventsRequest) obj;

        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null)
            return false;
        if (other.getLogStreamName() != null
                && other.getLogStreamName().equals(this.getLogStreamName()) == false)
            return false;
        if (other.getLogEvents() == null ^ this.getLogEvents() == null)
            return false;
        if (other.getLogEvents() != null
                && other.getLogEvents().equals(this.getLogEvents()) == false)
            return false;
        if (other.getSequenceToken() == null ^ this.getSequenceToken() == null)
            return false;
        if (other.getSequenceToken() != null
                && other.getSequenceToken().equals(this.getSequenceToken()) == false)
            return false;
        return true;
    }
}
