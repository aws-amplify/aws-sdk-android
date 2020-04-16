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

public class DescribeInstancePatchesResult implements Serializable {
    /**
     * <p>
     * Each entry in the array is a structure containing:
     * </p>
     * <p>
     * Title (string)
     * </p>
     * <p>
     * KBId (string)
     * </p>
     * <p>
     * Classification (string)
     * </p>
     * <p>
     * Severity (string)
     * </p>
     * <p>
     * State (string, such as "INSTALLED" or "FAILED")
     * </p>
     * <p>
     * InstalledTime (DateTime)
     * </p>
     * <p>
     * InstalledBy (string)
     * </p>
     */
    private java.util.List<PatchComplianceData> patches;

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Each entry in the array is a structure containing:
     * </p>
     * <p>
     * Title (string)
     * </p>
     * <p>
     * KBId (string)
     * </p>
     * <p>
     * Classification (string)
     * </p>
     * <p>
     * Severity (string)
     * </p>
     * <p>
     * State (string, such as "INSTALLED" or "FAILED")
     * </p>
     * <p>
     * InstalledTime (DateTime)
     * </p>
     * <p>
     * InstalledBy (string)
     * </p>
     *
     * @return <p>
     *         Each entry in the array is a structure containing:
     *         </p>
     *         <p>
     *         Title (string)
     *         </p>
     *         <p>
     *         KBId (string)
     *         </p>
     *         <p>
     *         Classification (string)
     *         </p>
     *         <p>
     *         Severity (string)
     *         </p>
     *         <p>
     *         State (string, such as "INSTALLED" or "FAILED")
     *         </p>
     *         <p>
     *         InstalledTime (DateTime)
     *         </p>
     *         <p>
     *         InstalledBy (string)
     *         </p>
     */
    public java.util.List<PatchComplianceData> getPatches() {
        return patches;
    }

    /**
     * <p>
     * Each entry in the array is a structure containing:
     * </p>
     * <p>
     * Title (string)
     * </p>
     * <p>
     * KBId (string)
     * </p>
     * <p>
     * Classification (string)
     * </p>
     * <p>
     * Severity (string)
     * </p>
     * <p>
     * State (string, such as "INSTALLED" or "FAILED")
     * </p>
     * <p>
     * InstalledTime (DateTime)
     * </p>
     * <p>
     * InstalledBy (string)
     * </p>
     *
     * @param patches <p>
     *            Each entry in the array is a structure containing:
     *            </p>
     *            <p>
     *            Title (string)
     *            </p>
     *            <p>
     *            KBId (string)
     *            </p>
     *            <p>
     *            Classification (string)
     *            </p>
     *            <p>
     *            Severity (string)
     *            </p>
     *            <p>
     *            State (string, such as "INSTALLED" or "FAILED")
     *            </p>
     *            <p>
     *            InstalledTime (DateTime)
     *            </p>
     *            <p>
     *            InstalledBy (string)
     *            </p>
     */
    public void setPatches(java.util.Collection<PatchComplianceData> patches) {
        if (patches == null) {
            this.patches = null;
            return;
        }

        this.patches = new java.util.ArrayList<PatchComplianceData>(patches);
    }

    /**
     * <p>
     * Each entry in the array is a structure containing:
     * </p>
     * <p>
     * Title (string)
     * </p>
     * <p>
     * KBId (string)
     * </p>
     * <p>
     * Classification (string)
     * </p>
     * <p>
     * Severity (string)
     * </p>
     * <p>
     * State (string, such as "INSTALLED" or "FAILED")
     * </p>
     * <p>
     * InstalledTime (DateTime)
     * </p>
     * <p>
     * InstalledBy (string)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param patches <p>
     *            Each entry in the array is a structure containing:
     *            </p>
     *            <p>
     *            Title (string)
     *            </p>
     *            <p>
     *            KBId (string)
     *            </p>
     *            <p>
     *            Classification (string)
     *            </p>
     *            <p>
     *            Severity (string)
     *            </p>
     *            <p>
     *            State (string, such as "INSTALLED" or "FAILED")
     *            </p>
     *            <p>
     *            InstalledTime (DateTime)
     *            </p>
     *            <p>
     *            InstalledBy (string)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstancePatchesResult withPatches(PatchComplianceData... patches) {
        if (getPatches() == null) {
            this.patches = new java.util.ArrayList<PatchComplianceData>(patches.length);
        }
        for (PatchComplianceData value : patches) {
            this.patches.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Each entry in the array is a structure containing:
     * </p>
     * <p>
     * Title (string)
     * </p>
     * <p>
     * KBId (string)
     * </p>
     * <p>
     * Classification (string)
     * </p>
     * <p>
     * Severity (string)
     * </p>
     * <p>
     * State (string, such as "INSTALLED" or "FAILED")
     * </p>
     * <p>
     * InstalledTime (DateTime)
     * </p>
     * <p>
     * InstalledBy (string)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param patches <p>
     *            Each entry in the array is a structure containing:
     *            </p>
     *            <p>
     *            Title (string)
     *            </p>
     *            <p>
     *            KBId (string)
     *            </p>
     *            <p>
     *            Classification (string)
     *            </p>
     *            <p>
     *            Severity (string)
     *            </p>
     *            <p>
     *            State (string, such as "INSTALLED" or "FAILED")
     *            </p>
     *            <p>
     *            InstalledTime (DateTime)
     *            </p>
     *            <p>
     *            InstalledBy (string)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstancePatchesResult withPatches(
            java.util.Collection<PatchComplianceData> patches) {
        setPatches(patches);
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
    public DescribeInstancePatchesResult withNextToken(String nextToken) {
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
        if (getPatches() != null)
            sb.append("Patches: " + getPatches() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPatches() == null) ? 0 : getPatches().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstancePatchesResult == false)
            return false;
        DescribeInstancePatchesResult other = (DescribeInstancePatchesResult) obj;

        if (other.getPatches() == null ^ this.getPatches() == null)
            return false;
        if (other.getPatches() != null && other.getPatches().equals(this.getPatches()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
