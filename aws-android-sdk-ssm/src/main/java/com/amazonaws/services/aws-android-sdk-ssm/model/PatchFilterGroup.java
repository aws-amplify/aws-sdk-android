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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>A set of patch filters, typically used for approval rules.</p>
 */
public class PatchFilterGroup implements Serializable {
    /**
     * <p>The set of patch filters that make up the group.</p>
     */
    private java.util.List<PatchFilter> patchFilters;

    /**
     * <p>The set of patch filters that make up the group.</p>
     *
     * @return <p>The set of patch filters that make up the group.</p>
     */
    public java.util.List<PatchFilter> getPatchFilters() {
        return patchFilters;
    }

    /**
     * <p>The set of patch filters that make up the group.</p>
     *
     * @param patchFilters <p>The set of patch filters that make up the group.</p>
     */
    public void setPatchFilters(java.util.Collection<PatchFilter> patchFilters) {
        if (patchFilters == null) {
            this.patchFilters = null;
            return;
        }

        this.patchFilters = new java.util.ArrayList<PatchFilter>(patchFilters);
    }

    /**
     * <p>The set of patch filters that make up the group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param patchFilters <p>The set of patch filters that make up the group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PatchFilterGroup withPatchFilters(PatchFilter... patchFilters) {
        if (getPatchFilters() == null) {
            this.patchFilters = new java.util.ArrayList<PatchFilter>(patchFilters.length);
        }
        for (PatchFilter value : patchFilters) {
            this.patchFilters.add(value);
        }
        return this;
    }

    /**
     * <p>The set of patch filters that make up the group.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param patchFilters <p>The set of patch filters that make up the group.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PatchFilterGroup withPatchFilters(java.util.Collection<PatchFilter> patchFilters) {
        setPatchFilters(patchFilters);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPatchFilters() != null) sb.append("PatchFilters: " + getPatchFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPatchFilters() == null) ? 0 : getPatchFilters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PatchFilterGroup == false) return false;
        PatchFilterGroup other = (PatchFilterGroup)obj;

        if (other.getPatchFilters() == null ^ this.getPatchFilters() == null) return false;
        if (other.getPatchFilters() != null && other.getPatchFilters().equals(this.getPatchFilters()) == false) return false;
        return true;
    }
}
