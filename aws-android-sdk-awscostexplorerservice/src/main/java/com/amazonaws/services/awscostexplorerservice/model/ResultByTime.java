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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

/**
 * <p>
 * The result that is associated with a time period.
 * </p>
 */
public class ResultByTime implements Serializable {
    /**
     * <p>
     * The time period that the result covers.
     * </p>
     */
    private DateInterval timePeriod;

    /**
     * <p>
     * The total amount of cost or usage accrued during the time period.
     * </p>
     */
    private java.util.Map<String, MetricValue> total;

    /**
     * <p>
     * The groups that this time period includes.
     * </p>
     */
    private java.util.List<Group> groups;

    /**
     * <p>
     * Whether the result is estimated.
     * </p>
     */
    private Boolean estimated;

    /**
     * <p>
     * The time period that the result covers.
     * </p>
     *
     * @return <p>
     *         The time period that the result covers.
     *         </p>
     */
    public DateInterval getTimePeriod() {
        return timePeriod;
    }

    /**
     * <p>
     * The time period that the result covers.
     * </p>
     *
     * @param timePeriod <p>
     *            The time period that the result covers.
     *            </p>
     */
    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The time period that the result covers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timePeriod <p>
     *            The time period that the result covers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultByTime withTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * <p>
     * The total amount of cost or usage accrued during the time period.
     * </p>
     *
     * @return <p>
     *         The total amount of cost or usage accrued during the time period.
     *         </p>
     */
    public java.util.Map<String, MetricValue> getTotal() {
        return total;
    }

    /**
     * <p>
     * The total amount of cost or usage accrued during the time period.
     * </p>
     *
     * @param total <p>
     *            The total amount of cost or usage accrued during the time
     *            period.
     *            </p>
     */
    public void setTotal(java.util.Map<String, MetricValue> total) {
        this.total = total;
    }

    /**
     * <p>
     * The total amount of cost or usage accrued during the time period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param total <p>
     *            The total amount of cost or usage accrued during the time
     *            period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultByTime withTotal(java.util.Map<String, MetricValue> total) {
        this.total = total;
        return this;
    }

    /**
     * <p>
     * The total amount of cost or usage accrued during the time period.
     * </p>
     * <p>
     * The method adds a new key-value pair into Total parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Total.
     * @param value The corresponding value of the entry to be added into Total.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultByTime addTotalEntry(String key, MetricValue value) {
        if (null == this.total) {
            this.total = new java.util.HashMap<String, MetricValue>();
        }
        if (this.total.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.total.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Total.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ResultByTime clearTotalEntries() {
        this.total = null;
        return this;
    }

    /**
     * <p>
     * The groups that this time period includes.
     * </p>
     *
     * @return <p>
     *         The groups that this time period includes.
     *         </p>
     */
    public java.util.List<Group> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The groups that this time period includes.
     * </p>
     *
     * @param groups <p>
     *            The groups that this time period includes.
     *            </p>
     */
    public void setGroups(java.util.Collection<Group> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<Group>(groups);
    }

    /**
     * <p>
     * The groups that this time period includes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            The groups that this time period includes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultByTime withGroups(Group... groups) {
        if (getGroups() == null) {
            this.groups = new java.util.ArrayList<Group>(groups.length);
        }
        for (Group value : groups) {
            this.groups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The groups that this time period includes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            The groups that this time period includes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultByTime withGroups(java.util.Collection<Group> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * Whether the result is estimated.
     * </p>
     *
     * @return <p>
     *         Whether the result is estimated.
     *         </p>
     */
    public Boolean isEstimated() {
        return estimated;
    }

    /**
     * <p>
     * Whether the result is estimated.
     * </p>
     *
     * @return <p>
     *         Whether the result is estimated.
     *         </p>
     */
    public Boolean getEstimated() {
        return estimated;
    }

    /**
     * <p>
     * Whether the result is estimated.
     * </p>
     *
     * @param estimated <p>
     *            Whether the result is estimated.
     *            </p>
     */
    public void setEstimated(Boolean estimated) {
        this.estimated = estimated;
    }

    /**
     * <p>
     * Whether the result is estimated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param estimated <p>
     *            Whether the result is estimated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultByTime withEstimated(Boolean estimated) {
        this.estimated = estimated;
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
        if (getTimePeriod() != null)
            sb.append("TimePeriod: " + getTimePeriod() + ",");
        if (getTotal() != null)
            sb.append("Total: " + getTotal() + ",");
        if (getGroups() != null)
            sb.append("Groups: " + getGroups() + ",");
        if (getEstimated() != null)
            sb.append("Estimated: " + getEstimated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getEstimated() == null) ? 0 : getEstimated().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultByTime == false)
            return false;
        ResultByTime other = (ResultByTime) obj;

        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null
                && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getEstimated() == null ^ this.getEstimated() == null)
            return false;
        if (other.getEstimated() != null
                && other.getEstimated().equals(this.getEstimated()) == false)
            return false;
        return true;
    }
}
