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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class GetParametersResult implements Serializable {
    /**
     * <p>
     * A list of details for a parameter.
     * </p>
     */
    private java.util.List<Parameter> parameters;

    /**
     * <p>
     * A list of parameters that are not formatted correctly or do not run
     * during an execution.
     * </p>
     */
    private java.util.List<String> invalidParameters;

    /**
     * <p>
     * A list of details for a parameter.
     * </p>
     *
     * @return <p>
     *         A list of details for a parameter.
     *         </p>
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A list of details for a parameter.
     * </p>
     *
     * @param parameters <p>
     *            A list of details for a parameter.
     *            </p>
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<Parameter>(parameters);
    }

    /**
     * <p>
     * A list of details for a parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of details for a parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetParametersResult withParameters(Parameter... parameters) {
        if (getParameters() == null) {
            this.parameters = new java.util.ArrayList<Parameter>(parameters.length);
        }
        for (Parameter value : parameters) {
            this.parameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of details for a parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of details for a parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetParametersResult withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * A list of parameters that are not formatted correctly or do not run
     * during an execution.
     * </p>
     *
     * @return <p>
     *         A list of parameters that are not formatted correctly or do not
     *         run during an execution.
     *         </p>
     */
    public java.util.List<String> getInvalidParameters() {
        return invalidParameters;
    }

    /**
     * <p>
     * A list of parameters that are not formatted correctly or do not run
     * during an execution.
     * </p>
     *
     * @param invalidParameters <p>
     *            A list of parameters that are not formatted correctly or do
     *            not run during an execution.
     *            </p>
     */
    public void setInvalidParameters(java.util.Collection<String> invalidParameters) {
        if (invalidParameters == null) {
            this.invalidParameters = null;
            return;
        }

        this.invalidParameters = new java.util.ArrayList<String>(invalidParameters);
    }

    /**
     * <p>
     * A list of parameters that are not formatted correctly or do not run
     * during an execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invalidParameters <p>
     *            A list of parameters that are not formatted correctly or do
     *            not run during an execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetParametersResult withInvalidParameters(String... invalidParameters) {
        if (getInvalidParameters() == null) {
            this.invalidParameters = new java.util.ArrayList<String>(invalidParameters.length);
        }
        for (String value : invalidParameters) {
            this.invalidParameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of parameters that are not formatted correctly or do not run
     * during an execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invalidParameters <p>
     *            A list of parameters that are not formatted correctly or do
     *            not run during an execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetParametersResult withInvalidParameters(java.util.Collection<String> invalidParameters) {
        setInvalidParameters(invalidParameters);
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
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getInvalidParameters() != null)
            sb.append("InvalidParameters: " + getInvalidParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getInvalidParameters() == null) ? 0 : getInvalidParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetParametersResult == false)
            return false;
        GetParametersResult other = (GetParametersResult) obj;

        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getInvalidParameters() == null ^ this.getInvalidParameters() == null)
            return false;
        if (other.getInvalidParameters() != null
                && other.getInvalidParameters().equals(this.getInvalidParameters()) == false)
            return false;
        return true;
    }
}
