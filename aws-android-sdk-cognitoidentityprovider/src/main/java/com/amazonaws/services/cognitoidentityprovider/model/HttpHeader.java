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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The HTTP header.
 * </p>
 */
public class HttpHeader implements Serializable {
    /**
     * <p>
     * The header name
     * </p>
     */
    private String headerName;

    /**
     * <p>
     * The header value.
     * </p>
     */
    private String headerValue;

    /**
     * <p>
     * The header name
     * </p>
     *
     * @return <p>
     *         The header name
     *         </p>
     */
    public String getHeaderName() {
        return headerName;
    }

    /**
     * <p>
     * The header name
     * </p>
     *
     * @param headerName <p>
     *            The header name
     *            </p>
     */
    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    /**
     * <p>
     * The header name
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param headerName <p>
     *            The header name
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpHeader withHeaderName(String headerName) {
        this.headerName = headerName;
        return this;
    }

    /**
     * <p>
     * The header value.
     * </p>
     *
     * @return <p>
     *         The header value.
     *         </p>
     */
    public String getHeaderValue() {
        return headerValue;
    }

    /**
     * <p>
     * The header value.
     * </p>
     *
     * @param headerValue <p>
     *            The header value.
     *            </p>
     */
    public void setHeaderValue(String headerValue) {
        this.headerValue = headerValue;
    }

    /**
     * <p>
     * The header value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param headerValue <p>
     *            The header value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpHeader withHeaderValue(String headerValue) {
        this.headerValue = headerValue;
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
        if (getHeaderName() != null)
            sb.append("headerName: " + getHeaderName() + ",");
        if (getHeaderValue() != null)
            sb.append("headerValue: " + getHeaderValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeaderName() == null) ? 0 : getHeaderName().hashCode());
        hashCode = prime * hashCode
                + ((getHeaderValue() == null) ? 0 : getHeaderValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpHeader == false)
            return false;
        HttpHeader other = (HttpHeader) obj;

        if (other.getHeaderName() == null ^ this.getHeaderName() == null)
            return false;
        if (other.getHeaderName() != null
                && other.getHeaderName().equals(this.getHeaderName()) == false)
            return false;
        if (other.getHeaderValue() == null ^ this.getHeaderValue() == null)
            return false;
        if (other.getHeaderValue() != null
                && other.getHeaderValue().equals(this.getHeaderValue()) == false)
            return false;
        return true;
    }
}
