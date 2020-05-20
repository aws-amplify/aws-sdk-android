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

package com.amazonaws.services.backup.model;

import java.io.Serializable;

/**
 * <p>
 * Contains an array of triplets made up of a condition type (such as
 * <code>STRINGEQUALS</code>), a key, and a value. Conditions are used to filter
 * resources in a selection that is assigned to a backup plan.
 * </p>
 */
public class Condition implements Serializable {
    /**
     * <p>
     * An operation, such as <code>STRINGEQUALS</code>, that is applied to a
     * key-value pair used to filter resources in a selection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRINGEQUALS
     */
    private String conditionType;

    /**
     * <p>
     * The key in a key-value pair. For example, in
     * <code>"ec2:ResourceTag/Department": "accounting"</code>,
     * <code>"ec2:ResourceTag/Department"</code> is the key.
     * </p>
     */
    private String conditionKey;

    /**
     * <p>
     * The value in a key-value pair. For example, in
     * <code>"ec2:ResourceTag/Department": "accounting"</code>,
     * <code>"accounting"</code> is the value.
     * </p>
     */
    private String conditionValue;

    /**
     * <p>
     * An operation, such as <code>STRINGEQUALS</code>, that is applied to a
     * key-value pair used to filter resources in a selection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRINGEQUALS
     *
     * @return <p>
     *         An operation, such as <code>STRINGEQUALS</code>, that is applied
     *         to a key-value pair used to filter resources in a selection.
     *         </p>
     * @see ConditionType
     */
    public String getConditionType() {
        return conditionType;
    }

