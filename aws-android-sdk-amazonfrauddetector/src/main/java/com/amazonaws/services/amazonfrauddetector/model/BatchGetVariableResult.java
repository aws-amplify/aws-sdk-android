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

public class BatchGetVariableResult implements Serializable {
    /**
     * <p>
     * The returned variables.
     * </p>
     */
    private java.util.List<Variable> variables;

    /**
     * <p>
     * The errors from the request.
     * </p>
     */
    private java.util.List<BatchGetVariableError> errors;

    /**
     * <p>
     * The returned variables.
     * </p>
     *
     * @return <p>
     *         The returned variables.
     *         </p>
     */
    public java.util.List<Variable> getVariables() {
        return variables;
    }

    /**
     * <p>
     * The returned variables.
     * </p>
     *
     * @param variables <p>
     *            The returned variables.
     *            </p>
     */
    public void setVariables(java.util.Collection<Variable> variables) {
        if (variables == null) {
            this.variables = null;
            return;
        }

        this.variables = new java.util.ArrayList<Variable>(variables);
    }

    /**
     * <p>
     * The returned variables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param variables <p>
     *            The returned variables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetVariableResult withVariables(Variable... variables) {
        if (getVariables() == null) {
            this.variables = new java.util.ArrayList<Variable>(variables.length);
        }
        for (Variable value : variables) {
            this.variables.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The returned variables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param variables <p>
     *            The returned variables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetVariableResult withVariables(java.util.Collection<Variable> variables) {
        setVariables(variables);
        return this;
    }

    /**
     * <p>
     * The errors from the request.
     * </p>
     *
     * @return <p>
     *         The errors from the request.
     *         </p>
     */
    public java.util.List<BatchGetVariableError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * The errors from the request.
     * </p>
     *
     * @param errors <p>
     *            The errors from the request.
     *            </p>
     */
    public void setErrors(java.util.Collection<BatchGetVariableError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchGetVariableError>(errors);
    }

    /**
     * <p>
     * The errors from the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            The errors from the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetVariableResult withErrors(BatchGetVariableError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<BatchGetVariableError>(errors.length);
        }
        for (BatchGetVariableError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The errors from the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            The errors from the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetVariableResult withErrors(java.util.Collection<BatchGetVariableError> errors) {
        setErrors(errors);
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
        if (getVariables() != null)
            sb.append("variables: " + getVariables() + ",");
        if (getErrors() != null)
            sb.append("errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetVariableResult == false)
            return false;
        BatchGetVariableResult other = (BatchGetVariableResult) obj;

        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null
                && other.getVariables().equals(this.getVariables()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}
