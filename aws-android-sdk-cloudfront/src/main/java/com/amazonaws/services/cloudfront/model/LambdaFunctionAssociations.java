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
 * A complex type that specifies a list of Lambda functions associations for a
 * cache behavior.
 * </p>
 * <p>
 * If you want to invoke one or more Lambda functions triggered by requests that
 * match the <code>PathPattern</code> of the cache behavior, specify the
 * applicable values for <code>Quantity</code> and <code>Items</code>. Note that
 * there can be up to 4 <code>LambdaFunctionAssociation</code> items in this
 * list (one for each possible value of <code>EventType</code>) and each
 * <code>EventType</code> can be associated with the Lambda function only once.
 * </p>
 * <p>
 * If you don't want to invoke any Lambda functions for the requests that match
 * <code>PathPattern</code>, specify <code>0</code> for <code>Quantity</code>
 * and omit <code>Items</code>.
 * </p>
 */
public class LambdaFunctionAssociations implements Serializable {
    /**
     * <p>
     * The number of Lambda function associations for this cache behavior.
     * </p>
     */
    private Integer quantity;

    /**
     * <p>
     * <b>Optional</b>: A complex type that contains
     * <code>LambdaFunctionAssociation</code> items for this cache behavior. If
     * <code>Quantity</code> is <code>0</code>, you can omit <code>Items</code>.
     * </p>
     */
    private java.util.List<LambdaFunctionAssociation> items;

    /**
     * <p>
     * The number of Lambda function associations for this cache behavior.
     * </p>
     *
     * @return <p>
     *         The number of Lambda function associations for this cache
     *         behavior.
     *         </p>
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * <p>
     * The number of Lambda function associations for this cache behavior.
     * </p>
     *
     * @param quantity <p>
     *            The number of Lambda function associations for this cache
     *            behavior.
     *            </p>
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of Lambda function associations for this cache behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quantity <p>
     *            The number of Lambda function associations for this cache
     *            behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaFunctionAssociations withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * <p>
     * <b>Optional</b>: A complex type that contains
     * <code>LambdaFunctionAssociation</code> items for this cache behavior. If
     * <code>Quantity</code> is <code>0</code>, you can omit <code>Items</code>.
     * </p>
     *
     * @return <p>
     *         <b>Optional</b>: A complex type that contains
     *         <code>LambdaFunctionAssociation</code> items for this cache
     *         behavior. If <code>Quantity</code> is <code>0</code>, you can
     *         omit <code>Items</code>.
     *         </p>
     */
    public java.util.List<LambdaFunctionAssociation> getItems() {
        return items;
    }

    /**
     * <p>
     * <b>Optional</b>: A complex type that contains
     * <code>LambdaFunctionAssociation</code> items for this cache behavior. If
     * <code>Quantity</code> is <code>0</code>, you can omit <code>Items</code>.
     * </p>
     *
     * @param items <p>
     *            <b>Optional</b>: A complex type that contains
     *            <code>LambdaFunctionAssociation</code> items for this cache
     *            behavior. If <code>Quantity</code> is <code>0</code>, you can
     *            omit <code>Items</code>.
     *            </p>
     */
    public void setItems(java.util.Collection<LambdaFunctionAssociation> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<LambdaFunctionAssociation>(items);
    }

    /**
     * <p>
     * <b>Optional</b>: A complex type that contains
     * <code>LambdaFunctionAssociation</code> items for this cache behavior. If
     * <code>Quantity</code> is <code>0</code>, you can omit <code>Items</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            <b>Optional</b>: A complex type that contains
     *            <code>LambdaFunctionAssociation</code> items for this cache
     *            behavior. If <code>Quantity</code> is <code>0</code>, you can
     *            omit <code>Items</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaFunctionAssociations withItems(LambdaFunctionAssociation... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<LambdaFunctionAssociation>(items.length);
        }
        for (LambdaFunctionAssociation value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * <b>Optional</b>: A complex type that contains
     * <code>LambdaFunctionAssociation</code> items for this cache behavior. If
     * <code>Quantity</code> is <code>0</code>, you can omit <code>Items</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            <b>Optional</b>: A complex type that contains
     *            <code>LambdaFunctionAssociation</code> items for this cache
     *            behavior. If <code>Quantity</code> is <code>0</code>, you can
     *            omit <code>Items</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaFunctionAssociations withItems(
            java.util.Collection<LambdaFunctionAssociation> items) {
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

        if (obj instanceof LambdaFunctionAssociations == false)
            return false;
        LambdaFunctionAssociations other = (LambdaFunctionAssociations) obj;

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
