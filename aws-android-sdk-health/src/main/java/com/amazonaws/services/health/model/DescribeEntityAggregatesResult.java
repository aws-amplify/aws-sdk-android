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

public class DescribeEntityAggregatesResult implements Serializable {
    /**
     * <p>
     * The number of entities that are affected by each of the specified events.
     * </p>
     */
    private java.util.List<EntityAggregate> entityAggregates;

    /**
     * <p>
     * The number of entities that are affected by each of the specified events.
     * </p>
     *
     * @return <p>
     *         The number of entities that are affected by each of the specified
     *         events.
     *         </p>
     */
    public java.util.List<EntityAggregate> getEntityAggregates() {
        return entityAggregates;
    }

    /**
     * <p>
     * The number of entities that are affected by each of the specified events.
     * </p>
     *
     * @param entityAggregates <p>
     *            The number of entities that are affected by each of the
     *            specified events.
     *            </p>
     */
    public void setEntityAggregates(java.util.Collection<EntityAggregate> entityAggregates) {
        if (entityAggregates == null) {
            this.entityAggregates = null;
            return;
        }

        this.entityAggregates = new java.util.ArrayList<EntityAggregate>(entityAggregates);
    }

    /**
     * <p>
     * The number of entities that are affected by each of the specified events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityAggregates <p>
     *            The number of entities that are affected by each of the
     *            specified events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEntityAggregatesResult withEntityAggregates(EntityAggregate... entityAggregates) {
        if (getEntityAggregates() == null) {
            this.entityAggregates = new java.util.ArrayList<EntityAggregate>(
                    entityAggregates.length);
        }
        for (EntityAggregate value : entityAggregates) {
            this.entityAggregates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The number of entities that are affected by each of the specified events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityAggregates <p>
     *            The number of entities that are affected by each of the
     *            specified events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEntityAggregatesResult withEntityAggregates(
            java.util.Collection<EntityAggregate> entityAggregates) {
        setEntityAggregates(entityAggregates);
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
        if (getEntityAggregates() != null)
            sb.append("entityAggregates: " + getEntityAggregates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEntityAggregates() == null) ? 0 : getEntityAggregates().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEntityAggregatesResult == false)
            return false;
        DescribeEntityAggregatesResult other = (DescribeEntityAggregatesResult) obj;

        if (other.getEntityAggregates() == null ^ this.getEntityAggregates() == null)
            return false;
        if (other.getEntityAggregates() != null
                && other.getEntityAggregates().equals(this.getEntityAggregates()) == false)
            return false;
        return true;
    }
}
