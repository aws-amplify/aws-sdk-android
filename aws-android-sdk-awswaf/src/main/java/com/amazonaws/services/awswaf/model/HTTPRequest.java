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

package com.amazonaws.services.awswaf.model;

import java.io.Serializable;

/**
 * <note>
 * <p>
 * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
 * >AWS WAF Classic</a> in the developer guide.
 * </p>
 * <p>
 * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the
 * <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS
 * WAF Developer Guide</a>. With the latest version, AWS WAF has a single set of
 * endpoints for regional and global use.
 * </p>
 * </note>
 * <p>
 * The response from a <a>GetSampledRequests</a> request includes an
 * <code>HTTPRequest</code> complex type that appears as <code>Request</code> in
 * the response syntax. <code>HTTPRequest</code> contains information about one
 * of the web requests that were returned by <code>GetSampledRequests</code>.
 * </p>
 */
public class HTTPRequest implements Serializable {
    /**
     * <p>
     * The IP address that the request originated from. If the
     * <code>WebACL</code> is associated with a CloudFront distribution, this is
     * the value of one of the following fields in CloudFront access logs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>c-ip</code>, if the viewer did not use an HTTP proxy or a load
     * balancer to send the request
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-forwarded-for</code>, if the viewer did use an HTTP proxy or a
     * load balancer to send the request
     * </p>
     * </li>
     * </ul>
     */
    private String clientIP;

    /**
     * <p>
     * The two-letter country code for the country that the request originated
     * from. For a current list of country codes, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1
     * alpha-2</a>.
     * </p>
     */
    private String country;

    /**
     * <p>
     * The part of a web request that identifies the resource, for example,
     * <code>/images/daily-ad.jpg</code>.
     * </p>
     */
    private String uRI;

    /**
     * <p>
     * The HTTP method specified in the sampled web request. CloudFront supports
     * the following methods: <code>DELETE</code>, <code>GET</code>,
     * <code>HEAD</code>, <code>OPTIONS</code>, <code>PATCH</code>,
     * <code>POST</code>, and <code>PUT</code>.
     * </p>
     */
    private String method;

    /**
     * <p>
     * The HTTP version specified in the sampled web request, for example,
     * <code>HTTP/1.1</code>.
     * </p>
     */
    private String hTTPVersion;

    /**
     * <p>
     * A complex type that contains two values for each header in the sampled
     * web request: the name of the header and the value of the header.
     * </p>
     */
    private java.util.List<HTTPHeader> headers;

    /**
     * <p>
     * The IP address that the request originated from. If the
     * <code>WebACL</code> is associated with a CloudFront distribution, this is
     * the value of one of the following fields in CloudFront access logs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>c-ip</code>, if the viewer did not use an HTTP proxy or a load
     * balancer to send the request
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-forwarded-for</code>, if the viewer did use an HTTP proxy or a
     * load balancer to send the request
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The IP address that the request originated from. If the
     *         <code>WebACL</code> is associated with a CloudFront distribution,
     *         this is the value of one of the following fields in CloudFront
     *         access logs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>c-ip</code>, if the viewer did not use an HTTP proxy or a
     *         load balancer to send the request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>x-forwarded-for</code>, if the viewer did use an HTTP proxy
     *         or a load balancer to send the request
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getClientIP() {
        return clientIP;
    }

    /**
     * <p>
     * The IP address that the request originated from. If the
     * <code>WebACL</code> is associated with a CloudFront distribution, this is
     * the value of one of the following fields in CloudFront access logs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>c-ip</code>, if the viewer did not use an HTTP proxy or a load
     * balancer to send the request
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-forwarded-for</code>, if the viewer did use an HTTP proxy or a
     * load balancer to send the request
     * </p>
     * </li>
     * </ul>
     *
     * @param clientIP <p>
     *            The IP address that the request originated from. If the
     *            <code>WebACL</code> is associated with a CloudFront
     *            distribution, this is the value of one of the following fields
     *            in CloudFront access logs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>c-ip</code>, if the viewer did not use an HTTP proxy or
     *            a load balancer to send the request
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>x-forwarded-for</code>, if the viewer did use an HTTP
     *            proxy or a load balancer to send the request
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }

    /**
     * <p>
     * The IP address that the request originated from. If the
     * <code>WebACL</code> is associated with a CloudFront distribution, this is
     * the value of one of the following fields in CloudFront access logs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>c-ip</code>, if the viewer did not use an HTTP proxy or a load
     * balancer to send the request
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-forwarded-for</code>, if the viewer did use an HTTP proxy or a
     * load balancer to send the request
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientIP <p>
     *            The IP address that the request originated from. If the
     *            <code>WebACL</code> is associated with a CloudFront
     *            distribution, this is the value of one of the following fields
     *            in CloudFront access logs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>c-ip</code>, if the viewer did not use an HTTP proxy or
     *            a load balancer to send the request
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>x-forwarded-for</code>, if the viewer did use an HTTP
     *            proxy or a load balancer to send the request
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HTTPRequest withClientIP(String clientIP) {
        this.clientIP = clientIP;
        return this;
    }

    /**
     * <p>
     * The two-letter country code for the country that the request originated
     * from. For a current list of country codes, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1
     * alpha-2</a>.
     * </p>
     *
     * @return <p>
     *         The two-letter country code for the country that the request
     *         originated from. For a current list of country codes, see the
     *         Wikipedia entry <a
     *         href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     *         3166-1 alpha-2</a>.
     *         </p>
     */
    public String getCountry() {
        return country;
    }

