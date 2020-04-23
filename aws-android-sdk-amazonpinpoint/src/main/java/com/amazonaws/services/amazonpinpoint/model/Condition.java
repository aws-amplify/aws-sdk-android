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

package com.amazonaws.services.amazonpinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the conditions to evaluate for an activity in a journey, and how to
 * evaluate those conditions.
 * </p>
 */
public class Condition implements Serializable {
    /**
     * <p>
     * The conditions to evaluate for the activity.
     * </p>
     */
    private java.util.List<SimpleCondition> conditions;

    /**
     * <p>
     * Specifies how to handle multiple conditions for the activity. For
     * example, if you specify two conditions for an activity, whether both or
     * only one of the conditions must be met for the activity to be performed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY
     */
    private String operator;

    /**
     * <p>
     * The conditions to evaluate for the activity.
     * </p>
     *
     * @return <p>
     *         The conditions to evaluate for the activity.
     *         </p>
     */
    public java.util.List<SimpleCondition> getConditions() {
        return conditions;
    }

    /**
     * <p>
     * The conditions to evaluate for the activity.
     * </p>
     *
     * @param conditions <p>
     *            The conditions to evaluate for the activity.
     *            </p>
     */
    public void setConditions(java.util.Collection<SimpleCondition> conditions) {
        if (conditions == null) {
            this.conditions = null;
            return;
        }

        this.conditions = new java.util.ArrayList<SimpleCondition>(conditions);
    }

    /**
     * <p>
     * The conditions to evaluate for the activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conditions <p>
     *            The conditions to evaluate for the activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withConditions(SimpleCondition... conditions) {
        if (getConditions() == null) {
            this.conditions = new java.util.ArrayList<SimpleCondition>(conditions.length);
        }
        for (SimpleCondition value : conditions) {
            this.conditions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The conditions to evaluate for the activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conditions <p>
     *            The conditions to evaluate for the activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withConditions(java.util.Collection<SimpleCondition> conditions) {
        setConditions(conditions);
        return this;
    }

    /**
     * <p>
     * Specifies how to handle multiple conditions for the activity. For
     * example, if you specify two conditions for an activity, whether both or
     * only one of the conditions must be met for the activity to be performed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY
     *
     * @return <p>
     *         Specifies how to handle multiple conditions for the activity. For
     *         example, if you specify two conditions for an activity, whether
     *         both or only one of the conditions must be met for the activity
     *         to be performed.
     *         </p>
     * @see Operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * <p>
     * Specifies how to handle multiple conditions for the activity. For
     * example, if you specify two conditions for an activity, whether both or
     * only one of the conditions must be met for the activity to be performed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY
     *
     * @param operator <p>
     *            Specifies how to handle multiple conditions for the activity.
     *            For example, if you specify two conditions for an activity,
     *            whether both or only one of the conditions must be met for the
     *            activity to be performed.
     *            </p>
     * @see Operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * Specifies how to handle multiple conditions for the activity. For
     * example, if you specify two conditions for an activity, whether both or
     * only one of the conditions must be met for the activity to be performed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY
     *
     * @param operator <p>
     *            Specifies how to handle multiple conditions for the activity.
     *            For example, if you specify two conditions for an activity,
     *            whether both or only one of the conditions must be met for the
     *            activity to be performed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Operator
     */
    public Condition withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * <p>
     * Specifies how to handle multiple conditions for the activity. For
     * example, if you specify two conditions for an activity, whether both or
     * only one of the conditions must be met for the activity to be performed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY
     *
     * @param operator <p>
     *            Specifies how to handle multiple conditions for the activity.
     *            For example, if you specify two conditions for an activity,
     *            whether both or only one of the conditions must be met for the
     *            activity to be performed.
     *            </p>
     * @see Operator
     */
    public void setOperator(Operator operator) {
        this.operator = operator.toString();
    }

    /**
     * <p>
     * Specifies how to handle multiple conditions for the activity. For
     * example, if you specify two conditions for an activity, whether both or
     * only one of the conditions must be met for the activity to be performed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY
     *
     * @param operator <p>
     *            Specifies how to handle multiple conditions for the activity.
     *            For example, if you specify two conditions for an activity,
     *            whether both or only one of the conditions must be met for the
     *            activity to be performed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Operator
     */
    public Condition withOperator(Operator operator) {
        this.operator = operator.toString();
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
        if (getConditions() != null)
            sb.append("Conditions: " + getConditions() + ",");
        if (getOperator() != null)
            sb.append("Operator: " + getOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConditions() == null) ? 0 : getConditions().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Condition == false)
            return false;
        Condition other = (Condition) obj;

        if (other.getConditions() == null ^ this.getConditions() == null)
            return false;
        if (other.getConditions() != null
                && other.getConditions().equals(this.getConditions()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        return true;
    }
}
