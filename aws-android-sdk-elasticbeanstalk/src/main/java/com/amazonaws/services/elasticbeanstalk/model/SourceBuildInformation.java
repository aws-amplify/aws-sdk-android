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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Location of the source code for an application version.
 * </p>
 */
public class SourceBuildInformation implements Serializable {
    /**
     * <p>
     * The type of repository.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Git</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Zip</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Git, Zip
     */
    private String sourceType;

    /**
     * <p>
     * Location where the repository is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CodeCommit</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CodeCommit, S3
     */
    private String sourceRepository;

    /**
     * <p>
     * The location of the source code, as a formatted string, depending on the
     * value of <code>SourceRepository</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>CodeCommit</code>, the format is the repository name and commit
     * ID, separated by a forward slash. For example,
     * <code>my-git-repo/265cfa0cf6af46153527f55d6503ec030551f57a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>S3</code>, the format is the S3 bucket name and object key,
     * separated by a forward slash. For example,
     * <code>my-s3-bucket/Folders/my-source-file</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>.+/.+<br/>
     */
    private String sourceLocation;

    /**
     * <p>
     * The type of repository.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Git</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Zip</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Git, Zip
     *
     * @return <p>
     *         The type of repository.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Git</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Zip</code>
     *         </p>
     *         </li>
     *         </ul>
     * @see SourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * <p>
     * The type of repository.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Git</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Zip</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Git, Zip
     *
     * @param sourceType <p>
     *            The type of repository.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Git</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Zip</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see SourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The type of repository.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Git</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Zip</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Git, Zip
     *
     * @param sourceType <p>
     *            The type of repository.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Git</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Zip</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceType
     */
    public SourceBuildInformation withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * <p>
     * The type of repository.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Git</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Zip</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Git, Zip
     *
     * @param sourceType <p>
     *            The type of repository.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Git</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Zip</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see SourceType
     */
    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
    }

    /**
     * <p>
     * The type of repository.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Git</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Zip</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Git, Zip
     *
     * @param sourceType <p>
     *            The type of repository.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Git</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Zip</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceType
     */
    public SourceBuildInformation withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * Location where the repository is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CodeCommit</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CodeCommit, S3
     *
     * @return <p>
     *         Location where the repository is stored.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CodeCommit</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>S3</code>
     *         </p>
     *         </li>
     *         </ul>
     * @see SourceRepository
     */
    public String getSourceRepository() {
        return sourceRepository;
    }

    /**
     * <p>
     * Location where the repository is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CodeCommit</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CodeCommit, S3
     *
     * @param sourceRepository <p>
     *            Location where the repository is stored.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CodeCommit</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>S3</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see SourceRepository
     */
    public void setSourceRepository(String sourceRepository) {
        this.sourceRepository = sourceRepository;
    }

    /**
     * <p>
     * Location where the repository is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CodeCommit</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CodeCommit, S3
     *
     * @param sourceRepository <p>
     *            Location where the repository is stored.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CodeCommit</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>S3</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceRepository
     */
    public SourceBuildInformation withSourceRepository(String sourceRepository) {
        this.sourceRepository = sourceRepository;
        return this;
    }

    /**
     * <p>
     * Location where the repository is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CodeCommit</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CodeCommit, S3
     *
     * @param sourceRepository <p>
     *            Location where the repository is stored.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CodeCommit</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>S3</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see SourceRepository
     */
    public void setSourceRepository(SourceRepository sourceRepository) {
        this.sourceRepository = sourceRepository.toString();
    }

    /**
     * <p>
     * Location where the repository is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CodeCommit</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CodeCommit, S3
     *
     * @param sourceRepository <p>
     *            Location where the repository is stored.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CodeCommit</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>S3</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceRepository
     */
    public SourceBuildInformation withSourceRepository(SourceRepository sourceRepository) {
        this.sourceRepository = sourceRepository.toString();
        return this;
    }

    /**
     * <p>
     * The location of the source code, as a formatted string, depending on the
     * value of <code>SourceRepository</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>CodeCommit</code>, the format is the repository name and commit
     * ID, separated by a forward slash. For example,
     * <code>my-git-repo/265cfa0cf6af46153527f55d6503ec030551f57a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>S3</code>, the format is the S3 bucket name and object key,
     * separated by a forward slash. For example,
     * <code>my-s3-bucket/Folders/my-source-file</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>.+/.+<br/>
     *
     * @return <p>
     *         The location of the source code, as a formatted string, depending
     *         on the value of <code>SourceRepository</code>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <code>CodeCommit</code>, the format is the repository name
     *         and commit ID, separated by a forward slash. For example,
     *         <code>my-git-repo/265cfa0cf6af46153527f55d6503ec030551f57a</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>S3</code>, the format is the S3 bucket name and object
     *         key, separated by a forward slash. For example,
     *         <code>my-s3-bucket/Folders/my-source-file</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSourceLocation() {
        return sourceLocation;
    }

    /**
     * <p>
     * The location of the source code, as a formatted string, depending on the
     * value of <code>SourceRepository</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>CodeCommit</code>, the format is the repository name and commit
     * ID, separated by a forward slash. For example,
     * <code>my-git-repo/265cfa0cf6af46153527f55d6503ec030551f57a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>S3</code>, the format is the S3 bucket name and object key,
     * separated by a forward slash. For example,
     * <code>my-s3-bucket/Folders/my-source-file</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>.+/.+<br/>
     *
     * @param sourceLocation <p>
     *            The location of the source code, as a formatted string,
     *            depending on the value of <code>SourceRepository</code>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For <code>CodeCommit</code>, the format is the repository name
     *            and commit ID, separated by a forward slash. For example,
     *            <code>my-git-repo/265cfa0cf6af46153527f55d6503ec030551f57a</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For <code>S3</code>, the format is the S3 bucket name and
     *            object key, separated by a forward slash. For example,
     *            <code>my-s3-bucket/Folders/my-source-file</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    /**
     * <p>
     * The location of the source code, as a formatted string, depending on the
     * value of <code>SourceRepository</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>CodeCommit</code>, the format is the repository name and commit
     * ID, separated by a forward slash. For example,
     * <code>my-git-repo/265cfa0cf6af46153527f55d6503ec030551f57a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>S3</code>, the format is the S3 bucket name and object key,
     * separated by a forward slash. For example,
     * <code>my-s3-bucket/Folders/my-source-file</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>.+/.+<br/>
     *
     * @param sourceLocation <p>
     *            The location of the source code, as a formatted string,
     *            depending on the value of <code>SourceRepository</code>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For <code>CodeCommit</code>, the format is the repository name
     *            and commit ID, separated by a forward slash. For example,
     *            <code>my-git-repo/265cfa0cf6af46153527f55d6503ec030551f57a</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For <code>S3</code>, the format is the S3 bucket name and
     *            object key, separated by a forward slash. For example,
     *            <code>my-s3-bucket/Folders/my-source-file</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceBuildInformation withSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
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
        if (getSourceType() != null)
            sb.append("SourceType: " + getSourceType() + ",");
        if (getSourceRepository() != null)
            sb.append("SourceRepository: " + getSourceRepository() + ",");
        if (getSourceLocation() != null)
            sb.append("SourceLocation: " + getSourceLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode
                + ((getSourceRepository() == null) ? 0 : getSourceRepository().hashCode());
        hashCode = prime * hashCode
                + ((getSourceLocation() == null) ? 0 : getSourceLocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceBuildInformation == false)
            return false;
        SourceBuildInformation other = (SourceBuildInformation) obj;

        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null
                && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getSourceRepository() == null ^ this.getSourceRepository() == null)
            return false;
        if (other.getSourceRepository() != null
                && other.getSourceRepository().equals(this.getSourceRepository()) == false)
            return false;
        if (other.getSourceLocation() == null ^ this.getSourceLocation() == null)
            return false;
        if (other.getSourceLocation() != null
                && other.getSourceLocation().equals(this.getSourceLocation()) == false)
            return false;
        return true;
    }
}
