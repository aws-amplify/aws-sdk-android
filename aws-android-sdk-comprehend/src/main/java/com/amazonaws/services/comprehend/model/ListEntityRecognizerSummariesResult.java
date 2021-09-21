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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

public class ListEntityRecognizerSummariesResult implements Serializable {
    /**
     * <p>
     * The list entity recognizer summaries.
     * </p>
     */
    private java.util.List<EntityRecognizerSummary> entityRecognizerSummariesList;

    /**
     * <p>
     * The list entity recognizer summaries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The list entity recognizer summaries.
     * </p>
     *
     * @return <p>
     *         The list entity recognizer summaries.
     *         </p>
     */
    public java.util.List<EntityRecognizerSummary> getEntityRecognizerSummariesList() {
        return entityRecognizerSummariesList;
    }

    /**
     * <p>
     * The list entity recognizer summaries.
     * </p>
     *
     * @param entityRecognizerSummariesList <p>
     *            The list entity recognizer summaries.
     *            </p>
     */
    public void setEntityRecognizerSummariesList(
            java.util.Collection<EntityRecognizerSummary> entityRecognizerSummariesList) {
        if (entityRecognizerSummariesList == null) {
            this.entityRecognizerSummariesList = null;
            return;
        }

        this.entityRecognizerSummariesList = new java.util.ArrayList<EntityRecognizerSummary>(
                entityRecognizerSummariesList);
    }

    /**
     * <p>
     * The list entity recognizer summaries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityRecognizerSummariesList <p>
     *            The list entity recognizer summaries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntityRecognizerSummariesResult withEntityRecognizerSummariesList(
            EntityRecognizerSummary... entityRecognizerSummariesList) {
        if (getEntityRecognizerSummariesList() == null) {
            this.entityRecognizerSummariesList = new java.util.ArrayList<EntityRecognizerSummary>(
                    entityRecognizerSummariesList.length);
        }
        for (EntityRecognizerSummary value : entityRecognizerSummariesList) {
            this.entityRecognizerSummariesList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list entity recognizer summaries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityRecognizerSummariesList <p>
     *            The list entity recognizer summaries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntityRecognizerSummariesResult withEntityRecognizerSummariesList(
            java.util.Collection<EntityRecognizerSummary> entityRecognizerSummariesList) {
        setEntityRecognizerSummariesList(entityRecognizerSummariesList);
        return this;
    }

    /**
     * <p>
     * The list entity recognizer summaries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The list entity recognizer summaries.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The list entity recognizer summaries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The list entity recognizer summaries.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The list entity recognizer summaries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The list entity recognizer summaries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntityRecognizerSummariesResult withNextToken(String nextToken) {
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
        if (getEntityRecognizerSummariesList() != null)
            sb.append("EntityRecognizerSummariesList: " + getEntityRecognizerSummariesList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEntityRecognizerSummariesList() == null) ? 0
                        : getEntityRecognizerSummariesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEntityRecognizerSummariesResult == false)
            return false;
        ListEntityRecognizerSummariesResult other = (ListEntityRecognizerSummariesResult) obj;

        if (other.getEntityRecognizerSummariesList() == null
                ^ this.getEntityRecognizerSummariesList() == null)
            return false;
        if (other.getEntityRecognizerSummariesList() != null
                && other.getEntityRecognizerSummariesList().equals(
                        this.getEntityRecognizerSummariesList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
