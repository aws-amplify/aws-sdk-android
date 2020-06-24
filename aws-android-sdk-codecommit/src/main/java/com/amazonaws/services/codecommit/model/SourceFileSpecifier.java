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
 * Information about a source file that is part of changes made in a commit.
 * </p>
 */
public class SourceFileSpecifier implements Serializable {
    /**
     * <p>
     * The full path to the file, including the name of the file.
     * </p>
     */
    private String filePath;

    /**
     * <p>
     * Whether to remove the source file from the parent commit.
     * </p>
     */
    private Boolean isMove;

    /**
     * <p>
     * The full path to the file, including the name of the file.
     * </p>
     *
     * @return <p>
     *         The full path to the file, including the name of the file.
     *         </p>
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * <p>
     * The full path to the file, including the name of the file.
     * </p>
     *
     * @param filePath <p>
     *            The full path to the file, including the name of the file.
     *            </p>
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The full path to the file, including the name of the file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filePath <p>
     *            The full path to the file, including the name of the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceFileSpecifier withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * <p>
     * Whether to remove the source file from the parent commit.
     * </p>
     *
     * @return <p>
     *         Whether to remove the source file from the parent commit.
     *         </p>
     */
    public Boolean isIsMove() {
        return isMove;
    }

    /**
     * <p>
     * Whether to remove the source file from the parent commit.
     * </p>
     *
     * @return <p>
     *         Whether to remove the source file from the parent commit.
     *         </p>
     */
    public Boolean getIsMove() {
        return isMove;
    }

    /**
     * <p>
     * Whether to remove the source file from the parent commit.
     * </p>
     *
     * @param isMove <p>
     *            Whether to remove the source file from the parent commit.
     *            </p>
     */
    public void setIsMove(Boolean isMove) {
        this.isMove = isMove;
    }

    /**
     * <p>
     * Whether to remove the source file from the parent commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isMove <p>
     *            Whether to remove the source file from the parent commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceFileSpecifier withIsMove(Boolean isMove) {
        this.isMove = isMove;
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
        if (getFilePath() != null)
            sb.append("filePath: " + getFilePath() + ",");
        if (getIsMove() != null)
            sb.append("isMove: " + getIsMove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getIsMove() == null) ? 0 : getIsMove().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceFileSpecifier == false)
            return false;
        SourceFileSpecifier other = (SourceFileSpecifier) obj;

        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getIsMove() == null ^ this.getIsMove() == null)
            return false;
        if (other.getIsMove() != null && other.getIsMove().equals(this.getIsMove()) == false)
            return false;
        return true;
    }
}
