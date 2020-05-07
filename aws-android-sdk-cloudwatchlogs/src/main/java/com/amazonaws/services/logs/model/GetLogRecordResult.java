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

public class GetLogRecordResult implements Serializable {
    /**
     * <p>
     * The requested log event, as a JSON string.
     * </p>
     */
    private java.util.Map<String, String> logRecord;

    /**
     * <p>
     * The requested log event, as a JSON string.
     * </p>
     *
     * @return <p>
     *         The requested log event, as a JSON string.
     *         </p>
     */
    public java.util.Map<String, String> getLogRecord() {
        return logRecord;
    }

    /**
     * <p>
     * The requested log event, as a JSON string.
     * </p>
     *
     * @param logRecord <p>
     *            The requested log event, as a JSON string.
     *            </p>
     */
    public void setLogRecord(java.util.Map<String, String> logRecord) {
        this.logRecord = logRecord;
    }

    /**
     * <p>
     * The requested log event, as a JSON string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logRecord <p>
     *            The requested log event, as a JSON string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLogRecordResult withLogRecord(java.util.Map<String, String> logRecord) {
        this.logRecord = logRecord;
        return this;
    }

    /**
     * <p>
     * The requested log event, as a JSON string.
     * </p>
     * <p>
     * The method adds a new key-value pair into logRecord parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into logRecord.
     * @param value The corresponding value of the entry to be added into
     *            logRecord.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLogRecordResult addlogRecordEntry(String key, String value) {
        if (null == this.logRecord) {
            this.logRecord = new java.util.HashMap<String, String>();
        }
        if (this.logRecord.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.logRecord.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into logRecord.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetLogRecordResult clearlogRecordEntries() {
        this.logRecord = null;
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
        if (getLogRecord() != null)
            sb.append("logRecord: " + getLogRecord());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogRecord() == null) ? 0 : getLogRecord().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLogRecordResult == false)
            return false;
        GetLogRecordResult other = (GetLogRecordResult) obj;

        if (other.getLogRecord() == null ^ this.getLogRecord() == null)
            return false;
        if (other.getLogRecord() != null
                && other.getLogRecord().equals(this.getLogRecord()) == false)
            return false;
        return true;
    }
}
