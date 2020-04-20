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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a group when you specify a group by criteria or in the response to
 * a query with a specific grouping.
 * </p>
 */
public class GroupDefinition implements Serializable {
    /**
     * <p>
     * The string that represents the type of group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DIMENSION, TAG, COST_CATEGORY
     */
    private String type;

    /**
     * <p>
     * The string that represents a key for a specified group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String key;

    /**
     * <p>
     * The string that represents the type of group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DIMENSION, TAG, COST_CATEGORY
     *
     * @return <p>
     *         The string that represents the type of group.
     *         </p>
     * @see GroupDefinitionType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The string that represents the type of group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DIMENSION, TAG, COST_CATEGORY
     *
     * @param type <p>
     *            The string that represents the type of group.
     *            </p>
     * @see GroupDefinitionType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The string that represents the type of group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DIMENSION, TAG, COST_CATEGORY
     *
     * @param type <p>
     *            The string that represents the type of group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GroupDefinitionType
     */
    public GroupDefinition withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The string that represents the type of group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DIMENSION, TAG, COST_CATEGORY
     *
     * @param type <p>
     *            The string that represents the type of group.
     *            </p>
     * @see GroupDefinitionType
     */
    public void setType(GroupDefinitionType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The string that represents the type of group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DIMENSION, TAG, COST_CATEGORY
     *
     * @param type <p>
     *            The string that represents the type of group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GroupDefinitionType
     */
    public GroupDefinition withType(GroupDefinitionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The string that represents a key for a specified group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The string that represents a key for a specified group.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The string that represents a key for a specified group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param key <p>
     *            The string that represents a key for a specified group.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The string that represents a key for a specified group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param key <p>
     *            The string that represents a key for a specified group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GroupDefinition withKey(String key) {
        this.key = key;
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
        if (getKey() != null)
            sb.append("Key: " + getKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupDefinition == false)
            return false;
        GroupDefinition other = (GroupDefinition) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        return true;
    }
}
