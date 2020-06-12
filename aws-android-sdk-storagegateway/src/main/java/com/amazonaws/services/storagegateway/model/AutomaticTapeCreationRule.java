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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

/**
 * <p>
 * An automatic tape creation policy consists of automatic tape creation rules
 * where each rule defines when and how to create new tapes.
 * </p>
 */
public class AutomaticTapeCreationRule implements Serializable {
    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape that you are
     * creating. This prefix makes the barcode unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1-4 characters in length and must be one of the
     * uppercase letters from A to Z.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[A-Z]*$<br/>
     */
    private String tapeBarcodePrefix;

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The
     * tape in this pool is archived in the Amazon S3 storage class that is
     * associated with the pool. When you use your backup application to eject
     * the tape, the tape is archived directly into the storage class (S3
     * Glacier or S3 Glacier Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String poolId;

    /**
     * <p>
     * The size, in bytes, of the virtual tape capacity.
     * </p>
     */
    private Long tapeSizeInBytes;

    /**
     * <p>
     * The minimum number of available virtual tapes that the gateway maintains
     * at all times. If the number of tapes on the gateway goes below this
     * value, the gateway creates as many new tapes as are needed to have
     * <code>MinimumNumTapes</code> on the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer minimumNumTapes;

    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape that you are
     * creating. This prefix makes the barcode unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1-4 characters in length and must be one of the
     * uppercase letters from A to Z.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[A-Z]*$<br/>
     *
     * @return <p>
     *         A prefix that you append to the barcode of the virtual tape that
     *         you are creating. This prefix makes the barcode unique.
     *         </p>
     *         <note>
     *         <p>
     *         The prefix must be 1-4 characters in length and must be one of
     *         the uppercase letters from A to Z.
     *         </p>
     *         </note>
     */
    public String getTapeBarcodePrefix() {
        return tapeBarcodePrefix;
    }

    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape that you are
     * creating. This prefix makes the barcode unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1-4 characters in length and must be one of the
     * uppercase letters from A to Z.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[A-Z]*$<br/>
     *
     * @param tapeBarcodePrefix <p>
     *            A prefix that you append to the barcode of the virtual tape
     *            that you are creating. This prefix makes the barcode unique.
     *            </p>
     *            <note>
     *            <p>
     *            The prefix must be 1-4 characters in length and must be one of
     *            the uppercase letters from A to Z.
     *            </p>
     *            </note>
     */
    public void setTapeBarcodePrefix(String tapeBarcodePrefix) {
        this.tapeBarcodePrefix = tapeBarcodePrefix;
    }

    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape that you are
     * creating. This prefix makes the barcode unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1-4 characters in length and must be one of the
     * uppercase letters from A to Z.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[A-Z]*$<br/>
     *
     * @param tapeBarcodePrefix <p>
     *            A prefix that you append to the barcode of the virtual tape
     *            that you are creating. This prefix makes the barcode unique.
     *            </p>
     *            <note>
     *            <p>
     *            The prefix must be 1-4 characters in length and must be one of
     *            the uppercase letters from A to Z.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomaticTapeCreationRule withTapeBarcodePrefix(String tapeBarcodePrefix) {
        this.tapeBarcodePrefix = tapeBarcodePrefix;
        return this;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The
     * tape in this pool is archived in the Amazon S3 storage class that is
     * associated with the pool. When you use your backup application to eject
     * the tape, the tape is archived directly into the storage class (S3
     * Glacier or S3 Glacier Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The ID of the pool that you want to add your tape to for
     *         archiving. The tape in this pool is archived in the Amazon S3
     *         storage class that is associated with the pool. When you use your
     *         backup application to eject the tape, the tape is archived
     *         directly into the storage class (S3 Glacier or S3 Glacier Deep
     *         Archive) that corresponds to the pool.
     *         </p>
     *         <p>
     *         Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     *         </p>
     */
    public String getPoolId() {
        return poolId;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The
     * tape in this pool is archived in the Amazon S3 storage class that is
     * associated with the pool. When you use your backup application to eject
     * the tape, the tape is archived directly into the storage class (S3
     * Glacier or S3 Glacier Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param poolId <p>
     *            The ID of the pool that you want to add your tape to for
     *            archiving. The tape in this pool is archived in the Amazon S3
     *            storage class that is associated with the pool. When you use
     *            your backup application to eject the tape, the tape is
     *            archived directly into the storage class (S3 Glacier or S3
     *            Glacier Deep Archive) that corresponds to the pool.
     *            </p>
     *            <p>
     *            Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     *            </p>
     */
    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The
     * tape in this pool is archived in the Amazon S3 storage class that is
     * associated with the pool. When you use your backup application to eject
     * the tape, the tape is archived directly into the storage class (S3
     * Glacier or S3 Glacier Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param poolId <p>
     *            The ID of the pool that you want to add your tape to for
     *            archiving. The tape in this pool is archived in the Amazon S3
     *            storage class that is associated with the pool. When you use
     *            your backup application to eject the tape, the tape is
     *            archived directly into the storage class (S3 Glacier or S3
     *            Glacier Deep Archive) that corresponds to the pool.
     *            </p>
     *            <p>
     *            Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomaticTapeCreationRule withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tape capacity.
     * </p>
     *
     * @return <p>
     *         The size, in bytes, of the virtual tape capacity.
     *         </p>
     */
    public Long getTapeSizeInBytes() {
        return tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tape capacity.
     * </p>
     *
     * @param tapeSizeInBytes <p>
     *            The size, in bytes, of the virtual tape capacity.
     *            </p>
     */
    public void setTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tape capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapeSizeInBytes <p>
     *            The size, in bytes, of the virtual tape capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomaticTapeCreationRule withTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
        return this;
    }

    /**
     * <p>
     * The minimum number of available virtual tapes that the gateway maintains
     * at all times. If the number of tapes on the gateway goes below this
     * value, the gateway creates as many new tapes as are needed to have
     * <code>MinimumNumTapes</code> on the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return <p>
     *         The minimum number of available virtual tapes that the gateway
     *         maintains at all times. If the number of tapes on the gateway
     *         goes below this value, the gateway creates as many new tapes as
     *         are needed to have <code>MinimumNumTapes</code> on the gateway.
     *         </p>
     */
    public Integer getMinimumNumTapes() {
        return minimumNumTapes;
    }

    /**
     * <p>
     * The minimum number of available virtual tapes that the gateway maintains
     * at all times. If the number of tapes on the gateway goes below this
     * value, the gateway creates as many new tapes as are needed to have
     * <code>MinimumNumTapes</code> on the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param minimumNumTapes <p>
     *            The minimum number of available virtual tapes that the gateway
     *            maintains at all times. If the number of tapes on the gateway
     *            goes below this value, the gateway creates as many new tapes
     *            as are needed to have <code>MinimumNumTapes</code> on the
     *            gateway.
     *            </p>
     */
    public void setMinimumNumTapes(Integer minimumNumTapes) {
        this.minimumNumTapes = minimumNumTapes;
    }

    /**
     * <p>
     * The minimum number of available virtual tapes that the gateway maintains
     * at all times. If the number of tapes on the gateway goes below this
     * value, the gateway creates as many new tapes as are needed to have
     * <code>MinimumNumTapes</code> on the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param minimumNumTapes <p>
     *            The minimum number of available virtual tapes that the gateway
     *            maintains at all times. If the number of tapes on the gateway
     *            goes below this value, the gateway creates as many new tapes
     *            as are needed to have <code>MinimumNumTapes</code> on the
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomaticTapeCreationRule withMinimumNumTapes(Integer minimumNumTapes) {
        this.minimumNumTapes = minimumNumTapes;
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
        if (getTapeBarcodePrefix() != null)
            sb.append("TapeBarcodePrefix: " + getTapeBarcodePrefix() + ",");
        if (getPoolId() != null)
            sb.append("PoolId: " + getPoolId() + ",");
        if (getTapeSizeInBytes() != null)
            sb.append("TapeSizeInBytes: " + getTapeSizeInBytes() + ",");
        if (getMinimumNumTapes() != null)
            sb.append("MinimumNumTapes: " + getMinimumNumTapes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTapeBarcodePrefix() == null) ? 0 : getTapeBarcodePrefix().hashCode());
        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getTapeSizeInBytes() == null) ? 0 : getTapeSizeInBytes().hashCode());
        hashCode = prime * hashCode
                + ((getMinimumNumTapes() == null) ? 0 : getMinimumNumTapes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomaticTapeCreationRule == false)
            return false;
        AutomaticTapeCreationRule other = (AutomaticTapeCreationRule) obj;

        if (other.getTapeBarcodePrefix() == null ^ this.getTapeBarcodePrefix() == null)
            return false;
        if (other.getTapeBarcodePrefix() != null
                && other.getTapeBarcodePrefix().equals(this.getTapeBarcodePrefix()) == false)
            return false;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getTapeSizeInBytes() == null ^ this.getTapeSizeInBytes() == null)
            return false;
        if (other.getTapeSizeInBytes() != null
                && other.getTapeSizeInBytes().equals(this.getTapeSizeInBytes()) == false)
            return false;
        if (other.getMinimumNumTapes() == null ^ this.getMinimumNumTapes() == null)
            return false;
        if (other.getMinimumNumTapes() != null
                && other.getMinimumNumTapes().equals(this.getMinimumNumTapes()) == false)
            return false;
        return true;
    }
}
