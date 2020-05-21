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

public class StopBuildResult implements Serializable {
    /**
     * <p>
     * Information about the build.
     * </p>
     */
    private Build build;

    /**
     * <p>
     * Information about the build.
     * </p>
     *
     * @return <p>
     *         Information about the build.
     *         </p>
     */
    public Build getBuild() {
        return build;
    }

    /**
     * <p>
     * Information about the build.
     * </p>
     *
     * @param build <p>
     *            Information about the build.
     *            </p>
     */
    public void setBuild(Build build) {
        this.build = build;
    }

    /**
     * <p>
     * Information about the build.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param build <p>
     *            Information about the build.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopBuildResult withBuild(Build build) {
        this.build = build;
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
        if (getBuild() != null)
            sb.append("build: " + getBuild());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBuild() == null) ? 0 : getBuild().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopBuildResult == false)
            return false;
        StopBuildResult other = (StopBuildResult) obj;

        if (other.getBuild() == null ^ this.getBuild() == null)
            return false;
        if (other.getBuild() != null && other.getBuild().equals(this.getBuild()) == false)
            return false;
        return true;
    }
}
