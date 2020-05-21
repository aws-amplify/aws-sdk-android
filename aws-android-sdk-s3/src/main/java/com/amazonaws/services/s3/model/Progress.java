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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * This data type contains information about progress of an operation.
 * </p>
 */
public class Progress implements Serializable {
    /**
     * <p>
     * The current number of object bytes scanned.
     * </p>
     */
    private Long bytesScanned;

    /**
     * <p>
     * The current number of uncompressed object bytes processed.
     * </p>
     */
    private Long bytesProcessed;

    /**
     * <p>
     * The current number of bytes of records payload data returned.
     * </p>
     */
    private Long bytesReturned;

    /**
     * <p>
     * The current number of object bytes scanned.
     * </p>
     *
     * @return <p>
     *         The current number of object bytes scanned.
     *         </p>
     */
    public Long getBytesScanned() {
        return bytesScanned;
    }

    /**
     * <p>
     * The current number of object bytes scanned.
     * </p>
     *
     * @param bytesScanned <p>
     *            The current number of object bytes scanned.
     *            </p>
     */
    public void setBytesScanned(Long bytesScanned) {
        this.bytesScanned = bytesScanned;
    }

    /**
     * <p>
     * The current number of object bytes scanned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bytesScanned <p>
     *            The current number of object bytes scanned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Progress withBytesScanned(Long bytesScanned) {
        this.bytesScanned = bytesScanned;
        return this;
    }

    /**
     * <p>
     * The current number of uncompressed object bytes processed.
     * </p>
     *
     * @return <p>
     *         The current number of uncompressed object bytes processed.
     *         </p>
     */
    public Long getBytesProcessed() {
        return bytesProcessed;
    }

    /**
     * <p>
     * The current number of uncompressed object bytes processed.
     * </p>
     *
     * @param bytesProcessed <p>
     *            The current number of uncompressed object bytes processed.
     *            </p>
     */
    public void setBytesProcessed(Long bytesProcessed) {
        this.bytesProcessed = bytesProcessed;
    }

    /**
     * <p>
     * The current number of uncompressed object bytes processed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bytesProcessed <p>
     *            The current number of uncompressed object bytes processed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Progress withBytesProcessed(Long bytesProcessed) {
        this.bytesProcessed = bytesProcessed;
        return this;
    }

    /**
     * <p>
     * The current number of bytes of records payload data returned.
     * </p>
     *
     * @return <p>
     *         The current number of bytes of records payload data returned.
     *         </p>
     */
    public Long getBytesReturned() {
        return bytesReturned;
    }

    /**
     * <p>
     * The current number of bytes of records payload data returned.
     * </p>
     *
     * @param bytesReturned <p>
     *            The current number of bytes of records payload data returned.
     *            </p>
     */
    public void setBytesReturned(Long bytesReturned) {
        this.bytesReturned = bytesReturned;
    }

    /**
     * <p>
     * The current number of bytes of records payload data returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bytesReturned <p>
     *            The current number of bytes of records payload data returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Progress withBytesReturned(Long bytesReturned) {
        this.bytesReturned = bytesReturned;
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
        if (getBytesScanned() != null)
            sb.append("BytesScanned: " + getBytesScanned() + ",");
        if (getBytesProcessed() != null)
            sb.append("BytesProcessed: " + getBytesProcessed() + ",");
        if (getBytesReturned() != null)
            sb.append("BytesReturned: " + getBytesReturned());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBytesScanned() == null) ? 0 : getBytesScanned().hashCode());
        hashCode = prime * hashCode
                + ((getBytesProcessed() == null) ? 0 : getBytesProcessed().hashCode());
        hashCode = prime * hashCode
                + ((getBytesReturned() == null) ? 0 : getBytesReturned().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Progress == false)
            return false;
        Progress other = (Progress) obj;

        if (other.getBytesScanned() == null ^ this.getBytesScanned() == null)
            return false;
        if (other.getBytesScanned() != null
                && other.getBytesScanned().equals(this.getBytesScanned()) == false)
            return false;
        if (other.getBytesProcessed() == null ^ this.getBytesProcessed() == null)
            return false;
        if (other.getBytesProcessed() != null
                && other.getBytesProcessed().equals(this.getBytesProcessed()) == false)
            return false;
        if (other.getBytesReturned() == null ^ this.getBytesReturned() == null)
            return false;
        if (other.getBytesReturned() != null
                && other.getBytesReturned().equals(this.getBytesReturned()) == false)
            return false;
        return true;
    }
}
