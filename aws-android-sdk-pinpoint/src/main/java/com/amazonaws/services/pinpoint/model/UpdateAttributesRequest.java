/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * Update attributes request
 */
public class UpdateAttributesRequest implements Serializable {
    /**
     * The GLOB wildcard for removing the attributes in the application
     */
    private java.util.List<String> blacklist;

    /**
     * The GLOB wildcard for removing the attributes in the application
     *
     * @return The GLOB wildcard for removing the attributes in the application
     */
    public java.util.List<String> getBlacklist() {
        return blacklist;
    }

    /**
     * The GLOB wildcard for removing the attributes in the application
     *
     * @param blacklist The GLOB wildcard for removing the attributes in the
     *            application
     */
    public void setBlacklist(java.util.Collection<String> blacklist) {
        if (blacklist == null) {
            this.blacklist = null;
            return;
        }

        this.blacklist = new java.util.ArrayList<String>(blacklist);
    }

    /**
     * The GLOB wildcard for removing the attributes in the application
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blacklist The GLOB wildcard for removing the attributes in the
     *            application
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAttributesRequest withBlacklist(String... blacklist) {
        if (getBlacklist() == null) {
            this.blacklist = new java.util.ArrayList<String>(blacklist.length);
        }
        for (String value : blacklist) {
            this.blacklist.add(value);
        }
        return this;
    }

    /**
     * The GLOB wildcard for removing the attributes in the application
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blacklist The GLOB wildcard for removing the attributes in the
     *            application
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAttributesRequest withBlacklist(java.util.Collection<String> blacklist) {
        setBlacklist(blacklist);
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
        if (getBlacklist() != null)
            sb.append("Blacklist: " + getBlacklist());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlacklist() == null) ? 0 : getBlacklist().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAttributesRequest == false)
            return false;
        UpdateAttributesRequest other = (UpdateAttributesRequest) obj;

        if (other.getBlacklist() == null ^ this.getBlacklist() == null)
            return false;
        if (other.getBlacklist() != null
                && other.getBlacklist().equals(this.getBlacklist()) == false)
            return false;
        return true;
    }
}
