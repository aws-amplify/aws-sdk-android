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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a Reserved Instance listing.
 * </p>
 */
public class ReservedInstancesListing implements Serializable {
    /**
     * <p>
     * A unique, case-sensitive key supplied by the client to ensure that the
     * request is idempotent. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The time the listing was created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The number of instances in this state.
     * </p>
     */
    private java.util.List<InstanceCount> instanceCounts;

    /**
     * <p>
     * The price of the Reserved Instance listing.
     * </p>
     */
    private java.util.List<PriceSchedule> priceSchedules;

    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     */
    private String reservedInstancesId;

    /**
     * <p>
     * The ID of the Reserved Instance listing.
     * </p>
     */
    private String reservedInstancesListingId;

    /**
     * <p>
     * The status of the Reserved Instance listing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, pending, cancelled, closed
     */
    private String status;

    /**
     * <p>
     * The reason for the current status of the Reserved Instance listing. The
     * response can be blank.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The last modified timestamp of the listing.
     * </p>
     */
    private java.util.Date updateDate;

    /**
     * <p>
     * A unique, case-sensitive key supplied by the client to ensure that the
     * request is idempotent. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         A unique, case-sensitive key supplied by the client to ensure
     *         that the request is idempotent. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >Ensuring Idempotency</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive key supplied by the client to ensure that the
     * request is idempotent. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive key supplied by the client to ensure
     *            that the request is idempotent. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive key supplied by the client to ensure that the
     * request is idempotent. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            A unique, case-sensitive key supplied by the client to ensure
     *            that the request is idempotent. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesListing withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The time the listing was created.
     * </p>
     *
     * @return <p>
     *         The time the listing was created.
     *         </p>
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The time the listing was created.
     * </p>
     *
     * @param createDate <p>
     *            The time the listing was created.
     *            </p>
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The time the listing was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createDate <p>
     *            The time the listing was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesListing withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * <p>
     * The number of instances in this state.
     * </p>
     *
     * @return <p>
     *         The number of instances in this state.
     *         </p>
     */
    public java.util.List<InstanceCount> getInstanceCounts() {
        return instanceCounts;
    }

    /**
     * <p>
     * The number of instances in this state.
     * </p>
     *
     * @param instanceCounts <p>
     *            The number of instances in this state.
     *            </p>
     */
    public void setInstanceCounts(java.util.Collection<InstanceCount> instanceCounts) {
        if (instanceCounts == null) {
            this.instanceCounts = null;
            return;
        }

        this.instanceCounts = new java.util.ArrayList<InstanceCount>(instanceCounts);
    }

    /**
     * <p>
     * The number of instances in this state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCounts <p>
     *            The number of instances in this state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesListing withInstanceCounts(InstanceCount... instanceCounts) {
        if (getInstanceCounts() == null) {
            this.instanceCounts = new java.util.ArrayList<InstanceCount>(instanceCounts.length);
        }
        for (InstanceCount value : instanceCounts) {
            this.instanceCounts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The number of instances in this state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCounts <p>
     *            The number of instances in this state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesListing withInstanceCounts(
            java.util.Collection<InstanceCount> instanceCounts) {
        setInstanceCounts(instanceCounts);
        return this;
    }

    /**
     * <p>
     * The price of the Reserved Instance listing.
     * </p>
     *
     * @return <p>
     *         The price of the Reserved Instance listing.
     *         </p>
     */
    public java.util.List<PriceSchedule> getPriceSchedules() {
        return priceSchedules;
    }

    /**
     * <p>
     * The price of the Reserved Instance listing.
     * </p>
     *
     * @param priceSchedules <p>
     *            The price of the Reserved Instance listing.
     *            </p>
     */
    public void setPriceSchedules(java.util.Collection<PriceSchedule> priceSchedules) {
        if (priceSchedules == null) {
            this.priceSchedules = null;
            return;
        }

        this.priceSchedules = new java.util.ArrayList<PriceSchedule>(priceSchedules);
    }

    /**
     * <p>
     * The price of the Reserved Instance listing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param priceSchedules <p>
     *            The price of the Reserved Instance listing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesListing withPriceSchedules(PriceSchedule... priceSchedules) {
        if (getPriceSchedules() == null) {
            this.priceSchedules = new java.util.ArrayList<PriceSchedule>(priceSchedules.length);
        }
        for (PriceSchedule value : priceSchedules) {
            this.priceSchedules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The price of the Reserved Instance listing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param priceSchedules <p>
     *            The price of the Reserved Instance listing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesListing withPriceSchedules(
            java.util.Collection<PriceSchedule> priceSchedules) {
        setPriceSchedules(priceSchedules);
        return this;
    }

    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     *
     * @return <p>
     *         The ID of the Reserved Instance.
     *         </p>
     */
    public String getReservedInstancesId() {
        return reservedInstancesId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     *
     * @param reservedInstancesId <p>
     *            The ID of the Reserved Instance.
     *            </p>
     */
    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesId <p>
     *            The ID of the Reserved Instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesListing withReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
        return this;
    }

