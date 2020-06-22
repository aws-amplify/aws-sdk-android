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
 * Describes a Reserved Instance modification.
 * </p>
 */
public class ReservedInstancesModification implements Serializable {
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
     * The time when the modification request was created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The time for the modification to become effective.
     * </p>
     */
    private java.util.Date effectiveDate;

    /**
     * <p>
     * Contains target configurations along with their corresponding new
     * Reserved Instance IDs.
     * </p>
     */
    private java.util.List<ReservedInstancesModificationResult> modificationResults;

    /**
     * <p>
     * The IDs of one or more Reserved Instances.
     * </p>
     */
    private java.util.List<ReservedInstancesId> reservedInstancesIds;

    /**
     * <p>
     * A unique ID for the Reserved Instance modification.
     * </p>
     */
    private String reservedInstancesModificationId;

    /**
     * <p>
     * The status of the Reserved Instances modification request.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The reason for the status.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The time when the modification request was last updated.
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
    public ReservedInstancesModification withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The time when the modification request was created.
     * </p>
     *
     * @return <p>
     *         The time when the modification request was created.
     *         </p>
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The time when the modification request was created.
     * </p>
     *
     * @param createDate <p>
     *            The time when the modification request was created.
     *            </p>
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The time when the modification request was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createDate <p>
     *            The time when the modification request was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesModification withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * <p>
     * The time for the modification to become effective.
     * </p>
     *
     * @return <p>
     *         The time for the modification to become effective.
     *         </p>
     */
    public java.util.Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * <p>
     * The time for the modification to become effective.
     * </p>
     *
     * @param effectiveDate <p>
     *            The time for the modification to become effective.
     *            </p>
     */
    public void setEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * <p>
     * The time for the modification to become effective.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param effectiveDate <p>
     *            The time for the modification to become effective.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesModification withEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * <p>
     * Contains target configurations along with their corresponding new
     * Reserved Instance IDs.
     * </p>
     *
     * @return <p>
     *         Contains target configurations along with their corresponding new
     *         Reserved Instance IDs.
     *         </p>
     */
    public java.util.List<ReservedInstancesModificationResult> getModificationResults() {
        return modificationResults;
    }

    /**
     * <p>
     * Contains target configurations along with their corresponding new
     * Reserved Instance IDs.
     * </p>
     *
     * @param modificationResults <p>
     *            Contains target configurations along with their corresponding
     *            new Reserved Instance IDs.
     *            </p>
     */
    public void setModificationResults(
            java.util.Collection<ReservedInstancesModificationResult> modificationResults) {
        if (modificationResults == null) {
            this.modificationResults = null;
            return;
        }

        this.modificationResults = new java.util.ArrayList<ReservedInstancesModificationResult>(
                modificationResults);
    }

    /**
     * <p>
     * Contains target configurations along with their corresponding new
     * Reserved Instance IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modificationResults <p>
     *            Contains target configurations along with their corresponding
     *            new Reserved Instance IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesModification withModificationResults(
            ReservedInstancesModificationResult... modificationResults) {
        if (getModificationResults() == null) {
            this.modificationResults = new java.util.ArrayList<ReservedInstancesModificationResult>(
                    modificationResults.length);
        }
        for (ReservedInstancesModificationResult value : modificationResults) {
            this.modificationResults.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains target configurations along with their corresponding new
     * Reserved Instance IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modificationResults <p>
     *            Contains target configurations along with their corresponding
     *            new Reserved Instance IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesModification withModificationResults(
            java.util.Collection<ReservedInstancesModificationResult> modificationResults) {
        setModificationResults(modificationResults);
        return this;
    }

    /**
     * <p>
     * The IDs of one or more Reserved Instances.
     * </p>
     *
     * @return <p>
     *         The IDs of one or more Reserved Instances.
     *         </p>
     */
    public java.util.List<ReservedInstancesId> getReservedInstancesIds() {
        return reservedInstancesIds;
    }

    /**
     * <p>
     * The IDs of one or more Reserved Instances.
     * </p>
     *
     * @param reservedInstancesIds <p>
     *            The IDs of one or more Reserved Instances.
     *            </p>
     */
    public void setReservedInstancesIds(
            java.util.Collection<ReservedInstancesId> reservedInstancesIds) {
        if (reservedInstancesIds == null) {
            this.reservedInstancesIds = null;
            return;
        }

        this.reservedInstancesIds = new java.util.ArrayList<ReservedInstancesId>(
                reservedInstancesIds);
    }

