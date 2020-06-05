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
 * A complex type that controls which HTTP methods CloudFront processes and
 * forwards to your Amazon S3 bucket or your custom origin. There are three
 * choices:
 * </p>
 * <ul>
 * <li>
 * <p>
 * CloudFront forwards only <code>GET</code> and <code>HEAD</code> requests.
 * </p>
 * </li>
 * <li>
 * <p>
 * CloudFront forwards only <code>GET</code>, <code>HEAD</code>, and
 * <code>OPTIONS</code> requests.
 * </p>
 * </li>
 * <li>
 * <p>
 * CloudFront forwards <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and
 * <code>DELETE</code> requests.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you pick the third choice, you may need to restrict access to your Amazon
 * S3 bucket or to your custom origin so users can't perform operations that you
 * don't want them to. For example, you might not want users to have permissions
 * to delete objects from your origin.
 * </p>
 */
public class AllowedMethods implements Serializable {
    /**
     * <p>
     * The number of HTTP methods that you want CloudFront to forward to your
     * origin. Valid values are 2 (for <code>GET</code> and <code>HEAD</code>
     * requests), 3 (for <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> requests) and 7 (for
     * <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and
     * <code>DELETE</code> requests).
     * </p>
     */
    private Integer quantity;

    /**
     * <p>
     * A complex type that contains the HTTP methods that you want CloudFront to
     * process and forward to your origin.
     * </p>
     */
    private java.util.List<String> items;

    /**
     * <p>
     * A complex type that controls whether CloudFront caches the response to
     * requests using the specified HTTP methods. There are two choices:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CloudFront caches responses to <code>GET</code> and <code>HEAD</code>
     * requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudFront caches responses to <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> requests.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you pick the second choice for your Amazon S3 Origin, you may need to
     * forward Access-Control-Request-Method, Access-Control-Request-Headers,
     * and Origin headers for the responses to be cached correctly.
     * </p>
     */
    private CachedMethods cachedMethods;

    /**
     * <p>
     * The number of HTTP methods that you want CloudFront to forward to your
     * origin. Valid values are 2 (for <code>GET</code> and <code>HEAD</code>
     * requests), 3 (for <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> requests) and 7 (for
     * <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and
     * <code>DELETE</code> requests).
     * </p>
     *
     * @return <p>
     *         The number of HTTP methods that you want CloudFront to forward to
     *         your origin. Valid values are 2 (for <code>GET</code> and
     *         <code>HEAD</code> requests), 3 (for <code>GET</code>,
     *         <code>HEAD</code>, and <code>OPTIONS</code> requests) and 7 (for
     *         <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and
     *         <code>DELETE</code> requests).
     *         </p>
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * <p>
     * The number of HTTP methods that you want CloudFront to forward to your
     * origin. Valid values are 2 (for <code>GET</code> and <code>HEAD</code>
     * requests), 3 (for <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> requests) and 7 (for
     * <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and
     * <code>DELETE</code> requests).
     * </p>
     *
     * @param quantity <p>
     *            The number of HTTP methods that you want CloudFront to forward
     *            to your origin. Valid values are 2 (for <code>GET</code> and
     *            <code>HEAD</code> requests), 3 (for <code>GET</code>,
     *            <code>HEAD</code>, and <code>OPTIONS</code> requests) and 7
     *            (for <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and
     *            <code>DELETE</code> requests).
     *            </p>
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of HTTP methods that you want CloudFront to forward to your
     * origin. Valid values are 2 (for <code>GET</code> and <code>HEAD</code>
     * requests), 3 (for <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> requests) and 7 (for
     * <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and
     * <code>DELETE</code> requests).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quantity <p>
     *            The number of HTTP methods that you want CloudFront to forward
     *            to your origin. Valid values are 2 (for <code>GET</code> and
     *            <code>HEAD</code> requests), 3 (for <code>GET</code>,
     *            <code>HEAD</code>, and <code>OPTIONS</code> requests) and 7
     *            (for <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and
     *            <code>DELETE</code> requests).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllowedMethods withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * <p>
     * A complex type that contains the HTTP methods that you want CloudFront to
     * process and forward to your origin.
     * </p>
     *
     * @return <p>
     *         A complex type that contains the HTTP methods that you want
     *         CloudFront to process and forward to your origin.
     *         </p>
     */
    public java.util.List<String> getItems() {
        return items;
    }

