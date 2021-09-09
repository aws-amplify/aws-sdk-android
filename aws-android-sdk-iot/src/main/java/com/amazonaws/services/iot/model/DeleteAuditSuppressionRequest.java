/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a Device Defender audit suppression.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >DeleteAuditSuppression</a> action.
 * </p>
 */
public class DeleteAuditSuppressionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An audit check name. Checks must be enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all
     * checks, including those that are enabled or use
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are
     * enabled.)
     * </p>
     */
    private String checkName;

    /**
     * <p>
     * Information that identifies the noncompliant resource.
     * </p>
     */
    private ResourceIdentifier resourceIdentifier;

    /**
     * <p>
     * An audit check name. Checks must be enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all
     * checks, including those that are enabled or use
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are
     * enabled.)
     * </p>
     *
     * @return <p>
     *         An audit check name. Checks must be enabled for your account.
     *         (Use <code>DescribeAccountAuditConfiguration</code> to see the
     *         list of all checks, including those that are enabled or use
     *         <code>UpdateAccountAuditConfiguration</code> to select which
     *         checks are enabled.)
     *         </p>
     */
    public String getCheckName() {
        return checkName;
    }

    /**
     * <p>
     * An audit check name. Checks must be enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all
     * checks, including those that are enabled or use
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are
     * enabled.)
     * </p>
     *
     * @param checkName <p>
     *            An audit check name. Checks must be enabled for your account.
     *            (Use <code>DescribeAccountAuditConfiguration</code> to see the
     *            list of all checks, including those that are enabled or use
     *            <code>UpdateAccountAuditConfiguration</code> to select which
     *            checks are enabled.)
     *            </p>
     */
    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    /**
     * <p>
     * An audit check name. Checks must be enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all
     * checks, including those that are enabled or use
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are
     * enabled.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checkName <p>
     *            An audit check name. Checks must be enabled for your account.
     *            (Use <code>DescribeAccountAuditConfiguration</code> to see the
     *            list of all checks, including those that are enabled or use
     *            <code>UpdateAccountAuditConfiguration</code> to select which
     *            checks are enabled.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAuditSuppressionRequest withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * <p>
     * Information that identifies the noncompliant resource.
     * </p>
     *
     * @return <p>
     *         Information that identifies the noncompliant resource.
     *         </p>
     */
    public ResourceIdentifier getResourceIdentifier() {
        return resourceIdentifier;
    }

    /**
     * <p>
     * Information that identifies the noncompliant resource.
     * </p>
     *
     * @param resourceIdentifier <p>
     *            Information that identifies the noncompliant resource.
     *            </p>
     */
    public void setResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * Information that identifies the noncompliant resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceIdentifier <p>
     *            Information that identifies the noncompliant resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAuditSuppressionRequest withResourceIdentifier(
            ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
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
        if (getCheckName() != null)
            sb.append("checkName: " + getCheckName() + ",");
        if (getResourceIdentifier() != null)
            sb.append("resourceIdentifier: " + getResourceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckName() == null) ? 0 : getCheckName().hashCode());
        hashCode = prime * hashCode
                + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAuditSuppressionRequest == false)
            return false;
        DeleteAuditSuppressionRequest other = (DeleteAuditSuppressionRequest) obj;

        if (other.getCheckName() == null ^ this.getCheckName() == null)
            return false;
        if (other.getCheckName() != null
                && other.getCheckName().equals(this.getCheckName()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null
                && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        return true;
    }
}
