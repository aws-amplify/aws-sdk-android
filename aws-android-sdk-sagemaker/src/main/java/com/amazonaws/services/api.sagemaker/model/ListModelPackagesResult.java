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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

public class ListModelPackagesResult implements Serializable {
    /**
     * <p>
     * An array of <code>ModelPackageSummary</code> objects, each of which lists
     * a model package.
     * </p>
     */
    private java.util.List<ModelPackageSummary> modelPackageSummaryList;

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of model packages, use it in the subsequent
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>ModelPackageSummary</code> objects, each of which lists
     * a model package.
     * </p>
     *
     * @return <p>
     *         An array of <code>ModelPackageSummary</code> objects, each of
     *         which lists a model package.
     *         </p>
     */
    public java.util.List<ModelPackageSummary> getModelPackageSummaryList() {
        return modelPackageSummaryList;
    }

    /**
     * <p>
     * An array of <code>ModelPackageSummary</code> objects, each of which lists
     * a model package.
     * </p>
     *
     * @param modelPackageSummaryList <p>
     *            An array of <code>ModelPackageSummary</code> objects, each of
     *            which lists a model package.
     *            </p>
     */
    public void setModelPackageSummaryList(
            java.util.Collection<ModelPackageSummary> modelPackageSummaryList) {
        if (modelPackageSummaryList == null) {
            this.modelPackageSummaryList = null;
            return;
        }

        this.modelPackageSummaryList = new java.util.ArrayList<ModelPackageSummary>(
                modelPackageSummaryList);
    }

    /**
     * <p>
     * An array of <code>ModelPackageSummary</code> objects, each of which lists
     * a model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelPackageSummaryList <p>
     *            An array of <code>ModelPackageSummary</code> objects, each of
     *            which lists a model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListModelPackagesResult withModelPackageSummaryList(
            ModelPackageSummary... modelPackageSummaryList) {
        if (getModelPackageSummaryList() == null) {
            this.modelPackageSummaryList = new java.util.ArrayList<ModelPackageSummary>(
                    modelPackageSummaryList.length);
        }
        for (ModelPackageSummary value : modelPackageSummaryList) {
            this.modelPackageSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ModelPackageSummary</code> objects, each of which lists
     * a model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelPackageSummaryList <p>
     *            An array of <code>ModelPackageSummary</code> objects, each of
     *            which lists a model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListModelPackagesResult withModelPackageSummaryList(
            java.util.Collection<ModelPackageSummary> modelPackageSummaryList) {
        setModelPackageSummaryList(modelPackageSummaryList);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of model packages, use it in the subsequent
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon SageMaker returns this
     *         token. To retrieve the next set of model packages, use it in the
     *         subsequent request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of model packages, use it in the subsequent
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of model packages, use it in
     *            the subsequent request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of model packages, use it in the subsequent
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of model packages, use it in
     *            the subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListModelPackagesResult withNextToken(String nextToken) {
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
        if (getModelPackageSummaryList() != null)
            sb.append("ModelPackageSummaryList: " + getModelPackageSummaryList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getModelPackageSummaryList() == null) ? 0 : getModelPackageSummaryList()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListModelPackagesResult == false)
            return false;
        ListModelPackagesResult other = (ListModelPackagesResult) obj;

        if (other.getModelPackageSummaryList() == null ^ this.getModelPackageSummaryList() == null)
            return false;
        if (other.getModelPackageSummaryList() != null
                && other.getModelPackageSummaryList().equals(this.getModelPackageSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
