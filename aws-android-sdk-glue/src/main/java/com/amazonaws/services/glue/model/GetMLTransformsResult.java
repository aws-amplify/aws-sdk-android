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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

public class GetMLTransformsResult implements Serializable {
    /**
     * <p>
     * A list of machine learning transforms.
     * </p>
     */
    private java.util.List<MLTransform> transforms;

    /**
     * <p>
     * A pagination token, if more results are available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of machine learning transforms.
     * </p>
     *
     * @return <p>
     *         A list of machine learning transforms.
     *         </p>
     */
    public java.util.List<MLTransform> getTransforms() {
        return transforms;
    }

    /**
     * <p>
     * A list of machine learning transforms.
     * </p>
     *
     * @param transforms <p>
     *            A list of machine learning transforms.
     *            </p>
     */
    public void setTransforms(java.util.Collection<MLTransform> transforms) {
        if (transforms == null) {
            this.transforms = null;
            return;
        }

        this.transforms = new java.util.ArrayList<MLTransform>(transforms);
    }

    /**
     * <p>
     * A list of machine learning transforms.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transforms <p>
     *            A list of machine learning transforms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformsResult withTransforms(MLTransform... transforms) {
        if (getTransforms() == null) {
            this.transforms = new java.util.ArrayList<MLTransform>(transforms.length);
        }
        for (MLTransform value : transforms) {
            this.transforms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of machine learning transforms.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transforms <p>
     *            A list of machine learning transforms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformsResult withTransforms(java.util.Collection<MLTransform> transforms) {
        setTransforms(transforms);
        return this;
    }

    /**
     * <p>
     * A pagination token, if more results are available.
     * </p>
     *
     * @return <p>
     *         A pagination token, if more results are available.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token, if more results are available.
     * </p>
     *
     * @param nextToken <p>
     *            A pagination token, if more results are available.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token, if more results are available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A pagination token, if more results are available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformsResult withNextToken(String nextToken) {
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
        if (getTransforms() != null)
            sb.append("Transforms: " + getTransforms() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransforms() == null) ? 0 : getTransforms().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMLTransformsResult == false)
            return false;
        GetMLTransformsResult other = (GetMLTransformsResult) obj;

        if (other.getTransforms() == null ^ this.getTransforms() == null)
            return false;
        if (other.getTransforms() != null
                && other.getTransforms().equals(this.getTransforms()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
