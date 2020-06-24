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
 * Information about the file mode changes.
 * </p>
 */
public class SetFileModeEntry implements Serializable {
    /**
     * <p>
     * The full path to the file, including the name of the file.
     * </p>
     */
    private String filePath;

    /**
     * <p>
     * The file mode for the file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     */
    private String fileMode;

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
    public SetFileModeEntry withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * <p>
     * The file mode for the file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @return <p>
     *         The file mode for the file.
     *         </p>
     * @see FileModeTypeEnum
     */
    public String getFileMode() {
        return fileMode;
    }

    /**
     * <p>
     * The file mode for the file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The file mode for the file.
     *            </p>
     * @see FileModeTypeEnum
     */
    public void setFileMode(String fileMode) {
        this.fileMode = fileMode;
    }

    /**
     * <p>
     * The file mode for the file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The file mode for the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public SetFileModeEntry withFileMode(String fileMode) {
        this.fileMode = fileMode;
        return this;
    }

    /**
     * <p>
     * The file mode for the file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The file mode for the file.
     *            </p>
     * @see FileModeTypeEnum
     */
    public void setFileMode(FileModeTypeEnum fileMode) {
        this.fileMode = fileMode.toString();
    }

    /**
     * <p>
     * The file mode for the file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The file mode for the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public SetFileModeEntry withFileMode(FileModeTypeEnum fileMode) {
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
        hashCode = prime * hashCode + ((getFileMode() == null) ? 0 : getFileMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetFileModeEntry == false)
            return false;
        SetFileModeEntry other = (SetFileModeEntry) obj;

        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getFileMode() == null ^ this.getFileMode() == null)
            return false;
        if (other.getFileMode() != null && other.getFileMode().equals(this.getFileMode()) == false)
            return false;
        return true;
    }
}
