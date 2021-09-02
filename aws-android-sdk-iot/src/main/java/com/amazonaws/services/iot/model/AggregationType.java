/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The type of aggregation queries.
 * </p>
 */
public class AggregationType implements Serializable {
    /**
     * <p>
     * The name of the aggregation type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Statistics, Percentiles, Cardinality
     */
    private String name;

    /**
     * <p>
     * A list of the values of aggregation types.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name of the aggregation type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Statistics, Percentiles, Cardinality
     *
     * @return <p>
     *         The name of the aggregation type.
     *         </p>
     * @see AggregationTypeName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the aggregation type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Statistics, Percentiles, Cardinality
     *
     * @param name <p>
     *            The name of the aggregation type.
     *            </p>
     * @see AggregationTypeName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the aggregation type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Statistics, Percentiles, Cardinality
     *
     * @param name <p>
     *            The name of the aggregation type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AggregationTypeName
     */
    public AggregationType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The name of the aggregation type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Statistics, Percentiles, Cardinality
     *
     * @param name <p>
     *            The name of the aggregation type.
     *            </p>
     * @see AggregationTypeName
     */
    public void setName(AggregationTypeName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The name of the aggregation type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Statistics, Percentiles, Cardinality
     *
     * @param name <p>
     *            The name of the aggregation type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AggregationTypeName
     */
    public AggregationType withName(AggregationTypeName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * A list of the values of aggregation types.
     * </p>
     *
     * @return <p>
     *         A list of the values of aggregation types.
     *         </p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * A list of the values of aggregation types.
     * </p>
     *
     * @param values <p>
     *            A list of the values of aggregation types.
     *            </p>
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * A list of the values of aggregation types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            A list of the values of aggregation types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AggregationType withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the values of aggregation types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            A list of the values of aggregation types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AggregationType withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getValues() != null)
            sb.append("values: " + getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregationType == false)
            return false;
        AggregationType other = (AggregationType) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }
}
