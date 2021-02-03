/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the HTTP context to use for the test authorizer request.
 * </p>
 */
public class HttpContext implements Serializable {
    /**
     * <p>
     * The header keys and values in an HTTP authorization request.
     * </p>
     */
    private java.util.Map<String, String> headers;

    /**
     * <p>
     * The query string keys and values in an HTTP authorization request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private String queryString;

    /**
     * <p>
     * The header keys and values in an HTTP authorization request.
     * </p>
     *
     * @return <p>
     *         The header keys and values in an HTTP authorization request.
     *         </p>
     */
    public java.util.Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * The header keys and values in an HTTP authorization request.
     * </p>
     *
     * @param headers <p>
     *            The header keys and values in an HTTP authorization request.
     *            </p>
     */
    public void setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * <p>
     * The header keys and values in an HTTP authorization request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param headers <p>
     *            The header keys and values in an HTTP authorization request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpContext withHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * <p>
     * The header keys and values in an HTTP authorization request.
     * </p>
     * <p>
     * The method adds a new key-value pair into headers parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into headers.
     * @param value The corresponding value of the entry to be added into
     *            headers.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpContext addheadersEntry(String key, String value) {
        if (null == this.headers) {
            this.headers = new java.util.HashMap<String, String>();
        }
        if (this.headers.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.headers.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into headers.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public HttpContext clearheadersEntries() {
        this.headers = null;
        return this;
    }

    /**
     * <p>
     * The query string keys and values in an HTTP authorization request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>
     *         The query string keys and values in an HTTP authorization
     *         request.
     *         </p>
     */
    public String getQueryString() {
        return queryString;
    }

    /**
     * <p>
     * The query string keys and values in an HTTP authorization request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param queryString <p>
     *            The query string keys and values in an HTTP authorization
     *            request.
     *            </p>
     */
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The query string keys and values in an HTTP authorization request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param queryString <p>
     *            The query string keys and values in an HTTP authorization
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpContext withQueryString(String queryString) {
        this.queryString = queryString;
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
        if (getQueryString() != null)
            sb.append("queryString: " + getQueryString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime * hashCode
                + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpContext == false)
            return false;
        HttpContext other = (HttpContext) obj;

        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null
                && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        return true;
    }
}
