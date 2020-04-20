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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * Defines the predicate of the trigger, which determines when it fires.
 * </p>
 */
public class Predicate implements Serializable {
    /**
     * <p>
     * An optional field if only one condition is listed. If multiple conditions
     * are listed, then this field is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, ANY
     */
    private String logical;

    /**
     * <p>
     * A list of the conditions that determine when the trigger will fire.
     * </p>
     */
    private java.util.List<Condition> conditions;

    /**
     * <p>
     * An optional field if only one condition is listed. If multiple conditions
     * are listed, then this field is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, ANY
     *
     * @return <p>
     *         An optional field if only one condition is listed. If multiple
     *         conditions are listed, then this field is required.
     *         </p>
     * @see Logical
     */
    public String getLogical() {
        return logical;
    }

    /**
     * <p>
     * An optional field if only one condition is listed. If multiple conditions
     * are listed, then this field is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, ANY
     *
     * @param logical <p>
     *            An optional field if only one condition is listed. If multiple
     *            conditions are listed, then this field is required.
     *            </p>
     * @see Logical
     */
    public void setLogical(String logical) {
        this.logical = logical;
    }

    /**
     * <p>
     * An optional field if only one condition is listed. If multiple conditions
     * are listed, then this field is required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, ANY
     *
     * @param logical <p>
     *            An optional field if only one condition is listed. If multiple
     *            conditions are listed, then this field is required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Logical
     */
    public Predicate withLogical(String logical) {
        this.logical = logical;
        return this;
    }

    /**
     * <p>
     * An optional field if only one condition is listed. If multiple conditions
     * are listed, then this field is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, ANY
     *
     * @param logical <p>
     *            An optional field if only one condition is listed. If multiple
     *            conditions are listed, then this field is required.
     *            </p>
     * @see Logical
     */
    public void setLogical(Logical logical) {
        this.logical = logical.toString();
    }

    /**
     * <p>
     * An optional field if only one condition is listed. If multiple conditions
     * are listed, then this field is required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, ANY
     *
     * @param logical <p>
     *            An optional field if only one condition is listed. If multiple
     *            conditions are listed, then this field is required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Logical
     */
    public Predicate withLogical(Logical logical) {
        this.logical = logical.toString();
        return this;
    }

    /**
     * <p>
     * A list of the conditions that determine when the trigger will fire.
     * </p>
     *
     * @return <p>
     *         A list of the conditions that determine when the trigger will
     *         fire.
     *         </p>
     */
    public java.util.List<Condition> getConditions() {
        return conditions;
    }

    /**
     * <p>
     * A list of the conditions that determine when the trigger will fire.
     * </p>
     *
     * @param conditions <p>
     *            A list of the conditions that determine when the trigger will
     *            fire.
     *            </p>
     */
    public void setConditions(java.util.Collection<Condition> conditions) {
        if (conditions == null) {
            this.conditions = null;
            return;
        }

        this.conditions = new java.util.ArrayList<Condition>(conditions);
    }

    /**
     * <p>
     * A list of the conditions that determine when the trigger will fire.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conditions <p>
     *            A list of the conditions that determine when the trigger will
     *            fire.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Predicate withConditions(Condition... conditions) {
        if (getConditions() == null) {
            this.conditions = new java.util.ArrayList<Condition>(conditions.length);
        }
        for (Condition value : conditions) {
            this.conditions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the conditions that determine when the trigger will fire.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conditions <p>
     *            A list of the conditions that determine when the trigger will
     *            fire.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Predicate withConditions(java.util.Collection<Condition> conditions) {
        setConditions(conditions);
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
        if (getLogical() != null)
            sb.append("Logical: " + getLogical() + ",");
        if (getConditions() != null)
            sb.append("Conditions: " + getConditions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogical() == null) ? 0 : getLogical().hashCode());
        hashCode = prime * hashCode + ((getConditions() == null) ? 0 : getConditions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Predicate == false)
            return false;
        Predicate other = (Predicate) obj;

        if (other.getLogical() == null ^ this.getLogical() == null)
            return false;
        if (other.getLogical() != null && other.getLogical().equals(this.getLogical()) == false)
            return false;
        if (other.getConditions() == null ^ this.getConditions() == null)
            return false;
        if (other.getConditions() != null
                && other.getConditions().equals(this.getConditions()) == false)
            return false;
        return true;
    }
}
