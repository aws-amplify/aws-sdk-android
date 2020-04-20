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

/**
 * <p>
 * Represents a CORS configuration. Supported only for HTTP APIs. See <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html"
 * >Configuring CORS</a> for more information.
 * </p>
 */
public class Cors implements Serializable {
    /**
     * <p>
     * Specifies whether credentials are included in the CORS request. Supported
     * only for HTTP APIs.
     * </p>
     */
    private Boolean allowCredentials;

    /**
     * <p>
     * Represents a collection of allowed headers. Supported only for HTTP APIs.
     * </p>
     */
    private java.util.List<String> allowHeaders;

    /**
     * <p>
     * Represents a collection of allowed HTTP methods. Supported only for HTTP
     * APIs.
     * </p>
     */
    private java.util.List<String> allowMethods;

    /**
     * <p>
     * Represents a collection of allowed origins. Supported only for HTTP APIs.
     * </p>
     */
    private java.util.List<String> allowOrigins;

    /**
     * <p>
     * Represents a collection of exposed headers. Supported only for HTTP APIs.
     * </p>
     */
    private java.util.List<String> exposeHeaders;

    /**
     * <p>
     * The number of seconds that the browser should cache preflight request
     * results. Supported only for HTTP APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 86400<br/>
     */
    private Integer maxAge;

    /**
     * <p>
     * Specifies whether credentials are included in the CORS request. Supported
     * only for HTTP APIs.
     * </p>
     *
     * @return <p>
     *         Specifies whether credentials are included in the CORS request.
     *         Supported only for HTTP APIs.
     *         </p>
     */
    public Boolean isAllowCredentials() {
        return allowCredentials;
    }

    /**
     * <p>
     * Specifies whether credentials are included in the CORS request. Supported
     * only for HTTP APIs.
     * </p>
     *
     * @return <p>
     *         Specifies whether credentials are included in the CORS request.
     *         Supported only for HTTP APIs.
     *         </p>
     */
    public Boolean getAllowCredentials() {
        return allowCredentials;
    }

    /**
     * <p>
     * Specifies whether credentials are included in the CORS request. Supported
     * only for HTTP APIs.
     * </p>
     *
     * @param allowCredentials <p>
     *            Specifies whether credentials are included in the CORS
     *            request. Supported only for HTTP APIs.
     *            </p>
     */
    public void setAllowCredentials(Boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
    }

    /**
     * <p>
     * Specifies whether credentials are included in the CORS request. Supported
     * only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowCredentials <p>
     *            Specifies whether credentials are included in the CORS
     *            request. Supported only for HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cors withAllowCredentials(Boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
        return this;
    }

    /**
     * <p>
     * Represents a collection of allowed headers. Supported only for HTTP APIs.
     * </p>
     *
     * @return <p>
     *         Represents a collection of allowed headers. Supported only for
     *         HTTP APIs.
     *         </p>
     */
    public java.util.List<String> getAllowHeaders() {
        return allowHeaders;
    }

    /**
     * <p>
     * Represents a collection of allowed headers. Supported only for HTTP APIs.
     * </p>
     *
     * @param allowHeaders <p>
     *            Represents a collection of allowed headers. Supported only for
     *            HTTP APIs.
     *            </p>
     */
    public void setAllowHeaders(java.util.Collection<String> allowHeaders) {
        if (allowHeaders == null) {
            this.allowHeaders = null;
            return;
        }

        this.allowHeaders = new java.util.ArrayList<String>(allowHeaders);
    }

    /**
     * <p>
     * Represents a collection of allowed headers. Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowHeaders <p>
     *            Represents a collection of allowed headers. Supported only for
     *            HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cors withAllowHeaders(String... allowHeaders) {
        if (getAllowHeaders() == null) {
            this.allowHeaders = new java.util.ArrayList<String>(allowHeaders.length);
        }
        for (String value : allowHeaders) {
            this.allowHeaders.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents a collection of allowed headers. Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowHeaders <p>
     *            Represents a collection of allowed headers. Supported only for
     *            HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cors withAllowHeaders(java.util.Collection<String> allowHeaders) {
        setAllowHeaders(allowHeaders);
        return this;
    }

    /**
     * <p>
     * Represents a collection of allowed HTTP methods. Supported only for HTTP
     * APIs.
     * </p>
     *
     * @return <p>
     *         Represents a collection of allowed HTTP methods. Supported only
     *         for HTTP APIs.
     *         </p>
     */
    public java.util.List<String> getAllowMethods() {
        return allowMethods;
    }

