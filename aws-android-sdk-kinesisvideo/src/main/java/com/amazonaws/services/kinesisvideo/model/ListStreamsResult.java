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

public class ListStreamsResult implements Serializable {
    /**
     * The new value for the streamInfoList property for this object.
     */
    private java.util.List<StreamInfo> streamInfoList = new java.util.ArrayList<StreamInfo>();

    /**
     * The new value for the nextToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     */
    private String nextToken;

    /**
     * Returns the value of the streamInfoList property for this object.
     *
     * @return The value of the streamInfoList property for this object.
     */
    public java.util.List<StreamInfo> getStreamInfoList() {
        return streamInfoList;
    }

    /**
     * Sets the value of streamInfoList
     *
     * @param streamInfoList The new value for the streamInfoList property for
     *            this object.
     */
    public void setStreamInfoList(java.util.Collection<StreamInfo> streamInfoList) {
        if (streamInfoList == null) {
            this.streamInfoList = null;
            return;
        }

        this.streamInfoList = new java.util.ArrayList<StreamInfo>(streamInfoList);
    }

    /**
     * Sets the value of the streamInfoList property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamInfoList The new value for the streamInfoList property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStreamsResult withStreamInfoList(StreamInfo... streamInfoList) {
        if (getStreamInfoList() == null) {
            this.streamInfoList = new java.util.ArrayList<StreamInfo>(streamInfoList.length);
        }
        for (StreamInfo value : streamInfoList) {
            this.streamInfoList.add(value);
        }
        return this;
    }

    /**
     * Sets the value of the streamInfoList property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamInfoList The new value for the streamInfoList property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStreamsResult withStreamInfoList(java.util.Collection<StreamInfo> streamInfoList) {
        setStreamInfoList(streamInfoList);
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
    public ListStreamsResult withNextToken(String nextToken) {
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
        if (getStreamInfoList() != null)
            sb.append("StreamInfoList: " + getStreamInfoList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStreamInfoList() == null) ? 0 : getStreamInfoList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStreamsResult == false)
            return false;
        ListStreamsResult other = (ListStreamsResult) obj;

        if (other.getStreamInfoList() == null ^ this.getStreamInfoList() == null)
            return false;
        if (other.getStreamInfoList() != null
                && other.getStreamInfoList().equals(this.getStreamInfoList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