    /**
     * <p>
     * The two-letter country code for the country that the request originated
     * from. For a current list of country codes, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1
     * alpha-2</a>.
     * </p>
     *
     * @param country <p>
     *            The two-letter country code for the country that the request
     *            originated from. For a current list of country codes, see the
     *            Wikipedia entry <a
     *            href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     *            3166-1 alpha-2</a>.
     *            </p>
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The two-letter country code for the country that the request originated
     * from. For a current list of country codes, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1
     * alpha-2</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param country <p>
     *            The two-letter country code for the country that the request
     *            originated from. For a current list of country codes, see the
     *            Wikipedia entry <a
     *            href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     *            3166-1 alpha-2</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HTTPRequest withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * <p>
     * The part of a web request that identifies the resource, for example,
     * <code>/images/daily-ad.jpg</code>.
     * </p>
     *
     * @return <p>
     *         The part of a web request that identifies the resource, for
     *         example, <code>/images/daily-ad.jpg</code>.
     *         </p>
     */
    public String getURI() {
        return uRI;
    }

    /**
     * <p>
     * The part of a web request that identifies the resource, for example,
     * <code>/images/daily-ad.jpg</code>.
     * </p>
     *
     * @param uRI <p>
     *            The part of a web request that identifies the resource, for
     *            example, <code>/images/daily-ad.jpg</code>.
     *            </p>
     */
    public void setURI(String uRI) {
        this.uRI = uRI;
    }

    /**
     * <p>
     * The part of a web request that identifies the resource, for example,
     * <code>/images/daily-ad.jpg</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uRI <p>
     *            The part of a web request that identifies the resource, for
     *            example, <code>/images/daily-ad.jpg</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HTTPRequest withURI(String uRI) {
        this.uRI = uRI;
        return this;
    }

    /**
     * <p>
     * The HTTP method specified in the sampled web request. CloudFront supports
     * the following methods: <code>DELETE</code>, <code>GET</code>,
     * <code>HEAD</code>, <code>OPTIONS</code>, <code>PATCH</code>,
     * <code>POST</code>, and <code>PUT</code>.
     * </p>
     *
     * @return <p>
     *         The HTTP method specified in the sampled web request. CloudFront
     *         supports the following methods: <code>DELETE</code>,
     *         <code>GET</code>, <code>HEAD</code>, <code>OPTIONS</code>,
     *         <code>PATCH</code>, <code>POST</code>, and <code>PUT</code>.
     *         </p>
     */
    public String getMethod() {
        return method;
    }

    /**
     * <p>
     * The HTTP method specified in the sampled web request. CloudFront supports
     * the following methods: <code>DELETE</code>, <code>GET</code>,
     * <code>HEAD</code>, <code>OPTIONS</code>, <code>PATCH</code>,
     * <code>POST</code>, and <code>PUT</code>.
     * </p>
     *
     * @param method <p>
     *            The HTTP method specified in the sampled web request.
     *            CloudFront supports the following methods: <code>DELETE</code>, <code>GET</code>, <code>HEAD</code>, <code>OPTIONS</code>,
     *            <code>PATCH</code>, <code>POST</code>, and <code>PUT</code>.
     *            </p>
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * <p>
     * The HTTP method specified in the sampled web request. CloudFront supports
     * the following methods: <code>DELETE</code>, <code>GET</code>,
     * <code>HEAD</code>, <code>OPTIONS</code>, <code>PATCH</code>,
     * <code>POST</code>, and <code>PUT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param method <p>
     *            The HTTP method specified in the sampled web request.
     *            CloudFront supports the following methods: <code>DELETE</code>, <code>GET</code>, <code>HEAD</code>, <code>OPTIONS</code>,
     *            <code>PATCH</code>, <code>POST</code>, and <code>PUT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HTTPRequest withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * <p>
     * The HTTP version specified in the sampled web request, for example,
     * <code>HTTP/1.1</code>.
     * </p>
     *
     * @return <p>
     *         The HTTP version specified in the sampled web request, for
     *         example, <code>HTTP/1.1</code>.
     *         </p>
     */
    public String getHTTPVersion() {
        return hTTPVersion;
    }

