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

package com.amazonaws.services.dynamodb.model;

import java.io.Serializable;

/**
 * <p>
 * Details for the requested item.
 * </p>
 */
public class ItemResponse implements Serializable {
    /**
     * <p>
     * Map of attribute data consisting of the data type and attribute value.
     * </p>
     */
    private java.util.Map<String, AttributeValue> item;

    /**
     * <p>
     * Map of attribute data consisting of the data type and attribute value.
     * </p>
     *
     * @return <p>
     *         Map of attribute data consisting of the data type and attribute
     *         value.
     *         </p>
     */
    public java.util.Map<String, AttributeValue> getItem() {
        return item;
    }

    /**
     * <p>
     * Map of attribute data consisting of the data type and attribute value.
     * </p>
     *
     * @param item <p>
     *            Map of attribute data consisting of the data type and
     *            attribute value.
     *            </p>
     */
    public void setItem(java.util.Map<String, AttributeValue> item) {
        this.item = item;
    }

    /**
     * <p>
     * Map of attribute data consisting of the data type and attribute value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param item <p>
     *            Map of attribute data consisting of the data type and
     *            attribute value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ItemResponse withItem(java.util.Map<String, AttributeValue> item) {
        this.item = item;
        return this;
    }

    /**
     * <p>
     * Map of attribute data consisting of the data type and attribute value.
     * </p>
     * <p>
     * The method adds a new key-value pair into Item parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Item.
     * @param value The corresponding value of the entry to be added into Item.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ItemResponse addItemEntry(String key, AttributeValue value) {
        if (null == this.item) {
            this.item = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.item.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.item.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Item.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ItemResponse clearItemEntries() {
        this.item = null;
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
        if (getItem() != null)
            sb.append("Item: " + getItem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ItemResponse == false)
            return false;
        ItemResponse other = (ItemResponse) obj;

        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        return true;
    }
}
