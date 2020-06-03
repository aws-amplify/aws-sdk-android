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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the list of SAML providers for this account.
 * </p>
 */
public class SAMLProviderListEntry implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String arn;

    /**
     * <p>
     * The expiration date and time for the SAML provider.
     * </p>
     */
    private java.util.Date validUntil;

    /**
     * <p>
     * The date and time when the SAML provider was created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the SAML provider.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the SAML provider.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the SAML provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SAMLProviderListEntry withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The expiration date and time for the SAML provider.
     * </p>
     *
     * @return <p>
     *         The expiration date and time for the SAML provider.
     *         </p>
     */
    public java.util.Date getValidUntil() {
        return validUntil;
    }

    /**
     * <p>
     * The expiration date and time for the SAML provider.
     * </p>
     *
     * @param validUntil <p>
     *            The expiration date and time for the SAML provider.
     *            </p>
     */
    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }

    /**
     * <p>
     * The expiration date and time for the SAML provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validUntil <p>
     *            The expiration date and time for the SAML provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SAMLProviderListEntry withValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * <p>
     * The date and time when the SAML provider was created.
     * </p>
     *
     * @return <p>
     *         The date and time when the SAML provider was created.
     *         </p>
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The date and time when the SAML provider was created.
     * </p>
     *
     * @param createDate <p>
     *            The date and time when the SAML provider was created.
     *            </p>
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time when the SAML provider was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createDate <p>
     *            The date and time when the SAML provider was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SAMLProviderListEntry withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getValidUntil() != null)
            sb.append("ValidUntil: " + getValidUntil() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getValidUntil() == null) ? 0 : getValidUntil().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SAMLProviderListEntry == false)
            return false;
        SAMLProviderListEntry other = (SAMLProviderListEntry) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getValidUntil() == null ^ this.getValidUntil() == null)
            return false;
        if (other.getValidUntil() != null
                && other.getValidUntil().equals(this.getValidUntil()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null
                && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        return true;
    }
}
