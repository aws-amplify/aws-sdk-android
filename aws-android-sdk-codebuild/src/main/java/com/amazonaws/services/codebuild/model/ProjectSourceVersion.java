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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * A source identifier and its corresponding version.
 * </p>
 */
public class ProjectSourceVersion implements Serializable {
    /**
     * <p>
     * An identifier for a source in the build project.
     * </p>
     */
    private String sourceIdentifier;

    /**
     * <p>
     * The source version for the corresponding source identifier. If specified,
     * must be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * For GitHub: the commit ID, pull request ID, branch name, or tag name that
     * corresponds to the version of the source code you want to build. If a
     * pull request ID is specified, it must use the format
     * <code>pr/pull-request-ID</code> (for example, <code>pr/25</code>). If a
     * branch name is specified, the branch's HEAD commit ID is used. If not
     * specified, the default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Bitbucket: the commit ID, branch name, or tag name that corresponds
     * to the version of the source code you want to build. If a branch name is
     * specified, the branch's HEAD commit ID is used. If not specified, the
     * default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Simple Storage Service (Amazon S3): the version ID of the
     * object that represents the build input ZIP file to use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     * >Source Version Sample with CodeBuild</a> in the <i>AWS CodeBuild User
     * Guide</i>.
     * </p>
     */
    private String sourceVersion;

