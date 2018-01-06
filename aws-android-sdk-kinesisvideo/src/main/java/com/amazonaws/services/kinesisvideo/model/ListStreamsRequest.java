/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

public class ListStreamsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The new value for the maxResults property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer maxResults;

    /**
     * The new value for the nextToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     */
    private String nextToken;

    /**
     * The new value for the streamNameCondition property for this object.
     */
    private StreamNameCondition streamNameCondition;

    /**
     * Returns the value of the maxResults property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return The value of the maxResults property for this object.
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of maxResults
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param maxResults The new value for the maxResults property for this
     *            object.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Sets the value of the maxResults property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param maxResults The new value for the maxResults property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStreamsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Returns the value of the nextToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @return The value of the nextToken property for this object.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Sets the value of nextToken
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param nextToken The new value for the nextToken property for this
     *            object.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Sets the value of the nextToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param nextToken The new value for the nextToken property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStreamsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns the value of the streamNameCondition property for this object.
     *
     * @return The value of the streamNameCondition property for this object.
     */
    public StreamNameCondition getStreamNameCondition() {
        return streamNameCondition;
    }

    /**
     * Sets the value of streamNameCondition
     *
     * @param streamNameCondition The new value for the streamNameCondition
     *            property for this object.
     */
    public void setStreamNameCondition(StreamNameCondition streamNameCondition) {
        this.streamNameCondition = streamNameCondition;
    }

    /**
     * Sets the value of the streamNameCondition property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamNameCondition The new value for the streamNameCondition
     *            property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStreamsRequest withStreamNameCondition(StreamNameCondition streamNameCondition) {
        this.streamNameCondition = streamNameCondition;
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
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getStreamNameCondition() != null)
            sb.append("StreamNameCondition: " + getStreamNameCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getStreamNameCondition() == null) ? 0 : getStreamNameCondition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStreamsRequest == false)
            return false;
        ListStreamsRequest other = (ListStreamsRequest) obj;

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
        if (other.getStreamNameCondition() == null ^ this.getStreamNameCondition() == null)
            return false;
        if (other.getStreamNameCondition() != null
                && other.getStreamNameCondition().equals(this.getStreamNameCondition()) == false)
            return false;
        return true;
    }
}
