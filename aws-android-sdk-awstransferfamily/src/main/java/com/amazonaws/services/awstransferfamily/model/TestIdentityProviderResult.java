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

package com.amazonaws.services.awstransferfamily.model;

import java.io.Serializable;

public class TestIdentityProviderResult implements Serializable {
    /**
     * <p>
     * The response that is returned from your API Gateway.
     * </p>
     */
    private String response;

    /**
     * <p>
     * The HTTP status code that is the response from your API Gateway.
     * </p>
     */
    private Integer statusCode;

    /**
     * <p>
     * A message that indicates whether the test was successful or not.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The endpoint of the service used to authenticate a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String url;

    /**
     * <p>
     * The response that is returned from your API Gateway.
     * </p>
     *
     * @return <p>
     *         The response that is returned from your API Gateway.
     *         </p>
     */
    public String getResponse() {
        return response;
    }

    /**
     * <p>
     * The response that is returned from your API Gateway.
     * </p>
     *
     * @param response <p>
     *            The response that is returned from your API Gateway.
     *            </p>
     */
    public void setResponse(String response) {
        this.response = response;
    }

    /**
     * <p>
     * The response that is returned from your API Gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param response <p>
     *            The response that is returned from your API Gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestIdentityProviderResult withResponse(String response) {
        this.response = response;
        return this;
    }

    /**
     * <p>
     * The HTTP status code that is the response from your API Gateway.
     * </p>
     *
     * @return <p>
     *         The HTTP status code that is the response from your API Gateway.
     *         </p>
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * <p>
     * The HTTP status code that is the response from your API Gateway.
     * </p>
     *
     * @param statusCode <p>
     *            The HTTP status code that is the response from your API
     *            Gateway.
     *            </p>
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTTP status code that is the response from your API Gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusCode <p>
     *            The HTTP status code that is the response from your API
     *            Gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestIdentityProviderResult withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * <p>
     * A message that indicates whether the test was successful or not.
     * </p>
     *
     * @return <p>
     *         A message that indicates whether the test was successful or not.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * A message that indicates whether the test was successful or not.
     * </p>
     *
     * @param message <p>
     *            A message that indicates whether the test was successful or
     *            not.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message that indicates whether the test was successful or not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            A message that indicates whether the test was successful or
     *            not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestIdentityProviderResult withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The endpoint of the service used to authenticate a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The endpoint of the service used to authenticate a user.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The endpoint of the service used to authenticate a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param url <p>
     *            The endpoint of the service used to authenticate a user.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The endpoint of the service used to authenticate a user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param url <p>
     *            The endpoint of the service used to authenticate a user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestIdentityProviderResult withUrl(String url) {
        this.url = url;
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
        if (getResponse() != null)
            sb.append("Response: " + getResponse() + ",");
        if (getStatusCode() != null)
            sb.append("StatusCode: " + getStatusCode() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getUrl() != null)
            sb.append("Url: " + getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResponse() == null) ? 0 : getResponse().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestIdentityProviderResult == false)
            return false;
        TestIdentityProviderResult other = (TestIdentityProviderResult) obj;

        if (other.getResponse() == null ^ this.getResponse() == null)
            return false;
        if (other.getResponse() != null && other.getResponse().equals(this.getResponse()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null
                && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }
}
