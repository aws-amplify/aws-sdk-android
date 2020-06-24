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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

public class DescribePullRequestEventsResult implements Serializable {
    /**
     * <p>
     * Information about the pull request events.
     * </p>
     */
    private java.util.List<PullRequestEvent> pullRequestEvents;

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the pull request events.
     * </p>
     *
     * @return <p>
     *         Information about the pull request events.
     *         </p>
     */
    public java.util.List<PullRequestEvent> getPullRequestEvents() {
        return pullRequestEvents;
    }

    /**
     * <p>
     * Information about the pull request events.
     * </p>
     *
     * @param pullRequestEvents <p>
     *            Information about the pull request events.
     *            </p>
     */
    public void setPullRequestEvents(java.util.Collection<PullRequestEvent> pullRequestEvents) {
        if (pullRequestEvents == null) {
            this.pullRequestEvents = null;
            return;
        }

        this.pullRequestEvents = new java.util.ArrayList<PullRequestEvent>(pullRequestEvents);
    }

    /**
     * <p>
     * Information about the pull request events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestEvents <p>
     *            Information about the pull request events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePullRequestEventsResult withPullRequestEvents(
            PullRequestEvent... pullRequestEvents) {
        if (getPullRequestEvents() == null) {
            this.pullRequestEvents = new java.util.ArrayList<PullRequestEvent>(
                    pullRequestEvents.length);
        }
        for (PullRequestEvent value : pullRequestEvents) {
            this.pullRequestEvents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the pull request events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestEvents <p>
     *            Information about the pull request events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePullRequestEventsResult withPullRequestEvents(
            java.util.Collection<PullRequestEvent> pullRequestEvents) {
        setPullRequestEvents(pullRequestEvents);
        return this;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     *
     * @return <p>
     *         An enumeration token that can be used in a request to return the
     *         next batch of the results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     *
     * @param nextToken <p>
     *            An enumeration token that can be used in a request to return
     *            the next batch of the results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An enumeration token that can be used in a request to return
     *            the next batch of the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePullRequestEventsResult withNextToken(String nextToken) {
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
        if (getPullRequestEvents() != null)
            sb.append("pullRequestEvents: " + getPullRequestEvents() + ",");
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
                + ((getPullRequestEvents() == null) ? 0 : getPullRequestEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePullRequestEventsResult == false)
            return false;
        DescribePullRequestEventsResult other = (DescribePullRequestEventsResult) obj;

        if (other.getPullRequestEvents() == null ^ this.getPullRequestEvents() == null)
            return false;
        if (other.getPullRequestEvents() != null
                && other.getPullRequestEvents().equals(this.getPullRequestEvents()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
