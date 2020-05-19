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

package com.amazonaws.services.health.model;

import java.io.Serializable;

/**
 * <p>
 * The number of events of each issue type. Returned by the
 * <a>DescribeEventAggregates</a> operation.
 * </p>
 */
public class EventAggregate implements Serializable {
    /**
     * <p>
     * The issue type for the associated count.
     * </p>
     */
    private String aggregateValue;

    /**
     * <p>
     * The number of events of the associated issue type.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The issue type for the associated count.
     * </p>
     *
     * @return <p>
     *         The issue type for the associated count.
     *         </p>
     */
    public String getAggregateValue() {
        return aggregateValue;
    }

    /**
     * <p>
     * The issue type for the associated count.
     * </p>
     *
     * @param aggregateValue <p>
     *            The issue type for the associated count.
     *            </p>
     */
    public void setAggregateValue(String aggregateValue) {
        this.aggregateValue = aggregateValue;
    }

    /**
     * <p>
     * The issue type for the associated count.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aggregateValue <p>
     *            The issue type for the associated count.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventAggregate withAggregateValue(String aggregateValue) {
        this.aggregateValue = aggregateValue;
        return this;
    }

    /**
     * <p>
     * The number of events of the associated issue type.
     * </p>
     *
     * @return <p>
     *         The number of events of the associated issue type.
     *         </p>
     */
    public Integer getCount() {
        return count;
    }

    /**
     * <p>
     * The number of events of the associated issue type.
     * </p>
     *
     * @param count <p>
     *            The number of events of the associated issue type.
     *            </p>
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of events of the associated issue type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The number of events of the associated issue type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventAggregate withCount(Integer count) {
        this.count = count;
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
        if (getAggregateValue() != null)
            sb.append("aggregateValue: " + getAggregateValue() + ",");
        if (getCount() != null)
            sb.append("count: " + getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAggregateValue() == null) ? 0 : getAggregateValue().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventAggregate == false)
            return false;
        EventAggregate other = (EventAggregate) obj;

        if (other.getAggregateValue() == null ^ this.getAggregateValue() == null)
            return false;
        if (other.getAggregateValue() != null
                && other.getAggregateValue().equals(this.getAggregateValue()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }
}
