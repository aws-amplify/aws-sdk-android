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
 * Renames a repository. The repository name must be unique across the calling
 * AWS account. Repository names are limited to 100 alphanumeric, dash, and
 * underscore characters, and cannot include certain characters. The suffix .git
 * is prohibited. For more information about the limits on repository names, see
 * <a
 * href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">
 * Limits</a> in the AWS CodeCommit User Guide.
 * </p>
 */
public class UpdateRepositoryNameRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The current name of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String oldName;

    /**
     * <p>
     * The new name for the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String newName;

    /**
     * <p>
     * The current name of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The current name of the repository.
     *         </p>
     */
    public String getOldName() {
        return oldName;
    }

    /**
     * <p>
     * The current name of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param oldName <p>
     *            The current name of the repository.
     *            </p>
     */
    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    /**
     * <p>
     * The current name of the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param oldName <p>
     *            The current name of the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRepositoryNameRequest withOldName(String oldName) {
        this.oldName = oldName;
        return this;
    }

    /**
     * <p>
     * The new name for the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The new name for the repository.
     *         </p>
     */
    public String getNewName() {
        return newName;
    }

    /**
     * <p>
     * The new name for the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param newName <p>
     *            The new name for the repository.
     *            </p>
     */
    public void setNewName(String newName) {
        this.newName = newName;
    }

    /**
     * <p>
     * The new name for the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param newName <p>
     *            The new name for the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRepositoryNameRequest withNewName(String newName) {
        this.newName = newName;
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
        if (getOldName() != null)
            sb.append("oldName: " + getOldName() + ",");
        if (getNewName() != null)
            sb.append("newName: " + getNewName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOldName() == null) ? 0 : getOldName().hashCode());
        hashCode = prime * hashCode + ((getNewName() == null) ? 0 : getNewName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRepositoryNameRequest == false)
            return false;
        UpdateRepositoryNameRequest other = (UpdateRepositoryNameRequest) obj;

        if (other.getOldName() == null ^ this.getOldName() == null)
            return false;
        if (other.getOldName() != null && other.getOldName().equals(this.getOldName()) == false)
            return false;
        if (other.getNewName() == null ^ this.getNewName() == null)
            return false;
        if (other.getNewName() != null && other.getNewName().equals(this.getNewName()) == false)
            return false;
        return true;
    }
}
