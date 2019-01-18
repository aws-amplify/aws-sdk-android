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

public class DescribeLogStreamsResult implements Serializable {
    /**
     * <p>
     * The log streams.
     * </p>
     */
    private java.util.List<LogStream> logStreams;

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The log streams.
     * </p>
     *
     * @return <p>
     *         The log streams.
     *         </p>
     */
    public java.util.List<LogStream> getLogStreams() {
        return logStreams;
    }

    /**
     * <p>
     * The log streams.
     * </p>
     *
     * @param logStreams <p>
     *            The log streams.
     *            </p>
     */
    public void setLogStreams(java.util.Collection<LogStream> logStreams) {
        if (logStreams == null) {
            this.logStreams = null;
            return;
        }

        this.logStreams = new java.util.ArrayList<LogStream>(logStreams);
    }

    /**
     * <p>
     * The log streams.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logStreams <p>
     *            The log streams.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLogStreamsResult withLogStreams(LogStream... logStreams) {
        if (getLogStreams() == null) {
            this.logStreams = new java.util.ArrayList<LogStream>(logStreams.length);
        }
        for (LogStream value : logStreams) {
            this.logStreams.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The log streams.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logStreams <p>
     *            The log streams.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLogStreamsResult withLogStreams(java.util.Collection<LogStream> logStreams) {
        setLogStreams(logStreams);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The token for the next set of items to return. The token expires
     *         after 24 hours.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. The token
     *            expires after 24 hours.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. The token
     *            expires after 24 hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLogStreamsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getLogStreams() != null)
            sb.append("logStreams: " + getLogStreams() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogStreams() == null) ? 0 : getLogStreams().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLogStreamsResult == false)
            return false;
        DescribeLogStreamsResult other = (DescribeLogStreamsResult) obj;

        if (other.getLogStreams() == null ^ this.getLogStreams() == null)
            return false;
        if (other.getLogStreams() != null
                && other.getLogStreams().equals(this.getLogStreams()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
