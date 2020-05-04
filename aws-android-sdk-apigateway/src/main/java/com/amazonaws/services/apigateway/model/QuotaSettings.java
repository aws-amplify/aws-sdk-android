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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Quotas configured for a usage plan.
 * </p>
 */
public class QuotaSettings implements Serializable {
    /**
     * <p>
     * The maximum number of requests that can be made in a given time period.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The number of requests subtracted from the given limit in the initial
     * time period.
     * </p>
     */
    private Integer offset;

    /**
     * <p>
     * The time period in which the limit applies. Valid values are "DAY",
     * "WEEK" or "MONTH".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAY, WEEK, MONTH
     */
    private String period;

    /**
     * <p>
     * The maximum number of requests that can be made in a given time period.
     * </p>
     *
     * @return <p>
     *         The maximum number of requests that can be made in a given time
     *         period.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * The maximum number of requests that can be made in a given time period.
     * </p>
     *
     * @param limit <p>
     *            The maximum number of requests that can be made in a given
     *            time period.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of requests that can be made in a given time period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limit <p>
     *            The maximum number of requests that can be made in a given
     *            time period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QuotaSettings withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * The number of requests subtracted from the given limit in the initial
     * time period.
     * </p>
     *
     * @return <p>
     *         The number of requests subtracted from the given limit in the
     *         initial time period.
     *         </p>
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * <p>
     * The number of requests subtracted from the given limit in the initial
     * time period.
     * </p>
     *
     * @param offset <p>
     *            The number of requests subtracted from the given limit in the
     *            initial time period.
     *            </p>
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * <p>
     * The number of requests subtracted from the given limit in the initial
     * time period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offset <p>
     *            The number of requests subtracted from the given limit in the
     *            initial time period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QuotaSettings withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * <p>
     * The time period in which the limit applies. Valid values are "DAY",
     * "WEEK" or "MONTH".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAY, WEEK, MONTH
     *
     * @return <p>
     *         The time period in which the limit applies. Valid values are
     *         "DAY", "WEEK" or "MONTH".
     *         </p>
     * @see QuotaPeriodType
     */
    public String getPeriod() {
        return period;
    }

    /**
     * <p>
     * The time period in which the limit applies. Valid values are "DAY",
     * "WEEK" or "MONTH".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAY, WEEK, MONTH
     *
     * @param period <p>
     *            The time period in which the limit applies. Valid values are
     *            "DAY", "WEEK" or "MONTH".
     *            </p>
     * @see QuotaPeriodType
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * <p>
     * The time period in which the limit applies. Valid values are "DAY",
     * "WEEK" or "MONTH".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAY, WEEK, MONTH
     *
     * @param period <p>
     *            The time period in which the limit applies. Valid values are
     *            "DAY", "WEEK" or "MONTH".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QuotaPeriodType
     */
    public QuotaSettings withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * <p>
     * The time period in which the limit applies. Valid values are "DAY",
     * "WEEK" or "MONTH".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAY, WEEK, MONTH
     *
     * @param period <p>
     *            The time period in which the limit applies. Valid values are
     *            "DAY", "WEEK" or "MONTH".
     *            </p>
     * @see QuotaPeriodType
     */
    public void setPeriod(QuotaPeriodType period) {
        this.period = period.toString();
    }

    /**
     * <p>
     * The time period in which the limit applies. Valid values are "DAY",
     * "WEEK" or "MONTH".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAY, WEEK, MONTH
     *
     * @param period <p>
     *            The time period in which the limit applies. Valid values are
     *            "DAY", "WEEK" or "MONTH".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QuotaPeriodType
     */
    public QuotaSettings withPeriod(QuotaPeriodType period) {
        this.period = period.toString();
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
        if (getLimit() != null)
            sb.append("limit: " + getLimit() + ",");
        if (getOffset() != null)
            sb.append("offset: " + getOffset() + ",");
        if (getPeriod() != null)
            sb.append("period: " + getPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getOffset() == null) ? 0 : getOffset().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QuotaSettings == false)
            return false;
        QuotaSettings other = (QuotaSettings) obj;

        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getOffset() == null ^ this.getOffset() == null)
            return false;
        if (other.getOffset() != null && other.getOffset().equals(this.getOffset()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        return true;
    }
}
