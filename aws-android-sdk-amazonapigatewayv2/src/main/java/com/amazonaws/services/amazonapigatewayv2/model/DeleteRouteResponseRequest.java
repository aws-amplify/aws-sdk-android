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
 * Deletes a RouteResponse.
 * </p>
 */
public class DeleteRouteResponseRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;

    /**
     * <p>
     * The route ID.
     * </p>
     */
    private String routeId;

    /**
     * <p>
     * The route response ID.
     * </p>
     */
    private String routeResponseId;

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
    public DeleteRouteResponseRequest withApiId(String apiId) {
        this.apiId = apiId;
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
    public DeleteRouteResponseRequest withRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }

    /**
     * <p>
     * The route response ID.
     * </p>
     *
     * @return <p>
     *         The route response ID.
     *         </p>
     */
    public String getRouteResponseId() {
        return routeResponseId;
    }

    /**
     * <p>
     * The route response ID.
     * </p>
     *
     * @param routeResponseId <p>
     *            The route response ID.
     *            </p>
     */
    public void setRouteResponseId(String routeResponseId) {
        this.routeResponseId = routeResponseId;
    }

    /**
     * <p>
     * The route response ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeResponseId <p>
     *            The route response ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteRouteResponseRequest withRouteResponseId(String routeResponseId) {
        this.routeResponseId = routeResponseId;
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
        if (getRouteId() != null)
            sb.append("RouteId: " + getRouteId() + ",");
        if (getRouteResponseId() != null)
            sb.append("RouteResponseId: " + getRouteResponseId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getRouteId() == null) ? 0 : getRouteId().hashCode());
        hashCode = prime * hashCode
                + ((getRouteResponseId() == null) ? 0 : getRouteResponseId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRouteResponseRequest == false)
            return false;
        DeleteRouteResponseRequest other = (DeleteRouteResponseRequest) obj;

        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getRouteId() == null ^ this.getRouteId() == null)
            return false;
        if (other.getRouteId() != null && other.getRouteId().equals(this.getRouteId()) == false)
            return false;
        if (other.getRouteResponseId() == null ^ this.getRouteResponseId() == null)
            return false;
        if (other.getRouteResponseId() != null
                && other.getRouteResponseId().equals(this.getRouteResponseId()) == false)
            return false;
        return true;
    }
}
