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
 * Describes a recovery point.
 * </p>
 */
public class TapeRecoveryPointInfo implements Serializable {
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
     * The time when the point-in-time view of the virtual tape was replicated
     * for later recovery.
     * </p>
     * <p>
     * The default time stamp format of the tape recovery point time is in the
     * ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     * </p>
     */
    private java.util.Date tapeRecoveryPointTime;

    /**
     * <p>
     * The size, in bytes, of the virtual tapes to recover.
     * </p>
     */
    private Long tapeSizeInBytes;

    /**
     * <p>
     * The status of the virtual tapes.
     * </p>
     */
    private String tapeStatus;

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
    public TapeRecoveryPointInfo withTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
        return this;
    }

    /**
     * <p>
     * The time when the point-in-time view of the virtual tape was replicated
     * for later recovery.
     * </p>
     * <p>
     * The default time stamp format of the tape recovery point time is in the
     * ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     * </p>
     *
     * @return <p>
     *         The time when the point-in-time view of the virtual tape was
     *         replicated for later recovery.
     *         </p>
     *         <p>
     *         The default time stamp format of the tape recovery point time is
     *         in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     *         </p>
     */
    public java.util.Date getTapeRecoveryPointTime() {
        return tapeRecoveryPointTime;
    }

    /**
     * <p>
     * The time when the point-in-time view of the virtual tape was replicated
     * for later recovery.
     * </p>
     * <p>
     * The default time stamp format of the tape recovery point time is in the
     * ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     * </p>
     *
     * @param tapeRecoveryPointTime <p>
     *            The time when the point-in-time view of the virtual tape was
     *            replicated for later recovery.
     *            </p>
     *            <p>
     *            The default time stamp format of the tape recovery point time
     *            is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     *            </p>
     */
    public void setTapeRecoveryPointTime(java.util.Date tapeRecoveryPointTime) {
        this.tapeRecoveryPointTime = tapeRecoveryPointTime;
    }

    /**
     * <p>
     * The time when the point-in-time view of the virtual tape was replicated
     * for later recovery.
     * </p>
     * <p>
     * The default time stamp format of the tape recovery point time is in the
     * ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapeRecoveryPointTime <p>
     *            The time when the point-in-time view of the virtual tape was
     *            replicated for later recovery.
     *            </p>
     *            <p>
     *            The default time stamp format of the tape recovery point time
     *            is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TapeRecoveryPointInfo withTapeRecoveryPointTime(java.util.Date tapeRecoveryPointTime) {
        this.tapeRecoveryPointTime = tapeRecoveryPointTime;
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tapes to recover.
     * </p>
     *
     * @return <p>
     *         The size, in bytes, of the virtual tapes to recover.
     *         </p>
     */
    public Long getTapeSizeInBytes() {
        return tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tapes to recover.
     * </p>
     *
     * @param tapeSizeInBytes <p>
     *            The size, in bytes, of the virtual tapes to recover.
     *            </p>
     */
    public void setTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tapes to recover.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapeSizeInBytes <p>
     *            The size, in bytes, of the virtual tapes to recover.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TapeRecoveryPointInfo withTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
        return this;
    }

    /**
     * <p>
     * The status of the virtual tapes.
     * </p>
     *
     * @return <p>
     *         The status of the virtual tapes.
     *         </p>
     */
    public String getTapeStatus() {
        return tapeStatus;
    }

    /**
     * <p>
     * The status of the virtual tapes.
     * </p>
     *
     * @param tapeStatus <p>
     *            The status of the virtual tapes.
     *            </p>
     */
    public void setTapeStatus(String tapeStatus) {
        this.tapeStatus = tapeStatus;
    }

    /**
     * <p>
     * The status of the virtual tapes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapeStatus <p>
     *            The status of the virtual tapes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TapeRecoveryPointInfo withTapeStatus(String tapeStatus) {
        this.tapeStatus = tapeStatus;
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
        if (getTapeRecoveryPointTime() != null)
            sb.append("TapeRecoveryPointTime: " + getTapeRecoveryPointTime() + ",");
        if (getTapeSizeInBytes() != null)
            sb.append("TapeSizeInBytes: " + getTapeSizeInBytes() + ",");
        if (getTapeStatus() != null)
            sb.append("TapeStatus: " + getTapeStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeARN() == null) ? 0 : getTapeARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getTapeRecoveryPointTime() == null) ? 0 : getTapeRecoveryPointTime().hashCode());
        hashCode = prime * hashCode
                + ((getTapeSizeInBytes() == null) ? 0 : getTapeSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getTapeStatus() == null) ? 0 : getTapeStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TapeRecoveryPointInfo == false)
            return false;
        TapeRecoveryPointInfo other = (TapeRecoveryPointInfo) obj;

        if (other.getTapeARN() == null ^ this.getTapeARN() == null)
            return false;
        if (other.getTapeARN() != null && other.getTapeARN().equals(this.getTapeARN()) == false)
            return false;
        if (other.getTapeRecoveryPointTime() == null ^ this.getTapeRecoveryPointTime() == null)
            return false;
        if (other.getTapeRecoveryPointTime() != null
                && other.getTapeRecoveryPointTime().equals(this.getTapeRecoveryPointTime()) == false)
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
        return true;
    }
}
