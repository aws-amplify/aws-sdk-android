/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class ListFleetMetricsResult implements Serializable {
    /**
     * <p>
     * The list of fleet metrics objects.
     * </p>
     */
    private java.util.List<FleetMetricNameAndArn> fleetMetrics;

    /**
     * <p>
     * The token for the next set of results. Will not be returned if the
     * operation has returned all results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of fleet metrics objects.
     * </p>
     *
     * @return <p>
     *         The list of fleet metrics objects.
     *         </p>
     */
    public java.util.List<FleetMetricNameAndArn> getFleetMetrics() {
        return fleetMetrics;
    }

    /**
     * <p>
     * The list of fleet metrics objects.
     * </p>
     *
     * @param fleetMetrics <p>
     *            The list of fleet metrics objects.
     *            </p>
     */
    public void setFleetMetrics(java.util.Collection<FleetMetricNameAndArn> fleetMetrics) {
        if (fleetMetrics == null) {
            this.fleetMetrics = null;
            return;
        }

        this.fleetMetrics = new java.util.ArrayList<FleetMetricNameAndArn>(fleetMetrics);
    }

    /**
     * <p>
     * The list of fleet metrics objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fleetMetrics <p>
     *            The list of fleet metrics objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFleetMetricsResult withFleetMetrics(FleetMetricNameAndArn... fleetMetrics) {
        if (getFleetMetrics() == null) {
            this.fleetMetrics = new java.util.ArrayList<FleetMetricNameAndArn>(fleetMetrics.length);
        }
        for (FleetMetricNameAndArn value : fleetMetrics) {
            this.fleetMetrics.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of fleet metrics objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fleetMetrics <p>
     *            The list of fleet metrics objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFleetMetricsResult withFleetMetrics(
            java.util.Collection<FleetMetricNameAndArn> fleetMetrics) {
        setFleetMetrics(fleetMetrics);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Will not be returned if the
     * operation has returned all results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results. Will not be returned if
     *         the operation has returned all results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Will not be returned if the
     * operation has returned all results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Will not be returned if
     *            the operation has returned all results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Will not be returned if the
     * operation has returned all results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results. Will not be returned if
     *            the operation has returned all results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFleetMetricsResult withNextToken(String nextToken) {
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
        if (getFleetMetrics() != null)
            sb.append("fleetMetrics: " + getFleetMetrics() + ",");
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
                + ((getFleetMetrics() == null) ? 0 : getFleetMetrics().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFleetMetricsResult == false)
            return false;
        ListFleetMetricsResult other = (ListFleetMetricsResult) obj;

        if (other.getFleetMetrics() == null ^ this.getFleetMetrics() == null)
            return false;
        if (other.getFleetMetrics() != null
                && other.getFleetMetrics().equals(this.getFleetMetrics()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
