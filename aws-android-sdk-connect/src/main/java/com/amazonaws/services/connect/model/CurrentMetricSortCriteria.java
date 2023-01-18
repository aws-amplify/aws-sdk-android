/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The way to sort the resulting response based on metrics. By default resources
 * are sorted based on <code>AGENTS_ONLINE</code>, <code>DESCENDING</code>. The
 * metric collection is sorted based on the input metrics.
 * </p>
 */
public class CurrentMetricSortCriteria implements Serializable {
    /**
     * <p>
     * The current metric names.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENTS_ONLINE, AGENTS_AVAILABLE, AGENTS_ON_CALL,
     * AGENTS_NON_PRODUCTIVE, AGENTS_AFTER_CONTACT_WORK, AGENTS_ERROR,
     * AGENTS_STAFFED, CONTACTS_IN_QUEUE, OLDEST_CONTACT_AGE,
     * CONTACTS_SCHEDULED, AGENTS_ON_CONTACT, SLOTS_ACTIVE, SLOTS_AVAILABLE
     */
    private String sortByMetric;

    /**
     * <p>
     * The way to sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     */
    private String sortOrder;

    /**
     * <p>
     * The current metric names.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENTS_ONLINE, AGENTS_AVAILABLE, AGENTS_ON_CALL,
     * AGENTS_NON_PRODUCTIVE, AGENTS_AFTER_CONTACT_WORK, AGENTS_ERROR,
     * AGENTS_STAFFED, CONTACTS_IN_QUEUE, OLDEST_CONTACT_AGE,
     * CONTACTS_SCHEDULED, AGENTS_ON_CONTACT, SLOTS_ACTIVE, SLOTS_AVAILABLE
     *
     * @return <p>
     *         The current metric names.
     *         </p>
     * @see CurrentMetricName
     */
    public String getSortByMetric() {
        return sortByMetric;
    }

    /**
     * <p>
     * The current metric names.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENTS_ONLINE, AGENTS_AVAILABLE, AGENTS_ON_CALL,
     * AGENTS_NON_PRODUCTIVE, AGENTS_AFTER_CONTACT_WORK, AGENTS_ERROR,
     * AGENTS_STAFFED, CONTACTS_IN_QUEUE, OLDEST_CONTACT_AGE,
     * CONTACTS_SCHEDULED, AGENTS_ON_CONTACT, SLOTS_ACTIVE, SLOTS_AVAILABLE
     *
     * @param sortByMetric <p>
     *            The current metric names.
     *            </p>
     * @see CurrentMetricName
     */
    public void setSortByMetric(String sortByMetric) {
        this.sortByMetric = sortByMetric;
    }

    /**
     * <p>
     * The current metric names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENTS_ONLINE, AGENTS_AVAILABLE, AGENTS_ON_CALL,
     * AGENTS_NON_PRODUCTIVE, AGENTS_AFTER_CONTACT_WORK, AGENTS_ERROR,
     * AGENTS_STAFFED, CONTACTS_IN_QUEUE, OLDEST_CONTACT_AGE,
     * CONTACTS_SCHEDULED, AGENTS_ON_CONTACT, SLOTS_ACTIVE, SLOTS_AVAILABLE
     *
     * @param sortByMetric <p>
     *            The current metric names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CurrentMetricName
     */
    public CurrentMetricSortCriteria withSortByMetric(String sortByMetric) {
        this.sortByMetric = sortByMetric;
        return this;
    }

    /**
     * <p>
     * The current metric names.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENTS_ONLINE, AGENTS_AVAILABLE, AGENTS_ON_CALL,
     * AGENTS_NON_PRODUCTIVE, AGENTS_AFTER_CONTACT_WORK, AGENTS_ERROR,
     * AGENTS_STAFFED, CONTACTS_IN_QUEUE, OLDEST_CONTACT_AGE,
     * CONTACTS_SCHEDULED, AGENTS_ON_CONTACT, SLOTS_ACTIVE, SLOTS_AVAILABLE
     *
     * @param sortByMetric <p>
     *            The current metric names.
     *            </p>
     * @see CurrentMetricName
     */
    public void setSortByMetric(CurrentMetricName sortByMetric) {
        this.sortByMetric = sortByMetric.toString();
    }

    /**
     * <p>
     * The current metric names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENTS_ONLINE, AGENTS_AVAILABLE, AGENTS_ON_CALL,
     * AGENTS_NON_PRODUCTIVE, AGENTS_AFTER_CONTACT_WORK, AGENTS_ERROR,
     * AGENTS_STAFFED, CONTACTS_IN_QUEUE, OLDEST_CONTACT_AGE,
     * CONTACTS_SCHEDULED, AGENTS_ON_CONTACT, SLOTS_ACTIVE, SLOTS_AVAILABLE
     *
     * @param sortByMetric <p>
     *            The current metric names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CurrentMetricName
     */
    public CurrentMetricSortCriteria withSortByMetric(CurrentMetricName sortByMetric) {
        this.sortByMetric = sortByMetric.toString();
        return this;
    }

    /**
     * <p>
     * The way to sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @return <p>
     *         The way to sort.
     *         </p>
     * @see SortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * The way to sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The way to sort.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The way to sort.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The way to sort.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public CurrentMetricSortCriteria withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * The way to sort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The way to sort.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * The way to sort.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The way to sort.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public CurrentMetricSortCriteria withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getSortByMetric() != null)
            sb.append("SortByMetric: " + getSortByMetric() + ",");
        if (getSortOrder() != null)
            sb.append("SortOrder: " + getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSortByMetric() == null) ? 0 : getSortByMetric().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CurrentMetricSortCriteria == false)
            return false;
        CurrentMetricSortCriteria other = (CurrentMetricSortCriteria) obj;

        if (other.getSortByMetric() == null ^ this.getSortByMetric() == null)
            return false;
        if (other.getSortByMetric() != null
                && other.getSortByMetric().equals(this.getSortByMetric()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null
                && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }
}
