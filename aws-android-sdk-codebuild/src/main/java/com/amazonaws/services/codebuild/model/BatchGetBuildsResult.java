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

public class BatchGetBuildsResult implements Serializable {
    /**
     * <p>
     * Information about the requested builds.
     * </p>
     */
    private java.util.List<Build> builds;

    /**
     * <p>
     * The IDs of builds for which information could not be found.
     * </p>
     */
    private java.util.List<String> buildsNotFound;

    /**
     * <p>
     * Information about the requested builds.
     * </p>
     *
     * @return <p>
     *         Information about the requested builds.
     *         </p>
     */
    public java.util.List<Build> getBuilds() {
        return builds;
    }

    /**
     * <p>
     * Information about the requested builds.
     * </p>
     *
     * @param builds <p>
     *            Information about the requested builds.
     *            </p>
     */
    public void setBuilds(java.util.Collection<Build> builds) {
        if (builds == null) {
            this.builds = null;
            return;
        }

        this.builds = new java.util.ArrayList<Build>(builds);
    }

    /**
     * <p>
     * Information about the requested builds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param builds <p>
     *            Information about the requested builds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetBuildsResult withBuilds(Build... builds) {
        if (getBuilds() == null) {
            this.builds = new java.util.ArrayList<Build>(builds.length);
        }
        for (Build value : builds) {
            this.builds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the requested builds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param builds <p>
     *            Information about the requested builds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetBuildsResult withBuilds(java.util.Collection<Build> builds) {
        setBuilds(builds);
        return this;
    }

    /**
     * <p>
     * The IDs of builds for which information could not be found.
     * </p>
     *
     * @return <p>
     *         The IDs of builds for which information could not be found.
     *         </p>
     */
    public java.util.List<String> getBuildsNotFound() {
        return buildsNotFound;
    }

    /**
     * <p>
     * The IDs of builds for which information could not be found.
     * </p>
     *
     * @param buildsNotFound <p>
     *            The IDs of builds for which information could not be found.
     *            </p>
     */
    public void setBuildsNotFound(java.util.Collection<String> buildsNotFound) {
        if (buildsNotFound == null) {
            this.buildsNotFound = null;
            return;
        }

        this.buildsNotFound = new java.util.ArrayList<String>(buildsNotFound);
    }

    /**
     * <p>
     * The IDs of builds for which information could not be found.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buildsNotFound <p>
     *            The IDs of builds for which information could not be found.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetBuildsResult withBuildsNotFound(String... buildsNotFound) {
        if (getBuildsNotFound() == null) {
            this.buildsNotFound = new java.util.ArrayList<String>(buildsNotFound.length);
        }
        for (String value : buildsNotFound) {
            this.buildsNotFound.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of builds for which information could not be found.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buildsNotFound <p>
     *            The IDs of builds for which information could not be found.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetBuildsResult withBuildsNotFound(java.util.Collection<String> buildsNotFound) {
        setBuildsNotFound(buildsNotFound);
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
        if (getBuilds() != null)
            sb.append("builds: " + getBuilds() + ",");
        if (getBuildsNotFound() != null)
            sb.append("buildsNotFound: " + getBuildsNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBuilds() == null) ? 0 : getBuilds().hashCode());
        hashCode = prime * hashCode
                + ((getBuildsNotFound() == null) ? 0 : getBuildsNotFound().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetBuildsResult == false)
            return false;
        BatchGetBuildsResult other = (BatchGetBuildsResult) obj;

        if (other.getBuilds() == null ^ this.getBuilds() == null)
            return false;
        if (other.getBuilds() != null && other.getBuilds().equals(this.getBuilds()) == false)
            return false;
        if (other.getBuildsNotFound() == null ^ this.getBuildsNotFound() == null)
            return false;
        if (other.getBuildsNotFound() != null
                && other.getBuildsNotFound().equals(this.getBuildsNotFound()) == false)
            return false;
        return true;
    }
}
