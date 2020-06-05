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
 * Import documentation parts from an external (e.g., OpenAPI) definition file.
 * </p>
 */
public class ImportDocumentationPartsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * A query parameter to indicate whether to overwrite (
     * <code>OVERWRITE</code>) any existing <a>DocumentationParts</a> definition
     * or to merge (<code>MERGE</code>) the new definition into the existing
     * one. The default value is <code>MERGE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>merge, overwrite
     */
    private String mode;

    /**
     * <p>
     * A query parameter to specify whether to rollback the documentation
     * importation (<code>true</code>) or not (<code>false</code>) when a
     * warning is encountered. The default value is <code>false</code>.
     * </p>
     */
    private Boolean failOnWarnings;

    /**
     * <p>
     * [Required] Raw byte array representing the to-be-imported documentation
     * parts. To import from an OpenAPI file, this is a JSON object.
     * </p>
     */
    private java.nio.ByteBuffer body;

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
    public ImportDocumentationPartsRequest withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * <p>
     * A query parameter to indicate whether to overwrite (
     * <code>OVERWRITE</code>) any existing <a>DocumentationParts</a> definition
     * or to merge (<code>MERGE</code>) the new definition into the existing
     * one. The default value is <code>MERGE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>merge, overwrite
     *
     * @return <p>
     *         A query parameter to indicate whether to overwrite (
     *         <code>OVERWRITE</code>) any existing <a>DocumentationParts</a>
     *         definition or to merge (<code>MERGE</code>) the new definition
     *         into the existing one. The default value is <code>MERGE</code>.
     *         </p>
     * @see PutMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * A query parameter to indicate whether to overwrite (
     * <code>OVERWRITE</code>) any existing <a>DocumentationParts</a> definition
     * or to merge (<code>MERGE</code>) the new definition into the existing
     * one. The default value is <code>MERGE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>merge, overwrite
     *
     * @param mode <p>
     *            A query parameter to indicate whether to overwrite (
     *            <code>OVERWRITE</code>) any existing <a>DocumentationParts</a>
     *            definition or to merge (<code>MERGE</code>) the new definition
     *            into the existing one. The default value is <code>MERGE</code>
     *            .
     *            </p>
     * @see PutMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * A query parameter to indicate whether to overwrite (
     * <code>OVERWRITE</code>) any existing <a>DocumentationParts</a> definition
     * or to merge (<code>MERGE</code>) the new definition into the existing
     * one. The default value is <code>MERGE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>merge, overwrite
     *
     * @param mode <p>
     *            A query parameter to indicate whether to overwrite (
     *            <code>OVERWRITE</code>) any existing <a>DocumentationParts</a>
     *            definition or to merge (<code>MERGE</code>) the new definition
     *            into the existing one. The default value is <code>MERGE</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PutMode
     */
    public ImportDocumentationPartsRequest withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * A query parameter to indicate whether to overwrite (
     * <code>OVERWRITE</code>) any existing <a>DocumentationParts</a> definition
     * or to merge (<code>MERGE</code>) the new definition into the existing
     * one. The default value is <code>MERGE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>merge, overwrite
     *
     * @param mode <p>
     *            A query parameter to indicate whether to overwrite (
     *            <code>OVERWRITE</code>) any existing <a>DocumentationParts</a>
     *            definition or to merge (<code>MERGE</code>) the new definition
     *            into the existing one. The default value is <code>MERGE</code>
     *            .
     *            </p>
     * @see PutMode
     */
    public void setMode(PutMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * A query parameter to indicate whether to overwrite (
     * <code>OVERWRITE</code>) any existing <a>DocumentationParts</a> definition
     * or to merge (<code>MERGE</code>) the new definition into the existing
     * one. The default value is <code>MERGE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>merge, overwrite
     *
     * @param mode <p>
     *            A query parameter to indicate whether to overwrite (
     *            <code>OVERWRITE</code>) any existing <a>DocumentationParts</a>
     *            definition or to merge (<code>MERGE</code>) the new definition
     *            into the existing one. The default value is <code>MERGE</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PutMode
     */
    public ImportDocumentationPartsRequest withMode(PutMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * A query parameter to specify whether to rollback the documentation
     * importation (<code>true</code>) or not (<code>false</code>) when a
     * warning is encountered. The default value is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         A query parameter to specify whether to rollback the
     *         documentation importation (<code>true</code>) or not (
     *         <code>false</code>) when a warning is encountered. The default
     *         value is <code>false</code>.
     *         </p>
     */
    public Boolean isFailOnWarnings() {
        return failOnWarnings;
    }

    /**
     * <p>
     * A query parameter to specify whether to rollback the documentation
     * importation (<code>true</code>) or not (<code>false</code>) when a
     * warning is encountered. The default value is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         A query parameter to specify whether to rollback the
     *         documentation importation (<code>true</code>) or not (
     *         <code>false</code>) when a warning is encountered. The default
     *         value is <code>false</code>.
     *         </p>
     */
    public Boolean getFailOnWarnings() {
        return failOnWarnings;
    }

    /**
     * <p>
     * A query parameter to specify whether to rollback the documentation
     * importation (<code>true</code>) or not (<code>false</code>) when a
     * warning is encountered. The default value is <code>false</code>.
     * </p>
     *
     * @param failOnWarnings <p>
     *            A query parameter to specify whether to rollback the
     *            documentation importation (<code>true</code>) or not (
     *            <code>false</code>) when a warning is encountered. The default
     *            value is <code>false</code>.
     *            </p>
     */
    public void setFailOnWarnings(Boolean failOnWarnings) {
        this.failOnWarnings = failOnWarnings;
    }

    /**
     * <p>
     * A query parameter to specify whether to rollback the documentation
     * importation (<code>true</code>) or not (<code>false</code>) when a
     * warning is encountered. The default value is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failOnWarnings <p>
     *            A query parameter to specify whether to rollback the
     *            documentation importation (<code>true</code>) or not (
     *            <code>false</code>) when a warning is encountered. The default
     *            value is <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportDocumentationPartsRequest withFailOnWarnings(Boolean failOnWarnings) {
        this.failOnWarnings = failOnWarnings;
        return this;
    }

    /**
     * <p>
     * [Required] Raw byte array representing the to-be-imported documentation
     * parts. To import from an OpenAPI file, this is a JSON object.
     * </p>
     *
     * @return <p>
     *         [Required] Raw byte array representing the to-be-imported
     *         documentation parts. To import from an OpenAPI file, this is a
     *         JSON object.
     *         </p>
     */
    public java.nio.ByteBuffer getBody() {
        return body;
    }

    /**
     * <p>
     * [Required] Raw byte array representing the to-be-imported documentation
     * parts. To import from an OpenAPI file, this is a JSON object.
     * </p>
     *
     * @param body <p>
     *            [Required] Raw byte array representing the to-be-imported
     *            documentation parts. To import from an OpenAPI file, this is a
     *            JSON object.
     *            </p>
     */
    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * [Required] Raw byte array representing the to-be-imported documentation
     * parts. To import from an OpenAPI file, this is a JSON object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            [Required] Raw byte array representing the to-be-imported
     *            documentation parts. To import from an OpenAPI file, this is a
     *            JSON object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportDocumentationPartsRequest withBody(java.nio.ByteBuffer body) {
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
        if (getRestApiId() != null)
            sb.append("restApiId: " + getRestApiId() + ",");
        if (getMode() != null)
            sb.append("mode: " + getMode() + ",");
        if (getFailOnWarnings() != null)
            sb.append("failOnWarnings: " + getFailOnWarnings() + ",");
        if (getBody() != null)
            sb.append("body: " + getBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode
                + ((getFailOnWarnings() == null) ? 0 : getFailOnWarnings().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportDocumentationPartsRequest == false)
            return false;
        ImportDocumentationPartsRequest other = (ImportDocumentationPartsRequest) obj;

        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getFailOnWarnings() == null ^ this.getFailOnWarnings() == null)
            return false;
        if (other.getFailOnWarnings() != null
                && other.getFailOnWarnings().equals(this.getFailOnWarnings()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        return true;
    }
}
