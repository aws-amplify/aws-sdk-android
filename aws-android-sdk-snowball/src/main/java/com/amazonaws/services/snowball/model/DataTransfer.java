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

package com.amazonaws.services.snowball.model;

import java.io.Serializable;

/**
 * <p>
 * Defines the real-time status of a Snowball's data transfer while the device
 * is at AWS. This data is only available while a job has a
 * <code>JobState</code> value of <code>InProgress</code>, for both import and
 * export jobs.
 * </p>
 */
public class DataTransfer implements Serializable {
    /**
     * <p>
     * The number of bytes transferred between a Snowball and Amazon S3.
     * </p>
     */
    private Long bytesTransferred;

    /**
     * <p>
     * The number of objects transferred between a Snowball and Amazon S3.
     * </p>
     */
    private Long objectsTransferred;

    /**
     * <p>
     * The total bytes of data for a transfer between a Snowball and Amazon S3.
     * This value is set to 0 (zero) until all the keys that will be transferred
     * have been listed.
     * </p>
     */
    private Long totalBytes;

    /**
     * <p>
     * The total number of objects for a transfer between a Snowball and Amazon
     * S3. This value is set to 0 (zero) until all the keys that will be
     * transferred have been listed.
     * </p>
     */
    private Long totalObjects;

    /**
     * <p>
     * The number of bytes transferred between a Snowball and Amazon S3.
     * </p>
     *
     * @return <p>
     *         The number of bytes transferred between a Snowball and Amazon S3.
     *         </p>
     */
    public Long getBytesTransferred() {
        return bytesTransferred;
    }

    /**
     * <p>
     * The number of bytes transferred between a Snowball and Amazon S3.
     * </p>
     *
     * @param bytesTransferred <p>
     *            The number of bytes transferred between a Snowball and Amazon
     *            S3.
     *            </p>
     */
    public void setBytesTransferred(Long bytesTransferred) {
        this.bytesTransferred = bytesTransferred;
    }

    /**
     * <p>
     * The number of bytes transferred between a Snowball and Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bytesTransferred <p>
     *            The number of bytes transferred between a Snowball and Amazon
     *            S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataTransfer withBytesTransferred(Long bytesTransferred) {
        this.bytesTransferred = bytesTransferred;
        return this;
    }

    /**
     * <p>
     * The number of objects transferred between a Snowball and Amazon S3.
     * </p>
     *
     * @return <p>
     *         The number of objects transferred between a Snowball and Amazon
     *         S3.
     *         </p>
     */
    public Long getObjectsTransferred() {
        return objectsTransferred;
    }

    /**
     * <p>
     * The number of objects transferred between a Snowball and Amazon S3.
     * </p>
     *
     * @param objectsTransferred <p>
     *            The number of objects transferred between a Snowball and
     *            Amazon S3.
     *            </p>
     */
    public void setObjectsTransferred(Long objectsTransferred) {
        this.objectsTransferred = objectsTransferred;
    }

    /**
     * <p>
     * The number of objects transferred between a Snowball and Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param objectsTransferred <p>
     *            The number of objects transferred between a Snowball and
     *            Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataTransfer withObjectsTransferred(Long objectsTransferred) {
        this.objectsTransferred = objectsTransferred;
        return this;
    }

    /**
     * <p>
     * The total bytes of data for a transfer between a Snowball and Amazon S3.
     * This value is set to 0 (zero) until all the keys that will be transferred
     * have been listed.
     * </p>
     *
     * @return <p>
     *         The total bytes of data for a transfer between a Snowball and
     *         Amazon S3. This value is set to 0 (zero) until all the keys that
     *         will be transferred have been listed.
     *         </p>
     */
    public Long getTotalBytes() {
        return totalBytes;
    }

    /**
     * <p>
     * The total bytes of data for a transfer between a Snowball and Amazon S3.
     * This value is set to 0 (zero) until all the keys that will be transferred
     * have been listed.
     * </p>
     *
     * @param totalBytes <p>
     *            The total bytes of data for a transfer between a Snowball and
     *            Amazon S3. This value is set to 0 (zero) until all the keys
     *            that will be transferred have been listed.
     *            </p>
     */
    public void setTotalBytes(Long totalBytes) {
        this.totalBytes = totalBytes;
    }

