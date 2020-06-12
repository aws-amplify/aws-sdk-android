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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

public class DiscoverPollEndpointResult implements Serializable {
    /**
     * <p>
     * The endpoint for the Amazon ECS agent to poll.
     * </p>
     */
    private String endpoint;

    /**
     * <p>
     * The telemetry endpoint for the Amazon ECS agent.
     * </p>
     */
    private String telemetryEndpoint;

    /**
     * <p>
     * The endpoint for the Amazon ECS agent to poll.
     * </p>
     *
     * @return <p>
     *         The endpoint for the Amazon ECS agent to poll.
     *         </p>
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * <p>
     * The endpoint for the Amazon ECS agent to poll.
     * </p>
     *
     * @param endpoint <p>
     *            The endpoint for the Amazon ECS agent to poll.
     *            </p>
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint for the Amazon ECS agent to poll.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoint <p>
     *            The endpoint for the Amazon ECS agent to poll.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiscoverPollEndpointResult withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * <p>
     * The telemetry endpoint for the Amazon ECS agent.
     * </p>
     *
     * @return <p>
     *         The telemetry endpoint for the Amazon ECS agent.
     *         </p>
     */
    public String getTelemetryEndpoint() {
        return telemetryEndpoint;
    }

    /**
     * <p>
     * The telemetry endpoint for the Amazon ECS agent.
     * </p>
     *
     * @param telemetryEndpoint <p>
     *            The telemetry endpoint for the Amazon ECS agent.
     *            </p>
     */
    public void setTelemetryEndpoint(String telemetryEndpoint) {
        this.telemetryEndpoint = telemetryEndpoint;
    }

    /**
     * <p>
     * The telemetry endpoint for the Amazon ECS agent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param telemetryEndpoint <p>
     *            The telemetry endpoint for the Amazon ECS agent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiscoverPollEndpointResult withTelemetryEndpoint(String telemetryEndpoint) {
        this.telemetryEndpoint = telemetryEndpoint;
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
        if (getEndpoint() != null)
            sb.append("endpoint: " + getEndpoint() + ",");
        if (getTelemetryEndpoint() != null)
            sb.append("telemetryEndpoint: " + getTelemetryEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode
                + ((getTelemetryEndpoint() == null) ? 0 : getTelemetryEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiscoverPollEndpointResult == false)
            return false;
        DiscoverPollEndpointResult other = (DiscoverPollEndpointResult) obj;

        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getTelemetryEndpoint() == null ^ this.getTelemetryEndpoint() == null)
            return false;
        if (other.getTelemetryEndpoint() != null
                && other.getTelemetryEndpoint().equals(this.getTelemetryEndpoint()) == false)
            return false;
        return true;
    }
}
