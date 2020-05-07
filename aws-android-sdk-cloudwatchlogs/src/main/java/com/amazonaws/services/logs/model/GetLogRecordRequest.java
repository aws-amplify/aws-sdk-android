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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves all the fields and values of a single log event. All fields are
 * retrieved, even if the original query that produced the
 * <code>logRecordPointer</code> retrieved only a subset of fields. Fields are
 * returned as field name/field value pairs.
 * </p>
 * <p>
 * Additionally, the entire unparsed log event is returned within
 * <code>@message</code>.
 * </p>
 */
public class GetLogRecordRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The pointer corresponding to the log event record you want to retrieve.
     * You get this from the response of a <code>GetQueryResults</code>
     * operation. In that response, the value of the <code>@ptr</code> field for
     * a log event is the value to use as <code>logRecordPointer</code> to
     * retrieve that complete log event record.
     * </p>
     */
    private String logRecordPointer;

    /**
     * <p>
     * The pointer corresponding to the log event record you want to retrieve.
     * You get this from the response of a <code>GetQueryResults</code>
     * operation. In that response, the value of the <code>@ptr</code> field for
     * a log event is the value to use as <code>logRecordPointer</code> to
     * retrieve that complete log event record.
     * </p>
     *
     * @return <p>
     *         The pointer corresponding to the log event record you want to
     *         retrieve. You get this from the response of a
     *         <code>GetQueryResults</code> operation. In that response, the
     *         value of the <code>@ptr</code> field for a log event is the value
     *         to use as <code>logRecordPointer</code> to retrieve that complete
     *         log event record.
     *         </p>
     */
    public String getLogRecordPointer() {
        return logRecordPointer;
    }

    /**
     * <p>
     * The pointer corresponding to the log event record you want to retrieve.
     * You get this from the response of a <code>GetQueryResults</code>
     * operation. In that response, the value of the <code>@ptr</code> field for
     * a log event is the value to use as <code>logRecordPointer</code> to
     * retrieve that complete log event record.
     * </p>
     *
     * @param logRecordPointer <p>
     *            The pointer corresponding to the log event record you want to
     *            retrieve. You get this from the response of a
     *            <code>GetQueryResults</code> operation. In that response, the
     *            value of the <code>@ptr</code> field for a log event is the
     *            value to use as <code>logRecordPointer</code> to retrieve that
     *            complete log event record.
     *            </p>
     */
    public void setLogRecordPointer(String logRecordPointer) {
        this.logRecordPointer = logRecordPointer;
    }

    /**
     * <p>
     * The pointer corresponding to the log event record you want to retrieve.
     * You get this from the response of a <code>GetQueryResults</code>
     * operation. In that response, the value of the <code>@ptr</code> field for
     * a log event is the value to use as <code>logRecordPointer</code> to
     * retrieve that complete log event record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logRecordPointer <p>
     *            The pointer corresponding to the log event record you want to
     *            retrieve. You get this from the response of a
     *            <code>GetQueryResults</code> operation. In that response, the
     *            value of the <code>@ptr</code> field for a log event is the
     *            value to use as <code>logRecordPointer</code> to retrieve that
     *            complete log event record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLogRecordRequest withLogRecordPointer(String logRecordPointer) {
        this.logRecordPointer = logRecordPointer;
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
        if (getLogRecordPointer() != null)
            sb.append("logRecordPointer: " + getLogRecordPointer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLogRecordPointer() == null) ? 0 : getLogRecordPointer().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLogRecordRequest == false)
            return false;
        GetLogRecordRequest other = (GetLogRecordRequest) obj;

        if (other.getLogRecordPointer() == null ^ this.getLogRecordPointer() == null)
            return false;
        if (other.getLogRecordPointer() != null
                && other.getLogRecordPointer().equals(this.getLogRecordPointer()) == false)
            return false;
        return true;
    }
}