    /**
     * <p>
     * A complex type that contains the HTTP methods that you want CloudFront to
     * process and forward to your origin.
     * </p>
     *
     * @param items <p>
     *            A complex type that contains the HTTP methods that you want
     *            CloudFront to process and forward to your origin.
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
     * A complex type that contains the HTTP methods that you want CloudFront to
     * process and forward to your origin.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            A complex type that contains the HTTP methods that you want
     *            CloudFront to process and forward to your origin.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllowedMethods withItems(String... items) {
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
     * A complex type that contains the HTTP methods that you want CloudFront to
     * process and forward to your origin.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            A complex type that contains the HTTP methods that you want
     *            CloudFront to process and forward to your origin.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllowedMethods withItems(java.util.Collection<String> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * A complex type that controls whether CloudFront caches the response to
     * requests using the specified HTTP methods. There are two choices:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CloudFront caches responses to <code>GET</code> and <code>HEAD</code>
     * requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudFront caches responses to <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> requests.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you pick the second choice for your Amazon S3 Origin, you may need to
     * forward Access-Control-Request-Method, Access-Control-Request-Headers,
     * and Origin headers for the responses to be cached correctly.
     * </p>
     *
     * @return <p>
     *         A complex type that controls whether CloudFront caches the
     *         response to requests using the specified HTTP methods. There are
     *         two choices:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CloudFront caches responses to <code>GET</code> and
     *         <code>HEAD</code> requests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CloudFront caches responses to <code>GET</code>,
     *         <code>HEAD</code>, and <code>OPTIONS</code> requests.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you pick the second choice for your Amazon S3 Origin, you may
     *         need to forward Access-Control-Request-Method,
     *         Access-Control-Request-Headers, and Origin headers for the
     *         responses to be cached correctly.
     *         </p>
     */
    public CachedMethods getCachedMethods() {
        return cachedMethods;
    }

    /**
     * <p>
     * A complex type that controls whether CloudFront caches the response to
     * requests using the specified HTTP methods. There are two choices:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CloudFront caches responses to <code>GET</code> and <code>HEAD</code>
     * requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudFront caches responses to <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> requests.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you pick the second choice for your Amazon S3 Origin, you may need to
     * forward Access-Control-Request-Method, Access-Control-Request-Headers,
     * and Origin headers for the responses to be cached correctly.
     * </p>
     *
     * @param cachedMethods <p>
     *            A complex type that controls whether CloudFront caches the
     *            response to requests using the specified HTTP methods. There
     *            are two choices:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CloudFront caches responses to <code>GET</code> and
     *            <code>HEAD</code> requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CloudFront caches responses to <code>GET</code>,
     *            <code>HEAD</code>, and <code>OPTIONS</code> requests.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you pick the second choice for your Amazon S3 Origin, you
     *            may need to forward Access-Control-Request-Method,
     *            Access-Control-Request-Headers, and Origin headers for the
     *            responses to be cached correctly.
     *            </p>
     */
    public void setCachedMethods(CachedMethods cachedMethods) {
        this.cachedMethods = cachedMethods;
    }

    /**
     * <p>
     * A complex type that controls whether CloudFront caches the response to
     * requests using the specified HTTP methods. There are two choices:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CloudFront caches responses to <code>GET</code> and <code>HEAD</code>
     * requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudFront caches responses to <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> requests.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you pick the second choice for your Amazon S3 Origin, you may need to
     * forward Access-Control-Request-Method, Access-Control-Request-Headers,
     * and Origin headers for the responses to be cached correctly.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cachedMethods <p>
     *            A complex type that controls whether CloudFront caches the
     *            response to requests using the specified HTTP methods. There
     *            are two choices:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CloudFront caches responses to <code>GET</code> and
     *            <code>HEAD</code> requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CloudFront caches responses to <code>GET</code>,
     *            <code>HEAD</code>, and <code>OPTIONS</code> requests.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you pick the second choice for your Amazon S3 Origin, you
     *            may need to forward Access-Control-Request-Method,
     *            Access-Control-Request-Headers, and Origin headers for the
     *            responses to be cached correctly.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllowedMethods withCachedMethods(CachedMethods cachedMethods) {
        this.cachedMethods = cachedMethods;
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
            sb.append("Items: " + getItems() + ",");
        if (getCachedMethods() != null)
            sb.append("CachedMethods: " + getCachedMethods());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode
                + ((getCachedMethods() == null) ? 0 : getCachedMethods().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllowedMethods == false)
            return false;
        AllowedMethods other = (AllowedMethods) obj;

        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getCachedMethods() == null ^ this.getCachedMethods() == null)
            return false;
        if (other.getCachedMethods() != null
                && other.getCachedMethods().equals(this.getCachedMethods()) == false)
            return false;
        return true;
    }
}