    /**
     * <p>
     * The HTTP version specified in the sampled web request, for example,
     * <code>HTTP/1.1</code>.
     * </p>
     *
     * @param hTTPVersion <p>
     *            The HTTP version specified in the sampled web request, for
     *            example, <code>HTTP/1.1</code>.
     *            </p>
     */
    public void setHTTPVersion(String hTTPVersion) {
        this.hTTPVersion = hTTPVersion;
    }

    /**
     * <p>
     * The HTTP version specified in the sampled web request, for example,
     * <code>HTTP/1.1</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hTTPVersion <p>
     *            The HTTP version specified in the sampled web request, for
     *            example, <code>HTTP/1.1</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HTTPRequest withHTTPVersion(String hTTPVersion) {
        this.hTTPVersion = hTTPVersion;
        return this;
    }

    /**
     * <p>
     * A complex type that contains two values for each header in the sampled
     * web request: the name of the header and the value of the header.
     * </p>
     *
     * @return <p>
     *         A complex type that contains two values for each header in the
     *         sampled web request: the name of the header and the value of the
     *         header.
     *         </p>
     */
    public java.util.List<HTTPHeader> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * A complex type that contains two values for each header in the sampled
     * web request: the name of the header and the value of the header.
     * </p>
     *
     * @param headers <p>
     *            A complex type that contains two values for each header in the
     *            sampled web request: the name of the header and the value of
     *            the header.
     *            </p>
     */
    public void setHeaders(java.util.Collection<HTTPHeader> headers) {
        if (headers == null) {
            this.headers = null;
            return;
        }

        this.headers = new java.util.ArrayList<HTTPHeader>(headers);
    }

    /**
     * <p>
     * A complex type that contains two values for each header in the sampled
     * web request: the name of the header and the value of the header.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param headers <p>
     *            A complex type that contains two values for each header in the
     *            sampled web request: the name of the header and the value of
     *            the header.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HTTPRequest withHeaders(HTTPHeader... headers) {
        if (getHeaders() == null) {
            this.headers = new java.util.ArrayList<HTTPHeader>(headers.length);
        }
        for (HTTPHeader value : headers) {
            this.headers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains two values for each header in the sampled
     * web request: the name of the header and the value of the header.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param headers <p>
     *            A complex type that contains two values for each header in the
     *            sampled web request: the name of the header and the value of
     *            the header.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HTTPRequest withHeaders(java.util.Collection<HTTPHeader> headers) {
        setHeaders(headers);
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
        if (getClientIP() != null)
            sb.append("ClientIP: " + getClientIP() + ",");
        if (getCountry() != null)
            sb.append("Country: " + getCountry() + ",");
        if (getURI() != null)
            sb.append("URI: " + getURI() + ",");
        if (getMethod() != null)
            sb.append("Method: " + getMethod() + ",");
        if (getHTTPVersion() != null)
            sb.append("HTTPVersion: " + getHTTPVersion() + ",");
        if (getHeaders() != null)
            sb.append("Headers: " + getHeaders());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientIP() == null) ? 0 : getClientIP().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getURI() == null) ? 0 : getURI().hashCode());
        hashCode = prime * hashCode + ((getMethod() == null) ? 0 : getMethod().hashCode());
        hashCode = prime * hashCode
                + ((getHTTPVersion() == null) ? 0 : getHTTPVersion().hashCode());
        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HTTPRequest == false)
            return false;
        HTTPRequest other = (HTTPRequest) obj;

        if (other.getClientIP() == null ^ this.getClientIP() == null)
            return false;
        if (other.getClientIP() != null && other.getClientIP().equals(this.getClientIP()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getURI() == null ^ this.getURI() == null)
            return false;
        if (other.getURI() != null && other.getURI().equals(this.getURI()) == false)
            return false;
        if (other.getMethod() == null ^ this.getMethod() == null)
            return false;
        if (other.getMethod() != null && other.getMethod().equals(this.getMethod()) == false)
            return false;
        if (other.getHTTPVersion() == null ^ this.getHTTPVersion() == null)
            return false;
        if (other.getHTTPVersion() != null
                && other.getHTTPVersion().equals(this.getHTTPVersion()) == false)
            return false;
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        return true;
    }
}
