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

public class GetDataEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The new value for the streamName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * The new value for the streamARN property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     */
    private String streamARN;

    /**
     * The new value for the aPIName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS,
     * GET_MEDIA_FOR_FRAGMENT_LIST
     */
    private String aPIName;

    /**
     * Returns the value of the streamName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The value of the streamName property for this object.
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * Sets the value of streamName
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The new value for the streamName property for this
     *            object.
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * Sets the value of the streamName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The new value for the streamName property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDataEndpointRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * Returns the value of the streamARN property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @return The value of the streamARN property for this object.
     */
    public String getStreamARN() {
        return streamARN;
    }

    /**
     * Sets the value of streamARN
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @param streamARN The new value for the streamARN property for this
     *            object.
     */
    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * Sets the value of the streamARN property for this object.
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
     * @param streamARN The new value for the streamARN property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDataEndpointRequest withStreamARN(String streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    /**
     * Returns the value of the aPIName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS,
     * GET_MEDIA_FOR_FRAGMENT_LIST
     *
     * @return The value of the aPIName property for this object.
     * @see APIName
     */
    public String getAPIName() {
        return aPIName;
    }

    /**
     * Sets the value of aPIName
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS,
     * GET_MEDIA_FOR_FRAGMENT_LIST
     *
     * @param aPIName The new value for the aPIName property for this object.
     * @see APIName
     */
    public void setAPIName(String aPIName) {
        this.aPIName = aPIName;
    }

    /**
     * Sets the value of the aPIName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS,
     * GET_MEDIA_FOR_FRAGMENT_LIST
     *
     * @param aPIName The new value for the aPIName property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see APIName
     */
    public GetDataEndpointRequest withAPIName(String aPIName) {
        this.aPIName = aPIName;
        return this;
    }

    /**
     * Sets the value of aPIName
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS,
     * GET_MEDIA_FOR_FRAGMENT_LIST
     *
     * @param aPIName The new value for the aPIName property for this object.
     * @see APIName
     */
    public void setAPIName(APIName aPIName) {
        this.aPIName = aPIName.toString();
    }

    /**
     * Sets the value of the aPIName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS,
     * GET_MEDIA_FOR_FRAGMENT_LIST
     *
     * @param aPIName The new value for the aPIName property for this object.
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
