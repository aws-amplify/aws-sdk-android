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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the row and column of a location of a <code>Statement</code> element
 * in a policy document.
 * </p>
 * <p>
 * This data type is used as a member of the <code> <a>Statement</a> </code>
 * type.
 * </p>
 */
public class Position implements Serializable {
    /**
     * <p>
     * The line containing the specified position in the document.
     * </p>
     */
    private Integer line;

    /**
     * <p>
     * The column in the line containing the specified position in the document.
     * </p>
     */
    private Integer column;

    /**
     * <p>
     * The line containing the specified position in the document.
     * </p>
     *
     * @return <p>
     *         The line containing the specified position in the document.
     *         </p>
     */
    public Integer getLine() {
        return line;
    }

    /**
     * <p>
     * The line containing the specified position in the document.
     * </p>
     *
     * @param line <p>
     *            The line containing the specified position in the document.
     *            </p>
     */
    public void setLine(Integer line) {
        this.line = line;
    }

    /**
     * <p>
     * The line containing the specified position in the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param line <p>
     *            The line containing the specified position in the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Position withLine(Integer line) {
        this.line = line;
        return this;
    }

    /**
     * <p>
     * The column in the line containing the specified position in the document.
     * </p>
     *
     * @return <p>
     *         The column in the line containing the specified position in the
     *         document.
     *         </p>
     */
    public Integer getColumn() {
        return column;
    }

    /**
     * <p>
     * The column in the line containing the specified position in the document.
     * </p>
     *
     * @param column <p>
     *            The column in the line containing the specified position in
     *            the document.
     *            </p>
     */
    public void setColumn(Integer column) {
        this.column = column;
    }

    /**
     * <p>
     * The column in the line containing the specified position in the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param column <p>
     *            The column in the line containing the specified position in
     *            the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Position withColumn(Integer column) {
        this.column = column;
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
        if (getLine() != null)
            sb.append("Line: " + getLine() + ",");
        if (getColumn() != null)
            sb.append("Column: " + getColumn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLine() == null) ? 0 : getLine().hashCode());
        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Position == false)
            return false;
        Position other = (Position) obj;

        if (other.getLine() == null ^ this.getLine() == null)
            return false;
        if (other.getLine() != null && other.getLine().equals(this.getLine()) == false)
            return false;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        return true;
    }
}
