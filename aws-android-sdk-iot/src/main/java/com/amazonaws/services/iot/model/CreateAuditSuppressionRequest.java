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
 * Creates a Device Defender audit suppression.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >CreateAuditSuppression</a> action.
 * </p>
 */
public class CreateAuditSuppressionRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The epoch timestamp in seconds at which this suppression expires.
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
     * Each audit supression must have a unique client request token. If you try
     * to create a new audit suppression with the same token as one that already
     * exists, an exception occurs. If you omit this value, Amazon Web Services
     * SDKs will automatically generate a unique client request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String clientRequestToken;

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
    public CreateAuditSuppressionRequest withCheckName(String checkName) {
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
    public CreateAuditSuppressionRequest withResourceIdentifier(
            ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }

    /**
     * <p>
     * The epoch timestamp in seconds at which this suppression expires.
     * </p>
     *
     * @return <p>
     *         The epoch timestamp in seconds at which this suppression expires.
     *         </p>
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * <p>
     * The epoch timestamp in seconds at which this suppression expires.
     * </p>
     *
     * @param expirationDate <p>
     *            The epoch timestamp in seconds at which this suppression
     *            expires.
     *            </p>
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The epoch timestamp in seconds at which this suppression expires.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expirationDate <p>
     *            The epoch timestamp in seconds at which this suppression
     *            expires.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAuditSuppressionRequest withExpirationDate(java.util.Date expirationDate) {
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
    public CreateAuditSuppressionRequest withSuppressIndefinitely(Boolean suppressIndefinitely) {
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
    public CreateAuditSuppressionRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Each audit supression must have a unique client request token. If you try
     * to create a new audit suppression with the same token as one that already
     * exists, an exception occurs. If you omit this value, Amazon Web Services
     * SDKs will automatically generate a unique client request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Each audit supression must have a unique client request token. If
     *         you try to create a new audit suppression with the same token as
     *         one that already exists, an exception occurs. If you omit this
     *         value, Amazon Web Services SDKs will automatically generate a
     *         unique client request.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * Each audit supression must have a unique client request token. If you try
     * to create a new audit suppression with the same token as one that already
     * exists, an exception occurs. If you omit this value, Amazon Web Services
     * SDKs will automatically generate a unique client request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Each audit supression must have a unique client request token.
     *            If you try to create a new audit suppression with the same
     *            token as one that already exists, an exception occurs. If you
     *            omit this value, Amazon Web Services SDKs will automatically
     *            generate a unique client request.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Each audit supression must have a unique client request token. If you try
     * to create a new audit suppression with the same token as one that already
     * exists, an exception occurs. If you omit this value, Amazon Web Services
     * SDKs will automatically generate a unique client request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Each audit supression must have a unique client request token.
     *            If you try to create a new audit suppression with the same
     *            token as one that already exists, an exception occurs. If you
     *            omit this value, Amazon Web Services SDKs will automatically
     *            generate a unique client request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAuditSuppressionRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
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
            sb.append("description: " + getDescription() + ",");
        if (getClientRequestToken() != null)
            sb.append("clientRequestToken: " + getClientRequestToken());
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
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAuditSuppressionRequest == false)
            return false;
        CreateAuditSuppressionRequest other = (CreateAuditSuppressionRequest) obj;

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
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
