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

package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output for <code>ListStreams</code>.
 * </p>
 */
public class ListStreamsResult implements Serializable {
    /**
     * <p>
     * The names of the streams that are associated with the AWS account making
     * the <code>ListStreams</code> request.
     * </p>
     */
    private java.util.List<String> streamNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * If set to <code>true</code>, there are more streams available to list.
     * </p>
     */
    private Boolean hasMoreStreams;

    /**
     * <p>
     * The names of the streams that are associated with the AWS account making
     * the <code>ListStreams</code> request.
     * </p>
     *
     * @return <p>
     *         The names of the streams that are associated with the AWS account
     *         making the <code>ListStreams</code> request.
     *         </p>
     */
    public java.util.List<String> getStreamNames() {
        return streamNames;
    }

    /**
     * <p>
     * The names of the streams that are associated with the AWS account making
     * the <code>ListStreams</code> request.
     * </p>
     *
     * @param streamNames <p>
     *            The names of the streams that are associated with the AWS
     *            account making the <code>ListStreams</code> request.
     *            </p>
     */
    public void setStreamNames(java.util.Collection<String> streamNames) {
        if (streamNames == null) {
            this.streamNames = null;
            return;
        }

        this.streamNames = new java.util.ArrayList<String>(streamNames);
    }

    /**
     * <p>
     * The names of the streams that are associated with the AWS account making
     * the <code>ListStreams</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamNames <p>
     *            The names of the streams that are associated with the AWS
     *            account making the <code>ListStreams</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStreamsResult withStreamNames(String... streamNames) {
        if (getStreamNames() == null) {
            this.streamNames = new java.util.ArrayList<String>(streamNames.length);
        }
        for (String value : streamNames) {
            this.streamNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the streams that are associated with the AWS account making
     * the <code>ListStreams</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamNames <p>
     *            The names of the streams that are associated with the AWS
     *            account making the <code>ListStreams</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStreamsResult withStreamNames(java.util.Collection<String> streamNames) {
        setStreamNames(streamNames);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, there are more streams available to list.
     * </p>
     *
     * @return <p>
     *         If set to <code>true</code>, there are more streams available to
     *         list.
     *         </p>
     */
    public Boolean isHasMoreStreams() {
        return hasMoreStreams;
    }

    /**
     * <p>
     * If set to <code>true</code>, there are more streams available to list.
     * </p>
     *
     * @return <p>
     *         If set to <code>true</code>, there are more streams available to
     *         list.
     *         </p>
     */
    public Boolean getHasMoreStreams() {
        return hasMoreStreams;
    }

    /**
     * <p>
     * If set to <code>true</code>, there are more streams available to list.
     * </p>
     *
     * @param hasMoreStreams <p>
     *            If set to <code>true</code>, there are more streams available
     *            to list.
     *            </p>
     */
    public void setHasMoreStreams(Boolean hasMoreStreams) {
        this.hasMoreStreams = hasMoreStreams;
    }

    /**
     * <p>
     * If set to <code>true</code>, there are more streams available to list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hasMoreStreams <p>
     *            If set to <code>true</code>, there are more streams available
     *            to list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStreamsResult withHasMoreStreams(Boolean hasMoreStreams) {
        this.hasMoreStreams = hasMoreStreams;
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
        if (getStreamNames() != null)
            sb.append("StreamNames: " + getStreamNames() + ",");
        if (getHasMoreStreams() != null)
            sb.append("HasMoreStreams: " + getHasMoreStreams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStreamNames() == null) ? 0 : getStreamNames().hashCode());
        hashCode = prime * hashCode
                + ((getHasMoreStreams() == null) ? 0 : getHasMoreStreams().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStreamsResult == false)
            return false;
        ListStreamsResult other = (ListStreamsResult) obj;

        if (other.getStreamNames() == null ^ this.getStreamNames() == null)
            return false;
        if (other.getStreamNames() != null
                && other.getStreamNames().equals(this.getStreamNames()) == false)
            return false;
        if (other.getHasMoreStreams() == null ^ this.getHasMoreStreams() == null)
            return false;
        if (other.getHasMoreStreams() != null
                && other.getHasMoreStreams().equals(this.getHasMoreStreams()) == false)
            return false;
        return true;
    }
}
