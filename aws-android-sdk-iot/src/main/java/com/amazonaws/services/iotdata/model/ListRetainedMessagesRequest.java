/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iotdata.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists summary information about the retained messages stored for the account.
 * </p>
 * <p>
 * This action returns only the topic names of the retained messages. It doesn't
 * return any message payloads. Although this action doesn't return a message
 * payload, it can still incur messaging costs.
 * </p>
 * <p>
 * To get the message payload of a retained message, call <a href=
 * "https://docs.aws.amazon.com/iot/latest/developerguide/API_iotdata_GetRetainedMessage.html"
 * >GetRetainedMessage</a> with the topic name of the retained message.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiotfleethubfordevicemanagement.html#awsiotfleethubfordevicemanagement-actions-as-permissions"
 * >ListRetainedMessages</a> action.
 * </p>
 * <p>
 * For more information about messaging costs, see <a
 * href="http://aws.amazon.com/iot-core/pricing/#Messaging">IoT Core pricing -
 * Messaging</a>.
 * </p>
 */
public class ListRetainedMessagesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value
     * from a previous response; otherwise <b>null</b> to receive the first set
     * of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 200<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value
     * from a previous response; otherwise <b>null</b> to receive the first set
     * of results.
     * </p>
     *
     * @return <p>
     *         To retrieve the next set of results, the <code>nextToken</code>
     *         value from a previous response; otherwise <b>null</b> to receive
     *         the first set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value
     * from a previous response; otherwise <b>null</b> to receive the first set
     * of results.
     * </p>
     *
     * @param nextToken <p>
     *            To retrieve the next set of results, the
     *            <code>nextToken</code> value from a previous response;
     *            otherwise <b>null</b> to receive the first set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value
     * from a previous response; otherwise <b>null</b> to receive the first set
     * of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            To retrieve the next set of results, the
     *            <code>nextToken</code> value from a previous response;
     *            otherwise <b>null</b> to receive the first set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRetainedMessagesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 200<br/>
     *
     * @return <p>
     *         The maximum number of results to return at one time.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 200<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at one time.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 200<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at one time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRetainedMessagesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRetainedMessagesRequest == false)
            return false;
        ListRetainedMessagesRequest other = (ListRetainedMessagesRequest) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
