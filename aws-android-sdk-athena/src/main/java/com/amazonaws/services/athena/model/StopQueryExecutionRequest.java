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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Stops a query execution. Requires you to have access to the workgroup in
 * which the query ran.
 * </p>
 * <p>
 * For code samples using the AWS SDK for Java, see <a
 * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples
 * and Code Samples</a> in the <i>Amazon Athena User Guide</i>.
 * </p>
 */
public class StopQueryExecutionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of the query execution to stop.
     * </p>
     */
    private String queryExecutionId;

    /**
     * <p>
     * The unique ID of the query execution to stop.
     * </p>
     *
     * @return <p>
     *         The unique ID of the query execution to stop.
     *         </p>
     */
    public String getQueryExecutionId() {
        return queryExecutionId;
    }

    /**
     * <p>
     * The unique ID of the query execution to stop.
     * </p>
     *
     * @param queryExecutionId <p>
     *            The unique ID of the query execution to stop.
     *            </p>
     */
    public void setQueryExecutionId(String queryExecutionId) {
        this.queryExecutionId = queryExecutionId;
    }

    /**
     * <p>
     * The unique ID of the query execution to stop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryExecutionId <p>
     *            The unique ID of the query execution to stop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopQueryExecutionRequest withQueryExecutionId(String queryExecutionId) {
        this.queryExecutionId = queryExecutionId;
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
        if (getQueryExecutionId() != null)
            sb.append("QueryExecutionId: " + getQueryExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueryExecutionId() == null) ? 0 : getQueryExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopQueryExecutionRequest == false)
            return false;
        StopQueryExecutionRequest other = (StopQueryExecutionRequest) obj;

        if (other.getQueryExecutionId() == null ^ this.getQueryExecutionId() == null)
            return false;
        if (other.getQueryExecutionId() != null
                && other.getQueryExecutionId().equals(this.getQueryExecutionId()) == false)
            return false;
        return true;
    }
}
