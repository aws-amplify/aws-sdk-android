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

public class ListKeyPhrasesDetectionJobsResult implements Serializable {
    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     */
    private java.util.List<KeyPhrasesDetectionJobProperties> keyPhrasesDetectionJobPropertiesList;

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
    public java.util.List<KeyPhrasesDetectionJobProperties> getKeyPhrasesDetectionJobPropertiesList() {
        return keyPhrasesDetectionJobPropertiesList;
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     *
     * @param keyPhrasesDetectionJobPropertiesList <p>
     *            A list containing the properties of each job that is returned.
     *            </p>
     */
    public void setKeyPhrasesDetectionJobPropertiesList(
            java.util.Collection<KeyPhrasesDetectionJobProperties> keyPhrasesDetectionJobPropertiesList) {
        if (keyPhrasesDetectionJobPropertiesList == null) {
            this.keyPhrasesDetectionJobPropertiesList = null;
            return;
        }

        this.keyPhrasesDetectionJobPropertiesList = new java.util.ArrayList<KeyPhrasesDetectionJobProperties>(
                keyPhrasesDetectionJobPropertiesList);
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyPhrasesDetectionJobPropertiesList <p>
     *            A list containing the properties of each job that is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListKeyPhrasesDetectionJobsResult withKeyPhrasesDetectionJobPropertiesList(
            KeyPhrasesDetectionJobProperties... keyPhrasesDetectionJobPropertiesList) {
        if (getKeyPhrasesDetectionJobPropertiesList() == null) {
            this.keyPhrasesDetectionJobPropertiesList = new java.util.ArrayList<KeyPhrasesDetectionJobProperties>(
                    keyPhrasesDetectionJobPropertiesList.length);
        }
        for (KeyPhrasesDetectionJobProperties value : keyPhrasesDetectionJobPropertiesList) {
            this.keyPhrasesDetectionJobPropertiesList.add(value);
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
     * @param keyPhrasesDetectionJobPropertiesList <p>
     *            A list containing the properties of each job that is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListKeyPhrasesDetectionJobsResult withKeyPhrasesDetectionJobPropertiesList(
            java.util.Collection<KeyPhrasesDetectionJobProperties> keyPhrasesDetectionJobPropertiesList) {
        setKeyPhrasesDetectionJobPropertiesList(keyPhrasesDetectionJobPropertiesList);
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
    public ListKeyPhrasesDetectionJobsResult withNextToken(String nextToken) {
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
        if (getKeyPhrasesDetectionJobPropertiesList() != null)
            sb.append("KeyPhrasesDetectionJobPropertiesList: "
                    + getKeyPhrasesDetectionJobPropertiesList() + ",");
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
                + ((getKeyPhrasesDetectionJobPropertiesList() == null) ? 0
                        : getKeyPhrasesDetectionJobPropertiesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListKeyPhrasesDetectionJobsResult == false)
            return false;
        ListKeyPhrasesDetectionJobsResult other = (ListKeyPhrasesDetectionJobsResult) obj;

        if (other.getKeyPhrasesDetectionJobPropertiesList() == null
                ^ this.getKeyPhrasesDetectionJobPropertiesList() == null)
            return false;
        if (other.getKeyPhrasesDetectionJobPropertiesList() != null
                && other.getKeyPhrasesDetectionJobPropertiesList().equals(
                        this.getKeyPhrasesDetectionJobPropertiesList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
