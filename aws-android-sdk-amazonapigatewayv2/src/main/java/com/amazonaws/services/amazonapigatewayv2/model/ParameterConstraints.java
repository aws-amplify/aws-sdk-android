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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

/**
 * <p>
 * Validation constraints imposed on parameters of a request (path, query
 * string, headers).
 * </p>
 */
public class ParameterConstraints implements Serializable {
    /**
     * <p>
     * Whether or not the parameter is required.
     * </p>
     */
    private Boolean required;

    /**
     * <p>
     * Whether or not the parameter is required.
     * </p>
     *
     * @return <p>
     *         Whether or not the parameter is required.
     *         </p>
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * <p>
     * Whether or not the parameter is required.
     * </p>
     *
     * @return <p>
     *         Whether or not the parameter is required.
     *         </p>
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * <p>
     * Whether or not the parameter is required.
     * </p>
     *
     * @param required <p>
     *            Whether or not the parameter is required.
     *            </p>
     */
    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * <p>
     * Whether or not the parameter is required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param required <p>
     *            Whether or not the parameter is required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterConstraints withRequired(Boolean required) {
        this.required = required;
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
        if (getRequired() != null)
            sb.append("Required: " + getRequired());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequired() == null) ? 0 : getRequired().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterConstraints == false)
            return false;
        ParameterConstraints other = (ParameterConstraints) obj;

        if (other.getRequired() == null ^ this.getRequired() == null)
            return false;
        if (other.getRequired() != null && other.getRequired().equals(this.getRequired()) == false)
            return false;
        return true;
    }
}
