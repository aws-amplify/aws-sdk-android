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
 * Specifies how requests are redirected. In the event of an error, you can
 * specify a different error code to return.
 * </p>
 */
public class Redirect implements Serializable {
    /**
     * <p>
     * The host name to use in the redirect request.
     * </p>
     */
    private String hostName;

    /**
     * <p>
     * The HTTP redirect code to use on the response. Not required if one of the
     * siblings is present.
     * </p>
     */
    private String httpRedirectCode;

    /**
     * <p>
     * Protocol to use when redirecting requests. The default is the protocol
     * that is used in the original request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http, https
     */
    private String protocol;

    /**
     * <p>
     * The object key prefix to use in the redirect request. For example, to
     * redirect requests for all pages with prefix <code>docs/</code> (objects
     * in the <code>docs/</code> folder) to <code>documents/</code>, you can set
     * a condition block with <code>KeyPrefixEquals</code> set to
     * <code>docs/</code> and in the Redirect set
     * <code>ReplaceKeyPrefixWith</code> to <code>/documents</code>. Not
     * required if one of the siblings is present. Can be present only if
     * <code>ReplaceKeyWith</code> is not provided.
     * </p>
     */
    private String replaceKeyPrefixWith;

    /**
     * <p>
     * The specific object key to use in the redirect request. For example,
     * redirect request to <code>error.html</code>. Not required if one of the
     * siblings is present. Can be present only if
     * <code>ReplaceKeyPrefixWith</code> is not provided.
     * </p>
     */
    private String replaceKeyWith;

    /**
     * <p>
     * The host name to use in the redirect request.
     * </p>
     *
     * @return <p>
     *         The host name to use in the redirect request.
     *         </p>
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * <p>
     * The host name to use in the redirect request.
     * </p>
     *
     * @param hostName <p>
     *            The host name to use in the redirect request.
     *            </p>
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * <p>
     * The host name to use in the redirect request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostName <p>
     *            The host name to use in the redirect request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Redirect withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * <p>
     * The HTTP redirect code to use on the response. Not required if one of the
     * siblings is present.
     * </p>
     *
     * @return <p>
     *         The HTTP redirect code to use on the response. Not required if
     *         one of the siblings is present.
     *         </p>
     */
    public String getHttpRedirectCode() {
        return httpRedirectCode;
    }

    /**
     * <p>
     * The HTTP redirect code to use on the response. Not required if one of the
     * siblings is present.
     * </p>
     *
     * @param httpRedirectCode <p>
     *            The HTTP redirect code to use on the response. Not required if
     *            one of the siblings is present.
     *            </p>
     */
    public void setHttpRedirectCode(String httpRedirectCode) {
        this.httpRedirectCode = httpRedirectCode;
    }

