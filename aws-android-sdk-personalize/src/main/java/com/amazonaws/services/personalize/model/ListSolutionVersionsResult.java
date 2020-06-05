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

public class ListSolutionVersionsResult implements Serializable {
    /**
     * <p>
     * A list of solution versions describing the version properties.
     * </p>
     */
    private java.util.List<SolutionVersionSummary> solutionVersions;

    /**
     * <p>
     * A token for getting the next set of solution versions (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of solution versions describing the version properties.
     * </p>
     *
     * @return <p>
     *         A list of solution versions describing the version properties.
     *         </p>
     */
    public java.util.List<SolutionVersionSummary> getSolutionVersions() {
        return solutionVersions;
    }

    /**
     * <p>
     * A list of solution versions describing the version properties.
     * </p>
     *
     * @param solutionVersions <p>
     *            A list of solution versions describing the version properties.
     *            </p>
     */
    public void setSolutionVersions(java.util.Collection<SolutionVersionSummary> solutionVersions) {
        if (solutionVersions == null) {
            this.solutionVersions = null;
            return;
        }

        this.solutionVersions = new java.util.ArrayList<SolutionVersionSummary>(solutionVersions);
    }

    /**
     * <p>
     * A list of solution versions describing the version properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param solutionVersions <p>
     *            A list of solution versions describing the version properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSolutionVersionsResult withSolutionVersions(
            SolutionVersionSummary... solutionVersions) {
        if (getSolutionVersions() == null) {
            this.solutionVersions = new java.util.ArrayList<SolutionVersionSummary>(
                    solutionVersions.length);
        }
        for (SolutionVersionSummary value : solutionVersions) {
            this.solutionVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of solution versions describing the version properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param solutionVersions <p>
     *            A list of solution versions describing the version properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSolutionVersionsResult withSolutionVersions(
            java.util.Collection<SolutionVersionSummary> solutionVersions) {
        setSolutionVersions(solutionVersions);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of solution versions (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @return <p>
     *         A token for getting the next set of solution versions (if they
     *         exist).
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of solution versions (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token for getting the next set of solution versions (if they
     *            exist).
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of solution versions (if they exist).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token for getting the next set of solution versions (if they
     *            exist).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSolutionVersionsResult withNextToken(String nextToken) {
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
        if (getSolutionVersions() != null)
            sb.append("solutionVersions: " + getSolutionVersions() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSolutionVersions() == null) ? 0 : getSolutionVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSolutionVersionsResult == false)
            return false;
        ListSolutionVersionsResult other = (ListSolutionVersionsResult) obj;

        if (other.getSolutionVersions() == null ^ this.getSolutionVersions() == null)
            return false;
        if (other.getSolutionVersions() != null
                && other.getSolutionVersions().equals(this.getSolutionVersions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
