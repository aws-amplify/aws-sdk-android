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

package com.amazonaws.services.backup.model;

import java.io.Serializable;

public class ListRestoreJobsResult implements Serializable {
    /**
     * <p>
     * An array of objects that contain detailed information about jobs to
     * restore saved resources.
     * </p>
     */
    private java.util.List<RestoreJobsListMember> restoreJobs;

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return <code>maxResults</code> number of items,
     * <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects that contain detailed information about jobs to
     * restore saved resources.
     * </p>
     *
     * @return <p>
     *         An array of objects that contain detailed information about jobs
     *         to restore saved resources.
     *         </p>
     */
    public java.util.List<RestoreJobsListMember> getRestoreJobs() {
        return restoreJobs;
    }

    /**
     * <p>
     * An array of objects that contain detailed information about jobs to
     * restore saved resources.
     * </p>
     *
     * @param restoreJobs <p>
     *            An array of objects that contain detailed information about
     *            jobs to restore saved resources.
     *            </p>
     */
    public void setRestoreJobs(java.util.Collection<RestoreJobsListMember> restoreJobs) {
        if (restoreJobs == null) {
            this.restoreJobs = null;
            return;
        }

        this.restoreJobs = new java.util.ArrayList<RestoreJobsListMember>(restoreJobs);
    }

    /**
     * <p>
     * An array of objects that contain detailed information about jobs to
     * restore saved resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreJobs <p>
     *            An array of objects that contain detailed information about
     *            jobs to restore saved resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRestoreJobsResult withRestoreJobs(RestoreJobsListMember... restoreJobs) {
        if (getRestoreJobs() == null) {
            this.restoreJobs = new java.util.ArrayList<RestoreJobsListMember>(restoreJobs.length);
        }
        for (RestoreJobsListMember value : restoreJobs) {
            this.restoreJobs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that contain detailed information about jobs to
     * restore saved resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreJobs <p>
     *            An array of objects that contain detailed information about
     *            jobs to restore saved resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRestoreJobsResult withRestoreJobs(
            java.util.Collection<RestoreJobsListMember> restoreJobs) {
        setRestoreJobs(restoreJobs);
        return this;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return <code>maxResults</code> number of items,
     * <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     *
     * @return <p>
     *         The next item following a partial list of returned items. For
     *         example, if a request is made to return <code>maxResults</code>
     *         number of items, <code>NextToken</code> allows you to return more
     *         items in your list starting at the location pointed to by the
     *         next token.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return <code>maxResults</code> number of items,
     * <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     *
     * @param nextToken <p>
     *            The next item following a partial list of returned items. For
     *            example, if a request is made to return
     *            <code>maxResults</code> number of items,
     *            <code>NextToken</code> allows you to return more items in your
     *            list starting at the location pointed to by the next token.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return <code>maxResults</code> number of items,
     * <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The next item following a partial list of returned items. For
     *            example, if a request is made to return
     *            <code>maxResults</code> number of items,
     *            <code>NextToken</code> allows you to return more items in your
     *            list starting at the location pointed to by the next token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRestoreJobsResult withNextToken(String nextToken) {
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
        if (getRestoreJobs() != null)
            sb.append("RestoreJobs: " + getRestoreJobs() + ",");
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
                + ((getRestoreJobs() == null) ? 0 : getRestoreJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRestoreJobsResult == false)
            return false;
        ListRestoreJobsResult other = (ListRestoreJobsResult) obj;

        if (other.getRestoreJobs() == null ^ this.getRestoreJobs() == null)
            return false;
        if (other.getRestoreJobs() != null
                && other.getRestoreJobs().equals(this.getRestoreJobs()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
