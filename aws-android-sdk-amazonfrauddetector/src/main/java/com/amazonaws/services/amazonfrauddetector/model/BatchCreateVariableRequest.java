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

package com.amazonaws.services.amazonfrauddetector.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a batch of variables.
 * </p>
 */
public class BatchCreateVariableRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The list of variables for the batch create variable request.
     * </p>
     */
    private java.util.List<VariableEntry> variableEntries;

    /**
     * <p>
     * The list of variables for the batch create variable request.
     * </p>
     *
     * @return <p>
     *         The list of variables for the batch create variable request.
     *         </p>
     */
    public java.util.List<VariableEntry> getVariableEntries() {
        return variableEntries;
    }

    /**
     * <p>
     * The list of variables for the batch create variable request.
     * </p>
     *
     * @param variableEntries <p>
     *            The list of variables for the batch create variable request.
     *            </p>
     */
    public void setVariableEntries(java.util.Collection<VariableEntry> variableEntries) {
        if (variableEntries == null) {
            this.variableEntries = null;
            return;
        }

        this.variableEntries = new java.util.ArrayList<VariableEntry>(variableEntries);
    }

    /**
     * <p>
     * The list of variables for the batch create variable request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param variableEntries <p>
     *            The list of variables for the batch create variable request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCreateVariableRequest withVariableEntries(VariableEntry... variableEntries) {
        if (getVariableEntries() == null) {
            this.variableEntries = new java.util.ArrayList<VariableEntry>(variableEntries.length);
        }
        for (VariableEntry value : variableEntries) {
            this.variableEntries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of variables for the batch create variable request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param variableEntries <p>
     *            The list of variables for the batch create variable request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCreateVariableRequest withVariableEntries(
            java.util.Collection<VariableEntry> variableEntries) {
        setVariableEntries(variableEntries);
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
        if (getVariableEntries() != null)
            sb.append("variableEntries: " + getVariableEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVariableEntries() == null) ? 0 : getVariableEntries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCreateVariableRequest == false)
            return false;
        BatchCreateVariableRequest other = (BatchCreateVariableRequest) obj;

        if (other.getVariableEntries() == null ^ this.getVariableEntries() == null)
            return false;
        if (other.getVariableEntries() != null
                && other.getVariableEntries().equals(this.getVariableEntries()) == false)
            return false;
        return true;
    }
}
