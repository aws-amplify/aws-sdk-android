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

package com.amazonaws.services.amazonfrauddetector.model;

import java.io.Serializable;

public class DescribeModelVersionsResult implements Serializable {
    /**
     * <p>
     * The model version details.
     * </p>
     */
    private java.util.List<ModelVersionDetail> modelVersionDetails;

    /**
     * <p>
     * The next token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The model version details.
     * </p>
     *
     * @return <p>
     *         The model version details.
     *         </p>
     */
    public java.util.List<ModelVersionDetail> getModelVersionDetails() {
        return modelVersionDetails;
    }

    /**
     * <p>
     * The model version details.
     * </p>
     *
     * @param modelVersionDetails <p>
     *            The model version details.
     *            </p>
     */
    public void setModelVersionDetails(java.util.Collection<ModelVersionDetail> modelVersionDetails) {
        if (modelVersionDetails == null) {
            this.modelVersionDetails = null;
            return;
        }

        this.modelVersionDetails = new java.util.ArrayList<ModelVersionDetail>(modelVersionDetails);
    }

    /**
     * <p>
     * The model version details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelVersionDetails <p>
     *            The model version details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelVersionsResult withModelVersionDetails(
            ModelVersionDetail... modelVersionDetails) {
        if (getModelVersionDetails() == null) {
            this.modelVersionDetails = new java.util.ArrayList<ModelVersionDetail>(
                    modelVersionDetails.length);
        }
        for (ModelVersionDetail value : modelVersionDetails) {
            this.modelVersionDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The model version details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelVersionDetails <p>
     *            The model version details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelVersionsResult withModelVersionDetails(
            java.util.Collection<ModelVersionDetail> modelVersionDetails) {
        setModelVersionDetails(modelVersionDetails);
        return this;
    }

    /**
     * <p>
     * The next token.
     * </p>
     *
     * @return <p>
     *         The next token.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The next token.
     * </p>
     *
     * @param nextToken <p>
     *            The next token.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The next token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelVersionsResult withNextToken(String nextToken) {
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
        if (getModelVersionDetails() != null)
            sb.append("modelVersionDetails: " + getModelVersionDetails() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getModelVersionDetails() == null) ? 0 : getModelVersionDetails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeModelVersionsResult == false)
            return false;
        DescribeModelVersionsResult other = (DescribeModelVersionsResult) obj;

        if (other.getModelVersionDetails() == null ^ this.getModelVersionDetails() == null)
            return false;
        if (other.getModelVersionDetails() != null
                && other.getModelVersionDetails().equals(this.getModelVersionDetails()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
