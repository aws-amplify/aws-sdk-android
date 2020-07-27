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
 * <p>One or more aggregators for viewing counts of OpsItems using different dimensions such as <code>Source</code>, <code>CreatedTime</code>, or <code>Source and CreatedTime</code>, to name a few.</p>
 */
public class OpsAggregator implements Serializable {
    /**
     * <p>Either a Range or Count aggregator for limiting an OpsItem summary.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>^(range|count|sum)<br/>
     */
    private String aggregatorType;

    /**
     * <p>The data type name to use for viewing counts of OpsItems.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     */
    private String typeName;

    /**
     * <p>The name of an OpsItem attribute on which to limit the count of OpsItems.</p>
     */
    private String attributeName;

    /**
     * <p>The aggregator value.</p>
     */
    private java.util.Map<String, String> values;

    /**
     * <p>The aggregator filters.</p>
     */
    private java.util.List<OpsFilter> filters;

    /**
     * <p>A nested aggregator for viewing counts of OpsItems.</p>
     */
    private java.util.List<OpsAggregator> aggregators;

    /**
     * <p>Either a Range or Count aggregator for limiting an OpsItem summary.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>^(range|count|sum)<br/>
     *
     * @return <p>Either a Range or Count aggregator for limiting an OpsItem summary.</p>
     */
    public String getAggregatorType() {
        return aggregatorType;
    }

    /**
     * <p>Either a Range or Count aggregator for limiting an OpsItem summary.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>^(range|count|sum)<br/>
     *
     * @param aggregatorType <p>Either a Range or Count aggregator for limiting an OpsItem summary.</p>
     */
    public void setAggregatorType(String aggregatorType) {
        this.aggregatorType = aggregatorType;
    }

    /**
     * <p>Either a Range or Count aggregator for limiting an OpsItem summary.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>^(range|count|sum)<br/>
     *
     * @param aggregatorType <p>Either a Range or Count aggregator for limiting an OpsItem summary.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsAggregator withAggregatorType(String aggregatorType) {
        this.aggregatorType = aggregatorType;
        return this;
    }

    /**
     * <p>The data type name to use for viewing counts of OpsItems.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @return <p>The data type name to use for viewing counts of OpsItems.</p>
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * <p>The data type name to use for viewing counts of OpsItems.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @param typeName <p>The data type name to use for viewing counts of OpsItems.</p>
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>The data type name to use for viewing counts of OpsItems.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @param typeName <p>The data type name to use for viewing counts of OpsItems.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsAggregator withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * <p>The name of an OpsItem attribute on which to limit the count of OpsItems.</p>
     *
     * @return <p>The name of an OpsItem attribute on which to limit the count of OpsItems.</p>
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * <p>The name of an OpsItem attribute on which to limit the count of OpsItems.</p>
     *
     * @param attributeName <p>The name of an OpsItem attribute on which to limit the count of OpsItems.</p>
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>The name of an OpsItem attribute on which to limit the count of OpsItems.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeName <p>The name of an OpsItem attribute on which to limit the count of OpsItems.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsAggregator withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * <p>The aggregator value.</p>
     *
     * @return <p>The aggregator value.</p>
     */
    public java.util.Map<String, String> getValues() {
        return values;
    }

    /**
     * <p>The aggregator value.</p>
     *
     * @param values <p>The aggregator value.</p>
     */
    public void setValues(java.util.Map<String, String> values) {
        this.values = values;
    }

    /**
     * <p>The aggregator value.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values <p>The aggregator value.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsAggregator withValues(java.util.Map<String, String> values) {
        this.values = values;
        return this;
    }

    /**
     * <p>The aggregator value.</p>
     * <p>
     * The method adds a new key-value pair into Values parameter, and returns a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Values.
     * @param value The corresponding value of the entry to be added into Values.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsAggregator addValuesEntry(String key, String value) {
        if (null == this.values) {
            this.values = new java.util.HashMap<String, String>();
        }
        if (this.values.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.values.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public OpsAggregator clearValuesEntries() {
        this.values = null;
        return this;
    }

    /**
     * <p>The aggregator filters.</p>
     *
     * @return <p>The aggregator filters.</p>
     */
    public java.util.List<OpsFilter> getFilters() {
        return filters;
    }

    /**
     * <p>The aggregator filters.</p>
     *
     * @param filters <p>The aggregator filters.</p>
     */
    public void setFilters(java.util.Collection<OpsFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<OpsFilter>(filters);
    }

    /**
     * <p>The aggregator filters.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>The aggregator filters.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsAggregator withFilters(OpsFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<OpsFilter>(filters.length);
        }
        for (OpsFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>The aggregator filters.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>The aggregator filters.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsAggregator withFilters(java.util.Collection<OpsFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>A nested aggregator for viewing counts of OpsItems.</p>
     *
     * @return <p>A nested aggregator for viewing counts of OpsItems.</p>
     */
    public java.util.List<OpsAggregator> getAggregators() {
        return aggregators;
    }

    /**
     * <p>A nested aggregator for viewing counts of OpsItems.</p>
     *
     * @param aggregators <p>A nested aggregator for viewing counts of OpsItems.</p>
     */
    public void setAggregators(java.util.Collection<OpsAggregator> aggregators) {
        if (aggregators == null) {
            this.aggregators = null;
            return;
        }

        this.aggregators = new java.util.ArrayList<OpsAggregator>(aggregators);
    }

    /**
     * <p>A nested aggregator for viewing counts of OpsItems.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aggregators <p>A nested aggregator for viewing counts of OpsItems.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsAggregator withAggregators(OpsAggregator... aggregators) {
        if (getAggregators() == null) {
            this.aggregators = new java.util.ArrayList<OpsAggregator>(aggregators.length);
        }
        for (OpsAggregator value : aggregators) {
            this.aggregators.add(value);
        }
        return this;
    }

    /**
     * <p>A nested aggregator for viewing counts of OpsItems.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aggregators <p>A nested aggregator for viewing counts of OpsItems.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public OpsAggregator withAggregators(java.util.Collection<OpsAggregator> aggregators) {
        setAggregators(aggregators);
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
        if (getAggregatorType() != null) sb.append("AggregatorType: " + getAggregatorType() + ",");
        if (getTypeName() != null) sb.append("TypeName: " + getTypeName() + ",");
        if (getAttributeName() != null) sb.append("AttributeName: " + getAttributeName() + ",");
        if (getValues() != null) sb.append("Values: " + getValues() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getAggregators() != null) sb.append("Aggregators: " + getAggregators());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAggregatorType() == null) ? 0 : getAggregatorType().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getAggregators() == null) ? 0 : getAggregators().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof OpsAggregator == false) return false;
        OpsAggregator other = (OpsAggregator)obj;

        if (other.getAggregatorType() == null ^ this.getAggregatorType() == null) return false;
        if (other.getAggregatorType() != null && other.getAggregatorType().equals(this.getAggregatorType()) == false) return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null) return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false) return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null) return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false) return false;
        if (other.getValues() == null ^ this.getValues() == null) return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false) return false;
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false;
        if (other.getAggregators() == null ^ this.getAggregators() == null) return false;
        if (other.getAggregators() != null && other.getAggregators().equals(this.getAggregators()) == false) return false;
        return true;
    }
}