    /**
     * <p>
     * The ID of the Reserved Instance listing.
     * </p>
     *
     * @return <p>
     *         The ID of the Reserved Instance listing.
     *         </p>
     */
    public String getReservedInstancesListingId() {
        return reservedInstancesListingId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance listing.
     * </p>
     *
     * @param reservedInstancesListingId <p>
     *            The ID of the Reserved Instance listing.
     *            </p>
     */
    public void setReservedInstancesListingId(String reservedInstancesListingId) {
        this.reservedInstancesListingId = reservedInstancesListingId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance listing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesListingId <p>
     *            The ID of the Reserved Instance listing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesListing withReservedInstancesListingId(String reservedInstancesListingId) {
        this.reservedInstancesListingId = reservedInstancesListingId;
        return this;
    }

    /**
     * <p>
     * The status of the Reserved Instance listing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, pending, cancelled, closed
     *
     * @return <p>
     *         The status of the Reserved Instance listing.
     *         </p>
     * @see ListingStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the Reserved Instance listing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, pending, cancelled, closed
     *
     * @param status <p>
     *            The status of the Reserved Instance listing.
     *            </p>
     * @see ListingStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Reserved Instance listing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, pending, cancelled, closed
     *
     * @param status <p>
     *            The status of the Reserved Instance listing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ListingStatus
     */
    public ReservedInstancesListing withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the Reserved Instance listing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, pending, cancelled, closed
     *
     * @param status <p>
     *            The status of the Reserved Instance listing.
     *            </p>
     * @see ListingStatus
     */
    public void setStatus(ListingStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the Reserved Instance listing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, pending, cancelled, closed
     *
     * @param status <p>
     *            The status of the Reserved Instance listing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ListingStatus
     */
    public ReservedInstancesListing withStatus(ListingStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the current status of the Reserved Instance listing. The
     * response can be blank.
     * </p>
     *
     * @return <p>
     *         The reason for the current status of the Reserved Instance
     *         listing. The response can be blank.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * The reason for the current status of the Reserved Instance listing. The
     * response can be blank.
     * </p>
     *
     * @param statusMessage <p>
     *            The reason for the current status of the Reserved Instance
     *            listing. The response can be blank.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The reason for the current status of the Reserved Instance listing. The
     * response can be blank.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            The reason for the current status of the Reserved Instance
     *            listing. The response can be blank.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesListing withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the resource.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the resource.
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
     * Any tags assigned to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesListing withTags(Tag... tags) {
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
     * Any tags assigned to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesListing withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The last modified timestamp of the listing.
     * </p>
     *
     * @return <p>
     *         The last modified timestamp of the listing.
     *         </p>
     */
    public java.util.Date getUpdateDate() {
        return updateDate;
    }

    /**
     * <p>
     * The last modified timestamp of the listing.
     * </p>
     *
     * @param updateDate <p>
     *            The last modified timestamp of the listing.
     *            </p>
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * <p>
     * The last modified timestamp of the listing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateDate <p>
     *            The last modified timestamp of the listing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesListing withUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate() + ",");
        if (getInstanceCounts() != null)
            sb.append("InstanceCounts: " + getInstanceCounts() + ",");
        if (getPriceSchedules() != null)
            sb.append("PriceSchedules: " + getPriceSchedules() + ",");
        if (getReservedInstancesId() != null)
            sb.append("ReservedInstancesId: " + getReservedInstancesId() + ",");
        if (getReservedInstancesListingId() != null)
            sb.append("ReservedInstancesListingId: " + getReservedInstancesListingId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getUpdateDate() != null)
            sb.append("UpdateDate: " + getUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCounts() == null) ? 0 : getInstanceCounts().hashCode());
        hashCode = prime * hashCode
                + ((getPriceSchedules() == null) ? 0 : getPriceSchedules().hashCode());
        hashCode = prime * hashCode
                + ((getReservedInstancesId() == null) ? 0 : getReservedInstancesId().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedInstancesListingId() == null) ? 0 : getReservedInstancesListingId()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedInstancesListing == false)
            return false;
        ReservedInstancesListing other = (ReservedInstancesListing) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null
                && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getInstanceCounts() == null ^ this.getInstanceCounts() == null)
            return false;
        if (other.getInstanceCounts() != null
                && other.getInstanceCounts().equals(this.getInstanceCounts()) == false)
            return false;
        if (other.getPriceSchedules() == null ^ this.getPriceSchedules() == null)
            return false;
        if (other.getPriceSchedules() != null
                && other.getPriceSchedules().equals(this.getPriceSchedules()) == false)
            return false;
        if (other.getReservedInstancesId() == null ^ this.getReservedInstancesId() == null)
            return false;
        if (other.getReservedInstancesId() != null
                && other.getReservedInstancesId().equals(this.getReservedInstancesId()) == false)
            return false;
        if (other.getReservedInstancesListingId() == null
                ^ this.getReservedInstancesListingId() == null)
            return false;
        if (other.getReservedInstancesListingId() != null
                && other.getReservedInstancesListingId().equals(
                        this.getReservedInstancesListingId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUpdateDate() == null ^ this.getUpdateDate() == null)
            return false;
        if (other.getUpdateDate() != null
                && other.getUpdateDate().equals(this.getUpdateDate()) == false)
            return false;
        return true;
    }
}
