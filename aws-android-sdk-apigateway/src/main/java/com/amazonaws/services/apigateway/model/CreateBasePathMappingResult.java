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

/**
 * <p>
 * Represents the base path that callers of the API must provide as part of the
 * URL after the domain name.
 * </p>
 * <div class="remarks">A custom domain name plus a <code>BasePathMapping</code>
 * specification identifies a deployed <a>RestApi</a> in a given stage of the
 * owner <a>Account</a>.</div> <div class="seeAlso"> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html"
 * >Use Custom Domain Names</a> </div>
 */
public class CreateBasePathMappingResult implements Serializable {
    /**
     * <p>
     * The base path name that callers of the API must provide as part of the
     * URL after the domain name.
     * </p>
     */
    private String basePath;

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * The name of the associated stage.
     * </p>
     */
    private String stage;

    /**
     * <p>
     * The base path name that callers of the API must provide as part of the
     * URL after the domain name.
     * </p>
     *
     * @return <p>
     *         The base path name that callers of the API must provide as part
     *         of the URL after the domain name.
     *         </p>
     */
    public String getBasePath() {
        return basePath;
    }

    /**
     * <p>
     * The base path name that callers of the API must provide as part of the
     * URL after the domain name.
     * </p>
     *
     * @param basePath <p>
     *            The base path name that callers of the API must provide as
     *            part of the URL after the domain name.
     *            </p>
     */
    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    /**
     * <p>
     * The base path name that callers of the API must provide as part of the
     * URL after the domain name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param basePath <p>
     *            The base path name that callers of the API must provide as
     *            part of the URL after the domain name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBasePathMappingResult withBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     *
     * @return <p>
     *         The string identifier of the associated <a>RestApi</a>.
     *         </p>
     */
    public String getRestApiId() {
        return restApiId;
    }

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     *
     * @param restApiId <p>
     *            The string identifier of the associated <a>RestApi</a>.
     *            </p>
     */
    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restApiId <p>
     *            The string identifier of the associated <a>RestApi</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBasePathMappingResult withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * <p>
     * The name of the associated stage.
     * </p>
     *
     * @return <p>
     *         The name of the associated stage.
     *         </p>
     */
    public String getStage() {
        return stage;
    }

    /**
     * <p>
     * The name of the associated stage.
     * </p>
     *
     * @param stage <p>
     *            The name of the associated stage.
     *            </p>
     */
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The name of the associated stage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stage <p>
     *            The name of the associated stage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBasePathMappingResult withStage(String stage) {
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

        if (obj instanceof CreateBasePathMappingResult == false)
            return false;
        CreateBasePathMappingResult other = (CreateBasePathMappingResult) obj;

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
