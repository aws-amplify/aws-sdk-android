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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes an existing <a>MethodResponse</a> resource.
 * </p>
 */
public class DeleteMethodResponseRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * [Required] The <a>Resource</a> identifier for the <a>MethodResponse</a>
     * resource.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * [Required] The HTTP verb of the <a>Method</a> resource.
     * </p>
     */
    private String httpMethod;

    /**
     * <p>
     * [Required] The status code identifier for the <a>MethodResponse</a>
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[1-5]\d\d<br/>
     */
    private String statusCode;

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     *
     * @return <p>
     *         [Required] The string identifier of the associated
     *         <a>RestApi</a>.
     *         </p>
     */
    public String getRestApiId() {
        return restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     *
     * @param restApiId <p>
     *            [Required] The string identifier of the associated
     *            <a>RestApi</a>.
     *            </p>
     */
    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restApiId <p>
     *            [Required] The string identifier of the associated
     *            <a>RestApi</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMethodResponseRequest withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * <p>
     * [Required] The <a>Resource</a> identifier for the <a>MethodResponse</a>
     * resource.
     * </p>
     *
     * @return <p>
     *         [Required] The <a>Resource</a> identifier for the
     *         <a>MethodResponse</a> resource.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * [Required] The <a>Resource</a> identifier for the <a>MethodResponse</a>
     * resource.
     * </p>
     *
     * @param resourceId <p>
     *            [Required] The <a>Resource</a> identifier for the
     *            <a>MethodResponse</a> resource.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * [Required] The <a>Resource</a> identifier for the <a>MethodResponse</a>
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceId <p>
     *            [Required] The <a>Resource</a> identifier for the
     *            <a>MethodResponse</a> resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMethodResponseRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * [Required] The HTTP verb of the <a>Method</a> resource.
     * </p>
     *
     * @return <p>
     *         [Required] The HTTP verb of the <a>Method</a> resource.
     *         </p>
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * <p>
     * [Required] The HTTP verb of the <a>Method</a> resource.
     * </p>
     *
     * @param httpMethod <p>
     *            [Required] The HTTP verb of the <a>Method</a> resource.
     *            </p>
     */
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * [Required] The HTTP verb of the <a>Method</a> resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param httpMethod <p>
     *            [Required] The HTTP verb of the <a>Method</a> resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMethodResponseRequest withHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /**
     * <p>
     * [Required] The status code identifier for the <a>MethodResponse</a>
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[1-5]\d\d<br/>
     *
     * @return <p>
     *         [Required] The status code identifier for the
     *         <a>MethodResponse</a> resource.
     *         </p>
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * <p>
     * [Required] The status code identifier for the <a>MethodResponse</a>
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[1-5]\d\d<br/>
     *
     * @param statusCode <p>
     *            [Required] The status code identifier for the
     *            <a>MethodResponse</a> resource.
     *            </p>
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * [Required] The status code identifier for the <a>MethodResponse</a>
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[1-5]\d\d<br/>
     *
     * @param statusCode <p>
     *            [Required] The status code identifier for the
     *            <a>MethodResponse</a> resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMethodResponseRequest withStatusCode(String statusCode) {
        this.statusCode = statusCode;
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
        if (getRestApiId() != null)
            sb.append("restApiId: " + getRestApiId() + ",");
        if (getResourceId() != null)
            sb.append("resourceId: " + getResourceId() + ",");
        if (getHttpMethod() != null)
            sb.append("httpMethod: " + getHttpMethod() + ",");
        if (getStatusCode() != null)
            sb.append("statusCode: " + getStatusCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMethodResponseRequest == false)
            return false;
        DeleteMethodResponseRequest other = (DeleteMethodResponseRequest) obj;

        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null)
            return false;
        if (other.getHttpMethod() != null
                && other.getHttpMethod().equals(this.getHttpMethod()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null
                && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        return true;
    }
}
