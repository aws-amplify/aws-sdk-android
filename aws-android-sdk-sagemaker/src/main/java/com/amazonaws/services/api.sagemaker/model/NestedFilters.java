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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * A list of nested <a>Filter</a> objects. A resource must satisfy the
 * conditions of all filters to be included in the results returned from the
 * <a>Search</a> API.
 * </p>
 * <p>
 * For example, to filter on a training job's <code>InputDataConfig</code>
 * property with a specific channel name and <code>S3Uri</code> prefix, define
 * the following filters:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>'{Name:"InputDataConfig.ChannelName", "Operator":"Equals", "Value":"train"}',</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>'{Name:"InputDataConfig.DataSource.S3DataSource.S3Uri", "Operator":"Contains", "Value":"mybucket/catdata"}'</code>
 * </p>
 * </li>
 * </ul>
 */
public class NestedFilters implements Serializable {
    /**
     * <p>
     * The name of the property to use in the nested filters. The value must
     * match a listed property name, such as <code>InputDataConfig</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String nestedPropertyName;

    /**
     * <p>
     * A list of filters. Each filter acts on a property. Filters must contain
     * at least one <code>Filters</code> value. For example, a
     * <code>NestedFilters</code> call might include a filter on the
     * <code>PropertyName</code> parameter of the <code>InputDataConfig</code>
     * property: <code>InputDataConfig.DataSource.S3DataSource.S3Uri</code>.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The name of the property to use in the nested filters. The value must
     * match a listed property name, such as <code>InputDataConfig</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         The name of the property to use in the nested filters. The value
     *         must match a listed property name, such as
     *         <code>InputDataConfig</code>.
     *         </p>
     */
    public String getNestedPropertyName() {
        return nestedPropertyName;
    }

    /**
     * <p>
     * The name of the property to use in the nested filters. The value must
     * match a listed property name, such as <code>InputDataConfig</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param nestedPropertyName <p>
     *            The name of the property to use in the nested filters. The
     *            value must match a listed property name, such as
     *            <code>InputDataConfig</code>.
     *            </p>
     */
    public void setNestedPropertyName(String nestedPropertyName) {
        this.nestedPropertyName = nestedPropertyName;
    }

    /**
     * <p>
     * The name of the property to use in the nested filters. The value must
     * match a listed property name, such as <code>InputDataConfig</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param nestedPropertyName <p>
     *            The name of the property to use in the nested filters. The
     *            value must match a listed property name, such as
     *            <code>InputDataConfig</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NestedFilters withNestedPropertyName(String nestedPropertyName) {
        this.nestedPropertyName = nestedPropertyName;
        return this;
    }

    /**
     * <p>
     * A list of filters. Each filter acts on a property. Filters must contain
     * at least one <code>Filters</code> value. For example, a
     * <code>NestedFilters</code> call might include a filter on the
     * <code>PropertyName</code> parameter of the <code>InputDataConfig</code>
     * property: <code>InputDataConfig.DataSource.S3DataSource.S3Uri</code>.
     * </p>
     *
     * @return <p>
     *         A list of filters. Each filter acts on a property. Filters must
     *         contain at least one <code>Filters</code> value. For example, a
     *         <code>NestedFilters</code> call might include a filter on the
     *         <code>PropertyName</code> parameter of the
     *         <code>InputDataConfig</code> property:
     *         <code>InputDataConfig.DataSource.S3DataSource.S3Uri</code>.
     *         </p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A list of filters. Each filter acts on a property. Filters must contain
     * at least one <code>Filters</code> value. For example, a
     * <code>NestedFilters</code> call might include a filter on the
     * <code>PropertyName</code> parameter of the <code>InputDataConfig</code>
     * property: <code>InputDataConfig.DataSource.S3DataSource.S3Uri</code>.
     * </p>
     *
     * @param filters <p>
     *            A list of filters. Each filter acts on a property. Filters
     *            must contain at least one <code>Filters</code> value. For
     *            example, a <code>NestedFilters</code> call might include a
     *            filter on the <code>PropertyName</code> parameter of the
     *            <code>InputDataConfig</code> property:
     *            <code>InputDataConfig.DataSource.S3DataSource.S3Uri</code>.
     *            </p>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * A list of filters. Each filter acts on a property. Filters must contain
     * at least one <code>Filters</code> value. For example, a
     * <code>NestedFilters</code> call might include a filter on the
     * <code>PropertyName</code> parameter of the <code>InputDataConfig</code>
     * property: <code>InputDataConfig.DataSource.S3DataSource.S3Uri</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A list of filters. Each filter acts on a property. Filters
     *            must contain at least one <code>Filters</code> value. For
     *            example, a <code>NestedFilters</code> call might include a
     *            filter on the <code>PropertyName</code> parameter of the
     *            <code>InputDataConfig</code> property:
     *            <code>InputDataConfig.DataSource.S3DataSource.S3Uri</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NestedFilters withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of filters. Each filter acts on a property. Filters must contain
     * at least one <code>Filters</code> value. For example, a
     * <code>NestedFilters</code> call might include a filter on the
     * <code>PropertyName</code> parameter of the <code>InputDataConfig</code>
     * property: <code>InputDataConfig.DataSource.S3DataSource.S3Uri</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A list of filters. Each filter acts on a property. Filters
     *            must contain at least one <code>Filters</code> value. For
     *            example, a <code>NestedFilters</code> call might include a
     *            filter on the <code>PropertyName</code> parameter of the
     *            <code>InputDataConfig</code> property:
     *            <code>InputDataConfig.DataSource.S3DataSource.S3Uri</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NestedFilters withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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
        if (getNestedPropertyName() != null)
            sb.append("NestedPropertyName: " + getNestedPropertyName() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNestedPropertyName() == null) ? 0 : getNestedPropertyName().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NestedFilters == false)
            return false;
        NestedFilters other = (NestedFilters) obj;

        if (other.getNestedPropertyName() == null ^ this.getNestedPropertyName() == null)
            return false;
        if (other.getNestedPropertyName() != null
                && other.getNestedPropertyName().equals(this.getNestedPropertyName()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }
}
