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

public class DetectPHIResult implements Serializable {
    /**
     * <p>
     * The collection of PHI entities extracted from the input text and their
     * associated information. For each entity, the response provides the entity
     * text, the entity category, where the entity text begins and ends, and the
     * level of confidence that Amazon Comprehend Medical has in its detection.
     * </p>
     */
    private java.util.List<Entity> entities;

    /**
     * <p>
     * If the result of the previous request to <code>DetectPHI</code> was
     * truncated, include the <code>PaginationToken</code> to fetch the next
     * page of PHI entities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String paginationToken;

    /**
     * <p>
     * The version of the model used to analyze the documents. The version
     * number looks like X.X.X. You can use this information to track the model
     * used for a particular batch of documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String modelVersion;

    /**
     * <p>
     * The collection of PHI entities extracted from the input text and their
     * associated information. For each entity, the response provides the entity
     * text, the entity category, where the entity text begins and ends, and the
     * level of confidence that Amazon Comprehend Medical has in its detection.
     * </p>
     *
     * @return <p>
     *         The collection of PHI entities extracted from the input text and
     *         their associated information. For each entity, the response
     *         provides the entity text, the entity category, where the entity
     *         text begins and ends, and the level of confidence that Amazon
     *         Comprehend Medical has in its detection.
     *         </p>
     */
    public java.util.List<Entity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * The collection of PHI entities extracted from the input text and their
     * associated information. For each entity, the response provides the entity
     * text, the entity category, where the entity text begins and ends, and the
     * level of confidence that Amazon Comprehend Medical has in its detection.
     * </p>
     *
     * @param entities <p>
     *            The collection of PHI entities extracted from the input text
     *            and their associated information. For each entity, the
     *            response provides the entity text, the entity category, where
     *            the entity text begins and ends, and the level of confidence
     *            that Amazon Comprehend Medical has in its detection.
     *            </p>
     */
    public void setEntities(java.util.Collection<Entity> entities) {
        if (entities == null) {
            this.entities = null;
            return;
        }

        this.entities = new java.util.ArrayList<Entity>(entities);
    }

    /**
     * <p>
     * The collection of PHI entities extracted from the input text and their
     * associated information. For each entity, the response provides the entity
     * text, the entity category, where the entity text begins and ends, and the
     * level of confidence that Amazon Comprehend Medical has in its detection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entities <p>
     *            The collection of PHI entities extracted from the input text
     *            and their associated information. For each entity, the
     *            response provides the entity text, the entity category, where
     *            the entity text begins and ends, and the level of confidence
     *            that Amazon Comprehend Medical has in its detection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectPHIResult withEntities(Entity... entities) {
        if (getEntities() == null) {
            this.entities = new java.util.ArrayList<Entity>(entities.length);
        }
        for (Entity value : entities) {
            this.entities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The collection of PHI entities extracted from the input text and their
     * associated information. For each entity, the response provides the entity
     * text, the entity category, where the entity text begins and ends, and the
     * level of confidence that Amazon Comprehend Medical has in its detection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entities <p>
     *            The collection of PHI entities extracted from the input text
     *            and their associated information. For each entity, the
     *            response provides the entity text, the entity category, where
     *            the entity text begins and ends, and the level of confidence
     *            that Amazon Comprehend Medical has in its detection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectPHIResult withEntities(java.util.Collection<Entity> entities) {
        setEntities(entities);
        return this;
    }

    /**
     * <p>
     * If the result of the previous request to <code>DetectPHI</code> was
     * truncated, include the <code>PaginationToken</code> to fetch the next
     * page of PHI entities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         If the result of the previous request to <code>DetectPHI</code>
     *         was truncated, include the <code>PaginationToken</code> to fetch
     *         the next page of PHI entities.
     *         </p>
     */
    public String getPaginationToken() {
        return paginationToken;
    }

    /**
     * <p>
     * If the result of the previous request to <code>DetectPHI</code> was
     * truncated, include the <code>PaginationToken</code> to fetch the next
     * page of PHI entities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param paginationToken <p>
     *            If the result of the previous request to
     *            <code>DetectPHI</code> was truncated, include the
     *            <code>PaginationToken</code> to fetch the next page of PHI
     *            entities.
     *            </p>
     */
    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * If the result of the previous request to <code>DetectPHI</code> was
     * truncated, include the <code>PaginationToken</code> to fetch the next
     * page of PHI entities.
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
     *            <code>DetectPHI</code> was truncated, include the
     *            <code>PaginationToken</code> to fetch the next page of PHI
     *            entities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectPHIResult withPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
        return this;
    }

    /**
     * <p>
     * The version of the model used to analyze the documents. The version
     * number looks like X.X.X. You can use this information to track the model
     * used for a particular batch of documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The version of the model used to analyze the documents. The
     *         version number looks like X.X.X. You can use this information to
     *         track the model used for a particular batch of documents.
     *         </p>
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * <p>
     * The version of the model used to analyze the documents. The version
     * number looks like X.X.X. You can use this information to track the model
     * used for a particular batch of documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param modelVersion <p>
     *            The version of the model used to analyze the documents. The
     *            version number looks like X.X.X. You can use this information
     *            to track the model used for a particular batch of documents.
     *            </p>
     */
    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model used to analyze the documents. The version
     * number looks like X.X.X. You can use this information to track the model
     * used for a particular batch of documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param modelVersion <p>
     *            The version of the model used to analyze the documents. The
     *            version number looks like X.X.X. You can use this information
     *            to track the model used for a particular batch of documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectPHIResult withModelVersion(String modelVersion) {
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

        if (obj instanceof DetectPHIResult == false)
            return false;
        DetectPHIResult other = (DetectPHIResult) obj;

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
