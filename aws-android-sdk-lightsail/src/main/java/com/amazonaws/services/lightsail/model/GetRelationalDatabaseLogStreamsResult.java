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

public class GetRelationalDatabaseLogStreamsResult implements Serializable {
    /**
     * <p>
     * An object describing the result of your get relational database log
     * streams request.
     * </p>
     */
    private java.util.List<String> logStreams;

    /**
     * <p>
     * An object describing the result of your get relational database log
     * streams request.
     * </p>
     *
     * @return <p>
     *         An object describing the result of your get relational database
     *         log streams request.
     *         </p>
     */
    public java.util.List<String> getLogStreams() {
        return logStreams;
    }

    /**
     * <p>
     * An object describing the result of your get relational database log
     * streams request.
     * </p>
     *
     * @param logStreams <p>
     *            An object describing the result of your get relational
     *            database log streams request.
     *            </p>
     */
    public void setLogStreams(java.util.Collection<String> logStreams) {
        if (logStreams == null) {
            this.logStreams = null;
            return;
        }

        this.logStreams = new java.util.ArrayList<String>(logStreams);
    }

    /**
     * <p>
     * An object describing the result of your get relational database log
     * streams request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logStreams <p>
     *            An object describing the result of your get relational
     *            database log streams request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseLogStreamsResult withLogStreams(String... logStreams) {
        if (getLogStreams() == null) {
            this.logStreams = new java.util.ArrayList<String>(logStreams.length);
        }
        for (String value : logStreams) {
            this.logStreams.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An object describing the result of your get relational database log
     * streams request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logStreams <p>
     *            An object describing the result of your get relational
     *            database log streams request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseLogStreamsResult withLogStreams(
            java.util.Collection<String> logStreams) {
        setLogStreams(logStreams);
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
        if (getLogStreams() != null)
            sb.append("logStreams: " + getLogStreams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogStreams() == null) ? 0 : getLogStreams().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseLogStreamsResult == false)
            return false;
        GetRelationalDatabaseLogStreamsResult other = (GetRelationalDatabaseLogStreamsResult) obj;

        if (other.getLogStreams() == null ^ this.getLogStreams() == null)
            return false;
        if (other.getLogStreams() != null
                && other.getLogStreams().equals(this.getLogStreams()) == false)
            return false;
        return true;
    }
}
