/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class ListDominantLanguageDetectionJobsResult implements Serializable {
    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     */
    private java.util.List<DominantLanguageDetectionJobProperties> dominantLanguageDetectionJobPropertiesList;

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
    public java.util.List<DominantLanguageDetectionJobProperties> getDominantLanguageDetectionJobPropertiesList() {
        return dominantLanguageDetectionJobPropertiesList;
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     *
     * @param dominantLanguageDetectionJobPropertiesList <p>
     *            A list containing the properties of each job that is returned.
     *            </p>
     */
    public void setDominantLanguageDetectionJobPropertiesList(
            java.util.Collection<DominantLanguageDetectionJobProperties> dominantLanguageDetectionJobPropertiesList) {
        if (dominantLanguageDetectionJobPropertiesList == null) {
            this.dominantLanguageDetectionJobPropertiesList = null;
            return;
        }

        this.dominantLanguageDetectionJobPropertiesList = new java.util.ArrayList<DominantLanguageDetectionJobProperties>(
                dominantLanguageDetectionJobPropertiesList);
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dominantLanguageDetectionJobPropertiesList <p>
     *            A list containing the properties of each job that is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDominantLanguageDetectionJobsResult withDominantLanguageDetectionJobPropertiesList(
            DominantLanguageDetectionJobProperties... dominantLanguageDetectionJobPropertiesList) {
        if (getDominantLanguageDetectionJobPropertiesList() == null) {
            this.dominantLanguageDetectionJobPropertiesList = new java.util.ArrayList<DominantLanguageDetectionJobProperties>(
                    dominantLanguageDetectionJobPropertiesList.length);
        }
        for (DominantLanguageDetectionJobProperties value : dominantLanguageDetectionJobPropertiesList) {
            this.dominantLanguageDetectionJobPropertiesList.add(value);
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
     * @param dominantLanguageDetectionJobPropertiesList <p>
     *            A list containing the properties of each job that is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDominantLanguageDetectionJobsResult withDominantLanguageDetectionJobPropertiesList(
            java.util.Collection<DominantLanguageDetectionJobProperties> dominantLanguageDetectionJobPropertiesList) {
        setDominantLanguageDetectionJobPropertiesList(dominantLanguageDetectionJobPropertiesList);
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
    public ListDominantLanguageDetectionJobsResult withNextToken(String nextToken) {
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
        if (getDominantLanguageDetectionJobPropertiesList() != null)
            sb.append("DominantLanguageDetectionJobPropertiesList: "
                    + getDominantLanguageDetectionJobPropertiesList() + ",");
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
                + ((getDominantLanguageDetectionJobPropertiesList() == null) ? 0
                        : getDominantLanguageDetectionJobPropertiesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDominantLanguageDetectionJobsResult == false)
            return false;
        ListDominantLanguageDetectionJobsResult other = (ListDominantLanguageDetectionJobsResult) obj;

        if (other.getDominantLanguageDetectionJobPropertiesList() == null
                ^ this.getDominantLanguageDetectionJobPropertiesList() == null)
            return false;
        if (other.getDominantLanguageDetectionJobPropertiesList() != null
                && other.getDominantLanguageDetectionJobPropertiesList().equals(
                        this.getDominantLanguageDetectionJobPropertiesList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
