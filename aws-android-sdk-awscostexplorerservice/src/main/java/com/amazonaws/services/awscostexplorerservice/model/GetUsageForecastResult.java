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

public class GetUsageForecastResult implements Serializable {
    /**
     * <p>
     * How much you're forecasted to use over the forecast period.
     * </p>
     */
    private MetricValue total;

    /**
     * <p>
     * The forecasts for your query, in order. For <code>DAILY</code> forecasts,
     * this is a list of days. For <code>MONTHLY</code> forecasts, this is a
     * list of months.
     * </p>
     */
    private java.util.List<ForecastResult> forecastResultsByTime;

    /**
     * <p>
     * How much you're forecasted to use over the forecast period.
     * </p>
     *
     * @return <p>
     *         How much you're forecasted to use over the forecast period.
     *         </p>
     */
    public MetricValue getTotal() {
        return total;
    }

    /**
     * <p>
     * How much you're forecasted to use over the forecast period.
     * </p>
     *
     * @param total <p>
     *            How much you're forecasted to use over the forecast period.
     *            </p>
     */
    public void setTotal(MetricValue total) {
        this.total = total;
    }

    /**
     * <p>
     * How much you're forecasted to use over the forecast period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param total <p>
     *            How much you're forecasted to use over the forecast period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageForecastResult withTotal(MetricValue total) {
        this.total = total;
        return this;
    }

    /**
     * <p>
     * The forecasts for your query, in order. For <code>DAILY</code> forecasts,
     * this is a list of days. For <code>MONTHLY</code> forecasts, this is a
     * list of months.
     * </p>
     *
     * @return <p>
     *         The forecasts for your query, in order. For <code>DAILY</code>
     *         forecasts, this is a list of days. For <code>MONTHLY</code>
     *         forecasts, this is a list of months.
     *         </p>
     */
    public java.util.List<ForecastResult> getForecastResultsByTime() {
        return forecastResultsByTime;
    }

    /**
     * <p>
     * The forecasts for your query, in order. For <code>DAILY</code> forecasts,
     * this is a list of days. For <code>MONTHLY</code> forecasts, this is a
     * list of months.
     * </p>
     *
     * @param forecastResultsByTime <p>
     *            The forecasts for your query, in order. For <code>DAILY</code>
     *            forecasts, this is a list of days. For <code>MONTHLY</code>
     *            forecasts, this is a list of months.
     *            </p>
     */
    public void setForecastResultsByTime(java.util.Collection<ForecastResult> forecastResultsByTime) {
        if (forecastResultsByTime == null) {
            this.forecastResultsByTime = null;
            return;
        }

        this.forecastResultsByTime = new java.util.ArrayList<ForecastResult>(forecastResultsByTime);
    }

    /**
     * <p>
     * The forecasts for your query, in order. For <code>DAILY</code> forecasts,
     * this is a list of days. For <code>MONTHLY</code> forecasts, this is a
     * list of months.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forecastResultsByTime <p>
     *            The forecasts for your query, in order. For <code>DAILY</code>
     *            forecasts, this is a list of days. For <code>MONTHLY</code>
     *            forecasts, this is a list of months.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageForecastResult withForecastResultsByTime(ForecastResult... forecastResultsByTime) {
        if (getForecastResultsByTime() == null) {
            this.forecastResultsByTime = new java.util.ArrayList<ForecastResult>(
                    forecastResultsByTime.length);
        }
        for (ForecastResult value : forecastResultsByTime) {
            this.forecastResultsByTime.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The forecasts for your query, in order. For <code>DAILY</code> forecasts,
     * this is a list of days. For <code>MONTHLY</code> forecasts, this is a
     * list of months.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forecastResultsByTime <p>
     *            The forecasts for your query, in order. For <code>DAILY</code>
     *            forecasts, this is a list of days. For <code>MONTHLY</code>
     *            forecasts, this is a list of months.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageForecastResult withForecastResultsByTime(
            java.util.Collection<ForecastResult> forecastResultsByTime) {
        setForecastResultsByTime(forecastResultsByTime);
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
        if (getTotal() != null)
            sb.append("Total: " + getTotal() + ",");
        if (getForecastResultsByTime() != null)
            sb.append("ForecastResultsByTime: " + getForecastResultsByTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime
                * hashCode
                + ((getForecastResultsByTime() == null) ? 0 : getForecastResultsByTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUsageForecastResult == false)
            return false;
        GetUsageForecastResult other = (GetUsageForecastResult) obj;

        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getForecastResultsByTime() == null ^ this.getForecastResultsByTime() == null)
            return false;
        if (other.getForecastResultsByTime() != null
                && other.getForecastResultsByTime().equals(this.getForecastResultsByTime()) == false)
            return false;
        return true;
    }
}
