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
 * A complex type that contains information about the SSL/TLS protocols that
 * CloudFront can use when establishing an HTTPS connection with your origin.
 * </p>
 */
public class OriginSslProtocols implements Serializable {
    /**
     * <p>
     * The number of SSL/TLS protocols that you want to allow CloudFront to use
     * when establishing an HTTPS connection with this origin.
     * </p>
     */
    private Integer quantity;

    /**
     * <p>
     * A list that contains allowed SSL/TLS protocols for this distribution.
     * </p>
     */
    private java.util.List<String> items;

    /**
     * <p>
     * The number of SSL/TLS protocols that you want to allow CloudFront to use
     * when establishing an HTTPS connection with this origin.
     * </p>
     *
     * @return <p>
     *         The number of SSL/TLS protocols that you want to allow CloudFront
     *         to use when establishing an HTTPS connection with this origin.
     *         </p>
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * <p>
     * The number of SSL/TLS protocols that you want to allow CloudFront to use
     * when establishing an HTTPS connection with this origin.
     * </p>
     *
     * @param quantity <p>
     *            The number of SSL/TLS protocols that you want to allow
     *            CloudFront to use when establishing an HTTPS connection with
     *            this origin.
     *            </p>
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of SSL/TLS protocols that you want to allow CloudFront to use
     * when establishing an HTTPS connection with this origin.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quantity <p>
     *            The number of SSL/TLS protocols that you want to allow
     *            CloudFront to use when establishing an HTTPS connection with
     *            this origin.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OriginSslProtocols withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * <p>
     * A list that contains allowed SSL/TLS protocols for this distribution.
     * </p>
     *
     * @return <p>
     *         A list that contains allowed SSL/TLS protocols for this
     *         distribution.
     *         </p>
     */
    public java.util.List<String> getItems() {
        return items;
    }

    /**
     * <p>
     * A list that contains allowed SSL/TLS protocols for this distribution.
     * </p>
     *
     * @param items <p>
     *            A list that contains allowed SSL/TLS protocols for this
     *            distribution.
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
     * A list that contains allowed SSL/TLS protocols for this distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            A list that contains allowed SSL/TLS protocols for this
     *            distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OriginSslProtocols withItems(String... items) {
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
     * A list that contains allowed SSL/TLS protocols for this distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            A list that contains allowed SSL/TLS protocols for this
     *            distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OriginSslProtocols withItems(java.util.Collection<String> items) {
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

        if (obj instanceof OriginSslProtocols == false)
            return false;
        OriginSslProtocols other = (OriginSslProtocols) obj;

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
