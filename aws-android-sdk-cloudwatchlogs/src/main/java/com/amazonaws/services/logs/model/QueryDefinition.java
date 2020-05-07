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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

public class QueryDefinition implements Serializable {
    /**
     * The new value for the queryDefinitionId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String queryDefinitionId;

    /**
     * The new value for the name property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^([^:*\/]+\/?)*[^:*\/]+$<br/>
     */
    private String name;

    /**
     * The new value for the queryString property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     */
    private String queryString;

    /**
     * The new value for the lastModified property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long lastModified;

    /**
     * The new value for the logGroupNames property for this object.
     */
    private java.util.List<String> logGroupNames;

    /**
     * Returns the value of the queryDefinitionId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The value of the queryDefinitionId property for this object.
     */
    public String getQueryDefinitionId() {
        return queryDefinitionId;
    }

    /**
     * Sets the value of queryDefinitionId
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param queryDefinitionId The new value for the queryDefinitionId property
     *            for this object.
     */
    public void setQueryDefinitionId(String queryDefinitionId) {
        this.queryDefinitionId = queryDefinitionId;
    }

    /**
     * Sets the value of the queryDefinitionId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param queryDefinitionId The new value for the queryDefinitionId property
     *            for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryDefinition withQueryDefinitionId(String queryDefinitionId) {
        this.queryDefinitionId = queryDefinitionId;
        return this;
    }

    /**
     * Returns the value of the name property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^([^:*\/]+\/?)*[^:*\/]+$<br/>
     *
     * @return The value of the name property for this object.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of name
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^([^:*\/]+\/?)*[^:*\/]+$<br/>
     *
     * @param name The new value for the name property for this object.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the value of the name property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^([^:*\/]+\/?)*[^:*\/]+$<br/>
     *
     * @param name The new value for the name property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns the value of the queryString property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     *
     * @return The value of the queryString property for this object.
     */
    public String getQueryString() {
        return queryString;
    }

    /**
     * Sets the value of queryString
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     *
     * @param queryString The new value for the queryString property for this
     *            object.
     */
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * Sets the value of the queryString property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     *
     * @param queryString The new value for the queryString property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryDefinition withQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * Returns the value of the lastModified property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The value of the lastModified property for this object.
     */
    public Long getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of lastModified
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param lastModified The new value for the lastModified property for this
     *            object.
     */
    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * Sets the value of the lastModified property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param lastModified The new value for the lastModified property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryDefinition withLastModified(Long lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Returns the value of the logGroupNames property for this object.
     *
     * @return The value of the logGroupNames property for this object.
     */
    public java.util.List<String> getLogGroupNames() {
        return logGroupNames;
    }

    /**
     * Sets the value of logGroupNames
     *
     * @param logGroupNames The new value for the logGroupNames property for
     *            this object.
     */
    public void setLogGroupNames(java.util.Collection<String> logGroupNames) {
        if (logGroupNames == null) {
            this.logGroupNames = null;
            return;
        }

        this.logGroupNames = new java.util.ArrayList<String>(logGroupNames);
    }

    /**
     * Sets the value of the logGroupNames property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logGroupNames The new value for the logGroupNames property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryDefinition withLogGroupNames(String... logGroupNames) {
        if (getLogGroupNames() == null) {
            this.logGroupNames = new java.util.ArrayList<String>(logGroupNames.length);
        }
        for (String value : logGroupNames) {
            this.logGroupNames.add(value);
        }
        return this;
    }

    /**
     * Sets the value of the logGroupNames property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logGroupNames The new value for the logGroupNames property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryDefinition withLogGroupNames(java.util.Collection<String> logGroupNames) {
        setLogGroupNames(logGroupNames);
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
        if (getQueryDefinitionId() != null)
            sb.append("queryDefinitionId: " + getQueryDefinitionId() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getQueryString() != null)
            sb.append("queryString: " + getQueryString() + ",");
        if (getLastModified() != null)
            sb.append("lastModified: " + getLastModified() + ",");
        if (getLogGroupNames() != null)
            sb.append("logGroupNames: " + getLogGroupNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueryDefinitionId() == null) ? 0 : getQueryDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode
                + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode
                + ((getLogGroupNames() == null) ? 0 : getLogGroupNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryDefinition == false)
            return false;
        QueryDefinition other = (QueryDefinition) obj;

        if (other.getQueryDefinitionId() == null ^ this.getQueryDefinitionId() == null)
            return false;
        if (other.getQueryDefinitionId() != null
                && other.getQueryDefinitionId().equals(this.getQueryDefinitionId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null
                && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null
                && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getLogGroupNames() == null ^ this.getLogGroupNames() == null)
            return false;
        if (other.getLogGroupNames() != null
                && other.getLogGroupNames().equals(this.getLogGroupNames()) == false)
            return false;
        return true;
    }
}
