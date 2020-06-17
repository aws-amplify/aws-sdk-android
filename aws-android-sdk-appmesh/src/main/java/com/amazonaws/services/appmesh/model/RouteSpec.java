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
 * <p>
 * An object that represents a route specification. Specify one route type.
 * </p>
 */
public class RouteSpec implements Serializable {
    /**
     * <p>
     * An object that represents the specification of a gRPC route.
     * </p>
     */
    private GrpcRoute grpcRoute;

    /**
     * <p>
     * An object that represents the specification of an HTTP/2 route.
     * </p>
     */
    private HttpRoute http2Route;

    /**
     * <p>
     * An object that represents the specification of an HTTP route.
     * </p>
     */
    private HttpRoute httpRoute;

    /**
     * <p>
     * The priority for the route. Routes are matched based on the specified
     * value, where 0 is the highest priority.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     */
    private Integer priority;

    /**
     * <p>
     * An object that represents the specification of a TCP route.
     * </p>
     */
    private TcpRoute tcpRoute;

    /**
     * <p>
     * An object that represents the specification of a gRPC route.
     * </p>
     *
     * @return <p>
     *         An object that represents the specification of a gRPC route.
     *         </p>
     */
    public GrpcRoute getGrpcRoute() {
        return grpcRoute;
    }

    /**
     * <p>
     * An object that represents the specification of a gRPC route.
     * </p>
     *
     * @param grpcRoute <p>
     *            An object that represents the specification of a gRPC route.
     *            </p>
     */
    public void setGrpcRoute(GrpcRoute grpcRoute) {
        this.grpcRoute = grpcRoute;
    }

    /**
     * <p>
     * An object that represents the specification of a gRPC route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grpcRoute <p>
     *            An object that represents the specification of a gRPC route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteSpec withGrpcRoute(GrpcRoute grpcRoute) {
        this.grpcRoute = grpcRoute;
        return this;
    }

    /**
     * <p>
     * An object that represents the specification of an HTTP/2 route.
     * </p>
     *
     * @return <p>
     *         An object that represents the specification of an HTTP/2 route.
     *         </p>
     */
    public HttpRoute getHttp2Route() {
        return http2Route;
    }

    /**
     * <p>
     * An object that represents the specification of an HTTP/2 route.
     * </p>
     *
     * @param http2Route <p>
     *            An object that represents the specification of an HTTP/2
     *            route.
     *            </p>
     */
    public void setHttp2Route(HttpRoute http2Route) {
        this.http2Route = http2Route;
    }

    /**
     * <p>
     * An object that represents the specification of an HTTP/2 route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param http2Route <p>
     *            An object that represents the specification of an HTTP/2
     *            route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteSpec withHttp2Route(HttpRoute http2Route) {
        this.http2Route = http2Route;
        return this;
    }

    /**
     * <p>
     * An object that represents the specification of an HTTP route.
     * </p>
     *
     * @return <p>
     *         An object that represents the specification of an HTTP route.
     *         </p>
     */
    public HttpRoute getHttpRoute() {
        return httpRoute;
    }

    /**
     * <p>
     * An object that represents the specification of an HTTP route.
     * </p>
     *
     * @param httpRoute <p>
     *            An object that represents the specification of an HTTP route.
     *            </p>
     */
    public void setHttpRoute(HttpRoute httpRoute) {
        this.httpRoute = httpRoute;
    }

    /**
     * <p>
     * An object that represents the specification of an HTTP route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param httpRoute <p>
     *            An object that represents the specification of an HTTP route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteSpec withHttpRoute(HttpRoute httpRoute) {
        this.httpRoute = httpRoute;
        return this;
    }

    /**
     * <p>
     * The priority for the route. Routes are matched based on the specified
     * value, where 0 is the highest priority.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @return <p>
     *         The priority for the route. Routes are matched based on the
     *         specified value, where 0 is the highest priority.
     *         </p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>
     * The priority for the route. Routes are matched based on the specified
     * value, where 0 is the highest priority.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param priority <p>
     *            The priority for the route. Routes are matched based on the
     *            specified value, where 0 is the highest priority.
     *            </p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority for the route. Routes are matched based on the specified
     * value, where 0 is the highest priority.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param priority <p>
     *            The priority for the route. Routes are matched based on the
     *            specified value, where 0 is the highest priority.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteSpec withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>
     * An object that represents the specification of a TCP route.
     * </p>
     *
     * @return <p>
     *         An object that represents the specification of a TCP route.
     *         </p>
     */
    public TcpRoute getTcpRoute() {
        return tcpRoute;
    }

    /**
     * <p>
     * An object that represents the specification of a TCP route.
     * </p>
     *
     * @param tcpRoute <p>
     *            An object that represents the specification of a TCP route.
     *            </p>
     */
    public void setTcpRoute(TcpRoute tcpRoute) {
        this.tcpRoute = tcpRoute;
    }

    /**
     * <p>
     * An object that represents the specification of a TCP route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tcpRoute <p>
     *            An object that represents the specification of a TCP route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteSpec withTcpRoute(TcpRoute tcpRoute) {
        this.tcpRoute = tcpRoute;
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
        if (getGrpcRoute() != null)
            sb.append("grpcRoute: " + getGrpcRoute() + ",");
        if (getHttp2Route() != null)
            sb.append("http2Route: " + getHttp2Route() + ",");
        if (getHttpRoute() != null)
            sb.append("httpRoute: " + getHttpRoute() + ",");
        if (getPriority() != null)
            sb.append("priority: " + getPriority() + ",");
        if (getTcpRoute() != null)
            sb.append("tcpRoute: " + getTcpRoute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrpcRoute() == null) ? 0 : getGrpcRoute().hashCode());
        hashCode = prime * hashCode + ((getHttp2Route() == null) ? 0 : getHttp2Route().hashCode());
        hashCode = prime * hashCode + ((getHttpRoute() == null) ? 0 : getHttpRoute().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getTcpRoute() == null) ? 0 : getTcpRoute().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteSpec == false)
            return false;
        RouteSpec other = (RouteSpec) obj;

        if (other.getGrpcRoute() == null ^ this.getGrpcRoute() == null)
            return false;
        if (other.getGrpcRoute() != null
                && other.getGrpcRoute().equals(this.getGrpcRoute()) == false)
            return false;
        if (other.getHttp2Route() == null ^ this.getHttp2Route() == null)
            return false;
        if (other.getHttp2Route() != null
                && other.getHttp2Route().equals(this.getHttp2Route()) == false)
            return false;
        if (other.getHttpRoute() == null ^ this.getHttpRoute() == null)
            return false;
        if (other.getHttpRoute() != null
                && other.getHttpRoute().equals(this.getHttpRoute()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getTcpRoute() == null ^ this.getTcpRoute() == null)
            return false;
        if (other.getTcpRoute() != null && other.getTcpRoute().equals(this.getTcpRoute()) == false)
            return false;
        return true;
    }
}