    /**
     * <p>
     * An identifier for a source in the build project.
     * </p>
     *
     * @return <p>
     *         An identifier for a source in the build project.
     *         </p>
     */
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    /**
     * <p>
     * An identifier for a source in the build project.
     * </p>
     *
     * @param sourceIdentifier <p>
     *            An identifier for a source in the build project.
     *            </p>
     */
    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * <p>
     * An identifier for a source in the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceIdentifier <p>
     *            An identifier for a source in the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectSourceVersion withSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }

    /**
     * <p>
     * The source version for the corresponding source identifier. If specified,
     * must be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * For GitHub: the commit ID, pull request ID, branch name, or tag name that
     * corresponds to the version of the source code you want to build. If a
     * pull request ID is specified, it must use the format
     * <code>pr/pull-request-ID</code> (for example, <code>pr/25</code>). If a
     * branch name is specified, the branch's HEAD commit ID is used. If not
     * specified, the default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Bitbucket: the commit ID, branch name, or tag name that corresponds
     * to the version of the source code you want to build. If a branch name is
     * specified, the branch's HEAD commit ID is used. If not specified, the
     * default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Simple Storage Service (Amazon S3): the version ID of the
     * object that represents the build input ZIP file to use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     * >Source Version Sample with CodeBuild</a> in the <i>AWS CodeBuild User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The source version for the corresponding source identifier. If
     *         specified, must be one of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For GitHub: the commit ID, pull request ID, branch name, or tag
     *         name that corresponds to the version of the source code you want
     *         to build. If a pull request ID is specified, it must use the
     *         format <code>pr/pull-request-ID</code> (for example,
     *         <code>pr/25</code>). If a branch name is specified, the branch's
     *         HEAD commit ID is used. If not specified, the default branch's
     *         HEAD commit ID is used.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Bitbucket: the commit ID, branch name, or tag name that
     *         corresponds to the version of the source code you want to build.
     *         If a branch name is specified, the branch's HEAD commit ID is
     *         used. If not specified, the default branch's HEAD commit ID is
     *         used.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Amazon Simple Storage Service (Amazon S3): the version ID of
     *         the object that represents the build input ZIP file to use.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     *         >Source Version Sample with CodeBuild</a> in the <i>AWS CodeBuild
     *         User Guide</i>.
     *         </p>
     */
    public String getSourceVersion() {
        return sourceVersion;
    }

    /**
     * <p>
     * The source version for the corresponding source identifier. If specified,
     * must be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * For GitHub: the commit ID, pull request ID, branch name, or tag name that
     * corresponds to the version of the source code you want to build. If a
     * pull request ID is specified, it must use the format
     * <code>pr/pull-request-ID</code> (for example, <code>pr/25</code>). If a
     * branch name is specified, the branch's HEAD commit ID is used. If not
     * specified, the default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Bitbucket: the commit ID, branch name, or tag name that corresponds
     * to the version of the source code you want to build. If a branch name is
     * specified, the branch's HEAD commit ID is used. If not specified, the
     * default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Simple Storage Service (Amazon S3): the version ID of the
     * object that represents the build input ZIP file to use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     * >Source Version Sample with CodeBuild</a> in the <i>AWS CodeBuild User
     * Guide</i>.
     * </p>
     *
     * @param sourceVersion <p>
     *            The source version for the corresponding source identifier. If
     *            specified, must be one of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For GitHub: the commit ID, pull request ID, branch name, or
     *            tag name that corresponds to the version of the source code
     *            you want to build. If a pull request ID is specified, it must
     *            use the format <code>pr/pull-request-ID</code> (for example,
     *            <code>pr/25</code>). If a branch name is specified, the
     *            branch's HEAD commit ID is used. If not specified, the default
     *            branch's HEAD commit ID is used.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For Bitbucket: the commit ID, branch name, or tag name that
     *            corresponds to the version of the source code you want to
     *            build. If a branch name is specified, the branch's HEAD commit
     *            ID is used. If not specified, the default branch's HEAD commit
     *            ID is used.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For Amazon Simple Storage Service (Amazon S3): the version ID
     *            of the object that represents the build input ZIP file to use.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     *            >Source Version Sample with CodeBuild</a> in the <i>AWS
     *            CodeBuild User Guide</i>.
     *            </p>
     */
    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * <p>
     * The source version for the corresponding source identifier. If specified,
     * must be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * For GitHub: the commit ID, pull request ID, branch name, or tag name that
     * corresponds to the version of the source code you want to build. If a
     * pull request ID is specified, it must use the format
     * <code>pr/pull-request-ID</code> (for example, <code>pr/25</code>). If a
     * branch name is specified, the branch's HEAD commit ID is used. If not
     * specified, the default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Bitbucket: the commit ID, branch name, or tag name that corresponds
     * to the version of the source code you want to build. If a branch name is
     * specified, the branch's HEAD commit ID is used. If not specified, the
     * default branch's HEAD commit ID is used.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Simple Storage Service (Amazon S3): the version ID of the
     * object that represents the build input ZIP file to use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     * >Source Version Sample with CodeBuild</a> in the <i>AWS CodeBuild User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceVersion <p>
     *            The source version for the corresponding source identifier. If
     *            specified, must be one of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For AWS CodeCommit: the commit ID, branch, or Git tag to use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For GitHub: the commit ID, pull request ID, branch name, or
     *            tag name that corresponds to the version of the source code
     *            you want to build. If a pull request ID is specified, it must
     *            use the format <code>pr/pull-request-ID</code> (for example,
     *            <code>pr/25</code>). If a branch name is specified, the
     *            branch's HEAD commit ID is used. If not specified, the default
     *            branch's HEAD commit ID is used.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For Bitbucket: the commit ID, branch name, or tag name that
     *            corresponds to the version of the source code you want to
     *            build. If a branch name is specified, the branch's HEAD commit
     *            ID is used. If not specified, the default branch's HEAD commit
     *            ID is used.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For Amazon Simple Storage Service (Amazon S3): the version ID
     *            of the object that represents the build input ZIP file to use.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html"
     *            >Source Version Sample with CodeBuild</a> in the <i>AWS
     *            CodeBuild User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectSourceVersion withSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
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
        if (getSourceIdentifier() != null)
            sb.append("sourceIdentifier: " + getSourceIdentifier() + ",");
        if (getSourceVersion() != null)
            sb.append("sourceVersion: " + getSourceVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceIdentifier() == null) ? 0 : getSourceIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getSourceVersion() == null) ? 0 : getSourceVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectSourceVersion == false)
            return false;
        ProjectSourceVersion other = (ProjectSourceVersion) obj;

        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null)
            return false;
        if (other.getSourceIdentifier() != null
                && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false)
            return false;
        if (other.getSourceVersion() == null ^ this.getSourceVersion() == null)
            return false;
        if (other.getSourceVersion() != null
                && other.getSourceVersion().equals(this.getSourceVersion()) == false)
            return false;
        return true;
    }
}
