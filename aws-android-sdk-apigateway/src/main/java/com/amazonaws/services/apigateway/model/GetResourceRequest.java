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
 * Lists information about a resource.
 * </p>
 */
public class GetResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * [Required] The identifier for the <a>Resource</a> resource.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * A query parameter to retrieve the specified resources embedded in the
     * returned <a>Resource</a> representation in the response. This
     * <code>embed</code> parameter value is a list of comma-separated strings.
     * Currently, the request supports only retrieval of the embedded
     * <a>Method</a> resources this way. The query parameter value must be a
     * single-valued list and contain the <code>"methods"</code> string. For
     * example,
     * <code>GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods</code>
     * .
     * </p>
     */
    private java.util.List<String> embed;

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
    public GetResourceRequest withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * <p>
     * [Required] The identifier for the <a>Resource</a> resource.
     * </p>
     *
     * @return <p>
     *         [Required] The identifier for the <a>Resource</a> resource.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * [Required] The identifier for the <a>Resource</a> resource.
     * </p>
     *
     * @param resourceId <p>
     *            [Required] The identifier for the <a>Resource</a> resource.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * [Required] The identifier for the <a>Resource</a> resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceId <p>
     *            [Required] The identifier for the <a>Resource</a> resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * A query parameter to retrieve the specified resources embedded in the
     * returned <a>Resource</a> representation in the response. This
     * <code>embed</code> parameter value is a list of comma-separated strings.
     * Currently, the request supports only retrieval of the embedded
     * <a>Method</a> resources this way. The query parameter value must be a
     * single-valued list and contain the <code>"methods"</code> string. For
     * example,
     * <code>GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods</code>
     * .
     * </p>
     *
     * @return <p>
     *         A query parameter to retrieve the specified resources embedded in
     *         the returned <a>Resource</a> representation in the response. This
     *         <code>embed</code> parameter value is a list of comma-separated
     *         strings. Currently, the request supports only retrieval of the
     *         embedded <a>Method</a> resources this way. The query parameter
     *         value must be a single-valued list and contain the
     *         <code>"methods"</code> string. For example,
     *         <code>GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods</code>
     *         .
     *         </p>
     */
    public java.util.List<String> getEmbed() {
        return embed;
    }

    /**
     * <p>
     * A query parameter to retrieve the specified resources embedded in the
     * returned <a>Resource</a> representation in the response. This
     * <code>embed</code> parameter value is a list of comma-separated strings.
     * Currently, the request supports only retrieval of the embedded
     * <a>Method</a> resources this way. The query parameter value must be a
     * single-valued list and contain the <code>"methods"</code> string. For
     * example,
     * <code>GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods</code>
     * .
     * </p>
     *
     * @param embed <p>
     *            A query parameter to retrieve the specified resources embedded
     *            in the returned <a>Resource</a> representation in the
     *            response. This <code>embed</code> parameter value is a list of
     *            comma-separated strings. Currently, the request supports only
     *            retrieval of the embedded <a>Method</a> resources this way.
     *            The query parameter value must be a single-valued list and
     *            contain the <code>"methods"</code> string. For example,
     *            <code>GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods</code>
     *            .
     *            </p>
     */
    public void setEmbed(java.util.Collection<String> embed) {
        if (embed == null) {
            this.embed = null;
            return;
        }

        this.embed = new java.util.ArrayList<String>(embed);
    }

    /**
     * <p>
     * A query parameter to retrieve the specified resources embedded in the
     * returned <a>Resource</a> representation in the response. This
     * <code>embed</code> parameter value is a list of comma-separated strings.
     * Currently, the request supports only retrieval of the embedded
     * <a>Method</a> resources this way. The query parameter value must be a
     * single-valued list and contain the <code>"methods"</code> string. For
     * example,
     * <code>GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param embed <p>
     *            A query parameter to retrieve the specified resources embedded
     *            in the returned <a>Resource</a> representation in the
     *            response. This <code>embed</code> parameter value is a list of
     *            comma-separated strings. Currently, the request supports only
     *            retrieval of the embedded <a>Method</a> resources this way.
     *            The query parameter value must be a single-valued list and
     *            contain the <code>"methods"</code> string. For example,
     *            <code>GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceRequest withEmbed(String... embed) {
        if (getEmbed() == null) {
            this.embed = new java.util.ArrayList<String>(embed.length);
        }
        for (String value : embed) {
            this.embed.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A query parameter to retrieve the specified resources embedded in the
     * returned <a>Resource</a> representation in the response. This
     * <code>embed</code> parameter value is a list of comma-separated strings.
     * Currently, the request supports only retrieval of the embedded
     * <a>Method</a> resources this way. The query parameter value must be a
     * single-valued list and contain the <code>"methods"</code> string. For
     * example,
     * <code>GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param embed <p>
     *            A query parameter to retrieve the specified resources embedded
     *            in the returned <a>Resource</a> representation in the
     *            response. This <code>embed</code> parameter value is a list of
     *            comma-separated strings. Currently, the request supports only
     *            retrieval of the embedded <a>Method</a> resources this way.
     *            The query parameter value must be a single-valued list and
     *            contain the <code>"methods"</code> string. For example,
     *            <code>GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceRequest withEmbed(java.util.Collection<String> embed) {
        setEmbed(embed);
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
        if (getEmbed() != null)
            sb.append("embed: " + getEmbed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getEmbed() == null) ? 0 : getEmbed().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceRequest == false)
            return false;
        GetResourceRequest other = (GetResourceRequest) obj;

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
        if (other.getEmbed() == null ^ this.getEmbed() == null)
            return false;
        if (other.getEmbed() != null && other.getEmbed().equals(this.getEmbed()) == false)
            return false;
        return true;
    }
}
