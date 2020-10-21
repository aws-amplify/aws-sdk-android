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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a Device Defender audit suppression.
 * </p>
 */
public class UpdateAuditSuppressionRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The expiration date (epoch timestamp in seconds) that you want the
     * suppression to adhere to.
     * </p>
     */
    private java.util.Date expirationDate;

    /**
     * <p>
     * Indicates whether a suppression should exist indefinitely or not.
     * </p>
     */
    private Boolean suppressIndefinitely;

    /**
     * <p>
     * The description of the audit suppression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     */
    private String description;

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
    public UpdateAuditSuppressionRequest withCheckName(String checkName) {
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
    public UpdateAuditSuppressionRequest withResourceIdentifier(
            ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }

    /**
     * <p>
     * The expiration date (epoch timestamp in seconds) that you want the
     * suppression to adhere to.
     * </p>
     *
     * @return <p>
     *         The expiration date (epoch timestamp in seconds) that you want
     *         the suppression to adhere to.
     *         </p>
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * <p>
     * The expiration date (epoch timestamp in seconds) that you want the
     * suppression to adhere to.
     * </p>
     *
     * @param expirationDate <p>
     *            The expiration date (epoch timestamp in seconds) that you want
     *            the suppression to adhere to.
     *            </p>
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The expiration date (epoch timestamp in seconds) that you want the
     * suppression to adhere to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expirationDate <p>
     *            The expiration date (epoch timestamp in seconds) that you want
     *            the suppression to adhere to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuditSuppressionRequest withExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * <p>
     * Indicates whether a suppression should exist indefinitely or not.
     * </p>
     *
     * @return <p>
     *         Indicates whether a suppression should exist indefinitely or not.
     *         </p>
     */
    public Boolean isSuppressIndefinitely() {
        return suppressIndefinitely;
    }

    /**
     * <p>
     * Indicates whether a suppression should exist indefinitely or not.
     * </p>
     *
     * @return <p>
     *         Indicates whether a suppression should exist indefinitely or not.
     *         </p>
     */
    public Boolean getSuppressIndefinitely() {
        return suppressIndefinitely;
    }

    /**
     * <p>
     * Indicates whether a suppression should exist indefinitely or not.
     * </p>
     *
     * @param suppressIndefinitely <p>
     *            Indicates whether a suppression should exist indefinitely or
     *            not.
     *            </p>
     */
    public void setSuppressIndefinitely(Boolean suppressIndefinitely) {
        this.suppressIndefinitely = suppressIndefinitely;
    }

    /**
     * <p>
     * Indicates whether a suppression should exist indefinitely or not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param suppressIndefinitely <p>
     *            Indicates whether a suppression should exist indefinitely or
     *            not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuditSuppressionRequest withSuppressIndefinitely(Boolean suppressIndefinitely) {
        this.suppressIndefinitely = suppressIndefinitely;
        return this;
    }

    /**
     * <p>
     * The description of the audit suppression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @return <p>
     *         The description of the audit suppression.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the audit suppression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param description <p>
     *            The description of the audit suppression.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the audit suppression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param description <p>
     *            The description of the audit suppression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuditSuppressionRequest withDescription(String description) {
        this.description = description;
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
            sb.append("resourceIdentifier: " + getResourceIdentifier() + ",");
        if (getExpirationDate() != null)
            sb.append("expirationDate: " + getExpirationDate() + ",");
        if (getSuppressIndefinitely() != null)
            sb.append("suppressIndefinitely: " + getSuppressIndefinitely() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription());
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
        hashCode = prime * hashCode
                + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        hashCode = prime * hashCode
                + ((getSuppressIndefinitely() == null) ? 0 : getSuppressIndefinitely().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAuditSuppressionRequest == false)
            return false;
        UpdateAuditSuppressionRequest other = (UpdateAuditSuppressionRequest) obj;

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
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null
                && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        if (other.getSuppressIndefinitely() == null ^ this.getSuppressIndefinitely() == null)
            return false;
        if (other.getSuppressIndefinitely() != null
                && other.getSuppressIndefinitely().equals(this.getSuppressIndefinitely()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
