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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies a cross-origin access rule for an Amazon S3 bucket.
 * </p>
 */
public class CORSRule implements Serializable {
    /**
     * <p>
     * Headers that are specified in the
     * <code>Access-Control-Request-Headers</code> header. These headers are
     * allowed in a preflight OPTIONS request. In response to any preflight
     * OPTIONS request, Amazon S3 returns any requested headers that are
     * allowed.
     * </p>
     */
    private java.util.List<String> allowedHeaders;

    /**
     * <p>
     * An HTTP method that you allow the origin to execute. Valid values are
     * <code>GET</code>, <code>PUT</code>, <code>HEAD</code>, <code>POST</code>,
     * and <code>DELETE</code>.
     * </p>
     */
    private java.util.List<String> allowedMethods;

    /**
     * <p>
     * One or more origins you want customers to be able to access the bucket
     * from.
     * </p>
     */
    private java.util.List<String> allowedOrigins;

    /**
     * <p>
     * One or more headers in the response that you want customers to be able to
     * access from their applications (for example, from a JavaScript
     * <code>XMLHttpRequest</code> object).
     * </p>
     */
    private java.util.List<String> exposeHeaders;

    /**
     * <p>
     * The time in seconds that your browser is to cache the preflight response
     * for the specified resource.
     * </p>
     */
    private Integer maxAgeSeconds;

    /**
     * <p>
     * Headers that are specified in the
     * <code>Access-Control-Request-Headers</code> header. These headers are
     * allowed in a preflight OPTIONS request. In response to any preflight
     * OPTIONS request, Amazon S3 returns any requested headers that are
     * allowed.
     * </p>
     *
     * @return <p>
     *         Headers that are specified in the
     *         <code>Access-Control-Request-Headers</code> header. These headers
     *         are allowed in a preflight OPTIONS request. In response to any
     *         preflight OPTIONS request, Amazon S3 returns any requested
     *         headers that are allowed.
     *         </p>
     */
    public java.util.List<String> getAllowedHeaders() {
        return allowedHeaders;
    }

    /**
     * <p>
     * Headers that are specified in the
     * <code>Access-Control-Request-Headers</code> header. These headers are
     * allowed in a preflight OPTIONS request. In response to any preflight
     * OPTIONS request, Amazon S3 returns any requested headers that are
     * allowed.
     * </p>
     *
     * @param allowedHeaders <p>
     *            Headers that are specified in the
     *            <code>Access-Control-Request-Headers</code> header. These
     *            headers are allowed in a preflight OPTIONS request. In
     *            response to any preflight OPTIONS request, Amazon S3 returns
     *            any requested headers that are allowed.
     *            </p>
     */
    public void setAllowedHeaders(java.util.Collection<String> allowedHeaders) {
        if (allowedHeaders == null) {
            this.allowedHeaders = null;
            return;
        }

        this.allowedHeaders = new java.util.ArrayList<String>(allowedHeaders);
    }

    /**
     * <p>
     * Headers that are specified in the
     * <code>Access-Control-Request-Headers</code> header. These headers are
     * allowed in a preflight OPTIONS request. In response to any preflight
     * OPTIONS request, Amazon S3 returns any requested headers that are
     * allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedHeaders <p>
     *            Headers that are specified in the
     *            <code>Access-Control-Request-Headers</code> header. These
     *            headers are allowed in a preflight OPTIONS request. In
     *            response to any preflight OPTIONS request, Amazon S3 returns
     *            any requested headers that are allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CORSRule withAllowedHeaders(String... allowedHeaders) {
        if (getAllowedHeaders() == null) {
            this.allowedHeaders = new java.util.ArrayList<String>(allowedHeaders.length);
        }
        for (String value : allowedHeaders) {
            this.allowedHeaders.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Headers that are specified in the
     * <code>Access-Control-Request-Headers</code> header. These headers are
     * allowed in a preflight OPTIONS request. In response to any preflight
     * OPTIONS request, Amazon S3 returns any requested headers that are
     * allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedHeaders <p>
     *            Headers that are specified in the
     *            <code>Access-Control-Request-Headers</code> header. These
     *            headers are allowed in a preflight OPTIONS request. In
     *            response to any preflight OPTIONS request, Amazon S3 returns
     *            any requested headers that are allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CORSRule withAllowedHeaders(java.util.Collection<String> allowedHeaders) {
        setAllowedHeaders(allowedHeaders);
        return this;
    }

    /**
     * <p>
     * An HTTP method that you allow the origin to execute. Valid values are
     * <code>GET</code>, <code>PUT</code>, <code>HEAD</code>, <code>POST</code>,
     * and <code>DELETE</code>.
     * </p>
     *
     * @return <p>
     *         An HTTP method that you allow the origin to execute. Valid values
     *         are <code>GET</code>, <code>PUT</code>, <code>HEAD</code>,
     *         <code>POST</code>, and <code>DELETE</code>.
     *         </p>
     */
    public java.util.List<String> getAllowedMethods() {
        return allowedMethods;
    }

