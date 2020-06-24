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
 * Information about merge hunks in a merge or pull request operation.
 * </p>
 */
public class MergeHunk implements Serializable {
    /**
     * <p>
     * A Boolean value indicating whether a combination of hunks contains a
     * conflict. Conflicts occur when the same file or the same lines in a file
     * were modified in both the source and destination of a merge or pull
     * request. Valid values include true, false, and null. True when the hunk
     * represents a conflict and one or more files contains a line conflict.
     * File mode conflicts in a merge do not set this to true.
     * </p>
     */
    private Boolean isConflict;

    /**
     * <p>
     * Information about the merge hunk in the source of a merge or pull
     * request.
     * </p>
     */
    private MergeHunkDetail source;

    /**
     * <p>
     * Information about the merge hunk in the destination of a merge or pull
     * request.
     * </p>
     */
    private MergeHunkDetail destination;

    /**
     * <p>
     * Information about the merge hunk in the base of a merge or pull request.
     * </p>
     */
    private MergeHunkDetail base;

    /**
     * <p>
     * A Boolean value indicating whether a combination of hunks contains a
     * conflict. Conflicts occur when the same file or the same lines in a file
     * were modified in both the source and destination of a merge or pull
     * request. Valid values include true, false, and null. True when the hunk
     * represents a conflict and one or more files contains a line conflict.
     * File mode conflicts in a merge do not set this to true.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether a combination of hunks
     *         contains a conflict. Conflicts occur when the same file or the
     *         same lines in a file were modified in both the source and
     *         destination of a merge or pull request. Valid values include
     *         true, false, and null. True when the hunk represents a conflict
     *         and one or more files contains a line conflict. File mode
     *         conflicts in a merge do not set this to true.
     *         </p>
     */
    public Boolean isIsConflict() {
        return isConflict;
    }

    /**
     * <p>
     * A Boolean value indicating whether a combination of hunks contains a
     * conflict. Conflicts occur when the same file or the same lines in a file
     * were modified in both the source and destination of a merge or pull
     * request. Valid values include true, false, and null. True when the hunk
     * represents a conflict and one or more files contains a line conflict.
     * File mode conflicts in a merge do not set this to true.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether a combination of hunks
     *         contains a conflict. Conflicts occur when the same file or the
     *         same lines in a file were modified in both the source and
     *         destination of a merge or pull request. Valid values include
     *         true, false, and null. True when the hunk represents a conflict
     *         and one or more files contains a line conflict. File mode
     *         conflicts in a merge do not set this to true.
     *         </p>
     */
    public Boolean getIsConflict() {
        return isConflict;
    }

    /**
     * <p>
     * A Boolean value indicating whether a combination of hunks contains a
     * conflict. Conflicts occur when the same file or the same lines in a file
     * were modified in both the source and destination of a merge or pull
     * request. Valid values include true, false, and null. True when the hunk
     * represents a conflict and one or more files contains a line conflict.
     * File mode conflicts in a merge do not set this to true.
     * </p>
     *
     * @param isConflict <p>
     *            A Boolean value indicating whether a combination of hunks
     *            contains a conflict. Conflicts occur when the same file or the
     *            same lines in a file were modified in both the source and
     *            destination of a merge or pull request. Valid values include
     *            true, false, and null. True when the hunk represents a
     *            conflict and one or more files contains a line conflict. File
     *            mode conflicts in a merge do not set this to true.
     *            </p>
     */
    public void setIsConflict(Boolean isConflict) {
        this.isConflict = isConflict;
    }

    /**
     * <p>
     * A Boolean value indicating whether a combination of hunks contains a
     * conflict. Conflicts occur when the same file or the same lines in a file
     * were modified in both the source and destination of a merge or pull
     * request. Valid values include true, false, and null. True when the hunk
     * represents a conflict and one or more files contains a line conflict.
     * File mode conflicts in a merge do not set this to true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isConflict <p>
     *            A Boolean value indicating whether a combination of hunks
     *            contains a conflict. Conflicts occur when the same file or the
     *            same lines in a file were modified in both the source and
     *            destination of a merge or pull request. Valid values include
     *            true, false, and null. True when the hunk represents a
     *            conflict and one or more files contains a line conflict. File
     *            mode conflicts in a merge do not set this to true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeHunk withIsConflict(Boolean isConflict) {
        this.isConflict = isConflict;
        return this;
    }

    /**
     * <p>
     * Information about the merge hunk in the source of a merge or pull
     * request.
     * </p>
     *
     * @return <p>
     *         Information about the merge hunk in the source of a merge or pull
     *         request.
     *         </p>
     */
    public MergeHunkDetail getSource() {
        return source;
    }

    /**
     * <p>
     * Information about the merge hunk in the source of a merge or pull
     * request.
     * </p>
     *
     * @param source <p>
     *            Information about the merge hunk in the source of a merge or
     *            pull request.
     *            </p>
     */
    public void setSource(MergeHunkDetail source) {
        this.source = source;
    }

    /**
     * <p>
     * Information about the merge hunk in the source of a merge or pull
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param source <p>
     *            Information about the merge hunk in the source of a merge or
     *            pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeHunk withSource(MergeHunkDetail source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * Information about the merge hunk in the destination of a merge or pull
     * request.
     * </p>
     *
     * @return <p>
     *         Information about the merge hunk in the destination of a merge or
     *         pull request.
     *         </p>
     */
    public MergeHunkDetail getDestination() {
        return destination;
    }

    /**
     * <p>
     * Information about the merge hunk in the destination of a merge or pull
     * request.
     * </p>
     *
     * @param destination <p>
     *            Information about the merge hunk in the destination of a merge
     *            or pull request.
     *            </p>
     */
    public void setDestination(MergeHunkDetail destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * Information about the merge hunk in the destination of a merge or pull
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destination <p>
     *            Information about the merge hunk in the destination of a merge
     *            or pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeHunk withDestination(MergeHunkDetail destination) {
        this.destination = destination;
        return this;
    }

    /**
     * <p>
     * Information about the merge hunk in the base of a merge or pull request.
     * </p>
     *
     * @return <p>
     *         Information about the merge hunk in the base of a merge or pull
     *         request.
     *         </p>
     */
    public MergeHunkDetail getBase() {
        return base;
    }

    /**
     * <p>
     * Information about the merge hunk in the base of a merge or pull request.
     * </p>
     *
     * @param base <p>
     *            Information about the merge hunk in the base of a merge or
     *            pull request.
     *            </p>
     */
    public void setBase(MergeHunkDetail base) {
        this.base = base;
    }

    /**
     * <p>
     * Information about the merge hunk in the base of a merge or pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param base <p>
     *            Information about the merge hunk in the base of a merge or
     *            pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeHunk withBase(MergeHunkDetail base) {
        this.base = base;
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
        if (getIsConflict() != null)
            sb.append("isConflict: " + getIsConflict() + ",");
        if (getSource() != null)
            sb.append("source: " + getSource() + ",");
        if (getDestination() != null)
            sb.append("destination: " + getDestination() + ",");
        if (getBase() != null)
            sb.append("base: " + getBase());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsConflict() == null) ? 0 : getIsConflict().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getBase() == null) ? 0 : getBase().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergeHunk == false)
            return false;
        MergeHunk other = (MergeHunk) obj;

        if (other.getIsConflict() == null ^ this.getIsConflict() == null)
            return false;
        if (other.getIsConflict() != null
                && other.getIsConflict().equals(this.getIsConflict()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getBase() == null ^ this.getBase() == null)
            return false;
        if (other.getBase() != null && other.getBase().equals(this.getBase()) == false)
            return false;
        return true;
    }
}
