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
 * Creates a new <a>BasePathMapping</a> resource.
 * </p>
 */
public class CreateBasePathMappingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The domain name of the <a>BasePathMapping</a> resource to
     * create.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The base path name that callers of the API must provide as part of the
     * URL after the domain name. This value must be unique for all of the
     * mappings across a single API. Specify '(none)' if you do not want callers
     * to specify a base path name after the domain name.
     * </p>
     */
    private String basePath;

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * The name of the API's stage that you want to use for this mapping.
     * Specify '(none)' if you want callers to explicitly specify the stage name
     * after any base path name.
     * </p>
     */
    private String stage;

    /**
     * <p>
     * [Required] The domain name of the <a>BasePathMapping</a> resource to
     * create.
     * </p>
     *
     * @return <p>
     *         [Required] The domain name of the <a>BasePathMapping</a> resource
     *         to create.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * [Required] The domain name of the <a>BasePathMapping</a> resource to
     * create.
     * </p>
     *
     * @param domainName <p>
     *            [Required] The domain name of the <a>BasePathMapping</a>
     *            resource to create.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * [Required] The domain name of the <a>BasePathMapping</a> resource to
     * create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainName <p>
     *            [Required] The domain name of the <a>BasePathMapping</a>
     *            resource to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBasePathMappingRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The base path name that callers of the API must provide as part of the
     * URL after the domain name. This value must be unique for all of the
     * mappings across a single API. Specify '(none)' if you do not want callers
     * to specify a base path name after the domain name.
     * </p>
     *
     * @return <p>
     *         The base path name that callers of the API must provide as part
     *         of the URL after the domain name. This value must be unique for
     *         all of the mappings across a single API. Specify '(none)' if you
     *         do not want callers to specify a base path name after the domain
     *         name.
     *         </p>
     */
    public String getBasePath() {
        return basePath;
    }

    /**
     * <p>
     * The base path name that callers of the API must provide as part of the
     * URL after the domain name. This value must be unique for all of the
     * mappings across a single API. Specify '(none)' if you do not want callers
     * to specify a base path name after the domain name.
     * </p>
     *
     * @param basePath <p>
     *            The base path name that callers of the API must provide as
     *            part of the URL after the domain name. This value must be
     *            unique for all of the mappings across a single API. Specify
     *            '(none)' if you do not want callers to specify a base path
     *            name after the domain name.
     *            </p>
     */
    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    /**
     * <p>
     * The base path name that callers of the API must provide as part of the
     * URL after the domain name. This value must be unique for all of the
     * mappings across a single API. Specify '(none)' if you do not want callers
     * to specify a base path name after the domain name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param basePath <p>
     *            The base path name that callers of the API must provide as
     *            part of the URL after the domain name. This value must be
     *            unique for all of the mappings across a single API. Specify
     *            '(none)' if you do not want callers to specify a base path
     *            name after the domain name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBasePathMappingRequest withBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

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
    public CreateBasePathMappingRequest withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * <p>
     * The name of the API's stage that you want to use for this mapping.
     * Specify '(none)' if you want callers to explicitly specify the stage name
     * after any base path name.
     * </p>
     *
     * @return <p>
     *         The name of the API's stage that you want to use for this
     *         mapping. Specify '(none)' if you want callers to explicitly
     *         specify the stage name after any base path name.
     *         </p>
     */
    public String getStage() {
        return stage;
    }

    /**
     * <p>
     * The name of the API's stage that you want to use for this mapping.
     * Specify '(none)' if you want callers to explicitly specify the stage name
     * after any base path name.
     * </p>
     *
     * @param stage <p>
     *            The name of the API's stage that you want to use for this
     *            mapping. Specify '(none)' if you want callers to explicitly
     *            specify the stage name after any base path name.
     *            </p>
     */
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The name of the API's stage that you want to use for this mapping.
     * Specify '(none)' if you want callers to explicitly specify the stage name
     * after any base path name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stage <p>
     *            The name of the API's stage that you want to use for this
     *            mapping. Specify '(none)' if you want callers to explicitly
     *            specify the stage name after any base path name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBasePathMappingRequest withStage(String stage) {
        this.stage = stage;
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
        if (getDomainName() != null)
            sb.append("domainName: " + getDomainName() + ",");
        if (getBasePath() != null)
            sb.append("basePath: " + getBasePath() + ",");
        if (getRestApiId() != null)
            sb.append("restApiId: " + getRestApiId() + ",");
        if (getStage() != null)
            sb.append("stage: " + getStage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getBasePath() == null) ? 0 : getBasePath().hashCode());
        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBasePathMappingRequest == false)
            return false;
        CreateBasePathMappingRequest other = (CreateBasePathMappingRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getBasePath() == null ^ this.getBasePath() == null)
            return false;
        if (other.getBasePath() != null && other.getBasePath().equals(this.getBasePath()) == false)
            return false;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        return true;
    }
}
