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

public class DeleteParametersResult implements Serializable {
    /**
     * <p>
     * The names of the deleted parameters.
     * </p>
     */
    private java.util.List<String> deletedParameters;

    /**
     * <p>
     * The names of parameters that weren't deleted because the parameters are
     * not valid.
     * </p>
     */
    private java.util.List<String> invalidParameters;

    /**
     * <p>
     * The names of the deleted parameters.
     * </p>
     *
     * @return <p>
     *         The names of the deleted parameters.
     *         </p>
     */
    public java.util.List<String> getDeletedParameters() {
        return deletedParameters;
    }

    /**
     * <p>
     * The names of the deleted parameters.
     * </p>
     *
     * @param deletedParameters <p>
     *            The names of the deleted parameters.
     *            </p>
     */
    public void setDeletedParameters(java.util.Collection<String> deletedParameters) {
        if (deletedParameters == null) {
            this.deletedParameters = null;
            return;
        }

        this.deletedParameters = new java.util.ArrayList<String>(deletedParameters);
    }

    /**
     * <p>
     * The names of the deleted parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletedParameters <p>
     *            The names of the deleted parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteParametersResult withDeletedParameters(String... deletedParameters) {
        if (getDeletedParameters() == null) {
            this.deletedParameters = new java.util.ArrayList<String>(deletedParameters.length);
        }
        for (String value : deletedParameters) {
            this.deletedParameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the deleted parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletedParameters <p>
     *            The names of the deleted parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteParametersResult withDeletedParameters(
            java.util.Collection<String> deletedParameters) {
        setDeletedParameters(deletedParameters);
        return this;
    }

    /**
     * <p>
     * The names of parameters that weren't deleted because the parameters are
     * not valid.
     * </p>
     *
     * @return <p>
     *         The names of parameters that weren't deleted because the
     *         parameters are not valid.
     *         </p>
     */
    public java.util.List<String> getInvalidParameters() {
        return invalidParameters;
    }

    /**
     * <p>
     * The names of parameters that weren't deleted because the parameters are
     * not valid.
     * </p>
     *
     * @param invalidParameters <p>
     *            The names of parameters that weren't deleted because the
     *            parameters are not valid.
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
     * The names of parameters that weren't deleted because the parameters are
     * not valid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invalidParameters <p>
     *            The names of parameters that weren't deleted because the
     *            parameters are not valid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteParametersResult withInvalidParameters(String... invalidParameters) {
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
     * The names of parameters that weren't deleted because the parameters are
     * not valid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invalidParameters <p>
     *            The names of parameters that weren't deleted because the
     *            parameters are not valid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteParametersResult withInvalidParameters(
            java.util.Collection<String> invalidParameters) {
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
        if (getDeletedParameters() != null)
            sb.append("DeletedParameters: " + getDeletedParameters() + ",");
        if (getInvalidParameters() != null)
            sb.append("InvalidParameters: " + getInvalidParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeletedParameters() == null) ? 0 : getDeletedParameters().hashCode());
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

        if (obj instanceof DeleteParametersResult == false)
            return false;
        DeleteParametersResult other = (DeleteParametersResult) obj;

        if (other.getDeletedParameters() == null ^ this.getDeletedParameters() == null)
            return false;
        if (other.getDeletedParameters() != null
                && other.getDeletedParameters().equals(this.getDeletedParameters()) == false)
            return false;
        if (other.getInvalidParameters() == null ^ this.getInvalidParameters() == null)
            return false;
        if (other.getInvalidParameters() != null
                && other.getInvalidParameters().equals(this.getInvalidParameters()) == false)
            return false;
        return true;
    }
}
