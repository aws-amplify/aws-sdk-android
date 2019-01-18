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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class SearchIndexResult implements Serializable {
    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The things that match the search query.
     * </p>
     */
    private java.util.List<ThingDocument> things;

    /**
     * <p>
     * The thing groups that match the search query.
     * </p>
     */
    private java.util.List<ThingGroupDocument> thingGroups;

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     *
     * @return <p>
     *         The token used to get the next set of results, or <b>null</b> if
     *         there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            The token used to get the next set of results, or <b>null</b>
     *            if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token used to get the next set of results, or <b>null</b>
     *            if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchIndexResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The things that match the search query.
     * </p>
     *
     * @return <p>
     *         The things that match the search query.
     *         </p>
     */
    public java.util.List<ThingDocument> getThings() {
        return things;
    }

    /**
     * <p>
     * The things that match the search query.
     * </p>
     *
     * @param things <p>
     *            The things that match the search query.
     *            </p>
     */
    public void setThings(java.util.Collection<ThingDocument> things) {
        if (things == null) {
            this.things = null;
            return;
        }

        this.things = new java.util.ArrayList<ThingDocument>(things);
    }

    /**
     * <p>
     * The things that match the search query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param things <p>
     *            The things that match the search query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchIndexResult withThings(ThingDocument... things) {
        if (getThings() == null) {
            this.things = new java.util.ArrayList<ThingDocument>(things.length);
        }
        for (ThingDocument value : things) {
            this.things.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The things that match the search query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param things <p>
     *            The things that match the search query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchIndexResult withThings(java.util.Collection<ThingDocument> things) {
        setThings(things);
        return this;
    }

    /**
     * <p>
     * The thing groups that match the search query.
     * </p>
     *
     * @return <p>
     *         The thing groups that match the search query.
     *         </p>
     */
    public java.util.List<ThingGroupDocument> getThingGroups() {
        return thingGroups;
    }

    /**
     * <p>
     * The thing groups that match the search query.
     * </p>
     *
     * @param thingGroups <p>
     *            The thing groups that match the search query.
     *            </p>
     */
    public void setThingGroups(java.util.Collection<ThingGroupDocument> thingGroups) {
        if (thingGroups == null) {
            this.thingGroups = null;
            return;
        }

        this.thingGroups = new java.util.ArrayList<ThingGroupDocument>(thingGroups);
    }

    /**
     * <p>
     * The thing groups that match the search query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroups <p>
     *            The thing groups that match the search query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchIndexResult withThingGroups(ThingGroupDocument... thingGroups) {
        if (getThingGroups() == null) {
            this.thingGroups = new java.util.ArrayList<ThingGroupDocument>(thingGroups.length);
        }
        for (ThingGroupDocument value : thingGroups) {
            this.thingGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The thing groups that match the search query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroups <p>
     *            The thing groups that match the search query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchIndexResult withThingGroups(java.util.Collection<ThingGroupDocument> thingGroups) {
        setThingGroups(thingGroups);
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
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getThings() != null)
            sb.append("things: " + getThings() + ",");
        if (getThingGroups() != null)
            sb.append("thingGroups: " + getThingGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getThings() == null) ? 0 : getThings().hashCode());
        hashCode = prime * hashCode
                + ((getThingGroups() == null) ? 0 : getThingGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchIndexResult == false)
            return false;
        SearchIndexResult other = (SearchIndexResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getThings() == null ^ this.getThings() == null)
            return false;
        if (other.getThings() != null && other.getThings().equals(this.getThings()) == false)
            return false;
        if (other.getThingGroups() == null ^ this.getThingGroups() == null)
            return false;
        if (other.getThingGroups() != null
                && other.getThingGroups().equals(this.getThingGroups()) == false)
            return false;
        return true;
    }
}
