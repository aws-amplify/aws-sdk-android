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
 * Information about a file added or updated as part of a commit.
 * </p>
 */
public class PutFileEntry implements Serializable {
    /**
     * <p>
     * The full path to the file in the repository, including the name of the
     * file.
     * </p>
     */
    private String filePath;

    /**
     * <p>
     * The extrapolated file mode permissions for the file. Valid values include
     * EXECUTABLE and NORMAL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     */
    private String fileMode;

    /**
     * <p>
     * The content of the file, if a source file is not specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     */
    private java.nio.ByteBuffer fileContent;

    /**
     * <p>
     * The name and full path of the file that contains the changes you want to
     * make as part of the commit, if you are not providing the file content
     * directly.
     * </p>
     */
    private SourceFileSpecifier sourceFile;

    /**
     * <p>
     * The full path to the file in the repository, including the name of the
     * file.
     * </p>
     *
     * @return <p>
     *         The full path to the file in the repository, including the name
     *         of the file.
     *         </p>
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * <p>
     * The full path to the file in the repository, including the name of the
     * file.
     * </p>
     *
     * @param filePath <p>
     *            The full path to the file in the repository, including the
     *            name of the file.
     *            </p>
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The full path to the file in the repository, including the name of the
     * file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filePath <p>
     *            The full path to the file in the repository, including the
     *            name of the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutFileEntry withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * <p>
     * The extrapolated file mode permissions for the file. Valid values include
     * EXECUTABLE and NORMAL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @return <p>
     *         The extrapolated file mode permissions for the file. Valid values
     *         include EXECUTABLE and NORMAL.
     *         </p>
     * @see FileModeTypeEnum
     */
    public String getFileMode() {
        return fileMode;
    }

    /**
     * <p>
     * The extrapolated file mode permissions for the file. Valid values include
     * EXECUTABLE and NORMAL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The extrapolated file mode permissions for the file. Valid
     *            values include EXECUTABLE and NORMAL.
     *            </p>
     * @see FileModeTypeEnum
     */
    public void setFileMode(String fileMode) {
        this.fileMode = fileMode;
    }

    /**
     * <p>
     * The extrapolated file mode permissions for the file. Valid values include
     * EXECUTABLE and NORMAL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The extrapolated file mode permissions for the file. Valid
     *            values include EXECUTABLE and NORMAL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public PutFileEntry withFileMode(String fileMode) {
        this.fileMode = fileMode;
        return this;
    }

    /**
     * <p>
     * The extrapolated file mode permissions for the file. Valid values include
     * EXECUTABLE and NORMAL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The extrapolated file mode permissions for the file. Valid
     *            values include EXECUTABLE and NORMAL.
     *            </p>
     * @see FileModeTypeEnum
     */
    public void setFileMode(FileModeTypeEnum fileMode) {
        this.fileMode = fileMode.toString();
    }

    /**
     * <p>
     * The extrapolated file mode permissions for the file. Valid values include
     * EXECUTABLE and NORMAL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The extrapolated file mode permissions for the file. Valid
     *            values include EXECUTABLE and NORMAL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public PutFileEntry withFileMode(FileModeTypeEnum fileMode) {
        this.fileMode = fileMode.toString();
        return this;
    }

    /**
     * <p>
     * The content of the file, if a source file is not specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     *
     * @return <p>
     *         The content of the file, if a source file is not specified.
     *         </p>
     */
    public java.nio.ByteBuffer getFileContent() {
        return fileContent;
    }

    /**
     * <p>
     * The content of the file, if a source file is not specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     *
     * @param fileContent <p>
     *            The content of the file, if a source file is not specified.
     *            </p>
     */
    public void setFileContent(java.nio.ByteBuffer fileContent) {
        this.fileContent = fileContent;
    }

    /**
     * <p>
     * The content of the file, if a source file is not specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     *
     * @param fileContent <p>
     *            The content of the file, if a source file is not specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutFileEntry withFileContent(java.nio.ByteBuffer fileContent) {
        this.fileContent = fileContent;
        return this;
    }

    /**
     * <p>
     * The name and full path of the file that contains the changes you want to
     * make as part of the commit, if you are not providing the file content
     * directly.
     * </p>
     *
     * @return <p>
     *         The name and full path of the file that contains the changes you
     *         want to make as part of the commit, if you are not providing the
     *         file content directly.
     *         </p>
     */
    public SourceFileSpecifier getSourceFile() {
        return sourceFile;
    }

    /**
     * <p>
     * The name and full path of the file that contains the changes you want to
     * make as part of the commit, if you are not providing the file content
     * directly.
     * </p>
     *
     * @param sourceFile <p>
     *            The name and full path of the file that contains the changes
     *            you want to make as part of the commit, if you are not
     *            providing the file content directly.
     *            </p>
     */
    public void setSourceFile(SourceFileSpecifier sourceFile) {
        this.sourceFile = sourceFile;
    }

    /**
     * <p>
     * The name and full path of the file that contains the changes you want to
     * make as part of the commit, if you are not providing the file content
     * directly.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceFile <p>
     *            The name and full path of the file that contains the changes
     *            you want to make as part of the commit, if you are not
     *            providing the file content directly.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutFileEntry withSourceFile(SourceFileSpecifier sourceFile) {
        this.sourceFile = sourceFile;
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
            sb.append("fileMode: " + getFileMode() + ",");
        if (getFileContent() != null)
            sb.append("fileContent: " + getFileContent() + ",");
        if (getSourceFile() != null)
            sb.append("sourceFile: " + getSourceFile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getFileMode() == null) ? 0 : getFileMode().hashCode());
        hashCode = prime * hashCode
                + ((getFileContent() == null) ? 0 : getFileContent().hashCode());
        hashCode = prime * hashCode + ((getSourceFile() == null) ? 0 : getSourceFile().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutFileEntry == false)
            return false;
        PutFileEntry other = (PutFileEntry) obj;

        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getFileMode() == null ^ this.getFileMode() == null)
            return false;
        if (other.getFileMode() != null && other.getFileMode().equals(this.getFileMode()) == false)
            return false;
        if (other.getFileContent() == null ^ this.getFileContent() == null)
            return false;
        if (other.getFileContent() != null
                && other.getFileContent().equals(this.getFileContent()) == false)
            return false;
        if (other.getSourceFile() == null ^ this.getSourceFile() == null)
            return false;
        if (other.getSourceFile() != null
                && other.getSourceFile().equals(this.getSourceFile()) == false)
            return false;
        return true;
    }
}
