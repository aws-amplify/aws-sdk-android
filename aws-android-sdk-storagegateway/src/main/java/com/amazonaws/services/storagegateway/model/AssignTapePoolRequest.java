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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Assigns a tape to a tape pool for archiving. The tape assigned to a pool is
 * archived in the S3 storage class that is associated with the pool. When you
 * use your backup application to eject the tape, the tape is archived directly
 * into the S3 storage class (S3 Glacier or S3 Glacier Deep Archive) that
 * corresponds to the pool.
 * </p>
 * <p>
 * Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
 * </p>
 */
public class AssignTapePoolRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the virtual tape that you want
     * to add to the tape pool.
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
     * The ID of the pool that you want to add your tape to for archiving. The
     * tape in this pool is archived in the S3 storage class that is associated
     * with the pool. When you use your backup application to eject the tape,
     * the tape is archived directly into the storage class (S3 Glacier or S3
     * Glacier Deep Archive) that corresponds to the pool.
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
     * The unique Amazon Resource Name (ARN) of the virtual tape that you want
     * to add to the tape pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov):storagegateway:[a-z\-0-9]+:[0
     * -9]+:tape\/[0-9A-Z]{7,16}$<br/>
     *
     * @return <p>
     *         The unique Amazon Resource Name (ARN) of the virtual tape that
     *         you want to add to the tape pool.
     *         </p>
     */
    public String getTapeARN() {
        return tapeARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the virtual tape that you want
     * to add to the tape pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov):storagegateway:[a-z\-0-9]+:[0
     * -9]+:tape\/[0-9A-Z]{7,16}$<br/>
     *
     * @param tapeARN <p>
     *            The unique Amazon Resource Name (ARN) of the virtual tape that
     *            you want to add to the tape pool.
     *            </p>
     */
    public void setTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the virtual tape that you want
     * to add to the tape pool.
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
     *            The unique Amazon Resource Name (ARN) of the virtual tape that
     *            you want to add to the tape pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssignTapePoolRequest withTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
        return this;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The
     * tape in this pool is archived in the S3 storage class that is associated
     * with the pool. When you use your backup application to eject the tape,
     * the tape is archived directly into the storage class (S3 Glacier or S3
     * Glacier Deep Archive) that corresponds to the pool.
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
     *         archiving. The tape in this pool is archived in the S3 storage
     *         class that is associated with the pool. When you use your backup
     *         application to eject the tape, the tape is archived directly into
     *         the storage class (S3 Glacier or S3 Glacier Deep Archive) that
     *         corresponds to the pool.
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
     * tape in this pool is archived in the S3 storage class that is associated
     * with the pool. When you use your backup application to eject the tape,
     * the tape is archived directly into the storage class (S3 Glacier or S3
     * Glacier Deep Archive) that corresponds to the pool.
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
     *            archiving. The tape in this pool is archived in the S3 storage
     *            class that is associated with the pool. When you use your
     *            backup application to eject the tape, the tape is archived
     *            directly into the storage class (S3 Glacier or S3 Glacier Deep
     *            Archive) that corresponds to the pool.
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
     * tape in this pool is archived in the S3 storage class that is associated
     * with the pool. When you use your backup application to eject the tape,
     * the tape is archived directly into the storage class (S3 Glacier or S3
     * Glacier Deep Archive) that corresponds to the pool.
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
     *            archiving. The tape in this pool is archived in the S3 storage
     *            class that is associated with the pool. When you use your
     *            backup application to eject the tape, the tape is archived
     *            directly into the storage class (S3 Glacier or S3 Glacier Deep
     *            Archive) that corresponds to the pool.
     *            </p>
     *            <p>
     *            Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssignTapePoolRequest withPoolId(String poolId) {
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
        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssignTapePoolRequest == false)
            return false;
        AssignTapePoolRequest other = (AssignTapePoolRequest) obj;

        if (other.getTapeARN() == null ^ this.getTapeARN() == null)
            return false;
        if (other.getTapeARN() != null && other.getTapeARN().equals(this.getTapeARN()) == false)
            return false;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        return true;
    }
}
