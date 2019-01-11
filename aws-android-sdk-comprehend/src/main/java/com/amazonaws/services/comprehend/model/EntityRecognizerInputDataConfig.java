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

/**
 * <p>
 * Specifies the format and location of the input data.
 * </p>
 */
public class EntityRecognizerInputDataConfig implements Serializable {
    /**
     * <p>
     * The entity types in the input data for an entity recognizer.
     * </p>
     */
    private java.util.List<EntityTypesListItem> entityTypes;

    /**
     * <p>
     * S3 location of the documents folder for an entity recognizer
     * </p>
     */
    private EntityRecognizerDocuments documents;

    /**
     * <p>
     * S3 location of the annotations file for an entity recognizer.
     * </p>
     */
    private EntityRecognizerAnnotations annotations;

    /**
     * <p>
     * S3 location of the entity list for an entity recognizer.
     * </p>
     */
    private EntityRecognizerEntityList entityList;

    /**
     * <p>
     * The entity types in the input data for an entity recognizer.
     * </p>
     *
     * @return <p>
     *         The entity types in the input data for an entity recognizer.
     *         </p>
     */
    public java.util.List<EntityTypesListItem> getEntityTypes() {
        return entityTypes;
    }

    /**
     * <p>
     * The entity types in the input data for an entity recognizer.
     * </p>
     *
     * @param entityTypes <p>
     *            The entity types in the input data for an entity recognizer.
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
     * The entity types in the input data for an entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityTypes <p>
     *            The entity types in the input data for an entity recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerInputDataConfig withEntityTypes(EntityTypesListItem... entityTypes) {
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
     * The entity types in the input data for an entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityTypes <p>
     *            The entity types in the input data for an entity recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerInputDataConfig withEntityTypes(
            java.util.Collection<EntityTypesListItem> entityTypes) {
        setEntityTypes(entityTypes);
        return this;
    }

    /**
     * <p>
     * S3 location of the documents folder for an entity recognizer
     * </p>
     *
     * @return <p>
     *         S3 location of the documents folder for an entity recognizer
     *         </p>
     */
    public EntityRecognizerDocuments getDocuments() {
        return documents;
    }

    /**
     * <p>
     * S3 location of the documents folder for an entity recognizer
     * </p>
     *
     * @param documents <p>
     *            S3 location of the documents folder for an entity recognizer
     *            </p>
     */
    public void setDocuments(EntityRecognizerDocuments documents) {
        this.documents = documents;
    }

    /**
     * <p>
     * S3 location of the documents folder for an entity recognizer
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documents <p>
     *            S3 location of the documents folder for an entity recognizer
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerInputDataConfig withDocuments(EntityRecognizerDocuments documents) {
        this.documents = documents;
        return this;
    }

    /**
     * <p>
     * S3 location of the annotations file for an entity recognizer.
     * </p>
     *
     * @return <p>
     *         S3 location of the annotations file for an entity recognizer.
     *         </p>
     */
    public EntityRecognizerAnnotations getAnnotations() {
        return annotations;
    }

    /**
     * <p>
     * S3 location of the annotations file for an entity recognizer.
     * </p>
     *
     * @param annotations <p>
     *            S3 location of the annotations file for an entity recognizer.
     *            </p>
     */
    public void setAnnotations(EntityRecognizerAnnotations annotations) {
        this.annotations = annotations;
    }

    /**
     * <p>
     * S3 location of the annotations file for an entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param annotations <p>
     *            S3 location of the annotations file for an entity recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerInputDataConfig withAnnotations(EntityRecognizerAnnotations annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * <p>
     * S3 location of the entity list for an entity recognizer.
     * </p>
     *
     * @return <p>
     *         S3 location of the entity list for an entity recognizer.
     *         </p>
     */
    public EntityRecognizerEntityList getEntityList() {
        return entityList;
    }

    /**
     * <p>
     * S3 location of the entity list for an entity recognizer.
     * </p>
     *
     * @param entityList <p>
     *            S3 location of the entity list for an entity recognizer.
     *            </p>
     */
    public void setEntityList(EntityRecognizerEntityList entityList) {
        this.entityList = entityList;
    }

    /**
     * <p>
     * S3 location of the entity list for an entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityList <p>
     *            S3 location of the entity list for an entity recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerInputDataConfig withEntityList(EntityRecognizerEntityList entityList) {
        this.entityList = entityList;
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
            sb.append("EntityTypes: " + getEntityTypes() + ",");
        if (getDocuments() != null)
            sb.append("Documents: " + getDocuments() + ",");
        if (getAnnotations() != null)
            sb.append("Annotations: " + getAnnotations() + ",");
        if (getEntityList() != null)
            sb.append("EntityList: " + getEntityList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEntityTypes() == null) ? 0 : getEntityTypes().hashCode());
        hashCode = prime * hashCode + ((getDocuments() == null) ? 0 : getDocuments().hashCode());
        hashCode = prime * hashCode
                + ((getAnnotations() == null) ? 0 : getAnnotations().hashCode());
        hashCode = prime * hashCode + ((getEntityList() == null) ? 0 : getEntityList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerInputDataConfig == false)
            return false;
        EntityRecognizerInputDataConfig other = (EntityRecognizerInputDataConfig) obj;

        if (other.getEntityTypes() == null ^ this.getEntityTypes() == null)
            return false;
        if (other.getEntityTypes() != null
                && other.getEntityTypes().equals(this.getEntityTypes()) == false)
            return false;
        if (other.getDocuments() == null ^ this.getDocuments() == null)
            return false;
        if (other.getDocuments() != null
                && other.getDocuments().equals(this.getDocuments()) == false)
            return false;
        if (other.getAnnotations() == null ^ this.getAnnotations() == null)
            return false;
        if (other.getAnnotations() != null
                && other.getAnnotations().equals(this.getAnnotations()) == false)
            return false;
        if (other.getEntityList() == null ^ this.getEntityList() == null)
            return false;
        if (other.getEntityList() != null
                && other.getEntityList().equals(this.getEntityList()) == false)
            return false;
        return true;
    }
}
