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
 * The mapping between a patch group and the patch baseline the patch group is
 * registered with.
 * </p>
 */
public class PatchGroupPatchBaselineMapping implements Serializable {
    /**
     * <p>
     * The name of the patch group registered with the patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String patchGroup;

    /**
     * <p>
     * The patch baseline the patch group is registered with.
     * </p>
     */
    private PatchBaselineIdentity baselineIdentity;

    /**
     * <p>
     * The name of the patch group registered with the patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>
     *         The name of the patch group registered with the patch baseline.
     *         </p>
     */
    public String getPatchGroup() {
        return patchGroup;
    }

    /**
     * <p>
     * The name of the patch group registered with the patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param patchGroup <p>
     *            The name of the patch group registered with the patch
     *            baseline.
     *            </p>
     */
    public void setPatchGroup(String patchGroup) {
        this.patchGroup = patchGroup;
    }

    /**
     * <p>
     * The name of the patch group registered with the patch baseline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param patchGroup <p>
     *            The name of the patch group registered with the patch
     *            baseline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchGroupPatchBaselineMapping withPatchGroup(String patchGroup) {
        this.patchGroup = patchGroup;
        return this;
    }

    /**
     * <p>
     * The patch baseline the patch group is registered with.
     * </p>
     *
     * @return <p>
     *         The patch baseline the patch group is registered with.
     *         </p>
     */
    public PatchBaselineIdentity getBaselineIdentity() {
        return baselineIdentity;
    }

    /**
     * <p>
     * The patch baseline the patch group is registered with.
     * </p>
     *
     * @param baselineIdentity <p>
     *            The patch baseline the patch group is registered with.
     *            </p>
     */
    public void setBaselineIdentity(PatchBaselineIdentity baselineIdentity) {
        this.baselineIdentity = baselineIdentity;
    }

    /**
     * <p>
     * The patch baseline the patch group is registered with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baselineIdentity <p>
     *            The patch baseline the patch group is registered with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchGroupPatchBaselineMapping withBaselineIdentity(
            PatchBaselineIdentity baselineIdentity) {
        this.baselineIdentity = baselineIdentity;
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
        if (getPatchGroup() != null)
            sb.append("PatchGroup: " + getPatchGroup() + ",");
        if (getBaselineIdentity() != null)
            sb.append("BaselineIdentity: " + getBaselineIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPatchGroup() == null) ? 0 : getPatchGroup().hashCode());
        hashCode = prime * hashCode
                + ((getBaselineIdentity() == null) ? 0 : getBaselineIdentity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatchGroupPatchBaselineMapping == false)
            return false;
        PatchGroupPatchBaselineMapping other = (PatchGroupPatchBaselineMapping) obj;

        if (other.getPatchGroup() == null ^ this.getPatchGroup() == null)
            return false;
        if (other.getPatchGroup() != null
                && other.getPatchGroup().equals(this.getPatchGroup()) == false)
            return false;
        if (other.getBaselineIdentity() == null ^ this.getBaselineIdentity() == null)
            return false;
        if (other.getBaselineIdentity() != null
                && other.getBaselineIdentity().equals(this.getBaselineIdentity()) == false)
            return false;
        return true;
    }
}
