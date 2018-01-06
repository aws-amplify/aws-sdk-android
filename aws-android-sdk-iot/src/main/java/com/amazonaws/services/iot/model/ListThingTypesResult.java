/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The output for the ListThingTypes operation.
 * </p>
 */
public class ListThingTypesResult implements Serializable {
    /**
     * <p>
     * The thing types.
     * </p>
     */
    private java.util.List<ThingTypeDefinition> thingTypes;

    /**
     * <p>
     * The token for the next set of results, or <b>null</b> if there are no
     * additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The thing types.
     * </p>
     *
     * @return <p>
     *         The thing types.
     *         </p>
     */
    public java.util.List<ThingTypeDefinition> getThingTypes() {
        return thingTypes;
    }

    /**
     * <p>
     * The thing types.
     * </p>
     *
     * @param thingTypes <p>
     *            The thing types.
     *            </p>
     */
    public void setThingTypes(java.util.Collection<ThingTypeDefinition> thingTypes) {
        if (thingTypes == null) {
            this.thingTypes = null;
            return;
        }

        this.thingTypes = new java.util.ArrayList<ThingTypeDefinition>(thingTypes);
    }

    /**
     * <p>
     * The thing types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingTypes <p>
     *            The thing types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingTypesResult withThingTypes(ThingTypeDefinition... thingTypes) {
        if (getThingTypes() == null) {
            this.thingTypes = new java.util.ArrayList<ThingTypeDefinition>(thingTypes.length);
        }
        for (ThingTypeDefinition value : thingTypes) {
            this.thingTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The thing types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingTypes <p>
     *            The thing types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingTypesResult withThingTypes(java.util.Collection<ThingTypeDefinition> thingTypes) {
        setThingTypes(thingTypes);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or <b>null</b> if there are no
     * additional results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results, or <b>null</b> if there
     *         are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or <b>null</b> if there are no
     * additional results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results, or <b>null</b> if there
     *            are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or <b>null</b> if there are no
     * additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results, or <b>null</b> if there
     *            are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingTypesResult withNextToken(String nextToken) {
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
        if (getThingTypes() != null)
            sb.append("thingTypes: " + getThingTypes() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingTypes() == null) ? 0 : getThingTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListThingTypesResult == false)
            return false;
        ListThingTypesResult other = (ListThingTypesResult) obj;

        if (other.getThingTypes() == null ^ this.getThingTypes() == null)
            return false;
        if (other.getThingTypes() != null
                && other.getThingTypes().equals(this.getThingTypes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
