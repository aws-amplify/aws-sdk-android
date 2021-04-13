/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <note>
 * <p>
 * You must first call the <code>GetDataEndpoint</code> API to get an endpoint.
 * Then send the <code>GetMediaForFragmentList</code> requests to this endpoint
 * using the <a
 * href="https://docs.aws.amazon.com/cli/latest/reference/">--endpoint-url
 * parameter</a>.
 * </p>
 * </note>
 * <p>
 * For limits, see <a
 * href="http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html"
 * >Kinesis Video Streams Limits</a>.
 * </p>
 * <important>
 * <p>
 * If an error is thrown after invoking a Kinesis Video Streams archived media
 * API, in addition to the HTTP status code and the response body, it includes
 * the following pieces of information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>x-amz-ErrorType</code> HTTP header – contains a more specific error
 * type in addition to what the HTTP status code provides.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>x-amz-RequestId</code> HTTP header – if you want to report an issue to
 * AWS, the support team can better diagnose the problem if given the Request
 * Id.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Both the HTTP status code and the ErrorType header can be utilized to make
 * programmatic decisions about whether errors are retry-able and under what
 * conditions, as well as provide information on what actions the client
 * programmer might need to take in order to successfully try again.
 * </p>
 * <p>
 * For more information, see the <b>Errors</b> section at the bottom of this
 * topic, as well as <a href=
 * "https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/CommonErrors.html"
 * >Common Errors</a>.
 * </p>
 * </important>
 */
public class GetMediaForFragmentListRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the stream from which to retrieve fragment media. Specify
     * either this parameter or the <code>StreamARN</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream from which to retrieve
     * fragment media. Specify either this parameter or the
     * <code>StreamName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     */
    private String streamARN;

    /**
     * <p>
     * A list of the numbers of fragments for which to retrieve media. You
     * retrieve these values with <a>ListFragments</a>.
     * </p>
     */
    private java.util.List<String> fragments = new java.util.ArrayList<String>();

    /**
     * <p>
     * The name of the stream from which to retrieve fragment media. Specify
     * either this parameter or the <code>StreamARN</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream from which to retrieve fragment media.
     *         Specify either this parameter or the <code>StreamARN</code>
     *         parameter.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream from which to retrieve fragment media. Specify
     * either this parameter or the <code>StreamARN</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream from which to retrieve fragment media.
     *            Specify either this parameter or the <code>StreamARN</code>
     *            parameter.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream from which to retrieve fragment media. Specify
     * either this parameter or the <code>StreamARN</code> parameter.
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
     *            Specify either this parameter or the <code>StreamARN</code>
     *            parameter.
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
     * The Amazon Resource Name (ARN) of the stream from which to retrieve
     * fragment media. Specify either this parameter or the
     * <code>StreamName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the stream from which to
     *         retrieve fragment media. Specify either this parameter or the
     *         <code>StreamName</code> parameter.
     *         </p>
     */
    public String getStreamARN() {
        return streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream from which to retrieve
     * fragment media. Specify either this parameter or the
     * <code>StreamName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the stream from which to
     *            retrieve fragment media. Specify either this parameter or the
     *            <code>StreamName</code> parameter.
     *            </p>
     */
    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream from which to retrieve
     * fragment media. Specify either this parameter or the
     * <code>StreamName</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the stream from which to
     *            retrieve fragment media. Specify either this parameter or the
     *            <code>StreamName</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMediaForFragmentListRequest withStreamARN(String streamARN) {
        this.streamARN = streamARN;
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
        if (getStreamARN() != null)
            sb.append("StreamARN: " + getStreamARN() + ",");
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
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
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
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null
                && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getFragments() == null ^ this.getFragments() == null)
            return false;
        if (other.getFragments() != null
                && other.getFragments().equals(this.getFragments()) == false)
            return false;
        return true;
    }
}
