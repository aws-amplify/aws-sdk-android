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
 * Information about the build badge for the build project.
 * </p>
 */
public class ProjectBadge implements Serializable {
    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's
     * build badge.
     * </p>
     */
    private Boolean badgeEnabled;

    /**
     * <p>
     * The publicly-accessible URL through which you can access the build badge
     * for your project.
     * </p>
     * <p>
     * The publicly accessible URL through which you can access the build badge
     * for your project.
     * </p>
     */
    private String badgeRequestUrl;

    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's
     * build badge.
     * </p>
     *
     * @return <p>
     *         Set this to true to generate a publicly accessible URL for your
     *         project's build badge.
     *         </p>
     */
    public Boolean isBadgeEnabled() {
        return badgeEnabled;
    }

    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's
     * build badge.
     * </p>
     *
     * @return <p>
     *         Set this to true to generate a publicly accessible URL for your
     *         project's build badge.
     *         </p>
     */
    public Boolean getBadgeEnabled() {
        return badgeEnabled;
    }

    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's
     * build badge.
     * </p>
     *
     * @param badgeEnabled <p>
     *            Set this to true to generate a publicly accessible URL for
     *            your project's build badge.
     *            </p>
     */
    public void setBadgeEnabled(Boolean badgeEnabled) {
        this.badgeEnabled = badgeEnabled;
    }

    /**
     * <p>
     * Set this to true to generate a publicly accessible URL for your project's
     * build badge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param badgeEnabled <p>
     *            Set this to true to generate a publicly accessible URL for
     *            your project's build badge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectBadge withBadgeEnabled(Boolean badgeEnabled) {
        this.badgeEnabled = badgeEnabled;
        return this;
    }

    /**
     * <p>
     * The publicly-accessible URL through which you can access the build badge
     * for your project.
     * </p>
     * <p>
     * The publicly accessible URL through which you can access the build badge
     * for your project.
     * </p>
     *
     * @return <p>
     *         The publicly-accessible URL through which you can access the
     *         build badge for your project.
     *         </p>
     *         <p>
     *         The publicly accessible URL through which you can access the
     *         build badge for your project.
     *         </p>
     */
    public String getBadgeRequestUrl() {
        return badgeRequestUrl;
    }

    /**
     * <p>
     * The publicly-accessible URL through which you can access the build badge
     * for your project.
     * </p>
     * <p>
     * The publicly accessible URL through which you can access the build badge
     * for your project.
     * </p>
     *
     * @param badgeRequestUrl <p>
     *            The publicly-accessible URL through which you can access the
     *            build badge for your project.
     *            </p>
     *            <p>
     *            The publicly accessible URL through which you can access the
     *            build badge for your project.
     *            </p>
     */
    public void setBadgeRequestUrl(String badgeRequestUrl) {
        this.badgeRequestUrl = badgeRequestUrl;
    }

    /**
     * <p>
     * The publicly-accessible URL through which you can access the build badge
     * for your project.
     * </p>
     * <p>
     * The publicly accessible URL through which you can access the build badge
     * for your project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param badgeRequestUrl <p>
     *            The publicly-accessible URL through which you can access the
     *            build badge for your project.
     *            </p>
     *            <p>
     *            The publicly accessible URL through which you can access the
     *            build badge for your project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectBadge withBadgeRequestUrl(String badgeRequestUrl) {
        this.badgeRequestUrl = badgeRequestUrl;
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
        if (getBadgeEnabled() != null)
            sb.append("badgeEnabled: " + getBadgeEnabled() + ",");
        if (getBadgeRequestUrl() != null)
            sb.append("badgeRequestUrl: " + getBadgeRequestUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBadgeEnabled() == null) ? 0 : getBadgeEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getBadgeRequestUrl() == null) ? 0 : getBadgeRequestUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectBadge == false)
            return false;
        ProjectBadge other = (ProjectBadge) obj;

        if (other.getBadgeEnabled() == null ^ this.getBadgeEnabled() == null)
            return false;
        if (other.getBadgeEnabled() != null
                && other.getBadgeEnabled().equals(this.getBadgeEnabled()) == false)
            return false;
        if (other.getBadgeRequestUrl() == null ^ this.getBadgeRequestUrl() == null)
            return false;
        if (other.getBadgeRequestUrl() != null
                && other.getBadgeRequestUrl().equals(this.getBadgeRequestUrl()) == false)
            return false;
        return true;
    }
}
