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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

public class VerifyResourcesExistForTagrisRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * The new value for the tagrisSweepList property for this object.
     */
    private java.util.List<TagrisSweepListItem> tagrisSweepList;

    /**
     * Returns the value of the tagrisSweepList property for this object.
     *
     * @return The value of the tagrisSweepList property for this object.
     */
    public java.util.List<TagrisSweepListItem> getTagrisSweepList() {
        return tagrisSweepList;
    }

    /**
     * Sets the value of tagrisSweepList
     *
     * @param tagrisSweepList The new value for the tagrisSweepList property for
     *            this object.
     */
    public void setTagrisSweepList(java.util.Collection<TagrisSweepListItem> tagrisSweepList) {
        if (tagrisSweepList == null) {
            this.tagrisSweepList = null;
            return;
        }

        this.tagrisSweepList = new java.util.ArrayList<TagrisSweepListItem>(tagrisSweepList);
    }

    /**
     * Sets the value of the tagrisSweepList property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagrisSweepList The new value for the tagrisSweepList property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifyResourcesExistForTagrisRequest withTagrisSweepList(
            TagrisSweepListItem... tagrisSweepList) {
        if (getTagrisSweepList() == null) {
            this.tagrisSweepList = new java.util.ArrayList<TagrisSweepListItem>(
                    tagrisSweepList.length);
        }
        for (TagrisSweepListItem value : tagrisSweepList) {
            this.tagrisSweepList.add(value);
        }
        return this;
    }

    /**
     * Sets the value of the tagrisSweepList property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagrisSweepList The new value for the tagrisSweepList property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifyResourcesExistForTagrisRequest withTagrisSweepList(
            java.util.Collection<TagrisSweepListItem> tagrisSweepList) {
        setTagrisSweepList(tagrisSweepList);
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
        if (getTagrisSweepList() != null)
            sb.append("TagrisSweepList: " + getTagrisSweepList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTagrisSweepList() == null) ? 0 : getTagrisSweepList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyResourcesExistForTagrisRequest == false)
            return false;
        VerifyResourcesExistForTagrisRequest other = (VerifyResourcesExistForTagrisRequest) obj;

        if (other.getTagrisSweepList() == null ^ this.getTagrisSweepList() == null)
            return false;
        if (other.getTagrisSweepList() != null
                && other.getTagrisSweepList().equals(this.getTagrisSweepList()) == false)
            return false;
        return true;
    }
}
