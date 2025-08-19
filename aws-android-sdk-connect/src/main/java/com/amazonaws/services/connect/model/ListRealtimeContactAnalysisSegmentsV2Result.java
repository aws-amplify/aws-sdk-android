/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class ListRealtimeContactAnalysisSegmentsV2Result implements Serializable {
    /**
     * <p>
     * The channel of the contact. <code>Voice</code> will not be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT
     */
    private String channel;

    /**
     * <p>
     * Status of real-time contact analysis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     */
    private String status;

    /**
     * <p>
     * An analyzed transcript or category.
     * </p>
     */
    private java.util.List<RealtimeContactAnalysisSegment> segments;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The channel of the contact. <code>Voice</code> will not be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT
     *
     * @return <p>
     *         The channel of the contact. <code>Voice</code> will not be
     *         returned.
     *         </p>
     * @see RealTimeContactAnalysisSupportedChannel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * <p>
     * The channel of the contact. <code>Voice</code> will not be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT
     *
     * @param channel <p>
     *            The channel of the contact. <code>Voice</code> will not be
     *            returned.
     *            </p>
     * @see RealTimeContactAnalysisSupportedChannel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The channel of the contact. <code>Voice</code> will not be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT
     *
     * @param channel <p>
     *            The channel of the contact. <code>Voice</code> will not be
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RealTimeContactAnalysisSupportedChannel
     */
    public ListRealtimeContactAnalysisSegmentsV2Result withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * <p>
     * The channel of the contact. <code>Voice</code> will not be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT
     *
     * @param channel <p>
     *            The channel of the contact. <code>Voice</code> will not be
     *            returned.
     *            </p>
     * @see RealTimeContactAnalysisSupportedChannel
     */
    public void setChannel(RealTimeContactAnalysisSupportedChannel channel) {
        this.channel = channel.toString();
    }

    /**
     * <p>
     * The channel of the contact. <code>Voice</code> will not be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT
     *
     * @param channel <p>
     *            The channel of the contact. <code>Voice</code> will not be
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RealTimeContactAnalysisSupportedChannel
     */
    public ListRealtimeContactAnalysisSegmentsV2Result withChannel(
            RealTimeContactAnalysisSupportedChannel channel) {
        this.channel = channel.toString();
        return this;
    }

    /**
     * <p>
     * Status of real-time contact analysis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @return <p>
     *         Status of real-time contact analysis.
     *         </p>
     * @see RealTimeContactAnalysisStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Status of real-time contact analysis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            Status of real-time contact analysis.
     *            </p>
     * @see RealTimeContactAnalysisStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of real-time contact analysis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            Status of real-time contact analysis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RealTimeContactAnalysisStatus
     */
    public ListRealtimeContactAnalysisSegmentsV2Result withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Status of real-time contact analysis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            Status of real-time contact analysis.
     *            </p>
     * @see RealTimeContactAnalysisStatus
     */
    public void setStatus(RealTimeContactAnalysisStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Status of real-time contact analysis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            Status of real-time contact analysis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RealTimeContactAnalysisStatus
     */
    public ListRealtimeContactAnalysisSegmentsV2Result withStatus(
            RealTimeContactAnalysisStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An analyzed transcript or category.
     * </p>
     *
     * @return <p>
     *         An analyzed transcript or category.
     *         </p>
     */
    public java.util.List<RealtimeContactAnalysisSegment> getSegments() {
        return segments;
    }

    /**
     * <p>
     * An analyzed transcript or category.
     * </p>
     *
     * @param segments <p>
     *            An analyzed transcript or category.
     *            </p>
     */
    public void setSegments(java.util.Collection<RealtimeContactAnalysisSegment> segments) {
        if (segments == null) {
            this.segments = null;
            return;
        }

        this.segments = new java.util.ArrayList<RealtimeContactAnalysisSegment>(segments);
    }

    /**
     * <p>
     * An analyzed transcript or category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segments <p>
     *            An analyzed transcript or category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRealtimeContactAnalysisSegmentsV2Result withSegments(
            RealtimeContactAnalysisSegment... segments) {
        if (getSegments() == null) {
            this.segments = new java.util.ArrayList<RealtimeContactAnalysisSegment>(segments.length);
        }
        for (RealtimeContactAnalysisSegment value : segments) {
            this.segments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An analyzed transcript or category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segments <p>
     *            An analyzed transcript or category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRealtimeContactAnalysisSegmentsV2Result withSegments(
            java.util.Collection<RealtimeContactAnalysisSegment> segments) {
        setSegments(segments);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRealtimeContactAnalysisSegmentsV2Result withNextToken(String nextToken) {
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
        if (getChannel() != null)
            sb.append("Channel: " + getChannel() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getSegments() != null)
            sb.append("Segments: " + getSegments() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSegments() == null) ? 0 : getSegments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRealtimeContactAnalysisSegmentsV2Result == false)
            return false;
        ListRealtimeContactAnalysisSegmentsV2Result other = (ListRealtimeContactAnalysisSegmentsV2Result) obj;

        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSegments() == null ^ this.getSegments() == null)
            return false;
        if (other.getSegments() != null && other.getSegments().equals(this.getSegments()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
