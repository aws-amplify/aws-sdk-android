/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the name and data type at a field.
 * </p>
 */
public class Field implements Serializable {
    /**
     * <p>
     * The name of the field.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The data type of the field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Number, String, Boolean
     */
    private String type;

    /**
     * <p>
     * The name of the field.
     * </p>
     *
     * @return <p>
     *         The name of the field.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the field.
     * </p>
     *
     * @param name <p>
     *            The name of the field.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Field withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The data type of the field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Number, String, Boolean
     *
     * @return <p>
     *         The data type of the field.
     *         </p>
     * @see FieldType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The data type of the field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Number, String, Boolean
     *
     * @param type <p>
     *            The data type of the field.
     *            </p>
     * @see FieldType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The data type of the field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Number, String, Boolean
     *
     * @param type <p>
     *            The data type of the field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FieldType
     */
    public Field withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The data type of the field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Number, String, Boolean
     *
     * @param type <p>
     *            The data type of the field.
     *            </p>
     * @see FieldType
     */
    public void setType(FieldType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The data type of the field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Number, String, Boolean
     *
     * @param type <p>
     *            The data type of the field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FieldType
     */
    public Field withType(FieldType type) {
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Field == false)
            return false;
        Field other = (Field) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
