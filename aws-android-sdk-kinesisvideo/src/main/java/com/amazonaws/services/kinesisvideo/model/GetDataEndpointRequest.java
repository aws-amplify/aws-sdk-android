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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets an endpoint for a specified stream for either reading or writing. Use
 * this endpoint in your application to read from the specified stream (using
 * the <code>GetMedia</code> or <code>GetMediaForFragmentList</code> operations)
 * or write to it (using the <code>PutMedia</code> operation).
 * </p>
 * <note>
 * <p>
 * The returned endpoint does not have the API name appended. The client needs
 * to add the API name to the returned endpoint.
 * </p>
 * </note>
 * <p>
 * In the request, specify the stream either by <code>StreamName</code> or
 * <code>StreamARN</code>.
 * </p>
 */
public class GetDataEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the stream that you want to get the endpoint for. You must
     * specify either this parameter or a <code>StreamARN</code> in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to get the
     * endpoint for. You must specify either this parameter or a
     * <code>StreamName</code> in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     */
    private String streamARN;

    /**
     * <p>
     * The name of the API action for which to get an endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS,
     * GET_MEDIA_FOR_FRAGMENT_LIST, GET_HLS_STREAMING_SESSION_URL
     */
    private String aPIName;

    /**
     * <p>
     * The name of the stream that you want to get the endpoint for. You must
     * specify either this parameter or a <code>StreamARN</code> in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream that you want to get the endpoint for. You
     *         must specify either this parameter or a <code>StreamARN</code> in
     *         the request.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream that you want to get the endpoint for. You must
     * specify either this parameter or a <code>StreamARN</code> in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream that you want to get the endpoint for.
     *            You must specify either this parameter or a
     *            <code>StreamARN</code> in the request.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream that you want to get the endpoint for. You must
     * specify either this parameter or a <code>StreamARN</code> in the request.
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
     *            The name of the stream that you want to get the endpoint for.
     *            You must specify either this parameter or a
     *            <code>StreamARN</code> in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDataEndpointRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to get the
     * endpoint for. You must specify either this parameter or a
     * <code>StreamName</code> in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the stream that you want to get
     *         the endpoint for. You must specify either this parameter or a
     *         <code>StreamName</code> in the request.
     *         </p>
     */
    public String getStreamARN() {
        return streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to get the
     * endpoint for. You must specify either this parameter or a
     * <code>StreamName</code> in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the stream that you want to
     *            get the endpoint for. You must specify either this parameter
     *            or a <code>StreamName</code> in the request.
     *            </p>
     */
    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to get the
     * endpoint for. You must specify either this parameter or a
     * <code>StreamName</code> in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the stream that you want to
     *            get the endpoint for. You must specify either this parameter
     *            or a <code>StreamName</code> in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDataEndpointRequest withStreamARN(String streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    /**
     * <p>
     * The name of the API action for which to get an endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS,
     * GET_MEDIA_FOR_FRAGMENT_LIST, GET_HLS_STREAMING_SESSION_URL
     *
     * @return <p>
     *         The name of the API action for which to get an endpoint.
     *         </p>
     * @see APIName
     */
    public String getAPIName() {
        return aPIName;
    }

    /**
     * <p>
     * The name of the API action for which to get an endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS,
     * GET_MEDIA_FOR_FRAGMENT_LIST, GET_HLS_STREAMING_SESSION_URL
     *
     * @param aPIName <p>
     *            The name of the API action for which to get an endpoint.
     *            </p>
     * @see APIName
     */
    public void setAPIName(String aPIName) {
        this.aPIName = aPIName;
    }

    /**
     * <p>
     * The name of the API action for which to get an endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS,
     * GET_MEDIA_FOR_FRAGMENT_LIST, GET_HLS_STREAMING_SESSION_URL
     *
     * @param aPIName <p>
     *            The name of the API action for which to get an endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see APIName
     */
    public GetDataEndpointRequest withAPIName(String aPIName) {
        this.aPIName = aPIName;
        return this;
    }

    /**
     * <p>
     * The name of the API action for which to get an endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS,
     * GET_MEDIA_FOR_FRAGMENT_LIST, GET_HLS_STREAMING_SESSION_URL
     *
     * @param aPIName <p>
     *            The name of the API action for which to get an endpoint.
     *            </p>
     * @see APIName
     */
    public void setAPIName(APIName aPIName) {
        this.aPIName = aPIName.toString();
    }

    /**
     * <p>
     * The name of the API action for which to get an endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS,
     * GET_MEDIA_FOR_FRAGMENT_LIST, GET_HLS_STREAMING_SESSION_URL
     *
     * @param aPIName <p>
     *            The name of the API action for which to get an endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see APIName
     */
    public GetDataEndpointRequest withAPIName(APIName aPIName) {
        this.aPIName = aPIName.toString();
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
        if (getAPIName() != null)
            sb.append("APIName: " + getAPIName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getAPIName() == null) ? 0 : getAPIName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataEndpointRequest == false)
            return false;
        GetDataEndpointRequest other = (GetDataEndpointRequest) obj;

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
        if (other.getAPIName() == null ^ this.getAPIName() == null)
            return false;
        if (other.getAPIName() != null && other.getAPIName().equals(this.getAPIName()) == false)
            return false;
        return true;
    }
}
