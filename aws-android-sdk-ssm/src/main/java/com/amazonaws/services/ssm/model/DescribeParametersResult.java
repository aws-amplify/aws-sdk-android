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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class DescribeParametersResult implements Serializable {
    /**
     * <p>
     * Parameters returned by the request.
     * </p>
     */
    private java.util.List<ParameterMetadata> parameters;

    /**
     * <p>
     * The token to use when requesting the next set of items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Parameters returned by the request.
     * </p>
     *
     * @return <p>
     *         Parameters returned by the request.
     *         </p>
     */
    public java.util.List<ParameterMetadata> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Parameters returned by the request.
     * </p>
     *
     * @param parameters <p>
     *            Parameters returned by the request.
     *            </p>
     */
    public void setParameters(java.util.Collection<ParameterMetadata> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<ParameterMetadata>(parameters);
    }

    /**
     * <p>
     * Parameters returned by the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            Parameters returned by the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeParametersResult withParameters(ParameterMetadata... parameters) {
        if (getParameters() == null) {
            this.parameters = new java.util.ArrayList<ParameterMetadata>(parameters.length);
        }
        for (ParameterMetadata value : parameters) {
            this.parameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Parameters returned by the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            Parameters returned by the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeParametersResult withParameters(
            java.util.Collection<ParameterMetadata> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items.
     * </p>
     *
     * @return <p>
     *         The token to use when requesting the next set of items.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeParametersResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeParametersResult == false)
            return false;
        DescribeParametersResult other = (DescribeParametersResult) obj;

        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
