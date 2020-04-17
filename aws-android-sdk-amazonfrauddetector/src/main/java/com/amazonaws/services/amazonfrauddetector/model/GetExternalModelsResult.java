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

public class GetExternalModelsResult implements Serializable {
    /**
     * <p>
     * Gets the Amazon SageMaker models.
     * </p>
     */
    private java.util.List<ExternalModel> externalModels;

    /**
     * <p>
     * The next page token to be used in subsequent requests.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Gets the Amazon SageMaker models.
     * </p>
     *
     * @return <p>
     *         Gets the Amazon SageMaker models.
     *         </p>
     */
    public java.util.List<ExternalModel> getExternalModels() {
        return externalModels;
    }

    /**
     * <p>
     * Gets the Amazon SageMaker models.
     * </p>
     *
     * @param externalModels <p>
     *            Gets the Amazon SageMaker models.
     *            </p>
     */
    public void setExternalModels(java.util.Collection<ExternalModel> externalModels) {
        if (externalModels == null) {
            this.externalModels = null;
            return;
        }

        this.externalModels = new java.util.ArrayList<ExternalModel>(externalModels);
    }

    /**
     * <p>
     * Gets the Amazon SageMaker models.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalModels <p>
     *            Gets the Amazon SageMaker models.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExternalModelsResult withExternalModels(ExternalModel... externalModels) {
        if (getExternalModels() == null) {
            this.externalModels = new java.util.ArrayList<ExternalModel>(externalModels.length);
        }
        for (ExternalModel value : externalModels) {
            this.externalModels.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Gets the Amazon SageMaker models.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalModels <p>
     *            Gets the Amazon SageMaker models.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExternalModelsResult withExternalModels(
            java.util.Collection<ExternalModel> externalModels) {
        setExternalModels(externalModels);
        return this;
    }

    /**
     * <p>
     * The next page token to be used in subsequent requests.
     * </p>
     *
     * @return <p>
     *         The next page token to be used in subsequent requests.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The next page token to be used in subsequent requests.
     * </p>
     *
     * @param nextToken <p>
     *            The next page token to be used in subsequent requests.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next page token to be used in subsequent requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The next page token to be used in subsequent requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExternalModelsResult withNextToken(String nextToken) {
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
        if (getExternalModels() != null)
            sb.append("externalModels: " + getExternalModels() + ",");
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
                + ((getExternalModels() == null) ? 0 : getExternalModels().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExternalModelsResult == false)
            return false;
        GetExternalModelsResult other = (GetExternalModelsResult) obj;

        if (other.getExternalModels() == null ^ this.getExternalModels() == null)
            return false;
        if (other.getExternalModels() != null
                && other.getExternalModels().equals(this.getExternalModels()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
