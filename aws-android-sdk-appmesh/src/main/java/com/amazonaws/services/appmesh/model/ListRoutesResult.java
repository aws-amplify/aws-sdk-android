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
public class ListRoutesResult implements Serializable {
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListRoutes</code> request. When the results of a
     * <code>ListRoutes</code> request exceed <code>limit</code>, you can use
     * this value to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of existing routes for the specified service mesh and virtual
     * router.
     * </p>
     */
    private java.util.List<RouteRef> routes;

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListRoutes</code> request. When the results of a
     * <code>ListRoutes</code> request exceed <code>limit</code>, you can use
     * this value to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The <code>nextToken</code> value to include in a future
     *         <code>ListRoutes</code> request. When the results of a
     *         <code>ListRoutes</code> request exceed <code>limit</code>, you
     *         can use this value to retrieve the next page of results. This
     *         value is <code>null</code> when there are no more results to
     *         return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListRoutes</code> request. When the results of a
     * <code>ListRoutes</code> request exceed <code>limit</code>, you can use
     * this value to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>ListRoutes</code> request. When the results of a
     *            <code>ListRoutes</code> request exceed <code>limit</code>, you
     *            can use this value to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListRoutes</code> request. When the results of a
     * <code>ListRoutes</code> request exceed <code>limit</code>, you can use
     * this value to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>ListRoutes</code> request. When the results of a
     *            <code>ListRoutes</code> request exceed <code>limit</code>, you
     *            can use this value to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRoutesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The list of existing routes for the specified service mesh and virtual
     * router.
     * </p>
     *
     * @return <p>
     *         The list of existing routes for the specified service mesh and
     *         virtual router.
     *         </p>
     */
    public java.util.List<RouteRef> getRoutes() {
        return routes;
    }

    /**
     * <p>
     * The list of existing routes for the specified service mesh and virtual
     * router.
     * </p>
     *
     * @param routes <p>
     *            The list of existing routes for the specified service mesh and
     *            virtual router.
     *            </p>
     */
    public void setRoutes(java.util.Collection<RouteRef> routes) {
        if (routes == null) {
            this.routes = null;
            return;
        }

        this.routes = new java.util.ArrayList<RouteRef>(routes);
    }

    /**
     * <p>
     * The list of existing routes for the specified service mesh and virtual
     * router.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routes <p>
     *            The list of existing routes for the specified service mesh and
     *            virtual router.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRoutesResult withRoutes(RouteRef... routes) {
        if (getRoutes() == null) {
            this.routes = new java.util.ArrayList<RouteRef>(routes.length);
        }
        for (RouteRef value : routes) {
            this.routes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of existing routes for the specified service mesh and virtual
     * router.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routes <p>
     *            The list of existing routes for the specified service mesh and
     *            virtual router.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRoutesResult withRoutes(java.util.Collection<RouteRef> routes) {
        setRoutes(routes);
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
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getRoutes() != null)
            sb.append("routes: " + getRoutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRoutes() == null) ? 0 : getRoutes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRoutesResult == false)
            return false;
        ListRoutesResult other = (ListRoutesResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRoutes() == null ^ this.getRoutes() == null)
            return false;
        if (other.getRoutes() != null && other.getRoutes().equals(this.getRoutes()) == false)
            return false;
        return true;
    }
}
