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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

public class CreatePresignedNotebookInstanceUrlResult implements Serializable {
    /**
     * <p>
     * A JSON object that contains the URL string.
     * </p>
     */
    private String authorizedUrl;

    /**
     * <p>
     * A JSON object that contains the URL string.
     * </p>
     *
     * @return <p>
     *         A JSON object that contains the URL string.
     *         </p>
     */
    public String getAuthorizedUrl() {
        return authorizedUrl;
    }

    /**
     * <p>
     * A JSON object that contains the URL string.
     * </p>
     *
     * @param authorizedUrl <p>
     *            A JSON object that contains the URL string.
     *            </p>
     */
    public void setAuthorizedUrl(String authorizedUrl) {
        this.authorizedUrl = authorizedUrl;
    }

    /**
     * <p>
     * A JSON object that contains the URL string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizedUrl <p>
     *            A JSON object that contains the URL string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePresignedNotebookInstanceUrlResult withAuthorizedUrl(String authorizedUrl) {
        this.authorizedUrl = authorizedUrl;
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
        if (getAuthorizedUrl() != null)
            sb.append("AuthorizedUrl: " + getAuthorizedUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAuthorizedUrl() == null) ? 0 : getAuthorizedUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePresignedNotebookInstanceUrlResult == false)
            return false;
        CreatePresignedNotebookInstanceUrlResult other = (CreatePresignedNotebookInstanceUrlResult) obj;

        if (other.getAuthorizedUrl() == null ^ this.getAuthorizedUrl() == null)
            return false;
        if (other.getAuthorizedUrl() != null
                && other.getAuthorizedUrl().equals(this.getAuthorizedUrl()) == false)
            return false;
        return true;
    }
}
