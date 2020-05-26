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

public class DescribeEffectivePatchesForPatchBaselineResult implements Serializable {
    /**
     * <p>
     * An array of patches and patch status.
     * </p>
     */
    private java.util.List<EffectivePatch> effectivePatches;

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of patches and patch status.
     * </p>
     *
     * @return <p>
     *         An array of patches and patch status.
     *         </p>
     */
    public java.util.List<EffectivePatch> getEffectivePatches() {
        return effectivePatches;
    }

    /**
     * <p>
     * An array of patches and patch status.
     * </p>
     *
     * @param effectivePatches <p>
     *            An array of patches and patch status.
     *            </p>
     */
    public void setEffectivePatches(java.util.Collection<EffectivePatch> effectivePatches) {
        if (effectivePatches == null) {
            this.effectivePatches = null;
            return;
        }

        this.effectivePatches = new java.util.ArrayList<EffectivePatch>(effectivePatches);
    }

    /**
     * <p>
     * An array of patches and patch status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param effectivePatches <p>
     *            An array of patches and patch status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEffectivePatchesForPatchBaselineResult withEffectivePatches(
            EffectivePatch... effectivePatches) {
        if (getEffectivePatches() == null) {
            this.effectivePatches = new java.util.ArrayList<EffectivePatch>(effectivePatches.length);
        }
        for (EffectivePatch value : effectivePatches) {
            this.effectivePatches.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of patches and patch status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param effectivePatches <p>
     *            An array of patches and patch status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEffectivePatchesForPatchBaselineResult withEffectivePatches(
            java.util.Collection<EffectivePatch> effectivePatches) {
        setEffectivePatches(effectivePatches);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     *
     * @return <p>
     *         The token to use when requesting the next set of items. If there
     *         are no additional items to return, the string is empty.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items. If
     *            there are no additional items to return, the string is empty.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items. If
     *            there are no additional items to return, the string is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEffectivePatchesForPatchBaselineResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getEffectivePatches() != null)
            sb.append("EffectivePatches: " + getEffectivePatches() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEffectivePatches() == null) ? 0 : getEffectivePatches().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEffectivePatchesForPatchBaselineResult == false)
            return false;
        DescribeEffectivePatchesForPatchBaselineResult other = (DescribeEffectivePatchesForPatchBaselineResult) obj;

        if (other.getEffectivePatches() == null ^ this.getEffectivePatches() == null)
            return false;
        if (other.getEffectivePatches() != null
                && other.getEffectivePatches().equals(this.getEffectivePatches()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
