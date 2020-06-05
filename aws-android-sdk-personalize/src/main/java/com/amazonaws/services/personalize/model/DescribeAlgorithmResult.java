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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

public class DescribeAlgorithmResult implements Serializable {
    /**
     * <p>
     * A listing of the properties of the algorithm.
     * </p>
     */
    private Algorithm algorithm;

    /**
     * <p>
     * A listing of the properties of the algorithm.
     * </p>
     *
     * @return <p>
     *         A listing of the properties of the algorithm.
     *         </p>
     */
    public Algorithm getAlgorithm() {
        return algorithm;
    }

    /**
     * <p>
     * A listing of the properties of the algorithm.
     * </p>
     *
     * @param algorithm <p>
     *            A listing of the properties of the algorithm.
     *            </p>
     */
    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * <p>
     * A listing of the properties of the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param algorithm <p>
     *            A listing of the properties of the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlgorithmResult withAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
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
        if (getAlgorithm() != null)
            sb.append("algorithm: " + getAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAlgorithmResult == false)
            return false;
        DescribeAlgorithmResult other = (DescribeAlgorithmResult) obj;

        if (other.getAlgorithm() == null ^ this.getAlgorithm() == null)
            return false;
        if (other.getAlgorithm() != null
                && other.getAlgorithm().equals(this.getAlgorithm()) == false)
            return false;
        return true;
    }
}
