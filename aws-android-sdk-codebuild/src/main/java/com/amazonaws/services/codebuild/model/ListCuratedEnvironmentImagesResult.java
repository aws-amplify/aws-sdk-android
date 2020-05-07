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

public class ListCuratedEnvironmentImagesResult implements Serializable {
    /**
     * <p>
     * Information about supported platforms for Docker images that are managed
     * by AWS CodeBuild.
     * </p>
     */
    private java.util.List<EnvironmentPlatform> platforms;

    /**
     * <p>
     * Information about supported platforms for Docker images that are managed
     * by AWS CodeBuild.
     * </p>
     *
     * @return <p>
     *         Information about supported platforms for Docker images that are
     *         managed by AWS CodeBuild.
     *         </p>
     */
    public java.util.List<EnvironmentPlatform> getPlatforms() {
        return platforms;
    }

    /**
     * <p>
     * Information about supported platforms for Docker images that are managed
     * by AWS CodeBuild.
     * </p>
     *
     * @param platforms <p>
     *            Information about supported platforms for Docker images that
     *            are managed by AWS CodeBuild.
     *            </p>
     */
    public void setPlatforms(java.util.Collection<EnvironmentPlatform> platforms) {
        if (platforms == null) {
            this.platforms = null;
            return;
        }

        this.platforms = new java.util.ArrayList<EnvironmentPlatform>(platforms);
    }

    /**
     * <p>
     * Information about supported platforms for Docker images that are managed
     * by AWS CodeBuild.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platforms <p>
     *            Information about supported platforms for Docker images that
     *            are managed by AWS CodeBuild.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCuratedEnvironmentImagesResult withPlatforms(EnvironmentPlatform... platforms) {
        if (getPlatforms() == null) {
            this.platforms = new java.util.ArrayList<EnvironmentPlatform>(platforms.length);
        }
        for (EnvironmentPlatform value : platforms) {
            this.platforms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about supported platforms for Docker images that are managed
     * by AWS CodeBuild.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platforms <p>
     *            Information about supported platforms for Docker images that
     *            are managed by AWS CodeBuild.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCuratedEnvironmentImagesResult withPlatforms(
            java.util.Collection<EnvironmentPlatform> platforms) {
        setPlatforms(platforms);
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
        if (getPlatforms() != null)
            sb.append("platforms: " + getPlatforms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlatforms() == null) ? 0 : getPlatforms().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCuratedEnvironmentImagesResult == false)
            return false;
        ListCuratedEnvironmentImagesResult other = (ListCuratedEnvironmentImagesResult) obj;

        if (other.getPlatforms() == null ^ this.getPlatforms() == null)
            return false;
        if (other.getPlatforms() != null
                && other.getPlatforms().equals(this.getPlatforms()) == false)
            return false;
        return true;
    }
}
