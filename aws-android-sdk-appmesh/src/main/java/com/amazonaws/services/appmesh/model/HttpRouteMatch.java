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
 * An object that represents the requirements for a route to match HTTP requests
 * for a virtual router.
 * </p>
 */
public class HttpRouteMatch implements Serializable {
    /**
     * <p>
     * An object that represents the client request headers to match on.
     * </p>
     */
    private java.util.List<HttpRouteHeader> headers;

    /**
     * <p>
     * The client request method to match on. Specify only one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECT, DELETE, GET, HEAD, OPTIONS, PATCH, POST,
     * PUT, TRACE
     */
    private String method;

    /**
     * <p>
     * Specifies the path to match requests with. This parameter must always
     * start with <code>/</code>, which by itself matches all requests to the
     * virtual service name. You can also match for path-based routing of
     * requests. For example, if your virtual service name is
     * <code>my-service.local</code> and you want the route to match requests to
     * <code>my-service.local/metrics</code>, your prefix should be
     * <code>/metrics</code>.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * The client request scheme to match on. Specify only one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http, https
     */
    private String scheme;

    /**
     * <p>
     * An object that represents the client request headers to match on.
     * </p>
     *
     * @return <p>
     *         An object that represents the client request headers to match on.
     *         </p>
     */
    public java.util.List<HttpRouteHeader> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * An object that represents the client request headers to match on.
     * </p>
     *
     * @param headers <p>
     *            An object that represents the client request headers to match
     *            on.
     *            </p>
     */
    public void setHeaders(java.util.Collection<HttpRouteHeader> headers) {
        if (headers == null) {
            this.headers = null;
            return;
        }

        this.headers = new java.util.ArrayList<HttpRouteHeader>(headers);
    }

    /**
     * <p>
     * An object that represents the client request headers to match on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param headers <p>
     *            An object that represents the client request headers to match
     *            on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpRouteMatch withHeaders(HttpRouteHeader... headers) {
        if (getHeaders() == null) {
            this.headers = new java.util.ArrayList<HttpRouteHeader>(headers.length);
        }
        for (HttpRouteHeader value : headers) {
            this.headers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An object that represents the client request headers to match on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param headers <p>
     *            An object that represents the client request headers to match
     *            on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpRouteMatch withHeaders(java.util.Collection<HttpRouteHeader> headers) {
        setHeaders(headers);
        return this;
    }

    /**
     * <p>
     * The client request method to match on. Specify only one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECT, DELETE, GET, HEAD, OPTIONS, PATCH, POST,
     * PUT, TRACE
     *
     * @return <p>
     *         The client request method to match on. Specify only one.
     *         </p>
     * @see HttpMethod
     */
    public String getMethod() {
        return method;
    }

    /**
     * <p>
     * The client request method to match on. Specify only one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECT, DELETE, GET, HEAD, OPTIONS, PATCH, POST,
     * PUT, TRACE
     *
     * @param method <p>
     *            The client request method to match on. Specify only one.
     *            </p>
     * @see HttpMethod
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * <p>
     * The client request method to match on. Specify only one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECT, DELETE, GET, HEAD, OPTIONS, PATCH, POST,
     * PUT, TRACE
     *
     * @param method <p>
     *            The client request method to match on. Specify only one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HttpMethod
     */
    public HttpRouteMatch withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * <p>
     * The client request method to match on. Specify only one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECT, DELETE, GET, HEAD, OPTIONS, PATCH, POST,
     * PUT, TRACE
     *
     * @param method <p>
     *            The client request method to match on. Specify only one.
     *            </p>
     * @see HttpMethod
     */
    public void setMethod(HttpMethod method) {
        this.method = method.toString();
    }

