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
 * A complex type that specifies whether you want CloudFront to forward cookies
 * to the origin and, if so, which ones. For more information about forwarding
 * cookies to the origin, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html"
 * > Caching Content Based on Request Headers</a> in the <i>Amazon CloudFront
 * Developer Guide</i>.
 * </p>
 */
public class CookieNames implements Serializable {
    /**
     * <p>
     * The number of different cookies that you want CloudFront to forward to
     * the origin for this cache behavior. The value must equal the number of
     * items that are in the <code>Items</code> field.
     * </p>
     * <p>
     * When you set <code>Forward = whitelist</code> (in the
     * <code>CookiePreferences</code> object), this value must be <code>1</code>
     * or higher.
     * </p>
     */
    private Integer quantity;

    /**
     * <p>
     * A complex type that contains one <code>Name</code> element for each
     * cookie that you want CloudFront to forward to the origin for this cache
     * behavior. It must contain the same number of items that is specified in
     * the <code>Quantity</code> field.
     * </p>
     * <p>
     * When you set <code>Forward = whitelist</code> (in the
     * <code>CookiePreferences</code> object), this field must contain at least
     * one item.
     * </p>
     */
    private java.util.List<String> items;

    /**
     * <p>
     * The number of different cookies that you want CloudFront to forward to
     * the origin for this cache behavior. The value must equal the number of
     * items that are in the <code>Items</code> field.
     * </p>
     * <p>
     * When you set <code>Forward = whitelist</code> (in the
     * <code>CookiePreferences</code> object), this value must be <code>1</code>
     * or higher.
     * </p>
     *
     * @return <p>
     *         The number of different cookies that you want CloudFront to
     *         forward to the origin for this cache behavior. The value must
     *         equal the number of items that are in the <code>Items</code>
     *         field.
     *         </p>
     *         <p>
     *         When you set <code>Forward = whitelist</code> (in the
     *         <code>CookiePreferences</code> object), this value must be
     *         <code>1</code> or higher.
     *         </p>
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * <p>
     * The number of different cookies that you want CloudFront to forward to
     * the origin for this cache behavior. The value must equal the number of
     * items that are in the <code>Items</code> field.
     * </p>
     * <p>
     * When you set <code>Forward = whitelist</code> (in the
     * <code>CookiePreferences</code> object), this value must be <code>1</code>
     * or higher.
     * </p>
     *
     * @param quantity <p>
     *            The number of different cookies that you want CloudFront to
     *            forward to the origin for this cache behavior. The value must
     *            equal the number of items that are in the <code>Items</code>
     *            field.
     *            </p>
     *            <p>
     *            When you set <code>Forward = whitelist</code> (in the
     *            <code>CookiePreferences</code> object), this value must be
     *            <code>1</code> or higher.
     *            </p>
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of different cookies that you want CloudFront to forward to
     * the origin for this cache behavior. The value must equal the number of
     * items that are in the <code>Items</code> field.
     * </p>
     * <p>
     * When you set <code>Forward = whitelist</code> (in the
     * <code>CookiePreferences</code> object), this value must be <code>1</code>
     * or higher.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quantity <p>
     *            The number of different cookies that you want CloudFront to
     *            forward to the origin for this cache behavior. The value must
     *            equal the number of items that are in the <code>Items</code>
     *            field.
     *            </p>
     *            <p>
     *            When you set <code>Forward = whitelist</code> (in the
     *            <code>CookiePreferences</code> object), this value must be
     *            <code>1</code> or higher.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CookieNames withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * <p>
     * A complex type that contains one <code>Name</code> element for each
     * cookie that you want CloudFront to forward to the origin for this cache
     * behavior. It must contain the same number of items that is specified in
     * the <code>Quantity</code> field.
     * </p>
     * <p>
     * When you set <code>Forward = whitelist</code> (in the
     * <code>CookiePreferences</code> object), this field must contain at least
     * one item.
     * </p>
     *
     * @return <p>
     *         A complex type that contains one <code>Name</code> element for
     *         each cookie that you want CloudFront to forward to the origin for
     *         this cache behavior. It must contain the same number of items
     *         that is specified in the <code>Quantity</code> field.
     *         </p>
     *         <p>
     *         When you set <code>Forward = whitelist</code> (in the
     *         <code>CookiePreferences</code> object), this field must contain
     *         at least one item.
     *         </p>
     */
    public java.util.List<String> getItems() {
        return items;
    }

    /**
     * <p>
     * A complex type that contains one <code>Name</code> element for each
     * cookie that you want CloudFront to forward to the origin for this cache
     * behavior. It must contain the same number of items that is specified in
     * the <code>Quantity</code> field.
     * </p>
     * <p>
     * When you set <code>Forward = whitelist</code> (in the
     * <code>CookiePreferences</code> object), this field must contain at least
     * one item.
     * </p>
     *
     * @param items <p>
     *            A complex type that contains one <code>Name</code> element for
     *            each cookie that you want CloudFront to forward to the origin
     *            for this cache behavior. It must contain the same number of
     *            items that is specified in the <code>Quantity</code> field.
     *            </p>
     *            <p>
     *            When you set <code>Forward = whitelist</code> (in the
     *            <code>CookiePreferences</code> object), this field must
     *            contain at least one item.
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
     * A complex type that contains one <code>Name</code> element for each
     * cookie that you want CloudFront to forward to the origin for this cache
     * behavior. It must contain the same number of items that is specified in
     * the <code>Quantity</code> field.
     * </p>
     * <p>
     * When you set <code>Forward = whitelist</code> (in the
     * <code>CookiePreferences</code> object), this field must contain at least
     * one item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            A complex type that contains one <code>Name</code> element for
     *            each cookie that you want CloudFront to forward to the origin
     *            for this cache behavior. It must contain the same number of
     *            items that is specified in the <code>Quantity</code> field.
     *            </p>
     *            <p>
     *            When you set <code>Forward = whitelist</code> (in the
     *            <code>CookiePreferences</code> object), this field must
     *            contain at least one item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CookieNames withItems(String... items) {
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
     * A complex type that contains one <code>Name</code> element for each
     * cookie that you want CloudFront to forward to the origin for this cache
     * behavior. It must contain the same number of items that is specified in
     * the <code>Quantity</code> field.
     * </p>
     * <p>
     * When you set <code>Forward = whitelist</code> (in the
     * <code>CookiePreferences</code> object), this field must contain at least
     * one item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            A complex type that contains one <code>Name</code> element for
     *            each cookie that you want CloudFront to forward to the origin
     *            for this cache behavior. It must contain the same number of
     *            items that is specified in the <code>Quantity</code> field.
     *            </p>
     *            <p>
     *            When you set <code>Forward = whitelist</code> (in the
     *            <code>CookiePreferences</code> object), this field must
     *            contain at least one item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CookieNames withItems(java.util.Collection<String> items) {
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

        if (obj instanceof CookieNames == false)
            return false;
        CookieNames other = (CookieNames) obj;

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
