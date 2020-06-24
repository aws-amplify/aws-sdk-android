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
 * Returns information about the location of a change or comment in the
 * comparison between two commits or a pull request.
 * </p>
 */
public class Location implements Serializable {
    /**
     * <p>
     * The name of the file being compared, including its extension and
     * subdirectory, if any.
     * </p>
     */
    private String filePath;

    /**
     * <p>
     * The position of a change in a compared file, in line number format.
     * </p>
     */
    private Long filePosition;

    /**
     * <p>
     * In a comparison of commits or a pull request, whether the change is in
     * the before or after of that comparison.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BEFORE, AFTER
     */
    private String relativeFileVersion;

    /**
     * <p>
     * The name of the file being compared, including its extension and
     * subdirectory, if any.
     * </p>
     *
     * @return <p>
     *         The name of the file being compared, including its extension and
     *         subdirectory, if any.
     *         </p>
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * <p>
     * The name of the file being compared, including its extension and
     * subdirectory, if any.
     * </p>
     *
     * @param filePath <p>
     *            The name of the file being compared, including its extension
     *            and subdirectory, if any.
     *            </p>
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The name of the file being compared, including its extension and
     * subdirectory, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filePath <p>
     *            The name of the file being compared, including its extension
     *            and subdirectory, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Location withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * <p>
     * The position of a change in a compared file, in line number format.
     * </p>
     *
     * @return <p>
     *         The position of a change in a compared file, in line number
     *         format.
     *         </p>
     */
    public Long getFilePosition() {
        return filePosition;
    }

    /**
     * <p>
     * The position of a change in a compared file, in line number format.
     * </p>
     *
     * @param filePosition <p>
     *            The position of a change in a compared file, in line number
     *            format.
     *            </p>
     */
    public void setFilePosition(Long filePosition) {
        this.filePosition = filePosition;
    }

    /**
     * <p>
     * The position of a change in a compared file, in line number format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filePosition <p>
     *            The position of a change in a compared file, in line number
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Location withFilePosition(Long filePosition) {
        this.filePosition = filePosition;
        return this;
    }

    /**
     * <p>
     * In a comparison of commits or a pull request, whether the change is in
     * the before or after of that comparison.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BEFORE, AFTER
     *
     * @return <p>
     *         In a comparison of commits or a pull request, whether the change
     *         is in the before or after of that comparison.
     *         </p>
     * @see RelativeFileVersionEnum
     */
    public String getRelativeFileVersion() {
        return relativeFileVersion;
    }

    /**
     * <p>
     * In a comparison of commits or a pull request, whether the change is in
     * the before or after of that comparison.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BEFORE, AFTER
     *
     * @param relativeFileVersion <p>
     *            In a comparison of commits or a pull request, whether the
     *            change is in the before or after of that comparison.
     *            </p>
     * @see RelativeFileVersionEnum
     */
    public void setRelativeFileVersion(String relativeFileVersion) {
        this.relativeFileVersion = relativeFileVersion;
    }

    /**
     * <p>
     * In a comparison of commits or a pull request, whether the change is in
     * the before or after of that comparison.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BEFORE, AFTER
     *
     * @param relativeFileVersion <p>
     *            In a comparison of commits or a pull request, whether the
     *            change is in the before or after of that comparison.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelativeFileVersionEnum
     */
    public Location withRelativeFileVersion(String relativeFileVersion) {
        this.relativeFileVersion = relativeFileVersion;
        return this;
    }

    /**
     * <p>
     * In a comparison of commits or a pull request, whether the change is in
     * the before or after of that comparison.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BEFORE, AFTER
     *
     * @param relativeFileVersion <p>
     *            In a comparison of commits or a pull request, whether the
     *            change is in the before or after of that comparison.
     *            </p>
     * @see RelativeFileVersionEnum
     */
    public void setRelativeFileVersion(RelativeFileVersionEnum relativeFileVersion) {
        this.relativeFileVersion = relativeFileVersion.toString();
    }

    /**
     * <p>
     * In a comparison of commits or a pull request, whether the change is in
     * the before or after of that comparison.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BEFORE, AFTER
     *
     * @param relativeFileVersion <p>
     *            In a comparison of commits or a pull request, whether the
     *            change is in the before or after of that comparison.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelativeFileVersionEnum
     */
    public Location withRelativeFileVersion(RelativeFileVersionEnum relativeFileVersion) {
        this.relativeFileVersion = relativeFileVersion.toString();
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
        if (getFilePosition() != null)
            sb.append("filePosition: " + getFilePosition() + ",");
        if (getRelativeFileVersion() != null)
            sb.append("relativeFileVersion: " + getRelativeFileVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode
                + ((getFilePosition() == null) ? 0 : getFilePosition().hashCode());
        hashCode = prime * hashCode
                + ((getRelativeFileVersion() == null) ? 0 : getRelativeFileVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Location == false)
            return false;
        Location other = (Location) obj;

        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getFilePosition() == null ^ this.getFilePosition() == null)
            return false;
        if (other.getFilePosition() != null
                && other.getFilePosition().equals(this.getFilePosition()) == false)
            return false;
        if (other.getRelativeFileVersion() == null ^ this.getRelativeFileVersion() == null)
            return false;
        if (other.getRelativeFileVersion() != null
                && other.getRelativeFileVersion().equals(this.getRelativeFileVersion()) == false)
            return false;
        return true;
    }
}
