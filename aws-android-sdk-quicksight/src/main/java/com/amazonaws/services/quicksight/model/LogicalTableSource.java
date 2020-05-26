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
 * Information about the source of a logical table. This is a variant type
 * structure. For this structure to be valid, only one of the attributes can be
 * non-null.
 * </p>
 */
public class LogicalTableSource implements Serializable {
    /**
     * <p>
     * Specifies the result of a join of two logical tables.
     * </p>
     */
    private JoinInstruction joinInstruction;

    /**
     * <p>
     * Physical table ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9a-zA-Z-]*<br/>
     */
    private String physicalTableId;

    /**
     * <p>
     * Specifies the result of a join of two logical tables.
     * </p>
     *
     * @return <p>
     *         Specifies the result of a join of two logical tables.
     *         </p>
     */
    public JoinInstruction getJoinInstruction() {
        return joinInstruction;
    }

    /**
     * <p>
     * Specifies the result of a join of two logical tables.
     * </p>
     *
     * @param joinInstruction <p>
     *            Specifies the result of a join of two logical tables.
     *            </p>
     */
    public void setJoinInstruction(JoinInstruction joinInstruction) {
        this.joinInstruction = joinInstruction;
    }

    /**
     * <p>
     * Specifies the result of a join of two logical tables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param joinInstruction <p>
     *            Specifies the result of a join of two logical tables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogicalTableSource withJoinInstruction(JoinInstruction joinInstruction) {
        this.joinInstruction = joinInstruction;
        return this;
    }

    /**
     * <p>
     * Physical table ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9a-zA-Z-]*<br/>
     *
     * @return <p>
     *         Physical table ID.
     *         </p>
     */
    public String getPhysicalTableId() {
        return physicalTableId;
    }

    /**
     * <p>
     * Physical table ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9a-zA-Z-]*<br/>
     *
     * @param physicalTableId <p>
     *            Physical table ID.
     *            </p>
     */
    public void setPhysicalTableId(String physicalTableId) {
        this.physicalTableId = physicalTableId;
    }

    /**
     * <p>
     * Physical table ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9a-zA-Z-]*<br/>
     *
     * @param physicalTableId <p>
     *            Physical table ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogicalTableSource withPhysicalTableId(String physicalTableId) {
        this.physicalTableId = physicalTableId;
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
        if (getJoinInstruction() != null)
            sb.append("JoinInstruction: " + getJoinInstruction() + ",");
        if (getPhysicalTableId() != null)
            sb.append("PhysicalTableId: " + getPhysicalTableId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJoinInstruction() == null) ? 0 : getJoinInstruction().hashCode());
        hashCode = prime * hashCode
                + ((getPhysicalTableId() == null) ? 0 : getPhysicalTableId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogicalTableSource == false)
            return false;
        LogicalTableSource other = (LogicalTableSource) obj;

        if (other.getJoinInstruction() == null ^ this.getJoinInstruction() == null)
            return false;
        if (other.getJoinInstruction() != null
                && other.getJoinInstruction().equals(this.getJoinInstruction()) == false)
            return false;
        if (other.getPhysicalTableId() == null ^ this.getPhysicalTableId() == null)
            return false;
        if (other.getPhysicalTableId() != null
                && other.getPhysicalTableId().equals(this.getPhysicalTableId()) == false)
            return false;
        return true;
    }
}
