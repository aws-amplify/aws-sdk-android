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
 * Gets the documentation parts of an API. The result may be filtered by the
 * type, name, or path of API entities (targets).
 * </p>
 */
public class GetDocumentationPartsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * The type of API entities of the to-be-retrieved documentation parts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>API, AUTHORIZER, MODEL, RESOURCE, METHOD,
     * PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE,
     * RESPONSE_HEADER, RESPONSE_BODY
     */
    private String type;

    /**
     * <p>
     * The name of API entities of the to-be-retrieved documentation parts.
     * </p>
     */
    private String nameQuery;

    /**
     * <p>
     * The path of API entities of the to-be-retrieved documentation parts.
     * </p>
     */
    private String path;

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     */
    private String position;

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25
     * and the maximum value is 500.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The status of the API documentation parts to retrieve. Valid values are
     * <code>DOCUMENTED</code> for retrieving <a>DocumentationPart</a> resources
     * with content and <code>UNDOCUMENTED</code> for <a>DocumentationPart</a>
     * resources without content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENTED, UNDOCUMENTED
     */
    private String locationStatus;

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
    public GetDocumentationPartsRequest withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * <p>
     * The type of API entities of the to-be-retrieved documentation parts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>API, AUTHORIZER, MODEL, RESOURCE, METHOD,
     * PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE,
     * RESPONSE_HEADER, RESPONSE_BODY
     *
     * @return <p>
     *         The type of API entities of the to-be-retrieved documentation
     *         parts.
     *         </p>
     * @see DocumentationPartType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of API entities of the to-be-retrieved documentation parts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>API, AUTHORIZER, MODEL, RESOURCE, METHOD,
     * PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE,
     * RESPONSE_HEADER, RESPONSE_BODY
     *
     * @param type <p>
     *            The type of API entities of the to-be-retrieved documentation
     *            parts.
     *            </p>
     * @see DocumentationPartType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of API entities of the to-be-retrieved documentation parts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>API, AUTHORIZER, MODEL, RESOURCE, METHOD,
     * PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE,
     * RESPONSE_HEADER, RESPONSE_BODY
     *
     * @param type <p>
     *            The type of API entities of the to-be-retrieved documentation
     *            parts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentationPartType
     */
    public GetDocumentationPartsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of API entities of the to-be-retrieved documentation parts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>API, AUTHORIZER, MODEL, RESOURCE, METHOD,
     * PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE,
     * RESPONSE_HEADER, RESPONSE_BODY
     *
     * @param type <p>
     *            The type of API entities of the to-be-retrieved documentation
     *            parts.
     *            </p>
     * @see DocumentationPartType
     */
    public void setType(DocumentationPartType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of API entities of the to-be-retrieved documentation parts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>API, AUTHORIZER, MODEL, RESOURCE, METHOD,
     * PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE,
     * RESPONSE_HEADER, RESPONSE_BODY
     *
     * @param type <p>
     *            The type of API entities of the to-be-retrieved documentation
     *            parts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentationPartType
     */
    public GetDocumentationPartsRequest withType(DocumentationPartType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of API entities of the to-be-retrieved documentation parts.
     * </p>
     *
     * @return <p>
     *         The name of API entities of the to-be-retrieved documentation
     *         parts.
     *         </p>
     */
    public String getNameQuery() {
        return nameQuery;
    }

    /**
     * <p>
     * The name of API entities of the to-be-retrieved documentation parts.
     * </p>
     *
     * @param nameQuery <p>
     *            The name of API entities of the to-be-retrieved documentation
     *            parts.
     *            </p>
     */
    public void setNameQuery(String nameQuery) {
        this.nameQuery = nameQuery;
    }

    /**
     * <p>
     * The name of API entities of the to-be-retrieved documentation parts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nameQuery <p>
     *            The name of API entities of the to-be-retrieved documentation
     *            parts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentationPartsRequest withNameQuery(String nameQuery) {
        this.nameQuery = nameQuery;
        return this;
    }

    /**
     * <p>
     * The path of API entities of the to-be-retrieved documentation parts.
     * </p>
     *
     * @return <p>
     *         The path of API entities of the to-be-retrieved documentation
     *         parts.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The path of API entities of the to-be-retrieved documentation parts.
     * </p>
     *
     * @param path <p>
     *            The path of API entities of the to-be-retrieved documentation
     *            parts.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path of API entities of the to-be-retrieved documentation parts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param path <p>
     *            The path of API entities of the to-be-retrieved documentation
     *            parts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentationPartsRequest withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     *
     * @return <p>
     *         The current pagination position in the paged result set.
     *         </p>
     */
    public String getPosition() {
        return position;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     *
     * @param position <p>
     *            The current pagination position in the paged result set.
     *            </p>
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            The current pagination position in the paged result set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentationPartsRequest withPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25
     * and the maximum value is 500.
     * </p>
     *
     * @return <p>
     *         The maximum number of returned results per page. The default
     *         value is 25 and the maximum value is 500.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25
     * and the maximum value is 500.
     * </p>
     *
     * @param limit <p>
     *            The maximum number of returned results per page. The default
     *            value is 25 and the maximum value is 500.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25
     * and the maximum value is 500.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limit <p>
     *            The maximum number of returned results per page. The default
     *            value is 25 and the maximum value is 500.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentationPartsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * The status of the API documentation parts to retrieve. Valid values are
     * <code>DOCUMENTED</code> for retrieving <a>DocumentationPart</a> resources
     * with content and <code>UNDOCUMENTED</code> for <a>DocumentationPart</a>
     * resources without content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENTED, UNDOCUMENTED
     *
     * @return <p>
     *         The status of the API documentation parts to retrieve. Valid
     *         values are <code>DOCUMENTED</code> for retrieving
     *         <a>DocumentationPart</a> resources with content and
     *         <code>UNDOCUMENTED</code> for <a>DocumentationPart</a> resources
     *         without content.
     *         </p>
     * @see LocationStatusType
     */
    public String getLocationStatus() {
        return locationStatus;
    }

    /**
     * <p>
     * The status of the API documentation parts to retrieve. Valid values are
     * <code>DOCUMENTED</code> for retrieving <a>DocumentationPart</a> resources
     * with content and <code>UNDOCUMENTED</code> for <a>DocumentationPart</a>
     * resources without content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENTED, UNDOCUMENTED
     *
     * @param locationStatus <p>
     *            The status of the API documentation parts to retrieve. Valid
     *            values are <code>DOCUMENTED</code> for retrieving
     *            <a>DocumentationPart</a> resources with content and
     *            <code>UNDOCUMENTED</code> for <a>DocumentationPart</a>
     *            resources without content.
     *            </p>
     * @see LocationStatusType
     */
    public void setLocationStatus(String locationStatus) {
        this.locationStatus = locationStatus;
    }

    /**
     * <p>
     * The status of the API documentation parts to retrieve. Valid values are
     * <code>DOCUMENTED</code> for retrieving <a>DocumentationPart</a> resources
     * with content and <code>UNDOCUMENTED</code> for <a>DocumentationPart</a>
     * resources without content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENTED, UNDOCUMENTED
     *
     * @param locationStatus <p>
     *            The status of the API documentation parts to retrieve. Valid
     *            values are <code>DOCUMENTED</code> for retrieving
     *            <a>DocumentationPart</a> resources with content and
     *            <code>UNDOCUMENTED</code> for <a>DocumentationPart</a>
     *            resources without content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LocationStatusType
     */
    public GetDocumentationPartsRequest withLocationStatus(String locationStatus) {
        this.locationStatus = locationStatus;
        return this;
    }

    /**
     * <p>
     * The status of the API documentation parts to retrieve. Valid values are
     * <code>DOCUMENTED</code> for retrieving <a>DocumentationPart</a> resources
     * with content and <code>UNDOCUMENTED</code> for <a>DocumentationPart</a>
     * resources without content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENTED, UNDOCUMENTED
     *
     * @param locationStatus <p>
     *            The status of the API documentation parts to retrieve. Valid
     *            values are <code>DOCUMENTED</code> for retrieving
     *            <a>DocumentationPart</a> resources with content and
     *            <code>UNDOCUMENTED</code> for <a>DocumentationPart</a>
     *            resources without content.
     *            </p>
     * @see LocationStatusType
     */
    public void setLocationStatus(LocationStatusType locationStatus) {
        this.locationStatus = locationStatus.toString();
    }

    /**
     * <p>
     * The status of the API documentation parts to retrieve. Valid values are
     * <code>DOCUMENTED</code> for retrieving <a>DocumentationPart</a> resources
     * with content and <code>UNDOCUMENTED</code> for <a>DocumentationPart</a>
     * resources without content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENTED, UNDOCUMENTED
     *
     * @param locationStatus <p>
     *            The status of the API documentation parts to retrieve. Valid
     *            values are <code>DOCUMENTED</code> for retrieving
     *            <a>DocumentationPart</a> resources with content and
     *            <code>UNDOCUMENTED</code> for <a>DocumentationPart</a>
     *            resources without content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LocationStatusType
     */
    public GetDocumentationPartsRequest withLocationStatus(LocationStatusType locationStatus) {
        this.locationStatus = locationStatus.toString();
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
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getNameQuery() != null)
            sb.append("nameQuery: " + getNameQuery() + ",");
        if (getPath() != null)
            sb.append("path: " + getPath() + ",");
        if (getPosition() != null)
            sb.append("position: " + getPosition() + ",");
        if (getLimit() != null)
            sb.append("limit: " + getLimit() + ",");
        if (getLocationStatus() != null)
            sb.append("locationStatus: " + getLocationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getNameQuery() == null) ? 0 : getNameQuery().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode
                + ((getLocationStatus() == null) ? 0 : getLocationStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDocumentationPartsRequest == false)
            return false;
        GetDocumentationPartsRequest other = (GetDocumentationPartsRequest) obj;

        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getNameQuery() == null ^ this.getNameQuery() == null)
            return false;
        if (other.getNameQuery() != null
                && other.getNameQuery().equals(this.getNameQuery()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getLocationStatus() == null ^ this.getLocationStatus() == null)
            return false;
        if (other.getLocationStatus() != null
                && other.getLocationStatus().equals(this.getLocationStatus()) == false)
            return false;
        return true;
    }
}
