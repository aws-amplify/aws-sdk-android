/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Analysis results for one of the documents in the batch.
 * </p>
 */
public class BatchDetectTargetedSentimentItemResult implements Serializable {
    /**
     * <p>
     * The zero-based index of this result in the input list.
     * </p>
     */
    private Integer index;

    /**
     * <p>
     * An array of targeted sentiment entities.
     * </p>
     */
    private java.util.List<TargetedSentimentEntity> entities;

    /**
     * <p>
     * The zero-based index of this result in the input list.
     * </p>
     *
     * @return <p>
     *         The zero-based index of this result in the input list.
     *         </p>
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * <p>
     * The zero-based index of this result in the input list.
     * </p>
     *
     * @param index <p>
     *            The zero-based index of this result in the input list.
     *            </p>
     */
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * The zero-based index of this result in the input list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param index <p>
     *            The zero-based index of this result in the input list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectTargetedSentimentItemResult withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * <p>
     * An array of targeted sentiment entities.
     * </p>
     *
     * @return <p>
     *         An array of targeted sentiment entities.
     *         </p>
     */
    public java.util.List<TargetedSentimentEntity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * An array of targeted sentiment entities.
     * </p>
     *
     * @param entities <p>
     *            An array of targeted sentiment entities.
     *            </p>
     */
    public void setEntities(java.util.Collection<TargetedSentimentEntity> entities) {
        if (entities == null) {
            this.entities = null;
            return;
        }

        this.entities = new java.util.ArrayList<TargetedSentimentEntity>(entities);
    }

    /**
     * <p>
     * An array of targeted sentiment entities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entities <p>
     *            An array of targeted sentiment entities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectTargetedSentimentItemResult withEntities(TargetedSentimentEntity... entities) {
        if (getEntities() == null) {
            this.entities = new java.util.ArrayList<TargetedSentimentEntity>(entities.length);
        }
        for (TargetedSentimentEntity value : entities) {
            this.entities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of targeted sentiment entities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entities <p>
     *            An array of targeted sentiment entities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectTargetedSentimentItemResult withEntities(
            java.util.Collection<TargetedSentimentEntity> entities) {
        setEntities(entities);
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
        if (getIndex() != null)
            sb.append("Index: " + getIndex() + ",");
        if (getEntities() != null)
            sb.append("Entities: " + getEntities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDetectTargetedSentimentItemResult == false)
            return false;
        BatchDetectTargetedSentimentItemResult other = (BatchDetectTargetedSentimentItemResult) obj;

        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
            return false;
        return true;
    }
}
