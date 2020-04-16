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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Purchases a reserved DB instance offering.
 * </p>
 */
public class PurchaseReservedDBInstancesOfferingRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the Reserved DB instance offering to purchase.
     * </p>
     * <p>
     * Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
     * </p>
     */
    private String reservedDBInstancesOfferingId;

    /**
     * <p>
     * Customer-specified identifier to track this reservation.
     * </p>
     * <p>
     * Example: myreservationID
     * </p>
     */
    private String reservedDBInstanceId;

    /**
     * <p>
     * The number of instances to reserve.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     */
    private Integer dBInstanceCount;

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the Reserved DB instance offering to purchase.
     * </p>
     * <p>
     * Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
     * </p>
     *
     * @return <p>
     *         The ID of the Reserved DB instance offering to purchase.
     *         </p>
     *         <p>
     *         Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
     *         </p>
     */
    public String getReservedDBInstancesOfferingId() {
        return reservedDBInstancesOfferingId;
    }

    /**
     * <p>
     * The ID of the Reserved DB instance offering to purchase.
     * </p>
     * <p>
     * Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
     * </p>
     *
     * @param reservedDBInstancesOfferingId <p>
     *            The ID of the Reserved DB instance offering to purchase.
     *            </p>
     *            <p>
     *            Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
     *            </p>
     */
    public void setReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
    }

    /**
     * <p>
     * The ID of the Reserved DB instance offering to purchase.
     * </p>
     * <p>
     * Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedDBInstancesOfferingId <p>
     *            The ID of the Reserved DB instance offering to purchase.
     *            </p>
     *            <p>
     *            Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedDBInstancesOfferingRequest withReservedDBInstancesOfferingId(
            String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
        return this;
    }

    /**
     * <p>
     * Customer-specified identifier to track this reservation.
     * </p>
     * <p>
     * Example: myreservationID
     * </p>
     *
     * @return <p>
     *         Customer-specified identifier to track this reservation.
     *         </p>
     *         <p>
     *         Example: myreservationID
     *         </p>
     */
    public String getReservedDBInstanceId() {
        return reservedDBInstanceId;
    }

    /**
     * <p>
     * Customer-specified identifier to track this reservation.
     * </p>
     * <p>
     * Example: myreservationID
     * </p>
     *
     * @param reservedDBInstanceId <p>
     *            Customer-specified identifier to track this reservation.
     *            </p>
     *            <p>
     *            Example: myreservationID
     *            </p>
     */
    public void setReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
    }

    /**
     * <p>
     * Customer-specified identifier to track this reservation.
     * </p>
     * <p>
     * Example: myreservationID
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedDBInstanceId <p>
     *            Customer-specified identifier to track this reservation.
     *            </p>
     *            <p>
     *            Example: myreservationID
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedDBInstancesOfferingRequest withReservedDBInstanceId(
            String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
        return this;
    }

    /**
     * <p>
     * The number of instances to reserve.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     *
     * @return <p>
     *         The number of instances to reserve.
     *         </p>
     *         <p>
     *         Default: <code>1</code>
     *         </p>
     */
    public Integer getDBInstanceCount() {
        return dBInstanceCount;
    }

    /**
     * <p>
     * The number of instances to reserve.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     *
     * @param dBInstanceCount <p>
     *            The number of instances to reserve.
     *            </p>
     *            <p>
     *            Default: <code>1</code>
     *            </p>
     */
    public void setDBInstanceCount(Integer dBInstanceCount) {
        this.dBInstanceCount = dBInstanceCount;
    }

    /**
     * <p>
     * The number of instances to reserve.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceCount <p>
     *            The number of instances to reserve.
     *            </p>
     *            <p>
     *            Default: <code>1</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedDBInstancesOfferingRequest withDBInstanceCount(Integer dBInstanceCount) {
        this.dBInstanceCount = dBInstanceCount;
        return this;
    }

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @return <p>
     *         A list of tags. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *         >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *         Guide.</i>
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param tags <p>
     *            A list of tags. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *            >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *            >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedDBInstancesOfferingRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *            >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedDBInstancesOfferingRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getReservedDBInstancesOfferingId() != null)
            sb.append("ReservedDBInstancesOfferingId: " + getReservedDBInstancesOfferingId() + ",");
        if (getReservedDBInstanceId() != null)
            sb.append("ReservedDBInstanceId: " + getReservedDBInstanceId() + ",");
        if (getDBInstanceCount() != null)
            sb.append("DBInstanceCount: " + getDBInstanceCount() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReservedDBInstancesOfferingId() == null) ? 0
                        : getReservedDBInstancesOfferingId().hashCode());
        hashCode = prime * hashCode
                + ((getReservedDBInstanceId() == null) ? 0 : getReservedDBInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceCount() == null) ? 0 : getDBInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseReservedDBInstancesOfferingRequest == false)
            return false;
        PurchaseReservedDBInstancesOfferingRequest other = (PurchaseReservedDBInstancesOfferingRequest) obj;

        if (other.getReservedDBInstancesOfferingId() == null
                ^ this.getReservedDBInstancesOfferingId() == null)
            return false;
        if (other.getReservedDBInstancesOfferingId() != null
                && other.getReservedDBInstancesOfferingId().equals(
                        this.getReservedDBInstancesOfferingId()) == false)
            return false;
        if (other.getReservedDBInstanceId() == null ^ this.getReservedDBInstanceId() == null)
            return false;
        if (other.getReservedDBInstanceId() != null
                && other.getReservedDBInstanceId().equals(this.getReservedDBInstanceId()) == false)
            return false;
        if (other.getDBInstanceCount() == null ^ this.getDBInstanceCount() == null)
            return false;
        if (other.getDBInstanceCount() != null
                && other.getDBInstanceCount().equals(this.getDBInstanceCount()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
