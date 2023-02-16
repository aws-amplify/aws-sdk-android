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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListMetricValuesResult implements Serializable {
    /**
     * <p>
     * The data the thing reports for the metric during the specified time
     * period.
     * </p>
     */
    private java.util.List<MetricDatum> metricDatumList;

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The data the thing reports for the metric during the specified time
     * period.
     * </p>
     *
     * @return <p>
     *         The data the thing reports for the metric during the specified
     *         time period.
     *         </p>
     */
    public java.util.List<MetricDatum> getMetricDatumList() {
        return metricDatumList;
    }

    /**
     * <p>
     * The data the thing reports for the metric during the specified time
     * period.
     * </p>
     *
     * @param metricDatumList <p>
     *            The data the thing reports for the metric during the specified
     *            time period.
     *            </p>
     */
    public void setMetricDatumList(java.util.Collection<MetricDatum> metricDatumList) {
        if (metricDatumList == null) {
            this.metricDatumList = null;
            return;
        }

        this.metricDatumList = new java.util.ArrayList<MetricDatum>(metricDatumList);
    }

    /**
     * <p>
     * The data the thing reports for the metric during the specified time
     * period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricDatumList <p>
     *            The data the thing reports for the metric during the specified
     *            time period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMetricValuesResult withMetricDatumList(MetricDatum... metricDatumList) {
        if (getMetricDatumList() == null) {
            this.metricDatumList = new java.util.ArrayList<MetricDatum>(metricDatumList.length);
        }
        for (MetricDatum value : metricDatumList) {
            this.metricDatumList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The data the thing reports for the metric during the specified time
     * period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricDatumList <p>
     *            The data the thing reports for the metric during the specified
     *            time period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMetricValuesResult withMetricDatumList(
            java.util.Collection<MetricDatum> metricDatumList) {
        setMetricDatumList(metricDatumList);
        return this;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     *
     * @return <p>
     *         A token that can be used to retrieve the next set of results, or
     *         <code>null</code> if there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            A token that can be used to retrieve the next set of results,
     *            or <code>null</code> if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token that can be used to retrieve the next set of results,
     *            or <code>null</code> if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMetricValuesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getMetricDatumList() != null)
            sb.append("metricDatumList: " + getMetricDatumList() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMetricDatumList() == null) ? 0 : getMetricDatumList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMetricValuesResult == false)
            return false;
        ListMetricValuesResult other = (ListMetricValuesResult) obj;

        if (other.getMetricDatumList() == null ^ this.getMetricDatumList() == null)
            return false;
        if (other.getMetricDatumList() != null
                && other.getMetricDatumList().equals(this.getMetricDatumList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