    /**
     * <p>
     * The HTTP redirect code to use on the response. Not required if one of the
     * siblings is present.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param httpRedirectCode <p>
     *            The HTTP redirect code to use on the response. Not required if
     *            one of the siblings is present.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Redirect withHttpRedirectCode(String httpRedirectCode) {
        this.httpRedirectCode = httpRedirectCode;
        return this;
    }

    /**
     * <p>
     * Protocol to use when redirecting requests. The default is the protocol
     * that is used in the original request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http, https
     *
     * @return <p>
     *         Protocol to use when redirecting requests. The default is the
     *         protocol that is used in the original request.
     *         </p>
     * @see Protocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * Protocol to use when redirecting requests. The default is the protocol
     * that is used in the original request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http, https
     *
     * @param protocol <p>
     *            Protocol to use when redirecting requests. The default is the
     *            protocol that is used in the original request.
     *            </p>
     * @see Protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * Protocol to use when redirecting requests. The default is the protocol
     * that is used in the original request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http, https
     *
     * @param protocol <p>
     *            Protocol to use when redirecting requests. The default is the
     *            protocol that is used in the original request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Protocol
     */
    public Redirect withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * Protocol to use when redirecting requests. The default is the protocol
     * that is used in the original request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http, https
     *
     * @param protocol <p>
     *            Protocol to use when redirecting requests. The default is the
     *            protocol that is used in the original request.
     *            </p>
     * @see Protocol
     */
    public void setProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * Protocol to use when redirecting requests. The default is the protocol
     * that is used in the original request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http, https
     *
     * @param protocol <p>
     *            Protocol to use when redirecting requests. The default is the
     *            protocol that is used in the original request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Protocol
     */
    public Redirect withProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The object key prefix to use in the redirect request. For example, to
     * redirect requests for all pages with prefix <code>docs/</code> (objects
     * in the <code>docs/</code> folder) to <code>documents/</code>, you can set
     * a condition block with <code>KeyPrefixEquals</code> set to
     * <code>docs/</code> and in the Redirect set
     * <code>ReplaceKeyPrefixWith</code> to <code>/documents</code>. Not
     * required if one of the siblings is present. Can be present only if
     * <code>ReplaceKeyWith</code> is not provided.
     * </p>
     *
     * @return <p>
     *         The object key prefix to use in the redirect request. For
     *         example, to redirect requests for all pages with prefix
     *         <code>docs/</code> (objects in the <code>docs/</code> folder) to
     *         <code>documents/</code>, you can set a condition block with
     *         <code>KeyPrefixEquals</code> set to <code>docs/</code> and in the
     *         Redirect set <code>ReplaceKeyPrefixWith</code> to
     *         <code>/documents</code>. Not required if one of the siblings is
     *         present. Can be present only if <code>ReplaceKeyWith</code> is
     *         not provided.
     *         </p>
     */
    public String getReplaceKeyPrefixWith() {
        return replaceKeyPrefixWith;
    }

    /**
     * <p>
     * The object key prefix to use in the redirect request. For example, to
     * redirect requests for all pages with prefix <code>docs/</code> (objects
     * in the <code>docs/</code> folder) to <code>documents/</code>, you can set
     * a condition block with <code>KeyPrefixEquals</code> set to
     * <code>docs/</code> and in the Redirect set
     * <code>ReplaceKeyPrefixWith</code> to <code>/documents</code>. Not
     * required if one of the siblings is present. Can be present only if
     * <code>ReplaceKeyWith</code> is not provided.
     * </p>
     *
     * @param replaceKeyPrefixWith <p>
     *            The object key prefix to use in the redirect request. For
     *            example, to redirect requests for all pages with prefix
     *            <code>docs/</code> (objects in the <code>docs/</code> folder)
     *            to <code>documents/</code>, you can set a condition block with
     *            <code>KeyPrefixEquals</code> set to <code>docs/</code> and in
     *            the Redirect set <code>ReplaceKeyPrefixWith</code> to
     *            <code>/documents</code>. Not required if one of the siblings
     *            is present. Can be present only if <code>ReplaceKeyWith</code>
     *            is not provided.
     *            </p>
     */
    public void setReplaceKeyPrefixWith(String replaceKeyPrefixWith) {
        this.replaceKeyPrefixWith = replaceKeyPrefixWith;
    }

    /**
     * <p>
     * The object key prefix to use in the redirect request. For example, to
     * redirect requests for all pages with prefix <code>docs/</code> (objects
     * in the <code>docs/</code> folder) to <code>documents/</code>, you can set
     * a condition block with <code>KeyPrefixEquals</code> set to
     * <code>docs/</code> and in the Redirect set
     * <code>ReplaceKeyPrefixWith</code> to <code>/documents</code>. Not
     * required if one of the siblings is present. Can be present only if
     * <code>ReplaceKeyWith</code> is not provided.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replaceKeyPrefixWith <p>
     *            The object key prefix to use in the redirect request. For
     *            example, to redirect requests for all pages with prefix
     *            <code>docs/</code> (objects in the <code>docs/</code> folder)
     *            to <code>documents/</code>, you can set a condition block with
     *            <code>KeyPrefixEquals</code> set to <code>docs/</code> and in
     *            the Redirect set <code>ReplaceKeyPrefixWith</code> to
     *            <code>/documents</code>. Not required if one of the siblings
     *            is present. Can be present only if <code>ReplaceKeyWith</code>
     *            is not provided.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Redirect withReplaceKeyPrefixWith(String replaceKeyPrefixWith) {
        this.replaceKeyPrefixWith = replaceKeyPrefixWith;
        return this;
    }

    /**
     * <p>
     * The specific object key to use in the redirect request. For example,
     * redirect request to <code>error.html</code>. Not required if one of the
     * siblings is present. Can be present only if
     * <code>ReplaceKeyPrefixWith</code> is not provided.
     * </p>
     *
     * @return <p>
     *         The specific object key to use in the redirect request. For
     *         example, redirect request to <code>error.html</code>. Not
     *         required if one of the siblings is present. Can be present only
     *         if <code>ReplaceKeyPrefixWith</code> is not provided.
     *         </p>
     */
    public String getReplaceKeyWith() {
        return replaceKeyWith;
    }

