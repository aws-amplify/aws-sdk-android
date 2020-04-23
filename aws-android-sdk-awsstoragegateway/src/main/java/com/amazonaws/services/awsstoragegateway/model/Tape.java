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

package com.amazonaws.services.awsstoragegateway.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a virtual tape object.
 * </p>
 */
public class Tape implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov):storagegateway:[a-z\-0-9]+:[0
     * -9]+:tape\/[0-9A-Z]{7,16}$<br/>
     */
    private String tapeARN;

    /**
     * <p>
     * The barcode that identifies a specific virtual tape.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 16<br/>
     * <b>Pattern: </b>^[A-Z0-9]*$<br/>
     */
    private String tapeBarcode;

    /**
     * <p>
     * The date the virtual tape was created.
     * </p>
     */
    private java.util.Date tapeCreatedDate;

    /**
     * <p>
     * The size, in bytes, of the virtual tape capacity.
     * </p>
     */
    private Long tapeSizeInBytes;

    /**
     * <p>
     * The current state of the virtual tape.
     * </p>
     */
    private String tapeStatus;

    /**
     * <p>
     * The virtual tape library (VTL) device that the virtual tape is associated
     * with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String vTLDevice;

    /**
     * <p>
     * For archiving virtual tapes, indicates how much data remains to be
     * uploaded before archiving is complete.
     * </p>
     * <p>
     * Range: 0 (not started) to 100 (complete).
     * </p>
     */
    private Double progress;

    /**
     * <p>
     * The size, in bytes, of data stored on the virtual tape.
     * </p>
     * <note>
     * <p>
     * This value is not available for tapes created prior to May 13, 2015.
     * </p>
     * </note>
     */
    private Long tapeUsedInBytes;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3
     * server-side encryption. This value can only be set when KMSEncrypted is
     * true. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     */
    private String kMSKey;

    /**
     * <p>
     * The ID of the pool that contains tapes that will be archived. The tapes
     * in this pool are archived in the S3 storage class that is associated with
     * the pool. When you use your backup application to eject the tape, the
     * tape is archived directly into the storage class (S3 Glacier or S#
     * Glacier Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String poolId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov):storagegateway:[a-z\-0-9]+:[0
     * -9]+:tape\/[0-9A-Z]{7,16}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the virtual tape.
     *         </p>
     */
    public String getTapeARN() {
        return tapeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov):storagegateway:[a-z\-0-9]+:[0
     * -9]+:tape\/[0-9A-Z]{7,16}$<br/>
     *
     * @param tapeARN <p>
     *            The Amazon Resource Name (ARN) of the virtual tape.
     *            </p>
     */
    public void setTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov):storagegateway:[a-z\-0-9]+:[0
     * -9]+:tape\/[0-9A-Z]{7,16}$<br/>
     *
     * @param tapeARN <p>
     *            The Amazon Resource Name (ARN) of the virtual tape.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tape withTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
        return this;
    }

    /**
     * <p>
     * The barcode that identifies a specific virtual tape.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 16<br/>
     * <b>Pattern: </b>^[A-Z0-9]*$<br/>
     *
     * @return <p>
     *         The barcode that identifies a specific virtual tape.
     *         </p>
     */
    public String getTapeBarcode() {
        return tapeBarcode;
    }

    /**
     * <p>
     * The barcode that identifies a specific virtual tape.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 16<br/>
     * <b>Pattern: </b>^[A-Z0-9]*$<br/>
     *
     * @param tapeBarcode <p>
     *            The barcode that identifies a specific virtual tape.
     *            </p>
     */
    public void setTapeBarcode(String tapeBarcode) {
        this.tapeBarcode = tapeBarcode;
    }

    /**
     * <p>
     * The barcode that identifies a specific virtual tape.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 16<br/>
     * <b>Pattern: </b>^[A-Z0-9]*$<br/>
     *
     * @param tapeBarcode <p>
     *            The barcode that identifies a specific virtual tape.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tape withTapeBarcode(String tapeBarcode) {
        this.tapeBarcode = tapeBarcode;
        return this;
    }

    /**
     * <p>
     * The date the virtual tape was created.
     * </p>
     *
     * @return <p>
     *         The date the virtual tape was created.
     *         </p>
     */
    public java.util.Date getTapeCreatedDate() {
        return tapeCreatedDate;
    }

    /**
     * <p>
     * The date the virtual tape was created.
     * </p>
     *
     * @param tapeCreatedDate <p>
     *            The date the virtual tape was created.
     *            </p>
     */
    public void setTapeCreatedDate(java.util.Date tapeCreatedDate) {
        this.tapeCreatedDate = tapeCreatedDate;
    }

    /**
     * <p>
     * The date the virtual tape was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapeCreatedDate <p>
     *            The date the virtual tape was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tape withTapeCreatedDate(java.util.Date tapeCreatedDate) {
        this.tapeCreatedDate = tapeCreatedDate;
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
    public Tape withTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
        return this;
    }

    /**
     * <p>
     * The current state of the virtual tape.
     * </p>
     *
     * @return <p>
     *         The current state of the virtual tape.
     *         </p>
     */
    public String getTapeStatus() {
        return tapeStatus;
    }

    /**
     * <p>
     * The current state of the virtual tape.
     * </p>
     *
     * @param tapeStatus <p>
     *            The current state of the virtual tape.
     *            </p>
     */
    public void setTapeStatus(String tapeStatus) {
        this.tapeStatus = tapeStatus;
    }

    /**
     * <p>
     * The current state of the virtual tape.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapeStatus <p>
     *            The current state of the virtual tape.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tape withTapeStatus(String tapeStatus) {
        this.tapeStatus = tapeStatus;
        return this;
    }

    /**
     * <p>
     * The virtual tape library (VTL) device that the virtual tape is associated
     * with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The virtual tape library (VTL) device that the virtual tape is
     *         associated with.
     *         </p>
     */
    public String getVTLDevice() {
        return vTLDevice;
    }

    /**
     * <p>
     * The virtual tape library (VTL) device that the virtual tape is associated
     * with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param vTLDevice <p>
     *            The virtual tape library (VTL) device that the virtual tape is
     *            associated with.
     *            </p>
     */
    public void setVTLDevice(String vTLDevice) {
        this.vTLDevice = vTLDevice;
    }

    /**
     * <p>
     * The virtual tape library (VTL) device that the virtual tape is associated
     * with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param vTLDevice <p>
     *            The virtual tape library (VTL) device that the virtual tape is
     *            associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tape withVTLDevice(String vTLDevice) {
        this.vTLDevice = vTLDevice;
        return this;
    }

    /**
     * <p>
     * For archiving virtual tapes, indicates how much data remains to be
     * uploaded before archiving is complete.
     * </p>
     * <p>
     * Range: 0 (not started) to 100 (complete).
     * </p>
     *
     * @return <p>
     *         For archiving virtual tapes, indicates how much data remains to
     *         be uploaded before archiving is complete.
     *         </p>
     *         <p>
     *         Range: 0 (not started) to 100 (complete).
     *         </p>
     */
    public Double getProgress() {
        return progress;
    }

    /**
     * <p>
     * For archiving virtual tapes, indicates how much data remains to be
     * uploaded before archiving is complete.
     * </p>
     * <p>
     * Range: 0 (not started) to 100 (complete).
     * </p>
     *
     * @param progress <p>
     *            For archiving virtual tapes, indicates how much data remains
     *            to be uploaded before archiving is complete.
     *            </p>
     *            <p>
     *            Range: 0 (not started) to 100 (complete).
     *            </p>
     */
    public void setProgress(Double progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * For archiving virtual tapes, indicates how much data remains to be
     * uploaded before archiving is complete.
     * </p>
     * <p>
     * Range: 0 (not started) to 100 (complete).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progress <p>
     *            For archiving virtual tapes, indicates how much data remains
     *            to be uploaded before archiving is complete.
     *            </p>
     *            <p>
     *            Range: 0 (not started) to 100 (complete).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tape withProgress(Double progress) {
        this.progress = progress;
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of data stored on the virtual tape.
     * </p>
     * <note>
     * <p>
     * This value is not available for tapes created prior to May 13, 2015.
     * </p>
     * </note>
     *
     * @return <p>
     *         The size, in bytes, of data stored on the virtual tape.
     *         </p>
     *         <note>
     *         <p>
     *         This value is not available for tapes created prior to May 13,
     *         2015.
     *         </p>
     *         </note>
     */
    public Long getTapeUsedInBytes() {
        return tapeUsedInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of data stored on the virtual tape.
     * </p>
     * <note>
     * <p>
     * This value is not available for tapes created prior to May 13, 2015.
     * </p>
     * </note>
     *
     * @param tapeUsedInBytes <p>
     *            The size, in bytes, of data stored on the virtual tape.
     *            </p>
     *            <note>
     *            <p>
     *            This value is not available for tapes created prior to May 13,
     *            2015.
     *            </p>
     *            </note>
     */
    public void setTapeUsedInBytes(Long tapeUsedInBytes) {
        this.tapeUsedInBytes = tapeUsedInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of data stored on the virtual tape.
     * </p>
     * <note>
     * <p>
     * This value is not available for tapes created prior to May 13, 2015.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapeUsedInBytes <p>
     *            The size, in bytes, of data stored on the virtual tape.
     *            </p>
     *            <note>
     *            <p>
     *            This value is not available for tapes created prior to May 13,
     *            2015.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tape withTapeUsedInBytes(Long tapeUsedInBytes) {
        this.tapeUsedInBytes = tapeUsedInBytes;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3
     * server-side encryption. This value can only be set when KMSEncrypted is
     * true. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon
     *         S3 server-side encryption. This value can only be set when
     *         KMSEncrypted is true. Optional.
     *         </p>
     */
    public String getKMSKey() {
        return kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3
     * server-side encryption. This value can only be set when KMSEncrypted is
     * true. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     *
     * @param kMSKey <p>
     *            The Amazon Resource Name (ARN) of the AWS KMS key used for
     *            Amazon S3 server-side encryption. This value can only be set
     *            when KMSEncrypted is true. Optional.
     *            </p>
     */
    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3
     * server-side encryption. This value can only be set when KMSEncrypted is
     * true. Optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     *
     * @param kMSKey <p>
     *            The Amazon Resource Name (ARN) of the AWS KMS key used for
     *            Amazon S3 server-side encryption. This value can only be set
     *            when KMSEncrypted is true. Optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tape withKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
        return this;
    }

    /**
     * <p>
     * The ID of the pool that contains tapes that will be archived. The tapes
     * in this pool are archived in the S3 storage class that is associated with
     * the pool. When you use your backup application to eject the tape, the
     * tape is archived directly into the storage class (S3 Glacier or S#
     * Glacier Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The ID of the pool that contains tapes that will be archived. The
     *         tapes in this pool are archived in the S3 storage class that is
     *         associated with the pool. When you use your backup application to
     *         eject the tape, the tape is archived directly into the storage
     *         class (S3 Glacier or S# Glacier Deep Archive) that corresponds to
     *         the pool.
     *         </p>
     *         <p>
     *         Valid values: "GLACIER", "DEEP_ARCHIVE"
     *         </p>
     */
    public String getPoolId() {
        return poolId;
    }

    /**
     * <p>
     * The ID of the pool that contains tapes that will be archived. The tapes
     * in this pool are archived in the S3 storage class that is associated with
     * the pool. When you use your backup application to eject the tape, the
     * tape is archived directly into the storage class (S3 Glacier or S#
     * Glacier Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param poolId <p>
     *            The ID of the pool that contains tapes that will be archived.
     *            The tapes in this pool are archived in the S3 storage class
     *            that is associated with the pool. When you use your backup
     *            application to eject the tape, the tape is archived directly
     *            into the storage class (S3 Glacier or S# Glacier Deep Archive)
     *            that corresponds to the pool.
     *            </p>
     *            <p>
     *            Valid values: "GLACIER", "DEEP_ARCHIVE"
     *            </p>
     */
    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the pool that contains tapes that will be archived. The tapes
     * in this pool are archived in the S3 storage class that is associated with
     * the pool. When you use your backup application to eject the tape, the
     * tape is archived directly into the storage class (S3 Glacier or S#
     * Glacier Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param poolId <p>
     *            The ID of the pool that contains tapes that will be archived.
     *            The tapes in this pool are archived in the S3 storage class
     *            that is associated with the pool. When you use your backup
     *            application to eject the tape, the tape is archived directly
     *            into the storage class (S3 Glacier or S# Glacier Deep Archive)
     *            that corresponds to the pool.
     *            </p>
     *            <p>
     *            Valid values: "GLACIER", "DEEP_ARCHIVE"
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tape withPoolId(String poolId) {
        this.poolId = poolId;
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
        if (getTapeARN() != null)
            sb.append("TapeARN: " + getTapeARN() + ",");
        if (getTapeBarcode() != null)
            sb.append("TapeBarcode: " + getTapeBarcode() + ",");
        if (getTapeCreatedDate() != null)
            sb.append("TapeCreatedDate: " + getTapeCreatedDate() + ",");
        if (getTapeSizeInBytes() != null)
            sb.append("TapeSizeInBytes: " + getTapeSizeInBytes() + ",");
        if (getTapeStatus() != null)
            sb.append("TapeStatus: " + getTapeStatus() + ",");
        if (getVTLDevice() != null)
            sb.append("VTLDevice: " + getVTLDevice() + ",");
        if (getProgress() != null)
            sb.append("Progress: " + getProgress() + ",");
        if (getTapeUsedInBytes() != null)
            sb.append("TapeUsedInBytes: " + getTapeUsedInBytes() + ",");
        if (getKMSKey() != null)
            sb.append("KMSKey: " + getKMSKey() + ",");
        if (getPoolId() != null)
            sb.append("PoolId: " + getPoolId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeARN() == null) ? 0 : getTapeARN().hashCode());
        hashCode = prime * hashCode
                + ((getTapeBarcode() == null) ? 0 : getTapeBarcode().hashCode());
        hashCode = prime * hashCode
                + ((getTapeCreatedDate() == null) ? 0 : getTapeCreatedDate().hashCode());
        hashCode = prime * hashCode
                + ((getTapeSizeInBytes() == null) ? 0 : getTapeSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getTapeStatus() == null) ? 0 : getTapeStatus().hashCode());
        hashCode = prime * hashCode + ((getVTLDevice() == null) ? 0 : getVTLDevice().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode
                + ((getTapeUsedInBytes() == null) ? 0 : getTapeUsedInBytes().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tape == false)
            return false;
        Tape other = (Tape) obj;

        if (other.getTapeARN() == null ^ this.getTapeARN() == null)
            return false;
        if (other.getTapeARN() != null && other.getTapeARN().equals(this.getTapeARN()) == false)
            return false;
        if (other.getTapeBarcode() == null ^ this.getTapeBarcode() == null)
            return false;
        if (other.getTapeBarcode() != null
                && other.getTapeBarcode().equals(this.getTapeBarcode()) == false)
            return false;
        if (other.getTapeCreatedDate() == null ^ this.getTapeCreatedDate() == null)
            return false;
        if (other.getTapeCreatedDate() != null
                && other.getTapeCreatedDate().equals(this.getTapeCreatedDate()) == false)
            return false;
        if (other.getTapeSizeInBytes() == null ^ this.getTapeSizeInBytes() == null)
            return false;
        if (other.getTapeSizeInBytes() != null
                && other.getTapeSizeInBytes().equals(this.getTapeSizeInBytes()) == false)
            return false;
        if (other.getTapeStatus() == null ^ this.getTapeStatus() == null)
            return false;
        if (other.getTapeStatus() != null
                && other.getTapeStatus().equals(this.getTapeStatus()) == false)
            return false;
        if (other.getVTLDevice() == null ^ this.getVTLDevice() == null)
            return false;
        if (other.getVTLDevice() != null
                && other.getVTLDevice().equals(this.getVTLDevice()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getTapeUsedInBytes() == null ^ this.getTapeUsedInBytes() == null)
            return false;
        if (other.getTapeUsedInBytes() != null
                && other.getTapeUsedInBytes().equals(this.getTapeUsedInBytes()) == false)
            return false;
        if (other.getKMSKey() == null ^ this.getKMSKey() == null)
            return false;
        if (other.getKMSKey() != null && other.getKMSKey().equals(this.getKMSKey()) == false)
            return false;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        return true;
    }
}
