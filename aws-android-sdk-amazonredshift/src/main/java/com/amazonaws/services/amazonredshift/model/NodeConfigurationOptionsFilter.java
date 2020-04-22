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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * A set of elements to filter the returned node configurations.
 * </p>
 */
public class NodeConfigurationOptionsFilter implements Serializable {
    /**
     * <p>
     * The name of the element to filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NodeType, NumberOfNodes,
     * EstimatedDiskUtilizationPercent, Mode
     */
    private String name;

    /**
     * <p>
     * The filter operator. If filter Name is NodeType only the 'in' operator is
     * supported. Provide one value to evaluate for 'eq', 'lt', 'le', 'gt', and
     * 'ge'. Provide two values to evaluate for 'between'. Provide a list of
     * values for 'in'.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>eq, lt, gt, le, ge, in, between
     */
    private String operator;

    /**
     * <p>
     * List of values. Compare Name using Operator to Values. If filter Name is
     * NumberOfNodes, then values can range from 0 to 200. If filter Name is
     * EstimatedDiskUtilizationPercent, then values can range from 0 to 100. For
     * example, filter NumberOfNodes (name) GT (operator) 3 (values).
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name of the element to filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NodeType, NumberOfNodes,
     * EstimatedDiskUtilizationPercent, Mode
     *
     * @return <p>
     *         The name of the element to filter.
     *         </p>
     * @see NodeConfigurationOptionsFilterName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the element to filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NodeType, NumberOfNodes,
     * EstimatedDiskUtilizationPercent, Mode
     *
     * @param name <p>
     *            The name of the element to filter.
     *            </p>
     * @see NodeConfigurationOptionsFilterName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the element to filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NodeType, NumberOfNodes,
     * EstimatedDiskUtilizationPercent, Mode
     *
     * @param name <p>
     *            The name of the element to filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NodeConfigurationOptionsFilterName
     */
    public NodeConfigurationOptionsFilter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The name of the element to filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NodeType, NumberOfNodes,
     * EstimatedDiskUtilizationPercent, Mode
     *
     * @param name <p>
     *            The name of the element to filter.
     *            </p>
     * @see NodeConfigurationOptionsFilterName
     */
    public void setName(NodeConfigurationOptionsFilterName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The name of the element to filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NodeType, NumberOfNodes,
     * EstimatedDiskUtilizationPercent, Mode
     *
     * @param name <p>
     *            The name of the element to filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NodeConfigurationOptionsFilterName
     */
    public NodeConfigurationOptionsFilter withName(NodeConfigurationOptionsFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The filter operator. If filter Name is NodeType only the 'in' operator is
     * supported. Provide one value to evaluate for 'eq', 'lt', 'le', 'gt', and
     * 'ge'. Provide two values to evaluate for 'between'. Provide a list of
     * values for 'in'.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>eq, lt, gt, le, ge, in, between
     *
     * @return <p>
     *         The filter operator. If filter Name is NodeType only the 'in'
     *         operator is supported. Provide one value to evaluate for 'eq',
     *         'lt', 'le', 'gt', and 'ge'. Provide two values to evaluate for
     *         'between'. Provide a list of values for 'in'.
     *         </p>
     * @see OperatorType
     */
    public String getOperator() {
        return operator;
    }

    /**
     * <p>
     * The filter operator. If filter Name is NodeType only the 'in' operator is
     * supported. Provide one value to evaluate for 'eq', 'lt', 'le', 'gt', and
     * 'ge'. Provide two values to evaluate for 'between'. Provide a list of
     * values for 'in'.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>eq, lt, gt, le, ge, in, between
     *
     * @param operator <p>
     *            The filter operator. If filter Name is NodeType only the 'in'
     *            operator is supported. Provide one value to evaluate for 'eq',
     *            'lt', 'le', 'gt', and 'ge'. Provide two values to evaluate for
     *            'between'. Provide a list of values for 'in'.
     *            </p>
     * @see OperatorType
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The filter operator. If filter Name is NodeType only the 'in' operator is
     * supported. Provide one value to evaluate for 'eq', 'lt', 'le', 'gt', and
     * 'ge'. Provide two values to evaluate for 'between'. Provide a list of
     * values for 'in'.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>eq, lt, gt, le, ge, in, between
     *
     * @param operator <p>
     *            The filter operator. If filter Name is NodeType only the 'in'
     *            operator is supported. Provide one value to evaluate for 'eq',
     *            'lt', 'le', 'gt', and 'ge'. Provide two values to evaluate for
     *            'between'. Provide a list of values for 'in'.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperatorType
     */
    public NodeConfigurationOptionsFilter withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * <p>
     * The filter operator. If filter Name is NodeType only the 'in' operator is
     * supported. Provide one value to evaluate for 'eq', 'lt', 'le', 'gt', and
     * 'ge'. Provide two values to evaluate for 'between'. Provide a list of
     * values for 'in'.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>eq, lt, gt, le, ge, in, between
     *
     * @param operator <p>
     *            The filter operator. If filter Name is NodeType only the 'in'
     *            operator is supported. Provide one value to evaluate for 'eq',
     *            'lt', 'le', 'gt', and 'ge'. Provide two values to evaluate for
     *            'between'. Provide a list of values for 'in'.
     *            </p>
     * @see OperatorType
     */
    public void setOperator(OperatorType operator) {
        this.operator = operator.toString();
    }

    /**
     * <p>
     * The filter operator. If filter Name is NodeType only the 'in' operator is
     * supported. Provide one value to evaluate for 'eq', 'lt', 'le', 'gt', and
     * 'ge'. Provide two values to evaluate for 'between'. Provide a list of
     * values for 'in'.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>eq, lt, gt, le, ge, in, between
     *
     * @param operator <p>
     *            The filter operator. If filter Name is NodeType only the 'in'
     *            operator is supported. Provide one value to evaluate for 'eq',
     *            'lt', 'le', 'gt', and 'ge'. Provide two values to evaluate for
     *            'between'. Provide a list of values for 'in'.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperatorType
     */
    public NodeConfigurationOptionsFilter withOperator(OperatorType operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * List of values. Compare Name using Operator to Values. If filter Name is
     * NumberOfNodes, then values can range from 0 to 200. If filter Name is
     * EstimatedDiskUtilizationPercent, then values can range from 0 to 100. For
     * example, filter NumberOfNodes (name) GT (operator) 3 (values).
     * </p>
     *
     * @return <p>
     *         List of values. Compare Name using Operator to Values. If filter
     *         Name is NumberOfNodes, then values can range from 0 to 200. If
     *         filter Name is EstimatedDiskUtilizationPercent, then values can
     *         range from 0 to 100. For example, filter NumberOfNodes (name) GT
     *         (operator) 3 (values).
     *         </p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * List of values. Compare Name using Operator to Values. If filter Name is
     * NumberOfNodes, then values can range from 0 to 200. If filter Name is
     * EstimatedDiskUtilizationPercent, then values can range from 0 to 100. For
     * example, filter NumberOfNodes (name) GT (operator) 3 (values).
     * </p>
     *
     * @param values <p>
     *            List of values. Compare Name using Operator to Values. If
     *            filter Name is NumberOfNodes, then values can range from 0 to
     *            200. If filter Name is EstimatedDiskUtilizationPercent, then
     *            values can range from 0 to 100. For example, filter
     *            NumberOfNodes (name) GT (operator) 3 (values).
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
     * List of values. Compare Name using Operator to Values. If filter Name is
     * NumberOfNodes, then values can range from 0 to 200. If filter Name is
     * EstimatedDiskUtilizationPercent, then values can range from 0 to 100. For
     * example, filter NumberOfNodes (name) GT (operator) 3 (values).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            List of values. Compare Name using Operator to Values. If
     *            filter Name is NumberOfNodes, then values can range from 0 to
     *            200. If filter Name is EstimatedDiskUtilizationPercent, then
     *            values can range from 0 to 100. For example, filter
     *            NumberOfNodes (name) GT (operator) 3 (values).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeConfigurationOptionsFilter withValues(String... values) {
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
     * List of values. Compare Name using Operator to Values. If filter Name is
     * NumberOfNodes, then values can range from 0 to 200. If filter Name is
     * EstimatedDiskUtilizationPercent, then values can range from 0 to 100. For
     * example, filter NumberOfNodes (name) GT (operator) 3 (values).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            List of values. Compare Name using Operator to Values. If
     *            filter Name is NumberOfNodes, then values can range from 0 to
     *            200. If filter Name is EstimatedDiskUtilizationPercent, then
     *            values can range from 0 to 100. For example, filter
     *            NumberOfNodes (name) GT (operator) 3 (values).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeConfigurationOptionsFilter withValues(java.util.Collection<String> values) {
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
            sb.append("Name: " + getName() + ",");
        if (getOperator() != null)
            sb.append("Operator: " + getOperator() + ",");
        if (getValues() != null)
            sb.append("Values: " + getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeConfigurationOptionsFilter == false)
            return false;
        NodeConfigurationOptionsFilter other = (NodeConfigurationOptionsFilter) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }
}
