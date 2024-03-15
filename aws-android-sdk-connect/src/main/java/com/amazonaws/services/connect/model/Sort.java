/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * A structure that defineds the field name to sort by and a sort order.
 * </p>
 */
public class Sort implements Serializable {
    /**
     * <p>
     * The name of the field on which to sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIATION_TIMESTAMP, SCHEDULED_TIMESTAMP,
     * CONNECTED_TO_AGENT_TIMESTAMP, DISCONNECT_TIMESTAMP, INITIATION_METHOD,
     * CHANNEL
     */
    private String fieldName;

    /**
     * <p>
     * An ascending or descending sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     */
    private String order;

    /**
     * <p>
     * The name of the field on which to sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIATION_TIMESTAMP, SCHEDULED_TIMESTAMP,
     * CONNECTED_TO_AGENT_TIMESTAMP, DISCONNECT_TIMESTAMP, INITIATION_METHOD,
     * CHANNEL
     *
     * @return <p>
     *         The name of the field on which to sort.
     *         </p>
     * @see SortableFieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * <p>
     * The name of the field on which to sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIATION_TIMESTAMP, SCHEDULED_TIMESTAMP,
     * CONNECTED_TO_AGENT_TIMESTAMP, DISCONNECT_TIMESTAMP, INITIATION_METHOD,
     * CHANNEL
     *
     * @param fieldName <p>
     *            The name of the field on which to sort.
     *            </p>
     * @see SortableFieldName
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * <p>
     * The name of the field on which to sort.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIATION_TIMESTAMP, SCHEDULED_TIMESTAMP,
     * CONNECTED_TO_AGENT_TIMESTAMP, DISCONNECT_TIMESTAMP, INITIATION_METHOD,
     * CHANNEL
     *
     * @param fieldName <p>
     *            The name of the field on which to sort.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortableFieldName
     */
    public Sort withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * <p>
     * The name of the field on which to sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIATION_TIMESTAMP, SCHEDULED_TIMESTAMP,
     * CONNECTED_TO_AGENT_TIMESTAMP, DISCONNECT_TIMESTAMP, INITIATION_METHOD,
     * CHANNEL
     *
     * @param fieldName <p>
     *            The name of the field on which to sort.
     *            </p>
     * @see SortableFieldName
     */
    public void setFieldName(SortableFieldName fieldName) {
        this.fieldName = fieldName.toString();
    }

    /**
     * <p>
     * The name of the field on which to sort.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIATION_TIMESTAMP, SCHEDULED_TIMESTAMP,
     * CONNECTED_TO_AGENT_TIMESTAMP, DISCONNECT_TIMESTAMP, INITIATION_METHOD,
     * CHANNEL
     *
     * @param fieldName <p>
     *            The name of the field on which to sort.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortableFieldName
     */
    public Sort withFieldName(SortableFieldName fieldName) {
        this.fieldName = fieldName.toString();
        return this;
    }

    /**
     * <p>
     * An ascending or descending sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @return <p>
     *         An ascending or descending sort.
     *         </p>
     * @see SortOrder
     */
    public String getOrder() {
        return order;
    }

    /**
     * <p>
     * An ascending or descending sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param order <p>
     *            An ascending or descending sort.
     *            </p>
     * @see SortOrder
     */
    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * <p>
     * An ascending or descending sort.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param order <p>
     *            An ascending or descending sort.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public Sort withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * <p>
     * An ascending or descending sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param order <p>
     *            An ascending or descending sort.
     *            </p>
     * @see SortOrder
     */
    public void setOrder(SortOrder order) {
        this.order = order.toString();
    }

    /**
     * <p>
     * An ascending or descending sort.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param order <p>
     *            An ascending or descending sort.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public Sort withOrder(SortOrder order) {
        this.order = order.toString();
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
        if (getFieldName() != null)
            sb.append("FieldName: " + getFieldName() + ",");
        if (getOrder() != null)
            sb.append("Order: " + getOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldName() == null) ? 0 : getFieldName().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Sort == false)
            return false;
        Sort other = (Sort) obj;

        if (other.getFieldName() == null ^ this.getFieldName() == null)
            return false;
        if (other.getFieldName() != null
                && other.getFieldName().equals(this.getFieldName()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        return true;
    }
}
