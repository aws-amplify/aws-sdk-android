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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class ListPromptsResult implements Serializable {
    /**
     * <p>
     * Information about the prompts.
     * </p>
     */
    private java.util.List<PromptSummary> promptSummaryList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the prompts.
     * </p>
     *
     * @return <p>
     *         Information about the prompts.
     *         </p>
     */
    public java.util.List<PromptSummary> getPromptSummaryList() {
        return promptSummaryList;
    }

    /**
     * <p>
     * Information about the prompts.
     * </p>
     *
     * @param promptSummaryList <p>
     *            Information about the prompts.
     *            </p>
     */
    public void setPromptSummaryList(java.util.Collection<PromptSummary> promptSummaryList) {
        if (promptSummaryList == null) {
            this.promptSummaryList = null;
            return;
        }

        this.promptSummaryList = new java.util.ArrayList<PromptSummary>(promptSummaryList);
    }

    /**
     * <p>
     * Information about the prompts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param promptSummaryList <p>
     *            Information about the prompts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPromptsResult withPromptSummaryList(PromptSummary... promptSummaryList) {
        if (getPromptSummaryList() == null) {
            this.promptSummaryList = new java.util.ArrayList<PromptSummary>(
                    promptSummaryList.length);
        }
        for (PromptSummary value : promptSummaryList) {
            this.promptSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the prompts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param promptSummaryList <p>
     *            Information about the prompts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPromptsResult withPromptSummaryList(
            java.util.Collection<PromptSummary> promptSummaryList) {
        setPromptSummaryList(promptSummaryList);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPromptsResult withNextToken(String nextToken) {
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
        if (getPromptSummaryList() != null)
            sb.append("PromptSummaryList: " + getPromptSummaryList() + ",");
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
                + ((getPromptSummaryList() == null) ? 0 : getPromptSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPromptsResult == false)
            return false;
        ListPromptsResult other = (ListPromptsResult) obj;

        if (other.getPromptSummaryList() == null ^ this.getPromptSummaryList() == null)
            return false;
        if (other.getPromptSummaryList() != null
                && other.getPromptSummaryList().equals(this.getPromptSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
