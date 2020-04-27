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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

public class ListModelsResult implements Serializable {
    /**
     * <p>
     * An array of <code>ModelSummary</code> objects, each of which lists a
     * model.
     * </p>
     */
    private java.util.List<ModelSummary> models;

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of models, use it in the subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>ModelSummary</code> objects, each of which lists a
     * model.
     * </p>
     *
     * @return <p>
     *         An array of <code>ModelSummary</code> objects, each of which
     *         lists a model.
     *         </p>
     */
    public java.util.List<ModelSummary> getModels() {
        return models;
    }

    /**
     * <p>
     * An array of <code>ModelSummary</code> objects, each of which lists a
     * model.
     * </p>
     *
     * @param models <p>
     *            An array of <code>ModelSummary</code> objects, each of which
     *            lists a model.
     *            </p>
     */
    public void setModels(java.util.Collection<ModelSummary> models) {
        if (models == null) {
            this.models = null;
            return;
        }

        this.models = new java.util.ArrayList<ModelSummary>(models);
    }

    /**
     * <p>
     * An array of <code>ModelSummary</code> objects, each of which lists a
     * model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param models <p>
     *            An array of <code>ModelSummary</code> objects, each of which
     *            lists a model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListModelsResult withModels(ModelSummary... models) {
        if (getModels() == null) {
            this.models = new java.util.ArrayList<ModelSummary>(models.length);
        }
        for (ModelSummary value : models) {
            this.models.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ModelSummary</code> objects, each of which lists a
     * model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param models <p>
     *            An array of <code>ModelSummary</code> objects, each of which
     *            lists a model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListModelsResult withModels(java.util.Collection<ModelSummary> models) {
        setModels(models);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of models, use it in the subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon SageMaker returns this
     *         token. To retrieve the next set of models, use it in the
     *         subsequent request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of models, use it in the subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of models, use it in the
     *            subsequent request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of models, use it in the subsequent request.
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
     *            token. To retrieve the next set of models, use it in the
     *            subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListModelsResult withNextToken(String nextToken) {
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
        if (getModels() != null)
            sb.append("Models: " + getModels() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModels() == null) ? 0 : getModels().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListModelsResult == false)
            return false;
        ListModelsResult other = (ListModelsResult) obj;

        if (other.getModels() == null ^ this.getModels() == null)
            return false;
        if (other.getModels() != null && other.getModels().equals(this.getModels()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
