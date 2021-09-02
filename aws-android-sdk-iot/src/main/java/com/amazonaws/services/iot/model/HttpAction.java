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
 * Send data to an HTTPS endpoint.
 * </p>
 */
public class HttpAction implements Serializable {
    /**
     * <p>
     * The endpoint URL. If substitution templates are used in the URL, you must
     * also specify a <code>confirmationUrl</code>. If this is a new
     * destination, a new <code>TopicRuleDestination</code> is created if
     * possible.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     */
    private String url;

    /**
     * <p>
     * The URL to which IoT sends a confirmation message. The value of the
     * confirmation URL must be a prefix of the endpoint URL. If you do not
     * specify a confirmation URL IoT uses the endpoint URL as the confirmation
     * URL. If you use substitution templates in the confirmationUrl, you must
     * create and enable topic rule destinations that match each possible value
     * of the substitution template before traffic is allowed to your endpoint
     * URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     */
    private String confirmationUrl;

    /**
     * <p>
     * The HTTP headers to send with the message data.
     * </p>
     */
    private java.util.List<HttpActionHeader> headers;

    /**
     * <p>
     * The authentication method to use when sending data to an HTTPS endpoint.
     * </p>
     */
    private HttpAuthorization auth;

    /**
     * <p>
     * The endpoint URL. If substitution templates are used in the URL, you must
     * also specify a <code>confirmationUrl</code>. If this is a new
     * destination, a new <code>TopicRuleDestination</code> is created if
     * possible.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @return <p>
     *         The endpoint URL. If substitution templates are used in the URL,
     *         you must also specify a <code>confirmationUrl</code>. If this is
     *         a new destination, a new <code>TopicRuleDestination</code> is
     *         created if possible.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The endpoint URL. If substitution templates are used in the URL, you must
     * also specify a <code>confirmationUrl</code>. If this is a new
     * destination, a new <code>TopicRuleDestination</code> is created if
     * possible.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param url <p>
     *            The endpoint URL. If substitution templates are used in the
     *            URL, you must also specify a <code>confirmationUrl</code>. If
     *            this is a new destination, a new
     *            <code>TopicRuleDestination</code> is created if possible.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The endpoint URL. If substitution templates are used in the URL, you must
     * also specify a <code>confirmationUrl</code>. If this is a new
     * destination, a new <code>TopicRuleDestination</code> is created if
     * possible.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param url <p>
     *            The endpoint URL. If substitution templates are used in the
     *            URL, you must also specify a <code>confirmationUrl</code>. If
     *            this is a new destination, a new
     *            <code>TopicRuleDestination</code> is created if possible.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpAction withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * <p>
     * The URL to which IoT sends a confirmation message. The value of the
     * confirmation URL must be a prefix of the endpoint URL. If you do not
     * specify a confirmation URL IoT uses the endpoint URL as the confirmation
     * URL. If you use substitution templates in the confirmationUrl, you must
     * create and enable topic rule destinations that match each possible value
     * of the substitution template before traffic is allowed to your endpoint
     * URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @return <p>
     *         The URL to which IoT sends a confirmation message. The value of
     *         the confirmation URL must be a prefix of the endpoint URL. If you
     *         do not specify a confirmation URL IoT uses the endpoint URL as
     *         the confirmation URL. If you use substitution templates in the
     *         confirmationUrl, you must create and enable topic rule
     *         destinations that match each possible value of the substitution
     *         template before traffic is allowed to your endpoint URL.
     *         </p>
     */
    public String getConfirmationUrl() {
        return confirmationUrl;
    }

    /**
     * <p>
     * The URL to which IoT sends a confirmation message. The value of the
     * confirmation URL must be a prefix of the endpoint URL. If you do not
     * specify a confirmation URL IoT uses the endpoint URL as the confirmation
     * URL. If you use substitution templates in the confirmationUrl, you must
     * create and enable topic rule destinations that match each possible value
     * of the substitution template before traffic is allowed to your endpoint
     * URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param confirmationUrl <p>
     *            The URL to which IoT sends a confirmation message. The value
     *            of the confirmation URL must be a prefix of the endpoint URL.
     *            If you do not specify a confirmation URL IoT uses the endpoint
     *            URL as the confirmation URL. If you use substitution templates
     *            in the confirmationUrl, you must create and enable topic rule
     *            destinations that match each possible value of the
     *            substitution template before traffic is allowed to your
     *            endpoint URL.
     *            </p>
     */
    public void setConfirmationUrl(String confirmationUrl) {
        this.confirmationUrl = confirmationUrl;
    }

