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
 * Query argument-profile mapping for field-level encryption.
 * </p>
 */
public class QueryArgProfiles implements Serializable {
    /**
     * <p>
     * Number of profiles for query argument-profile mapping for field-level
     * encryption.
     * </p>
     */
    private Integer quantity;

    /**
     * <p>
     * Number of items for query argument-profile mapping for field-level
     * encryption.
     * </p>
     */
    private java.util.List<QueryArgProfile> items;

    /**
     * <p>
     * Number of profiles for query argument-profile mapping for field-level
     * encryption.
     * </p>
     *
     * @return <p>
     *         Number of profiles for query argument-profile mapping for
     *         field-level encryption.
     *         </p>
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * <p>
     * Number of profiles for query argument-profile mapping for field-level
     * encryption.
     * </p>
     *
     * @param quantity <p>
     *            Number of profiles for query argument-profile mapping for
     *            field-level encryption.
     *            </p>
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * Number of profiles for query argument-profile mapping for field-level
     * encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quantity <p>
     *            Number of profiles for query argument-profile mapping for
     *            field-level encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryArgProfiles withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * <p>
     * Number of items for query argument-profile mapping for field-level
     * encryption.
     * </p>
     *
     * @return <p>
     *         Number of items for query argument-profile mapping for
     *         field-level encryption.
     *         </p>
     */
    public java.util.List<QueryArgProfile> getItems() {
        return items;
    }

    /**
     * <p>
     * Number of items for query argument-profile mapping for field-level
     * encryption.
     * </p>
     *
     * @param items <p>
     *            Number of items for query argument-profile mapping for
     *            field-level encryption.
     *            </p>
     */
    public void setItems(java.util.Collection<QueryArgProfile> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<QueryArgProfile>(items);
    }

    /**
     * <p>
     * Number of items for query argument-profile mapping for field-level
     * encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            Number of items for query argument-profile mapping for
     *            field-level encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryArgProfiles withItems(QueryArgProfile... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<QueryArgProfile>(items.length);
        }
        for (QueryArgProfile value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Number of items for query argument-profile mapping for field-level
     * encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            Number of items for query argument-profile mapping for
     *            field-level encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryArgProfiles withItems(java.util.Collection<QueryArgProfile> items) {
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

        if (obj instanceof QueryArgProfiles == false)
            return false;
        QueryArgProfiles other = (QueryArgProfiles) obj;

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
