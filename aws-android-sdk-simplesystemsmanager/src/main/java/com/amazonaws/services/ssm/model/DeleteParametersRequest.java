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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Delete a list of parameters.
 * </p>
 */
public class DeleteParametersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The names of the parameters to delete.
     * </p>
     */
    private java.util.List<String> names;

    /**
     * <p>
     * The names of the parameters to delete.
     * </p>
     *
     * @return <p>
     *         The names of the parameters to delete.
     *         </p>
     */
    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * The names of the parameters to delete.
     * </p>
     *
     * @param names <p>
     *            The names of the parameters to delete.
     *            </p>
     */
    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * The names of the parameters to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param names <p>
     *            The names of the parameters to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteParametersRequest withNames(String... names) {
        if (getNames() == null) {
            this.names = new java.util.ArrayList<String>(names.length);
        }
        for (String value : names) {
            this.names.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the parameters to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param names <p>
     *            The names of the parameters to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteParametersRequest withNames(java.util.Collection<String> names) {
        setNames(names);
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
        if (getNames() != null)
            sb.append("Names: " + getNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteParametersRequest == false)
            return false;
        DeleteParametersRequest other = (DeleteParametersRequest) obj;

        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        return true;
    }
}
