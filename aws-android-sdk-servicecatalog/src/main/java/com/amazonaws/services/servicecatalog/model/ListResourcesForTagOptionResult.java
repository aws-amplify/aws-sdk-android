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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

public class ListResourcesForTagOptionResult implements Serializable {
    /**
     * <p>
     * Information about the resources.
     * </p>
     */
    private java.util.List<ResourceDetail> resourceDetails;

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     */
    private String pageToken;

    /**
     * <p>
     * Information about the resources.
     * </p>
     *
     * @return <p>
     *         Information about the resources.
     *         </p>
     */
    public java.util.List<ResourceDetail> getResourceDetails() {
        return resourceDetails;
    }

    /**
     * <p>
     * Information about the resources.
     * </p>
     *
     * @param resourceDetails <p>
     *            Information about the resources.
     *            </p>
     */
    public void setResourceDetails(java.util.Collection<ResourceDetail> resourceDetails) {
        if (resourceDetails == null) {
            this.resourceDetails = null;
            return;
        }

        this.resourceDetails = new java.util.ArrayList<ResourceDetail>(resourceDetails);
    }

    /**
     * <p>
     * Information about the resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceDetails <p>
     *            Information about the resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourcesForTagOptionResult withResourceDetails(ResourceDetail... resourceDetails) {
        if (getResourceDetails() == null) {
            this.resourceDetails = new java.util.ArrayList<ResourceDetail>(resourceDetails.length);
        }
        for (ResourceDetail value : resourceDetails) {
            this.resourceDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceDetails <p>
     *            Information about the resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourcesForTagOptionResult withResourceDetails(
            java.util.Collection<ResourceDetail> resourceDetails) {
        setResourceDetails(resourceDetails);
        return this;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @return <p>
     *         The page token for the next set of results. To retrieve the first
     *         set of results, use null.
     *         </p>
     */
    public String getPageToken() {
        return pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param pageToken <p>
     *            The page token for the next set of results. To retrieve the
     *            first set of results, use null.
     *            </p>
     */
    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param pageToken <p>
     *            The page token for the next set of results. To retrieve the
     *            first set of results, use null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourcesForTagOptionResult withPageToken(String pageToken) {
        this.pageToken = pageToken;
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
        if (getResourceDetails() != null)
            sb.append("ResourceDetails: " + getResourceDetails() + ",");
        if (getPageToken() != null)
            sb.append("PageToken: " + getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceDetails() == null) ? 0 : getResourceDetails().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourcesForTagOptionResult == false)
            return false;
        ListResourcesForTagOptionResult other = (ListResourcesForTagOptionResult) obj;

        if (other.getResourceDetails() == null ^ this.getResourceDetails() == null)
            return false;
        if (other.getResourceDetails() != null
                && other.getResourceDetails().equals(this.getResourceDetails()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null
                && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }
}