    /**
     * <p>
     * The IDs of one or more Reserved Instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesIds <p>
     *            The IDs of one or more Reserved Instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesModification withReservedInstancesIds(
            ReservedInstancesId... reservedInstancesIds) {
        if (getReservedInstancesIds() == null) {
            this.reservedInstancesIds = new java.util.ArrayList<ReservedInstancesId>(
                    reservedInstancesIds.length);
        }
        for (ReservedInstancesId value : reservedInstancesIds) {
            this.reservedInstancesIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more Reserved Instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesIds <p>
     *            The IDs of one or more Reserved Instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesModification withReservedInstancesIds(
            java.util.Collection<ReservedInstancesId> reservedInstancesIds) {
        setReservedInstancesIds(reservedInstancesIds);
        return this;
    }

    /**
     * <p>
     * A unique ID for the Reserved Instance modification.
     * </p>
     *
     * @return <p>
     *         A unique ID for the Reserved Instance modification.
     *         </p>
     */
    public String getReservedInstancesModificationId() {
        return reservedInstancesModificationId;
    }

    /**
     * <p>
     * A unique ID for the Reserved Instance modification.
     * </p>
     *
     * @param reservedInstancesModificationId <p>
     *            A unique ID for the Reserved Instance modification.
     *            </p>
     */
    public void setReservedInstancesModificationId(String reservedInstancesModificationId) {
        this.reservedInstancesModificationId = reservedInstancesModificationId;
    }

    /**
     * <p>
     * A unique ID for the Reserved Instance modification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesModificationId <p>
     *            A unique ID for the Reserved Instance modification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesModification withReservedInstancesModificationId(
            String reservedInstancesModificationId) {
        this.reservedInstancesModificationId = reservedInstancesModificationId;
        return this;
    }

    /**
     * <p>
     * The status of the Reserved Instances modification request.
     * </p>
     *
     * @return <p>
     *         The status of the Reserved Instances modification request.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the Reserved Instances modification request.
     * </p>
     *
     * @param status <p>
     *            The status of the Reserved Instances modification request.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Reserved Instances modification request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the Reserved Instances modification request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesModification withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The reason for the status.
     * </p>
     *
     * @return <p>
     *         The reason for the status.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * The reason for the status.
     * </p>
     *
     * @param statusMessage <p>
     *            The reason for the status.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The reason for the status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            The reason for the status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesModification withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The time when the modification request was last updated.
     * </p>
     *
     * @return <p>
     *         The time when the modification request was last updated.
     *         </p>
     */
    public java.util.Date getUpdateDate() {
        return updateDate;
    }

    /**
     * <p>
     * The time when the modification request was last updated.
     * </p>
     *
     * @param updateDate <p>
     *            The time when the modification request was last updated.
     *            </p>
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * <p>
     * The time when the modification request was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateDate <p>
     *            The time when the modification request was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesModification withUpdateDate(java.util.Date updateDate) {
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
        if (getEffectiveDate() != null)
            sb.append("EffectiveDate: " + getEffectiveDate() + ",");
        if (getModificationResults() != null)
            sb.append("ModificationResults: " + getModificationResults() + ",");
        if (getReservedInstancesIds() != null)
            sb.append("ReservedInstancesIds: " + getReservedInstancesIds() + ",");
        if (getReservedInstancesModificationId() != null)
            sb.append("ReservedInstancesModificationId: " + getReservedInstancesModificationId()
                    + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
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
                + ((getEffectiveDate() == null) ? 0 : getEffectiveDate().hashCode());
        hashCode = prime * hashCode
                + ((getModificationResults() == null) ? 0 : getModificationResults().hashCode());
        hashCode = prime * hashCode
                + ((getReservedInstancesIds() == null) ? 0 : getReservedInstancesIds().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedInstancesModificationId() == null) ? 0
                        : getReservedInstancesModificationId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedInstancesModification == false)
            return false;
        ReservedInstancesModification other = (ReservedInstancesModification) obj;

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
        if (other.getEffectiveDate() == null ^ this.getEffectiveDate() == null)
            return false;
        if (other.getEffectiveDate() != null
                && other.getEffectiveDate().equals(this.getEffectiveDate()) == false)
            return false;
        if (other.getModificationResults() == null ^ this.getModificationResults() == null)
            return false;
        if (other.getModificationResults() != null
                && other.getModificationResults().equals(this.getModificationResults()) == false)
            return false;
        if (other.getReservedInstancesIds() == null ^ this.getReservedInstancesIds() == null)
            return false;
        if (other.getReservedInstancesIds() != null
                && other.getReservedInstancesIds().equals(this.getReservedInstancesIds()) == false)
            return false;
        if (other.getReservedInstancesModificationId() == null
                ^ this.getReservedInstancesModificationId() == null)
            return false;
        if (other.getReservedInstancesModificationId() != null
                && other.getReservedInstancesModificationId().equals(
                        this.getReservedInstancesModificationId()) == false)
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
        if (other.getUpdateDate() == null ^ this.getUpdateDate() == null)
            return false;
        if (other.getUpdateDate() != null
                && other.getUpdateDate().equals(this.getUpdateDate()) == false)
            return false;
        return true;
    }
}
