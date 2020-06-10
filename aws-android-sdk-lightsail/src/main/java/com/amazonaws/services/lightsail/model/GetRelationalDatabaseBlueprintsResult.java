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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

public class GetRelationalDatabaseBlueprintsResult implements Serializable {
    /**
     * <p>
     * An object describing the result of your get relational database
     * blueprints request.
     * </p>
     */
    private java.util.List<RelationalDatabaseBlueprint> blueprints;

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetRelationalDatabaseBlueprints</code> request and specify the next
     * page token using the <code>pageToken</code> parameter.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An object describing the result of your get relational database
     * blueprints request.
     * </p>
     *
     * @return <p>
     *         An object describing the result of your get relational database
     *         blueprints request.
     *         </p>
     */
    public java.util.List<RelationalDatabaseBlueprint> getBlueprints() {
        return blueprints;
    }

    /**
     * <p>
     * An object describing the result of your get relational database
     * blueprints request.
     * </p>
     *
     * @param blueprints <p>
     *            An object describing the result of your get relational
     *            database blueprints request.
     *            </p>
     */
    public void setBlueprints(java.util.Collection<RelationalDatabaseBlueprint> blueprints) {
        if (blueprints == null) {
            this.blueprints = null;
            return;
        }

        this.blueprints = new java.util.ArrayList<RelationalDatabaseBlueprint>(blueprints);
    }

    /**
     * <p>
     * An object describing the result of your get relational database
     * blueprints request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blueprints <p>
     *            An object describing the result of your get relational
     *            database blueprints request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseBlueprintsResult withBlueprints(
            RelationalDatabaseBlueprint... blueprints) {
        if (getBlueprints() == null) {
            this.blueprints = new java.util.ArrayList<RelationalDatabaseBlueprint>(
                    blueprints.length);
        }
        for (RelationalDatabaseBlueprint value : blueprints) {
            this.blueprints.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An object describing the result of your get relational database
     * blueprints request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blueprints <p>
     *            An object describing the result of your get relational
     *            database blueprints request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseBlueprintsResult withBlueprints(
            java.util.Collection<RelationalDatabaseBlueprint> blueprints) {
        setBlueprints(blueprints);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetRelationalDatabaseBlueprints</code> request and specify the next
     * page token using the <code>pageToken</code> parameter.
     * </p>
     *
     * @return <p>
     *         The token to advance to the next page of resutls from your
     *         request.
     *         </p>
     *         <p>
     *         A next page token is not returned if there are no more results to
     *         display.
     *         </p>
     *         <p>
     *         To get the next page of results, perform another
     *         <code>GetRelationalDatabaseBlueprints</code> request and specify
     *         the next page token using the <code>pageToken</code> parameter.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetRelationalDatabaseBlueprints</code> request and specify the next
     * page token using the <code>pageToken</code> parameter.
     * </p>
     *
     * @param nextPageToken <p>
     *            The token to advance to the next page of resutls from your
     *            request.
     *            </p>
     *            <p>
     *            A next page token is not returned if there are no more results
     *            to display.
     *            </p>
     *            <p>
     *            To get the next page of results, perform another
     *            <code>GetRelationalDatabaseBlueprints</code> request and
     *            specify the next page token using the <code>pageToken</code>
     *            parameter.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetRelationalDatabaseBlueprints</code> request and specify the next
     * page token using the <code>pageToken</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextPageToken <p>
     *            The token to advance to the next page of resutls from your
     *            request.
     *            </p>
     *            <p>
     *            A next page token is not returned if there are no more results
     *            to display.
     *            </p>
     *            <p>
     *            To get the next page of results, perform another
     *            <code>GetRelationalDatabaseBlueprints</code> request and
     *            specify the next page token using the <code>pageToken</code>
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseBlueprintsResult withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getBlueprints() != null)
            sb.append("blueprints: " + getBlueprints() + ",");
        if (getNextPageToken() != null)
            sb.append("nextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueprints() == null) ? 0 : getBlueprints().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseBlueprintsResult == false)
            return false;
        GetRelationalDatabaseBlueprintsResult other = (GetRelationalDatabaseBlueprintsResult) obj;

        if (other.getBlueprints() == null ^ this.getBlueprints() == null)
            return false;
        if (other.getBlueprints() != null
                && other.getBlueprints().equals(this.getBlueprints()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