    /**
     * <p>
     * The specific object key to use in the redirect request. For example,
     * redirect request to <code>error.html</code>. Not required if one of the
     * siblings is present. Can be present only if
     * <code>ReplaceKeyPrefixWith</code> is not provided.
     * </p>
     *
     * @param replaceKeyWith <p>
     *            The specific object key to use in the redirect request. For
     *            example, redirect request to <code>error.html</code>. Not
     *            required if one of the siblings is present. Can be present
     *            only if <code>ReplaceKeyPrefixWith</code> is not provided.
     *            </p>
     */
    public void setReplaceKeyWith(String replaceKeyWith) {
        this.replaceKeyWith = replaceKeyWith;
    }

    /**
     * <p>
     * The specific object key to use in the redirect request. For example,
     * redirect request to <code>error.html</code>. Not required if one of the
     * siblings is present. Can be present only if
     * <code>ReplaceKeyPrefixWith</code> is not provided.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replaceKeyWith <p>
     *            The specific object key to use in the redirect request. For
     *            example, redirect request to <code>error.html</code>. Not
     *            required if one of the siblings is present. Can be present
     *            only if <code>ReplaceKeyPrefixWith</code> is not provided.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Redirect withReplaceKeyWith(String replaceKeyWith) {
        this.replaceKeyWith = replaceKeyWith;
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
        if (getHostName() != null)
            sb.append("HostName: " + getHostName() + ",");
        if (getHttpRedirectCode() != null)
            sb.append("HttpRedirectCode: " + getHttpRedirectCode() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol() + ",");
        if (getReplaceKeyPrefixWith() != null)
            sb.append("ReplaceKeyPrefixWith: " + getReplaceKeyPrefixWith() + ",");
        if (getReplaceKeyWith() != null)
            sb.append("ReplaceKeyWith: " + getReplaceKeyWith());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostName() == null) ? 0 : getHostName().hashCode());
        hashCode = prime * hashCode
                + ((getHttpRedirectCode() == null) ? 0 : getHttpRedirectCode().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode
                + ((getReplaceKeyPrefixWith() == null) ? 0 : getReplaceKeyPrefixWith().hashCode());
        hashCode = prime * hashCode
                + ((getReplaceKeyWith() == null) ? 0 : getReplaceKeyWith().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Redirect == false)
            return false;
        Redirect other = (Redirect) obj;

        if (other.getHostName() == null ^ this.getHostName() == null)
            return false;
        if (other.getHostName() != null && other.getHostName().equals(this.getHostName()) == false)
            return false;
        if (other.getHttpRedirectCode() == null ^ this.getHttpRedirectCode() == null)
            return false;
        if (other.getHttpRedirectCode() != null
                && other.getHttpRedirectCode().equals(this.getHttpRedirectCode()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getReplaceKeyPrefixWith() == null ^ this.getReplaceKeyPrefixWith() == null)
            return false;
        if (other.getReplaceKeyPrefixWith() != null
                && other.getReplaceKeyPrefixWith().equals(this.getReplaceKeyPrefixWith()) == false)
            return false;
        if (other.getReplaceKeyWith() == null ^ this.getReplaceKeyWith() == null)
            return false;
        if (other.getReplaceKeyWith() != null
                && other.getReplaceKeyWith().equals(this.getReplaceKeyWith()) == false)
            return false;
        return true;
    }
}