    /**
     * <p>
     * An HTTP method that you allow the origin to execute. Valid values are
     * <code>GET</code>, <code>PUT</code>, <code>HEAD</code>, <code>POST</code>,
     * and <code>DELETE</code>.
     * </p>
     *
     * @param allowedMethods <p>
     *            An HTTP method that you allow the origin to execute. Valid
     *            values are <code>GET</code>, <code>PUT</code>,
     *            <code>HEAD</code>, <code>POST</code>, and <code>DELETE</code>.
     *            </p>
     */
    public void setAllowedMethods(java.util.Collection<String> allowedMethods) {
        if (allowedMethods == null) {
            this.allowedMethods = null;
            return;
        }

        this.allowedMethods = new java.util.ArrayList<String>(allowedMethods);
    }

    /**
     * <p>
     * An HTTP method that you allow the origin to execute. Valid values are
     * <code>GET</code>, <code>PUT</code>, <code>HEAD</code>, <code>POST</code>,
     * and <code>DELETE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedMethods <p>
     *            An HTTP method that you allow the origin to execute. Valid
     *            values are <code>GET</code>, <code>PUT</code>,
     *            <code>HEAD</code>, <code>POST</code>, and <code>DELETE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CORSRule withAllowedMethods(String... allowedMethods) {
        if (getAllowedMethods() == null) {
            this.allowedMethods = new java.util.ArrayList<String>(allowedMethods.length);
        }
        for (String value : allowedMethods) {
            this.allowedMethods.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An HTTP method that you allow the origin to execute. Valid values are
     * <code>GET</code>, <code>PUT</code>, <code>HEAD</code>, <code>POST</code>,
     * and <code>DELETE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedMethods <p>
     *            An HTTP method that you allow the origin to execute. Valid
     *            values are <code>GET</code>, <code>PUT</code>,
     *            <code>HEAD</code>, <code>POST</code>, and <code>DELETE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CORSRule withAllowedMethods(java.util.Collection<String> allowedMethods) {
        setAllowedMethods(allowedMethods);
        return this;
    }

    /**
     * <p>
     * One or more origins you want customers to be able to access the bucket
     * from.
     * </p>
     *
     * @return <p>
     *         One or more origins you want customers to be able to access the
     *         bucket from.
     *         </p>
     */
    public java.util.List<String> getAllowedOrigins() {
        return allowedOrigins;
    }

    /**
     * <p>
     * One or more origins you want customers to be able to access the bucket
     * from.
     * </p>
     *
     * @param allowedOrigins <p>
     *            One or more origins you want customers to be able to access
     *            the bucket from.
     *            </p>
     */
    public void setAllowedOrigins(java.util.Collection<String> allowedOrigins) {
        if (allowedOrigins == null) {
            this.allowedOrigins = null;
            return;
        }

        this.allowedOrigins = new java.util.ArrayList<String>(allowedOrigins);
    }

    /**
     * <p>
     * One or more origins you want customers to be able to access the bucket
     * from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedOrigins <p>
     *            One or more origins you want customers to be able to access
     *            the bucket from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CORSRule withAllowedOrigins(String... allowedOrigins) {
        if (getAllowedOrigins() == null) {
            this.allowedOrigins = new java.util.ArrayList<String>(allowedOrigins.length);
        }
        for (String value : allowedOrigins) {
            this.allowedOrigins.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more origins you want customers to be able to access the bucket
     * from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedOrigins <p>
     *            One or more origins you want customers to be able to access
     *            the bucket from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CORSRule withAllowedOrigins(java.util.Collection<String> allowedOrigins) {
        setAllowedOrigins(allowedOrigins);
        return this;
    }

    /**
     * <p>
     * One or more headers in the response that you want customers to be able to
     * access from their applications (for example, from a JavaScript
     * <code>XMLHttpRequest</code> object).
     * </p>
     *
     * @return <p>
     *         One or more headers in the response that you want customers to be
     *         able to access from their applications (for example, from a
     *         JavaScript <code>XMLHttpRequest</code> object).
     *         </p>
     */
    public java.util.List<String> getExposeHeaders() {
        return exposeHeaders;
    }

    /**
     * <p>
     * One or more headers in the response that you want customers to be able to
     * access from their applications (for example, from a JavaScript
     * <code>XMLHttpRequest</code> object).
     * </p>
     *
     * @param exposeHeaders <p>
     *            One or more headers in the response that you want customers to
     *            be able to access from their applications (for example, from a
     *            JavaScript <code>XMLHttpRequest</code> object).
     *            </p>
     */
    public void setExposeHeaders(java.util.Collection<String> exposeHeaders) {
        if (exposeHeaders == null) {
            this.exposeHeaders = null;
            return;
        }

        this.exposeHeaders = new java.util.ArrayList<String>(exposeHeaders);
    }

