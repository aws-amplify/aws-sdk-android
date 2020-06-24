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
 * Sets or changes the comment or description for a repository.
 * </p>
 * <note>
 * <p>
 * The description field for a repository accepts all HTML characters and all
 * valid Unicode characters. Applications that do not HTML-encode the
 * description and display it in a webpage can expose users to potentially
 * malicious code. Make sure that you HTML-encode the description field in any
 * application that uses this API to display the repository description on a
 * webpage.
 * </p>
 * </note>
 */
public class UpdateRepositoryDescriptionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the repository to set or change the comment or description
     * for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * The new comment or description for the specified repository. Repository
     * descriptions are limited to 1,000 characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String repositoryDescription;

    /**
     * <p>
     * The name of the repository to set or change the comment or description
     * for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository to set or change the comment or
     *         description for.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository to set or change the comment or description
     * for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository to set or change the comment or
     *            description for.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository to set or change the comment or description
     * for.
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
     *            The name of the repository to set or change the comment or
     *            description for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRepositoryDescriptionRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * The new comment or description for the specified repository. Repository
     * descriptions are limited to 1,000 characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The new comment or description for the specified repository.
     *         Repository descriptions are limited to 1,000 characters.
     *         </p>
     */
    public String getRepositoryDescription() {
        return repositoryDescription;
    }

    /**
     * <p>
     * The new comment or description for the specified repository. Repository
     * descriptions are limited to 1,000 characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param repositoryDescription <p>
     *            The new comment or description for the specified repository.
     *            Repository descriptions are limited to 1,000 characters.
     *            </p>
     */
    public void setRepositoryDescription(String repositoryDescription) {
        this.repositoryDescription = repositoryDescription;
    }

    /**
     * <p>
     * The new comment or description for the specified repository. Repository
     * descriptions are limited to 1,000 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param repositoryDescription <p>
     *            The new comment or description for the specified repository.
     *            Repository descriptions are limited to 1,000 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRepositoryDescriptionRequest withRepositoryDescription(String repositoryDescription) {
        this.repositoryDescription = repositoryDescription;
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
        if (getRepositoryDescription() != null)
            sb.append("repositoryDescription: " + getRepositoryDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime
                * hashCode
                + ((getRepositoryDescription() == null) ? 0 : getRepositoryDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRepositoryDescriptionRequest == false)
            return false;
        UpdateRepositoryDescriptionRequest other = (UpdateRepositoryDescriptionRequest) obj;

        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getRepositoryDescription() == null ^ this.getRepositoryDescription() == null)
            return false;
        if (other.getRepositoryDescription() != null
                && other.getRepositoryDescription().equals(this.getRepositoryDescription()) == false)
            return false;
        return true;
    }
}
