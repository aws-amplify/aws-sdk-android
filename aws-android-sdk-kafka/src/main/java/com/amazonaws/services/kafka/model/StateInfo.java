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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

public class StateInfo implements Serializable {
    /**
     * The new value for the code property for this object.
     */
    private String code;

    /**
     * The new value for the message property for this object.
     */
    private String message;

    /**
     * Returns the value of the code property for this object.
     *
     * @return The value of the code property for this object.
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of code
     *
     * @param code The new value for the code property for this object.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Sets the value of the code property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param code The new value for the code property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StateInfo withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Returns the value of the message property for this object.
     *
     * @return The value of the message property for this object.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of message
     *
     * @param message The new value for the message property for this object.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Sets the value of the message property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message The new value for the message property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StateInfo withMessage(String message) {
        this.message = message;
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
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StateInfo == false)
            return false;
        StateInfo other = (StateInfo) obj;

        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
