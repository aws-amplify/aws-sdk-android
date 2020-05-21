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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies an inventory filter. The inventory only includes objects that meet
 * the filter's criteria.
 * </p>
 */
public class InventoryFilter implements Serializable {
    /**
     * <p>
     * The prefix that an object must have to be included in the inventory
     * results.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * The prefix that an object must have to be included in the inventory
     * results.
     * </p>
     *
     * @return <p>
     *         The prefix that an object must have to be included in the
     *         inventory results.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * The prefix that an object must have to be included in the inventory
     * results.
     * </p>
     *
     * @param prefix <p>
     *            The prefix that an object must have to be included in the
     *            inventory results.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix that an object must have to be included in the inventory
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            The prefix that an object must have to be included in the
     *            inventory results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryFilter withPrefix(String prefix) {
        this.prefix = prefix;
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
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryFilter == false)
            return false;
        InventoryFilter other = (InventoryFilter) obj;

        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }
}
