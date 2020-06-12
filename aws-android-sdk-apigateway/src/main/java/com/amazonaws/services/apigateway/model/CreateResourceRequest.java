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
 * Creates a <a>Resource</a> resource.
 * </p>
 */
public class CreateResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * [Required] The parent resource's identifier.
     * </p>
     */
    private String parentId;

    /**
     * <p>
     * The last path segment for this resource.
     * </p>
     */
    private String pathPart;

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
    public CreateResourceRequest withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * <p>
     * [Required] The parent resource's identifier.
     * </p>
     *
     * @return <p>
     *         [Required] The parent resource's identifier.
     *         </p>
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * <p>
     * [Required] The parent resource's identifier.
     * </p>
     *
     * @param parentId <p>
     *            [Required] The parent resource's identifier.
     *            </p>
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * <p>
     * [Required] The parent resource's identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parentId <p>
     *            [Required] The parent resource's identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceRequest withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * <p>
     * The last path segment for this resource.
     * </p>
     *
     * @return <p>
     *         The last path segment for this resource.
     *         </p>
     */
    public String getPathPart() {
        return pathPart;
    }

    /**
     * <p>
     * The last path segment for this resource.
     * </p>
     *
     * @param pathPart <p>
     *            The last path segment for this resource.
     *            </p>
     */
    public void setPathPart(String pathPart) {
        this.pathPart = pathPart;
    }

    /**
     * <p>
     * The last path segment for this resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pathPart <p>
     *            The last path segment for this resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceRequest withPathPart(String pathPart) {
        this.pathPart = pathPart;
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
        if (getParentId() != null)
            sb.append("parentId: " + getParentId() + ",");
        if (getPathPart() != null)
            sb.append("pathPart: " + getPathPart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getParentId() == null) ? 0 : getParentId().hashCode());
        hashCode = prime * hashCode + ((getPathPart() == null) ? 0 : getPathPart().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResourceRequest == false)
            return false;
        CreateResourceRequest other = (CreateResourceRequest) obj;

        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getParentId() == null ^ this.getParentId() == null)
            return false;
        if (other.getParentId() != null && other.getParentId().equals(this.getParentId()) == false)
            return false;
        if (other.getPathPart() == null ^ this.getPathPart() == null)
            return false;
        if (other.getPathPart() != null && other.getPathPart().equals(this.getPathPart()) == false)
            return false;
        return true;
    }
}