    /**
     * <p>
     * The client request method to match on. Specify only one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECT, DELETE, GET, HEAD, OPTIONS, PATCH, POST,
     * PUT, TRACE
     *
     * @param method <p>
     *            The client request method to match on. Specify only one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HttpMethod
     */
    public HttpRouteMatch withMethod(HttpMethod method) {
        this.method = method.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the path to match requests with. This parameter must always
     * start with <code>/</code>, which by itself matches all requests to the
     * virtual service name. You can also match for path-based routing of
     * requests. For example, if your virtual service name is
     * <code>my-service.local</code> and you want the route to match requests to
     * <code>my-service.local/metrics</code>, your prefix should be
     * <code>/metrics</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the path to match requests with. This parameter must
     *         always start with <code>/</code>, which by itself matches all
     *         requests to the virtual service name. You can also match for
     *         path-based routing of requests. For example, if your virtual
     *         service name is <code>my-service.local</code> and you want the
     *         route to match requests to <code>my-service.local/metrics</code>,
     *         your prefix should be <code>/metrics</code>.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * Specifies the path to match requests with. This parameter must always
     * start with <code>/</code>, which by itself matches all requests to the
     * virtual service name. You can also match for path-based routing of
     * requests. For example, if your virtual service name is
     * <code>my-service.local</code> and you want the route to match requests to
     * <code>my-service.local/metrics</code>, your prefix should be
     * <code>/metrics</code>.
     * </p>
     *
     * @param prefix <p>
     *            Specifies the path to match requests with. This parameter must
     *            always start with <code>/</code>, which by itself matches all
     *            requests to the virtual service name. You can also match for
     *            path-based routing of requests. For example, if your virtual
     *            service name is <code>my-service.local</code> and you want the
     *            route to match requests to
     *            <code>my-service.local/metrics</code>, your prefix should be
     *            <code>/metrics</code>.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * Specifies the path to match requests with. This parameter must always
     * start with <code>/</code>, which by itself matches all requests to the
     * virtual service name. You can also match for path-based routing of
     * requests. For example, if your virtual service name is
     * <code>my-service.local</code> and you want the route to match requests to
     * <code>my-service.local/metrics</code>, your prefix should be
     * <code>/metrics</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            Specifies the path to match requests with. This parameter must
     *            always start with <code>/</code>, which by itself matches all
     *            requests to the virtual service name. You can also match for
     *            path-based routing of requests. For example, if your virtual
     *            service name is <code>my-service.local</code> and you want the
     *            route to match requests to
     *            <code>my-service.local/metrics</code>, your prefix should be
     *            <code>/metrics</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpRouteMatch withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * The client request scheme to match on. Specify only one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http, https
     *
     * @return <p>
     *         The client request scheme to match on. Specify only one.
     *         </p>
     * @see HttpScheme
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * <p>
     * The client request scheme to match on. Specify only one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http, https
     *
     * @param scheme <p>
     *            The client request scheme to match on. Specify only one.
     *            </p>
     * @see HttpScheme
     */
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    /**
     * <p>
     * The client request scheme to match on. Specify only one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http, https
     *
     * @param scheme <p>
     *            The client request scheme to match on. Specify only one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HttpScheme
     */
    public HttpRouteMatch withScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * <p>
     * The client request scheme to match on. Specify only one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http, https
     *
     * @param scheme <p>
     *            The client request scheme to match on. Specify only one.
     *            </p>
     * @see HttpScheme
     */
    public void setScheme(HttpScheme scheme) {
        this.scheme = scheme.toString();
    }

    /**
     * <p>
     * The client request scheme to match on. Specify only one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http, https
     *
     * @param scheme <p>
     *            The client request scheme to match on. Specify only one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HttpScheme
     */
    public HttpRouteMatch withScheme(HttpScheme scheme) {
        this.scheme = scheme.toString();
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
        if (getHeaders() != null)
            sb.append("headers: " + getHeaders() + ",");
        if (getMethod() != null)
            sb.append("method: " + getMethod() + ",");
        if (getPrefix() != null)
            sb.append("prefix: " + getPrefix() + ",");
        if (getScheme() != null)
            sb.append("scheme: " + getScheme());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime * hashCode + ((getMethod() == null) ? 0 : getMethod().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getScheme() == null) ? 0 : getScheme().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpRouteMatch == false)
            return false;
        HttpRouteMatch other = (HttpRouteMatch) obj;

        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getMethod() == null ^ this.getMethod() == null)
            return false;
        if (other.getMethod() != null && other.getMethod().equals(this.getMethod()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getScheme() == null ^ this.getScheme() == null)
            return false;
        if (other.getScheme() != null && other.getScheme().equals(this.getScheme()) == false)
            return false;
        return true;
    }
}
