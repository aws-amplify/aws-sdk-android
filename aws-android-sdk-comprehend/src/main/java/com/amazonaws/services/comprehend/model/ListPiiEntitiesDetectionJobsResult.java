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

public class ListPiiEntitiesDetectionJobsResult implements Serializable {
    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     */
    private java.util.List<PiiEntitiesDetectionJobProperties> piiEntitiesDetectionJobPropertiesList;

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
    public java.util.List<PiiEntitiesDetectionJobProperties> getPiiEntitiesDetectionJobPropertiesList() {
        return piiEntitiesDetectionJobPropertiesList;
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     *
     * @param piiEntitiesDetectionJobPropertiesList <p>
     *            A list containing the properties of each job that is returned.
     *            </p>
     */
    public void setPiiEntitiesDetectionJobPropertiesList(
            java.util.Collection<PiiEntitiesDetectionJobProperties> piiEntitiesDetectionJobPropertiesList) {
        if (piiEntitiesDetectionJobPropertiesList == null) {
            this.piiEntitiesDetectionJobPropertiesList = null;
            return;
        }

        this.piiEntitiesDetectionJobPropertiesList = new java.util.ArrayList<PiiEntitiesDetectionJobProperties>(
                piiEntitiesDetectionJobPropertiesList);
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param piiEntitiesDetectionJobPropertiesList <p>
     *            A list containing the properties of each job that is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPiiEntitiesDetectionJobsResult withPiiEntitiesDetectionJobPropertiesList(
            PiiEntitiesDetectionJobProperties... piiEntitiesDetectionJobPropertiesList) {
        if (getPiiEntitiesDetectionJobPropertiesList() == null) {
            this.piiEntitiesDetectionJobPropertiesList = new java.util.ArrayList<PiiEntitiesDetectionJobProperties>(
                    piiEntitiesDetectionJobPropertiesList.length);
        }
        for (PiiEntitiesDetectionJobProperties value : piiEntitiesDetectionJobPropertiesList) {
            this.piiEntitiesDetectionJobPropertiesList.add(value);
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
     * @param piiEntitiesDetectionJobPropertiesList <p>
     *            A list containing the properties of each job that is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPiiEntitiesDetectionJobsResult withPiiEntitiesDetectionJobPropertiesList(
            java.util.Collection<PiiEntitiesDetectionJobProperties> piiEntitiesDetectionJobPropertiesList) {
        setPiiEntitiesDetectionJobPropertiesList(piiEntitiesDetectionJobPropertiesList);
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
    public ListPiiEntitiesDetectionJobsResult withNextToken(String nextToken) {
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
        if (getPiiEntitiesDetectionJobPropertiesList() != null)
            sb.append("PiiEntitiesDetectionJobPropertiesList: "
                    + getPiiEntitiesDetectionJobPropertiesList() + ",");
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
                + ((getPiiEntitiesDetectionJobPropertiesList() == null) ? 0
                        : getPiiEntitiesDetectionJobPropertiesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPiiEntitiesDetectionJobsResult == false)
            return false;
        ListPiiEntitiesDetectionJobsResult other = (ListPiiEntitiesDetectionJobsResult) obj;

        if (other.getPiiEntitiesDetectionJobPropertiesList() == null
                ^ this.getPiiEntitiesDetectionJobPropertiesList() == null)
            return false;
        if (other.getPiiEntitiesDetectionJobPropertiesList() != null
                && other.getPiiEntitiesDetectionJobPropertiesList().equals(
                        this.getPiiEntitiesDetectionJobPropertiesList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
