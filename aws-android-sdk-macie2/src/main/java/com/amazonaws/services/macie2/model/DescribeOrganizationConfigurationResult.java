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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

public class DescribeOrganizationConfigurationResult implements Serializable {
    /**
     * <p>
     * Specifies whether Amazon Macie is enabled automatically for accounts that
     * are added to the AWS organization.
     * </p>
     */
    private Boolean autoEnable;

    /**
     * <p>
     * Specifies whether the maximum number of Amazon Macie member accounts are
     * already associated with the AWS organization.
     * </p>
     */
    private Boolean maxAccountLimitReached;

    /**
     * <p>
     * Specifies whether Amazon Macie is enabled automatically for accounts that
     * are added to the AWS organization.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon Macie is enabled automatically for
     *         accounts that are added to the AWS organization.
     *         </p>
     */
    public Boolean isAutoEnable() {
        return autoEnable;
    }

    /**
     * <p>
     * Specifies whether Amazon Macie is enabled automatically for accounts that
     * are added to the AWS organization.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon Macie is enabled automatically for
     *         accounts that are added to the AWS organization.
     *         </p>
     */
    public Boolean getAutoEnable() {
        return autoEnable;
    }

    /**
     * <p>
     * Specifies whether Amazon Macie is enabled automatically for accounts that
     * are added to the AWS organization.
     * </p>
     *
     * @param autoEnable <p>
     *            Specifies whether Amazon Macie is enabled automatically for
     *            accounts that are added to the AWS organization.
     *            </p>
     */
    public void setAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
    }

    /**
     * <p>
     * Specifies whether Amazon Macie is enabled automatically for accounts that
     * are added to the AWS organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoEnable <p>
     *            Specifies whether Amazon Macie is enabled automatically for
     *            accounts that are added to the AWS organization.
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
     * Specifies whether the maximum number of Amazon Macie member accounts are
     * already associated with the AWS organization.
     * </p>
     *
     * @return <p>
     *         Specifies whether the maximum number of Amazon Macie member
     *         accounts are already associated with the AWS organization.
     *         </p>
     */
    public Boolean isMaxAccountLimitReached() {
        return maxAccountLimitReached;
    }

    /**
     * <p>
     * Specifies whether the maximum number of Amazon Macie member accounts are
     * already associated with the AWS organization.
     * </p>
     *
     * @return <p>
     *         Specifies whether the maximum number of Amazon Macie member
     *         accounts are already associated with the AWS organization.
     *         </p>
     */
    public Boolean getMaxAccountLimitReached() {
        return maxAccountLimitReached;
    }

    /**
     * <p>
     * Specifies whether the maximum number of Amazon Macie member accounts are
     * already associated with the AWS organization.
     * </p>
     *
     * @param maxAccountLimitReached <p>
     *            Specifies whether the maximum number of Amazon Macie member
     *            accounts are already associated with the AWS organization.
     *            </p>
     */
    public void setMaxAccountLimitReached(Boolean maxAccountLimitReached) {
        this.maxAccountLimitReached = maxAccountLimitReached;
    }

    /**
     * <p>
     * Specifies whether the maximum number of Amazon Macie member accounts are
     * already associated with the AWS organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxAccountLimitReached <p>
     *            Specifies whether the maximum number of Amazon Macie member
     *            accounts are already associated with the AWS organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrganizationConfigurationResult withMaxAccountLimitReached(
            Boolean maxAccountLimitReached) {
        this.maxAccountLimitReached = maxAccountLimitReached;
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
            sb.append("autoEnable: " + getAutoEnable() + ",");
        if (getMaxAccountLimitReached() != null)
            sb.append("maxAccountLimitReached: " + getMaxAccountLimitReached());
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
                + ((getMaxAccountLimitReached() == null) ? 0 : getMaxAccountLimitReached()
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
        if (other.getMaxAccountLimitReached() == null ^ this.getMaxAccountLimitReached() == null)
            return false;
        if (other.getMaxAccountLimitReached() != null
                && other.getMaxAccountLimitReached().equals(this.getMaxAccountLimitReached()) == false)
            return false;
        return true;
    }
}
