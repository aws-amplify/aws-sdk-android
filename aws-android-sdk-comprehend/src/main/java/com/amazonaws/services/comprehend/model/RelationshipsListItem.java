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
 * List of child blocks for the current block.
 * </p>
 */
public class RelationshipsListItem implements Serializable {
    /**
     * <p>
     * Identifers of the child blocks.
     * </p>
     */
    private java.util.List<String> ids;

    /**
     * <p>
     * Only supported relationship is a child relationship.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHILD
     */
    private String type;

    /**
     * <p>
     * Identifers of the child blocks.
     * </p>
     *
     * @return <p>
     *         Identifers of the child blocks.
     *         </p>
     */
    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * Identifers of the child blocks.
     * </p>
     *
     * @param ids <p>
     *            Identifers of the child blocks.
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
     * Identifers of the child blocks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ids <p>
     *            Identifers of the child blocks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationshipsListItem withIds(String... ids) {
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
     * Identifers of the child blocks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ids <p>
     *            Identifers of the child blocks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationshipsListItem withIds(java.util.Collection<String> ids) {
        setIds(ids);
        return this;
    }

    /**
     * <p>
     * Only supported relationship is a child relationship.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHILD
     *
     * @return <p>
     *         Only supported relationship is a child relationship.
     *         </p>
     * @see RelationshipType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Only supported relationship is a child relationship.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHILD
     *
     * @param type <p>
     *            Only supported relationship is a child relationship.
     *            </p>
     * @see RelationshipType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Only supported relationship is a child relationship.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHILD
     *
     * @param type <p>
     *            Only supported relationship is a child relationship.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelationshipType
     */
    public RelationshipsListItem withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Only supported relationship is a child relationship.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHILD
     *
     * @param type <p>
     *            Only supported relationship is a child relationship.
     *            </p>
     * @see RelationshipType
     */
    public void setType(RelationshipType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Only supported relationship is a child relationship.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHILD
     *
     * @param type <p>
     *            Only supported relationship is a child relationship.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelationshipType
     */
    public RelationshipsListItem withType(RelationshipType type) {
        this.type = type.toString();
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
        if (getIds() != null)
            sb.append("Ids: " + getIds() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelationshipsListItem == false)
            return false;
        RelationshipsListItem other = (RelationshipsListItem) obj;

        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