    /**
     * <p>
     * Represents a collection of allowed HTTP methods. Supported only for HTTP
     * APIs.
     * </p>
     *
     * @param allowMethods <p>
     *            Represents a collection of allowed HTTP methods. Supported
     *            only for HTTP APIs.
     *            </p>
     */
    public void setAllowMethods(java.util.Collection<String> allowMethods) {
        if (allowMethods == null) {
            this.allowMethods = null;
            return;
        }

        this.allowMethods = new java.util.ArrayList<String>(allowMethods);
    }

    /**
     * <p>
     * Represents a collection of allowed HTTP methods. Supported only for HTTP
     * APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowMethods <p>
     *            Represents a collection of allowed HTTP methods. Supported
     *            only for HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cors withAllowMethods(String... allowMethods) {
        if (getAllowMethods() == null) {
            this.allowMethods = new java.util.ArrayList<String>(allowMethods.length);
        }
        for (String value : allowMethods) {
            this.allowMethods.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents a collection of allowed HTTP methods. Supported only for HTTP
     * APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowMethods <p>
     *            Represents a collection of allowed HTTP methods. Supported
     *            only for HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cors withAllowMethods(java.util.Collection<String> allowMethods) {
        setAllowMethods(allowMethods);
        return this;
    }

    /**
     * <p>
     * Represents a collection of allowed origins. Supported only for HTTP APIs.
     * </p>
     *
     * @return <p>
     *         Represents a collection of allowed origins. Supported only for
     *         HTTP APIs.
     *         </p>
     */
    public java.util.List<String> getAllowOrigins() {
        return allowOrigins;
    }

    /**
     * <p>
     * Represents a collection of allowed origins. Supported only for HTTP APIs.
     * </p>
     *
     * @param allowOrigins <p>
     *            Represents a collection of allowed origins. Supported only for
     *            HTTP APIs.
     *            </p>
     */
    public void setAllowOrigins(java.util.Collection<String> allowOrigins) {
        if (allowOrigins == null) {
            this.allowOrigins = null;
            return;
        }

        this.allowOrigins = new java.util.ArrayList<String>(allowOrigins);
    }

    /**
     * <p>
     * Represents a collection of allowed origins. Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowOrigins <p>
     *            Represents a collection of allowed origins. Supported only for
     *            HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cors withAllowOrigins(String... allowOrigins) {
        if (getAllowOrigins() == null) {
            this.allowOrigins = new java.util.ArrayList<String>(allowOrigins.length);
        }
        for (String value : allowOrigins) {
            this.allowOrigins.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents a collection of allowed origins. Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowOrigins <p>
     *            Represents a collection of allowed origins. Supported only for
     *            HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cors withAllowOrigins(java.util.Collection<String> allowOrigins) {
        setAllowOrigins(allowOrigins);
        return this;
    }

    /**
     * <p>
     * Represents a collection of exposed headers. Supported only for HTTP APIs.
     * </p>
     *
     * @return <p>
     *         Represents a collection of exposed headers. Supported only for
     *         HTTP APIs.
     *         </p>
     */
    public java.util.List<String> getExposeHeaders() {
        return exposeHeaders;
    }

