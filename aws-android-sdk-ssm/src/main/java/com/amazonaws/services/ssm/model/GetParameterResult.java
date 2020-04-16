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

public class GetParameterResult implements Serializable {
    /**
     * <p>
     * Information about a parameter.
     * </p>
     */
    private Parameter parameter;

    /**
     * <p>
     * Information about a parameter.
     * </p>
     *
     * @return <p>
     *         Information about a parameter.
     *         </p>
     */
    public Parameter getParameter() {
        return parameter;
    }

    /**
     * <p>
     * Information about a parameter.
     * </p>
     *
     * @param parameter <p>
     *            Information about a parameter.
     *            </p>
     */
    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    /**
     * <p>
     * Information about a parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameter <p>
     *            Information about a parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetParameterResult withParameter(Parameter parameter) {
        this.parameter = parameter;
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
        if (getParameter() != null)
            sb.append("Parameter: " + getParameter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameter() == null) ? 0 : getParameter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetParameterResult == false)
            return false;
        GetParameterResult other = (GetParameterResult) obj;

        if (other.getParameter() == null ^ this.getParameter() == null)
            return false;
        if (other.getParameter() != null
                && other.getParameter().equals(this.getParameter()) == false)
            return false;
        return true;
    }
}
