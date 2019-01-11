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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the search status of a log stream.
 * </p>
 */
public class SearchedLogStream implements Serializable {
    /**
     * <p>
     * The name of the log stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String logStreamName;

    /**
     * <p>
     * Indicates whether all the events in this log stream were searched.
     * </p>
     */
    private Boolean searchedCompletely;

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return <p>
     *         The name of the log stream.
     *         </p>
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamName <p>
     *            The name of the log stream.
     *            </p>
     */
    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamName <p>
     *            The name of the log stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchedLogStream withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * <p>
     * Indicates whether all the events in this log stream were searched.
     * </p>
     *
     * @return <p>
     *         Indicates whether all the events in this log stream were
     *         searched.
     *         </p>
     */
    public Boolean isSearchedCompletely() {
        return searchedCompletely;
    }

    /**
     * <p>
     * Indicates whether all the events in this log stream were searched.
     * </p>
     *
     * @return <p>
     *         Indicates whether all the events in this log stream were
     *         searched.
     *         </p>
     */
    public Boolean getSearchedCompletely() {
        return searchedCompletely;
    }

    /**
     * <p>
     * Indicates whether all the events in this log stream were searched.
     * </p>
     *
     * @param searchedCompletely <p>
     *            Indicates whether all the events in this log stream were
     *            searched.
     *            </p>
     */
    public void setSearchedCompletely(Boolean searchedCompletely) {
        this.searchedCompletely = searchedCompletely;
    }

    /**
     * <p>
     * Indicates whether all the events in this log stream were searched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param searchedCompletely <p>
     *            Indicates whether all the events in this log stream were
     *            searched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchedLogStream withSearchedCompletely(Boolean searchedCompletely) {
        this.searchedCompletely = searchedCompletely;
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
        if (getLogStreamName() != null)
            sb.append("logStreamName: " + getLogStreamName() + ",");
        if (getSearchedCompletely() != null)
            sb.append("searchedCompletely: " + getSearchedCompletely());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLogStreamName() == null) ? 0 : getLogStreamName().hashCode());
        hashCode = prime * hashCode
                + ((getSearchedCompletely() == null) ? 0 : getSearchedCompletely().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchedLogStream == false)
            return false;
        SearchedLogStream other = (SearchedLogStream) obj;

        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null)
            return false;
        if (other.getLogStreamName() != null
                && other.getLogStreamName().equals(this.getLogStreamName()) == false)
            return false;
        if (other.getSearchedCompletely() == null ^ this.getSearchedCompletely() == null)
            return false;
        if (other.getSearchedCompletely() != null
                && other.getSearchedCompletely().equals(this.getSearchedCompletely()) == false)
            return false;
        return true;
    }
}
