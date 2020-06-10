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

package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;

public class GetRepositoryEndpointResult implements Serializable {
    /**
     * <p>
     * A string that specifies the URL of the returned endpoint.
     * </p>
     */
    private String repositoryEndpoint;

    /**
     * <p>
     * A string that specifies the URL of the returned endpoint.
     * </p>
     *
     * @return <p>
     *         A string that specifies the URL of the returned endpoint.
     *         </p>
     */
    public String getRepositoryEndpoint() {
        return repositoryEndpoint;
    }

    /**
     * <p>
     * A string that specifies the URL of the returned endpoint.
     * </p>
     *
     * @param repositoryEndpoint <p>
     *            A string that specifies the URL of the returned endpoint.
     *            </p>
     */
    public void setRepositoryEndpoint(String repositoryEndpoint) {
        this.repositoryEndpoint = repositoryEndpoint;
    }

    /**
     * <p>
     * A string that specifies the URL of the returned endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repositoryEndpoint <p>
     *            A string that specifies the URL of the returned endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRepositoryEndpointResult withRepositoryEndpoint(String repositoryEndpoint) {
        this.repositoryEndpoint = repositoryEndpoint;
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
        if (getRepositoryEndpoint() != null)
            sb.append("repositoryEndpoint: " + getRepositoryEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRepositoryEndpoint() == null) ? 0 : getRepositoryEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRepositoryEndpointResult == false)
            return false;
        GetRepositoryEndpointResult other = (GetRepositoryEndpointResult) obj;

        if (other.getRepositoryEndpoint() == null ^ this.getRepositoryEndpoint() == null)
            return false;
        if (other.getRepositoryEndpoint() != null
                && other.getRepositoryEndpoint().equals(this.getRepositoryEndpoint()) == false)
            return false;
        return true;
    }
}
