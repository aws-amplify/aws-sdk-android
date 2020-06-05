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

public class DescribeSolutionResult implements Serializable {
    /**
     * <p>
     * An object that describes the solution.
     * </p>
     */
    private Solution solution;

    /**
     * <p>
     * An object that describes the solution.
     * </p>
     *
     * @return <p>
     *         An object that describes the solution.
     *         </p>
     */
    public Solution getSolution() {
        return solution;
    }

    /**
     * <p>
     * An object that describes the solution.
     * </p>
     *
     * @param solution <p>
     *            An object that describes the solution.
     *            </p>
     */
    public void setSolution(Solution solution) {
        this.solution = solution;
    }

    /**
     * <p>
     * An object that describes the solution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param solution <p>
     *            An object that describes the solution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSolutionResult withSolution(Solution solution) {
        this.solution = solution;
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
        if (getSolution() != null)
            sb.append("solution: " + getSolution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSolution() == null) ? 0 : getSolution().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSolutionResult == false)
            return false;
        DescribeSolutionResult other = (DescribeSolutionResult) obj;

        if (other.getSolution() == null ^ this.getSolution() == null)
            return false;
        if (other.getSolution() != null && other.getSolution().equals(this.getSolution()) == false)
            return false;
        return true;
    }
}
