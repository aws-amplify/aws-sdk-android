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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the variable and its new value.
 * </p>
 */
public class SetVariableAction implements Serializable {
    /**
     * <p>
     * The name of the variable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     */
    private String variableName;

    /**
     * <p>
     * The new value of the variable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String value;

    /**
     * <p>
     * The name of the variable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @return <p>
     *         The name of the variable.
     *         </p>
     */
    public String getVariableName() {
        return variableName;
    }

    /**
     * <p>
     * The name of the variable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @param variableName <p>
     *            The name of the variable.
     *            </p>
     */
    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    /**
     * <p>
     * The name of the variable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @param variableName <p>
     *            The name of the variable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetVariableAction withVariableName(String variableName) {
        this.variableName = variableName;
        return this;
    }

    /**
     * <p>
     * The new value of the variable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The new value of the variable.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The new value of the variable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param value <p>
     *            The new value of the variable.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The new value of the variable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param value <p>
     *            The new value of the variable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetVariableAction withValue(String value) {
        this.value = value;
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
        if (getVariableName() != null)
            sb.append("variableName: " + getVariableName() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVariableName() == null) ? 0 : getVariableName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetVariableAction == false)
            return false;
        SetVariableAction other = (SetVariableAction) obj;

        if (other.getVariableName() == null ^ this.getVariableName() == null)
            return false;
        if (other.getVariableName() != null
                && other.getVariableName().equals(this.getVariableName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
