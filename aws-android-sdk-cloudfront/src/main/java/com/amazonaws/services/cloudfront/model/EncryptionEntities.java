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
 * Complex data type for field-level encryption profiles that includes all of
 * the encryption entities.
 * </p>
 */
public class EncryptionEntities implements Serializable {
    /**
     * <p>
     * Number of field pattern items in a field-level encryption content
     * type-profile mapping.
     * </p>
     */
    private Integer quantity;

    /**
     * <p>
     * An array of field patterns in a field-level encryption content
     * type-profile mapping.
     * </p>
     */
    private java.util.List<EncryptionEntity> items;

    /**
     * <p>
     * Number of field pattern items in a field-level encryption content
     * type-profile mapping.
     * </p>
     *
     * @return <p>
     *         Number of field pattern items in a field-level encryption content
     *         type-profile mapping.
     *         </p>
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * <p>
     * Number of field pattern items in a field-level encryption content
     * type-profile mapping.
     * </p>
     *
     * @param quantity <p>
     *            Number of field pattern items in a field-level encryption
     *            content type-profile mapping.
     *            </p>
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * Number of field pattern items in a field-level encryption content
     * type-profile mapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quantity <p>
     *            Number of field pattern items in a field-level encryption
     *            content type-profile mapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptionEntities withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * <p>
     * An array of field patterns in a field-level encryption content
     * type-profile mapping.
     * </p>
     *
     * @return <p>
     *         An array of field patterns in a field-level encryption content
     *         type-profile mapping.
     *         </p>
     */
    public java.util.List<EncryptionEntity> getItems() {
        return items;
    }

    /**
     * <p>
     * An array of field patterns in a field-level encryption content
     * type-profile mapping.
     * </p>
     *
     * @param items <p>
     *            An array of field patterns in a field-level encryption content
     *            type-profile mapping.
     *            </p>
     */
    public void setItems(java.util.Collection<EncryptionEntity> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<EncryptionEntity>(items);
    }

    /**
     * <p>
     * An array of field patterns in a field-level encryption content
     * type-profile mapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            An array of field patterns in a field-level encryption content
     *            type-profile mapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptionEntities withItems(EncryptionEntity... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<EncryptionEntity>(items.length);
        }
        for (EncryptionEntity value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of field patterns in a field-level encryption content
     * type-profile mapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            An array of field patterns in a field-level encryption content
     *            type-profile mapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptionEntities withItems(java.util.Collection<EncryptionEntity> items) {
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

        if (obj instanceof EncryptionEntities == false)
            return false;
        EncryptionEntities other = (EncryptionEntities) obj;

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
