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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

/**
 * <p>
 * Contains rules to be applied to the affected accounts. The effective policy
 * is the aggregation of any policies the account inherits, plus any policy
 * directly attached to the account.
 * </p>
 */
public class EffectivePolicy implements Serializable {
    /**
     * <p>
     * The text content of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String policyContent;

    /**
     * <p>
     * The time of the last update to this policy.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;

    /**
     * <p>
     * The account ID of the policy target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     * <b>Pattern:
     * </b>^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$<br/>
     */
    private String targetId;

    /**
     * <p>
     * The policy type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TAG_POLICY, BACKUP_POLICY
     */
    private String policyType;

    /**
     * <p>
     * The text content of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The text content of the policy.
     *         </p>
     */
    public String getPolicyContent() {
        return policyContent;
    }

    /**
     * <p>
     * The text content of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param policyContent <p>
     *            The text content of the policy.
     *            </p>
     */
    public void setPolicyContent(String policyContent) {
        this.policyContent = policyContent;
    }

    /**
     * <p>
     * The text content of the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param policyContent <p>
     *            The text content of the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EffectivePolicy withPolicyContent(String policyContent) {
        this.policyContent = policyContent;
        return this;
    }

    /**
     * <p>
     * The time of the last update to this policy.
     * </p>
     *
     * @return <p>
     *         The time of the last update to this policy.
     *         </p>
     */
    public java.util.Date getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time of the last update to this policy.
     * </p>
     *
     * @param lastUpdatedTimestamp <p>
     *            The time of the last update to this policy.
     *            </p>
     */
    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time of the last update to this policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTimestamp <p>
     *            The time of the last update to this policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EffectivePolicy withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    /**
     * <p>
     * The account ID of the policy target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     * <b>Pattern:
     * </b>^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$<br/>
     *
     * @return <p>
     *         The account ID of the policy target.
     *         </p>
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * <p>
     * The account ID of the policy target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     * <b>Pattern:
     * </b>^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$<br/>
     *
     * @param targetId <p>
     *            The account ID of the policy target.
     *            </p>
     */
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The account ID of the policy target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     * <b>Pattern:
     * </b>^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$<br/>
     *
     * @param targetId <p>
     *            The account ID of the policy target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EffectivePolicy withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * <p>
     * The policy type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TAG_POLICY, BACKUP_POLICY
     *
     * @return <p>
     *         The policy type.
     *         </p>
     * @see EffectivePolicyType
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * <p>
     * The policy type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TAG_POLICY, BACKUP_POLICY
     *
     * @param policyType <p>
     *            The policy type.
     *            </p>
     * @see EffectivePolicyType
     */
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The policy type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TAG_POLICY, BACKUP_POLICY
     *
     * @param policyType <p>
     *            The policy type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EffectivePolicyType
     */
    public EffectivePolicy withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * <p>
     * The policy type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TAG_POLICY, BACKUP_POLICY
     *
     * @param policyType <p>
     *            The policy type.
     *            </p>
     * @see EffectivePolicyType
     */
    public void setPolicyType(EffectivePolicyType policyType) {
        this.policyType = policyType.toString();
    }

    /**
     * <p>
     * The policy type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TAG_POLICY, BACKUP_POLICY
     *
     * @param policyType <p>
     *            The policy type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EffectivePolicyType
     */
    public EffectivePolicy withPolicyType(EffectivePolicyType policyType) {
        this.policyType = policyType.toString();
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
        if (getPolicyContent() != null)
            sb.append("PolicyContent: " + getPolicyContent() + ",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: " + getLastUpdatedTimestamp() + ",");
        if (getTargetId() != null)
            sb.append("TargetId: " + getTargetId() + ",");
        if (getPolicyType() != null)
            sb.append("PolicyType: " + getPolicyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicyContent() == null) ? 0 : getPolicyContent().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EffectivePolicy == false)
            return false;
        EffectivePolicy other = (EffectivePolicy) obj;

        if (other.getPolicyContent() == null ^ this.getPolicyContent() == null)
            return false;
        if (other.getPolicyContent() != null
                && other.getPolicyContent().equals(this.getPolicyContent()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null
                && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null
                && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        return true;
    }
}
