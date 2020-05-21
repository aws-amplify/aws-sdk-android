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
 * Information about a Docker image that is managed by AWS CodeBuild.
 * </p>
 */
public class EnvironmentImage implements Serializable {
    /**
     * <p>
     * The name of the Docker image.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The description of the Docker image.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A list of environment image versions.
     * </p>
     */
    private java.util.List<String> versions;

    /**
     * <p>
     * The name of the Docker image.
     * </p>
     *
     * @return <p>
     *         The name of the Docker image.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the Docker image.
     * </p>
     *
     * @param name <p>
     *            The name of the Docker image.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Docker image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the Docker image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentImage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the Docker image.
     * </p>
     *
     * @return <p>
     *         The description of the Docker image.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the Docker image.
     * </p>
     *
     * @param description <p>
     *            The description of the Docker image.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the Docker image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the Docker image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentImage withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A list of environment image versions.
     * </p>
     *
     * @return <p>
     *         A list of environment image versions.
     *         </p>
     */
    public java.util.List<String> getVersions() {
        return versions;
    }

    /**
     * <p>
     * A list of environment image versions.
     * </p>
     *
     * @param versions <p>
     *            A list of environment image versions.
     *            </p>
     */
    public void setVersions(java.util.Collection<String> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<String>(versions);
    }

    /**
     * <p>
     * A list of environment image versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versions <p>
     *            A list of environment image versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentImage withVersions(String... versions) {
        if (getVersions() == null) {
            this.versions = new java.util.ArrayList<String>(versions.length);
        }
        for (String value : versions) {
            this.versions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of environment image versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versions <p>
     *            A list of environment image versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentImage withVersions(java.util.Collection<String> versions) {
        setVersions(versions);
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getVersions() != null)
            sb.append("versions: " + getVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentImage == false)
            return false;
        EnvironmentImage other = (EnvironmentImage) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        return true;
    }
}
