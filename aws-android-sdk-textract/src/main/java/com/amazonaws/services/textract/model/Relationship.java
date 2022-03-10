/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * Information about how blocks are related to each other. A <code>Block</code>
 * object contains 0 or more <code>Relation</code> objects in a list,
 * <code>Relationships</code>. For more information, see <a>Block</a>.
 * </p>
 * <p>
 * The <code>Type</code> element provides the type of the relationship for all
 * blocks in the <code>IDs</code> array.
 * </p>
 */
public class Relationship implements Serializable {
    /**
     * <p>
     * The type of relationship that the blocks in the IDs array have with the
     * current block. The relationship can be <code>VALUE</code> or
     * <code>CHILD</code>. A relationship of type VALUE is a list that contains
     * the ID of the VALUE block that's associated with the KEY of a key-value
     * pair. A relationship of type CHILD is a list of IDs that identify WORD
     * blocks in the case of lines Cell blocks in the case of Tables, and WORD
     * blocks in the case of Selection Elements.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VALUE, CHILD, COMPLEX_FEATURES, MERGED_CELL, TITLE
     */
    private String type;

    /**
     * <p>
     * An array of IDs for related blocks. You can get the type of the
     * relationship from the <code>Type</code> element.
     * </p>
     */
    private java.util.List<String> ids;

