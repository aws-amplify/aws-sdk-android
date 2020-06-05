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

public class ListProvisioningArtifactsForServiceActionResult implements Serializable {
    /**
     * <p>
     * An array of objects with information about product views and provisioning
     * artifacts.
     * </p>
     */
    private java.util.List<ProvisioningArtifactView> provisioningArtifactViews;

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of objects with information about product views and provisioning
     * artifacts.
     * </p>
     *
     * @return <p>
     *         An array of objects with information about product views and
     *         provisioning artifacts.
     *         </p>
     */
    public java.util.List<ProvisioningArtifactView> getProvisioningArtifactViews() {
        return provisioningArtifactViews;
    }

    /**
     * <p>
     * An array of objects with information about product views and provisioning
     * artifacts.
     * </p>
     *
     * @param provisioningArtifactViews <p>
     *            An array of objects with information about product views and
     *            provisioning artifacts.
     *            </p>
     */
    public void setProvisioningArtifactViews(
            java.util.Collection<ProvisioningArtifactView> provisioningArtifactViews) {
        if (provisioningArtifactViews == null) {
            this.provisioningArtifactViews = null;
            return;
        }

        this.provisioningArtifactViews = new java.util.ArrayList<ProvisioningArtifactView>(
                provisioningArtifactViews);
    }

    /**
     * <p>
     * An array of objects with information about product views and provisioning
     * artifacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningArtifactViews <p>
     *            An array of objects with information about product views and
     *            provisioning artifacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProvisioningArtifactsForServiceActionResult withProvisioningArtifactViews(
            ProvisioningArtifactView... provisioningArtifactViews) {
        if (getProvisioningArtifactViews() == null) {
            this.provisioningArtifactViews = new java.util.ArrayList<ProvisioningArtifactView>(
                    provisioningArtifactViews.length);
        }
        for (ProvisioningArtifactView value : provisioningArtifactViews) {
            this.provisioningArtifactViews.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects with information about product views and provisioning
     * artifacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningArtifactViews <p>
     *            An array of objects with information about product views and
     *            provisioning artifacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProvisioningArtifactsForServiceActionResult withProvisioningArtifactViews(
            java.util.Collection<ProvisioningArtifactView> provisioningArtifactViews) {
        setProvisioningArtifactViews(provisioningArtifactViews);
        return this;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @return <p>
     *         The page token to use to retrieve the next set of results. If
     *         there are no additional results, this value is null.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param nextPageToken <p>
     *            The page token to use to retrieve the next set of results. If
     *            there are no additional results, this value is null.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param nextPageToken <p>
     *            The page token to use to retrieve the next set of results. If
     *            there are no additional results, this value is null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProvisioningArtifactsForServiceActionResult withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getProvisioningArtifactViews() != null)
            sb.append("ProvisioningArtifactViews: " + getProvisioningArtifactViews() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getProvisioningArtifactViews() == null) ? 0 : getProvisioningArtifactViews()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProvisioningArtifactsForServiceActionResult == false)
            return false;
        ListProvisioningArtifactsForServiceActionResult other = (ListProvisioningArtifactsForServiceActionResult) obj;

        if (other.getProvisioningArtifactViews() == null
                ^ this.getProvisioningArtifactViews() == null)
            return false;
        if (other.getProvisioningArtifactViews() != null
                && other.getProvisioningArtifactViews().equals(this.getProvisioningArtifactViews()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
