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

public class ListCopyJobsResult implements Serializable {
    /**
     * <p>
     * An array of structures containing metadata about your copy jobs returned
     * in JSON format.
     * </p>
     */
    private java.util.List<CopyJob> copyJobs;

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return maxResults number of items, NextToken allows
     * you to return more items in your list starting at the location pointed to
     * by the next token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of structures containing metadata about your copy jobs returned
     * in JSON format.
     * </p>
     *
     * @return <p>
     *         An array of structures containing metadata about your copy jobs
     *         returned in JSON format.
     *         </p>
     */
    public java.util.List<CopyJob> getCopyJobs() {
        return copyJobs;
    }

    /**
     * <p>
     * An array of structures containing metadata about your copy jobs returned
     * in JSON format.
     * </p>
     *
     * @param copyJobs <p>
     *            An array of structures containing metadata about your copy
     *            jobs returned in JSON format.
     *            </p>
     */
    public void setCopyJobs(java.util.Collection<CopyJob> copyJobs) {
        if (copyJobs == null) {
            this.copyJobs = null;
            return;
        }

        this.copyJobs = new java.util.ArrayList<CopyJob>(copyJobs);
    }

    /**
     * <p>
     * An array of structures containing metadata about your copy jobs returned
     * in JSON format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyJobs <p>
     *            An array of structures containing metadata about your copy
     *            jobs returned in JSON format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCopyJobsResult withCopyJobs(CopyJob... copyJobs) {
        if (getCopyJobs() == null) {
            this.copyJobs = new java.util.ArrayList<CopyJob>(copyJobs.length);
        }
        for (CopyJob value : copyJobs) {
            this.copyJobs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures containing metadata about your copy jobs returned
     * in JSON format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyJobs <p>
     *            An array of structures containing metadata about your copy
     *            jobs returned in JSON format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCopyJobsResult withCopyJobs(java.util.Collection<CopyJob> copyJobs) {
        setCopyJobs(copyJobs);
        return this;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return maxResults number of items, NextToken allows
     * you to return more items in your list starting at the location pointed to
     * by the next token.
     * </p>
     *
     * @return <p>
     *         The next item following a partial list of returned items. For
     *         example, if a request is made to return maxResults number of
     *         items, NextToken allows you to return more items in your list
     *         starting at the location pointed to by the next token.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return maxResults number of items, NextToken allows
     * you to return more items in your list starting at the location pointed to
     * by the next token.
     * </p>
     *
     * @param nextToken <p>
     *            The next item following a partial list of returned items. For
     *            example, if a request is made to return maxResults number of
     *            items, NextToken allows you to return more items in your list
     *            starting at the location pointed to by the next token.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return maxResults number of items, NextToken allows
     * you to return more items in your list starting at the location pointed to
     * by the next token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The next item following a partial list of returned items. For
     *            example, if a request is made to return maxResults number of
     *            items, NextToken allows you to return more items in your list
     *            starting at the location pointed to by the next token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCopyJobsResult withNextToken(String nextToken) {
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
        if (getCopyJobs() != null)
            sb.append("CopyJobs: " + getCopyJobs() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCopyJobs() == null) ? 0 : getCopyJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCopyJobsResult == false)
            return false;
        ListCopyJobsResult other = (ListCopyJobsResult) obj;

        if (other.getCopyJobs() == null ^ this.getCopyJobs() == null)
            return false;
        if (other.getCopyJobs() != null && other.getCopyJobs().equals(this.getCopyJobs()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
