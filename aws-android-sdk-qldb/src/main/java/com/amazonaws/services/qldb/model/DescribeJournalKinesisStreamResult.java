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

package com.amazonaws.services.qldb.model;

import java.io.Serializable;

public class DescribeJournalKinesisStreamResult implements Serializable {
    /**
     * <p>
     * Information about the QLDB journal stream returned by a
     * <code>DescribeJournalS3Export</code> request.
     * </p>
     */
    private JournalKinesisStreamDescription stream;

    /**
     * <p>
     * Information about the QLDB journal stream returned by a
     * <code>DescribeJournalS3Export</code> request.
     * </p>
     *
     * @return <p>
     *         Information about the QLDB journal stream returned by a
     *         <code>DescribeJournalS3Export</code> request.
     *         </p>
     */
    public JournalKinesisStreamDescription getStream() {
        return stream;
    }

    /**
     * <p>
     * Information about the QLDB journal stream returned by a
     * <code>DescribeJournalS3Export</code> request.
     * </p>
     *
     * @param stream <p>
     *            Information about the QLDB journal stream returned by a
     *            <code>DescribeJournalS3Export</code> request.
     *            </p>
     */
    public void setStream(JournalKinesisStreamDescription stream) {
        this.stream = stream;
    }

    /**
     * <p>
     * Information about the QLDB journal stream returned by a
     * <code>DescribeJournalS3Export</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stream <p>
     *            Information about the QLDB journal stream returned by a
     *            <code>DescribeJournalS3Export</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJournalKinesisStreamResult withStream(JournalKinesisStreamDescription stream) {
        this.stream = stream;
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
        if (getStream() != null)
            sb.append("Stream: " + getStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStream() == null) ? 0 : getStream().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJournalKinesisStreamResult == false)
            return false;
        DescribeJournalKinesisStreamResult other = (DescribeJournalKinesisStreamResult) obj;

        if (other.getStream() == null ^ this.getStream() == null)
            return false;
        if (other.getStream() != null && other.getStream().equals(this.getStream()) == false)
            return false;
        return true;
    }
}
