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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that lists the AWS accounts, if any, that you included in the
 * <code>TrustedSigners</code> complex type for this distribution. These are the
 * accounts that you want to allow to create signed URLs for private content.
 * </p>
 * <p>
 * The <code>Signer</code> complex type lists the AWS account number of the
 * trusted signer or <code>self</code> if the signer is the AWS account that
 * created the distribution. The <code>Signer</code> element also includes the
 * IDs of any active CloudFront key pairs that are associated with the trusted
 * signer's AWS account. If no <code>KeyPairId</code> element appears for a
 * <code>Signer</code>, that signer can't create signed URLs.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
 * >Serving Private Content through CloudFront</a> in the <i>Amazon CloudFront
 * Developer Guide</i>.
 * </p>
 */
public class ActiveTrustedSigners implements Serializable {
    /**
     * <p>
     * Enabled is <code>true</code> if any of the AWS accounts listed in the
     * <code>TrustedSigners</code> complex type for this distribution have
     * active CloudFront key pairs. If not, <code>Enabled</code> is
     * <code>false</code>.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The number of trusted signers specified in the
     * <code>TrustedSigners</code> complex type.
     * </p>
     */
    private Integer quantity;

    /**
     * <p>
     * A complex type that contains one <code>Signer</code> complex type for
     * each trusted signer that is specified in the <code>TrustedSigners</code>
     * complex type.
     * </p>
     */
    private java.util.List<Signer> items;

    /**
     * <p>
     * Enabled is <code>true</code> if any of the AWS accounts listed in the
     * <code>TrustedSigners</code> complex type for this distribution have
     * active CloudFront key pairs. If not, <code>Enabled</code> is
     * <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Enabled is <code>true</code> if any of the AWS accounts listed in
     *         the <code>TrustedSigners</code> complex type for this
     *         distribution have active CloudFront key pairs. If not,
     *         <code>Enabled</code> is <code>false</code>.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Enabled is <code>true</code> if any of the AWS accounts listed in the
     * <code>TrustedSigners</code> complex type for this distribution have
     * active CloudFront key pairs. If not, <code>Enabled</code> is
     * <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Enabled is <code>true</code> if any of the AWS accounts listed in
     *         the <code>TrustedSigners</code> complex type for this
     *         distribution have active CloudFront key pairs. If not,
     *         <code>Enabled</code> is <code>false</code>.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Enabled is <code>true</code> if any of the AWS accounts listed in the
     * <code>TrustedSigners</code> complex type for this distribution have
     * active CloudFront key pairs. If not, <code>Enabled</code> is
     * <code>false</code>.
     * </p>
     *
     * @param enabled <p>
     *            Enabled is <code>true</code> if any of the AWS accounts listed
     *            in the <code>TrustedSigners</code> complex type for this
     *            distribution have active CloudFront key pairs. If not,
     *            <code>Enabled</code> is <code>false</code>.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Enabled is <code>true</code> if any of the AWS accounts listed in the
     * <code>TrustedSigners</code> complex type for this distribution have
     * active CloudFront key pairs. If not, <code>Enabled</code> is
     * <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Enabled is <code>true</code> if any of the AWS accounts listed
     *            in the <code>TrustedSigners</code> complex type for this
     *            distribution have active CloudFront key pairs. If not,
     *            <code>Enabled</code> is <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveTrustedSigners withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The number of trusted signers specified in the
     * <code>TrustedSigners</code> complex type.
     * </p>
     *
     * @return <p>
     *         The number of trusted signers specified in the
     *         <code>TrustedSigners</code> complex type.
     *         </p>
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * <p>
     * The number of trusted signers specified in the
     * <code>TrustedSigners</code> complex type.
     * </p>
     *
     * @param quantity <p>
     *            The number of trusted signers specified in the
     *            <code>TrustedSigners</code> complex type.
     *            </p>
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of trusted signers specified in the
     * <code>TrustedSigners</code> complex type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quantity <p>
     *            The number of trusted signers specified in the
     *            <code>TrustedSigners</code> complex type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveTrustedSigners withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * <p>
     * A complex type that contains one <code>Signer</code> complex type for
     * each trusted signer that is specified in the <code>TrustedSigners</code>
     * complex type.
     * </p>
     *
     * @return <p>
     *         A complex type that contains one <code>Signer</code> complex type
     *         for each trusted signer that is specified in the
     *         <code>TrustedSigners</code> complex type.
     *         </p>
     */
    public java.util.List<Signer> getItems() {
        return items;
    }

    /**
     * <p>
     * A complex type that contains one <code>Signer</code> complex type for
     * each trusted signer that is specified in the <code>TrustedSigners</code>
     * complex type.
     * </p>
     *
     * @param items <p>
     *            A complex type that contains one <code>Signer</code> complex
     *            type for each trusted signer that is specified in the
     *            <code>TrustedSigners</code> complex type.
     *            </p>
     */
    public void setItems(java.util.Collection<Signer> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<Signer>(items);
    }

    /**
     * <p>
     * A complex type that contains one <code>Signer</code> complex type for
     * each trusted signer that is specified in the <code>TrustedSigners</code>
     * complex type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            A complex type that contains one <code>Signer</code> complex
     *            type for each trusted signer that is specified in the
     *            <code>TrustedSigners</code> complex type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveTrustedSigners withItems(Signer... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<Signer>(items.length);
        }
        for (Signer value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains one <code>Signer</code> complex type for
     * each trusted signer that is specified in the <code>TrustedSigners</code>
     * complex type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            A complex type that contains one <code>Signer</code> complex
     *            type for each trusted signer that is specified in the
     *            <code>TrustedSigners</code> complex type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveTrustedSigners withItems(java.util.Collection<Signer> items) {
        setItems(items);
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
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getQuantity() != null)
            sb.append("Quantity: " + getQuantity() + ",");
        if (getItems() != null)
            sb.append("Items: " + getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActiveTrustedSigners == false)
            return false;
        ActiveTrustedSigners other = (ActiveTrustedSigners) obj;

        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }
}