    /**
     * <p>
     * Represents a collection of exposed headers. Supported only for HTTP APIs.
     * </p>
     *
     * @param exposeHeaders <p>
     *            Represents a collection of exposed headers. Supported only for
     *            HTTP APIs.
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
     * Represents a collection of exposed headers. Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exposeHeaders <p>
     *            Represents a collection of exposed headers. Supported only for
     *            HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cors withExposeHeaders(String... exposeHeaders) {
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
     * Represents a collection of exposed headers. Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exposeHeaders <p>
     *            Represents a collection of exposed headers. Supported only for
     *            HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cors withExposeHeaders(java.util.Collection<String> exposeHeaders) {
        setExposeHeaders(exposeHeaders);
        return this;
    }

    /**
     * <p>
     * The number of seconds that the browser should cache preflight request
     * results. Supported only for HTTP APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 86400<br/>
     *
     * @return <p>
     *         The number of seconds that the browser should cache preflight
     *         request results. Supported only for HTTP APIs.
     *         </p>
     */
    public Integer getMaxAge() {
        return maxAge;
    }

    /**
     * <p>
     * The number of seconds that the browser should cache preflight request
     * results. Supported only for HTTP APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 86400<br/>
     *
     * @param maxAge <p>
     *            The number of seconds that the browser should cache preflight
     *            request results. Supported only for HTTP APIs.
     *            </p>
     */
    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    /**
     * <p>
     * The number of seconds that the browser should cache preflight request
     * results. Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 86400<br/>
     *
     * @param maxAge <p>
     *            The number of seconds that the browser should cache preflight
     *            request results. Supported only for HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cors withMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
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
        if (getAllowCredentials() != null)
            sb.append("AllowCredentials: " + getAllowCredentials() + ",");
        if (getAllowHeaders() != null)
            sb.append("AllowHeaders: " + getAllowHeaders() + ",");
        if (getAllowMethods() != null)
            sb.append("AllowMethods: " + getAllowMethods() + ",");
        if (getAllowOrigins() != null)
            sb.append("AllowOrigins: " + getAllowOrigins() + ",");
        if (getExposeHeaders() != null)
            sb.append("ExposeHeaders: " + getExposeHeaders() + ",");
        if (getMaxAge() != null)
            sb.append("MaxAge: " + getMaxAge());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAllowCredentials() == null) ? 0 : getAllowCredentials().hashCode());
        hashCode = prime * hashCode
                + ((getAllowHeaders() == null) ? 0 : getAllowHeaders().hashCode());
        hashCode = prime * hashCode
                + ((getAllowMethods() == null) ? 0 : getAllowMethods().hashCode());
        hashCode = prime * hashCode
                + ((getAllowOrigins() == null) ? 0 : getAllowOrigins().hashCode());
        hashCode = prime * hashCode
                + ((getExposeHeaders() == null) ? 0 : getExposeHeaders().hashCode());
        hashCode = prime * hashCode + ((getMaxAge() == null) ? 0 : getMaxAge().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Cors == false)
            return false;
        Cors other = (Cors) obj;

        if (other.getAllowCredentials() == null ^ this.getAllowCredentials() == null)
            return false;
        if (other.getAllowCredentials() != null
                && other.getAllowCredentials().equals(this.getAllowCredentials()) == false)
            return false;
        if (other.getAllowHeaders() == null ^ this.getAllowHeaders() == null)
            return false;
        if (other.getAllowHeaders() != null
                && other.getAllowHeaders().equals(this.getAllowHeaders()) == false)
            return false;
        if (other.getAllowMethods() == null ^ this.getAllowMethods() == null)
            return false;
        if (other.getAllowMethods() != null
                && other.getAllowMethods().equals(this.getAllowMethods()) == false)
            return false;
        if (other.getAllowOrigins() == null ^ this.getAllowOrigins() == null)
            return false;
        if (other.getAllowOrigins() != null
                && other.getAllowOrigins().equals(this.getAllowOrigins()) == false)
            return false;
        if (other.getExposeHeaders() == null ^ this.getExposeHeaders() == null)
            return false;
        if (other.getExposeHeaders() != null
                && other.getExposeHeaders().equals(this.getExposeHeaders()) == false)
            return false;
        if (other.getMaxAge() == null ^ this.getMaxAge() == null)
            return false;
        if (other.getMaxAge() != null && other.getMaxAge().equals(this.getMaxAge()) == false)
            return false;
        return true;
    }
}
