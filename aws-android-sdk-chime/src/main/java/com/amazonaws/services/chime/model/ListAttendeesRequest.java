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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the attendees for the specified Amazon Chime SDK meeting. For more
 * information about the Amazon Chime SDK, see <a
 * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using
 * the Amazon Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
 * </p>
 */
public class ListAttendeesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     */
    private String meetingId;

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     *
     * @return <p>
     *         The Amazon Chime SDK meeting ID.
     *         </p>
     */
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     *
     * @param meetingId <p>
     *            The Amazon Chime SDK meeting ID.
     *            </p>
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     *
     * @param meetingId <p>
     *            The Amazon Chime SDK meeting ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttendeesRequest withMeetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttendeesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     *
     * @return <p>
     *         The maximum number of results to return in a single call.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttendeesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getMeetingId() != null)
            sb.append("MeetingId: " + getMeetingId() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeetingId() == null) ? 0 : getMeetingId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAttendeesRequest == false)
            return false;
        ListAttendeesRequest other = (ListAttendeesRequest) obj;

        if (other.getMeetingId() == null ^ this.getMeetingId() == null)
            return false;
        if (other.getMeetingId() != null
                && other.getMeetingId().equals(this.getMeetingId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
