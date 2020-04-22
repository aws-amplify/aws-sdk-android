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

package com.amazonaws.services.amazoncodegurureviewer.model;

import java.io.Serializable;

/**
 * <p>
 * The commit diff for the pull request.
 * </p>
 */
public class CommitDiffSourceCodeType implements Serializable {
    /**
     * <p>
     * Source Commit SHA.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     */
    private String sourceCommit;

    /**
     * <p>
     * Destination Commit SHA
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     */
    private String destinationCommit;

    /**
     * <p>
     * Source Commit SHA.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     *
     * @return <p>
     *         Source Commit SHA.
     *         </p>
     */
    public String getSourceCommit() {
        return sourceCommit;
    }

    /**
     * <p>
     * Source Commit SHA.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     *
     * @param sourceCommit <p>
     *            Source Commit SHA.
     *            </p>
     */
    public void setSourceCommit(String sourceCommit) {
        this.sourceCommit = sourceCommit;
    }

    /**
     * <p>
     * Source Commit SHA.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     *
     * @param sourceCommit <p>
     *            Source Commit SHA.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommitDiffSourceCodeType withSourceCommit(String sourceCommit) {
        this.sourceCommit = sourceCommit;
        return this;
    }

    /**
     * <p>
     * Destination Commit SHA
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     *
     * @return <p>
     *         Destination Commit SHA
     *         </p>
     */
    public String getDestinationCommit() {
        return destinationCommit;
    }

    /**
     * <p>
     * Destination Commit SHA
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     *
     * @param destinationCommit <p>
     *            Destination Commit SHA
     *            </p>
     */
    public void setDestinationCommit(String destinationCommit) {
        this.destinationCommit = destinationCommit;
    }

    /**
     * <p>
     * Destination Commit SHA
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     *
     * @param destinationCommit <p>
     *            Destination Commit SHA
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommitDiffSourceCodeType withDestinationCommit(String destinationCommit) {
        this.destinationCommit = destinationCommit;
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
        if (getSourceCommit() != null)
            sb.append("SourceCommit: " + getSourceCommit() + ",");
        if (getDestinationCommit() != null)
            sb.append("DestinationCommit: " + getDestinationCommit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceCommit() == null) ? 0 : getSourceCommit().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationCommit() == null) ? 0 : getDestinationCommit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommitDiffSourceCodeType == false)
            return false;
        CommitDiffSourceCodeType other = (CommitDiffSourceCodeType) obj;

        if (other.getSourceCommit() == null ^ this.getSourceCommit() == null)
            return false;
        if (other.getSourceCommit() != null
                && other.getSourceCommit().equals(this.getSourceCommit()) == false)
            return false;
        if (other.getDestinationCommit() == null ^ this.getDestinationCommit() == null)
            return false;
        if (other.getDestinationCommit() != null
                && other.getDestinationCommit().equals(this.getDestinationCommit()) == false)
            return false;
        return true;
    }
}
