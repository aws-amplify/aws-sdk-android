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

public class GetLogGroupFieldsResult implements Serializable {
    /**
     * <p>
     * The array of fields found in the query. Each object in the array contains
     * the name of the field, along with the percentage of time it appeared in
     * the log events that were queried.
     * </p>
     */
    private java.util.List<LogGroupField> logGroupFields;

    /**
     * <p>
     * The array of fields found in the query. Each object in the array contains
     * the name of the field, along with the percentage of time it appeared in
     * the log events that were queried.
     * </p>
     *
     * @return <p>
     *         The array of fields found in the query. Each object in the array
     *         contains the name of the field, along with the percentage of time
     *         it appeared in the log events that were queried.
     *         </p>
     */
    public java.util.List<LogGroupField> getLogGroupFields() {
        return logGroupFields;
    }

    /**
     * <p>
     * The array of fields found in the query. Each object in the array contains
     * the name of the field, along with the percentage of time it appeared in
     * the log events that were queried.
     * </p>
     *
     * @param logGroupFields <p>
     *            The array of fields found in the query. Each object in the
     *            array contains the name of the field, along with the
     *            percentage of time it appeared in the log events that were
     *            queried.
     *            </p>
     */
    public void setLogGroupFields(java.util.Collection<LogGroupField> logGroupFields) {
        if (logGroupFields == null) {
            this.logGroupFields = null;
            return;
        }

        this.logGroupFields = new java.util.ArrayList<LogGroupField>(logGroupFields);
    }

    /**
     * <p>
     * The array of fields found in the query. Each object in the array contains
     * the name of the field, along with the percentage of time it appeared in
     * the log events that were queried.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logGroupFields <p>
     *            The array of fields found in the query. Each object in the
     *            array contains the name of the field, along with the
     *            percentage of time it appeared in the log events that were
     *            queried.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLogGroupFieldsResult withLogGroupFields(LogGroupField... logGroupFields) {
        if (getLogGroupFields() == null) {
            this.logGroupFields = new java.util.ArrayList<LogGroupField>(logGroupFields.length);
        }
        for (LogGroupField value : logGroupFields) {
            this.logGroupFields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The array of fields found in the query. Each object in the array contains
     * the name of the field, along with the percentage of time it appeared in
     * the log events that were queried.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logGroupFields <p>
     *            The array of fields found in the query. Each object in the
     *            array contains the name of the field, along with the
     *            percentage of time it appeared in the log events that were
     *            queried.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLogGroupFieldsResult withLogGroupFields(
            java.util.Collection<LogGroupField> logGroupFields) {
        setLogGroupFields(logGroupFields);
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
        if (getLogGroupFields() != null)
            sb.append("logGroupFields: " + getLogGroupFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLogGroupFields() == null) ? 0 : getLogGroupFields().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLogGroupFieldsResult == false)
            return false;
        GetLogGroupFieldsResult other = (GetLogGroupFieldsResult) obj;

        if (other.getLogGroupFields() == null ^ this.getLogGroupFields() == null)
            return false;
        if (other.getLogGroupFields() != null
                && other.getLogGroupFields().equals(this.getLogGroupFields()) == false)
            return false;
        return true;
    }
}
