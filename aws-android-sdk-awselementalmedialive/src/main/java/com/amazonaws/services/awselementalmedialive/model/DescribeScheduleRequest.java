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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Get a channel schedule
 */
public class DescribeScheduleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Id of the channel whose schedule is being updated.
     */
    private String channelId;

    /**
     * Placeholder documentation for MaxResults
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * Placeholder documentation for __string
     */
    private String nextToken;

    /**
     * Id of the channel whose schedule is being updated.
     *
     * @return Id of the channel whose schedule is being updated.
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Id of the channel whose schedule is being updated.
     *
     * @param channelId Id of the channel whose schedule is being updated.
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * Id of the channel whose schedule is being updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelId Id of the channel whose schedule is being updated.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduleRequest withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * Placeholder documentation for MaxResults
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return Placeholder documentation for MaxResults
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Placeholder documentation for MaxResults
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults Placeholder documentation for MaxResults
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Placeholder documentation for MaxResults
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults Placeholder documentation for MaxResults
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduleRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Placeholder documentation for __string
     *
     * @return Placeholder documentation for __string
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Placeholder documentation for __string
     *
     * @param nextToken Placeholder documentation for __string
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Placeholder documentation for __string
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken Placeholder documentation for __string
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduleRequest withNextToken(String nextToken) {
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
        if (getChannelId() != null)
            sb.append("ChannelId: " + getChannelId() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScheduleRequest == false)
            return false;
        DescribeScheduleRequest other = (DescribeScheduleRequest) obj;

        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null
                && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
