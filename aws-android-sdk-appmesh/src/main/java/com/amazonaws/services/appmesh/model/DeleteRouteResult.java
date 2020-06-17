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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * 
 */
public class DeleteRouteResult implements Serializable {
    /**
     * <p>
     * The route that was deleted.
     * </p>
     */
    private RouteData route;

    /**
     * <p>
     * The route that was deleted.
     * </p>
     *
     * @return <p>
     *         The route that was deleted.
     *         </p>
     */
    public RouteData getRoute() {
        return route;
    }

    /**
     * <p>
     * The route that was deleted.
     * </p>
     *
     * @param route <p>
     *            The route that was deleted.
     *            </p>
     */
    public void setRoute(RouteData route) {
        this.route = route;
    }

    /**
     * <p>
     * The route that was deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param route <p>
     *            The route that was deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteRouteResult withRoute(RouteData route) {
        this.route = route;
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
        if (getRoute() != null)
            sb.append("route: " + getRoute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoute() == null) ? 0 : getRoute().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRouteResult == false)
            return false;
        DeleteRouteResult other = (DeleteRouteResult) obj;

        if (other.getRoute() == null ^ this.getRoute() == null)
            return false;
        if (other.getRoute() != null && other.getRoute().equals(this.getRoute()) == false)
            return false;
        return true;
    }
}
