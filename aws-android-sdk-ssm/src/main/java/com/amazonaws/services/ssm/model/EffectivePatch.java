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

/**
 * <p>
 * The EffectivePatch structure defines metadata about a patch along with the
 * approval state of the patch in a particular patch baseline. The approval
 * state includes information about whether the patch is currently approved, due
 * to be approved by a rule, explicitly approved, or explicitly rejected and the
 * date the patch was or will be approved.
 * </p>
 */
public class EffectivePatch implements Serializable {
    /**
     * <p>
     * Provides metadata for a patch, including information such as the KB ID,
     * severity, classification and a URL for where more information can be
     * obtained about the patch.
     * </p>
     */
    private Patch patch;

    /**
     * <p>
     * The status of the patch in a patch baseline. This includes information
     * about whether the patch is currently approved, due to be approved by a
     * rule, explicitly approved, or explicitly rejected and the date the patch
     * was or will be approved.
     * </p>
     */
    private PatchStatus patchStatus;

    /**
     * <p>
     * Provides metadata for a patch, including information such as the KB ID,
     * severity, classification and a URL for where more information can be
     * obtained about the patch.
     * </p>
     *
     * @return <p>
     *         Provides metadata for a patch, including information such as the
     *         KB ID, severity, classification and a URL for where more
     *         information can be obtained about the patch.
     *         </p>
     */
    public Patch getPatch() {
        return patch;
    }

    /**
     * <p>
     * Provides metadata for a patch, including information such as the KB ID,
     * severity, classification and a URL for where more information can be
     * obtained about the patch.
     * </p>
     *
     * @param patch <p>
     *            Provides metadata for a patch, including information such as
     *            the KB ID, severity, classification and a URL for where more
     *            information can be obtained about the patch.
     *            </p>
     */
    public void setPatch(Patch patch) {
        this.patch = patch;
    }

    /**
     * <p>
     * Provides metadata for a patch, including information such as the KB ID,
     * severity, classification and a URL for where more information can be
     * obtained about the patch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param patch <p>
     *            Provides metadata for a patch, including information such as
     *            the KB ID, severity, classification and a URL for where more
     *            information can be obtained about the patch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EffectivePatch withPatch(Patch patch) {
        this.patch = patch;
        return this;
    }

    /**
     * <p>
     * The status of the patch in a patch baseline. This includes information
     * about whether the patch is currently approved, due to be approved by a
     * rule, explicitly approved, or explicitly rejected and the date the patch
     * was or will be approved.
     * </p>
     *
     * @return <p>
     *         The status of the patch in a patch baseline. This includes
     *         information about whether the patch is currently approved, due to
     *         be approved by a rule, explicitly approved, or explicitly
     *         rejected and the date the patch was or will be approved.
     *         </p>
     */
    public PatchStatus getPatchStatus() {
        return patchStatus;
    }

    /**
     * <p>
     * The status of the patch in a patch baseline. This includes information
     * about whether the patch is currently approved, due to be approved by a
     * rule, explicitly approved, or explicitly rejected and the date the patch
     * was or will be approved.
     * </p>
     *
     * @param patchStatus <p>
     *            The status of the patch in a patch baseline. This includes
     *            information about whether the patch is currently approved, due
     *            to be approved by a rule, explicitly approved, or explicitly
     *            rejected and the date the patch was or will be approved.
     *            </p>
     */
    public void setPatchStatus(PatchStatus patchStatus) {
        this.patchStatus = patchStatus;
    }

    /**
     * <p>
     * The status of the patch in a patch baseline. This includes information
     * about whether the patch is currently approved, due to be approved by a
     * rule, explicitly approved, or explicitly rejected and the date the patch
     * was or will be approved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param patchStatus <p>
     *            The status of the patch in a patch baseline. This includes
     *            information about whether the patch is currently approved, due
     *            to be approved by a rule, explicitly approved, or explicitly
     *            rejected and the date the patch was or will be approved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EffectivePatch withPatchStatus(PatchStatus patchStatus) {
        this.patchStatus = patchStatus;
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
        if (getPatch() != null)
            sb.append("Patch: " + getPatch() + ",");
        if (getPatchStatus() != null)
            sb.append("PatchStatus: " + getPatchStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPatch() == null) ? 0 : getPatch().hashCode());
        hashCode = prime * hashCode
                + ((getPatchStatus() == null) ? 0 : getPatchStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EffectivePatch == false)
            return false;
        EffectivePatch other = (EffectivePatch) obj;

        if (other.getPatch() == null ^ this.getPatch() == null)
            return false;
        if (other.getPatch() != null && other.getPatch().equals(this.getPatch()) == false)
            return false;
        if (other.getPatchStatus() == null ^ this.getPatchStatus() == null)
            return false;
        if (other.getPatchStatus() != null
                && other.getPatchStatus().equals(this.getPatchStatus()) == false)
            return false;
        return true;
    }
}
