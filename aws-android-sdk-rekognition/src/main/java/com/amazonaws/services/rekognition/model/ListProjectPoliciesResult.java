/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

public class ListProjectPoliciesResult implements Serializable {
    /**
     * <p>
     * A list of project policies attached to the project.
     * </p>
     */
    private java.util.List<ProjectPolicy> projectPolicies;

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition returns this token that
     * you can use in the subsequent request to retrieve the next set of project
     * policies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of project policies attached to the project.
     * </p>
     *
     * @return <p>
     *         A list of project policies attached to the project.
     *         </p>
     */
    public java.util.List<ProjectPolicy> getProjectPolicies() {
        return projectPolicies;
    }

    /**
     * <p>
     * A list of project policies attached to the project.
     * </p>
     *
     * @param projectPolicies <p>
     *            A list of project policies attached to the project.
     *            </p>
     */
    public void setProjectPolicies(java.util.Collection<ProjectPolicy> projectPolicies) {
        if (projectPolicies == null) {
            this.projectPolicies = null;
            return;
        }

        this.projectPolicies = new java.util.ArrayList<ProjectPolicy>(projectPolicies);
    }

    /**
     * <p>
     * A list of project policies attached to the project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param projectPolicies <p>
     *            A list of project policies attached to the project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProjectPoliciesResult withProjectPolicies(ProjectPolicy... projectPolicies) {
        if (getProjectPolicies() == null) {
            this.projectPolicies = new java.util.ArrayList<ProjectPolicy>(projectPolicies.length);
        }
        for (ProjectPolicy value : projectPolicies) {
            this.projectPolicies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of project policies attached to the project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param projectPolicies <p>
     *            A list of project policies attached to the project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProjectPoliciesResult withProjectPolicies(
            java.util.Collection<ProjectPolicy> projectPolicies) {
        setProjectPolicies(projectPolicies);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition returns this token that
     * you can use in the subsequent request to retrieve the next set of project
     * policies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon Rekognition returns this
     *         token that you can use in the subsequent request to retrieve the
     *         next set of project policies.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition returns this token that
     * you can use in the subsequent request to retrieve the next set of project
     * policies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon Rekognition returns this
     *            token that you can use in the subsequent request to retrieve
     *            the next set of project policies.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition returns this token that
     * you can use in the subsequent request to retrieve the next set of project
     * policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon Rekognition returns this
     *            token that you can use in the subsequent request to retrieve
     *            the next set of project policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProjectPoliciesResult withNextToken(String nextToken) {
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
        if (getProjectPolicies() != null)
            sb.append("ProjectPolicies: " + getProjectPolicies() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProjectPolicies() == null) ? 0 : getProjectPolicies().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProjectPoliciesResult == false)
            return false;
        ListProjectPoliciesResult other = (ListProjectPoliciesResult) obj;

        if (other.getProjectPolicies() == null ^ this.getProjectPolicies() == null)
            return false;
        if (other.getProjectPolicies() != null
                && other.getProjectPolicies().equals(this.getProjectPolicies()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
