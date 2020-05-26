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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Use this API action to run an association immediately and only one time. This
 * action can be helpful when troubleshooting associations.
 * </p>
 */
public class StartAssociationsOnceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The association IDs that you want to run immediately and only one time.
     * </p>
     */
    private java.util.List<String> associationIds;

    /**
     * <p>
     * The association IDs that you want to run immediately and only one time.
     * </p>
     *
     * @return <p>
     *         The association IDs that you want to run immediately and only one
     *         time.
     *         </p>
     */
    public java.util.List<String> getAssociationIds() {
        return associationIds;
    }

    /**
     * <p>
     * The association IDs that you want to run immediately and only one time.
     * </p>
     *
     * @param associationIds <p>
     *            The association IDs that you want to run immediately and only
     *            one time.
     *            </p>
     */
    public void setAssociationIds(java.util.Collection<String> associationIds) {
        if (associationIds == null) {
            this.associationIds = null;
            return;
        }

        this.associationIds = new java.util.ArrayList<String>(associationIds);
    }

    /**
     * <p>
     * The association IDs that you want to run immediately and only one time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associationIds <p>
     *            The association IDs that you want to run immediately and only
     *            one time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAssociationsOnceRequest withAssociationIds(String... associationIds) {
        if (getAssociationIds() == null) {
            this.associationIds = new java.util.ArrayList<String>(associationIds.length);
        }
        for (String value : associationIds) {
            this.associationIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The association IDs that you want to run immediately and only one time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associationIds <p>
     *            The association IDs that you want to run immediately and only
     *            one time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAssociationsOnceRequest withAssociationIds(
            java.util.Collection<String> associationIds) {
        setAssociationIds(associationIds);
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
        if (getAssociationIds() != null)
            sb.append("AssociationIds: " + getAssociationIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociationIds() == null) ? 0 : getAssociationIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartAssociationsOnceRequest == false)
            return false;
        StartAssociationsOnceRequest other = (StartAssociationsOnceRequest) obj;

        if (other.getAssociationIds() == null ^ this.getAssociationIds() == null)
            return false;
        if (other.getAssociationIds() != null
                && other.getAssociationIds().equals(this.getAssociationIds()) == false)
            return false;
        return true;
    }
}
