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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

public class ListProjectsResult implements Serializable {
    /**
     * <p>
     * A list that summarizes each project in the portal.
     * </p>
     */
    private java.util.List<ProjectSummary> projectSummaries;

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list that summarizes each project in the portal.
     * </p>
     *
     * @return <p>
     *         A list that summarizes each project in the portal.
     *         </p>
     */
    public java.util.List<ProjectSummary> getProjectSummaries() {
        return projectSummaries;
    }

    /**
     * <p>
     * A list that summarizes each project in the portal.
     * </p>
     *
     * @param projectSummaries <p>
     *            A list that summarizes each project in the portal.
     *            </p>
     */
    public void setProjectSummaries(java.util.Collection<ProjectSummary> projectSummaries) {
        if (projectSummaries == null) {
            this.projectSummaries = null;
            return;
        }

        this.projectSummaries = new java.util.ArrayList<ProjectSummary>(projectSummaries);
    }

    /**
     * <p>
     * A list that summarizes each project in the portal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param projectSummaries <p>
     *            A list that summarizes each project in the portal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProjectsResult withProjectSummaries(ProjectSummary... projectSummaries) {
        if (getProjectSummaries() == null) {
            this.projectSummaries = new java.util.ArrayList<ProjectSummary>(projectSummaries.length);
        }
        for (ProjectSummary value : projectSummaries) {
            this.projectSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list that summarizes each project in the portal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param projectSummaries <p>
     *            A list that summarizes each project in the portal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProjectsResult withProjectSummaries(
            java.util.Collection<ProjectSummary> projectSummaries) {
        setProjectSummaries(projectSummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     *
     * @return <p>
     *         The token for the next set of results, or null if there are no
     *         additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results, or null if there are no
     *            additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results, or null if there are no
     *            additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProjectsResult withNextToken(String nextToken) {
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
        if (getProjectSummaries() != null)
            sb.append("projectSummaries: " + getProjectSummaries() + ",");
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
                + ((getProjectSummaries() == null) ? 0 : getProjectSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProjectsResult == false)
            return false;
        ListProjectsResult other = (ListProjectsResult) obj;

        if (other.getProjectSummaries() == null ^ this.getProjectSummaries() == null)
            return false;
        if (other.getProjectSummaries() != null
                && other.getProjectSummaries().equals(this.getProjectSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
