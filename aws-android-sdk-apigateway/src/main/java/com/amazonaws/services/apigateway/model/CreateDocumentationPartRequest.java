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
 * Creates a new documentation part of a given API.
 * </p>
 */
public class CreateDocumentationPartRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * [Required] The location of the targeted API entity of the to-be-created
     * documentation part.
     * </p>
     */
    private DocumentationPartLocation location;

    /**
     * <p>
     * [Required] The new documentation content map of the targeted API entity.
     * Enclosed key-value pairs are API-specific, but only OpenAPI-compliant
     * key-value pairs can be exported and, hence, published.
     * </p>
     */
    private String properties;

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
    public CreateDocumentationPartRequest withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * <p>
     * [Required] The location of the targeted API entity of the to-be-created
     * documentation part.
     * </p>
     *
     * @return <p>
     *         [Required] The location of the targeted API entity of the
     *         to-be-created documentation part.
     *         </p>
     */
    public DocumentationPartLocation getLocation() {
        return location;
    }

    /**
     * <p>
     * [Required] The location of the targeted API entity of the to-be-created
     * documentation part.
     * </p>
     *
     * @param location <p>
     *            [Required] The location of the targeted API entity of the
     *            to-be-created documentation part.
     *            </p>
     */
    public void setLocation(DocumentationPartLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * [Required] The location of the targeted API entity of the to-be-created
     * documentation part.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            [Required] The location of the targeted API entity of the
     *            to-be-created documentation part.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDocumentationPartRequest withLocation(DocumentationPartLocation location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * [Required] The new documentation content map of the targeted API entity.
     * Enclosed key-value pairs are API-specific, but only OpenAPI-compliant
     * key-value pairs can be exported and, hence, published.
     * </p>
     *
     * @return <p>
     *         [Required] The new documentation content map of the targeted API
     *         entity. Enclosed key-value pairs are API-specific, but only
     *         OpenAPI-compliant key-value pairs can be exported and, hence,
     *         published.
     *         </p>
     */
    public String getProperties() {
        return properties;
    }

    /**
     * <p>
     * [Required] The new documentation content map of the targeted API entity.
     * Enclosed key-value pairs are API-specific, but only OpenAPI-compliant
     * key-value pairs can be exported and, hence, published.
     * </p>
     *
     * @param properties <p>
     *            [Required] The new documentation content map of the targeted
     *            API entity. Enclosed key-value pairs are API-specific, but
     *            only OpenAPI-compliant key-value pairs can be exported and,
     *            hence, published.
     *            </p>
     */
    public void setProperties(String properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * [Required] The new documentation content map of the targeted API entity.
     * Enclosed key-value pairs are API-specific, but only OpenAPI-compliant
     * key-value pairs can be exported and, hence, published.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param properties <p>
     *            [Required] The new documentation content map of the targeted
     *            API entity. Enclosed key-value pairs are API-specific, but
     *            only OpenAPI-compliant key-value pairs can be exported and,
     *            hence, published.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDocumentationPartRequest withProperties(String properties) {
        this.properties = properties;
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
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
        if (getProperties() != null)
            sb.append("properties: " + getProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDocumentationPartRequest == false)
            return false;
        CreateDocumentationPartRequest other = (CreateDocumentationPartRequest) obj;

        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null
                && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
    }
}
