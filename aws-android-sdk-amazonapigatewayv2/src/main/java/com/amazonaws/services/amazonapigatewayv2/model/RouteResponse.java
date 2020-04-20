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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a route response.
 * </p>
 */
public class RouteResponse implements Serializable {
    /**
     * <p>
     * Represents the model selection expression of a route response. Supported
     * only for WebSocket APIs.
     * </p>
     */
    private String modelSelectionExpression;

    /**
     * <p>
     * Represents the response models of a route response.
     * </p>
     */
    private java.util.Map<String, String> responseModels;

    /**
     * <p>
     * Represents the response parameters of a route response.
     * </p>
     */
    private java.util.Map<String, ParameterConstraints> responseParameters;

    /**
     * <p>
     * Represents the identifier of a route response.
     * </p>
     */
    private String routeResponseId;

    /**
     * <p>
     * Represents the route response key of a route response.
     * </p>
     */
    private String routeResponseKey;

    /**
     * <p>
     * Represents the model selection expression of a route response. Supported
     * only for WebSocket APIs.
     * </p>
     *
     * @return <p>
     *         Represents the model selection expression of a route response.
     *         Supported only for WebSocket APIs.
     *         </p>
     */
    public String getModelSelectionExpression() {
        return modelSelectionExpression;
    }

    /**
     * <p>
     * Represents the model selection expression of a route response. Supported
     * only for WebSocket APIs.
     * </p>
     *
     * @param modelSelectionExpression <p>
     *            Represents the model selection expression of a route response.
     *            Supported only for WebSocket APIs.
     *            </p>
     */
    public void setModelSelectionExpression(String modelSelectionExpression) {
        this.modelSelectionExpression = modelSelectionExpression;
    }

    /**
     * <p>
     * Represents the model selection expression of a route response. Supported
     * only for WebSocket APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelSelectionExpression <p>
     *            Represents the model selection expression of a route response.
     *            Supported only for WebSocket APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteResponse withModelSelectionExpression(String modelSelectionExpression) {
        this.modelSelectionExpression = modelSelectionExpression;
        return this;
    }

    /**
     * <p>
     * Represents the response models of a route response.
     * </p>
     *
     * @return <p>
     *         Represents the response models of a route response.
     *         </p>
     */
    public java.util.Map<String, String> getResponseModels() {
        return responseModels;
    }

    /**
     * <p>
     * Represents the response models of a route response.
     * </p>
     *
     * @param responseModels <p>
     *            Represents the response models of a route response.
     *            </p>
     */
    public void setResponseModels(java.util.Map<String, String> responseModels) {
        this.responseModels = responseModels;
    }

    /**
     * <p>
     * Represents the response models of a route response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseModels <p>
     *            Represents the response models of a route response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteResponse withResponseModels(java.util.Map<String, String> responseModels) {
        this.responseModels = responseModels;
        return this;
    }

    /**
     * <p>
     * Represents the response models of a route response.
     * </p>
     * <p>
     * The method adds a new key-value pair into ResponseModels parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into ResponseModels.
     * @param value The corresponding value of the entry to be added into
     *            ResponseModels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteResponse addResponseModelsEntry(String key, String value) {
        if (null == this.responseModels) {
            this.responseModels = new java.util.HashMap<String, String>();
        }
        if (this.responseModels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.responseModels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseModels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public RouteResponse clearResponseModelsEntries() {
        this.responseModels = null;
        return this;
    }

    /**
     * <p>
     * Represents the response parameters of a route response.
     * </p>
     *
     * @return <p>
     *         Represents the response parameters of a route response.
     *         </p>
     */
    public java.util.Map<String, ParameterConstraints> getResponseParameters() {
        return responseParameters;
    }

    /**
     * <p>
     * Represents the response parameters of a route response.
     * </p>
     *
     * @param responseParameters <p>
     *            Represents the response parameters of a route response.
     *            </p>
     */
    public void setResponseParameters(java.util.Map<String, ParameterConstraints> responseParameters) {
        this.responseParameters = responseParameters;
    }

