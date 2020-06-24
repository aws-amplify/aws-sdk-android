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

package com.amazonaws.services.honeycode.model;

import java.io.Serializable;

public class GetScreenDataResult implements Serializable {
    /**
     * <p>
     * A map of all the rows on the screen keyed by block name.
     * </p>
     */
    private java.util.Map<String, ResultSet> results;

    /**
     * <p>
     * Indicates the cursor of the workbook at which the data returned by this
     * workbook is read. Workbook cursor keeps increasing with every update and
     * the increments are not sequential.
     * </p>
     */
    private Long workbookCursor;

    /**
     * <p>
     * Provides the pagination token to load the next page if there are more
     * results matching the request. If a pagination token is not present in the
     * response, it means that all data matching the query has been loaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A map of all the rows on the screen keyed by block name.
     * </p>
     *
     * @return <p>
     *         A map of all the rows on the screen keyed by block name.
     *         </p>
     */
    public java.util.Map<String, ResultSet> getResults() {
        return results;
    }

    /**
     * <p>
     * A map of all the rows on the screen keyed by block name.
     * </p>
     *
     * @param results <p>
     *            A map of all the rows on the screen keyed by block name.
     *            </p>
     */
    public void setResults(java.util.Map<String, ResultSet> results) {
        this.results = results;
    }

    /**
     * <p>
     * A map of all the rows on the screen keyed by block name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param results <p>
     *            A map of all the rows on the screen keyed by block name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetScreenDataResult withResults(java.util.Map<String, ResultSet> results) {
        this.results = results;
        return this;
    }

    /**
     * <p>
     * A map of all the rows on the screen keyed by block name.
     * </p>
     * <p>
     * The method adds a new key-value pair into results parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into results.
     * @param value The corresponding value of the entry to be added into
     *            results.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetScreenDataResult addresultsEntry(String key, ResultSet value) {
        if (null == this.results) {
            this.results = new java.util.HashMap<String, ResultSet>();
        }
        if (this.results.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.results.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into results.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetScreenDataResult clearresultsEntries() {
        this.results = null;
        return this;
    }

    /**
     * <p>
     * Indicates the cursor of the workbook at which the data returned by this
     * workbook is read. Workbook cursor keeps increasing with every update and
     * the increments are not sequential.
     * </p>
     *
     * @return <p>
     *         Indicates the cursor of the workbook at which the data returned
     *         by this workbook is read. Workbook cursor keeps increasing with
     *         every update and the increments are not sequential.
     *         </p>
     */
    public Long getWorkbookCursor() {
        return workbookCursor;
    }

    /**
     * <p>
     * Indicates the cursor of the workbook at which the data returned by this
     * workbook is read. Workbook cursor keeps increasing with every update and
     * the increments are not sequential.
     * </p>
     *
     * @param workbookCursor <p>
     *            Indicates the cursor of the workbook at which the data
     *            returned by this workbook is read. Workbook cursor keeps
     *            increasing with every update and the increments are not
     *            sequential.
     *            </p>
     */
    public void setWorkbookCursor(Long workbookCursor) {
        this.workbookCursor = workbookCursor;
    }

    /**
     * <p>
     * Indicates the cursor of the workbook at which the data returned by this
     * workbook is read. Workbook cursor keeps increasing with every update and
     * the increments are not sequential.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param workbookCursor <p>
     *            Indicates the cursor of the workbook at which the data
     *            returned by this workbook is read. Workbook cursor keeps
     *            increasing with every update and the increments are not
     *            sequential.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetScreenDataResult withWorkbookCursor(Long workbookCursor) {
        this.workbookCursor = workbookCursor;
        return this;
    }

    /**
     * <p>
     * Provides the pagination token to load the next page if there are more
     * results matching the request. If a pagination token is not present in the
     * response, it means that all data matching the query has been loaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         Provides the pagination token to load the next page if there are
     *         more results matching the request. If a pagination token is not
     *         present in the response, it means that all data matching the
     *         query has been loaded.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Provides the pagination token to load the next page if there are more
     * results matching the request. If a pagination token is not present in the
     * response, it means that all data matching the query has been loaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            Provides the pagination token to load the next page if there
     *            are more results matching the request. If a pagination token
     *            is not present in the response, it means that all data
     *            matching the query has been loaded.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Provides the pagination token to load the next page if there are more
     * results matching the request. If a pagination token is not present in the
     * response, it means that all data matching the query has been loaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            Provides the pagination token to load the next page if there
     *            are more results matching the request. If a pagination token
     *            is not present in the response, it means that all data
     *            matching the query has been loaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetScreenDataResult withNextToken(String nextToken) {
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
        if (getResults() != null)
            sb.append("results: " + getResults() + ",");
        if (getWorkbookCursor() != null)
            sb.append("workbookCursor: " + getWorkbookCursor() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode
                + ((getWorkbookCursor() == null) ? 0 : getWorkbookCursor().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetScreenDataResult == false)
            return false;
        GetScreenDataResult other = (GetScreenDataResult) obj;

        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getWorkbookCursor() == null ^ this.getWorkbookCursor() == null)
            return false;
        if (other.getWorkbookCursor() != null
                && other.getWorkbookCursor().equals(this.getWorkbookCursor()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
