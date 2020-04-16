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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * A function's environment variable settings.
 * </p>
 */
public class AwsLambdaFunctionEnvironment implements Serializable {
    /**
     * <p>
     * Environment variable key-value pairs.
     * </p>
     */
    private java.util.Map<String, String> variables;

    /**
     * <p>
     * An <code>AwsLambdaFunctionEnvironmentError</code> object.
     * </p>
     */
    private AwsLambdaFunctionEnvironmentError error;

    /**
     * <p>
     * Environment variable key-value pairs.
     * </p>
     *
     * @return <p>
     *         Environment variable key-value pairs.
     *         </p>
     */
    public java.util.Map<String, String> getVariables() {
        return variables;
    }

    /**
     * <p>
     * Environment variable key-value pairs.
     * </p>
     *
     * @param variables <p>
     *            Environment variable key-value pairs.
     *            </p>
     */
    public void setVariables(java.util.Map<String, String> variables) {
        this.variables = variables;
    }

    /**
     * <p>
     * Environment variable key-value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param variables <p>
     *            Environment variable key-value pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionEnvironment withVariables(java.util.Map<String, String> variables) {
        this.variables = variables;
        return this;
    }

    /**
     * <p>
     * Environment variable key-value pairs.
     * </p>
     * <p>
     * The method adds a new key-value pair into Variables parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Variables.
     * @param value The corresponding value of the entry to be added into
     *            Variables.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionEnvironment addVariablesEntry(String key, String value) {
        if (null == this.variables) {
            this.variables = new java.util.HashMap<String, String>();
        }
        if (this.variables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.variables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Variables.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public AwsLambdaFunctionEnvironment clearVariablesEntries() {
        this.variables = null;
        return this;
    }

    /**
     * <p>
     * An <code>AwsLambdaFunctionEnvironmentError</code> object.
     * </p>
     *
     * @return <p>
     *         An <code>AwsLambdaFunctionEnvironmentError</code> object.
     *         </p>
     */
    public AwsLambdaFunctionEnvironmentError getError() {
        return error;
    }

    /**
     * <p>
     * An <code>AwsLambdaFunctionEnvironmentError</code> object.
     * </p>
     *
     * @param error <p>
     *            An <code>AwsLambdaFunctionEnvironmentError</code> object.
     *            </p>
     */
    public void setError(AwsLambdaFunctionEnvironmentError error) {
        this.error = error;
    }

    /**
     * <p>
     * An <code>AwsLambdaFunctionEnvironmentError</code> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param error <p>
     *            An <code>AwsLambdaFunctionEnvironmentError</code> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaFunctionEnvironment withError(AwsLambdaFunctionEnvironmentError error) {
        this.error = error;
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
            sb.append("Variables: " + getVariables() + ",");
        if (getError() != null)
            sb.append("Error: " + getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsLambdaFunctionEnvironment == false)
            return false;
        AwsLambdaFunctionEnvironment other = (AwsLambdaFunctionEnvironment) obj;

        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null
                && other.getVariables().equals(this.getVariables()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }
}
