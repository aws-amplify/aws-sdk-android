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
 * Information about the details of a merge hunk that contains a conflict in a
 * merge or pull request operation.
 * </p>
 */
public class MergeHunkDetail implements Serializable {
    /**
     * <p>
     * The start position of the hunk in the merge result.
     * </p>
     */
    private Integer startLine;

    /**
     * <p>
     * The end position of the hunk in the merge result.
     * </p>
     */
    private Integer endLine;

    /**
     * <p>
     * The base-64 encoded content of the hunk merged region that might contain
     * a conflict.
     * </p>
     */
    private String hunkContent;

    /**
     * <p>
     * The start position of the hunk in the merge result.
     * </p>
     *
     * @return <p>
     *         The start position of the hunk in the merge result.
     *         </p>
     */
    public Integer getStartLine() {
        return startLine;
    }

    /**
     * <p>
     * The start position of the hunk in the merge result.
     * </p>
     *
     * @param startLine <p>
     *            The start position of the hunk in the merge result.
     *            </p>
     */
    public void setStartLine(Integer startLine) {
        this.startLine = startLine;
    }

    /**
     * <p>
     * The start position of the hunk in the merge result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startLine <p>
     *            The start position of the hunk in the merge result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeHunkDetail withStartLine(Integer startLine) {
        this.startLine = startLine;
        return this;
    }

    /**
     * <p>
     * The end position of the hunk in the merge result.
     * </p>
     *
     * @return <p>
     *         The end position of the hunk in the merge result.
     *         </p>
     */
    public Integer getEndLine() {
        return endLine;
    }

    /**
     * <p>
     * The end position of the hunk in the merge result.
     * </p>
     *
     * @param endLine <p>
     *            The end position of the hunk in the merge result.
     *            </p>
     */
    public void setEndLine(Integer endLine) {
        this.endLine = endLine;
    }

    /**
     * <p>
     * The end position of the hunk in the merge result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endLine <p>
     *            The end position of the hunk in the merge result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeHunkDetail withEndLine(Integer endLine) {
        this.endLine = endLine;
        return this;
    }

    /**
     * <p>
     * The base-64 encoded content of the hunk merged region that might contain
     * a conflict.
     * </p>
     *
     * @return <p>
     *         The base-64 encoded content of the hunk merged region that might
     *         contain a conflict.
     *         </p>
     */
    public String getHunkContent() {
        return hunkContent;
    }

    /**
     * <p>
     * The base-64 encoded content of the hunk merged region that might contain
     * a conflict.
     * </p>
     *
     * @param hunkContent <p>
     *            The base-64 encoded content of the hunk merged region that
     *            might contain a conflict.
     *            </p>
     */
    public void setHunkContent(String hunkContent) {
        this.hunkContent = hunkContent;
    }

    /**
     * <p>
     * The base-64 encoded content of the hunk merged region that might contain
     * a conflict.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hunkContent <p>
     *            The base-64 encoded content of the hunk merged region that
     *            might contain a conflict.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeHunkDetail withHunkContent(String hunkContent) {
        this.hunkContent = hunkContent;
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
        if (getStartLine() != null)
            sb.append("startLine: " + getStartLine() + ",");
        if (getEndLine() != null)
            sb.append("endLine: " + getEndLine() + ",");
        if (getHunkContent() != null)
            sb.append("hunkContent: " + getHunkContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartLine() == null) ? 0 : getStartLine().hashCode());
        hashCode = prime * hashCode + ((getEndLine() == null) ? 0 : getEndLine().hashCode());
        hashCode = prime * hashCode
                + ((getHunkContent() == null) ? 0 : getHunkContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergeHunkDetail == false)
            return false;
        MergeHunkDetail other = (MergeHunkDetail) obj;

        if (other.getStartLine() == null ^ this.getStartLine() == null)
            return false;
        if (other.getStartLine() != null
                && other.getStartLine().equals(this.getStartLine()) == false)
            return false;
        if (other.getEndLine() == null ^ this.getEndLine() == null)
            return false;
        if (other.getEndLine() != null && other.getEndLine().equals(this.getEndLine()) == false)
            return false;
        if (other.getHunkContent() == null ^ this.getHunkContent() == null)
            return false;
        if (other.getHunkContent() != null
                && other.getHunkContent().equals(this.getHunkContent()) == false)
            return false;
        return true;
    }
}
