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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * Details on a data volume from another container in the same task definition.
 * </p>
 */
public class VolumeFrom implements Serializable {
    /**
     * <p>
     * The name of another container within the same task definition from which
     * to mount volumes.
     * </p>
     */
    private String sourceContainer;

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to
     * the volume. If this value is <code>false</code>, then the container can
     * write to the volume. The default value is <code>false</code>.
     * </p>
     */
    private Boolean readOnly;

    /**
     * <p>
     * The name of another container within the same task definition from which
     * to mount volumes.
     * </p>
     *
     * @return <p>
     *         The name of another container within the same task definition
     *         from which to mount volumes.
     *         </p>
     */
    public String getSourceContainer() {
        return sourceContainer;
    }

    /**
     * <p>
     * The name of another container within the same task definition from which
     * to mount volumes.
     * </p>
     *
     * @param sourceContainer <p>
     *            The name of another container within the same task definition
     *            from which to mount volumes.
     *            </p>
     */
    public void setSourceContainer(String sourceContainer) {
        this.sourceContainer = sourceContainer;
    }

    /**
     * <p>
     * The name of another container within the same task definition from which
     * to mount volumes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceContainer <p>
     *            The name of another container within the same task definition
     *            from which to mount volumes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeFrom withSourceContainer(String sourceContainer) {
        this.sourceContainer = sourceContainer;
        return this;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to
     * the volume. If this value is <code>false</code>, then the container can
     * write to the volume. The default value is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         If this value is <code>true</code>, the container has read-only
     *         access to the volume. If this value is <code>false</code>, then
     *         the container can write to the volume. The default value is
     *         <code>false</code>.
     *         </p>
     */
    public Boolean isReadOnly() {
        return readOnly;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to
     * the volume. If this value is <code>false</code>, then the container can
     * write to the volume. The default value is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         If this value is <code>true</code>, the container has read-only
     *         access to the volume. If this value is <code>false</code>, then
     *         the container can write to the volume. The default value is
     *         <code>false</code>.
     *         </p>
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to
     * the volume. If this value is <code>false</code>, then the container can
     * write to the volume. The default value is <code>false</code>.
     * </p>
     *
     * @param readOnly <p>
     *            If this value is <code>true</code>, the container has
     *            read-only access to the volume. If this value is
     *            <code>false</code>, then the container can write to the
     *            volume. The default value is <code>false</code>.
     *            </p>
     */
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to
     * the volume. If this value is <code>false</code>, then the container can
     * write to the volume. The default value is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readOnly <p>
     *            If this value is <code>true</code>, the container has
     *            read-only access to the volume. If this value is
     *            <code>false</code>, then the container can write to the
     *            volume. The default value is <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeFrom withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
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
        if (getSourceContainer() != null)
            sb.append("sourceContainer: " + getSourceContainer() + ",");
        if (getReadOnly() != null)
            sb.append("readOnly: " + getReadOnly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceContainer() == null) ? 0 : getSourceContainer().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeFrom == false)
            return false;
        VolumeFrom other = (VolumeFrom) obj;

        if (other.getSourceContainer() == null ^ this.getSourceContainer() == null)
            return false;
        if (other.getSourceContainer() != null
                && other.getSourceContainer().equals(this.getSourceContainer()) == false)
            return false;
        if (other.getReadOnly() == null ^ this.getReadOnly() == null)
            return false;
        if (other.getReadOnly() != null && other.getReadOnly().equals(this.getReadOnly()) == false)
            return false;
        return true;
    }
}
