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
 * Gets media for a list of fragments (specified by fragment number) from the
 * archived data in an Amazon Kinesis video stream.
 * </p>
 * <p>
 * The following limits apply when using the
 * <code>GetMediaForFragmentList</code> API:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A client can call <code>GetMediaForFragmentList</code> up to five times per
 * second per stream.
 * </p>
 * </li>
 * <li>
 * <p>
 * Kinesis Video Streams sends media data at a rate of up to 25 megabytes per
 * second (or 200 megabits per second) during a
 * <code>GetMediaForFragmentList</code> session.
 * </p>
 * </li>
 * </ul>
 */
public class GetMediaForFragmentListRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the stream from which to retrieve fragment media.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * A list of the numbers of fragments for which to retrieve media. You
     * retrieve these values with <a>ListFragments</a>.
     * </p>
     */
    private java.util.List<String> fragments = new java.util.ArrayList<String>();

    /**
     * <p>
     * The name of the stream from which to retrieve fragment media.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream from which to retrieve fragment media.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream from which to retrieve fragment media.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream from which to retrieve fragment media.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream from which to retrieve fragment media.
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
     *            The name of the stream from which to retrieve fragment media.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMediaForFragmentListRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * A list of the numbers of fragments for which to retrieve media. You
     * retrieve these values with <a>ListFragments</a>.
     * </p>
     *
     * @return <p>
     *         A list of the numbers of fragments for which to retrieve media.
     *         You retrieve these values with <a>ListFragments</a>.
     *         </p>
     */
    public java.util.List<String> getFragments() {
        return fragments;
    }

    /**
     * <p>
     * A list of the numbers of fragments for which to retrieve media. You
     * retrieve these values with <a>ListFragments</a>.
     * </p>
     *
     * @param fragments <p>
     *            A list of the numbers of fragments for which to retrieve
     *            media. You retrieve these values with <a>ListFragments</a>.
     *            </p>
     */
    public void setFragments(java.util.Collection<String> fragments) {
        if (fragments == null) {
            this.fragments = null;
            return;
        }

        this.fragments = new java.util.ArrayList<String>(fragments);
    }

    /**
     * <p>
     * A list of the numbers of fragments for which to retrieve media. You
     * retrieve these values with <a>ListFragments</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fragments <p>
     *            A list of the numbers of fragments for which to retrieve
     *            media. You retrieve these values with <a>ListFragments</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMediaForFragmentListRequest withFragments(String... fragments) {
        if (getFragments() == null) {
            this.fragments = new java.util.ArrayList<String>(fragments.length);
        }
        for (String value : fragments) {
            this.fragments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the numbers of fragments for which to retrieve media. You
     * retrieve these values with <a>ListFragments</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fragments <p>
     *            A list of the numbers of fragments for which to retrieve
     *            media. You retrieve these values with <a>ListFragments</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMediaForFragmentListRequest withFragments(java.util.Collection<String> fragments) {
        setFragments(fragments);
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
        if (getFragments() != null)
            sb.append("Fragments: " + getFragments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getFragments() == null) ? 0 : getFragments().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMediaForFragmentListRequest == false)
            return false;
        GetMediaForFragmentListRequest other = (GetMediaForFragmentListRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getFragments() == null ^ this.getFragments() == null)
            return false;
        if (other.getFragments() != null
                && other.getFragments().equals(this.getFragments()) == false)
            return false;
        return true;
    }
}
