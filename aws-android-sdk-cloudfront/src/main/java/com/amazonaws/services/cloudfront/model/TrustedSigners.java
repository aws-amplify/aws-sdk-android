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
 * A complex type that specifies the AWS accounts, if any, that you want to
 * allow to create signed URLs for private content.
 * </p>
 * <p>
 * If you want to require signed URLs in requests for objects in the target
 * origin that match the <code>PathPattern</code> for this cache behavior,
 * specify <code>true</code> for <code>Enabled</code>, and specify the
 * applicable values for <code>Quantity</code> and <code>Items</code>. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html"
 * >Serving Private Content through CloudFront</a> in the <i> Amazon CloudFront
 * Developer Guide</i>.
 * </p>
 * <p>
 * If you don't want to require signed URLs in requests for objects that match
 * <code>PathPattern</code>, specify <code>false</code> for <code>Enabled</code>
 * and <code>0</code> for <code>Quantity</code>. Omit <code>Items</code>.
 * </p>
 * <p>
 * To add, change, or remove one or more trusted signers, change
 * <code>Enabled</code> to <code>true</code> (if it's currently
 * <code>false</code>), change <code>Quantity</code> as applicable, and specify
 * all of the trusted signers that you want to include in the updated
 * distribution.
 * </p>
 * <p>
 * For more information about updating the distribution configuration, see <a
 * href=
 * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/DistributionConfig.html"
 * >DistributionConfig</a> in the <i>Amazon CloudFront API Reference</i>.
 * </p>
 */
public class TrustedSigners implements Serializable {
    /**
     * <p>
     * Specifies whether you want to require viewers to use signed URLs to
     * access the files specified by <code>PathPattern</code> and
     * <code>TargetOriginId</code>.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The number of trusted signers for this cache behavior.
     * </p>
     */
    private Integer quantity;

    /**
     * <p>
     * <b>Optional</b>: A complex type that contains trusted signers for this
     * cache behavior. If <code>Quantity</code> is <code>0</code>, you can omit
     * <code>Items</code>.
     * </p>
     */
    private java.util.List<String> items;

    /**
     * <p>
     * Specifies whether you want to require viewers to use signed URLs to
     * access the files specified by <code>PathPattern</code> and
     * <code>TargetOriginId</code>.
     * </p>
     *
     * @return <p>
     *         Specifies whether you want to require viewers to use signed URLs
     *         to access the files specified by <code>PathPattern</code> and
     *         <code>TargetOriginId</code>.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether you want to require viewers to use signed URLs to
     * access the files specified by <code>PathPattern</code> and
     * <code>TargetOriginId</code>.
     * </p>
     *
     * @return <p>
     *         Specifies whether you want to require viewers to use signed URLs
     *         to access the files specified by <code>PathPattern</code> and
     *         <code>TargetOriginId</code>.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether you want to require viewers to use signed URLs to
     * access the files specified by <code>PathPattern</code> and
     * <code>TargetOriginId</code>.
     * </p>
     *
     * @param enabled <p>
     *            Specifies whether you want to require viewers to use signed
     *            URLs to access the files specified by <code>PathPattern</code>
     *            and <code>TargetOriginId</code>.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether you want to require viewers to use signed URLs to
     * access the files specified by <code>PathPattern</code> and
     * <code>TargetOriginId</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Specifies whether you want to require viewers to use signed
     *            URLs to access the files specified by <code>PathPattern</code>
     *            and <code>TargetOriginId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedSigners withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The number of trusted signers for this cache behavior.
     * </p>
     *
     * @return <p>
     *         The number of trusted signers for this cache behavior.
     *         </p>
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * <p>
     * The number of trusted signers for this cache behavior.
     * </p>
     *
     * @param quantity <p>
     *            The number of trusted signers for this cache behavior.
     *            </p>
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of trusted signers for this cache behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quantity <p>
     *            The number of trusted signers for this cache behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedSigners withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * <p>
     * <b>Optional</b>: A complex type that contains trusted signers for this
     * cache behavior. If <code>Quantity</code> is <code>0</code>, you can omit
     * <code>Items</code>.
     * </p>
     *
     * @return <p>
     *         <b>Optional</b>: A complex type that contains trusted signers for
     *         this cache behavior. If <code>Quantity</code> is <code>0</code>,
     *         you can omit <code>Items</code>.
     *         </p>
     */
    public java.util.List<String> getItems() {
        return items;
    }

    /**
     * <p>
     * <b>Optional</b>: A complex type that contains trusted signers for this
     * cache behavior. If <code>Quantity</code> is <code>0</code>, you can omit
     * <code>Items</code>.
     * </p>
     *
     * @param items <p>
     *            <b>Optional</b>: A complex type that contains trusted signers
     *            for this cache behavior. If <code>Quantity</code> is
     *            <code>0</code>, you can omit <code>Items</code>.
     *            </p>
     */
    public void setItems(java.util.Collection<String> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<String>(items);
    }

    /**
     * <p>
     * <b>Optional</b>: A complex type that contains trusted signers for this
     * cache behavior. If <code>Quantity</code> is <code>0</code>, you can omit
     * <code>Items</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            <b>Optional</b>: A complex type that contains trusted signers
     *            for this cache behavior. If <code>Quantity</code> is
     *            <code>0</code>, you can omit <code>Items</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedSigners withItems(String... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<String>(items.length);
        }
        for (String value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * <b>Optional</b>: A complex type that contains trusted signers for this
     * cache behavior. If <code>Quantity</code> is <code>0</code>, you can omit
     * <code>Items</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            <b>Optional</b>: A complex type that contains trusted signers
     *            for this cache behavior. If <code>Quantity</code> is
     *            <code>0</code>, you can omit <code>Items</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrustedSigners withItems(java.util.Collection<String> items) {
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

        if (obj instanceof TrustedSigners == false)
            return false;
        TrustedSigners other = (TrustedSigners) obj;

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
