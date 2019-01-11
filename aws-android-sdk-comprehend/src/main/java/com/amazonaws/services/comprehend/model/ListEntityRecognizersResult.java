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

public class ListEntityRecognizersResult implements Serializable {
    /**
     * <p>
     * The list of properties of an entity recognizer.
     * </p>
     */
    private java.util.List<EntityRecognizerProperties> entityRecognizerPropertiesList;

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
     * The list of properties of an entity recognizer.
     * </p>
     *
     * @return <p>
     *         The list of properties of an entity recognizer.
     *         </p>
     */
    public java.util.List<EntityRecognizerProperties> getEntityRecognizerPropertiesList() {
        return entityRecognizerPropertiesList;
    }

    /**
     * <p>
     * The list of properties of an entity recognizer.
     * </p>
     *
     * @param entityRecognizerPropertiesList <p>
     *            The list of properties of an entity recognizer.
     *            </p>
     */
    public void setEntityRecognizerPropertiesList(
            java.util.Collection<EntityRecognizerProperties> entityRecognizerPropertiesList) {
        if (entityRecognizerPropertiesList == null) {
            this.entityRecognizerPropertiesList = null;
            return;
        }

        this.entityRecognizerPropertiesList = new java.util.ArrayList<EntityRecognizerProperties>(
                entityRecognizerPropertiesList);
    }

    /**
     * <p>
     * The list of properties of an entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityRecognizerPropertiesList <p>
     *            The list of properties of an entity recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntityRecognizersResult withEntityRecognizerPropertiesList(
            EntityRecognizerProperties... entityRecognizerPropertiesList) {
        if (getEntityRecognizerPropertiesList() == null) {
            this.entityRecognizerPropertiesList = new java.util.ArrayList<EntityRecognizerProperties>(
                    entityRecognizerPropertiesList.length);
        }
        for (EntityRecognizerProperties value : entityRecognizerPropertiesList) {
            this.entityRecognizerPropertiesList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of properties of an entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityRecognizerPropertiesList <p>
     *            The list of properties of an entity recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntityRecognizersResult withEntityRecognizerPropertiesList(
            java.util.Collection<EntityRecognizerProperties> entityRecognizerPropertiesList) {
        setEntityRecognizerPropertiesList(entityRecognizerPropertiesList);
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
    public ListEntityRecognizersResult withNextToken(String nextToken) {
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
        if (getEntityRecognizerPropertiesList() != null)
            sb.append("EntityRecognizerPropertiesList: " + getEntityRecognizerPropertiesList()
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
                + ((getEntityRecognizerPropertiesList() == null) ? 0
                        : getEntityRecognizerPropertiesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEntityRecognizersResult == false)
            return false;
        ListEntityRecognizersResult other = (ListEntityRecognizersResult) obj;

        if (other.getEntityRecognizerPropertiesList() == null
                ^ this.getEntityRecognizerPropertiesList() == null)
            return false;
        if (other.getEntityRecognizerPropertiesList() != null
                && other.getEntityRecognizerPropertiesList().equals(
                        this.getEntityRecognizerPropertiesList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
