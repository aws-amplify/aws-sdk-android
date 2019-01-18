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

package com.amazonaws.services.kinesisvideoarchivedmedia.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of <a>Fragment</a> objects from the specified stream and start
 * location within the archived data.
 * </p>
 */
public class ListFragmentsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the stream from which to retrieve a fragment list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The total number of fragments to return. If the total number of fragments
     * available is more than the value specified in <code>max-results</code>,
     * then a <a>ListFragmentsOutput$NextToken</a> is provided in the output
     * that you can use to resume pagination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Long maxResults;

    /**
     * <p>
     * A token to specify where to start paginating. This is the
     * <a>ListFragmentsOutput$NextToken</a> from a previously truncated
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * Describes the time stamp range and time stamp origin for the range of
     * fragments to return.
     * </p>
     */
    private FragmentSelector fragmentSelector;

    /**
     * <p>
     * The name of the stream from which to retrieve a fragment list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream from which to retrieve a fragment list.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream from which to retrieve a fragment list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream from which to retrieve a fragment list.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream from which to retrieve a fragment list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream from which to retrieve a fragment list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFragmentsRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The total number of fragments to return. If the total number of fragments
     * available is more than the value specified in <code>max-results</code>,
     * then a <a>ListFragmentsOutput$NextToken</a> is provided in the output
     * that you can use to resume pagination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The total number of fragments to return. If the total number of
     *         fragments available is more than the value specified in
     *         <code>max-results</code>, then a
     *         <a>ListFragmentsOutput$NextToken</a> is provided in the output
     *         that you can use to resume pagination.
     *         </p>
     */
    public Long getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The total number of fragments to return. If the total number of fragments
     * available is more than the value specified in <code>max-results</code>,
     * then a <a>ListFragmentsOutput$NextToken</a> is provided in the output
     * that you can use to resume pagination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The total number of fragments to return. If the total number
     *            of fragments available is more than the value specified in
     *            <code>max-results</code>, then a
     *            <a>ListFragmentsOutput$NextToken</a> is provided in the output
     *            that you can use to resume pagination.
     *            </p>
     */
    public void setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of fragments to return. If the total number of fragments
     * available is more than the value specified in <code>max-results</code>,
     * then a <a>ListFragmentsOutput$NextToken</a> is provided in the output
     * that you can use to resume pagination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The total number of fragments to return. If the total number
     *            of fragments available is more than the value specified in
     *            <code>max-results</code>, then a
     *            <a>ListFragmentsOutput$NextToken</a> is provided in the output
     *            that you can use to resume pagination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFragmentsRequest withMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the
     * <a>ListFragmentsOutput$NextToken</a> from a previously truncated
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         A token to specify where to start paginating. This is the
     *         <a>ListFragmentsOutput$NextToken</a> from a previously truncated
     *         response.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the
     * <a>ListFragmentsOutput$NextToken</a> from a previously truncated
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            A token to specify where to start paginating. This is the
     *            <a>ListFragmentsOutput$NextToken</a> from a previously
     *            truncated response.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the
     * <a>ListFragmentsOutput$NextToken</a> from a previously truncated
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            A token to specify where to start paginating. This is the
     *            <a>ListFragmentsOutput$NextToken</a> from a previously
     *            truncated response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFragmentsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Describes the time stamp range and time stamp origin for the range of
     * fragments to return.
     * </p>
     *
     * @return <p>
     *         Describes the time stamp range and time stamp origin for the
     *         range of fragments to return.
     *         </p>
     */
    public FragmentSelector getFragmentSelector() {
        return fragmentSelector;
    }

    /**
     * <p>
     * Describes the time stamp range and time stamp origin for the range of
     * fragments to return.
     * </p>
     *
     * @param fragmentSelector <p>
     *            Describes the time stamp range and time stamp origin for the
     *            range of fragments to return.
     *            </p>
     */
    public void setFragmentSelector(FragmentSelector fragmentSelector) {
        this.fragmentSelector = fragmentSelector;
    }

    /**
     * <p>
     * Describes the time stamp range and time stamp origin for the range of
     * fragments to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fragmentSelector <p>
     *            Describes the time stamp range and time stamp origin for the
     *            range of fragments to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFragmentsRequest withFragmentSelector(FragmentSelector fragmentSelector) {
        this.fragmentSelector = fragmentSelector;
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
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getFragmentSelector() != null)
            sb.append("FragmentSelector: " + getFragmentSelector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getFragmentSelector() == null) ? 0 : getFragmentSelector().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFragmentsRequest == false)
            return false;
        ListFragmentsRequest other = (ListFragmentsRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
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
        if (other.getFragmentSelector() == null ^ this.getFragmentSelector() == null)
            return false;
        if (other.getFragmentSelector() != null
                && other.getFragmentSelector().equals(this.getFragmentSelector()) == false)
            return false;
        return true;
    }
}
