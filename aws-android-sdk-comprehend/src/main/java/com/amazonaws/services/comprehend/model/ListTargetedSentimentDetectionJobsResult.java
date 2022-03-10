/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class ListTargetedSentimentDetectionJobsResult implements Serializable {
    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     */
    private java.util.List<TargetedSentimentDetectionJobProperties> targetedSentimentDetectionJobPropertiesList;

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     *
     * @return <p>
     *         A list containing the properties of each job that is returned.
     *         </p>
     */
    public java.util.List<TargetedSentimentDetectionJobProperties> getTargetedSentimentDetectionJobPropertiesList() {
        return targetedSentimentDetectionJobPropertiesList;
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     *
     * @param targetedSentimentDetectionJobPropertiesList <p>
     *            A list containing the properties of each job that is returned.
     *            </p>
     */
    public void setTargetedSentimentDetectionJobPropertiesList(
            java.util.Collection<TargetedSentimentDetectionJobProperties> targetedSentimentDetectionJobPropertiesList) {
        if (targetedSentimentDetectionJobPropertiesList == null) {
            this.targetedSentimentDetectionJobPropertiesList = null;
            return;
        }

        this.targetedSentimentDetectionJobPropertiesList = new java.util.ArrayList<TargetedSentimentDetectionJobProperties>(
                targetedSentimentDetectionJobPropertiesList);
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetedSentimentDetectionJobPropertiesList <p>
     *            A list containing the properties of each job that is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTargetedSentimentDetectionJobsResult withTargetedSentimentDetectionJobPropertiesList(
            TargetedSentimentDetectionJobProperties... targetedSentimentDetectionJobPropertiesList) {
        if (getTargetedSentimentDetectionJobPropertiesList() == null) {
            this.targetedSentimentDetectionJobPropertiesList = new java.util.ArrayList<TargetedSentimentDetectionJobProperties>(
                    targetedSentimentDetectionJobPropertiesList.length);
        }
        for (TargetedSentimentDetectionJobProperties value : targetedSentimentDetectionJobPropertiesList) {
            this.targetedSentimentDetectionJobPropertiesList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetedSentimentDetectionJobPropertiesList <p>
     *            A list containing the properties of each job that is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTargetedSentimentDetectionJobsResult withTargetedSentimentDetectionJobPropertiesList(
            java.util.Collection<TargetedSentimentDetectionJobProperties> targetedSentimentDetectionJobPropertiesList) {
        setTargetedSentimentDetectionJobPropertiesList(targetedSentimentDetectionJobPropertiesList);
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Identifies the next page of results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            Identifies the next page of results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            Identifies the next page of results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTargetedSentimentDetectionJobsResult withNextToken(String nextToken) {
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
        if (getTargetedSentimentDetectionJobPropertiesList() != null)
            sb.append("TargetedSentimentDetectionJobPropertiesList: "
                    + getTargetedSentimentDetectionJobPropertiesList() + ",");
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
                + ((getTargetedSentimentDetectionJobPropertiesList() == null) ? 0
                        : getTargetedSentimentDetectionJobPropertiesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTargetedSentimentDetectionJobsResult == false)
            return false;
        ListTargetedSentimentDetectionJobsResult other = (ListTargetedSentimentDetectionJobsResult) obj;

        if (other.getTargetedSentimentDetectionJobPropertiesList() == null
                ^ this.getTargetedSentimentDetectionJobPropertiesList() == null)
            return false;
        if (other.getTargetedSentimentDetectionJobPropertiesList() != null
                && other.getTargetedSentimentDetectionJobPropertiesList().equals(
                        this.getTargetedSentimentDetectionJobPropertiesList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
