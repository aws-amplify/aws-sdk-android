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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of available log streams for a specific database in Amazon
 * Lightsail.
 * </p>
 */
public class GetRelationalDatabaseLogStreamsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of your database for which to get log streams.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String relationalDatabaseName;

    /**
     * <p>
     * The name of your database for which to get log streams.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of your database for which to get log streams.
     *         </p>
     */
    public String getRelationalDatabaseName() {
        return relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database for which to get log streams.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param relationalDatabaseName <p>
     *            The name of your database for which to get log streams.
     *            </p>
     */
    public void setRelationalDatabaseName(String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database for which to get log streams.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param relationalDatabaseName <p>
     *            The name of your database for which to get log streams.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseLogStreamsRequest withRelationalDatabaseName(
            String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
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
        if (getRelationalDatabaseName() != null)
            sb.append("relationalDatabaseName: " + getRelationalDatabaseName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRelationalDatabaseName() == null) ? 0 : getRelationalDatabaseName()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseLogStreamsRequest == false)
            return false;
        GetRelationalDatabaseLogStreamsRequest other = (GetRelationalDatabaseLogStreamsRequest) obj;

        if (other.getRelationalDatabaseName() == null ^ this.getRelationalDatabaseName() == null)
            return false;
        if (other.getRelationalDatabaseName() != null
                && other.getRelationalDatabaseName().equals(this.getRelationalDatabaseName()) == false)
            return false;
        return true;
    }
}
