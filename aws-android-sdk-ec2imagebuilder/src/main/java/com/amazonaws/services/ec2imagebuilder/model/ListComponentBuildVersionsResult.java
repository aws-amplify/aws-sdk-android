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

package com.amazonaws.services.ec2imagebuilder.model;

import java.io.Serializable;

public class ListComponentBuildVersionsResult implements Serializable {
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
     * The list of component summaries for the specified semantic version.
     * </p>
     */
    private java.util.List<ComponentSummary> componentSummaryList;

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
    public ListComponentBuildVersionsResult withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * <p>
     * The list of component summaries for the specified semantic version.
     * </p>
     *
     * @return <p>
     *         The list of component summaries for the specified semantic
     *         version.
     *         </p>
     */
    public java.util.List<ComponentSummary> getComponentSummaryList() {
        return componentSummaryList;
    }

    /**
     * <p>
     * The list of component summaries for the specified semantic version.
     * </p>
     *
     * @param componentSummaryList <p>
     *            The list of component summaries for the specified semantic
     *            version.
     *            </p>
     */
    public void setComponentSummaryList(java.util.Collection<ComponentSummary> componentSummaryList) {
        if (componentSummaryList == null) {
            this.componentSummaryList = null;
            return;
        }

        this.componentSummaryList = new java.util.ArrayList<ComponentSummary>(componentSummaryList);
    }

    /**
     * <p>
     * The list of component summaries for the specified semantic version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param componentSummaryList <p>
     *            The list of component summaries for the specified semantic
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComponentBuildVersionsResult withComponentSummaryList(
            ComponentSummary... componentSummaryList) {
        if (getComponentSummaryList() == null) {
            this.componentSummaryList = new java.util.ArrayList<ComponentSummary>(
                    componentSummaryList.length);
        }
        for (ComponentSummary value : componentSummaryList) {
            this.componentSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of component summaries for the specified semantic version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param componentSummaryList <p>
     *            The list of component summaries for the specified semantic
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComponentBuildVersionsResult withComponentSummaryList(
            java.util.Collection<ComponentSummary> componentSummaryList) {
        setComponentSummaryList(componentSummaryList);
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
    public ListComponentBuildVersionsResult withNextToken(String nextToken) {
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
        if (getComponentSummaryList() != null)
            sb.append("componentSummaryList: " + getComponentSummaryList() + ",");
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
        hashCode = prime * hashCode
                + ((getComponentSummaryList() == null) ? 0 : getComponentSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListComponentBuildVersionsResult == false)
            return false;
        ListComponentBuildVersionsResult other = (ListComponentBuildVersionsResult) obj;

        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getComponentSummaryList() == null ^ this.getComponentSummaryList() == null)
            return false;
        if (other.getComponentSummaryList() != null
                && other.getComponentSummaryList().equals(this.getComponentSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
