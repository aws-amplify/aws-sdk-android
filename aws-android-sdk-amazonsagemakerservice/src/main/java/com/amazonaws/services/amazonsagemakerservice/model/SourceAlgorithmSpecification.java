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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * A list of algorithms that were used to create a model package.
 * </p>
 */
public class SourceAlgorithmSpecification implements Serializable {
    /**
     * <p>
     * A list of the algorithms that were used to create a model package.
     * </p>
     */
    private java.util.List<SourceAlgorithm> sourceAlgorithms;

    /**
     * <p>
     * A list of the algorithms that were used to create a model package.
     * </p>
     *
     * @return <p>
     *         A list of the algorithms that were used to create a model
     *         package.
     *         </p>
     */
    public java.util.List<SourceAlgorithm> getSourceAlgorithms() {
        return sourceAlgorithms;
    }

    /**
     * <p>
     * A list of the algorithms that were used to create a model package.
     * </p>
     *
     * @param sourceAlgorithms <p>
     *            A list of the algorithms that were used to create a model
     *            package.
     *            </p>
     */
    public void setSourceAlgorithms(java.util.Collection<SourceAlgorithm> sourceAlgorithms) {
        if (sourceAlgorithms == null) {
            this.sourceAlgorithms = null;
            return;
        }

        this.sourceAlgorithms = new java.util.ArrayList<SourceAlgorithm>(sourceAlgorithms);
    }

    /**
     * <p>
     * A list of the algorithms that were used to create a model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceAlgorithms <p>
     *            A list of the algorithms that were used to create a model
     *            package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceAlgorithmSpecification withSourceAlgorithms(SourceAlgorithm... sourceAlgorithms) {
        if (getSourceAlgorithms() == null) {
            this.sourceAlgorithms = new java.util.ArrayList<SourceAlgorithm>(
                    sourceAlgorithms.length);
        }
        for (SourceAlgorithm value : sourceAlgorithms) {
            this.sourceAlgorithms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the algorithms that were used to create a model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceAlgorithms <p>
     *            A list of the algorithms that were used to create a model
     *            package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceAlgorithmSpecification withSourceAlgorithms(
            java.util.Collection<SourceAlgorithm> sourceAlgorithms) {
        setSourceAlgorithms(sourceAlgorithms);
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
        if (getSourceAlgorithms() != null)
            sb.append("SourceAlgorithms: " + getSourceAlgorithms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceAlgorithms() == null) ? 0 : getSourceAlgorithms().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceAlgorithmSpecification == false)
            return false;
        SourceAlgorithmSpecification other = (SourceAlgorithmSpecification) obj;

        if (other.getSourceAlgorithms() == null ^ this.getSourceAlgorithms() == null)
            return false;
        if (other.getSourceAlgorithms() != null
                && other.getSourceAlgorithms().equals(this.getSourceAlgorithms()) == false)
            return false;
        return true;
    }
}
