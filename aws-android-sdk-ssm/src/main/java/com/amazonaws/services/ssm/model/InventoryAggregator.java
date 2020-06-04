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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the inventory type and attribute for the aggregation execution.
 * </p>
 */
public class InventoryAggregator implements Serializable {
    /**
     * <p>
     * The inventory type and attribute name for aggregation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String expression;

    /**
     * <p>
     * Nested aggregators to further refine aggregation for an inventory type.
     * </p>
     */
    private java.util.List<InventoryAggregator> aggregators;

    /**
     * <p>
     * A user-defined set of one or more filters on which to aggregate inventory
     * data. Groups return a count of resources that match and don't match the
     * specified criteria.
     * </p>
     */
    private java.util.List<InventoryGroup> groups;

    /**
     * <p>
     * The inventory type and attribute name for aggregation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The inventory type and attribute name for aggregation.
     *         </p>
     */
    public String getExpression() {
        return expression;
    }

    /**
     * <p>
     * The inventory type and attribute name for aggregation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param expression <p>
     *            The inventory type and attribute name for aggregation.
     *            </p>
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The inventory type and attribute name for aggregation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param expression <p>
     *            The inventory type and attribute name for aggregation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryAggregator withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * <p>
     * Nested aggregators to further refine aggregation for an inventory type.
     * </p>
     *
     * @return <p>
     *         Nested aggregators to further refine aggregation for an inventory
     *         type.
     *         </p>
     */
    public java.util.List<InventoryAggregator> getAggregators() {
        return aggregators;
    }

    /**
     * <p>
     * Nested aggregators to further refine aggregation for an inventory type.
     * </p>
     *
     * @param aggregators <p>
     *            Nested aggregators to further refine aggregation for an
     *            inventory type.
     *            </p>
     */
    public void setAggregators(java.util.Collection<InventoryAggregator> aggregators) {
        if (aggregators == null) {
            this.aggregators = null;
            return;
        }

        this.aggregators = new java.util.ArrayList<InventoryAggregator>(aggregators);
    }

    /**
     * <p>
     * Nested aggregators to further refine aggregation for an inventory type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aggregators <p>
     *            Nested aggregators to further refine aggregation for an
     *            inventory type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryAggregator withAggregators(InventoryAggregator... aggregators) {
        if (getAggregators() == null) {
            this.aggregators = new java.util.ArrayList<InventoryAggregator>(aggregators.length);
        }
        for (InventoryAggregator value : aggregators) {
            this.aggregators.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Nested aggregators to further refine aggregation for an inventory type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aggregators <p>
     *            Nested aggregators to further refine aggregation for an
     *            inventory type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryAggregator withAggregators(java.util.Collection<InventoryAggregator> aggregators) {
        setAggregators(aggregators);
        return this;
    }

    /**
     * <p>
     * A user-defined set of one or more filters on which to aggregate inventory
     * data. Groups return a count of resources that match and don't match the
     * specified criteria.
     * </p>
     *
     * @return <p>
     *         A user-defined set of one or more filters on which to aggregate
     *         inventory data. Groups return a count of resources that match and
     *         don't match the specified criteria.
     *         </p>
     */
    public java.util.List<InventoryGroup> getGroups() {
        return groups;
    }

    /**
     * <p>
     * A user-defined set of one or more filters on which to aggregate inventory
     * data. Groups return a count of resources that match and don't match the
     * specified criteria.
     * </p>
     *
     * @param groups <p>
     *            A user-defined set of one or more filters on which to
     *            aggregate inventory data. Groups return a count of resources
     *            that match and don't match the specified criteria.
     *            </p>
     */
    public void setGroups(java.util.Collection<InventoryGroup> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<InventoryGroup>(groups);
    }

    /**
     * <p>
     * A user-defined set of one or more filters on which to aggregate inventory
     * data. Groups return a count of resources that match and don't match the
     * specified criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            A user-defined set of one or more filters on which to
     *            aggregate inventory data. Groups return a count of resources
     *            that match and don't match the specified criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryAggregator withGroups(InventoryGroup... groups) {
        if (getGroups() == null) {
            this.groups = new java.util.ArrayList<InventoryGroup>(groups.length);
        }
        for (InventoryGroup value : groups) {
            this.groups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A user-defined set of one or more filters on which to aggregate inventory
     * data. Groups return a count of resources that match and don't match the
     * specified criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            A user-defined set of one or more filters on which to
     *            aggregate inventory data. Groups return a count of resources
     *            that match and don't match the specified criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryAggregator withGroups(java.util.Collection<InventoryGroup> groups) {
        setGroups(groups);
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
        if (getExpression() != null)
            sb.append("Expression: " + getExpression() + ",");
        if (getAggregators() != null)
            sb.append("Aggregators: " + getAggregators() + ",");
        if (getGroups() != null)
            sb.append("Groups: " + getGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode
                + ((getAggregators() == null) ? 0 : getAggregators().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryAggregator == false)
            return false;
        InventoryAggregator other = (InventoryAggregator) obj;

        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null
                && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getAggregators() == null ^ this.getAggregators() == null)
            return false;
        if (other.getAggregators() != null
                && other.getAggregators().equals(this.getAggregators()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        return true;
    }
}
