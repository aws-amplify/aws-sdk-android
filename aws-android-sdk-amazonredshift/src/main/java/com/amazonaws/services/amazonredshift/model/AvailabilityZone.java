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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an availability zone.
 * </p>
 */
public class AvailabilityZone implements Serializable {
    /**
     * <p>
     * The name of the availability zone.
     * </p>
     */
    private String name;

    /**
     * <p/>
     */
    private java.util.List<SupportedPlatform> supportedPlatforms;

    /**
     * <p>
     * The name of the availability zone.
     * </p>
     *
     * @return <p>
     *         The name of the availability zone.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the availability zone.
     * </p>
     *
     * @param name <p>
     *            The name of the availability zone.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the availability zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the availability zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailabilityZone withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.List<SupportedPlatform> getSupportedPlatforms() {
        return supportedPlatforms;
    }

    /**
     * <p/>
     *
     * @param supportedPlatforms <p/>
     */
    public void setSupportedPlatforms(java.util.Collection<SupportedPlatform> supportedPlatforms) {
        if (supportedPlatforms == null) {
            this.supportedPlatforms = null;
            return;
        }

        this.supportedPlatforms = new java.util.ArrayList<SupportedPlatform>(supportedPlatforms);
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedPlatforms <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailabilityZone withSupportedPlatforms(SupportedPlatform... supportedPlatforms) {
        if (getSupportedPlatforms() == null) {
            this.supportedPlatforms = new java.util.ArrayList<SupportedPlatform>(
                    supportedPlatforms.length);
        }
        for (SupportedPlatform value : supportedPlatforms) {
            this.supportedPlatforms.add(value);
        }
        return this;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedPlatforms <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailabilityZone withSupportedPlatforms(
            java.util.Collection<SupportedPlatform> supportedPlatforms) {
        setSupportedPlatforms(supportedPlatforms);
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
            sb.append("Name: " + getName() + ",");
        if (getSupportedPlatforms() != null)
            sb.append("SupportedPlatforms: " + getSupportedPlatforms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getSupportedPlatforms() == null) ? 0 : getSupportedPlatforms().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailabilityZone == false)
            return false;
        AvailabilityZone other = (AvailabilityZone) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSupportedPlatforms() == null ^ this.getSupportedPlatforms() == null)
            return false;
        if (other.getSupportedPlatforms() != null
                && other.getSupportedPlatforms().equals(this.getSupportedPlatforms()) == false)
            return false;
        return true;
    }
}
