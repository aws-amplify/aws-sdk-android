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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class DescribeMountTargetsResult implements Serializable {
    /**
     * <p>
     * If the request included the <code>Marker</code>, the response returns
     * that value in this field.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Returns the file system's mount targets as an array of
     * <code>MountTargetDescription</code> objects.
     * </p>
     */
    private java.util.List<MountTargetDescription> mountTargets;

    /**
     * <p>
     * If a value is present, there are more mount targets to return. In a
     * subsequent request, you can provide <code>Marker</code> in your request
     * with this value to retrieve the next set of mount targets.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * If the request included the <code>Marker</code>, the response returns
     * that value in this field.
     * </p>
     *
     * @return <p>
     *         If the request included the <code>Marker</code>, the response
     *         returns that value in this field.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * If the request included the <code>Marker</code>, the response returns
     * that value in this field.
     * </p>
     *
     * @param marker <p>
     *            If the request included the <code>Marker</code>, the response
     *            returns that value in this field.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * If the request included the <code>Marker</code>, the response returns
     * that value in this field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            If the request included the <code>Marker</code>, the response
     *            returns that value in this field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMountTargetsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Returns the file system's mount targets as an array of
     * <code>MountTargetDescription</code> objects.
     * </p>
     *
     * @return <p>
     *         Returns the file system's mount targets as an array of
     *         <code>MountTargetDescription</code> objects.
     *         </p>
     */
    public java.util.List<MountTargetDescription> getMountTargets() {
        return mountTargets;
    }

    /**
     * <p>
     * Returns the file system's mount targets as an array of
     * <code>MountTargetDescription</code> objects.
     * </p>
     *
     * @param mountTargets <p>
     *            Returns the file system's mount targets as an array of
     *            <code>MountTargetDescription</code> objects.
     *            </p>
     */
    public void setMountTargets(java.util.Collection<MountTargetDescription> mountTargets) {
        if (mountTargets == null) {
            this.mountTargets = null;
            return;
        }

        this.mountTargets = new java.util.ArrayList<MountTargetDescription>(mountTargets);
    }

    /**
     * <p>
     * Returns the file system's mount targets as an array of
     * <code>MountTargetDescription</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mountTargets <p>
     *            Returns the file system's mount targets as an array of
     *            <code>MountTargetDescription</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMountTargetsResult withMountTargets(MountTargetDescription... mountTargets) {
        if (getMountTargets() == null) {
            this.mountTargets = new java.util.ArrayList<MountTargetDescription>(mountTargets.length);
        }
        for (MountTargetDescription value : mountTargets) {
            this.mountTargets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Returns the file system's mount targets as an array of
     * <code>MountTargetDescription</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mountTargets <p>
     *            Returns the file system's mount targets as an array of
     *            <code>MountTargetDescription</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMountTargetsResult withMountTargets(
            java.util.Collection<MountTargetDescription> mountTargets) {
        setMountTargets(mountTargets);
        return this;
    }

    /**
     * <p>
     * If a value is present, there are more mount targets to return. In a
     * subsequent request, you can provide <code>Marker</code> in your request
     * with this value to retrieve the next set of mount targets.
     * </p>
     *
     * @return <p>
     *         If a value is present, there are more mount targets to return. In
     *         a subsequent request, you can provide <code>Marker</code> in your
     *         request with this value to retrieve the next set of mount
     *         targets.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * If a value is present, there are more mount targets to return. In a
     * subsequent request, you can provide <code>Marker</code> in your request
     * with this value to retrieve the next set of mount targets.
     * </p>
     *
     * @param nextMarker <p>
     *            If a value is present, there are more mount targets to return.
     *            In a subsequent request, you can provide <code>Marker</code>
     *            in your request with this value to retrieve the next set of
     *            mount targets.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If a value is present, there are more mount targets to return. In a
     * subsequent request, you can provide <code>Marker</code> in your request
     * with this value to retrieve the next set of mount targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextMarker <p>
     *            If a value is present, there are more mount targets to return.
     *            In a subsequent request, you can provide <code>Marker</code>
     *            in your request with this value to retrieve the next set of
     *            mount targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMountTargetsResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMountTargets() != null)
            sb.append("MountTargets: " + getMountTargets() + ",");
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getMountTargets() == null) ? 0 : getMountTargets().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMountTargetsResult == false)
            return false;
        DescribeMountTargetsResult other = (DescribeMountTargetsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMountTargets() == null ^ this.getMountTargets() == null)
            return false;
        if (other.getMountTargets() != null
                && other.getMountTargets().equals(this.getMountTargets()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }
}
