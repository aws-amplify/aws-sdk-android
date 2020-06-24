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
 * Information about a replacement content entry in the conflict of a merge or
 * pull request operation.
 * </p>
 */
public class ReplaceContentEntry implements Serializable {
    /**
     * <p>
     * The path of the conflicting file.
     * </p>
     */
    private String filePath;

    /**
     * <p>
     * The replacement type to use when determining how to resolve the conflict.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEEP_BASE, KEEP_SOURCE, KEEP_DESTINATION,
     * USE_NEW_CONTENT
     */
    private String replacementType;

    /**
     * <p>
     * The base-64 encoded content to use when the replacement type is
     * USE_NEW_CONTENT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     */
    private java.nio.ByteBuffer content;

    /**
     * <p>
     * The file mode to apply during conflict resoltion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     */
    private String fileMode;

    /**
     * <p>
     * The path of the conflicting file.
     * </p>
     *
     * @return <p>
     *         The path of the conflicting file.
     *         </p>
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * <p>
     * The path of the conflicting file.
     * </p>
     *
     * @param filePath <p>
     *            The path of the conflicting file.
     *            </p>
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The path of the conflicting file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filePath <p>
     *            The path of the conflicting file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplaceContentEntry withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * <p>
     * The replacement type to use when determining how to resolve the conflict.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEEP_BASE, KEEP_SOURCE, KEEP_DESTINATION,
     * USE_NEW_CONTENT
     *
     * @return <p>
     *         The replacement type to use when determining how to resolve the
     *         conflict.
     *         </p>
     * @see ReplacementTypeEnum
     */
    public String getReplacementType() {
        return replacementType;
    }

    /**
     * <p>
     * The replacement type to use when determining how to resolve the conflict.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEEP_BASE, KEEP_SOURCE, KEEP_DESTINATION,
     * USE_NEW_CONTENT
     *
     * @param replacementType <p>
     *            The replacement type to use when determining how to resolve
     *            the conflict.
     *            </p>
     * @see ReplacementTypeEnum
     */
    public void setReplacementType(String replacementType) {
        this.replacementType = replacementType;
    }

    /**
     * <p>
     * The replacement type to use when determining how to resolve the conflict.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEEP_BASE, KEEP_SOURCE, KEEP_DESTINATION,
     * USE_NEW_CONTENT
     *
     * @param replacementType <p>
     *            The replacement type to use when determining how to resolve
     *            the conflict.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReplacementTypeEnum
     */
    public ReplaceContentEntry withReplacementType(String replacementType) {
        this.replacementType = replacementType;
        return this;
    }

    /**
     * <p>
     * The replacement type to use when determining how to resolve the conflict.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEEP_BASE, KEEP_SOURCE, KEEP_DESTINATION,
     * USE_NEW_CONTENT
     *
     * @param replacementType <p>
     *            The replacement type to use when determining how to resolve
     *            the conflict.
     *            </p>
     * @see ReplacementTypeEnum
     */
    public void setReplacementType(ReplacementTypeEnum replacementType) {
        this.replacementType = replacementType.toString();
    }

    /**
     * <p>
     * The replacement type to use when determining how to resolve the conflict.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEEP_BASE, KEEP_SOURCE, KEEP_DESTINATION,
     * USE_NEW_CONTENT
     *
     * @param replacementType <p>
     *            The replacement type to use when determining how to resolve
     *            the conflict.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReplacementTypeEnum
     */
    public ReplaceContentEntry withReplacementType(ReplacementTypeEnum replacementType) {
        this.replacementType = replacementType.toString();
        return this;
    }

    /**
     * <p>
     * The base-64 encoded content to use when the replacement type is
     * USE_NEW_CONTENT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     *
     * @return <p>
     *         The base-64 encoded content to use when the replacement type is
     *         USE_NEW_CONTENT.
     *         </p>
     */
    public java.nio.ByteBuffer getContent() {
        return content;
    }

    /**
     * <p>
     * The base-64 encoded content to use when the replacement type is
     * USE_NEW_CONTENT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     *
     * @param content <p>
     *            The base-64 encoded content to use when the replacement type
     *            is USE_NEW_CONTENT.
     *            </p>
     */
    public void setContent(java.nio.ByteBuffer content) {
        this.content = content;
    }

    /**
     * <p>
     * The base-64 encoded content to use when the replacement type is
     * USE_NEW_CONTENT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     *
     * @param content <p>
     *            The base-64 encoded content to use when the replacement type
     *            is USE_NEW_CONTENT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplaceContentEntry withContent(java.nio.ByteBuffer content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * The file mode to apply during conflict resoltion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @return <p>
     *         The file mode to apply during conflict resoltion.
     *         </p>
     * @see FileModeTypeEnum
     */
    public String getFileMode() {
        return fileMode;
    }

    /**
     * <p>
     * The file mode to apply during conflict resoltion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The file mode to apply during conflict resoltion.
     *            </p>
     * @see FileModeTypeEnum
     */
    public void setFileMode(String fileMode) {
        this.fileMode = fileMode;
    }

    /**
     * <p>
     * The file mode to apply during conflict resoltion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The file mode to apply during conflict resoltion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public ReplaceContentEntry withFileMode(String fileMode) {
        this.fileMode = fileMode;
        return this;
    }

    /**
     * <p>
     * The file mode to apply during conflict resoltion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The file mode to apply during conflict resoltion.
     *            </p>
     * @see FileModeTypeEnum
     */
    public void setFileMode(FileModeTypeEnum fileMode) {
        this.fileMode = fileMode.toString();
    }

    /**
     * <p>
     * The file mode to apply during conflict resoltion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The file mode to apply during conflict resoltion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public ReplaceContentEntry withFileMode(FileModeTypeEnum fileMode) {
        this.fileMode = fileMode.toString();
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
        if (getReplacementType() != null)
            sb.append("replacementType: " + getReplacementType() + ",");
        if (getContent() != null)
            sb.append("content: " + getContent() + ",");
        if (getFileMode() != null)
            sb.append("fileMode: " + getFileMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode
                + ((getReplacementType() == null) ? 0 : getReplacementType().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getFileMode() == null) ? 0 : getFileMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplaceContentEntry == false)
            return false;
        ReplaceContentEntry other = (ReplaceContentEntry) obj;

        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getReplacementType() == null ^ this.getReplacementType() == null)
            return false;
        if (other.getReplacementType() != null
                && other.getReplacementType().equals(this.getReplacementType()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getFileMode() == null ^ this.getFileMode() == null)
            return false;
        if (other.getFileMode() != null && other.getFileMode().equals(this.getFileMode()) == false)
            return false;
        return true;
    }
}
