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
 * Configuration required for an entity recognition model.
 * </p>
 */
public class EntityRecognitionConfig implements Serializable {
    /**
     * <p>
     * Up to 25 entity types that the model is trained to recognize.
     * </p>
     */
    private java.util.List<EntityTypesListItem> entityTypes;

    /**
     * <p>
     * Up to 25 entity types that the model is trained to recognize.
     * </p>
     *
     * @return <p>
     *         Up to 25 entity types that the model is trained to recognize.
     *         </p>
     */
    public java.util.List<EntityTypesListItem> getEntityTypes() {
        return entityTypes;
    }

    /**
     * <p>
     * Up to 25 entity types that the model is trained to recognize.
     * </p>
     *
     * @param entityTypes <p>
     *            Up to 25 entity types that the model is trained to recognize.
     *            </p>
     */
    public void setEntityTypes(java.util.Collection<EntityTypesListItem> entityTypes) {
        if (entityTypes == null) {
            this.entityTypes = null;
            return;
        }

        this.entityTypes = new java.util.ArrayList<EntityTypesListItem>(entityTypes);
    }

    /**
     * <p>
     * Up to 25 entity types that the model is trained to recognize.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityTypes <p>
     *            Up to 25 entity types that the model is trained to recognize.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognitionConfig withEntityTypes(EntityTypesListItem... entityTypes) {
        if (getEntityTypes() == null) {
            this.entityTypes = new java.util.ArrayList<EntityTypesListItem>(entityTypes.length);
        }
        for (EntityTypesListItem value : entityTypes) {
            this.entityTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Up to 25 entity types that the model is trained to recognize.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityTypes <p>
     *            Up to 25 entity types that the model is trained to recognize.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognitionConfig withEntityTypes(
            java.util.Collection<EntityTypesListItem> entityTypes) {
        setEntityTypes(entityTypes);
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
        if (getEntityTypes() != null)
            sb.append("EntityTypes: " + getEntityTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEntityTypes() == null) ? 0 : getEntityTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognitionConfig == false)
            return false;
        EntityRecognitionConfig other = (EntityRecognitionConfig) obj;

        if (other.getEntityTypes() == null ^ this.getEntityTypes() == null)
            return false;
        if (other.getEntityTypes() != null
                && other.getEntityTypes().equals(this.getEntityTypes()) == false)
            return false;
        return true;
    }
}
