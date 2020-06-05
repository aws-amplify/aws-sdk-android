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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * The binary blob response to <a>GetSdk</a>, which contains the generated SDK.
 * </p>
 */
public class GetSdkResult implements Serializable {
    /**
     * <p>
     * The content-type header value in the HTTP response.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * The content-disposition header value in the HTTP response.
     * </p>
     */
    private String contentDisposition;

    /**
     * <p>
     * The binary blob response to <a>GetSdk</a>, which contains the generated
     * SDK.
     * </p>
     */
    private java.nio.ByteBuffer body;

    /**
     * <p>
     * The content-type header value in the HTTP response.
     * </p>
     *
     * @return <p>
     *         The content-type header value in the HTTP response.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The content-type header value in the HTTP response.
     * </p>
     *
     * @param contentType <p>
     *            The content-type header value in the HTTP response.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content-type header value in the HTTP response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentType <p>
     *            The content-type header value in the HTTP response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSdkResult withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * The content-disposition header value in the HTTP response.
     * </p>
     *
     * @return <p>
     *         The content-disposition header value in the HTTP response.
     *         </p>
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * <p>
     * The content-disposition header value in the HTTP response.
     * </p>
     *
     * @param contentDisposition <p>
     *            The content-disposition header value in the HTTP response.
     *            </p>
     */
    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    /**
     * <p>
     * The content-disposition header value in the HTTP response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentDisposition <p>
     *            The content-disposition header value in the HTTP response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSdkResult withContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * <p>
     * The binary blob response to <a>GetSdk</a>, which contains the generated
     * SDK.
     * </p>
     *
     * @return <p>
     *         The binary blob response to <a>GetSdk</a>, which contains the
     *         generated SDK.
     *         </p>
     */
    public java.nio.ByteBuffer getBody() {
        return body;
    }

    /**
     * <p>
     * The binary blob response to <a>GetSdk</a>, which contains the generated
     * SDK.
     * </p>
     *
     * @param body <p>
     *            The binary blob response to <a>GetSdk</a>, which contains the
     *            generated SDK.
     *            </p>
     */
    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * The binary blob response to <a>GetSdk</a>, which contains the generated
     * SDK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            The binary blob response to <a>GetSdk</a>, which contains the
     *            generated SDK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSdkResult withBody(java.nio.ByteBuffer body) {
        this.body = body;
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
        if (getContentType() != null)
            sb.append("contentType: " + getContentType() + ",");
        if (getContentDisposition() != null)
            sb.append("contentDisposition: " + getContentDisposition() + ",");
        if (getBody() != null)
            sb.append("body: " + getBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode
                + ((getContentDisposition() == null) ? 0 : getContentDisposition().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSdkResult == false)
            return false;
        GetSdkResult other = (GetSdkResult) obj;

        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getContentDisposition() == null ^ this.getContentDisposition() == null)
            return false;
        if (other.getContentDisposition() != null
                && other.getContentDisposition().equals(this.getContentDisposition()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        return true;
    }
}
