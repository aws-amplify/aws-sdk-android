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

/**
 * <p>
 * Contains an AWS IoT SiteWise Monitor resource ID for a portal or project.
 * </p>
 */
public class Resource implements Serializable {
    /**
     * <p>
     * A portal resource.
     * </p>
     */
    private PortalResource portal;

    /**
     * <p>
     * A project resource.
     * </p>
     */
    private ProjectResource project;

    /**
     * <p>
     * A portal resource.
     * </p>
     *
     * @return <p>
     *         A portal resource.
     *         </p>
     */
    public PortalResource getPortal() {
        return portal;
    }

    /**
     * <p>
     * A portal resource.
     * </p>
     *
     * @param portal <p>
     *            A portal resource.
     *            </p>
     */
    public void setPortal(PortalResource portal) {
        this.portal = portal;
    }

    /**
     * <p>
     * A portal resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portal <p>
     *            A portal resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withPortal(PortalResource portal) {
        this.portal = portal;
        return this;
    }

    /**
     * <p>
     * A project resource.
     * </p>
     *
     * @return <p>
     *         A project resource.
     *         </p>
     */
    public ProjectResource getProject() {
        return project;
    }

    /**
     * <p>
     * A project resource.
     * </p>
     *
     * @param project <p>
     *            A project resource.
     *            </p>
     */
    public void setProject(ProjectResource project) {
        this.project = project;
    }

    /**
     * <p>
     * A project resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param project <p>
     *            A project resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withProject(ProjectResource project) {
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
        if (getPortal() != null)
            sb.append("portal: " + getPortal() + ",");
        if (getProject() != null)
            sb.append("project: " + getProject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortal() == null) ? 0 : getPortal().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;

        if (other.getPortal() == null ^ this.getPortal() == null)
            return false;
        if (other.getPortal() != null && other.getPortal().equals(this.getPortal()) == false)
            return false;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        return true;
    }
}
