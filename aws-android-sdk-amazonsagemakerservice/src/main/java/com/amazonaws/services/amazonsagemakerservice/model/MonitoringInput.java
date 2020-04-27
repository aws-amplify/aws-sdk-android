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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * The inputs for a monitoring job.
 * </p>
 */
public class MonitoringInput implements Serializable {
    /**
     * <p>
     * The endpoint for a monitoring job.
     * </p>
     */
    private EndpointInput endpointInput;

    /**
     * <p>
     * The endpoint for a monitoring job.
     * </p>
     *
     * @return <p>
     *         The endpoint for a monitoring job.
     *         </p>
     */
    public EndpointInput getEndpointInput() {
        return endpointInput;
    }

    /**
     * <p>
     * The endpoint for a monitoring job.
     * </p>
     *
     * @param endpointInput <p>
     *            The endpoint for a monitoring job.
     *            </p>
     */
    public void setEndpointInput(EndpointInput endpointInput) {
        this.endpointInput = endpointInput;
    }

    /**
     * <p>
     * The endpoint for a monitoring job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointInput <p>
     *            The endpoint for a monitoring job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringInput withEndpointInput(EndpointInput endpointInput) {
        this.endpointInput = endpointInput;
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
        if (getEndpointInput() != null)
            sb.append("EndpointInput: " + getEndpointInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointInput() == null) ? 0 : getEndpointInput().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringInput == false)
            return false;
        MonitoringInput other = (MonitoringInput) obj;

        if (other.getEndpointInput() == null ^ this.getEndpointInput() == null)
            return false;
        if (other.getEndpointInput() != null
                && other.getEndpointInput().equals(this.getEndpointInput()) == false)
            return false;
        return true;
    }
}
