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

public class DescribePatchGroupsResult implements Serializable {
    /**
     * <p>
     * Each entry in the array contains:
     * </p>
     * <p>
     * PatchGroup: string (between 1 and 256 characters, Regex:
     * ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$)
     * </p>
     * <p>
     * PatchBaselineIdentity: A PatchBaselineIdentity element.
     * </p>
     */
    private java.util.List<PatchGroupPatchBaselineMapping> mappings;

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Each entry in the array contains:
     * </p>
     * <p>
     * PatchGroup: string (between 1 and 256 characters, Regex:
     * ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$)
     * </p>
     * <p>
     * PatchBaselineIdentity: A PatchBaselineIdentity element.
     * </p>
     *
     * @return <p>
     *         Each entry in the array contains:
     *         </p>
     *         <p>
     *         PatchGroup: string (between 1 and 256 characters, Regex:
     *         ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$)
     *         </p>
     *         <p>
     *         PatchBaselineIdentity: A PatchBaselineIdentity element.
     *         </p>
     */
    public java.util.List<PatchGroupPatchBaselineMapping> getMappings() {
        return mappings;
    }

    /**
     * <p>
     * Each entry in the array contains:
     * </p>
     * <p>
     * PatchGroup: string (between 1 and 256 characters, Regex:
     * ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$)
     * </p>
     * <p>
     * PatchBaselineIdentity: A PatchBaselineIdentity element.
     * </p>
     *
     * @param mappings <p>
     *            Each entry in the array contains:
     *            </p>
     *            <p>
     *            PatchGroup: string (between 1 and 256 characters, Regex:
     *            ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$)
     *            </p>
     *            <p>
     *            PatchBaselineIdentity: A PatchBaselineIdentity element.
     *            </p>
     */
    public void setMappings(java.util.Collection<PatchGroupPatchBaselineMapping> mappings) {
        if (mappings == null) {
            this.mappings = null;
            return;
        }

        this.mappings = new java.util.ArrayList<PatchGroupPatchBaselineMapping>(mappings);
    }

    /**
     * <p>
     * Each entry in the array contains:
     * </p>
     * <p>
     * PatchGroup: string (between 1 and 256 characters, Regex:
     * ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$)
     * </p>
     * <p>
     * PatchBaselineIdentity: A PatchBaselineIdentity element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mappings <p>
     *            Each entry in the array contains:
     *            </p>
     *            <p>
     *            PatchGroup: string (between 1 and 256 characters, Regex:
     *            ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$)
     *            </p>
     *            <p>
     *            PatchBaselineIdentity: A PatchBaselineIdentity element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePatchGroupsResult withMappings(PatchGroupPatchBaselineMapping... mappings) {
        if (getMappings() == null) {
            this.mappings = new java.util.ArrayList<PatchGroupPatchBaselineMapping>(mappings.length);
        }
        for (PatchGroupPatchBaselineMapping value : mappings) {
            this.mappings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Each entry in the array contains:
     * </p>
     * <p>
     * PatchGroup: string (between 1 and 256 characters, Regex:
     * ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$)
     * </p>
     * <p>
     * PatchBaselineIdentity: A PatchBaselineIdentity element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mappings <p>
     *            Each entry in the array contains:
     *            </p>
     *            <p>
     *            PatchGroup: string (between 1 and 256 characters, Regex:
     *            ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$)
     *            </p>
     *            <p>
     *            PatchBaselineIdentity: A PatchBaselineIdentity element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePatchGroupsResult withMappings(
            java.util.Collection<PatchGroupPatchBaselineMapping> mappings) {
        setMappings(mappings);
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
    public DescribePatchGroupsResult withNextToken(String nextToken) {
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
        if (getMappings() != null)
            sb.append("Mappings: " + getMappings() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMappings() == null) ? 0 : getMappings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePatchGroupsResult == false)
            return false;
        DescribePatchGroupsResult other = (DescribePatchGroupsResult) obj;

        if (other.getMappings() == null ^ this.getMappings() == null)
            return false;
        if (other.getMappings() != null && other.getMappings().equals(this.getMappings()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
