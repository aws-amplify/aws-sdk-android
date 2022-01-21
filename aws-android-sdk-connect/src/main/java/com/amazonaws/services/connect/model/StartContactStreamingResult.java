/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class StartContactStreamingResult implements Serializable {
    /**
     * <p>
     * The identifier of the streaming configuration enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String streamingId;

    /**
     * <p>
     * The identifier of the streaming configuration enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the streaming configuration enabled.
     *         </p>
     */
    public String getStreamingId() {
        return streamingId;
    }

    /**
     * <p>
     * The identifier of the streaming configuration enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param streamingId <p>
     *            The identifier of the streaming configuration enabled.
     *            </p>
     */
    public void setStreamingId(String streamingId) {
        this.streamingId = streamingId;
    }

    /**
     * <p>
     * The identifier of the streaming configuration enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param streamingId <p>
     *            The identifier of the streaming configuration enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartContactStreamingResult withStreamingId(String streamingId) {
        this.streamingId = streamingId;
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
        if (getStreamingId() != null)
            sb.append("StreamingId: " + getStreamingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStreamingId() == null) ? 0 : getStreamingId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartContactStreamingResult == false)
            return false;
        StartContactStreamingResult other = (StartContactStreamingResult) obj;

        if (other.getStreamingId() == null ^ this.getStreamingId() == null)
            return false;
        if (other.getStreamingId() != null
                && other.getStreamingId().equals(this.getStreamingId()) == false)
            return false;
        return true;
    }
}
