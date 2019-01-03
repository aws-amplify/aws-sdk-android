/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

public class ListResourceServersResult implements Serializable {
    /**
     * <p>
     * The resource servers.
     * </p>
     */
    private java.util.List<ResourceServerType> resourceServers;

    /**
     * <p>
     * A pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The resource servers.
     * </p>
     *
     * @return <p>
     *         The resource servers.
     *         </p>
     */
    public java.util.List<ResourceServerType> getResourceServers() {
        return resourceServers;
    }

    /**
     * <p>
     * The resource servers.
     * </p>
     *
     * @param resourceServers <p>
     *            The resource servers.
     *            </p>
     */
    public void setResourceServers(java.util.Collection<ResourceServerType> resourceServers) {
        if (resourceServers == null) {
            this.resourceServers = null;
            return;
        }

        this.resourceServers = new java.util.ArrayList<ResourceServerType>(resourceServers);
    }

    /**
     * <p>
     * The resource servers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceServers <p>
     *            The resource servers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceServersResult withResourceServers(ResourceServerType... resourceServers) {
        if (getResourceServers() == null) {
            this.resourceServers = new java.util.ArrayList<ResourceServerType>(
                    resourceServers.length);
        }
        for (ResourceServerType value : resourceServers) {
            this.resourceServers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The resource servers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceServers <p>
     *            The resource servers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceServersResult withResourceServers(
            java.util.Collection<ResourceServerType> resourceServers) {
        setResourceServers(resourceServers);
        return this;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return <p>
     *         A pagination token.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param nextToken <p>
     *            A pagination token.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param nextToken <p>
     *            A pagination token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceServersResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getResourceServers() != null)
            sb.append("ResourceServers: " + getResourceServers() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceServers() == null) ? 0 : getResourceServers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourceServersResult == false)
            return false;
        ListResourceServersResult other = (ListResourceServersResult) obj;

        if (other.getResourceServers() == null ^ this.getResourceServers() == null)
            return false;
        if (other.getResourceServers() != null
                && other.getResourceServers().equals(this.getResourceServers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
