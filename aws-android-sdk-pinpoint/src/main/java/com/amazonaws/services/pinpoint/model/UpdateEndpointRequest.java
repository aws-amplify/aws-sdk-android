/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new endpoint for an application or updates the settings and
 * attributes of an existing endpoint for an application. You can also use this
 * operation to define custom attributes (Attributes, Metrics, and
 * UserAttributes properties) for an endpoint.
 * </p>
 */
public class UpdateEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * The unique identifier for the endpoint.
     * </p>
     */
    private String endpointId;

    /**
     * <p>
     * Specifies the channel type and other settings for an endpoint.
     * </p>
     */
    private EndpointRequest endpointRequest;

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the application. This identifier is
     *         displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *         console.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     *
     * @param applicationId <p>
     *            The unique identifier for the application. This identifier is
     *            displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *            console.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The unique identifier for the application. This identifier is
     *            displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *            console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the endpoint.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the endpoint.
     *         </p>
     */
    public String getEndpointId() {
        return endpointId;
    }

    /**
     * <p>
     * The unique identifier for the endpoint.
     * </p>
     *
     * @param endpointId <p>
     *            The unique identifier for the endpoint.
     *            </p>
     */
    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * The unique identifier for the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointId <p>
     *            The unique identifier for the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointRequest withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * <p>
     * Specifies the channel type and other settings for an endpoint.
     * </p>
     *
     * @return <p>
     *         Specifies the channel type and other settings for an endpoint.
     *         </p>
     */
    public EndpointRequest getEndpointRequest() {
        return endpointRequest;
    }

    /**
     * <p>
     * Specifies the channel type and other settings for an endpoint.
     * </p>
     *
     * @param endpointRequest <p>
     *            Specifies the channel type and other settings for an endpoint.
     *            </p>
     */
    public void setEndpointRequest(EndpointRequest endpointRequest) {
        this.endpointRequest = endpointRequest;
    }

    /**
     * <p>
     * Specifies the channel type and other settings for an endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointRequest <p>
     *            Specifies the channel type and other settings for an endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointRequest withEndpointRequest(EndpointRequest endpointRequest) {
        this.endpointRequest = endpointRequest;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getEndpointId() != null)
            sb.append("EndpointId: " + getEndpointId() + ",");
        if (getEndpointRequest() != null)
            sb.append("EndpointRequest: " + getEndpointRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointRequest() == null) ? 0 : getEndpointRequest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEndpointRequest == false)
            return false;
        UpdateEndpointRequest other = (UpdateEndpointRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null
                && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getEndpointRequest() == null ^ this.getEndpointRequest() == null)
            return false;
        if (other.getEndpointRequest() != null
                && other.getEndpointRequest().equals(this.getEndpointRequest()) == false)
            return false;
        return true;
    }
}
