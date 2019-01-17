/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class DetectEntitiesResult implements Serializable {
    /**
     * <p>
     * A collection of entities identified in the input text. For each entity,
     * the response provides the entity text, entity type, where the entity text
     * begins and ends, and the level of confidence that Amazon Comprehend has
     * in the detection. For a list of entity types, see <a>how-entities</a>.
     * </p>
     */
    private java.util.List<Entity> entities;

    /**
     * <p>
     * A collection of entities identified in the input text. For each entity,
     * the response provides the entity text, entity type, where the entity text
     * begins and ends, and the level of confidence that Amazon Comprehend has
     * in the detection. For a list of entity types, see <a>how-entities</a>.
     * </p>
     *
     * @return <p>
     *         A collection of entities identified in the input text. For each
     *         entity, the response provides the entity text, entity type, where
     *         the entity text begins and ends, and the level of confidence that
     *         Amazon Comprehend has in the detection. For a list of entity
     *         types, see <a>how-entities</a>.
     *         </p>
     */
    public java.util.List<Entity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * A collection of entities identified in the input text. For each entity,
     * the response provides the entity text, entity type, where the entity text
     * begins and ends, and the level of confidence that Amazon Comprehend has
     * in the detection. For a list of entity types, see <a>how-entities</a>.
     * </p>
     *
     * @param entities <p>
     *            A collection of entities identified in the input text. For
     *            each entity, the response provides the entity text, entity
     *            type, where the entity text begins and ends, and the level of
     *            confidence that Amazon Comprehend has in the detection. For a
     *            list of entity types, see <a>how-entities</a>.
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
     * A collection of entities identified in the input text. For each entity,
     * the response provides the entity text, entity type, where the entity text
     * begins and ends, and the level of confidence that Amazon Comprehend has
     * in the detection. For a list of entity types, see <a>how-entities</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entities <p>
     *            A collection of entities identified in the input text. For
     *            each entity, the response provides the entity text, entity
     *            type, where the entity text begins and ends, and the level of
     *            confidence that Amazon Comprehend has in the detection. For a
     *            list of entity types, see <a>how-entities</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectEntitiesResult withEntities(Entity... entities) {
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
     * A collection of entities identified in the input text. For each entity,
     * the response provides the entity text, entity type, where the entity text
     * begins and ends, and the level of confidence that Amazon Comprehend has
     * in the detection. For a list of entity types, see <a>how-entities</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entities <p>
     *            A collection of entities identified in the input text. For
     *            each entity, the response provides the entity text, entity
     *            type, where the entity text begins and ends, and the level of
     *            confidence that Amazon Comprehend has in the detection. For a
     *            list of entity types, see <a>how-entities</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectEntitiesResult withEntities(java.util.Collection<Entity> entities) {
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

        if (obj instanceof DetectEntitiesResult == false)
            return false;
        DetectEntitiesResult other = (DetectEntitiesResult) obj;

        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
            return false;
        return true;
    }
}
