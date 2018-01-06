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

public class DescribeStreamResult implements Serializable {
    /**
     * The new value for the streamInfo property for this object.
     */
    private StreamInfo streamInfo;

    /**
     * Returns the value of the streamInfo property for this object.
     *
     * @return The value of the streamInfo property for this object.
     */
    public StreamInfo getStreamInfo() {
        return streamInfo;
    }

    /**
     * Sets the value of streamInfo
     *
     * @param streamInfo The new value for the streamInfo property for this
     *            object.
     */
    public void setStreamInfo(StreamInfo streamInfo) {
        this.streamInfo = streamInfo;
    }

    /**
     * Sets the value of the streamInfo property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamInfo The new value for the streamInfo property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStreamResult withStreamInfo(StreamInfo streamInfo) {
        this.streamInfo = streamInfo;
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
        if (getStreamInfo() != null)
            sb.append("StreamInfo: " + getStreamInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamInfo() == null) ? 0 : getStreamInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStreamResult == false)
            return false;
        DescribeStreamResult other = (DescribeStreamResult) obj;

        if (other.getStreamInfo() == null ^ this.getStreamInfo() == null)
            return false;
        if (other.getStreamInfo() != null
                && other.getStreamInfo().equals(this.getStreamInfo()) == false)
            return false;
        return true;
    }
}
