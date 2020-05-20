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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Endpoint settings for a PUSH type input.
 */
public class InputDestinationRequest implements Serializable {
    /**
     * A unique name for the location the RTMP stream is being pushed to.
     */
    private String streamName;

    /**
     * A unique name for the location the RTMP stream is being pushed to.
     * 
     * @return A unique name for the location the RTMP stream is being pushed to.
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * A unique name for the location the RTMP stream is being pushed to.
     * 
     * @param streamName A unique name for the location the RTMP stream is being
     *            pushed to.
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * A unique name for the location the RTMP stream is being pushed to. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamName A unique name for the location the RTMP stream is being
     *            pushed to. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDestinationRequest withStreamName(String streamName) {
        this.streamName = streamName;
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
            sb.append("StreamName: " + getStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDestinationRequest == false)
            return false;
        InputDestinationRequest other = (InputDestinationRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        return true;
    }
}
