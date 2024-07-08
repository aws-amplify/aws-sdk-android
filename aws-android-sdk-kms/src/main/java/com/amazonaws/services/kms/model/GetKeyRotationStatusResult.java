/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

public class GetKeyRotationStatusResult implements Serializable {
    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     */
    private Boolean keyRotationEnabled;

    /**
     * <p>
     * Identifies the specified symmetric encryption KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The number of days between each automatic rotation. The default value is
     * 365 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>90 - 2560<br/>
     */
    private Integer rotationPeriodInDays;

    /**
     * <p>
     * The next date that KMS will automatically rotate the key material.
     * </p>
     */
    private java.util.Date nextRotationDate;

    /**
     * <p>
     * Identifies the date and time that an in progress on-demand rotation was
     * initiated.
     * </p>
     * <p>
     * The KMS API follows an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html"
     * >eventual consistency</a> model due to the distributed nature of the
     * system. As a result, there might be a slight delay between initiating
     * on-demand key rotation and the rotation's completion. Once the on-demand
     * rotation is complete, use <a>ListKeyRotations</a> to view the details of
     * the on-demand rotation.
     * </p>
     */
    private java.util.Date onDemandRotationStartDate;

    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     *
     * @return <p>
     *         A Boolean value that specifies whether key rotation is enabled.
     *         </p>
     */
    public Boolean isKeyRotationEnabled() {
        return keyRotationEnabled;
    }

    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     *
     * @return <p>
     *         A Boolean value that specifies whether key rotation is enabled.
     *         </p>
     */
    public Boolean getKeyRotationEnabled() {
        return keyRotationEnabled;
    }

    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     *
     * @param keyRotationEnabled <p>
     *            A Boolean value that specifies whether key rotation is
     *            enabled.
     *            </p>
     */
    public void setKeyRotationEnabled(Boolean keyRotationEnabled) {
        this.keyRotationEnabled = keyRotationEnabled;
    }

    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyRotationEnabled <p>
     *            A Boolean value that specifies whether key rotation is
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetKeyRotationStatusResult withKeyRotationEnabled(Boolean keyRotationEnabled) {
        this.keyRotationEnabled = keyRotationEnabled;
        return this;
    }

    /**
     * <p>
     * Identifies the specified symmetric encryption KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         Identifies the specified symmetric encryption KMS key.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * Identifies the specified symmetric encryption KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            Identifies the specified symmetric encryption KMS key.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Identifies the specified symmetric encryption KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            Identifies the specified symmetric encryption KMS key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetKeyRotationStatusResult withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The number of days between each automatic rotation. The default value is
     * 365 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>90 - 2560<br/>
     *
     * @return <p>
     *         The number of days between each automatic rotation. The default
     *         value is 365 days.
     *         </p>
     */
    public Integer getRotationPeriodInDays() {
        return rotationPeriodInDays;
    }

    /**
     * <p>
     * The number of days between each automatic rotation. The default value is
     * 365 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>90 - 2560<br/>
     *
     * @param rotationPeriodInDays <p>
     *            The number of days between each automatic rotation. The
     *            default value is 365 days.
     *            </p>
     */
    public void setRotationPeriodInDays(Integer rotationPeriodInDays) {
        this.rotationPeriodInDays = rotationPeriodInDays;
    }

    /**
     * <p>
     * The number of days between each automatic rotation. The default value is
     * 365 days.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>90 - 2560<br/>
     *
     * @param rotationPeriodInDays <p>
     *            The number of days between each automatic rotation. The
     *            default value is 365 days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetKeyRotationStatusResult withRotationPeriodInDays(Integer rotationPeriodInDays) {
        this.rotationPeriodInDays = rotationPeriodInDays;
        return this;
    }

    /**
     * <p>
     * The next date that KMS will automatically rotate the key material.
     * </p>
     *
     * @return <p>
     *         The next date that KMS will automatically rotate the key
     *         material.
     *         </p>
     */
    public java.util.Date getNextRotationDate() {
        return nextRotationDate;
    }

    /**
     * <p>
     * The next date that KMS will automatically rotate the key material.
     * </p>
     *
     * @param nextRotationDate <p>
     *            The next date that KMS will automatically rotate the key
     *            material.
     *            </p>
     */
    public void setNextRotationDate(java.util.Date nextRotationDate) {
        this.nextRotationDate = nextRotationDate;
    }

    /**
     * <p>
     * The next date that KMS will automatically rotate the key material.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextRotationDate <p>
     *            The next date that KMS will automatically rotate the key
     *            material.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetKeyRotationStatusResult withNextRotationDate(java.util.Date nextRotationDate) {
        this.nextRotationDate = nextRotationDate;
        return this;
    }

    /**
     * <p>
     * Identifies the date and time that an in progress on-demand rotation was
     * initiated.
     * </p>
     * <p>
     * The KMS API follows an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html"
     * >eventual consistency</a> model due to the distributed nature of the
     * system. As a result, there might be a slight delay between initiating
     * on-demand key rotation and the rotation's completion. Once the on-demand
     * rotation is complete, use <a>ListKeyRotations</a> to view the details of
     * the on-demand rotation.
     * </p>
     *
     * @return <p>
     *         Identifies the date and time that an in progress on-demand
     *         rotation was initiated.
     *         </p>
     *         <p>
     *         The KMS API follows an <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html"
     *         >eventual consistency</a> model due to the distributed nature of
     *         the system. As a result, there might be a slight delay between
     *         initiating on-demand key rotation and the rotation's completion.
     *         Once the on-demand rotation is complete, use
     *         <a>ListKeyRotations</a> to view the details of the on-demand
     *         rotation.
     *         </p>
     */
    public java.util.Date getOnDemandRotationStartDate() {
        return onDemandRotationStartDate;
    }

