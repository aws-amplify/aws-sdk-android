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

package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;

public class ListInfrastructureConfigurationsResult implements Serializable {
    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String requestId;

    /**
     * <p>
     * The list of infrastructure configurations.
     * </p>
     */
    private java.util.List<InfrastructureConfigurationSummary> infrastructureConfigurationSummaryList;

    /**
     * <p>
     * The next token used for paginated responses. When this is not empty,
     * there are additional elements that the service has not included in this
     * request. Use this token with the next request to retrieve additional
     * objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The request ID that uniquely identifies this request.
     *         </p>
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param requestId <p>
     *            The request ID that uniquely identifies this request.
     *            </p>
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param requestId <p>
     *            The request ID that uniquely identifies this request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInfrastructureConfigurationsResult withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * <p>
     * The list of infrastructure configurations.
     * </p>
     *
     * @return <p>
     *         The list of infrastructure configurations.
     *         </p>
     */
    public java.util.List<InfrastructureConfigurationSummary> getInfrastructureConfigurationSummaryList() {
        return infrastructureConfigurationSummaryList;
    }

    /**
     * <p>
     * The list of infrastructure configurations.
     * </p>
     *
     * @param infrastructureConfigurationSummaryList <p>
     *            The list of infrastructure configurations.
     *            </p>
     */
    public void setInfrastructureConfigurationSummaryList(
            java.util.Collection<InfrastructureConfigurationSummary> infrastructureConfigurationSummaryList) {
        if (infrastructureConfigurationSummaryList == null) {
            this.infrastructureConfigurationSummaryList = null;
            return;
        }

        this.infrastructureConfigurationSummaryList = new java.util.ArrayList<InfrastructureConfigurationSummary>(
                infrastructureConfigurationSummaryList);
    }

    /**
     * <p>
     * The list of infrastructure configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param infrastructureConfigurationSummaryList <p>
     *            The list of infrastructure configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInfrastructureConfigurationsResult withInfrastructureConfigurationSummaryList(
            InfrastructureConfigurationSummary... infrastructureConfigurationSummaryList) {
        if (getInfrastructureConfigurationSummaryList() == null) {
            this.infrastructureConfigurationSummaryList = new java.util.ArrayList<InfrastructureConfigurationSummary>(
                    infrastructureConfigurationSummaryList.length);
        }
        for (InfrastructureConfigurationSummary value : infrastructureConfigurationSummaryList) {
            this.infrastructureConfigurationSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of infrastructure configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param infrastructureConfigurationSummaryList <p>
     *            The list of infrastructure configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInfrastructureConfigurationsResult withInfrastructureConfigurationSummaryList(
            java.util.Collection<InfrastructureConfigurationSummary> infrastructureConfigurationSummaryList) {
        setInfrastructureConfigurationSummaryList(infrastructureConfigurationSummaryList);
        return this;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this is not empty,
     * there are additional elements that the service has not included in this
     * request. Use this token with the next request to retrieve additional
     * objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The next token used for paginated responses. When this is not
     *         empty, there are additional elements that the service has not
     *         included in this request. Use this token with the next request to
     *         retrieve additional objects.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this is not empty,
     * there are additional elements that the service has not included in this
     * request. Use this token with the next request to retrieve additional
     * objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            The next token used for paginated responses. When this is not
     *            empty, there are additional elements that the service has not
     *            included in this request. Use this token with the next request
     *            to retrieve additional objects.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this is not empty,
     * there are additional elements that the service has not included in this
     * request. Use this token with the next request to retrieve additional
     * objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            The next token used for paginated responses. When this is not
     *            empty, there are additional elements that the service has not
     *            included in this request. Use this token with the next request
     *            to retrieve additional objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInfrastructureConfigurationsResult withNextToken(String nextToken) {
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
        if (getRequestId() != null)
            sb.append("requestId: " + getRequestId() + ",");
        if (getInfrastructureConfigurationSummaryList() != null)
            sb.append("infrastructureConfigurationSummaryList: "
                    + getInfrastructureConfigurationSummaryList() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime
                * hashCode
                + ((getInfrastructureConfigurationSummaryList() == null) ? 0
                        : getInfrastructureConfigurationSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInfrastructureConfigurationsResult == false)
            return false;
        ListInfrastructureConfigurationsResult other = (ListInfrastructureConfigurationsResult) obj;

        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getInfrastructureConfigurationSummaryList() == null
                ^ this.getInfrastructureConfigurationSummaryList() == null)
            return false;
        if (other.getInfrastructureConfigurationSummaryList() != null
                && other.getInfrastructureConfigurationSummaryList().equals(
                        this.getInfrastructureConfigurationSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
