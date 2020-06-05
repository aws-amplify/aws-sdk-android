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

public class ListServiceActionsResult implements Serializable {
    /**
     * <p>
     * An object containing information about the service actions associated
     * with the provisioning artifact.
     * </p>
     */
    private java.util.List<ServiceActionSummary> serviceActionSummaries;

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
     * An object containing information about the service actions associated
     * with the provisioning artifact.
     * </p>
     *
     * @return <p>
     *         An object containing information about the service actions
     *         associated with the provisioning artifact.
     *         </p>
     */
    public java.util.List<ServiceActionSummary> getServiceActionSummaries() {
        return serviceActionSummaries;
    }

    /**
     * <p>
     * An object containing information about the service actions associated
     * with the provisioning artifact.
     * </p>
     *
     * @param serviceActionSummaries <p>
     *            An object containing information about the service actions
     *            associated with the provisioning artifact.
     *            </p>
     */
    public void setServiceActionSummaries(
            java.util.Collection<ServiceActionSummary> serviceActionSummaries) {
        if (serviceActionSummaries == null) {
            this.serviceActionSummaries = null;
            return;
        }

        this.serviceActionSummaries = new java.util.ArrayList<ServiceActionSummary>(
                serviceActionSummaries);
    }

    /**
     * <p>
     * An object containing information about the service actions associated
     * with the provisioning artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceActionSummaries <p>
     *            An object containing information about the service actions
     *            associated with the provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListServiceActionsResult withServiceActionSummaries(
            ServiceActionSummary... serviceActionSummaries) {
        if (getServiceActionSummaries() == null) {
            this.serviceActionSummaries = new java.util.ArrayList<ServiceActionSummary>(
                    serviceActionSummaries.length);
        }
        for (ServiceActionSummary value : serviceActionSummaries) {
            this.serviceActionSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An object containing information about the service actions associated
     * with the provisioning artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceActionSummaries <p>
     *            An object containing information about the service actions
     *            associated with the provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListServiceActionsResult withServiceActionSummaries(
            java.util.Collection<ServiceActionSummary> serviceActionSummaries) {
        setServiceActionSummaries(serviceActionSummaries);
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
    public ListServiceActionsResult withNextPageToken(String nextPageToken) {
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
        if (getServiceActionSummaries() != null)
            sb.append("ServiceActionSummaries: " + getServiceActionSummaries() + ",");
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
                + ((getServiceActionSummaries() == null) ? 0 : getServiceActionSummaries()
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

        if (obj instanceof ListServiceActionsResult == false)
            return false;
        ListServiceActionsResult other = (ListServiceActionsResult) obj;

        if (other.getServiceActionSummaries() == null ^ this.getServiceActionSummaries() == null)
            return false;
        if (other.getServiceActionSummaries() != null
                && other.getServiceActionSummaries().equals(this.getServiceActionSummaries()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
