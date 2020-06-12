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
 * A feature of the API Gateway control service for creating a new API from an
 * external API definition file.
 * </p>
 */
public class ImportRestApiRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A query parameter to indicate whether to rollback the API creation (
     * <code>true</code>) or not (<code>false</code>) when a warning is
     * encountered. The default value is <code>false</code>.
     * </p>
     */
    private Boolean failOnWarnings;

    /**
     * <p>
     * A key-value map of context-specific query string parameters specifying
     * the behavior of different API importing operations. The following shows
     * operation-specific parameters and their supported values.
     * </p>
     * <p>
     * To exclude <a>DocumentationParts</a> from the import, set
     * <code>parameters</code> as <code>ignore=documentation</code>.
     * </p>
     * <p>
     * To configure the endpoint type, set <code>parameters</code> as
     * <code>endpointConfigurationTypes=EDGE</code>,
     * <code>endpointConfigurationTypes=REGIONAL</code>, or
     * <code>endpointConfigurationTypes=PRIVATE</code>. The default endpoint
     * type is <code>EDGE</code>.
     * </p>
     * <p>
     * To handle imported <code>basepath</code>, set <code>parameters</code> as
     * <code>basepath=ignore</code>, <code>basepath=prepend</code> or
     * <code>basepath=split</code>.
     * </p>
     * <p>
     * For example, the AWS CLI command to exclude documentation from the
     * imported API is:
     * </p>
     * 
     * <pre>
     * <code>aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'</code>
     * </pre>
     * <p>
     * The AWS CLI command to set the regional endpoint on the imported API is:
     * </p>
     * 
     * <pre>
     * <code>aws apigateway import-rest-api --parameters endpointConfigurationTypes=REGIONAL --body 'file:///path/to/imported-api-body.json'</code>
     * </pre>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * [Required] The POST request body containing external API definitions.
     * Currently, only OpenAPI definition JSON/YAML files are supported. The
     * maximum size of the API definition file is 6MB.
     * </p>
     */
    private java.nio.ByteBuffer body;

    /**
     * <p>
     * A query parameter to indicate whether to rollback the API creation (
     * <code>true</code>) or not (<code>false</code>) when a warning is
     * encountered. The default value is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         A query parameter to indicate whether to rollback the API
     *         creation (<code>true</code>) or not (<code>false</code>) when a
     *         warning is encountered. The default value is <code>false</code>.
     *         </p>
     */
    public Boolean isFailOnWarnings() {
        return failOnWarnings;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback the API creation (
     * <code>true</code>) or not (<code>false</code>) when a warning is
     * encountered. The default value is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         A query parameter to indicate whether to rollback the API
     *         creation (<code>true</code>) or not (<code>false</code>) when a
     *         warning is encountered. The default value is <code>false</code>.
     *         </p>
     */
    public Boolean getFailOnWarnings() {
        return failOnWarnings;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback the API creation (
     * <code>true</code>) or not (<code>false</code>) when a warning is
     * encountered. The default value is <code>false</code>.
     * </p>
     *
     * @param failOnWarnings <p>
     *            A query parameter to indicate whether to rollback the API
     *            creation (<code>true</code>) or not (<code>false</code>) when
     *            a warning is encountered. The default value is
     *            <code>false</code>.
     *            </p>
     */
    public void setFailOnWarnings(Boolean failOnWarnings) {
        this.failOnWarnings = failOnWarnings;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback the API creation (
     * <code>true</code>) or not (<code>false</code>) when a warning is
     * encountered. The default value is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failOnWarnings <p>
     *            A query parameter to indicate whether to rollback the API
     *            creation (<code>true</code>) or not (<code>false</code>) when
     *            a warning is encountered. The default value is
     *            <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportRestApiRequest withFailOnWarnings(Boolean failOnWarnings) {
        this.failOnWarnings = failOnWarnings;
        return this;
    }

    /**
     * <p>
     * A key-value map of context-specific query string parameters specifying
     * the behavior of different API importing operations. The following shows
     * operation-specific parameters and their supported values.
     * </p>
     * <p>
     * To exclude <a>DocumentationParts</a> from the import, set
     * <code>parameters</code> as <code>ignore=documentation</code>.
     * </p>
     * <p>
     * To configure the endpoint type, set <code>parameters</code> as
     * <code>endpointConfigurationTypes=EDGE</code>,
     * <code>endpointConfigurationTypes=REGIONAL</code>, or
     * <code>endpointConfigurationTypes=PRIVATE</code>. The default endpoint
     * type is <code>EDGE</code>.
     * </p>
     * <p>
     * To handle imported <code>basepath</code>, set <code>parameters</code> as
     * <code>basepath=ignore</code>, <code>basepath=prepend</code> or
     * <code>basepath=split</code>.
     * </p>
     * <p>
     * For example, the AWS CLI command to exclude documentation from the
     * imported API is:
     * </p>
     * 
     * <pre>
     * <code>aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'</code>
     * </pre>
     * <p>
     * The AWS CLI command to set the regional endpoint on the imported API is:
     * </p>
     * 
     * <pre>
     * <code>aws apigateway import-rest-api --parameters endpointConfigurationTypes=REGIONAL --body 'file:///path/to/imported-api-body.json'</code>
     * </pre>
     *
     * @return <p>
     *         A key-value map of context-specific query string parameters
     *         specifying the behavior of different API importing operations.
     *         The following shows operation-specific parameters and their
     *         supported values.
     *         </p>
     *         <p>
     *         To exclude <a>DocumentationParts</a> from the import, set
     *         <code>parameters</code> as <code>ignore=documentation</code>.
     *         </p>
     *         <p>
     *         To configure the endpoint type, set <code>parameters</code> as
     *         <code>endpointConfigurationTypes=EDGE</code>,
     *         <code>endpointConfigurationTypes=REGIONAL</code>, or
     *         <code>endpointConfigurationTypes=PRIVATE</code>. The default
     *         endpoint type is <code>EDGE</code>.
     *         </p>
     *         <p>
     *         To handle imported <code>basepath</code>, set
     *         <code>parameters</code> as <code>basepath=ignore</code>,
     *         <code>basepath=prepend</code> or <code>basepath=split</code>.
     *         </p>
     *         <p>
     *         For example, the AWS CLI command to exclude documentation from
     *         the imported API is:
     *         </p>
     * 
     *         <pre>
     * <code>aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'</code>
     * </pre>
     *         <p>
     *         The AWS CLI command to set the regional endpoint on the imported
     *         API is:
     *         </p>
     * 
     *         <pre>
     * <code>aws apigateway import-rest-api --parameters endpointConfigurationTypes=REGIONAL --body 'file:///path/to/imported-api-body.json'</code>
     * </pre>
     */
    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A key-value map of context-specific query string parameters specifying
     * the behavior of different API importing operations. The following shows
     * operation-specific parameters and their supported values.
     * </p>
     * <p>
     * To exclude <a>DocumentationParts</a> from the import, set
     * <code>parameters</code> as <code>ignore=documentation</code>.
     * </p>
     * <p>
     * To configure the endpoint type, set <code>parameters</code> as
     * <code>endpointConfigurationTypes=EDGE</code>,
     * <code>endpointConfigurationTypes=REGIONAL</code>, or
     * <code>endpointConfigurationTypes=PRIVATE</code>. The default endpoint
     * type is <code>EDGE</code>.
     * </p>
     * <p>
     * To handle imported <code>basepath</code>, set <code>parameters</code> as
     * <code>basepath=ignore</code>, <code>basepath=prepend</code> or
     * <code>basepath=split</code>.
     * </p>
     * <p>
     * For example, the AWS CLI command to exclude documentation from the
     * imported API is:
     * </p>
     * 
     * <pre>
     * <code>aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'</code>
     * </pre>
     * <p>
     * The AWS CLI command to set the regional endpoint on the imported API is:
     * </p>
     * 
     * <pre>
     * <code>aws apigateway import-rest-api --parameters endpointConfigurationTypes=REGIONAL --body 'file:///path/to/imported-api-body.json'</code>
     * </pre>
     *
     * @param parameters <p>
     *            A key-value map of context-specific query string parameters
     *            specifying the behavior of different API importing operations.
     *            The following shows operation-specific parameters and their
     *            supported values.
     *            </p>
     *            <p>
     *            To exclude <a>DocumentationParts</a> from the import, set
     *            <code>parameters</code> as <code>ignore=documentation</code>.
     *            </p>
     *            <p>
     *            To configure the endpoint type, set <code>parameters</code> as
     *            <code>endpointConfigurationTypes=EDGE</code>,
     *            <code>endpointConfigurationTypes=REGIONAL</code>, or
     *            <code>endpointConfigurationTypes=PRIVATE</code>. The default
     *            endpoint type is <code>EDGE</code>.
     *            </p>
     *            <p>
     *            To handle imported <code>basepath</code>, set
     *            <code>parameters</code> as <code>basepath=ignore</code>,
     *            <code>basepath=prepend</code> or <code>basepath=split</code>.
     *            </p>
     *            <p>
     *            For example, the AWS CLI command to exclude documentation from
     *            the imported API is:
     *            </p>
     * 
     *            <pre>
     * <code>aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'</code>
     * </pre>
     *            <p>
     *            The AWS CLI command to set the regional endpoint on the
     *            imported API is:
     *            </p>
     * 
     *            <pre>
     * <code>aws apigateway import-rest-api --parameters endpointConfigurationTypes=REGIONAL --body 'file:///path/to/imported-api-body.json'</code>
     * </pre>
     */
    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A key-value map of context-specific query string parameters specifying
     * the behavior of different API importing operations. The following shows
     * operation-specific parameters and their supported values.
     * </p>
     * <p>
     * To exclude <a>DocumentationParts</a> from the import, set
     * <code>parameters</code> as <code>ignore=documentation</code>.
     * </p>
     * <p>
     * To configure the endpoint type, set <code>parameters</code> as
     * <code>endpointConfigurationTypes=EDGE</code>,
     * <code>endpointConfigurationTypes=REGIONAL</code>, or
     * <code>endpointConfigurationTypes=PRIVATE</code>. The default endpoint
     * type is <code>EDGE</code>.
     * </p>
     * <p>
     * To handle imported <code>basepath</code>, set <code>parameters</code> as
     * <code>basepath=ignore</code>, <code>basepath=prepend</code> or
     * <code>basepath=split</code>.
     * </p>
     * <p>
     * For example, the AWS CLI command to exclude documentation from the
     * imported API is:
     * </p>
     * 
     * <pre>
     * <code>aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'</code>
     * </pre>
     * <p>
     * The AWS CLI command to set the regional endpoint on the imported API is:
     * </p>
     * 
     * <pre>
     * <code>aws apigateway import-rest-api --parameters endpointConfigurationTypes=REGIONAL --body 'file:///path/to/imported-api-body.json'</code>
     * </pre>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A key-value map of context-specific query string parameters
     *            specifying the behavior of different API importing operations.
     *            The following shows operation-specific parameters and their
     *            supported values.
     *            </p>
     *            <p>
     *            To exclude <a>DocumentationParts</a> from the import, set
     *            <code>parameters</code> as <code>ignore=documentation</code>.
     *            </p>
     *            <p>
     *            To configure the endpoint type, set <code>parameters</code> as
     *            <code>endpointConfigurationTypes=EDGE</code>,
     *            <code>endpointConfigurationTypes=REGIONAL</code>, or
     *            <code>endpointConfigurationTypes=PRIVATE</code>. The default
     *            endpoint type is <code>EDGE</code>.
     *            </p>
     *            <p>
     *            To handle imported <code>basepath</code>, set
     *            <code>parameters</code> as <code>basepath=ignore</code>,
     *            <code>basepath=prepend</code> or <code>basepath=split</code>.
     *            </p>
     *            <p>
     *            For example, the AWS CLI command to exclude documentation from
     *            the imported API is:
     *            </p>
     * 
     *            <pre>
     * <code>aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'</code>
     * </pre>
     *            <p>
     *            The AWS CLI command to set the regional endpoint on the
     *            imported API is:
     *            </p>
     * 
     *            <pre>
     * <code>aws apigateway import-rest-api --parameters endpointConfigurationTypes=REGIONAL --body 'file:///path/to/imported-api-body.json'</code>
     * </pre>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportRestApiRequest withParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * A key-value map of context-specific query string parameters specifying
     * the behavior of different API importing operations. The following shows
     * operation-specific parameters and their supported values.
     * </p>
     * <p>
     * To exclude <a>DocumentationParts</a> from the import, set
     * <code>parameters</code> as <code>ignore=documentation</code>.
     * </p>
     * <p>
     * To configure the endpoint type, set <code>parameters</code> as
     * <code>endpointConfigurationTypes=EDGE</code>,
     * <code>endpointConfigurationTypes=REGIONAL</code>, or
     * <code>endpointConfigurationTypes=PRIVATE</code>. The default endpoint
     * type is <code>EDGE</code>.
     * </p>
     * <p>
     * To handle imported <code>basepath</code>, set <code>parameters</code> as
     * <code>basepath=ignore</code>, <code>basepath=prepend</code> or
     * <code>basepath=split</code>.
     * </p>
     * <p>
     * For example, the AWS CLI command to exclude documentation from the
     * imported API is:
     * </p>
     * 
     * <pre>
     * <code>aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'</code>
     * </pre>
     * <p>
     * The AWS CLI command to set the regional endpoint on the imported API is:
     * </p>
     * 
     * <pre>
     * <code>aws apigateway import-rest-api --parameters endpointConfigurationTypes=REGIONAL --body 'file:///path/to/imported-api-body.json'</code>
     * </pre>
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
    public ImportRestApiRequest addparametersEntry(String key, String value) {
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
    public ImportRestApiRequest clearparametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * [Required] The POST request body containing external API definitions.
     * Currently, only OpenAPI definition JSON/YAML files are supported. The
     * maximum size of the API definition file is 6MB.
     * </p>
     *
     * @return <p>
     *         [Required] The POST request body containing external API
     *         definitions. Currently, only OpenAPI definition JSON/YAML files
     *         are supported. The maximum size of the API definition file is
     *         6MB.
     *         </p>
     */
    public java.nio.ByteBuffer getBody() {
        return body;
    }

    /**
     * <p>
     * [Required] The POST request body containing external API definitions.
     * Currently, only OpenAPI definition JSON/YAML files are supported. The
     * maximum size of the API definition file is 6MB.
     * </p>
     *
     * @param body <p>
     *            [Required] The POST request body containing external API
     *            definitions. Currently, only OpenAPI definition JSON/YAML
     *            files are supported. The maximum size of the API definition
     *            file is 6MB.
     *            </p>
     */
    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * [Required] The POST request body containing external API definitions.
     * Currently, only OpenAPI definition JSON/YAML files are supported. The
     * maximum size of the API definition file is 6MB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            [Required] The POST request body containing external API
     *            definitions. Currently, only OpenAPI definition JSON/YAML
     *            files are supported. The maximum size of the API definition
     *            file is 6MB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportRestApiRequest withBody(java.nio.ByteBuffer body) {
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

        if (obj instanceof ImportRestApiRequest == false)
            return false;
        ImportRestApiRequest other = (ImportRestApiRequest) obj;

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
