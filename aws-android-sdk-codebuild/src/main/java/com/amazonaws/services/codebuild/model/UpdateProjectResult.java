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

public class UpdateProjectResult implements Serializable {
    /**
     * <p>
     * Information about the build project that was changed.
     * </p>
     */
    private Project project;

    /**
     * <p>
     * Information about the build project that was changed.
     * </p>
     *
     * @return <p>
     *         Information about the build project that was changed.
     *         </p>
     */
    public Project getProject() {
        return project;
    }

    /**
     * <p>
     * Information about the build project that was changed.
     * </p>
     *
     * @param project <p>
     *            Information about the build project that was changed.
     *            </p>
     */
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * <p>
     * Information about the build project that was changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param project <p>
     *            Information about the build project that was changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProjectResult withProject(Project project) {
        this.project = project;
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
        if (getProject() != null)
            sb.append("project: " + getProject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProjectResult == false)
            return false;
        UpdateProjectResult other = (UpdateProjectResult) obj;

        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        return true;
    }
}
