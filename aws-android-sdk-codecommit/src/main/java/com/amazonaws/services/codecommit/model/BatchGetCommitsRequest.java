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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about the contents of one or more commits in a
 * repository.
 * </p>
 */
public class BatchGetCommitsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The full commit IDs of the commits to get information about.
     * </p>
     * <note>
     * <p>
     * You must supply the full SHA IDs of each commit. You cannot use shortened
     * SHA IDs.
     * </p>
     * </note>
     */
    private java.util.List<String> commitIds;

    /**
     * <p>
     * The name of the repository that contains the commits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * The full commit IDs of the commits to get information about.
     * </p>
     * <note>
     * <p>
     * You must supply the full SHA IDs of each commit. You cannot use shortened
     * SHA IDs.
     * </p>
     * </note>
     *
     * @return <p>
     *         The full commit IDs of the commits to get information about.
     *         </p>
     *         <note>
     *         <p>
     *         You must supply the full SHA IDs of each commit. You cannot use
     *         shortened SHA IDs.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getCommitIds() {
        return commitIds;
    }

    /**
     * <p>
     * The full commit IDs of the commits to get information about.
     * </p>
     * <note>
     * <p>
     * You must supply the full SHA IDs of each commit. You cannot use shortened
     * SHA IDs.
     * </p>
     * </note>
     *
     * @param commitIds <p>
     *            The full commit IDs of the commits to get information about.
     *            </p>
     *            <note>
     *            <p>
     *            You must supply the full SHA IDs of each commit. You cannot
     *            use shortened SHA IDs.
     *            </p>
     *            </note>
     */
    public void setCommitIds(java.util.Collection<String> commitIds) {
        if (commitIds == null) {
            this.commitIds = null;
            return;
        }

        this.commitIds = new java.util.ArrayList<String>(commitIds);
    }

    /**
     * <p>
     * The full commit IDs of the commits to get information about.
     * </p>
     * <note>
     * <p>
     * You must supply the full SHA IDs of each commit. You cannot use shortened
     * SHA IDs.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitIds <p>
     *            The full commit IDs of the commits to get information about.
     *            </p>
     *            <note>
     *            <p>
     *            You must supply the full SHA IDs of each commit. You cannot
     *            use shortened SHA IDs.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCommitsRequest withCommitIds(String... commitIds) {
        if (getCommitIds() == null) {
            this.commitIds = new java.util.ArrayList<String>(commitIds.length);
        }
        for (String value : commitIds) {
            this.commitIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The full commit IDs of the commits to get information about.
     * </p>
     * <note>
     * <p>
     * You must supply the full SHA IDs of each commit. You cannot use shortened
     * SHA IDs.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitIds <p>
     *            The full commit IDs of the commits to get information about.
     *            </p>
     *            <note>
     *            <p>
     *            You must supply the full SHA IDs of each commit. You cannot
     *            use shortened SHA IDs.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCommitsRequest withCommitIds(java.util.Collection<String> commitIds) {
        setCommitIds(commitIds);
        return this;
    }

    /**
     * <p>
     * The name of the repository that contains the commits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository that contains the commits.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the commits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository that contains the commits.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the commits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository that contains the commits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCommitsRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
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
        if (getCommitIds() != null)
            sb.append("commitIds: " + getCommitIds() + ",");
        if (getRepositoryName() != null)
            sb.append("repositoryName: " + getRepositoryName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitIds() == null) ? 0 : getCommitIds().hashCode());
        hashCode = prime * hashCode
                + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetCommitsRequest == false)
            return false;
        BatchGetCommitsRequest other = (BatchGetCommitsRequest) obj;

        if (other.getCommitIds() == null ^ this.getCommitIds() == null)
            return false;
        if (other.getCommitIds() != null
                && other.getCommitIds().equals(this.getCommitIds()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        return true;
    }
}
