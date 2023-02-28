/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class ListFlywheelIterationHistoryResult implements Serializable {
    /**
     * <p>
     * List of flywheel iteration properties
     * </p>
     */
    private java.util.List<FlywheelIterationProperties> flywheelIterationPropertiesList;

    /**
     * <p>
     * Next token
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * List of flywheel iteration properties
     * </p>
     *
     * @return <p>
     *         List of flywheel iteration properties
     *         </p>
     */
    public java.util.List<FlywheelIterationProperties> getFlywheelIterationPropertiesList() {
        return flywheelIterationPropertiesList;
    }

    /**
     * <p>
     * List of flywheel iteration properties
     * </p>
     *
     * @param flywheelIterationPropertiesList <p>
     *            List of flywheel iteration properties
     *            </p>
     */
    public void setFlywheelIterationPropertiesList(
            java.util.Collection<FlywheelIterationProperties> flywheelIterationPropertiesList) {
        if (flywheelIterationPropertiesList == null) {
            this.flywheelIterationPropertiesList = null;
            return;
        }

        this.flywheelIterationPropertiesList = new java.util.ArrayList<FlywheelIterationProperties>(
                flywheelIterationPropertiesList);
    }

    /**
     * <p>
     * List of flywheel iteration properties
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flywheelIterationPropertiesList <p>
     *            List of flywheel iteration properties
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFlywheelIterationHistoryResult withFlywheelIterationPropertiesList(
            FlywheelIterationProperties... flywheelIterationPropertiesList) {
        if (getFlywheelIterationPropertiesList() == null) {
            this.flywheelIterationPropertiesList = new java.util.ArrayList<FlywheelIterationProperties>(
                    flywheelIterationPropertiesList.length);
        }
        for (FlywheelIterationProperties value : flywheelIterationPropertiesList) {
            this.flywheelIterationPropertiesList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of flywheel iteration properties
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flywheelIterationPropertiesList <p>
     *            List of flywheel iteration properties
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFlywheelIterationHistoryResult withFlywheelIterationPropertiesList(
            java.util.Collection<FlywheelIterationProperties> flywheelIterationPropertiesList) {
        setFlywheelIterationPropertiesList(flywheelIterationPropertiesList);
        return this;
    }

    /**
     * <p>
     * Next token
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Next token
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Next token
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            Next token
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            Next token
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFlywheelIterationHistoryResult withNextToken(String nextToken) {
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
        if (getFlywheelIterationPropertiesList() != null)
            sb.append("FlywheelIterationPropertiesList: " + getFlywheelIterationPropertiesList()
                    + ",");
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
                + ((getFlywheelIterationPropertiesList() == null) ? 0
                        : getFlywheelIterationPropertiesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFlywheelIterationHistoryResult == false)
            return false;
        ListFlywheelIterationHistoryResult other = (ListFlywheelIterationHistoryResult) obj;

        if (other.getFlywheelIterationPropertiesList() == null
                ^ this.getFlywheelIterationPropertiesList() == null)
            return false;
        if (other.getFlywheelIterationPropertiesList() != null
                && other.getFlywheelIterationPropertiesList().equals(
                        this.getFlywheelIterationPropertiesList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
