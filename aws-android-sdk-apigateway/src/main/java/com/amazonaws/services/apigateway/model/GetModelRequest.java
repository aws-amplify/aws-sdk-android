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
 * Describes an existing model defined for a <a>RestApi</a> resource.
 * </p>
 */
public class GetModelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The <a>RestApi</a> identifier under which the <a>Model</a>
     * exists.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * [Required] The name of the model as an identifier.
     * </p>
     */
    private String modelName;

    /**
     * <p>
     * A query parameter of a Boolean value to resolve (<code>true</code>) all
     * external model references and returns a flattened model schema or not (
     * <code>false</code>) The default is <code>false</code>.
     * </p>
     */
    private Boolean flatten;

    /**
     * <p>
     * [Required] The <a>RestApi</a> identifier under which the <a>Model</a>
     * exists.
     * </p>
     *
     * @return <p>
     *         [Required] The <a>RestApi</a> identifier under which the
     *         <a>Model</a> exists.
     *         </p>
     */
    public String getRestApiId() {
        return restApiId;
    }

    /**
     * <p>
     * [Required] The <a>RestApi</a> identifier under which the <a>Model</a>
     * exists.
     * </p>
     *
     * @param restApiId <p>
     *            [Required] The <a>RestApi</a> identifier under which the
     *            <a>Model</a> exists.
     *            </p>
     */
    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The <a>RestApi</a> identifier under which the <a>Model</a>
     * exists.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restApiId <p>
     *            [Required] The <a>RestApi</a> identifier under which the
     *            <a>Model</a> exists.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetModelRequest withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * <p>
     * [Required] The name of the model as an identifier.
     * </p>
     *
     * @return <p>
     *         [Required] The name of the model as an identifier.
     *         </p>
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * <p>
     * [Required] The name of the model as an identifier.
     * </p>
     *
     * @param modelName <p>
     *            [Required] The name of the model as an identifier.
     *            </p>
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * [Required] The name of the model as an identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelName <p>
     *            [Required] The name of the model as an identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetModelRequest withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * <p>
     * A query parameter of a Boolean value to resolve (<code>true</code>) all
     * external model references and returns a flattened model schema or not (
     * <code>false</code>) The default is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         A query parameter of a Boolean value to resolve (
     *         <code>true</code>) all external model references and returns a
     *         flattened model schema or not (<code>false</code>) The default is
     *         <code>false</code>.
     *         </p>
     */
    public Boolean isFlatten() {
        return flatten;
    }

    /**
     * <p>
     * A query parameter of a Boolean value to resolve (<code>true</code>) all
     * external model references and returns a flattened model schema or not (
     * <code>false</code>) The default is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         A query parameter of a Boolean value to resolve (
     *         <code>true</code>) all external model references and returns a
     *         flattened model schema or not (<code>false</code>) The default is
     *         <code>false</code>.
     *         </p>
     */
    public Boolean getFlatten() {
        return flatten;
    }

    /**
     * <p>
     * A query parameter of a Boolean value to resolve (<code>true</code>) all
     * external model references and returns a flattened model schema or not (
     * <code>false</code>) The default is <code>false</code>.
     * </p>
     *
     * @param flatten <p>
     *            A query parameter of a Boolean value to resolve (
     *            <code>true</code>) all external model references and returns a
     *            flattened model schema or not (<code>false</code>) The default
     *            is <code>false</code>.
     *            </p>
     */
    public void setFlatten(Boolean flatten) {
        this.flatten = flatten;
    }

    /**
     * <p>
     * A query parameter of a Boolean value to resolve (<code>true</code>) all
     * external model references and returns a flattened model schema or not (
     * <code>false</code>) The default is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flatten <p>
     *            A query parameter of a Boolean value to resolve (
     *            <code>true</code>) all external model references and returns a
     *            flattened model schema or not (<code>false</code>) The default
     *            is <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetModelRequest withFlatten(Boolean flatten) {
        this.flatten = flatten;
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
        if (getModelName() != null)
            sb.append("modelName: " + getModelName() + ",");
        if (getFlatten() != null)
            sb.append("flatten: " + getFlatten());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getFlatten() == null) ? 0 : getFlatten().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetModelRequest == false)
            return false;
        GetModelRequest other = (GetModelRequest) obj;

        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null
                && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getFlatten() == null ^ this.getFlatten() == null)
            return false;
        if (other.getFlatten() != null && other.getFlatten().equals(this.getFlatten()) == false)
            return false;
        return true;
    }
}
