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
 * A feature of the API Gateway control service for updating an existing API
 * with an input of external API definitions. The update can take the form of
 * merging the supplied definition into the existing API or overwriting the
 * existing API.
 * </p>
 */
public class PutRestApiRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * The <code>mode</code> query parameter to specify the update mode. Valid
     * values are "merge" and "overwrite". By default, the update mode is
     * "merge".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>merge, overwrite
     */
    private String mode;

    /**
     * <p>
     * A query parameter to indicate whether to rollback the API update (
     * <code>true</code>) or not (<code>false</code>) when a warning is
     * encountered. The default value is <code>false</code>.
     * </p>
     */
    private Boolean failOnWarnings;

    /**
     * <p>
     * Custom header parameters as part of the request. For example, to exclude
     * <a>DocumentationParts</a> from an imported API, set
     * <code>ignore=documentation</code> as a <code>parameters</code> value, as
     * in the AWS CLI command of
     * <code>aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'</code>
     * .
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * [Required] The PUT request body containing external API definitions.
     * Currently, only OpenAPI definition JSON/YAML files are supported. The
     * maximum size of the API definition file is 2MB.
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
    public PutRestApiRequest withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * <p>
     * The <code>mode</code> query parameter to specify the update mode. Valid
     * values are "merge" and "overwrite". By default, the update mode is
     * "merge".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>merge, overwrite
     *
     * @return <p>
     *         The <code>mode</code> query parameter to specify the update mode.
     *         Valid values are "merge" and "overwrite". By default, the update
     *         mode is "merge".
     *         </p>
     * @see PutMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * The <code>mode</code> query parameter to specify the update mode. Valid
     * values are "merge" and "overwrite". By default, the update mode is
     * "merge".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>merge, overwrite
     *
     * @param mode <p>
     *            The <code>mode</code> query parameter to specify the update
     *            mode. Valid values are "merge" and "overwrite". By default,
     *            the update mode is "merge".
     *            </p>
     * @see PutMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The <code>mode</code> query parameter to specify the update mode. Valid
     * values are "merge" and "overwrite". By default, the update mode is
     * "merge".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>merge, overwrite
     *
     * @param mode <p>
     *            The <code>mode</code> query parameter to specify the update
     *            mode. Valid values are "merge" and "overwrite". By default,
     *            the update mode is "merge".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PutMode
     */
    public PutRestApiRequest withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * The <code>mode</code> query parameter to specify the update mode. Valid
     * values are "merge" and "overwrite". By default, the update mode is
     * "merge".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>merge, overwrite
     *
     * @param mode <p>
     *            The <code>mode</code> query parameter to specify the update
     *            mode. Valid values are "merge" and "overwrite". By default,
     *            the update mode is "merge".
     *            </p>
     * @see PutMode
     */
    public void setMode(PutMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * The <code>mode</code> query parameter to specify the update mode. Valid
     * values are "merge" and "overwrite". By default, the update mode is
     * "merge".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>merge, overwrite
     *
     * @param mode <p>
     *            The <code>mode</code> query parameter to specify the update
     *            mode. Valid values are "merge" and "overwrite". By default,
     *            the update mode is "merge".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PutMode
     */
    public PutRestApiRequest withMode(PutMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback the API update (
     * <code>true</code>) or not (<code>false</code>) when a warning is
     * encountered. The default value is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         A query parameter to indicate whether to rollback the API update
     *         (<code>true</code>) or not (<code>false</code>) when a warning is
     *         encountered. The default value is <code>false</code>.
     *         </p>
     */
    public Boolean isFailOnWarnings() {
        return failOnWarnings;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback the API update (
     * <code>true</code>) or not (<code>false</code>) when a warning is
     * encountered. The default value is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         A query parameter to indicate whether to rollback the API update
     *         (<code>true</code>) or not (<code>false</code>) when a warning is
     *         encountered. The default value is <code>false</code>.
     *         </p>
     */
    public Boolean getFailOnWarnings() {
        return failOnWarnings;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback the API update (
     * <code>true</code>) or not (<code>false</code>) when a warning is
     * encountered. The default value is <code>false</code>.
     * </p>
     *
     * @param failOnWarnings <p>
     *            A query parameter to indicate whether to rollback the API
     *            update (<code>true</code>) or not (<code>false</code>) when a
     *            warning is encountered. The default value is
     *            <code>false</code>.
     *            </p>
     */
    public void setFailOnWarnings(Boolean failOnWarnings) {
        this.failOnWarnings = failOnWarnings;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback the API update (
     * <code>true</code>) or not (<code>false</code>) when a warning is
     * encountered. The default value is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failOnWarnings <p>
     *            A query parameter to indicate whether to rollback the API
     *            update (<code>true</code>) or not (<code>false</code>) when a
     *            warning is encountered. The default value is
     *            <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRestApiRequest withFailOnWarnings(Boolean failOnWarnings) {
        this.failOnWarnings = failOnWarnings;
        return this;
    }

    /**
     * <p>
     * Custom header parameters as part of the request. For example, to exclude
     * <a>DocumentationParts</a> from an imported API, set
     * <code>ignore=documentation</code> as a <code>parameters</code> value, as
     * in the AWS CLI command of
     * <code>aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'</code>
     * .
     * </p>
     *
     * @return <p>
     *         Custom header parameters as part of the request. For example, to
     *         exclude <a>DocumentationParts</a> from an imported API, set
     *         <code>ignore=documentation</code> as a <code>parameters</code>
     *         value, as in the AWS CLI command of
     *         <code>aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'</code>
     *         .
     *         </p>
     */
    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Custom header parameters as part of the request. For example, to exclude
     * <a>DocumentationParts</a> from an imported API, set
     * <code>ignore=documentation</code> as a <code>parameters</code> value, as
     * in the AWS CLI command of
     * <code>aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'</code>
     * .
     * </p>
     *
     * @param parameters <p>
     *            Custom header parameters as part of the request. For example,
     *            to exclude <a>DocumentationParts</a> from an imported API, set
     *            <code>ignore=documentation</code> as a <code>parameters</code>
     *            value, as in the AWS CLI command of
     *            <code>aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'</code>
     *            .
     *            </p>
     */
    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Custom header parameters as part of the request. For example, to exclude
     * <a>DocumentationParts</a> from an imported API, set
     * <code>ignore=documentation</code> as a <code>parameters</code> value, as
     * in the AWS CLI command of
     * <code>aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            Custom header parameters as part of the request. For example,
     *            to exclude <a>DocumentationParts</a> from an imported API, set
     *            <code>ignore=documentation</code> as a <code>parameters</code>
     *            value, as in the AWS CLI command of
     *            <code>aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRestApiRequest withParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * Custom header parameters as part of the request. For example, to exclude
     * <a>DocumentationParts</a> from an imported API, set
     * <code>ignore=documentation</code> as a <code>parameters</code> value, as
     * in the AWS CLI command of
     * <code>aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'</code>
     * .
     * </p>
     * <p>
     * The method adds a new key-value pair into parameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into parameters.
     * @param value The corresponding value of the entry to be added into
     *            parameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRestApiRequest addparametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public PutRestApiRequest clearparametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * [Required] The PUT request body containing external API definitions.
     * Currently, only OpenAPI definition JSON/YAML files are supported. The
     * maximum size of the API definition file is 2MB.
     * </p>
     *
     * @return <p>
     *         [Required] The PUT request body containing external API
     *         definitions. Currently, only OpenAPI definition JSON/YAML files
     *         are supported. The maximum size of the API definition file is
     *         2MB.
     *         </p>
     */
    public java.nio.ByteBuffer getBody() {
        return body;
    }

    /**
     * <p>
     * [Required] The PUT request body containing external API definitions.
     * Currently, only OpenAPI definition JSON/YAML files are supported. The
     * maximum size of the API definition file is 2MB.
     * </p>
     *
     * @param body <p>
     *            [Required] The PUT request body containing external API
     *            definitions. Currently, only OpenAPI definition JSON/YAML
     *            files are supported. The maximum size of the API definition
     *            file is 2MB.
     *            </p>
     */
    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * [Required] The PUT request body containing external API definitions.
     * Currently, only OpenAPI definition JSON/YAML files are supported. The
     * maximum size of the API definition file is 2MB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            [Required] The PUT request body containing external API
     *            definitions. Currently, only OpenAPI definition JSON/YAML
     *            files are supported. The maximum size of the API definition
     *            file is 2MB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRestApiRequest withBody(java.nio.ByteBuffer body) {
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
        if (getParameters() != null)
            sb.append("parameters: " + getParameters() + ",");
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
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRestApiRequest == false)
            return false;
        PutRestApiRequest other = (PutRestApiRequest) obj;

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
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        return true;
    }
}
