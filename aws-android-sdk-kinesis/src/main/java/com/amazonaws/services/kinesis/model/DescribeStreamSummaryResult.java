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

package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

public class DescribeStreamSummaryResult implements Serializable {
    /**
     * <p>
     * A <a>StreamDescriptionSummary</a> containing information about the
     * stream.
     * </p>
     */
    private StreamDescriptionSummary streamDescriptionSummary;

    /**
     * <p>
     * A <a>StreamDescriptionSummary</a> containing information about the
     * stream.
     * </p>
     *
     * @return <p>
     *         A <a>StreamDescriptionSummary</a> containing information about
     *         the stream.
     *         </p>
     */
    public StreamDescriptionSummary getStreamDescriptionSummary() {
        return streamDescriptionSummary;
    }

    /**
     * <p>
     * A <a>StreamDescriptionSummary</a> containing information about the
     * stream.
     * </p>
     *
     * @param streamDescriptionSummary <p>
     *            A <a>StreamDescriptionSummary</a> containing information about
     *            the stream.
     *            </p>
     */
    public void setStreamDescriptionSummary(StreamDescriptionSummary streamDescriptionSummary) {
        this.streamDescriptionSummary = streamDescriptionSummary;
    }

    /**
     * <p>
     * A <a>StreamDescriptionSummary</a> containing information about the
     * stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamDescriptionSummary <p>
     *            A <a>StreamDescriptionSummary</a> containing information about
     *            the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStreamSummaryResult withStreamDescriptionSummary(
            StreamDescriptionSummary streamDescriptionSummary) {
        this.streamDescriptionSummary = streamDescriptionSummary;
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
        if (getStreamDescriptionSummary() != null)
            sb.append("StreamDescriptionSummary: " + getStreamDescriptionSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getStreamDescriptionSummary() == null) ? 0 : getStreamDescriptionSummary()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStreamSummaryResult == false)
            return false;
        DescribeStreamSummaryResult other = (DescribeStreamSummaryResult) obj;

        if (other.getStreamDescriptionSummary() == null
                ^ this.getStreamDescriptionSummary() == null)
            return false;
        if (other.getStreamDescriptionSummary() != null
                && other.getStreamDescriptionSummary().equals(this.getStreamDescriptionSummary()) == false)
            return false;
        return true;
    }
}
