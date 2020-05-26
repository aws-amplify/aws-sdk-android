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
 * Join instruction.
 * </p>
 */
public class JoinInstruction implements Serializable {
    /**
     * <p>
     * Left operand.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9a-zA-Z-]*<br/>
     */
    private String leftOperand;

    /**
     * <p>
     * Right operand.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9a-zA-Z-]*<br/>
     */
    private String rightOperand;

    /**
     * <p>
     * Type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INNER, OUTER, LEFT, RIGHT
     */
    private String type;

    /**
     * <p>
     * On Clause.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String onClause;

    /**
     * <p>
     * Left operand.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9a-zA-Z-]*<br/>
     *
     * @return <p>
     *         Left operand.
     *         </p>
     */
    public String getLeftOperand() {
        return leftOperand;
    }

    /**
     * <p>
     * Left operand.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9a-zA-Z-]*<br/>
     *
     * @param leftOperand <p>
     *            Left operand.
     *            </p>
     */
    public void setLeftOperand(String leftOperand) {
        this.leftOperand = leftOperand;
    }

    /**
     * <p>
     * Left operand.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9a-zA-Z-]*<br/>
     *
     * @param leftOperand <p>
     *            Left operand.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JoinInstruction withLeftOperand(String leftOperand) {
        this.leftOperand = leftOperand;
        return this;
    }

    /**
     * <p>
     * Right operand.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9a-zA-Z-]*<br/>
     *
     * @return <p>
     *         Right operand.
     *         </p>
     */
    public String getRightOperand() {
        return rightOperand;
    }

    /**
     * <p>
     * Right operand.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9a-zA-Z-]*<br/>
     *
     * @param rightOperand <p>
     *            Right operand.
     *            </p>
     */
    public void setRightOperand(String rightOperand) {
        this.rightOperand = rightOperand;
    }

    /**
     * <p>
     * Right operand.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[0-9a-zA-Z-]*<br/>
     *
     * @param rightOperand <p>
     *            Right operand.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JoinInstruction withRightOperand(String rightOperand) {
        this.rightOperand = rightOperand;
        return this;
    }

    /**
     * <p>
     * Type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INNER, OUTER, LEFT, RIGHT
     *
     * @return <p>
     *         Type.
     *         </p>
     * @see JoinType
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
     * <b>Allowed Values: </b>INNER, OUTER, LEFT, RIGHT
     *
     * @param type <p>
     *            Type.
     *            </p>
     * @see JoinType
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
     * <b>Allowed Values: </b>INNER, OUTER, LEFT, RIGHT
     *
     * @param type <p>
     *            Type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JoinType
     */
    public JoinInstruction withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INNER, OUTER, LEFT, RIGHT
     *
     * @param type <p>
     *            Type.
     *            </p>
     * @see JoinType
     */
    public void setType(JoinType type) {
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
     * <b>Allowed Values: </b>INNER, OUTER, LEFT, RIGHT
     *
     * @param type <p>
     *            Type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JoinType
     */
    public JoinInstruction withType(JoinType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * On Clause.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         On Clause.
     *         </p>
     */
    public String getOnClause() {
        return onClause;
    }

    /**
     * <p>
     * On Clause.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param onClause <p>
     *            On Clause.
     *            </p>
     */
    public void setOnClause(String onClause) {
        this.onClause = onClause;
    }

    /**
     * <p>
     * On Clause.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param onClause <p>
     *            On Clause.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JoinInstruction withOnClause(String onClause) {
        this.onClause = onClause;
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
        if (getLeftOperand() != null)
            sb.append("LeftOperand: " + getLeftOperand() + ",");
        if (getRightOperand() != null)
            sb.append("RightOperand: " + getRightOperand() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getOnClause() != null)
            sb.append("OnClause: " + getOnClause());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLeftOperand() == null) ? 0 : getLeftOperand().hashCode());
        hashCode = prime * hashCode
                + ((getRightOperand() == null) ? 0 : getRightOperand().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getOnClause() == null) ? 0 : getOnClause().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JoinInstruction == false)
            return false;
        JoinInstruction other = (JoinInstruction) obj;

        if (other.getLeftOperand() == null ^ this.getLeftOperand() == null)
            return false;
        if (other.getLeftOperand() != null
                && other.getLeftOperand().equals(this.getLeftOperand()) == false)
            return false;
        if (other.getRightOperand() == null ^ this.getRightOperand() == null)
            return false;
        if (other.getRightOperand() != null
                && other.getRightOperand().equals(this.getRightOperand()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getOnClause() == null ^ this.getOnClause() == null)
            return false;
        if (other.getOnClause() != null && other.getOnClause().equals(this.getOnClause()) == false)
            return false;
        return true;
    }
}
