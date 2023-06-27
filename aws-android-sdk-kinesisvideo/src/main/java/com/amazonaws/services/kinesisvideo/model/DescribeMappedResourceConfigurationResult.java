/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

public class DescribeMappedResourceConfigurationResult implements Serializable {
    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage
     * configuration properties.
     * </p>
     */
    private java.util.List<MappedResourceConfigurationListItem> mappedResourceConfigurationList = new java.util.ArrayList<MappedResourceConfigurationListItem>();

    /**
     * <p>
     * The token that was used in the <code>NextToken</code>request to fetch the
     * next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage
     * configuration properties.
     * </p>
     *
     * @return <p>
     *         A structure that encapsulates, or contains, the media storage
     *         configuration properties.
     *         </p>
     */
    public java.util.List<MappedResourceConfigurationListItem> getMappedResourceConfigurationList() {
        return mappedResourceConfigurationList;
    }

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage
     * configuration properties.
     * </p>
     *
     * @param mappedResourceConfigurationList <p>
     *            A structure that encapsulates, or contains, the media storage
     *            configuration properties.
     *            </p>
     */
    public void setMappedResourceConfigurationList(
            java.util.Collection<MappedResourceConfigurationListItem> mappedResourceConfigurationList) {
        if (mappedResourceConfigurationList == null) {
            this.mappedResourceConfigurationList = null;
            return;
        }

        this.mappedResourceConfigurationList = new java.util.ArrayList<MappedResourceConfigurationListItem>(
                mappedResourceConfigurationList);
    }

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage
     * configuration properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mappedResourceConfigurationList <p>
     *            A structure that encapsulates, or contains, the media storage
     *            configuration properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMappedResourceConfigurationResult withMappedResourceConfigurationList(
            MappedResourceConfigurationListItem... mappedResourceConfigurationList) {
        if (getMappedResourceConfigurationList() == null) {
            this.mappedResourceConfigurationList = new java.util.ArrayList<MappedResourceConfigurationListItem>(
                    mappedResourceConfigurationList.length);
        }
        for (MappedResourceConfigurationListItem value : mappedResourceConfigurationList) {
            this.mappedResourceConfigurationList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage
     * configuration properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mappedResourceConfigurationList <p>
     *            A structure that encapsulates, or contains, the media storage
     *            configuration properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMappedResourceConfigurationResult withMappedResourceConfigurationList(
            java.util.Collection<MappedResourceConfigurationListItem> mappedResourceConfigurationList) {
        setMappedResourceConfigurationList(mappedResourceConfigurationList);
        return this;
    }

    /**
     * <p>
     * The token that was used in the <code>NextToken</code>request to fetch the
     * next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     *
     * @return <p>
     *         The token that was used in the <code>NextToken</code>request to
     *         fetch the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token that was used in the <code>NextToken</code>request to fetch the
     * next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     *
     * @param nextToken <p>
     *            The token that was used in the <code>NextToken</code>request
     *            to fetch the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that was used in the <code>NextToken</code>request to fetch the
     * next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     *
     * @param nextToken <p>
     *            The token that was used in the <code>NextToken</code>request
     *            to fetch the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMappedResourceConfigurationResult withNextToken(String nextToken) {
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
        if (getMappedResourceConfigurationList() != null)
            sb.append("MappedResourceConfigurationList: " + getMappedResourceConfigurationList()
                    + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMappedResourceConfigurationList() == null) ? 0
                        : getMappedResourceConfigurationList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMappedResourceConfigurationResult == false)
            return false;
        DescribeMappedResourceConfigurationResult other = (DescribeMappedResourceConfigurationResult) obj;

        if (other.getMappedResourceConfigurationList() == null
                ^ this.getMappedResourceConfigurationList() == null)
            return false;
        if (other.getMappedResourceConfigurationList() != null
                && other.getMappedResourceConfigurationList().equals(
                        this.getMappedResourceConfigurationList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
