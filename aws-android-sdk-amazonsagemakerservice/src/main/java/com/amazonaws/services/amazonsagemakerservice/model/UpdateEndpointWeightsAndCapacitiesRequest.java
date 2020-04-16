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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates variant weight of one or more variants associated with an existing
 * endpoint, or capacity of one variant associated with an existing endpoint.
 * When it receives the request, Amazon SageMaker sets the endpoint status to
 * <code>Updating</code>. After updating the endpoint, it sets the status to
 * <code>InService</code>. To check the status of an endpoint, use the
 * <a>DescribeEndpoint</a> API.
 * </p>
 */
public class UpdateEndpointWeightsAndCapacitiesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of an existing Amazon SageMaker endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointName;

    /**
     * <p>
     * An object that provides new capacity and weight values for a variant.
     * </p>
     */
    private java.util.List<DesiredWeightAndCapacity> desiredWeightsAndCapacities;

    /**
     * <p>
     * The name of an existing Amazon SageMaker endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of an existing Amazon SageMaker endpoint.
     *         </p>
     */
    public String getEndpointName() {
        return endpointName;
    }

    /**
     * <p>
     * The name of an existing Amazon SageMaker endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointName <p>
     *            The name of an existing Amazon SageMaker endpoint.
     *            </p>
     */
    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of an existing Amazon SageMaker endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointName <p>
     *            The name of an existing Amazon SageMaker endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointWeightsAndCapacitiesRequest withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * <p>
     * An object that provides new capacity and weight values for a variant.
     * </p>
     *
     * @return <p>
     *         An object that provides new capacity and weight values for a
     *         variant.
     *         </p>
     */
    public java.util.List<DesiredWeightAndCapacity> getDesiredWeightsAndCapacities() {
        return desiredWeightsAndCapacities;
    }

    /**
     * <p>
     * An object that provides new capacity and weight values for a variant.
     * </p>
     *
     * @param desiredWeightsAndCapacities <p>
     *            An object that provides new capacity and weight values for a
     *            variant.
     *            </p>
     */
    public void setDesiredWeightsAndCapacities(
            java.util.Collection<DesiredWeightAndCapacity> desiredWeightsAndCapacities) {
        if (desiredWeightsAndCapacities == null) {
            this.desiredWeightsAndCapacities = null;
            return;
        }

        this.desiredWeightsAndCapacities = new java.util.ArrayList<DesiredWeightAndCapacity>(
                desiredWeightsAndCapacities);
    }

    /**
     * <p>
     * An object that provides new capacity and weight values for a variant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param desiredWeightsAndCapacities <p>
     *            An object that provides new capacity and weight values for a
     *            variant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointWeightsAndCapacitiesRequest withDesiredWeightsAndCapacities(
            DesiredWeightAndCapacity... desiredWeightsAndCapacities) {
        if (getDesiredWeightsAndCapacities() == null) {
            this.desiredWeightsAndCapacities = new java.util.ArrayList<DesiredWeightAndCapacity>(
                    desiredWeightsAndCapacities.length);
        }
        for (DesiredWeightAndCapacity value : desiredWeightsAndCapacities) {
            this.desiredWeightsAndCapacities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An object that provides new capacity and weight values for a variant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param desiredWeightsAndCapacities <p>
     *            An object that provides new capacity and weight values for a
     *            variant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointWeightsAndCapacitiesRequest withDesiredWeightsAndCapacities(
            java.util.Collection<DesiredWeightAndCapacity> desiredWeightsAndCapacities) {
        setDesiredWeightsAndCapacities(desiredWeightsAndCapacities);
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
        if (getEndpointName() != null)
            sb.append("EndpointName: " + getEndpointName() + ",");
        if (getDesiredWeightsAndCapacities() != null)
            sb.append("DesiredWeightsAndCapacities: " + getDesiredWeightsAndCapacities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDesiredWeightsAndCapacities() == null) ? 0
                        : getDesiredWeightsAndCapacities().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEndpointWeightsAndCapacitiesRequest == false)
            return false;
        UpdateEndpointWeightsAndCapacitiesRequest other = (UpdateEndpointWeightsAndCapacitiesRequest) obj;

        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null
                && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getDesiredWeightsAndCapacities() == null
                ^ this.getDesiredWeightsAndCapacities() == null)
            return false;
        if (other.getDesiredWeightsAndCapacities() != null
                && other.getDesiredWeightsAndCapacities().equals(
                        this.getDesiredWeightsAndCapacities()) == false)
            return false;
        return true;
    }
}
