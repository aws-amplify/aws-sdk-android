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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the response to a <code>GetHealthCheck</code>
 * request.
 * </p>
 */
public class GetHealthCheckStatusResult implements Serializable {
    /**
     * <p>
     * A list that contains one <code>HealthCheckObservation</code> element for
     * each Amazon Route 53 health checker that is reporting a status about the
     * health check endpoint.
     * </p>
     */
    private java.util.List<HealthCheckObservation> healthCheckObservations;

    /**
     * <p>
     * A list that contains one <code>HealthCheckObservation</code> element for
     * each Amazon Route 53 health checker that is reporting a status about the
     * health check endpoint.
     * </p>
     *
     * @return <p>
     *         A list that contains one <code>HealthCheckObservation</code>
     *         element for each Amazon Route 53 health checker that is reporting
     *         a status about the health check endpoint.
     *         </p>
     */
    public java.util.List<HealthCheckObservation> getHealthCheckObservations() {
        return healthCheckObservations;
    }

    /**
     * <p>
     * A list that contains one <code>HealthCheckObservation</code> element for
     * each Amazon Route 53 health checker that is reporting a status about the
     * health check endpoint.
     * </p>
     *
     * @param healthCheckObservations <p>
     *            A list that contains one <code>HealthCheckObservation</code>
     *            element for each Amazon Route 53 health checker that is
     *            reporting a status about the health check endpoint.
     *            </p>
     */
    public void setHealthCheckObservations(
            java.util.Collection<HealthCheckObservation> healthCheckObservations) {
        if (healthCheckObservations == null) {
            this.healthCheckObservations = null;
            return;
        }

        this.healthCheckObservations = new java.util.ArrayList<HealthCheckObservation>(
                healthCheckObservations);
    }

    /**
     * <p>
     * A list that contains one <code>HealthCheckObservation</code> element for
     * each Amazon Route 53 health checker that is reporting a status about the
     * health check endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheckObservations <p>
     *            A list that contains one <code>HealthCheckObservation</code>
     *            element for each Amazon Route 53 health checker that is
     *            reporting a status about the health check endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHealthCheckStatusResult withHealthCheckObservations(
            HealthCheckObservation... healthCheckObservations) {
        if (getHealthCheckObservations() == null) {
            this.healthCheckObservations = new java.util.ArrayList<HealthCheckObservation>(
                    healthCheckObservations.length);
        }
        for (HealthCheckObservation value : healthCheckObservations) {
            this.healthCheckObservations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains one <code>HealthCheckObservation</code> element for
     * each Amazon Route 53 health checker that is reporting a status about the
     * health check endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheckObservations <p>
     *            A list that contains one <code>HealthCheckObservation</code>
     *            element for each Amazon Route 53 health checker that is
     *            reporting a status about the health check endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHealthCheckStatusResult withHealthCheckObservations(
            java.util.Collection<HealthCheckObservation> healthCheckObservations) {
        setHealthCheckObservations(healthCheckObservations);
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
        if (getHealthCheckObservations() != null)
            sb.append("HealthCheckObservations: " + getHealthCheckObservations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHealthCheckObservations() == null) ? 0 : getHealthCheckObservations()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHealthCheckStatusResult == false)
            return false;
        GetHealthCheckStatusResult other = (GetHealthCheckStatusResult) obj;

        if (other.getHealthCheckObservations() == null ^ this.getHealthCheckObservations() == null)
            return false;
        if (other.getHealthCheckObservations() != null
                && other.getHealthCheckObservations().equals(this.getHealthCheckObservations()) == false)
            return false;
        return true;
    }
}
