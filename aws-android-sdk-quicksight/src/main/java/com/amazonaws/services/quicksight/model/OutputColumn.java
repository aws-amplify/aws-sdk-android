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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * Output column.
 * </p>
 */
public class OutputColumn implements Serializable {
    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String name;

    /**
     * <p>
     * Type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DECIMAL, DATETIME
     */
    private String type;

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         A display name for the dataset.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            A display name for the dataset.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            A display name for the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputColumn withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DECIMAL, DATETIME
     *
     * @return <p>
     *         Type.
     *         </p>
     * @see ColumnDataType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DECIMAL, DATETIME
     *
     * @param type <p>
     *            Type.
     *            </p>
     * @see ColumnDataType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DECIMAL, DATETIME
     *
     * @param type <p>
     *            Type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ColumnDataType
     */
    public OutputColumn withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DECIMAL, DATETIME
     *
     * @param type <p>
     *            Type.
     *            </p>
     * @see ColumnDataType
     */
    public void setType(ColumnDataType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DECIMAL, DATETIME
     *
     * @param type <p>
     *            Type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ColumnDataType
     */
    public OutputColumn withType(ColumnDataType type) {
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
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
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

        if (obj instanceof OutputColumn == false)
            return false;
        OutputColumn other = (OutputColumn) obj;

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
