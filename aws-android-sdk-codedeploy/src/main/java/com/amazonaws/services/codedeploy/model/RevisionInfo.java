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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an application revision.
 * </p>
 */
public class RevisionInfo implements Serializable {
    /**
     * <p>
     * Information about the location and type of an application revision.
     * </p>
     */
    private RevisionLocation revisionLocation;

    /**
     * <p>
     * Information about an application revision, including usage details and
     * associated deployment groups.
     * </p>
     */
    private GenericRevisionInfo genericRevisionInfo;

    /**
     * <p>
     * Information about the location and type of an application revision.
     * </p>
     *
     * @return <p>
     *         Information about the location and type of an application
     *         revision.
     *         </p>
     */
    public RevisionLocation getRevisionLocation() {
        return revisionLocation;
    }

    /**
     * <p>
     * Information about the location and type of an application revision.
     * </p>
     *
     * @param revisionLocation <p>
     *            Information about the location and type of an application
     *            revision.
     *            </p>
     */
    public void setRevisionLocation(RevisionLocation revisionLocation) {
        this.revisionLocation = revisionLocation;
    }

    /**
     * <p>
     * Information about the location and type of an application revision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisionLocation <p>
     *            Information about the location and type of an application
     *            revision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevisionInfo withRevisionLocation(RevisionLocation revisionLocation) {
        this.revisionLocation = revisionLocation;
        return this;
    }

    /**
     * <p>
     * Information about an application revision, including usage details and
     * associated deployment groups.
     * </p>
     *
     * @return <p>
     *         Information about an application revision, including usage
     *         details and associated deployment groups.
     *         </p>
     */
    public GenericRevisionInfo getGenericRevisionInfo() {
        return genericRevisionInfo;
    }

    /**
     * <p>
     * Information about an application revision, including usage details and
     * associated deployment groups.
     * </p>
     *
     * @param genericRevisionInfo <p>
     *            Information about an application revision, including usage
     *            details and associated deployment groups.
     *            </p>
     */
    public void setGenericRevisionInfo(GenericRevisionInfo genericRevisionInfo) {
        this.genericRevisionInfo = genericRevisionInfo;
    }

    /**
     * <p>
     * Information about an application revision, including usage details and
     * associated deployment groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param genericRevisionInfo <p>
     *            Information about an application revision, including usage
     *            details and associated deployment groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevisionInfo withGenericRevisionInfo(GenericRevisionInfo genericRevisionInfo) {
        this.genericRevisionInfo = genericRevisionInfo;
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
        if (getRevisionLocation() != null)
            sb.append("revisionLocation: " + getRevisionLocation() + ",");
        if (getGenericRevisionInfo() != null)
            sb.append("genericRevisionInfo: " + getGenericRevisionInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRevisionLocation() == null) ? 0 : getRevisionLocation().hashCode());
        hashCode = prime * hashCode
                + ((getGenericRevisionInfo() == null) ? 0 : getGenericRevisionInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevisionInfo == false)
            return false;
        RevisionInfo other = (RevisionInfo) obj;

        if (other.getRevisionLocation() == null ^ this.getRevisionLocation() == null)
            return false;
        if (other.getRevisionLocation() != null
                && other.getRevisionLocation().equals(this.getRevisionLocation()) == false)
            return false;
        if (other.getGenericRevisionInfo() == null ^ this.getGenericRevisionInfo() == null)
            return false;
        if (other.getGenericRevisionInfo() != null
                && other.getGenericRevisionInfo().equals(this.getGenericRevisionInfo()) == false)
            return false;
        return true;
    }
}
