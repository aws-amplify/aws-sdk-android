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

/**
 * <p>
 * Configuration information of a Kinesis data stream.
 * </p>
 */
public class KinesisStreamConfig implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data stream.
     * </p>
     */
    private String streamArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data stream.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the data stream.
     *         </p>
     */
    public String getStreamArn() {
        return streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data stream.
     * </p>
     *
     * @param streamArn <p>
     *            The Amazon Resource Name (ARN) of the data stream.
     *            </p>
     */
    public void setStreamArn(String streamArn) {
        this.streamArn = streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamArn <p>
     *            The Amazon Resource Name (ARN) of the data stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisStreamConfig withStreamArn(String streamArn) {
        this.streamArn = streamArn;
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
        if (getStreamArn() != null)
            sb.append("StreamArn: " + getStreamArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisStreamConfig == false)
            return false;
        KinesisStreamConfig other = (KinesisStreamConfig) obj;

        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null
                && other.getStreamArn().equals(this.getStreamArn()) == false)
            return false;
        return true;
    }
}