    /**
     * <p>
     * The total bytes of data for a transfer between a Snowball and Amazon S3.
     * This value is set to 0 (zero) until all the keys that will be transferred
     * have been listed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalBytes <p>
     *            The total bytes of data for a transfer between a Snowball and
     *            Amazon S3. This value is set to 0 (zero) until all the keys
     *            that will be transferred have been listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataTransfer withTotalBytes(Long totalBytes) {
        this.totalBytes = totalBytes;
        return this;
    }

    /**
     * <p>
     * The total number of objects for a transfer between a Snowball and Amazon
     * S3. This value is set to 0 (zero) until all the keys that will be
     * transferred have been listed.
     * </p>
     *
     * @return <p>
     *         The total number of objects for a transfer between a Snowball and
     *         Amazon S3. This value is set to 0 (zero) until all the keys that
     *         will be transferred have been listed.
     *         </p>
     */
    public Long getTotalObjects() {
        return totalObjects;
    }

    /**
     * <p>
     * The total number of objects for a transfer between a Snowball and Amazon
     * S3. This value is set to 0 (zero) until all the keys that will be
     * transferred have been listed.
     * </p>
     *
     * @param totalObjects <p>
     *            The total number of objects for a transfer between a Snowball
     *            and Amazon S3. This value is set to 0 (zero) until all the
     *            keys that will be transferred have been listed.
     *            </p>
     */
    public void setTotalObjects(Long totalObjects) {
        this.totalObjects = totalObjects;
    }

    /**
     * <p>
     * The total number of objects for a transfer between a Snowball and Amazon
     * S3. This value is set to 0 (zero) until all the keys that will be
     * transferred have been listed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalObjects <p>
     *            The total number of objects for a transfer between a Snowball
     *            and Amazon S3. This value is set to 0 (zero) until all the
     *            keys that will be transferred have been listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataTransfer withTotalObjects(Long totalObjects) {
        this.totalObjects = totalObjects;
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
        if (getBytesTransferred() != null)
            sb.append("BytesTransferred: " + getBytesTransferred() + ",");
        if (getObjectsTransferred() != null)
            sb.append("ObjectsTransferred: " + getObjectsTransferred() + ",");
        if (getTotalBytes() != null)
            sb.append("TotalBytes: " + getTotalBytes() + ",");
        if (getTotalObjects() != null)
            sb.append("TotalObjects: " + getTotalObjects());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBytesTransferred() == null) ? 0 : getBytesTransferred().hashCode());
        hashCode = prime * hashCode
                + ((getObjectsTransferred() == null) ? 0 : getObjectsTransferred().hashCode());
        hashCode = prime * hashCode + ((getTotalBytes() == null) ? 0 : getTotalBytes().hashCode());
        hashCode = prime * hashCode
                + ((getTotalObjects() == null) ? 0 : getTotalObjects().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataTransfer == false)
            return false;
        DataTransfer other = (DataTransfer) obj;

        if (other.getBytesTransferred() == null ^ this.getBytesTransferred() == null)
            return false;
        if (other.getBytesTransferred() != null
                && other.getBytesTransferred().equals(this.getBytesTransferred()) == false)
            return false;
        if (other.getObjectsTransferred() == null ^ this.getObjectsTransferred() == null)
            return false;
        if (other.getObjectsTransferred() != null
                && other.getObjectsTransferred().equals(this.getObjectsTransferred()) == false)
            return false;
        if (other.getTotalBytes() == null ^ this.getTotalBytes() == null)
            return false;
        if (other.getTotalBytes() != null
                && other.getTotalBytes().equals(this.getTotalBytes()) == false)
            return false;
        if (other.getTotalObjects() == null ^ this.getTotalObjects() == null)
            return false;
        if (other.getTotalObjects() != null
                && other.getTotalObjects().equals(this.getTotalObjects()) == false)
            return false;
        return true;
    }
}
