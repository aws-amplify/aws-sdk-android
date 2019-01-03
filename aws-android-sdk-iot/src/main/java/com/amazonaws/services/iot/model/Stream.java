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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a group of files that can be streamed.
 * </p>
 */
public class Stream implements Serializable {
    /**
     * <p>
     * The stream ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String streamId;

    /**
     * <p>
     * The ID of a file associated with a stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     */
    private Integer fileId;

    /**
     * <p>
     * The stream ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The stream ID.
     *         </p>
     */
    public String getStreamId() {
        return streamId;
    }

    /**
     * <p>
     * The stream ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param streamId <p>
     *            The stream ID.
     *            </p>
     */
    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    /**
     * <p>
     * The stream ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param streamId <p>
     *            The stream ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stream withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * <p>
     * The ID of a file associated with a stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @return <p>
     *         The ID of a file associated with a stream.
     *         </p>
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * <p>
     * The ID of a file associated with a stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param fileId <p>
     *            The ID of a file associated with a stream.
     *            </p>
     */
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * <p>
     * The ID of a file associated with a stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param fileId <p>
     *            The ID of a file associated with a stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Stream withFileId(Integer fileId) {
        this.fileId = fileId;
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
        if (getStreamId() != null)
            sb.append("streamId: " + getStreamId() + ",");
        if (getFileId() != null)
            sb.append("fileId: " + getFileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        hashCode = prime * hashCode + ((getFileId() == null) ? 0 : getFileId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Stream == false)
            return false;
        Stream other = (Stream) obj;

        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        if (other.getFileId() == null ^ this.getFileId() == null)
            return false;
        if (other.getFileId() != null && other.getFileId().equals(this.getFileId()) == false)
            return false;
        return true;
    }
}
