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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * Returns information about a merge or potential merge between a source
 * reference and a destination reference in a pull request.
 * </p>
 */
public class MergeMetadata implements Serializable {
    /**
     * <p>
     * A Boolean value indicating whether the merge has been made.
     * </p>
     */
    private Boolean isMerged;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who merged the branches.
     * </p>
     */
    private String mergedBy;

    /**
     * <p>
     * The commit ID for the merge commit, if any.
     * </p>
     */
    private String mergeCommitId;

    /**
     * <p>
     * The merge strategy used in the merge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAST_FORWARD_MERGE, SQUASH_MERGE, THREE_WAY_MERGE
     */
    private String mergeOption;

    /**
     * <p>
     * A Boolean value indicating whether the merge has been made.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the merge has been made.
     *         </p>
     */
    public Boolean isIsMerged() {
        return isMerged;
    }

    /**
     * <p>
     * A Boolean value indicating whether the merge has been made.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the merge has been made.
     *         </p>
     */
    public Boolean getIsMerged() {
        return isMerged;
    }

    /**
     * <p>
     * A Boolean value indicating whether the merge has been made.
     * </p>
     *
     * @param isMerged <p>
     *            A Boolean value indicating whether the merge has been made.
     *            </p>
     */
    public void setIsMerged(Boolean isMerged) {
        this.isMerged = isMerged;
    }

    /**
     * <p>
     * A Boolean value indicating whether the merge has been made.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isMerged <p>
     *            A Boolean value indicating whether the merge has been made.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeMetadata withIsMerged(Boolean isMerged) {
        this.isMerged = isMerged;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who merged the branches.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the user who merged the
     *         branches.
     *         </p>
     */
    public String getMergedBy() {
        return mergedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who merged the branches.
     * </p>
     *
     * @param mergedBy <p>
     *            The Amazon Resource Name (ARN) of the user who merged the
     *            branches.
     *            </p>
     */
    public void setMergedBy(String mergedBy) {
        this.mergedBy = mergedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who merged the branches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mergedBy <p>
     *            The Amazon Resource Name (ARN) of the user who merged the
     *            branches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeMetadata withMergedBy(String mergedBy) {
        this.mergedBy = mergedBy;
        return this;
    }

    /**
     * <p>
     * The commit ID for the merge commit, if any.
     * </p>
     *
     * @return <p>
     *         The commit ID for the merge commit, if any.
     *         </p>
     */
    public String getMergeCommitId() {
        return mergeCommitId;
    }

    /**
     * <p>
     * The commit ID for the merge commit, if any.
     * </p>
     *
     * @param mergeCommitId <p>
     *            The commit ID for the merge commit, if any.
     *            </p>
     */
    public void setMergeCommitId(String mergeCommitId) {
        this.mergeCommitId = mergeCommitId;
    }

    /**
     * <p>
     * The commit ID for the merge commit, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mergeCommitId <p>
     *            The commit ID for the merge commit, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeMetadata withMergeCommitId(String mergeCommitId) {
        this.mergeCommitId = mergeCommitId;
        return this;
    }

    /**
     * <p>
     * The merge strategy used in the merge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAST_FORWARD_MERGE, SQUASH_MERGE, THREE_WAY_MERGE
     *
     * @return <p>
     *         The merge strategy used in the merge.
     *         </p>
     * @see MergeOptionTypeEnum
     */
    public String getMergeOption() {
        return mergeOption;
    }

    /**
     * <p>
     * The merge strategy used in the merge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAST_FORWARD_MERGE, SQUASH_MERGE, THREE_WAY_MERGE
     *
     * @param mergeOption <p>
     *            The merge strategy used in the merge.
     *            </p>
     * @see MergeOptionTypeEnum
     */
    public void setMergeOption(String mergeOption) {
        this.mergeOption = mergeOption;
    }

    /**
     * <p>
     * The merge strategy used in the merge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAST_FORWARD_MERGE, SQUASH_MERGE, THREE_WAY_MERGE
     *
     * @param mergeOption <p>
     *            The merge strategy used in the merge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MergeOptionTypeEnum
     */
    public MergeMetadata withMergeOption(String mergeOption) {
        this.mergeOption = mergeOption;
        return this;
    }

    /**
     * <p>
     * The merge strategy used in the merge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAST_FORWARD_MERGE, SQUASH_MERGE, THREE_WAY_MERGE
     *
     * @param mergeOption <p>
     *            The merge strategy used in the merge.
     *            </p>
     * @see MergeOptionTypeEnum
     */
    public void setMergeOption(MergeOptionTypeEnum mergeOption) {
        this.mergeOption = mergeOption.toString();
    }

    /**
     * <p>
     * The merge strategy used in the merge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAST_FORWARD_MERGE, SQUASH_MERGE, THREE_WAY_MERGE
     *
     * @param mergeOption <p>
     *            The merge strategy used in the merge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MergeOptionTypeEnum
     */
    public MergeMetadata withMergeOption(MergeOptionTypeEnum mergeOption) {
        this.mergeOption = mergeOption.toString();
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
        if (getIsMerged() != null)
            sb.append("isMerged: " + getIsMerged() + ",");
        if (getMergedBy() != null)
            sb.append("mergedBy: " + getMergedBy() + ",");
        if (getMergeCommitId() != null)
            sb.append("mergeCommitId: " + getMergeCommitId() + ",");
        if (getMergeOption() != null)
            sb.append("mergeOption: " + getMergeOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsMerged() == null) ? 0 : getIsMerged().hashCode());
        hashCode = prime * hashCode + ((getMergedBy() == null) ? 0 : getMergedBy().hashCode());
        hashCode = prime * hashCode
                + ((getMergeCommitId() == null) ? 0 : getMergeCommitId().hashCode());
        hashCode = prime * hashCode
                + ((getMergeOption() == null) ? 0 : getMergeOption().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergeMetadata == false)
            return false;
        MergeMetadata other = (MergeMetadata) obj;

        if (other.getIsMerged() == null ^ this.getIsMerged() == null)
            return false;
        if (other.getIsMerged() != null && other.getIsMerged().equals(this.getIsMerged()) == false)
            return false;
        if (other.getMergedBy() == null ^ this.getMergedBy() == null)
            return false;
        if (other.getMergedBy() != null && other.getMergedBy().equals(this.getMergedBy()) == false)
            return false;
        if (other.getMergeCommitId() == null ^ this.getMergeCommitId() == null)
            return false;
        if (other.getMergeCommitId() != null
                && other.getMergeCommitId().equals(this.getMergeCommitId()) == false)
            return false;
        if (other.getMergeOption() == null ^ this.getMergeOption() == null)
            return false;
        if (other.getMergeOption() != null
                && other.getMergeOption().equals(this.getMergeOption()) == false)
            return false;
        return true;
    }
}
