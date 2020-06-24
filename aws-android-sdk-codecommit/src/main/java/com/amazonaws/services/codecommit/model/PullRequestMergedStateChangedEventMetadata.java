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
 * Returns information about the change in the merge state for a pull request
 * event.
 * </p>
 */
public class PullRequestMergedStateChangedEventMetadata implements Serializable {
    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * The name of the branch that the pull request is merged into.
     * </p>
     */
    private String destinationReference;

    /**
     * <p>
     * Information about the merge state change event.
     * </p>
     */
    private MergeMetadata mergeMetadata;

    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository where the pull request was created.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository where the pull request was created.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where the pull request was created.
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
     *            The name of the repository where the pull request was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestMergedStateChangedEventMetadata withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * The name of the branch that the pull request is merged into.
     * </p>
     *
     * @return <p>
     *         The name of the branch that the pull request is merged into.
     *         </p>
     */
    public String getDestinationReference() {
        return destinationReference;
    }

    /**
     * <p>
     * The name of the branch that the pull request is merged into.
     * </p>
     *
     * @param destinationReference <p>
     *            The name of the branch that the pull request is merged into.
     *            </p>
     */
    public void setDestinationReference(String destinationReference) {
        this.destinationReference = destinationReference;
    }

    /**
     * <p>
     * The name of the branch that the pull request is merged into.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationReference <p>
     *            The name of the branch that the pull request is merged into.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestMergedStateChangedEventMetadata withDestinationReference(
            String destinationReference) {
        this.destinationReference = destinationReference;
        return this;
    }

    /**
     * <p>
     * Information about the merge state change event.
     * </p>
     *
     * @return <p>
     *         Information about the merge state change event.
     *         </p>
     */
    public MergeMetadata getMergeMetadata() {
        return mergeMetadata;
    }

    /**
     * <p>
     * Information about the merge state change event.
     * </p>
     *
     * @param mergeMetadata <p>
     *            Information about the merge state change event.
     *            </p>
     */
    public void setMergeMetadata(MergeMetadata mergeMetadata) {
        this.mergeMetadata = mergeMetadata;
    }

    /**
     * <p>
     * Information about the merge state change event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mergeMetadata <p>
     *            Information about the merge state change event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestMergedStateChangedEventMetadata withMergeMetadata(MergeMetadata mergeMetadata) {
        this.mergeMetadata = mergeMetadata;
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
        if (getDestinationReference() != null)
            sb.append("destinationReference: " + getDestinationReference() + ",");
        if (getMergeMetadata() != null)
            sb.append("mergeMetadata: " + getMergeMetadata());
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
                + ((getDestinationReference() == null) ? 0 : getDestinationReference().hashCode());
        hashCode = prime * hashCode
                + ((getMergeMetadata() == null) ? 0 : getMergeMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PullRequestMergedStateChangedEventMetadata == false)
            return false;
        PullRequestMergedStateChangedEventMetadata other = (PullRequestMergedStateChangedEventMetadata) obj;

        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getDestinationReference() == null ^ this.getDestinationReference() == null)
            return false;
        if (other.getDestinationReference() != null
                && other.getDestinationReference().equals(this.getDestinationReference()) == false)
            return false;
        if (other.getMergeMetadata() == null ^ this.getMergeMetadata() == null)
            return false;
        if (other.getMergeMetadata() != null
                && other.getMergeMetadata().equals(this.getMergeMetadata()) == false)
            return false;
        return true;
    }
}
