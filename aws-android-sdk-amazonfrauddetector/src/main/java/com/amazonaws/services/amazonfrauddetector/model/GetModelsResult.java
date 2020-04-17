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

public class GetModelsResult implements Serializable {
    /**
     * <p>
     * The next token for subsequent requests.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The returned models.
     * </p>
     */
    private java.util.List<Model> models;

    /**
     * <p>
     * The next token for subsequent requests.
     * </p>
     *
     * @return <p>
     *         The next token for subsequent requests.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The next token for subsequent requests.
     * </p>
     *
     * @param nextToken <p>
     *            The next token for subsequent requests.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token for subsequent requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The next token for subsequent requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetModelsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The returned models.
     * </p>
     *
     * @return <p>
     *         The returned models.
     *         </p>
     */
    public java.util.List<Model> getModels() {
        return models;
    }

    /**
     * <p>
     * The returned models.
     * </p>
     *
     * @param models <p>
     *            The returned models.
     *            </p>
     */
    public void setModels(java.util.Collection<Model> models) {
        if (models == null) {
            this.models = null;
            return;
        }

        this.models = new java.util.ArrayList<Model>(models);
    }

    /**
     * <p>
     * The returned models.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param models <p>
     *            The returned models.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetModelsResult withModels(Model... models) {
        if (getModels() == null) {
            this.models = new java.util.ArrayList<Model>(models.length);
        }
        for (Model value : models) {
            this.models.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The returned models.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param models <p>
     *            The returned models.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetModelsResult withModels(java.util.Collection<Model> models) {
        setModels(models);
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
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getModels() != null)
            sb.append("models: " + getModels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getModels() == null) ? 0 : getModels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetModelsResult == false)
            return false;
        GetModelsResult other = (GetModelsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getModels() == null ^ this.getModels() == null)
            return false;
        if (other.getModels() != null && other.getModels().equals(this.getModels()) == false)
            return false;
        return true;
    }
}
