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
 * A complex type that contains zero or more <code>Tag</code> elements.
 * </p>
 */
public class Tags implements Serializable {
    /**
     * <p>
     * A complex type that contains <code>Tag</code> elements.
     * </p>
     */
    private java.util.List<Tag> items;

    /**
     * <p>
     * A complex type that contains <code>Tag</code> elements.
     * </p>
     *
     * @return <p>
     *         A complex type that contains <code>Tag</code> elements.
     *         </p>
     */
    public java.util.List<Tag> getItems() {
        return items;
    }

    /**
     * <p>
     * A complex type that contains <code>Tag</code> elements.
     * </p>
     *
     * @param items <p>
     *            A complex type that contains <code>Tag</code> elements.
     *            </p>
     */
    public void setItems(java.util.Collection<Tag> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<Tag>(items);
    }

    /**
     * <p>
     * A complex type that contains <code>Tag</code> elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            A complex type that contains <code>Tag</code> elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tags withItems(Tag... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<Tag>(items.length);
        }
        for (Tag value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains <code>Tag</code> elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            A complex type that contains <code>Tag</code> elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tags withItems(java.util.Collection<Tag> items) {
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
        if (getItems() != null)
            sb.append("Items: " + getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tags == false)
            return false;
        Tags other = (Tags) obj;

        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }
}
