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

public class ListRetainedMessagesResult implements Serializable {
    /**
     * <p>
     * A summary list the account's retained messages. The information returned
     * doesn't include the message payloads of the retained messages.
     * </p>
     */
    private java.util.List<RetainedMessageSummary> retainedTopics;

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A summary list the account's retained messages. The information returned
     * doesn't include the message payloads of the retained messages.
     * </p>
     *
     * @return <p>
     *         A summary list the account's retained messages. The information
     *         returned doesn't include the message payloads of the retained
     *         messages.
     *         </p>
     */
    public java.util.List<RetainedMessageSummary> getRetainedTopics() {
        return retainedTopics;
    }

    /**
     * <p>
     * A summary list the account's retained messages. The information returned
     * doesn't include the message payloads of the retained messages.
     * </p>
     *
     * @param retainedTopics <p>
     *            A summary list the account's retained messages. The
     *            information returned doesn't include the message payloads of
     *            the retained messages.
     *            </p>
     */
    public void setRetainedTopics(java.util.Collection<RetainedMessageSummary> retainedTopics) {
        if (retainedTopics == null) {
            this.retainedTopics = null;
            return;
        }

        this.retainedTopics = new java.util.ArrayList<RetainedMessageSummary>(retainedTopics);
    }

    /**
     * <p>
     * A summary list the account's retained messages. The information returned
     * doesn't include the message payloads of the retained messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retainedTopics <p>
     *            A summary list the account's retained messages. The
     *            information returned doesn't include the message payloads of
     *            the retained messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRetainedMessagesResult withRetainedTopics(RetainedMessageSummary... retainedTopics) {
        if (getRetainedTopics() == null) {
            this.retainedTopics = new java.util.ArrayList<RetainedMessageSummary>(
                    retainedTopics.length);
        }
        for (RetainedMessageSummary value : retainedTopics) {
            this.retainedTopics.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A summary list the account's retained messages. The information returned
     * doesn't include the message payloads of the retained messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retainedTopics <p>
     *            A summary list the account's retained messages. The
     *            information returned doesn't include the message payloads of
     *            the retained messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRetainedMessagesResult withRetainedTopics(
            java.util.Collection<RetainedMessageSummary> retainedTopics) {
        setRetainedTopics(retainedTopics);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results, or null if there are no
     *         additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results, or null if there are no
     *            additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results, or null if there are no
     *            additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRetainedMessagesResult withNextToken(String nextToken) {
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
        if (getRetainedTopics() != null)
            sb.append("retainedTopics: " + getRetainedTopics() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRetainedTopics() == null) ? 0 : getRetainedTopics().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRetainedMessagesResult == false)
            return false;
        ListRetainedMessagesResult other = (ListRetainedMessagesResult) obj;

        if (other.getRetainedTopics() == null ^ this.getRetainedTopics() == null)
            return false;
        if (other.getRetainedTopics() != null
                && other.getRetainedTopics().equals(this.getRetainedTopics()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
