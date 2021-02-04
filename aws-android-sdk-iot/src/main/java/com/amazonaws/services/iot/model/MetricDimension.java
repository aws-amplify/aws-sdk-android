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
 * The dimension of a metric.
 * </p>
 */
public class MetricDimension implements Serializable {
    /**
     * <p>
     * A unique identifier for the dimension.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String dimensionName;

    /**
     * <p>
     * Defines how the <code>dimensionValues</code> of a dimension are
     * interpreted. For example, for dimension type TOPIC_FILTER, the
     * <code>IN</code> operator, a message will be counted only if its topic
     * matches one of the topic filters. With <code>NOT_IN</code> operator, a
     * message will be counted only if it doesn't match any of the topic
     * filters. The operator is optional: if it's not provided (is
     * <code>null</code>), it will be interpreted as <code>IN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN, NOT_IN
     */
    private String operator;

    /**
     * <p>
     * A unique identifier for the dimension.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         A unique identifier for the dimension.
     *         </p>
     */
    public String getDimensionName() {
        return dimensionName;
    }

    /**
     * <p>
     * A unique identifier for the dimension.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param dimensionName <p>
     *            A unique identifier for the dimension.
     *            </p>
     */
    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    /**
     * <p>
     * A unique identifier for the dimension.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param dimensionName <p>
     *            A unique identifier for the dimension.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricDimension withDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
        return this;
    }

    /**
     * <p>
     * Defines how the <code>dimensionValues</code> of a dimension are
     * interpreted. For example, for dimension type TOPIC_FILTER, the
     * <code>IN</code> operator, a message will be counted only if its topic
     * matches one of the topic filters. With <code>NOT_IN</code> operator, a
     * message will be counted only if it doesn't match any of the topic
     * filters. The operator is optional: if it's not provided (is
     * <code>null</code>), it will be interpreted as <code>IN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN, NOT_IN
     *
     * @return <p>
     *         Defines how the <code>dimensionValues</code> of a dimension are
     *         interpreted. For example, for dimension type TOPIC_FILTER, the
     *         <code>IN</code> operator, a message will be counted only if its
     *         topic matches one of the topic filters. With <code>NOT_IN</code>
     *         operator, a message will be counted only if it doesn't match any
     *         of the topic filters. The operator is optional: if it's not
     *         provided (is <code>null</code>), it will be interpreted as
     *         <code>IN</code>.
     *         </p>
     * @see DimensionValueOperator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * <p>
     * Defines how the <code>dimensionValues</code> of a dimension are
     * interpreted. For example, for dimension type TOPIC_FILTER, the
     * <code>IN</code> operator, a message will be counted only if its topic
     * matches one of the topic filters. With <code>NOT_IN</code> operator, a
     * message will be counted only if it doesn't match any of the topic
     * filters. The operator is optional: if it's not provided (is
     * <code>null</code>), it will be interpreted as <code>IN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN, NOT_IN
     *
     * @param operator <p>
     *            Defines how the <code>dimensionValues</code> of a dimension
     *            are interpreted. For example, for dimension type TOPIC_FILTER,
     *            the <code>IN</code> operator, a message will be counted only
     *            if its topic matches one of the topic filters. With
     *            <code>NOT_IN</code> operator, a message will be counted only
     *            if it doesn't match any of the topic filters. The operator is
     *            optional: if it's not provided (is <code>null</code>), it will
     *            be interpreted as <code>IN</code>.
     *            </p>
     * @see DimensionValueOperator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * Defines how the <code>dimensionValues</code> of a dimension are
     * interpreted. For example, for dimension type TOPIC_FILTER, the
     * <code>IN</code> operator, a message will be counted only if its topic
     * matches one of the topic filters. With <code>NOT_IN</code> operator, a
     * message will be counted only if it doesn't match any of the topic
     * filters. The operator is optional: if it's not provided (is
     * <code>null</code>), it will be interpreted as <code>IN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN, NOT_IN
     *
     * @param operator <p>
     *            Defines how the <code>dimensionValues</code> of a dimension
     *            are interpreted. For example, for dimension type TOPIC_FILTER,
     *            the <code>IN</code> operator, a message will be counted only
     *            if its topic matches one of the topic filters. With
     *            <code>NOT_IN</code> operator, a message will be counted only
     *            if it doesn't match any of the topic filters. The operator is
     *            optional: if it's not provided (is <code>null</code>), it will
     *            be interpreted as <code>IN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DimensionValueOperator
     */
    public MetricDimension withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * <p>
     * Defines how the <code>dimensionValues</code> of a dimension are
     * interpreted. For example, for dimension type TOPIC_FILTER, the
     * <code>IN</code> operator, a message will be counted only if its topic
     * matches one of the topic filters. With <code>NOT_IN</code> operator, a
     * message will be counted only if it doesn't match any of the topic
     * filters. The operator is optional: if it's not provided (is
     * <code>null</code>), it will be interpreted as <code>IN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN, NOT_IN
     *
     * @param operator <p>
     *            Defines how the <code>dimensionValues</code> of a dimension
     *            are interpreted. For example, for dimension type TOPIC_FILTER,
     *            the <code>IN</code> operator, a message will be counted only
     *            if its topic matches one of the topic filters. With
     *            <code>NOT_IN</code> operator, a message will be counted only
     *            if it doesn't match any of the topic filters. The operator is
     *            optional: if it's not provided (is <code>null</code>), it will
     *            be interpreted as <code>IN</code>.
     *            </p>
     * @see DimensionValueOperator
     */
    public void setOperator(DimensionValueOperator operator) {
        this.operator = operator.toString();
    }

    /**
     * <p>
     * Defines how the <code>dimensionValues</code> of a dimension are
     * interpreted. For example, for dimension type TOPIC_FILTER, the
     * <code>IN</code> operator, a message will be counted only if its topic
     * matches one of the topic filters. With <code>NOT_IN</code> operator, a
     * message will be counted only if it doesn't match any of the topic
     * filters. The operator is optional: if it's not provided (is
     * <code>null</code>), it will be interpreted as <code>IN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN, NOT_IN
     *
     * @param operator <p>
     *            Defines how the <code>dimensionValues</code> of a dimension
     *            are interpreted. For example, for dimension type TOPIC_FILTER,
     *            the <code>IN</code> operator, a message will be counted only
     *            if its topic matches one of the topic filters. With
     *            <code>NOT_IN</code> operator, a message will be counted only
     *            if it doesn't match any of the topic filters. The operator is
     *            optional: if it's not provided (is <code>null</code>), it will
     *            be interpreted as <code>IN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DimensionValueOperator
     */
    public MetricDimension withOperator(DimensionValueOperator operator) {
        this.operator = operator.toString();
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
        if (getDimensionName() != null)
            sb.append("dimensionName: " + getDimensionName() + ",");
        if (getOperator() != null)
            sb.append("operator: " + getOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDimensionName() == null) ? 0 : getDimensionName().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDimension == false)
            return false;
        MetricDimension other = (MetricDimension) obj;

        if (other.getDimensionName() == null ^ this.getDimensionName() == null)
            return false;
        if (other.getDimensionName() != null
                && other.getDimensionName().equals(this.getDimensionName()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        return true;
    }
}
