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
 * Individual item from the list of entity types in the metadata of an entity
 * recognizer.
 * </p>
 */
public class EntityRecognizerMetadataEntityTypesListItem implements Serializable {
    /**
     * <p>
     * Type of entity from the list of entity types in the metadata of an entity
     * recognizer.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Type of entity from the list of entity types in the metadata of an entity
     * recognizer.
     * </p>
     *
     * @return <p>
     *         Type of entity from the list of entity types in the metadata of
     *         an entity recognizer.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Type of entity from the list of entity types in the metadata of an entity
     * recognizer.
     * </p>
     *
     * @param type <p>
     *            Type of entity from the list of entity types in the metadata
     *            of an entity recognizer.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of entity from the list of entity types in the metadata of an entity
     * recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            Type of entity from the list of entity types in the metadata
     *            of an entity recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerMetadataEntityTypesListItem withType(String type) {
        this.type = type;
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
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerMetadataEntityTypesListItem == false)
            return false;
        EntityRecognizerMetadataEntityTypesListItem other = (EntityRecognizerMetadataEntityTypesListItem) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