    /**
     * <p>
     * The type of relationship that the blocks in the IDs array have with the
     * current block. The relationship can be <code>VALUE</code> or
     * <code>CHILD</code>. A relationship of type VALUE is a list that contains
     * the ID of the VALUE block that's associated with the KEY of a key-value
     * pair. A relationship of type CHILD is a list of IDs that identify WORD
     * blocks in the case of lines Cell blocks in the case of Tables, and WORD
     * blocks in the case of Selection Elements.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VALUE, CHILD, COMPLEX_FEATURES, MERGED_CELL, TITLE
     *
     * @return <p>
     *         The type of relationship that the blocks in the IDs array have
     *         with the current block. The relationship can be
     *         <code>VALUE</code> or <code>CHILD</code>. A relationship of type
     *         VALUE is a list that contains the ID of the VALUE block that's
     *         associated with the KEY of a key-value pair. A relationship of
     *         type CHILD is a list of IDs that identify WORD blocks in the case
     *         of lines Cell blocks in the case of Tables, and WORD blocks in
     *         the case of Selection Elements.
     *         </p>
     * @see RelationshipType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of relationship that the blocks in the IDs array have with the
     * current block. The relationship can be <code>VALUE</code> or
     * <code>CHILD</code>. A relationship of type VALUE is a list that contains
     * the ID of the VALUE block that's associated with the KEY of a key-value
     * pair. A relationship of type CHILD is a list of IDs that identify WORD
     * blocks in the case of lines Cell blocks in the case of Tables, and WORD
     * blocks in the case of Selection Elements.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VALUE, CHILD, COMPLEX_FEATURES, MERGED_CELL, TITLE
     *
     * @param type <p>
     *            The type of relationship that the blocks in the IDs array have
     *            with the current block. The relationship can be
     *            <code>VALUE</code> or <code>CHILD</code>. A relationship of
     *            type VALUE is a list that contains the ID of the VALUE block
     *            that's associated with the KEY of a key-value pair. A
     *            relationship of type CHILD is a list of IDs that identify WORD
     *            blocks in the case of lines Cell blocks in the case of Tables,
     *            and WORD blocks in the case of Selection Elements.
     *            </p>
     * @see RelationshipType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of relationship that the blocks in the IDs array have with the
     * current block. The relationship can be <code>VALUE</code> or
     * <code>CHILD</code>. A relationship of type VALUE is a list that contains
     * the ID of the VALUE block that's associated with the KEY of a key-value
     * pair. A relationship of type CHILD is a list of IDs that identify WORD
     * blocks in the case of lines Cell blocks in the case of Tables, and WORD
     * blocks in the case of Selection Elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VALUE, CHILD, COMPLEX_FEATURES, MERGED_CELL, TITLE
     *
     * @param type <p>
     *            The type of relationship that the blocks in the IDs array have
     *            with the current block. The relationship can be
     *            <code>VALUE</code> or <code>CHILD</code>. A relationship of
     *            type VALUE is a list that contains the ID of the VALUE block
     *            that's associated with the KEY of a key-value pair. A
     *            relationship of type CHILD is a list of IDs that identify WORD
     *            blocks in the case of lines Cell blocks in the case of Tables,
     *            and WORD blocks in the case of Selection Elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelationshipType
     */
    public Relationship withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of relationship that the blocks in the IDs array have with the
     * current block. The relationship can be <code>VALUE</code> or
     * <code>CHILD</code>. A relationship of type VALUE is a list that contains
     * the ID of the VALUE block that's associated with the KEY of a key-value
     * pair. A relationship of type CHILD is a list of IDs that identify WORD
     * blocks in the case of lines Cell blocks in the case of Tables, and WORD
     * blocks in the case of Selection Elements.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VALUE, CHILD, COMPLEX_FEATURES, MERGED_CELL, TITLE
     *
     * @param type <p>
     *            The type of relationship that the blocks in the IDs array have
     *            with the current block. The relationship can be
     *            <code>VALUE</code> or <code>CHILD</code>. A relationship of
     *            type VALUE is a list that contains the ID of the VALUE block
     *            that's associated with the KEY of a key-value pair. A
     *            relationship of type CHILD is a list of IDs that identify WORD
     *            blocks in the case of lines Cell blocks in the case of Tables,
     *            and WORD blocks in the case of Selection Elements.
     *            </p>
     * @see RelationshipType
     */
    public void setType(RelationshipType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of relationship that the blocks in the IDs array have with the
     * current block. The relationship can be <code>VALUE</code> or
     * <code>CHILD</code>. A relationship of type VALUE is a list that contains
     * the ID of the VALUE block that's associated with the KEY of a key-value
     * pair. A relationship of type CHILD is a list of IDs that identify WORD
     * blocks in the case of lines Cell blocks in the case of Tables, and WORD
     * blocks in the case of Selection Elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VALUE, CHILD, COMPLEX_FEATURES, MERGED_CELL, TITLE
     *
     * @param type <p>
     *            The type of relationship that the blocks in the IDs array have
     *            with the current block. The relationship can be
     *            <code>VALUE</code> or <code>CHILD</code>. A relationship of
     *            type VALUE is a list that contains the ID of the VALUE block
     *            that's associated with the KEY of a key-value pair. A
     *            relationship of type CHILD is a list of IDs that identify WORD
     *            blocks in the case of lines Cell blocks in the case of Tables,
     *            and WORD blocks in the case of Selection Elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelationshipType
     */
    public Relationship withType(RelationshipType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * An array of IDs for related blocks. You can get the type of the
     * relationship from the <code>Type</code> element.
     * </p>
     *
     * @return <p>
     *         An array of IDs for related blocks. You can get the type of the
     *         relationship from the <code>Type</code> element.
     *         </p>
     */
    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * An array of IDs for related blocks. You can get the type of the
     * relationship from the <code>Type</code> element.
     * </p>
     *
     * @param ids <p>
     *            An array of IDs for related blocks. You can get the type of
     *            the relationship from the <code>Type</code> element.
     *            </p>
     */
    public void setIds(java.util.Collection<String> ids) {
        if (ids == null) {
            this.ids = null;
            return;
        }

        this.ids = new java.util.ArrayList<String>(ids);
    }

    /**
     * <p>
     * An array of IDs for related blocks. You can get the type of the
     * relationship from the <code>Type</code> element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ids <p>
     *            An array of IDs for related blocks. You can get the type of
     *            the relationship from the <code>Type</code> element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Relationship withIds(String... ids) {
        if (getIds() == null) {
            this.ids = new java.util.ArrayList<String>(ids.length);
        }
        for (String value : ids) {
            this.ids.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of IDs for related blocks. You can get the type of the
     * relationship from the <code>Type</code> element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ids <p>
     *            An array of IDs for related blocks. You can get the type of
     *            the relationship from the <code>Type</code> element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Relationship withIds(java.util.Collection<String> ids) {
        setIds(ids);
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
            sb.append("Type: " + getType() + ",");
        if (getIds() != null)
            sb.append("Ids: " + getIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Relationship == false)
            return false;
        Relationship other = (Relationship) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
            return false;
        return true;
    }
}
