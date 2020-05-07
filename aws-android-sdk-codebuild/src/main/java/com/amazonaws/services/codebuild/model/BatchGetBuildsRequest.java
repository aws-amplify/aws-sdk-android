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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets information about one or more builds.
 * </p>
 */
public class BatchGetBuildsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The IDs of the builds.
     * </p>
     */
    private java.util.List<String> ids;

    /**
     * <p>
     * The IDs of the builds.
     * </p>
     *
     * @return <p>
     *         The IDs of the builds.
     *         </p>
     */
    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * The IDs of the builds.
     * </p>
     *
     * @param ids <p>
     *            The IDs of the builds.
     *            </p>
     */
    public void setIds(java.util.Collection<String> ids) {
        if (ids == null) {
            this.ids = null;
            return;
        }

        this.ids = new java.util.ArrayList<String>(ids);
    }

    /**
     * <p>
     * The IDs of the builds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ids <p>
     *            The IDs of the builds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetBuildsRequest withIds(String... ids) {
        if (getIds() == null) {
            this.ids = new java.util.ArrayList<String>(ids.length);
        }
        for (String value : ids) {
            this.ids.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the builds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ids <p>
     *            The IDs of the builds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetBuildsRequest withIds(java.util.Collection<String> ids) {
        setIds(ids);
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
        if (getIds() != null)
            sb.append("ids: " + getIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetBuildsRequest == false)
            return false;
        BatchGetBuildsRequest other = (BatchGetBuildsRequest) obj;

        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
            return false;
        return true;
    }
}
