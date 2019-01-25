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
 * Contextual user data type used for evaluating the risk of an unexpected event
 * by Amazon Cognito advanced security.
 * </p>
 */
public class ContextDataType implements Serializable {
    /**
     * <p>
     * Source IP address of your user.
     * </p>
     */
    private String ipAddress;

    /**
     * <p>
     * Your server endpoint where this API is invoked.
     * </p>
     */
    private String serverName;

    /**
     * <p>
     * Your server path where this API is invoked.
     * </p>
     */
    private String serverPath;

    /**
     * <p>
     * HttpHeaders received on your server in same order.
     * </p>
     */
    private java.util.List<HttpHeader> httpHeaders;

    /**
     * <p>
     * Encoded data containing device fingerprinting details, collected using
     * the Amazon Cognito context data collection library.
     * </p>
     */
    private String encodedData;

    /**
     * <p>
     * Source IP address of your user.
     * </p>
     *
     * @return <p>
     *         Source IP address of your user.
     *         </p>
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * <p>
     * Source IP address of your user.
     * </p>
     *
     * @param ipAddress <p>
     *            Source IP address of your user.
     *            </p>
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * Source IP address of your user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipAddress <p>
     *            Source IP address of your user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContextDataType withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * <p>
     * Your server endpoint where this API is invoked.
     * </p>
     *
     * @return <p>
     *         Your server endpoint where this API is invoked.
     *         </p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p>
     * Your server endpoint where this API is invoked.
     * </p>
     *
     * @param serverName <p>
     *            Your server endpoint where this API is invoked.
     *            </p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * Your server endpoint where this API is invoked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverName <p>
     *            Your server endpoint where this API is invoked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContextDataType withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * <p>
     * Your server path where this API is invoked.
     * </p>
     *
     * @return <p>
     *         Your server path where this API is invoked.
     *         </p>
     */
    public String getServerPath() {
        return serverPath;
    }

    /**
     * <p>
     * Your server path where this API is invoked.
     * </p>
     *
     * @param serverPath <p>
     *            Your server path where this API is invoked.
     *            </p>
     */
    public void setServerPath(String serverPath) {
        this.serverPath = serverPath;
    }

    /**
     * <p>
     * Your server path where this API is invoked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverPath <p>
     *            Your server path where this API is invoked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContextDataType withServerPath(String serverPath) {
        this.serverPath = serverPath;
        return this;
    }

    /**
     * <p>
     * HttpHeaders received on your server in same order.
     * </p>
     *
     * @return <p>
     *         HttpHeaders received on your server in same order.
     *         </p>
     */
    public java.util.List<HttpHeader> getHttpHeaders() {
        return httpHeaders;
    }

    /**
     * <p>
     * HttpHeaders received on your server in same order.
     * </p>
     *
     * @param httpHeaders <p>
     *            HttpHeaders received on your server in same order.
     *            </p>
     */
    public void setHttpHeaders(java.util.Collection<HttpHeader> httpHeaders) {
        if (httpHeaders == null) {
            this.httpHeaders = null;
            return;
        }

        this.httpHeaders = new java.util.ArrayList<HttpHeader>(httpHeaders);
    }

    /**
     * <p>
     * HttpHeaders received on your server in same order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param httpHeaders <p>
     *            HttpHeaders received on your server in same order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContextDataType withHttpHeaders(HttpHeader... httpHeaders) {
        if (getHttpHeaders() == null) {
            this.httpHeaders = new java.util.ArrayList<HttpHeader>(httpHeaders.length);
        }
        for (HttpHeader value : httpHeaders) {
            this.httpHeaders.add(value);
        }
        return this;
    }

    /**
     * <p>
     * HttpHeaders received on your server in same order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param httpHeaders <p>
     *            HttpHeaders received on your server in same order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContextDataType withHttpHeaders(java.util.Collection<HttpHeader> httpHeaders) {
        setHttpHeaders(httpHeaders);
        return this;
    }

    /**
     * <p>
     * Encoded data containing device fingerprinting details, collected using
     * the Amazon Cognito context data collection library.
     * </p>
     *
     * @return <p>
     *         Encoded data containing device fingerprinting details, collected
     *         using the Amazon Cognito context data collection library.
     *         </p>
     */
    public String getEncodedData() {
        return encodedData;
    }

    /**
     * <p>
     * Encoded data containing device fingerprinting details, collected using
     * the Amazon Cognito context data collection library.
     * </p>
     *
     * @param encodedData <p>
     *            Encoded data containing device fingerprinting details,
     *            collected using the Amazon Cognito context data collection
     *            library.
     *            </p>
     */
    public void setEncodedData(String encodedData) {
        this.encodedData = encodedData;
    }

    /**
     * <p>
     * Encoded data containing device fingerprinting details, collected using
     * the Amazon Cognito context data collection library.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encodedData <p>
     *            Encoded data containing device fingerprinting details,
     *            collected using the Amazon Cognito context data collection
     *            library.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContextDataType withEncodedData(String encodedData) {
        this.encodedData = encodedData;
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
        if (getIpAddress() != null)
            sb.append("IpAddress: " + getIpAddress() + ",");
        if (getServerName() != null)
            sb.append("ServerName: " + getServerName() + ",");
        if (getServerPath() != null)
            sb.append("ServerPath: " + getServerPath() + ",");
        if (getHttpHeaders() != null)
            sb.append("HttpHeaders: " + getHttpHeaders() + ",");
        if (getEncodedData() != null)
            sb.append("EncodedData: " + getEncodedData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getServerPath() == null) ? 0 : getServerPath().hashCode());
        hashCode = prime * hashCode
                + ((getHttpHeaders() == null) ? 0 : getHttpHeaders().hashCode());
        hashCode = prime * hashCode
                + ((getEncodedData() == null) ? 0 : getEncodedData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContextDataType == false)
            return false;
        ContextDataType other = (ContextDataType) obj;

        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null
                && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null
                && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getServerPath() == null ^ this.getServerPath() == null)
            return false;
        if (other.getServerPath() != null
                && other.getServerPath().equals(this.getServerPath()) == false)
            return false;
        if (other.getHttpHeaders() == null ^ this.getHttpHeaders() == null)
            return false;
        if (other.getHttpHeaders() != null
                && other.getHttpHeaders().equals(this.getHttpHeaders()) == false)
            return false;
        if (other.getEncodedData() == null ^ this.getEncodedData() == null)
            return false;
        if (other.getEncodedData() != null
                && other.getEncodedData().equals(this.getEncodedData()) == false)
            return false;
        return true;
    }
}
