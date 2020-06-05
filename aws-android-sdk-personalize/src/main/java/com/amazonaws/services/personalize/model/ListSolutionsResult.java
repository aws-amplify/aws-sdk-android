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

public class ListSolutionsResult implements Serializable {
    /**
     * <p>
     * A list of the current solutions.
     * </p>
     */
    private java.util.List<SolutionSummary> solutions;

    /**
     * <p>
     * A token for getting the next set of solutions (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the current solutions.
     * </p>
     *
     * @return <p>
     *         A list of the current solutions.
     *         </p>
     */
    public java.util.List<SolutionSummary> getSolutions() {
        return solutions;
    }

    /**
     * <p>
     * A list of the current solutions.
     * </p>
     *
     * @param solutions <p>
     *            A list of the current solutions.
     *            </p>
     */
    public void setSolutions(java.util.Collection<SolutionSummary> solutions) {
        if (solutions == null) {
            this.solutions = null;
            return;
        }

        this.solutions = new java.util.ArrayList<SolutionSummary>(solutions);
    }

    /**
     * <p>
     * A list of the current solutions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param solutions <p>
     *            A list of the current solutions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSolutionsResult withSolutions(SolutionSummary... solutions) {
        if (getSolutions() == null) {
            this.solutions = new java.util.ArrayList<SolutionSummary>(solutions.length);
        }
        for (SolutionSummary value : solutions) {
            this.solutions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the current solutions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param solutions <p>
     *            A list of the current solutions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSolutionsResult withSolutions(java.util.Collection<SolutionSummary> solutions) {
        setSolutions(solutions);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of solutions (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @return <p>
     *         A token for getting the next set of solutions (if they exist).
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of solutions (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token for getting the next set of solutions (if they exist).
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of solutions (if they exist).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token for getting the next set of solutions (if they exist).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSolutionsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getSolutions() != null)
            sb.append("solutions: " + getSolutions() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSolutions() == null) ? 0 : getSolutions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSolutionsResult == false)
            return false;
        ListSolutionsResult other = (ListSolutionsResult) obj;

        if (other.getSolutions() == null ^ this.getSolutions() == null)
            return false;
        if (other.getSolutions() != null
                && other.getSolutions().equals(this.getSolutions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