    /**
     * <p>
     * Identifies the date and time that an in progress on-demand rotation was
     * initiated.
     * </p>
     * <p>
     * The KMS API follows an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html"
     * >eventual consistency</a> model due to the distributed nature of the
     * system. As a result, there might be a slight delay between initiating
     * on-demand key rotation and the rotation's completion. Once the on-demand
     * rotation is complete, use <a>ListKeyRotations</a> to view the details of
     * the on-demand rotation.
     * </p>
     *
     * @param onDemandRotationStartDate <p>
     *            Identifies the date and time that an in progress on-demand
     *            rotation was initiated.
     *            </p>
     *            <p>
     *            The KMS API follows an <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html"
     *            >eventual consistency</a> model due to the distributed nature
     *            of the system. As a result, there might be a slight delay
     *            between initiating on-demand key rotation and the rotation's
     *            completion. Once the on-demand rotation is complete, use
     *            <a>ListKeyRotations</a> to view the details of the on-demand
     *            rotation.
     *            </p>
     */
    public void setOnDemandRotationStartDate(java.util.Date onDemandRotationStartDate) {
        this.onDemandRotationStartDate = onDemandRotationStartDate;
    }

    /**
     * <p>
     * Identifies the date and time that an in progress on-demand rotation was
     * initiated.
     * </p>
     * <p>
     * The KMS API follows an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html"
     * >eventual consistency</a> model due to the distributed nature of the
     * system. As a result, there might be a slight delay between initiating
     * on-demand key rotation and the rotation's completion. Once the on-demand
     * rotation is complete, use <a>ListKeyRotations</a> to view the details of
     * the on-demand rotation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onDemandRotationStartDate <p>
     *            Identifies the date and time that an in progress on-demand
     *            rotation was initiated.
     *            </p>
     *            <p>
     *            The KMS API follows an <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html"
     *            >eventual consistency</a> model due to the distributed nature
     *            of the system. As a result, there might be a slight delay
     *            between initiating on-demand key rotation and the rotation's
     *            completion. Once the on-demand rotation is complete, use
     *            <a>ListKeyRotations</a> to view the details of the on-demand
     *            rotation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetKeyRotationStatusResult withOnDemandRotationStartDate(
            java.util.Date onDemandRotationStartDate) {
        this.onDemandRotationStartDate = onDemandRotationStartDate;
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
        if (getKeyRotationEnabled() != null)
            sb.append("KeyRotationEnabled: " + getKeyRotationEnabled() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getRotationPeriodInDays() != null)
            sb.append("RotationPeriodInDays: " + getRotationPeriodInDays() + ",");
        if (getNextRotationDate() != null)
            sb.append("NextRotationDate: " + getNextRotationDate() + ",");
        if (getOnDemandRotationStartDate() != null)
            sb.append("OnDemandRotationStartDate: " + getOnDemandRotationStartDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKeyRotationEnabled() == null) ? 0 : getKeyRotationEnabled().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getRotationPeriodInDays() == null) ? 0 : getRotationPeriodInDays().hashCode());
        hashCode = prime * hashCode
                + ((getNextRotationDate() == null) ? 0 : getNextRotationDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getOnDemandRotationStartDate() == null) ? 0 : getOnDemandRotationStartDate()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKeyRotationStatusResult == false)
            return false;
        GetKeyRotationStatusResult other = (GetKeyRotationStatusResult) obj;

        if (other.getKeyRotationEnabled() == null ^ this.getKeyRotationEnabled() == null)
            return false;
        if (other.getKeyRotationEnabled() != null
                && other.getKeyRotationEnabled().equals(this.getKeyRotationEnabled()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getRotationPeriodInDays() == null ^ this.getRotationPeriodInDays() == null)
            return false;
        if (other.getRotationPeriodInDays() != null
                && other.getRotationPeriodInDays().equals(this.getRotationPeriodInDays()) == false)
            return false;
        if (other.getNextRotationDate() == null ^ this.getNextRotationDate() == null)
            return false;
        if (other.getNextRotationDate() != null
                && other.getNextRotationDate().equals(this.getNextRotationDate()) == false)
            return false;
        if (other.getOnDemandRotationStartDate() == null
                ^ this.getOnDemandRotationStartDate() == null)
            return false;
        if (other.getOnDemandRotationStartDate() != null
                && other.getOnDemandRotationStartDate().equals(this.getOnDemandRotationStartDate()) == false)
            return false;
        return true;
    }
}
