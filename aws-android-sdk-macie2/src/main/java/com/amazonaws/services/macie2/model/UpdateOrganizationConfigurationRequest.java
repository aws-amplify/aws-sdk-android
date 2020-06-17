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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates Amazon Macie configuration settings for an AWS organization.
 * </p>
 */
public class UpdateOrganizationConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Specifies whether Amazon Macie is enabled automatically for each account,
     * when the account is added to the AWS organization.
     * </p>
     */
    private Boolean autoEnable;

    /**
     * <p>
     * Specifies whether Amazon Macie is enabled automatically for each account,
     * when the account is added to the AWS organization.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon Macie is enabled automatically for each
     *         account, when the account is added to the AWS organization.
     *         </p>
     */
    public Boolean isAutoEnable() {
        return autoEnable;
    }

    /**
     * <p>
     * Specifies whether Amazon Macie is enabled automatically for each account,
     * when the account is added to the AWS organization.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon Macie is enabled automatically for each
     *         account, when the account is added to the AWS organization.
     *         </p>
     */
    public Boolean getAutoEnable() {
        return autoEnable;
    }

    /**
     * <p>
     * Specifies whether Amazon Macie is enabled automatically for each account,
     * when the account is added to the AWS organization.
     * </p>
     *
     * @param autoEnable <p>
     *            Specifies whether Amazon Macie is enabled automatically for
     *            each account, when the account is added to the AWS
     *            organization.
     *            </p>
     */
    public void setAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
    }

    /**
     * <p>
     * Specifies whether Amazon Macie is enabled automatically for each account,
     * when the account is added to the AWS organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoEnable <p>
     *            Specifies whether Amazon Macie is enabled automatically for
     *            each account, when the account is added to the AWS
     *            organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOrganizationConfigurationRequest withAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
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
            sb.append("autoEnable: " + getAutoEnable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoEnable() == null) ? 0 : getAutoEnable().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateOrganizationConfigurationRequest == false)
            return false;
        UpdateOrganizationConfigurationRequest other = (UpdateOrganizationConfigurationRequest) obj;

        if (other.getAutoEnable() == null ^ this.getAutoEnable() == null)
            return false;
        if (other.getAutoEnable() != null
                && other.getAutoEnable().equals(this.getAutoEnable()) == false)
            return false;
        return true;
    }
}
