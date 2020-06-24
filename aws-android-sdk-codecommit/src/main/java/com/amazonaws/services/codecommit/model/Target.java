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
 * Returns information about a target for a pull request.
 * </p>
 */
public class Target implements Serializable {
    /**
     * <p>
     * The name of the repository that contains the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * The branch of the repository that contains the changes for the pull
     * request. Also known as the source branch.
     * </p>
     */
    private String sourceReference;

    /**
     * <p>
     * The branch of the repository where the pull request changes are merged.
     * Also known as the destination branch.
     * </p>
     */
    private String destinationReference;

    /**
     * <p>
     * The name of the repository that contains the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository that contains the pull request.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository that contains the pull request.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the pull request.
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
     *            The name of the repository that contains the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Target withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * The branch of the repository that contains the changes for the pull
     * request. Also known as the source branch.
     * </p>
     *
     * @return <p>
     *         The branch of the repository that contains the changes for the
     *         pull request. Also known as the source branch.
     *         </p>
     */
    public String getSourceReference() {
        return sourceReference;
    }

    /**
     * <p>
     * The branch of the repository that contains the changes for the pull
     * request. Also known as the source branch.
     * </p>
     *
     * @param sourceReference <p>
     *            The branch of the repository that contains the changes for the
     *            pull request. Also known as the source branch.
     *            </p>
     */
    public void setSourceReference(String sourceReference) {
        this.sourceReference = sourceReference;
    }

    /**
     * <p>
     * The branch of the repository that contains the changes for the pull
     * request. Also known as the source branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceReference <p>
     *            The branch of the repository that contains the changes for the
     *            pull request. Also known as the source branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Target withSourceReference(String sourceReference) {
        this.sourceReference = sourceReference;
        return this;
    }

    /**
     * <p>
     * The branch of the repository where the pull request changes are merged.
     * Also known as the destination branch.
     * </p>
     *
     * @return <p>
     *         The branch of the repository where the pull request changes are
     *         merged. Also known as the destination branch.
     *         </p>
     */
    public String getDestinationReference() {
        return destinationReference;
    }

    /**
     * <p>
     * The branch of the repository where the pull request changes are merged.
     * Also known as the destination branch.
     * </p>
     *
     * @param destinationReference <p>
     *            The branch of the repository where the pull request changes
     *            are merged. Also known as the destination branch.
     *            </p>
     */
    public void setDestinationReference(String destinationReference) {
        this.destinationReference = destinationReference;
    }

    /**
     * <p>
     * The branch of the repository where the pull request changes are merged.
     * Also known as the destination branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationReference <p>
     *            The branch of the repository where the pull request changes
     *            are merged. Also known as the destination branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Target withDestinationReference(String destinationReference) {
        this.destinationReference = destinationReference;
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
        if (getRepositoryName() != null)
            sb.append("repositoryName: " + getRepositoryName() + ",");
        if (getSourceReference() != null)
            sb.append("sourceReference: " + getSourceReference() + ",");
        if (getDestinationReference() != null)
            sb.append("destinationReference: " + getDestinationReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode
                + ((getSourceReference() == null) ? 0 : getSourceReference().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationReference() == null) ? 0 : getDestinationReference().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Target == false)
            return false;
        Target other = (Target) obj;

        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getSourceReference() == null ^ this.getSourceReference() == null)
            return false;
        if (other.getSourceReference() != null
                && other.getSourceReference().equals(this.getSourceReference()) == false)
            return false;
        if (other.getDestinationReference() == null ^ this.getDestinationReference() == null)
            return false;
        if (other.getDestinationReference() != null
                && other.getDestinationReference().equals(this.getDestinationReference()) == false)
            return false;
        return true;
    }
}
