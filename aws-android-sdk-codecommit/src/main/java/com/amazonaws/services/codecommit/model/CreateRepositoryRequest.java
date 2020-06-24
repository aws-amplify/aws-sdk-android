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
 * Creates a new, empty repository.
 * </p>
 */
public class CreateRepositoryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the new repository to be created.
     * </p>
     * <note>
     * <p>
     * The repository name must be unique across the calling AWS account.
     * Repository names are limited to 100 alphanumeric, dash, and underscore
     * characters, and cannot include certain characters. For more information
     * about the limits on repository names, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html"
     * >Limits</a> in the <i>AWS CodeCommit User Guide</i>. The suffix .git is
     * prohibited.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * A comment or description about the new repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and
     * all valid Unicode characters. Applications that do not HTML-encode the
     * description and display it in a webpage can expose users to potentially
     * malicious code. Make sure that you HTML-encode the description field in
     * any application that uses this API to display the repository description
     * on a webpage.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String repositoryDescription;

    /**
     * <p>
     * One or more tag key-value pairs to use when tagging this repository.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the new repository to be created.
     * </p>
     * <note>
     * <p>
     * The repository name must be unique across the calling AWS account.
     * Repository names are limited to 100 alphanumeric, dash, and underscore
     * characters, and cannot include certain characters. For more information
     * about the limits on repository names, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html"
     * >Limits</a> in the <i>AWS CodeCommit User Guide</i>. The suffix .git is
     * prohibited.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the new repository to be created.
     *         </p>
     *         <note>
     *         <p>
     *         The repository name must be unique across the calling AWS
     *         account. Repository names are limited to 100 alphanumeric, dash,
     *         and underscore characters, and cannot include certain characters.
     *         For more information about the limits on repository names, see <a
     *         href=
     *         "https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html"
     *         >Limits</a> in the <i>AWS CodeCommit User Guide</i>. The suffix
     *         .git is prohibited.
     *         </p>
     *         </note>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the new repository to be created.
     * </p>
     * <note>
     * <p>
     * The repository name must be unique across the calling AWS account.
     * Repository names are limited to 100 alphanumeric, dash, and underscore
     * characters, and cannot include certain characters. For more information
     * about the limits on repository names, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html"
     * >Limits</a> in the <i>AWS CodeCommit User Guide</i>. The suffix .git is
     * prohibited.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the new repository to be created.
     *            </p>
     *            <note>
     *            <p>
     *            The repository name must be unique across the calling AWS
     *            account. Repository names are limited to 100 alphanumeric,
     *            dash, and underscore characters, and cannot include certain
     *            characters. For more information about the limits on
     *            repository names, see <a href=
     *            "https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html"
     *            >Limits</a> in the <i>AWS CodeCommit User Guide</i>. The
     *            suffix .git is prohibited.
     *            </p>
     *            </note>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the new repository to be created.
     * </p>
     * <note>
     * <p>
     * The repository name must be unique across the calling AWS account.
     * Repository names are limited to 100 alphanumeric, dash, and underscore
     * characters, and cannot include certain characters. For more information
     * about the limits on repository names, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html"
     * >Limits</a> in the <i>AWS CodeCommit User Guide</i>. The suffix .git is
     * prohibited.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the new repository to be created.
     *            </p>
     *            <note>
     *            <p>
     *            The repository name must be unique across the calling AWS
     *            account. Repository names are limited to 100 alphanumeric,
     *            dash, and underscore characters, and cannot include certain
     *            characters. For more information about the limits on
     *            repository names, see <a href=
     *            "https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html"
     *            >Limits</a> in the <i>AWS CodeCommit User Guide</i>. The
     *            suffix .git is prohibited.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRepositoryRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * A comment or description about the new repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and
     * all valid Unicode characters. Applications that do not HTML-encode the
     * description and display it in a webpage can expose users to potentially
     * malicious code. Make sure that you HTML-encode the description field in
     * any application that uses this API to display the repository description
     * on a webpage.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         A comment or description about the new repository.
     *         </p>
     *         <note>
     *         <p>
     *         The description field for a repository accepts all HTML
     *         characters and all valid Unicode characters. Applications that do
     *         not HTML-encode the description and display it in a webpage can
     *         expose users to potentially malicious code. Make sure that you
     *         HTML-encode the description field in any application that uses
     *         this API to display the repository description on a webpage.
     *         </p>
     *         </note>
     */
    public String getRepositoryDescription() {
        return repositoryDescription;
    }

    /**
     * <p>
     * A comment or description about the new repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and
     * all valid Unicode characters. Applications that do not HTML-encode the
     * description and display it in a webpage can expose users to potentially
     * malicious code. Make sure that you HTML-encode the description field in
     * any application that uses this API to display the repository description
     * on a webpage.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param repositoryDescription <p>
     *            A comment or description about the new repository.
     *            </p>
     *            <note>
     *            <p>
     *            The description field for a repository accepts all HTML
     *            characters and all valid Unicode characters. Applications that
     *            do not HTML-encode the description and display it in a webpage
     *            can expose users to potentially malicious code. Make sure that
     *            you HTML-encode the description field in any application that
     *            uses this API to display the repository description on a
     *            webpage.
     *            </p>
     *            </note>
     */
    public void setRepositoryDescription(String repositoryDescription) {
        this.repositoryDescription = repositoryDescription;
    }

    /**
     * <p>
     * A comment or description about the new repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and
     * all valid Unicode characters. Applications that do not HTML-encode the
     * description and display it in a webpage can expose users to potentially
     * malicious code. Make sure that you HTML-encode the description field in
     * any application that uses this API to display the repository description
     * on a webpage.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param repositoryDescription <p>
     *            A comment or description about the new repository.
     *            </p>
     *            <note>
     *            <p>
     *            The description field for a repository accepts all HTML
     *            characters and all valid Unicode characters. Applications that
     *            do not HTML-encode the description and display it in a webpage
     *            can expose users to potentially malicious code. Make sure that
     *            you HTML-encode the description field in any application that
     *            uses this API to display the repository description on a
     *            webpage.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRepositoryRequest withRepositoryDescription(String repositoryDescription) {
        this.repositoryDescription = repositoryDescription;
        return this;
    }

    /**
     * <p>
     * One or more tag key-value pairs to use when tagging this repository.
     * </p>
     *
     * @return <p>
     *         One or more tag key-value pairs to use when tagging this
     *         repository.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tag key-value pairs to use when tagging this repository.
     * </p>
     *
     * @param tags <p>
     *            One or more tag key-value pairs to use when tagging this
     *            repository.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more tag key-value pairs to use when tagging this repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tag key-value pairs to use when tagging this
     *            repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRepositoryRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * One or more tag key-value pairs to use when tagging this repository.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRepositoryRequest addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateRepositoryRequest cleartagsEntries() {
        this.tags = null;
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
            sb.append("repositoryDescription: " + getRepositoryDescription() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRepositoryRequest == false)
            return false;
        CreateRepositoryRequest other = (CreateRepositoryRequest) obj;

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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
