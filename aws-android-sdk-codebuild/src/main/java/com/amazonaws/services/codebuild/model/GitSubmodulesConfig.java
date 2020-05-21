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

/**
 * <p>
 * Information about the Git submodules configuration for an AWS CodeBuild build
 * project.
 * </p>
 */
public class GitSubmodulesConfig implements Serializable {
    /**
     * <p>
     * Set to true to fetch Git submodules for your AWS CodeBuild build project.
     * </p>
     */
    private Boolean fetchSubmodules;

    /**
     * <p>
     * Set to true to fetch Git submodules for your AWS CodeBuild build project.
     * </p>
     *
     * @return <p>
     *         Set to true to fetch Git submodules for your AWS CodeBuild build
     *         project.
     *         </p>
     */
    public Boolean isFetchSubmodules() {
        return fetchSubmodules;
    }

    /**
     * <p>
     * Set to true to fetch Git submodules for your AWS CodeBuild build project.
     * </p>
     *
     * @return <p>
     *         Set to true to fetch Git submodules for your AWS CodeBuild build
     *         project.
     *         </p>
     */
    public Boolean getFetchSubmodules() {
        return fetchSubmodules;
    }

    /**
     * <p>
     * Set to true to fetch Git submodules for your AWS CodeBuild build project.
     * </p>
     *
     * @param fetchSubmodules <p>
     *            Set to true to fetch Git submodules for your AWS CodeBuild
     *            build project.
     *            </p>
     */
    public void setFetchSubmodules(Boolean fetchSubmodules) {
        this.fetchSubmodules = fetchSubmodules;
    }

    /**
     * <p>
     * Set to true to fetch Git submodules for your AWS CodeBuild build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fetchSubmodules <p>
     *            Set to true to fetch Git submodules for your AWS CodeBuild
     *            build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GitSubmodulesConfig withFetchSubmodules(Boolean fetchSubmodules) {
        this.fetchSubmodules = fetchSubmodules;
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
        if (getFetchSubmodules() != null)
            sb.append("fetchSubmodules: " + getFetchSubmodules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFetchSubmodules() == null) ? 0 : getFetchSubmodules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GitSubmodulesConfig == false)
            return false;
        GitSubmodulesConfig other = (GitSubmodulesConfig) obj;

        if (other.getFetchSubmodules() == null ^ this.getFetchSubmodules() == null)
            return false;
        if (other.getFetchSubmodules() != null
                && other.getFetchSubmodules().equals(this.getFetchSubmodules()) == false)
            return false;
        return true;
    }
}
