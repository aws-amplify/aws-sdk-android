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
 * List of field-level encrpytion configurations.
 * </p>
 */
public class FieldLevelEncryptionList implements Serializable {
    /**
     * <p>
     * If there are more elements to be listed, this element is present and
     * contains the value that you can use for the <code>Marker</code> request
     * parameter to continue listing your configurations where you left off.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * The maximum number of elements you want in the response body.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * The number of field-level encryption items.
     * </p>
     */
    private Integer quantity;

    /**
     * <p>
     * An array of field-level encryption items.
     * </p>
     */
    private java.util.List<FieldLevelEncryptionSummary> items;

    /**
     * <p>
     * If there are more elements to be listed, this element is present and
     * contains the value that you can use for the <code>Marker</code> request
     * parameter to continue listing your configurations where you left off.
     * </p>
     *
     * @return <p>
     *         If there are more elements to be listed, this element is present
     *         and contains the value that you can use for the
     *         <code>Marker</code> request parameter to continue listing your
     *         configurations where you left off.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * If there are more elements to be listed, this element is present and
     * contains the value that you can use for the <code>Marker</code> request
     * parameter to continue listing your configurations where you left off.
     * </p>
     *
     * @param nextMarker <p>
     *            If there are more elements to be listed, this element is
     *            present and contains the value that you can use for the
     *            <code>Marker</code> request parameter to continue listing your
     *            configurations where you left off.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If there are more elements to be listed, this element is present and
     * contains the value that you can use for the <code>Marker</code> request
     * parameter to continue listing your configurations where you left off.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextMarker <p>
     *            If there are more elements to be listed, this element is
     *            present and contains the value that you can use for the
     *            <code>Marker</code> request parameter to continue listing your
     *            configurations where you left off.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionList withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * <p>
     * The maximum number of elements you want in the response body.
     * </p>
     *
     * @return <p>
     *         The maximum number of elements you want in the response body.
     *         </p>
     */
    public Integer getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * The maximum number of elements you want in the response body.
     * </p>
     *
     * @param maxItems <p>
     *            The maximum number of elements you want in the response body.
     *            </p>
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of elements you want in the response body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            The maximum number of elements you want in the response body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionList withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * <p>
     * The number of field-level encryption items.
     * </p>
     *
     * @return <p>
     *         The number of field-level encryption items.
     *         </p>
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * <p>
     * The number of field-level encryption items.
     * </p>
     *
     * @param quantity <p>
     *            The number of field-level encryption items.
     *            </p>
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of field-level encryption items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quantity <p>
     *            The number of field-level encryption items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionList withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * <p>
     * An array of field-level encryption items.
     * </p>
     *
     * @return <p>
     *         An array of field-level encryption items.
     *         </p>
     */
    public java.util.List<FieldLevelEncryptionSummary> getItems() {
        return items;
    }

    /**
     * <p>
     * An array of field-level encryption items.
     * </p>
     *
     * @param items <p>
     *            An array of field-level encryption items.
     *            </p>
     */
    public void setItems(java.util.Collection<FieldLevelEncryptionSummary> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<FieldLevelEncryptionSummary>(items);
    }

    /**
     * <p>
     * An array of field-level encryption items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            An array of field-level encryption items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionList withItems(FieldLevelEncryptionSummary... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<FieldLevelEncryptionSummary>(items.length);
        }
        for (FieldLevelEncryptionSummary value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of field-level encryption items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            An array of field-level encryption items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionList withItems(
            java.util.Collection<FieldLevelEncryptionSummary> items) {
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
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems() + ",");
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

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
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

        if (obj instanceof FieldLevelEncryptionList == false)
            return false;
        FieldLevelEncryptionList other = (FieldLevelEncryptionList) obj;

        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
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