    /**
     * <p>
     * An operation, such as <code>STRINGEQUALS</code>, that is applied to a
     * key-value pair used to filter resources in a selection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRINGEQUALS
     *
     * @param conditionType <p>
     *            An operation, such as <code>STRINGEQUALS</code>, that is
     *            applied to a key-value pair used to filter resources in a
     *            selection.
     *            </p>
     * @see ConditionType
     */
    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }

    /**
     * <p>
     * An operation, such as <code>STRINGEQUALS</code>, that is applied to a
     * key-value pair used to filter resources in a selection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRINGEQUALS
     *
     * @param conditionType <p>
     *            An operation, such as <code>STRINGEQUALS</code>, that is
     *            applied to a key-value pair used to filter resources in a
     *            selection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConditionType
     */
    public Condition withConditionType(String conditionType) {
        this.conditionType = conditionType;
        return this;
    }

    /**
     * <p>
     * An operation, such as <code>STRINGEQUALS</code>, that is applied to a
     * key-value pair used to filter resources in a selection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRINGEQUALS
     *
     * @param conditionType <p>
     *            An operation, such as <code>STRINGEQUALS</code>, that is
     *            applied to a key-value pair used to filter resources in a
     *            selection.
     *            </p>
     * @see ConditionType
     */
    public void setConditionType(ConditionType conditionType) {
        this.conditionType = conditionType.toString();
    }

    /**
     * <p>
     * An operation, such as <code>STRINGEQUALS</code>, that is applied to a
     * key-value pair used to filter resources in a selection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRINGEQUALS
     *
     * @param conditionType <p>
     *            An operation, such as <code>STRINGEQUALS</code>, that is
     *            applied to a key-value pair used to filter resources in a
     *            selection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConditionType
     */
    public Condition withConditionType(ConditionType conditionType) {
        this.conditionType = conditionType.toString();
        return this;
    }

    /**
     * <p>
     * The key in a key-value pair. For example, in
     * <code>"ec2:ResourceTag/Department": "accounting"</code>,
     * <code>"ec2:ResourceTag/Department"</code> is the key.
     * </p>
     *
     * @return <p>
     *         The key in a key-value pair. For example, in
     *         <code>"ec2:ResourceTag/Department": "accounting"</code>,
     *         <code>"ec2:ResourceTag/Department"</code> is the key.
     *         </p>
     */
    public String getConditionKey() {
        return conditionKey;
    }

    /**
     * <p>
     * The key in a key-value pair. For example, in
     * <code>"ec2:ResourceTag/Department": "accounting"</code>,
     * <code>"ec2:ResourceTag/Department"</code> is the key.
     * </p>
     *
     * @param conditionKey <p>
     *            The key in a key-value pair. For example, in
     *            <code>"ec2:ResourceTag/Department": "accounting"</code>,
     *            <code>"ec2:ResourceTag/Department"</code> is the key.
     *            </p>
     */
    public void setConditionKey(String conditionKey) {
        this.conditionKey = conditionKey;
    }

    /**
     * <p>
     * The key in a key-value pair. For example, in
     * <code>"ec2:ResourceTag/Department": "accounting"</code>,
     * <code>"ec2:ResourceTag/Department"</code> is the key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conditionKey <p>
     *            The key in a key-value pair. For example, in
     *            <code>"ec2:ResourceTag/Department": "accounting"</code>,
     *            <code>"ec2:ResourceTag/Department"</code> is the key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withConditionKey(String conditionKey) {
        this.conditionKey = conditionKey;
        return this;
    }

    /**
     * <p>
     * The value in a key-value pair. For example, in
     * <code>"ec2:ResourceTag/Department": "accounting"</code>,
     * <code>"accounting"</code> is the value.
     * </p>
     *
     * @return <p>
     *         The value in a key-value pair. For example, in
     *         <code>"ec2:ResourceTag/Department": "accounting"</code>,
     *         <code>"accounting"</code> is the value.
     *         </p>
     */
    public String getConditionValue() {
        return conditionValue;
    }

    /**
     * <p>
     * The value in a key-value pair. For example, in
     * <code>"ec2:ResourceTag/Department": "accounting"</code>,
     * <code>"accounting"</code> is the value.
     * </p>
     *
     * @param conditionValue <p>
     *            The value in a key-value pair. For example, in
     *            <code>"ec2:ResourceTag/Department": "accounting"</code>,
     *            <code>"accounting"</code> is the value.
     *            </p>
     */
    public void setConditionValue(String conditionValue) {
        this.conditionValue = conditionValue;
    }

    /**
     * <p>
     * The value in a key-value pair. For example, in
     * <code>"ec2:ResourceTag/Department": "accounting"</code>,
     * <code>"accounting"</code> is the value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conditionValue <p>
     *            The value in a key-value pair. For example, in
     *            <code>"ec2:ResourceTag/Department": "accounting"</code>,
     *            <code>"accounting"</code> is the value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withConditionValue(String conditionValue) {
        this.conditionValue = conditionValue;
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
        if (getConditionType() != null)
            sb.append("ConditionType: " + getConditionType() + ",");
        if (getConditionKey() != null)
            sb.append("ConditionKey: " + getConditionKey() + ",");
        if (getConditionValue() != null)
            sb.append("ConditionValue: " + getConditionValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConditionType() == null) ? 0 : getConditionType().hashCode());
        hashCode = prime * hashCode
                + ((getConditionKey() == null) ? 0 : getConditionKey().hashCode());
        hashCode = prime * hashCode
                + ((getConditionValue() == null) ? 0 : getConditionValue().hashCode());
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

        if (other.getConditionType() == null ^ this.getConditionType() == null)
            return false;
        if (other.getConditionType() != null
                && other.getConditionType().equals(this.getConditionType()) == false)
            return false;
        if (other.getConditionKey() == null ^ this.getConditionKey() == null)
            return false;
        if (other.getConditionKey() != null
                && other.getConditionKey().equals(this.getConditionKey()) == false)
            return false;
        if (other.getConditionValue() == null ^ this.getConditionValue() == null)
            return false;
        if (other.getConditionValue() != null
                && other.getConditionValue().equals(this.getConditionValue()) == false)
            return false;
        return true;
    }
}