    /**
     * <p>
     * The URL to which IoT sends a confirmation message. The value of the
     * confirmation URL must be a prefix of the endpoint URL. If you do not
     * specify a confirmation URL IoT uses the endpoint URL as the confirmation
     * URL. If you use substitution templates in the confirmationUrl, you must
     * create and enable topic rule destinations that match each possible value
     * of the substitution template before traffic is allowed to your endpoint
     * URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param confirmationUrl <p>
     *            The URL to which IoT sends a confirmation message. The value
     *            of the confirmation URL must be a prefix of the endpoint URL.
     *            If you do not specify a confirmation URL IoT uses the endpoint
     *            URL as the confirmation URL. If you use substitution templates
     *            in the confirmationUrl, you must create and enable topic rule
     *            destinations that match each possible value of the
     *            substitution template before traffic is allowed to your
     *            endpoint URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpAction withConfirmationUrl(String confirmationUrl) {
        this.confirmationUrl = confirmationUrl;
        return this;
    }

    /**
     * <p>
     * The HTTP headers to send with the message data.
     * </p>
     *
     * @return <p>
     *         The HTTP headers to send with the message data.
     *         </p>
     */
    public java.util.List<HttpActionHeader> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * The HTTP headers to send with the message data.
     * </p>
     *
     * @param headers <p>
     *            The HTTP headers to send with the message data.
     *            </p>
     */
    public void setHeaders(java.util.Collection<HttpActionHeader> headers) {
        if (headers == null) {
            this.headers = null;
            return;
        }

        this.headers = new java.util.ArrayList<HttpActionHeader>(headers);
    }

    /**
     * <p>
     * The HTTP headers to send with the message data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param headers <p>
     *            The HTTP headers to send with the message data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpAction withHeaders(HttpActionHeader... headers) {
        if (getHeaders() == null) {
            this.headers = new java.util.ArrayList<HttpActionHeader>(headers.length);
        }
        for (HttpActionHeader value : headers) {
            this.headers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The HTTP headers to send with the message data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param headers <p>
     *            The HTTP headers to send with the message data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpAction withHeaders(java.util.Collection<HttpActionHeader> headers) {
        setHeaders(headers);
        return this;
    }

    /**
     * <p>
     * The authentication method to use when sending data to an HTTPS endpoint.
     * </p>
     *
     * @return <p>
     *         The authentication method to use when sending data to an HTTPS
     *         endpoint.
     *         </p>
     */
    public HttpAuthorization getAuth() {
        return auth;
    }

    /**
     * <p>
     * The authentication method to use when sending data to an HTTPS endpoint.
     * </p>
     *
     * @param auth <p>
     *            The authentication method to use when sending data to an HTTPS
     *            endpoint.
     *            </p>
     */
    public void setAuth(HttpAuthorization auth) {
        this.auth = auth;
    }

    /**
     * <p>
     * The authentication method to use when sending data to an HTTPS endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auth <p>
     *            The authentication method to use when sending data to an HTTPS
     *            endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpAction withAuth(HttpAuthorization auth) {
        this.auth = auth;
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
        if (getUrl() != null)
            sb.append("url: " + getUrl() + ",");
        if (getConfirmationUrl() != null)
            sb.append("confirmationUrl: " + getConfirmationUrl() + ",");
        if (getHeaders() != null)
            sb.append("headers: " + getHeaders() + ",");
        if (getAuth() != null)
            sb.append("auth: " + getAuth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode
                + ((getConfirmationUrl() == null) ? 0 : getConfirmationUrl().hashCode());
        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime * hashCode + ((getAuth() == null) ? 0 : getAuth().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpAction == false)
            return false;
        HttpAction other = (HttpAction) obj;

        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getConfirmationUrl() == null ^ this.getConfirmationUrl() == null)
            return false;
        if (other.getConfirmationUrl() != null
                && other.getConfirmationUrl().equals(this.getConfirmationUrl()) == false)
            return false;
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getAuth() == null ^ this.getAuth() == null)
            return false;
        if (other.getAuth() != null && other.getAuth().equals(this.getAuth()) == false)
            return false;
        return true;
    }
}
