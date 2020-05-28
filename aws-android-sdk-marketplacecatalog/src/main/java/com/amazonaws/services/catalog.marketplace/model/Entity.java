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

package com.amazonaws.services.catalog.marketplace.model;

import java.io.Serializable;

/**
 * <p>
 * A product entity contains data that describes your product, its supported
 * features, and how it can be used or launched by your customer.
 * </p>
 */
public class Entity implements Serializable {
    /**
     * <p>
     * The type of entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     */
    private String type;

    /**
     * <p>
     * The identifier for the entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-@]+$<br/>
     */
    private String identifier;

    /**
     * <p>
     * The type of entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @return <p>
     *         The type of entity.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param type <p>
     *            The type of entity.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param type <p>
     *            The type of entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Entity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The identifier for the entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-@]+$<br/>
     *
     * @return <p>
     *         The identifier for the entity.
     *         </p>
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * <p>
     * The identifier for the entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-@]+$<br/>
     *
     * @param identifier <p>
     *            The identifier for the entity.
     *            </p>
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier for the entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-@]+$<br/>
     *
     * @param identifier <p>
     *            The identifier for the entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Entity withIdentifier(String identifier) {
        this.identifier = identifier;
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
        if (getIdentifier() != null)
            sb.append("Identifier: " + getIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Entity == false)
            return false;
        Entity other = (Entity) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null
                && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        return true;
    }
}
