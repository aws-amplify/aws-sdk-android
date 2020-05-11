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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class SearchTransitGatewayRoutesResult implements Serializable {
    /**
     * <p>
     * Information about the routes.
     * </p>
     */
    private java.util.List<TransitGatewayRoute> routes;

    /**
     * <p>
     * Indicates whether there are additional routes available.
     * </p>
     */
    private Boolean additionalRoutesAvailable;

    /**
     * <p>
     * Information about the routes.
     * </p>
     *
     * @return <p>
     *         Information about the routes.
     *         </p>
     */
    public java.util.List<TransitGatewayRoute> getRoutes() {
        return routes;
    }

    /**
     * <p>
     * Information about the routes.
     * </p>
     *
     * @param routes <p>
     *            Information about the routes.
     *            </p>
     */
    public void setRoutes(java.util.Collection<TransitGatewayRoute> routes) {
        if (routes == null) {
            this.routes = null;
            return;
        }

        this.routes = new java.util.ArrayList<TransitGatewayRoute>(routes);
    }

    /**
     * <p>
     * Information about the routes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routes <p>
     *            Information about the routes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchTransitGatewayRoutesResult withRoutes(TransitGatewayRoute... routes) {
        if (getRoutes() == null) {
            this.routes = new java.util.ArrayList<TransitGatewayRoute>(routes.length);
        }
        for (TransitGatewayRoute value : routes) {
            this.routes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the routes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routes <p>
     *            Information about the routes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchTransitGatewayRoutesResult withRoutes(
            java.util.Collection<TransitGatewayRoute> routes) {
        setRoutes(routes);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are additional routes available.
     * </p>
     *
     * @return <p>
     *         Indicates whether there are additional routes available.
     *         </p>
     */
    public Boolean isAdditionalRoutesAvailable() {
        return additionalRoutesAvailable;
    }

    /**
     * <p>
     * Indicates whether there are additional routes available.
     * </p>
     *
     * @return <p>
     *         Indicates whether there are additional routes available.
     *         </p>
     */
    public Boolean getAdditionalRoutesAvailable() {
        return additionalRoutesAvailable;
    }

    /**
     * <p>
     * Indicates whether there are additional routes available.
     * </p>
     *
     * @param additionalRoutesAvailable <p>
     *            Indicates whether there are additional routes available.
     *            </p>
     */
    public void setAdditionalRoutesAvailable(Boolean additionalRoutesAvailable) {
        this.additionalRoutesAvailable = additionalRoutesAvailable;
    }

    /**
     * <p>
     * Indicates whether there are additional routes available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalRoutesAvailable <p>
     *            Indicates whether there are additional routes available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchTransitGatewayRoutesResult withAdditionalRoutesAvailable(
            Boolean additionalRoutesAvailable) {
        this.additionalRoutesAvailable = additionalRoutesAvailable;
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
        if (getRoutes() != null)
            sb.append("Routes: " + getRoutes() + ",");
        if (getAdditionalRoutesAvailable() != null)
            sb.append("AdditionalRoutesAvailable: " + getAdditionalRoutesAvailable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoutes() == null) ? 0 : getRoutes().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdditionalRoutesAvailable() == null) ? 0 : getAdditionalRoutesAvailable()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchTransitGatewayRoutesResult == false)
            return false;
        SearchTransitGatewayRoutesResult other = (SearchTransitGatewayRoutesResult) obj;

        if (other.getRoutes() == null ^ this.getRoutes() == null)
            return false;
        if (other.getRoutes() != null && other.getRoutes().equals(this.getRoutes()) == false)
            return false;
        if (other.getAdditionalRoutesAvailable() == null
                ^ this.getAdditionalRoutesAvailable() == null)
            return false;
        if (other.getAdditionalRoutesAvailable() != null
                && other.getAdditionalRoutesAvailable().equals(this.getAdditionalRoutesAvailable()) == false)
            return false;
        return true;
    }
}
