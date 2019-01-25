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

public class DescribeStreamResult implements Serializable {
    /**
     * <p>
     * An object that describes the stream.
     * </p>
     */
    private StreamInfo streamInfo;

    /**
     * <p>
     * An object that describes the stream.
     * </p>
     *
     * @return <p>
     *         An object that describes the stream.
     *         </p>
     */
    public StreamInfo getStreamInfo() {
        return streamInfo;
    }

    /**
     * <p>
     * An object that describes the stream.
     * </p>
     *
     * @param streamInfo <p>
     *            An object that describes the stream.
     *            </p>
     */
    public void setStreamInfo(StreamInfo streamInfo) {
        this.streamInfo = streamInfo;
    }

    /**
     * <p>
     * An object that describes the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamInfo <p>
     *            An object that describes the stream.
     *            </p>
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
