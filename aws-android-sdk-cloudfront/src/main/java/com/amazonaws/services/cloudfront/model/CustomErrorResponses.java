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
 * A complex type that controls:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with
 * custom error messages before returning the response to the viewer.
 * </p>
 * </li>
 * <li>
 * <p>
 * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about custom error pages, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html"
 * >Customizing Error Responses</a> in the <i>Amazon CloudFront Developer
 * Guide</i>.
 * </p>
 */
public class CustomErrorResponses implements Serializable {
    /**
     * <p>
     * The number of HTTP status codes for which you want to specify a custom
     * error page and/or a caching duration. If <code>Quantity</code> is
     * <code>0</code>, you can omit <code>Items</code>.
     * </p>
     */
    private Integer quantity;

    /**
     * <p>
     * A complex type that contains a <code>CustomErrorResponse</code> element
     * for each HTTP status code for which you want to specify a custom error
     * page and/or a caching duration.
     * </p>
     */
    private java.util.List<CustomErrorResponse> items;

    /**
     * <p>
     * The number of HTTP status codes for which you want to specify a custom
     * error page and/or a caching duration. If <code>Quantity</code> is
     * <code>0</code>, you can omit <code>Items</code>.
     * </p>
     *
     * @return <p>
     *         The number of HTTP status codes for which you want to specify a
     *         custom error page and/or a caching duration. If
     *         <code>Quantity</code> is <code>0</code>, you can omit
     *         <code>Items</code>.
     *         </p>
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * <p>
     * The number of HTTP status codes for which you want to specify a custom
     * error page and/or a caching duration. If <code>Quantity</code> is
     * <code>0</code>, you can omit <code>Items</code>.
     * </p>
     *
     * @param quantity <p>
     *            The number of HTTP status codes for which you want to specify
     *            a custom error page and/or a caching duration. If
     *            <code>Quantity</code> is <code>0</code>, you can omit
     *            <code>Items</code>.
     *            </p>
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of HTTP status codes for which you want to specify a custom
     * error page and/or a caching duration. If <code>Quantity</code> is
     * <code>0</code>, you can omit <code>Items</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quantity <p>
     *            The number of HTTP status codes for which you want to specify
     *            a custom error page and/or a caching duration. If
     *            <code>Quantity</code> is <code>0</code>, you can omit
     *            <code>Items</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomErrorResponses withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * <p>
     * A complex type that contains a <code>CustomErrorResponse</code> element
     * for each HTTP status code for which you want to specify a custom error
     * page and/or a caching duration.
     * </p>
     *
     * @return <p>
     *         A complex type that contains a <code>CustomErrorResponse</code>
     *         element for each HTTP status code for which you want to specify a
     *         custom error page and/or a caching duration.
     *         </p>
     */
    public java.util.List<CustomErrorResponse> getItems() {
        return items;
    }

    /**
     * <p>
     * A complex type that contains a <code>CustomErrorResponse</code> element
     * for each HTTP status code for which you want to specify a custom error
     * page and/or a caching duration.
     * </p>
     *
     * @param items <p>
     *            A complex type that contains a
     *            <code>CustomErrorResponse</code> element for each HTTP status
     *            code for which you want to specify a custom error page and/or
     *            a caching duration.
     *            </p>
     */
    public void setItems(java.util.Collection<CustomErrorResponse> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<CustomErrorResponse>(items);
    }

    /**
     * <p>
     * A complex type that contains a <code>CustomErrorResponse</code> element
     * for each HTTP status code for which you want to specify a custom error
     * page and/or a caching duration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            A complex type that contains a
     *            <code>CustomErrorResponse</code> element for each HTTP status
     *            code for which you want to specify a custom error page and/or
     *            a caching duration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomErrorResponses withItems(CustomErrorResponse... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<CustomErrorResponse>(items.length);
        }
        for (CustomErrorResponse value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains a <code>CustomErrorResponse</code> element
     * for each HTTP status code for which you want to specify a custom error
     * page and/or a caching duration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            A complex type that contains a
     *            <code>CustomErrorResponse</code> element for each HTTP status
     *            code for which you want to specify a custom error page and/or
     *            a caching duration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomErrorResponses withItems(java.util.Collection<CustomErrorResponse> items) {
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

        if (obj instanceof CustomErrorResponses == false)
            return false;
        CustomErrorResponses other = (CustomErrorResponses) obj;

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