    /**
     * <p>
     * Represents the response parameters of a route response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseParameters <p>
     *            Represents the response parameters of a route response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteResponse withResponseParameters(
            java.util.Map<String, ParameterConstraints> responseParameters) {
        this.responseParameters = responseParameters;
        return this;
    }

    /**
     * <p>
     * Represents the response parameters of a route response.
     * </p>
     * <p>
     * The method adds a new key-value pair into ResponseParameters parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into ResponseParameters.
     * @param value The corresponding value of the entry to be added into
     *            ResponseParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteResponse addResponseParametersEntry(String key, ParameterConstraints value) {
        if (null == this.responseParameters) {
            this.responseParameters = new java.util.HashMap<String, ParameterConstraints>();
        }
        if (this.responseParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.responseParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public RouteResponse clearResponseParametersEntries() {
        this.responseParameters = null;
        return this;
    }

    /**
     * <p>
     * Represents the identifier of a route response.
     * </p>
     *
     * @return <p>
     *         Represents the identifier of a route response.
     *         </p>
     */
    public String getRouteResponseId() {
        return routeResponseId;
    }

    /**
     * <p>
     * Represents the identifier of a route response.
     * </p>
     *
     * @param routeResponseId <p>
     *            Represents the identifier of a route response.
     *            </p>
     */
    public void setRouteResponseId(String routeResponseId) {
        this.routeResponseId = routeResponseId;
    }

    /**
     * <p>
     * Represents the identifier of a route response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeResponseId <p>
     *            Represents the identifier of a route response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteResponse withRouteResponseId(String routeResponseId) {
        this.routeResponseId = routeResponseId;
        return this;
    }

    /**
     * <p>
     * Represents the route response key of a route response.
     * </p>
     *
     * @return <p>
     *         Represents the route response key of a route response.
     *         </p>
     */
    public String getRouteResponseKey() {
        return routeResponseKey;
    }

    /**
     * <p>
     * Represents the route response key of a route response.
     * </p>
     *
     * @param routeResponseKey <p>
     *            Represents the route response key of a route response.
     *            </p>
     */
    public void setRouteResponseKey(String routeResponseKey) {
        this.routeResponseKey = routeResponseKey;
    }

    /**
     * <p>
     * Represents the route response key of a route response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeResponseKey <p>
     *            Represents the route response key of a route response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteResponse withRouteResponseKey(String routeResponseKey) {
        this.routeResponseKey = routeResponseKey;
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
        if (getModelSelectionExpression() != null)
            sb.append("ModelSelectionExpression: " + getModelSelectionExpression() + ",");
        if (getResponseModels() != null)
            sb.append("ResponseModels: " + getResponseModels() + ",");
        if (getResponseParameters() != null)
            sb.append("ResponseParameters: " + getResponseParameters() + ",");
        if (getRouteResponseId() != null)
            sb.append("RouteResponseId: " + getRouteResponseId() + ",");
        if (getRouteResponseKey() != null)
            sb.append("RouteResponseKey: " + getRouteResponseKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getModelSelectionExpression() == null) ? 0 : getModelSelectionExpression()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getResponseModels() == null) ? 0 : getResponseModels().hashCode());
        hashCode = prime * hashCode
                + ((getResponseParameters() == null) ? 0 : getResponseParameters().hashCode());
        hashCode = prime * hashCode
                + ((getRouteResponseId() == null) ? 0 : getRouteResponseId().hashCode());
        hashCode = prime * hashCode
                + ((getRouteResponseKey() == null) ? 0 : getRouteResponseKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteResponse == false)
            return false;
        RouteResponse other = (RouteResponse) obj;

        if (other.getModelSelectionExpression() == null
                ^ this.getModelSelectionExpression() == null)
            return false;
        if (other.getModelSelectionExpression() != null
                && other.getModelSelectionExpression().equals(this.getModelSelectionExpression()) == false)
            return false;
        if (other.getResponseModels() == null ^ this.getResponseModels() == null)
            return false;
        if (other.getResponseModels() != null
                && other.getResponseModels().equals(this.getResponseModels()) == false)
            return false;
        if (other.getResponseParameters() == null ^ this.getResponseParameters() == null)
            return false;
        if (other.getResponseParameters() != null
                && other.getResponseParameters().equals(this.getResponseParameters()) == false)
            return false;
        if (other.getRouteResponseId() == null ^ this.getRouteResponseId() == null)
            return false;
        if (other.getRouteResponseId() != null
                && other.getRouteResponseId().equals(this.getRouteResponseId()) == false)
            return false;
        if (other.getRouteResponseKey() == null ^ this.getRouteResponseKey() == null)
            return false;
        if (other.getRouteResponseKey() != null
                && other.getRouteResponseKey().equals(this.getRouteResponseKey()) == false)
            return false;
        return true;
    }
}