    /**
     * <p>
     * One or more headers in the response that you want customers to be able to
     * access from their applications (for example, from a JavaScript
     * <code>XMLHttpRequest</code> object).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exposeHeaders <p>
     *            One or more headers in the response that you want customers to
     *            be able to access from their applications (for example, from a
     *            JavaScript <code>XMLHttpRequest</code> object).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CORSRule withExposeHeaders(String... exposeHeaders) {
        if (getExposeHeaders() == null) {
            this.exposeHeaders = new java.util.ArrayList<String>(exposeHeaders.length);
        }
        for (String value : exposeHeaders) {
            this.exposeHeaders.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more headers in the response that you want customers to be able to
     * access from their applications (for example, from a JavaScript
     * <code>XMLHttpRequest</code> object).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exposeHeaders <p>
     *            One or more headers in the response that you want customers to
     *            be able to access from their applications (for example, from a
     *            JavaScript <code>XMLHttpRequest</code> object).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CORSRule withExposeHeaders(java.util.Collection<String> exposeHeaders) {
        setExposeHeaders(exposeHeaders);
        return this;
    }

    /**
     * <p>
     * The time in seconds that your browser is to cache the preflight response
     * for the specified resource.
     * </p>
     *
     * @return <p>
     *         The time in seconds that your browser is to cache the preflight
     *         response for the specified resource.
     *         </p>
     */
    public Integer getMaxAgeSeconds() {
        return maxAgeSeconds;
    }

    /**
     * <p>
     * The time in seconds that your browser is to cache the preflight response
     * for the specified resource.
     * </p>
     *
     * @param maxAgeSeconds <p>
     *            The time in seconds that your browser is to cache the
     *            preflight response for the specified resource.
     *            </p>
     */
    public void setMaxAgeSeconds(Integer maxAgeSeconds) {
        this.maxAgeSeconds = maxAgeSeconds;
    }

    /**
     * <p>
     * The time in seconds that your browser is to cache the preflight response
     * for the specified resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxAgeSeconds <p>
     *            The time in seconds that your browser is to cache the
     *            preflight response for the specified resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CORSRule withMaxAgeSeconds(Integer maxAgeSeconds) {
        this.maxAgeSeconds = maxAgeSeconds;
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
        if (getAllowedHeaders() != null)
            sb.append("AllowedHeaders: " + getAllowedHeaders() + ",");
        if (getAllowedMethods() != null)
            sb.append("AllowedMethods: " + getAllowedMethods() + ",");
        if (getAllowedOrigins() != null)
            sb.append("AllowedOrigins: " + getAllowedOrigins() + ",");
        if (getExposeHeaders() != null)
            sb.append("ExposeHeaders: " + getExposeHeaders() + ",");
        if (getMaxAgeSeconds() != null)
            sb.append("MaxAgeSeconds: " + getMaxAgeSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAllowedHeaders() == null) ? 0 : getAllowedHeaders().hashCode());
        hashCode = prime * hashCode
                + ((getAllowedMethods() == null) ? 0 : getAllowedMethods().hashCode());
        hashCode = prime * hashCode
                + ((getAllowedOrigins() == null) ? 0 : getAllowedOrigins().hashCode());
        hashCode = prime * hashCode
                + ((getExposeHeaders() == null) ? 0 : getExposeHeaders().hashCode());
        hashCode = prime * hashCode
                + ((getMaxAgeSeconds() == null) ? 0 : getMaxAgeSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CORSRule == false)
            return false;
        CORSRule other = (CORSRule) obj;

        if (other.getAllowedHeaders() == null ^ this.getAllowedHeaders() == null)
            return false;
        if (other.getAllowedHeaders() != null
                && other.getAllowedHeaders().equals(this.getAllowedHeaders()) == false)
            return false;
        if (other.getAllowedMethods() == null ^ this.getAllowedMethods() == null)
            return false;
        if (other.getAllowedMethods() != null
                && other.getAllowedMethods().equals(this.getAllowedMethods()) == false)
            return false;
        if (other.getAllowedOrigins() == null ^ this.getAllowedOrigins() == null)
            return false;
        if (other.getAllowedOrigins() != null
                && other.getAllowedOrigins().equals(this.getAllowedOrigins()) == false)
            return false;
        if (other.getExposeHeaders() == null ^ this.getExposeHeaders() == null)
            return false;
        if (other.getExposeHeaders() != null
                && other.getExposeHeaders().equals(this.getExposeHeaders()) == false)
            return false;
        if (other.getMaxAgeSeconds() == null ^ this.getMaxAgeSeconds() == null)
            return false;
        if (other.getMaxAgeSeconds() != null
                && other.getMaxAgeSeconds().equals(this.getMaxAgeSeconds()) == false)
            return false;
        return true;
    }
}
