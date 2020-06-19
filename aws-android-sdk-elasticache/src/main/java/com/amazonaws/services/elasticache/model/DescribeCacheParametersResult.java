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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a <code>DescribeCacheParameters</code> operation.
 * </p>
 */
public class DescribeCacheParametersResult implements Serializable {
    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of <a>Parameter</a> instances.
     * </p>
     */
    private java.util.List<Parameter> parameters;

    /**
     * <p>
     * A list of parameters specific to a particular cache node type. Each
     * element in the list contains detailed information about one parameter.
     * </p>
     */
    private java.util.List<CacheNodeTypeSpecificParameter> cacheNodeTypeSpecificParameters;

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     *
     * @return <p>
     *         Provides an identifier to allow retrieval of paginated results.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     *
     * @param marker <p>
     *            Provides an identifier to allow retrieval of paginated
     *            results.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            Provides an identifier to allow retrieval of paginated
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheParametersResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A list of <a>Parameter</a> instances.
     * </p>
     *
     * @return <p>
     *         A list of <a>Parameter</a> instances.
     *         </p>
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A list of <a>Parameter</a> instances.
     * </p>
     *
     * @param parameters <p>
     *            A list of <a>Parameter</a> instances.
     *            </p>
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<Parameter>(parameters);
    }

    /**
     * <p>
     * A list of <a>Parameter</a> instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of <a>Parameter</a> instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheParametersResult withParameters(Parameter... parameters) {
        if (getParameters() == null) {
            this.parameters = new java.util.ArrayList<Parameter>(parameters.length);
        }
        for (Parameter value : parameters) {
            this.parameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>Parameter</a> instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of <a>Parameter</a> instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheParametersResult withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * A list of parameters specific to a particular cache node type. Each
     * element in the list contains detailed information about one parameter.
     * </p>
     *
     * @return <p>
     *         A list of parameters specific to a particular cache node type.
     *         Each element in the list contains detailed information about one
     *         parameter.
     *         </p>
     */
    public java.util.List<CacheNodeTypeSpecificParameter> getCacheNodeTypeSpecificParameters() {
        return cacheNodeTypeSpecificParameters;
    }

    /**
     * <p>
     * A list of parameters specific to a particular cache node type. Each
     * element in the list contains detailed information about one parameter.
     * </p>
     *
     * @param cacheNodeTypeSpecificParameters <p>
     *            A list of parameters specific to a particular cache node type.
     *            Each element in the list contains detailed information about
     *            one parameter.
     *            </p>
     */
    public void setCacheNodeTypeSpecificParameters(
            java.util.Collection<CacheNodeTypeSpecificParameter> cacheNodeTypeSpecificParameters) {
        if (cacheNodeTypeSpecificParameters == null) {
            this.cacheNodeTypeSpecificParameters = null;
            return;
        }

        this.cacheNodeTypeSpecificParameters = new java.util.ArrayList<CacheNodeTypeSpecificParameter>(
                cacheNodeTypeSpecificParameters);
    }

    /**
     * <p>
     * A list of parameters specific to a particular cache node type. Each
     * element in the list contains detailed information about one parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeTypeSpecificParameters <p>
     *            A list of parameters specific to a particular cache node type.
     *            Each element in the list contains detailed information about
     *            one parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheParametersResult withCacheNodeTypeSpecificParameters(
            CacheNodeTypeSpecificParameter... cacheNodeTypeSpecificParameters) {
        if (getCacheNodeTypeSpecificParameters() == null) {
            this.cacheNodeTypeSpecificParameters = new java.util.ArrayList<CacheNodeTypeSpecificParameter>(
                    cacheNodeTypeSpecificParameters.length);
        }
        for (CacheNodeTypeSpecificParameter value : cacheNodeTypeSpecificParameters) {
            this.cacheNodeTypeSpecificParameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of parameters specific to a particular cache node type. Each
     * element in the list contains detailed information about one parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeTypeSpecificParameters <p>
     *            A list of parameters specific to a particular cache node type.
     *            Each element in the list contains detailed information about
     *            one parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheParametersResult withCacheNodeTypeSpecificParameters(
            java.util.Collection<CacheNodeTypeSpecificParameter> cacheNodeTypeSpecificParameters) {
        setCacheNodeTypeSpecificParameters(cacheNodeTypeSpecificParameters);
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getCacheNodeTypeSpecificParameters() != null)
            sb.append("CacheNodeTypeSpecificParameters: " + getCacheNodeTypeSpecificParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheNodeTypeSpecificParameters() == null) ? 0
                        : getCacheNodeTypeSpecificParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCacheParametersResult == false)
            return false;
        DescribeCacheParametersResult other = (DescribeCacheParametersResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getCacheNodeTypeSpecificParameters() == null
                ^ this.getCacheNodeTypeSpecificParameters() == null)
            return false;
        if (other.getCacheNodeTypeSpecificParameters() != null
                && other.getCacheNodeTypeSpecificParameters().equals(
                        this.getCacheNodeTypeSpecificParameters()) == false)
            return false;
        return true;
    }
}
