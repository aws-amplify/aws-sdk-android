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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Resets the cache for a project.
 * </p>
 */
public class InvalidateProjectCacheRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the AWS CodeBuild build project that the cache is reset for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String projectName;

    /**
     * <p>
     * The name of the AWS CodeBuild build project that the cache is reset for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The name of the AWS CodeBuild build project that the cache is
     *         reset for.
     *         </p>
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * <p>
     * The name of the AWS CodeBuild build project that the cache is reset for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param projectName <p>
     *            The name of the AWS CodeBuild build project that the cache is
     *            reset for.
     *            </p>
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the AWS CodeBuild build project that the cache is reset for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param projectName <p>
     *            The name of the AWS CodeBuild build project that the cache is
     *            reset for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvalidateProjectCacheRequest withProjectName(String projectName) {
        this.projectName = projectName;
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
        if (getProjectName() != null)
            sb.append("projectName: " + getProjectName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvalidateProjectCacheRequest == false)
            return false;
        InvalidateProjectCacheRequest other = (InvalidateProjectCacheRequest) obj;

        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null
                && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        return true;
    }
}
