/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class DescribeProjectsResult implements Serializable {
    /**
     * <p>
     * A list of project descriptions. The list is sorted by the date and time
     * the projects are created.
     * </p>
     */
    private java.util.List<ProjectDescription> projectDescriptions;

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to
     * retrieve), Amazon Rekognition Custom Labels returns a pagination token in
     * the response. You can use this pagination token to retrieve the next set
     * of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of project descriptions. The list is sorted by the date and time
     * the projects are created.
     * </p>
     *
     * @return <p>
     *         A list of project descriptions. The list is sorted by the date
     *         and time the projects are created.
     *         </p>
     */
    public java.util.List<ProjectDescription> getProjectDescriptions() {
        return projectDescriptions;
    }

    /**
     * <p>
     * A list of project descriptions. The list is sorted by the date and time
     * the projects are created.
     * </p>
     *
     * @param projectDescriptions <p>
     *            A list of project descriptions. The list is sorted by the date
     *            and time the projects are created.
     *            </p>
     */
    public void setProjectDescriptions(java.util.Collection<ProjectDescription> projectDescriptions) {
        if (projectDescriptions == null) {
            this.projectDescriptions = null;
            return;
        }

        this.projectDescriptions = new java.util.ArrayList<ProjectDescription>(projectDescriptions);
    }

    /**
     * <p>
     * A list of project descriptions. The list is sorted by the date and time
     * the projects are created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param projectDescriptions <p>
     *            A list of project descriptions. The list is sorted by the date
     *            and time the projects are created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProjectsResult withProjectDescriptions(ProjectDescription... projectDescriptions) {
        if (getProjectDescriptions() == null) {
            this.projectDescriptions = new java.util.ArrayList<ProjectDescription>(
                    projectDescriptions.length);
        }
        for (ProjectDescription value : projectDescriptions) {
            this.projectDescriptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of project descriptions. The list is sorted by the date and time
     * the projects are created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param projectDescriptions <p>
     *            A list of project descriptions. The list is sorted by the date
     *            and time the projects are created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProjectsResult withProjectDescriptions(
            java.util.Collection<ProjectDescription> projectDescriptions) {
        setProjectDescriptions(projectDescriptions);
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to
     * retrieve), Amazon Rekognition Custom Labels returns a pagination token in
     * the response. You can use this pagination token to retrieve the next set
     * of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         If the previous response was incomplete (because there is more
     *         results to retrieve), Amazon Rekognition Custom Labels returns a
     *         pagination token in the response. You can use this pagination
     *         token to retrieve the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to
     * retrieve), Amazon Rekognition Custom Labels returns a pagination token in
     * the response. You can use this pagination token to retrieve the next set
     * of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param nextToken <p>
     *            If the previous response was incomplete (because there is more
     *            results to retrieve), Amazon Rekognition Custom Labels returns
     *            a pagination token in the response. You can use this
     *            pagination token to retrieve the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to
     * retrieve), Amazon Rekognition Custom Labels returns a pagination token in
     * the response. You can use this pagination token to retrieve the next set
     * of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param nextToken <p>
     *            If the previous response was incomplete (because there is more
     *            results to retrieve), Amazon Rekognition Custom Labels returns
     *            a pagination token in the response. You can use this
     *            pagination token to retrieve the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProjectsResult withNextToken(String nextToken) {
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
        if (getProjectDescriptions() != null)
            sb.append("ProjectDescriptions: " + getProjectDescriptions() + ",");
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
                + ((getProjectDescriptions() == null) ? 0 : getProjectDescriptions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProjectsResult == false)
            return false;
        DescribeProjectsResult other = (DescribeProjectsResult) obj;

        if (other.getProjectDescriptions() == null ^ this.getProjectDescriptions() == null)
            return false;
        if (other.getProjectDescriptions() != null
                && other.getProjectDescriptions().equals(this.getProjectDescriptions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
