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

package com.amazonaws.services.catalog.marketplace.model;

import java.io.Serializable;

public class ListChangeSetsResult implements Serializable {
    /**
     * <p>
     * Array of <code>ChangeSetSummaryListItem</code> objects.
     * </p>
     */
    private java.util.List<ChangeSetSummaryListItem> changeSetSummaryList;

    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[\w+=.:@\-\/]$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Array of <code>ChangeSetSummaryListItem</code> objects.
     * </p>
     *
     * @return <p>
     *         Array of <code>ChangeSetSummaryListItem</code> objects.
     *         </p>
     */
    public java.util.List<ChangeSetSummaryListItem> getChangeSetSummaryList() {
        return changeSetSummaryList;
    }

    /**
     * <p>
     * Array of <code>ChangeSetSummaryListItem</code> objects.
     * </p>
     *
     * @param changeSetSummaryList <p>
     *            Array of <code>ChangeSetSummaryListItem</code> objects.
     *            </p>
     */
    public void setChangeSetSummaryList(
            java.util.Collection<ChangeSetSummaryListItem> changeSetSummaryList) {
        if (changeSetSummaryList == null) {
            this.changeSetSummaryList = null;
            return;
        }

        this.changeSetSummaryList = new java.util.ArrayList<ChangeSetSummaryListItem>(
                changeSetSummaryList);
    }

    /**
     * <p>
     * Array of <code>ChangeSetSummaryListItem</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param changeSetSummaryList <p>
     *            Array of <code>ChangeSetSummaryListItem</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChangeSetsResult withChangeSetSummaryList(
            ChangeSetSummaryListItem... changeSetSummaryList) {
        if (getChangeSetSummaryList() == null) {
            this.changeSetSummaryList = new java.util.ArrayList<ChangeSetSummaryListItem>(
                    changeSetSummaryList.length);
        }
        for (ChangeSetSummaryListItem value : changeSetSummaryList) {
            this.changeSetSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Array of <code>ChangeSetSummaryListItem</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param changeSetSummaryList <p>
     *            Array of <code>ChangeSetSummaryListItem</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChangeSetsResult withChangeSetSummaryList(
            java.util.Collection<ChangeSetSummaryListItem> changeSetSummaryList) {
        setChangeSetSummaryList(changeSetSummaryList);
        return this;
    }

    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[\w+=.:@\-\/]$<br/>
     *
     * @return <p>
     *         The value of the next token, if it exists. Null if there are no
     *         more results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[\w+=.:@\-\/]$<br/>
     *
     * @param nextToken <p>
     *            The value of the next token, if it exists. Null if there are
     *            no more results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[\w+=.:@\-\/]$<br/>
     *
     * @param nextToken <p>
     *            The value of the next token, if it exists. Null if there are
     *            no more results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChangeSetsResult withNextToken(String nextToken) {
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
        if (getChangeSetSummaryList() != null)
            sb.append("ChangeSetSummaryList: " + getChangeSetSummaryList() + ",");
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
                + ((getChangeSetSummaryList() == null) ? 0 : getChangeSetSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChangeSetsResult == false)
            return false;
        ListChangeSetsResult other = (ListChangeSetsResult) obj;

        if (other.getChangeSetSummaryList() == null ^ this.getChangeSetSummaryList() == null)
            return false;
        if (other.getChangeSetSummaryList() != null
                && other.getChangeSetSummaryList().equals(this.getChangeSetSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
