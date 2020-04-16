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

package com.amazonaws.services.amazonaugmentedairuntime.model;

import java.io.Serializable;

public class ListHumanLoopsResult implements Serializable {
    /**
     * <p>
     * An array of objects that contain information about the human loops.
     * </p>
     */
    private java.util.List<HumanLoopSummary> humanLoopSummaries;

    /**
     * <p>
     * A token to display the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects that contain information about the human loops.
     * </p>
     *
     * @return <p>
     *         An array of objects that contain information about the human
     *         loops.
     *         </p>
     */
    public java.util.List<HumanLoopSummary> getHumanLoopSummaries() {
        return humanLoopSummaries;
    }

    /**
     * <p>
     * An array of objects that contain information about the human loops.
     * </p>
     *
     * @param humanLoopSummaries <p>
     *            An array of objects that contain information about the human
     *            loops.
     *            </p>
     */
    public void setHumanLoopSummaries(java.util.Collection<HumanLoopSummary> humanLoopSummaries) {
        if (humanLoopSummaries == null) {
            this.humanLoopSummaries = null;
            return;
        }

        this.humanLoopSummaries = new java.util.ArrayList<HumanLoopSummary>(humanLoopSummaries);
    }

    /**
     * <p>
     * An array of objects that contain information about the human loops.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param humanLoopSummaries <p>
     *            An array of objects that contain information about the human
     *            loops.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHumanLoopsResult withHumanLoopSummaries(HumanLoopSummary... humanLoopSummaries) {
        if (getHumanLoopSummaries() == null) {
            this.humanLoopSummaries = new java.util.ArrayList<HumanLoopSummary>(
                    humanLoopSummaries.length);
        }
        for (HumanLoopSummary value : humanLoopSummaries) {
            this.humanLoopSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that contain information about the human loops.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param humanLoopSummaries <p>
     *            An array of objects that contain information about the human
     *            loops.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHumanLoopsResult withHumanLoopSummaries(
            java.util.Collection<HumanLoopSummary> humanLoopSummaries) {
        setHumanLoopSummaries(humanLoopSummaries);
        return this;
    }

    /**
     * <p>
     * A token to display the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         A token to display the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token to display the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            A token to display the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to display the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            A token to display the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHumanLoopsResult withNextToken(String nextToken) {
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
        if (getHumanLoopSummaries() != null)
            sb.append("HumanLoopSummaries: " + getHumanLoopSummaries() + ",");
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
                + ((getHumanLoopSummaries() == null) ? 0 : getHumanLoopSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHumanLoopsResult == false)
            return false;
        ListHumanLoopsResult other = (ListHumanLoopsResult) obj;

        if (other.getHumanLoopSummaries() == null ^ this.getHumanLoopSummaries() == null)
            return false;
        if (other.getHumanLoopSummaries() != null
                && other.getHumanLoopSummaries().equals(this.getHumanLoopSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
