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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Deletes the input end point
 */
public class DeleteInputRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Unique ID of the input
     */
    private String inputId;

    /**
     * Unique ID of the input
     *
     * @return Unique ID of the input
     */
    public String getInputId() {
        return inputId;
    }

    /**
     * Unique ID of the input
     *
     * @param inputId Unique ID of the input
     */
    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    /**
     * Unique ID of the input
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputId Unique ID of the input
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteInputRequest withInputId(String inputId) {
        this.inputId = inputId;
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
        if (getInputId() != null)
            sb.append("InputId: " + getInputId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputId() == null) ? 0 : getInputId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInputRequest == false)
            return false;
        DeleteInputRequest other = (DeleteInputRequest) obj;

        if (other.getInputId() == null ^ this.getInputId() == null)
            return false;
        if (other.getInputId() != null && other.getInputId().equals(this.getInputId()) == false)
            return false;
        return true;
    }
}
