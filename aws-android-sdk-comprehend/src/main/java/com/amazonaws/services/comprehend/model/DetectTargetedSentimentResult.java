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

public class DetectTargetedSentimentResult implements Serializable {
    /**
     * <p>
     * Targeted sentiment analysis for each of the entities identified in the
     * input text.
     * </p>
     */
    private java.util.List<TargetedSentimentEntity> entities;

    /**
     * <p>
     * Targeted sentiment analysis for each of the entities identified in the
     * input text.
     * </p>
     *
     * @return <p>
     *         Targeted sentiment analysis for each of the entities identified
     *         in the input text.
     *         </p>
     */
    public java.util.List<TargetedSentimentEntity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * Targeted sentiment analysis for each of the entities identified in the
     * input text.
     * </p>
     *
     * @param entities <p>
     *            Targeted sentiment analysis for each of the entities
     *            identified in the input text.
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
     * Targeted sentiment analysis for each of the entities identified in the
     * input text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entities <p>
     *            Targeted sentiment analysis for each of the entities
     *            identified in the input text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectTargetedSentimentResult withEntities(TargetedSentimentEntity... entities) {
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
     * Targeted sentiment analysis for each of the entities identified in the
     * input text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entities <p>
     *            Targeted sentiment analysis for each of the entities
     *            identified in the input text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectTargetedSentimentResult withEntities(
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
        if (getEntities() != null)
            sb.append("Entities: " + getEntities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectTargetedSentimentResult == false)
            return false;
        DetectTargetedSentimentResult other = (DetectTargetedSentimentResult) obj;

        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
            return false;
        return true;
    }
}
