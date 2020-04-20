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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a RouteResponse for a Route.
 * </p>
 */
public class CreateRouteResponseRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;

    /**
     * <p>
     * The model selection expression for the route response. Supported only for
     * WebSocket APIs.
     * </p>
     */
    private String modelSelectionExpression;

    /**
     * <p>
     * The response models for the route response.
     * </p>
     */
    private java.util.Map<String, String> responseModels;

    /**
     * <p>
     * The route response parameters.
     * </p>
     */
    private java.util.Map<String, ParameterConstraints> responseParameters;

    /**
     * <p>
     * The route ID.
     * </p>
     */
    private String routeId;

    /**
     * <p>
     * The route response key.
     * </p>
     */
    private String routeResponseKey;

    /**
     * <p>
     * The API identifier.
     * </p>
     *
     * @return <p>
     *         The API identifier.
     *         </p>
     */
    public String getApiId() {
        return apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     *
     * @param apiId <p>
     *            The API identifier.
     *            </p>
     */
    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiId <p>
     *            The API identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteResponseRequest withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * <p>
     * The model selection expression for the route response. Supported only for
     * WebSocket APIs.
     * </p>
     *
     * @return <p>
     *         The model selection expression for the route response. Supported
     *         only for WebSocket APIs.
     *         </p>
     */
    public String getModelSelectionExpression() {
        return modelSelectionExpression;
    }

    /**
     * <p>
     * The model selection expression for the route response. Supported only for
     * WebSocket APIs.
     * </p>
     *
     * @param modelSelectionExpression <p>
     *            The model selection expression for the route response.
     *            Supported only for WebSocket APIs.
     *            </p>
     */
    public void setModelSelectionExpression(String modelSelectionExpression) {
        this.modelSelectionExpression = modelSelectionExpression;
    }

    /**
     * <p>
     * The model selection expression for the route response. Supported only for
     * WebSocket APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelSelectionExpression <p>
     *            The model selection expression for the route response.
     *            Supported only for WebSocket APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteResponseRequest withModelSelectionExpression(String modelSelectionExpression) {
        this.modelSelectionExpression = modelSelectionExpression;
        return this;
    }

    /**
     * <p>
     * The response models for the route response.
     * </p>
     *
     * @return <p>
     *         The response models for the route response.
     *         </p>
     */
    public java.util.Map<String, String> getResponseModels() {
        return responseModels;
    }

    /**
     * <p>
     * The response models for the route response.
     * </p>
     *
     * @param responseModels <p>
     *            The response models for the route response.
     *            </p>
     */
    public void setResponseModels(java.util.Map<String, String> responseModels) {
        this.responseModels = responseModels;
    }

    /**
     * <p>
     * The response models for the route response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseModels <p>
     *            The response models for the route response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteResponseRequest withResponseModels(
            java.util.Map<String, String> responseModels) {
        this.responseModels = responseModels;
        return this;
    }

    /**
     * <p>
     * The response models for the route response.
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
    public CreateRouteResponseRequest addResponseModelsEntry(String key, String value) {
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
    public CreateRouteResponseRequest clearResponseModelsEntries() {
        this.responseModels = null;
        return this;
    }

    /**
     * <p>
     * The route response parameters.
     * </p>
     *
     * @return <p>
     *         The route response parameters.
     *         </p>
     */
    public java.util.Map<String, ParameterConstraints> getResponseParameters() {
        return responseParameters;
    }

    /**
     * <p>
     * The route response parameters.
     * </p>
     *
     * @param responseParameters <p>
     *            The route response parameters.
     *            </p>
     */
    public void setResponseParameters(java.util.Map<String, ParameterConstraints> responseParameters) {
        this.responseParameters = responseParameters;
    }

    /**
     * <p>
     * The route response parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseParameters <p>
     *            The route response parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteResponseRequest withResponseParameters(
            java.util.Map<String, ParameterConstraints> responseParameters) {
        this.responseParameters = responseParameters;
        return this;
    }

    /**
     * <p>
     * The route response parameters.
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
    public CreateRouteResponseRequest addResponseParametersEntry(String key,
            ParameterConstraints value) {
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
    public CreateRouteResponseRequest clearResponseParametersEntries() {
        this.responseParameters = null;
        return this;
    }

    /**
     * <p>
     * The route ID.
     * </p>
     *
     * @return <p>
     *         The route ID.
     *         </p>
     */
    public String getRouteId() {
        return routeId;
    }

    /**
     * <p>
     * The route ID.
     * </p>
     *
     * @param routeId <p>
     *            The route ID.
     *            </p>
     */
    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    /**
     * <p>
     * The route ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeId <p>
     *            The route ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteResponseRequest withRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }

    /**
     * <p>
     * The route response key.
     * </p>
     *
     * @return <p>
     *         The route response key.
     *         </p>
     */
    public String getRouteResponseKey() {
        return routeResponseKey;
    }

    /**
     * <p>
     * The route response key.
     * </p>
     *
     * @param routeResponseKey <p>
     *            The route response key.
     *            </p>
     */
    public void setRouteResponseKey(String routeResponseKey) {
        this.routeResponseKey = routeResponseKey;
    }

    /**
     * <p>
     * The route response key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeResponseKey <p>
     *            The route response key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteResponseRequest withRouteResponseKey(String routeResponseKey) {
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
        if (getApiId() != null)
            sb.append("ApiId: " + getApiId() + ",");
        if (getModelSelectionExpression() != null)
            sb.append("ModelSelectionExpression: " + getModelSelectionExpression() + ",");
        if (getResponseModels() != null)
            sb.append("ResponseModels: " + getResponseModels() + ",");
        if (getResponseParameters() != null)
            sb.append("ResponseParameters: " + getResponseParameters() + ",");
        if (getRouteId() != null)
            sb.append("RouteId: " + getRouteId() + ",");
        if (getRouteResponseKey() != null)
            sb.append("RouteResponseKey: " + getRouteResponseKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime
                * hashCode
                + ((getModelSelectionExpression() == null) ? 0 : getModelSelectionExpression()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getResponseModels() == null) ? 0 : getResponseModels().hashCode());
        hashCode = prime * hashCode
                + ((getResponseParameters() == null) ? 0 : getResponseParameters().hashCode());
        hashCode = prime * hashCode + ((getRouteId() == null) ? 0 : getRouteId().hashCode());
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

        if (obj instanceof CreateRouteResponseRequest == false)
            return false;
        CreateRouteResponseRequest other = (CreateRouteResponseRequest) obj;

        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
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
        if (other.getRouteId() == null ^ this.getRouteId() == null)
            return false;
        if (other.getRouteId() != null && other.getRouteId().equals(this.getRouteId()) == false)
            return false;
        if (other.getRouteResponseKey() == null ^ this.getRouteResponseKey() == null)
            return false;
        if (other.getRouteResponseKey() != null
                && other.getRouteResponseKey().equals(this.getRouteResponseKey()) == false)
            return false;
        return true;
    }
}
