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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

public class DescribeOrganizationConfigurationResult implements Serializable {
    /**
     * <p>
     * Indicates whether GuardDuty is automatically enabled for accounts added
     * to the organization.
     * </p>
     */
    private Boolean autoEnable;

    /**
     * <p>
     * Indicates whether the maximum number of allowed member accounts are
     * already associated with the delegated administrator master account.
     * </p>
     */
    private Boolean memberAccountLimitReached;

    /**
     * <p>
     * Indicates whether GuardDuty is automatically enabled for accounts added
     * to the organization.
     * </p>
     *
     * @return <p>
     *         Indicates whether GuardDuty is automatically enabled for accounts
     *         added to the organization.
     *         </p>
     */
    public Boolean isAutoEnable() {
        return autoEnable;
    }

    /**
     * <p>
     * Indicates whether GuardDuty is automatically enabled for accounts added
     * to the organization.
     * </p>
     *
     * @return <p>
     *         Indicates whether GuardDuty is automatically enabled for accounts
     *         added to the organization.
     *         </p>
     */
    public Boolean getAutoEnable() {
        return autoEnable;
    }

    /**
     * <p>
     * Indicates whether GuardDuty is automatically enabled for accounts added
     * to the organization.
     * </p>
     *
     * @param autoEnable <p>
     *            Indicates whether GuardDuty is automatically enabled for
     *            accounts added to the organization.
     *            </p>
     */
    public void setAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
    }

    /**
     * <p>
     * Indicates whether GuardDuty is automatically enabled for accounts added
     * to the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoEnable <p>
     *            Indicates whether GuardDuty is automatically enabled for
     *            accounts added to the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrganizationConfigurationResult withAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
        return this;
    }

    /**
     * <p>
     * Indicates whether the maximum number of allowed member accounts are
     * already associated with the delegated administrator master account.
     * </p>
     *
     * @return <p>
     *         Indicates whether the maximum number of allowed member accounts
     *         are already associated with the delegated administrator master
     *         account.
     *         </p>
     */
    public Boolean isMemberAccountLimitReached() {
        return memberAccountLimitReached;
    }

    /**
     * <p>
     * Indicates whether the maximum number of allowed member accounts are
     * already associated with the delegated administrator master account.
     * </p>
     *
     * @return <p>
     *         Indicates whether the maximum number of allowed member accounts
     *         are already associated with the delegated administrator master
     *         account.
     *         </p>
     */
    public Boolean getMemberAccountLimitReached() {
        return memberAccountLimitReached;
    }

    /**
     * <p>
     * Indicates whether the maximum number of allowed member accounts are
     * already associated with the delegated administrator master account.
     * </p>
     *
     * @param memberAccountLimitReached <p>
     *            Indicates whether the maximum number of allowed member
     *            accounts are already associated with the delegated
     *            administrator master account.
     *            </p>
     */
    public void setMemberAccountLimitReached(Boolean memberAccountLimitReached) {
        this.memberAccountLimitReached = memberAccountLimitReached;
    }

    /**
     * <p>
     * Indicates whether the maximum number of allowed member accounts are
     * already associated with the delegated administrator master account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memberAccountLimitReached <p>
     *            Indicates whether the maximum number of allowed member
     *            accounts are already associated with the delegated
     *            administrator master account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrganizationConfigurationResult withMemberAccountLimitReached(
            Boolean memberAccountLimitReached) {
        this.memberAccountLimitReached = memberAccountLimitReached;
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
        if (getAutoEnable() != null)
            sb.append("AutoEnable: " + getAutoEnable() + ",");
        if (getMemberAccountLimitReached() != null)
            sb.append("MemberAccountLimitReached: " + getMemberAccountLimitReached());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoEnable() == null) ? 0 : getAutoEnable().hashCode());
        hashCode = prime
                * hashCode
                + ((getMemberAccountLimitReached() == null) ? 0 : getMemberAccountLimitReached()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOrganizationConfigurationResult == false)
            return false;
        DescribeOrganizationConfigurationResult other = (DescribeOrganizationConfigurationResult) obj;

        if (other.getAutoEnable() == null ^ this.getAutoEnable() == null)
            return false;
        if (other.getAutoEnable() != null
                && other.getAutoEnable().equals(this.getAutoEnable()) == false)
            return false;
        if (other.getMemberAccountLimitReached() == null
                ^ this.getMemberAccountLimitReached() == null)
            return false;
        if (other.getMemberAccountLimitReached() != null
                && other.getMemberAccountLimitReached().equals(this.getMemberAccountLimitReached()) == false)
            return false;
        return true;
    }
}
