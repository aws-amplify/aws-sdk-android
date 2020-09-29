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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of resources that match and don't match the specified criteria.</p>
 */
public class InventoryGroup implements Serializable {
    /**
     * <p>The name of the group.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     */
    private String name;

    /**
     * <p>Filters define the criteria for the group. The <code>matchingCount</code> field displays the number of resources that match the criteria. The <code>notMatchingCount</code> field displays the number of resources that don't match the criteria. </p>
     */
    private java.util.List<InventoryFilter> filters;

    /**
     * <p>The name of the group.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @return <p>The name of the group.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of the group.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param name <p>The name of the group.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of the group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param name <p>The name of the group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InventoryGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>Filters define the criteria for the group. The <code>matchingCount</code> field displays the number of resources that match the criteria. The <code>notMatchingCount</code> field displays the number of resources that don't match the criteria. </p>
     *
     * @return <p>Filters define the criteria for the group. The <code>matchingCount</code> field displays the number of resources that match the criteria. The <code>notMatchingCount</code> field displays the number of resources that don't match the criteria. </p>
     */
    public java.util.List<InventoryFilter> getFilters() {
        return filters;
    }

    /**
     * <p>Filters define the criteria for the group. The <code>matchingCount</code> field displays the number of resources that match the criteria. The <code>notMatchingCount</code> field displays the number of resources that don't match the criteria. </p>
     *
     * @param filters <p>Filters define the criteria for the group. The <code>matchingCount</code> field displays the number of resources that match the criteria. The <code>notMatchingCount</code> field displays the number of resources that don't match the criteria. </p>
     */
    public void setFilters(java.util.Collection<InventoryFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<InventoryFilter>(filters);
    }

    /**
     * <p>Filters define the criteria for the group. The <code>matchingCount</code> field displays the number of resources that match the criteria. The <code>notMatchingCount</code> field displays the number of resources that don't match the criteria. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>Filters define the criteria for the group. The <code>matchingCount</code> field displays the number of resources that match the criteria. The <code>notMatchingCount</code> field displays the number of resources that don't match the criteria. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InventoryGroup withFilters(InventoryFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<InventoryFilter>(filters.length);
        }
        for (InventoryFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>Filters define the criteria for the group. The <code>matchingCount</code> field displays the number of resources that match the criteria. The <code>notMatchingCount</code> field displays the number of resources that don't match the criteria. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>Filters define the criteria for the group. The <code>matchingCount</code> field displays the number of resources that match the criteria. The <code>notMatchingCount</code> field displays the number of resources that don't match the criteria. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InventoryGroup withFilters(java.util.Collection<InventoryFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InventoryGroup == false) return false;
        InventoryGroup other = (InventoryGroup)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false;
        return true;
    }
}
