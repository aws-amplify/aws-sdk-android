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

package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;

public class InferRxNormResult implements Serializable {
    /**
     * <p>
     * The medication entities detected in the text linked to RxNorm concepts.
     * If the action is successful, the service sends back an HTTP 200 response,
     * as well as the entities detected.
     * </p>
     */
    private java.util.List<RxNormEntity> entities;

    /**
     * <p>
     * If the result of the previous request to <code>InferRxNorm</code> was
     * truncated, include the <code>PaginationToken</code> to fetch the next
     * page of medication entities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String paginationToken;

    /**
     * <p>
     * The version of the model used to analyze the documents, in the format
     * <i>n</i>.<i>n</i>.<i>n</i> You can use this information to track the
     * model used for a particular batch of documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String modelVersion;

    /**
     * <p>
     * The medication entities detected in the text linked to RxNorm concepts.
     * If the action is successful, the service sends back an HTTP 200 response,
     * as well as the entities detected.
     * </p>
     *
     * @return <p>
     *         The medication entities detected in the text linked to RxNorm
     *         concepts. If the action is successful, the service sends back an
     *         HTTP 200 response, as well as the entities detected.
     *         </p>
     */
    public java.util.List<RxNormEntity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * The medication entities detected in the text linked to RxNorm concepts.
     * If the action is successful, the service sends back an HTTP 200 response,
     * as well as the entities detected.
     * </p>
     *
     * @param entities <p>
     *            The medication entities detected in the text linked to RxNorm
     *            concepts. If the action is successful, the service sends back
     *            an HTTP 200 response, as well as the entities detected.
     *            </p>
     */
    public void setEntities(java.util.Collection<RxNormEntity> entities) {
        if (entities == null) {
            this.entities = null;
            return;
        }

        this.entities = new java.util.ArrayList<RxNormEntity>(entities);
    }

    /**
     * <p>
     * The medication entities detected in the text linked to RxNorm concepts.
     * If the action is successful, the service sends back an HTTP 200 response,
     * as well as the entities detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entities <p>
     *            The medication entities detected in the text linked to RxNorm
     *            concepts. If the action is successful, the service sends back
     *            an HTTP 200 response, as well as the entities detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferRxNormResult withEntities(RxNormEntity... entities) {
        if (getEntities() == null) {
            this.entities = new java.util.ArrayList<RxNormEntity>(entities.length);
        }
        for (RxNormEntity value : entities) {
            this.entities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The medication entities detected in the text linked to RxNorm concepts.
     * If the action is successful, the service sends back an HTTP 200 response,
     * as well as the entities detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entities <p>
     *            The medication entities detected in the text linked to RxNorm
     *            concepts. If the action is successful, the service sends back
     *            an HTTP 200 response, as well as the entities detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferRxNormResult withEntities(java.util.Collection<RxNormEntity> entities) {
        setEntities(entities);
        return this;
    }

    /**
     * <p>
     * If the result of the previous request to <code>InferRxNorm</code> was
     * truncated, include the <code>PaginationToken</code> to fetch the next
     * page of medication entities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         If the result of the previous request to <code>InferRxNorm</code>
     *         was truncated, include the <code>PaginationToken</code> to fetch
     *         the next page of medication entities.
     *         </p>
     */
    public String getPaginationToken() {
        return paginationToken;
    }

    /**
     * <p>
     * If the result of the previous request to <code>InferRxNorm</code> was
     * truncated, include the <code>PaginationToken</code> to fetch the next
     * page of medication entities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param paginationToken <p>
     *            If the result of the previous request to
     *            <code>InferRxNorm</code> was truncated, include the
     *            <code>PaginationToken</code> to fetch the next page of
     *            medication entities.
     *            </p>
     */
    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * If the result of the previous request to <code>InferRxNorm</code> was
     * truncated, include the <code>PaginationToken</code> to fetch the next
     * page of medication entities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param paginationToken <p>
     *            If the result of the previous request to
     *            <code>InferRxNorm</code> was truncated, include the
     *            <code>PaginationToken</code> to fetch the next page of
     *            medication entities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferRxNormResult withPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
        return this;
    }

    /**
     * <p>
     * The version of the model used to analyze the documents, in the format
     * <i>n</i>.<i>n</i>.<i>n</i> You can use this information to track the
     * model used for a particular batch of documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The version of the model used to analyze the documents, in the
     *         format <i>n</i>.<i>n</i>.<i>n</i> You can use this information to
     *         track the model used for a particular batch of documents.
     *         </p>
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * <p>
     * The version of the model used to analyze the documents, in the format
     * <i>n</i>.<i>n</i>.<i>n</i> You can use this information to track the
     * model used for a particular batch of documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param modelVersion <p>
     *            The version of the model used to analyze the documents, in the
     *            format <i>n</i>.<i>n</i>.<i>n</i> You can use this information
     *            to track the model used for a particular batch of documents.
     *            </p>
     */
    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model used to analyze the documents, in the format
     * <i>n</i>.<i>n</i>.<i>n</i> You can use this information to track the
     * model used for a particular batch of documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param modelVersion <p>
     *            The version of the model used to analyze the documents, in the
     *            format <i>n</i>.<i>n</i>.<i>n</i> You can use this information
     *            to track the model used for a particular batch of documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferRxNormResult withModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
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
        if (getEntities() != null)
            sb.append("Entities: " + getEntities() + ",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: " + getPaginationToken() + ",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: " + getModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
        hashCode = prime * hashCode
                + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        hashCode = prime * hashCode
                + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferRxNormResult == false)
            return false;
        InferRxNormResult other = (InferRxNormResult) obj;

        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null
                && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null
                && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        return true;
    }
}
