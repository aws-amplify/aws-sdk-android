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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a Kinesis video stream and the data contained in the stream.
 * </p>
 * <p>
 * This method marks the stream for deletion, and makes the data in the stream
 * inaccessible immediately.
 * </p>
 * <p>
 * </p>
 * <p>
 * To ensure that you have the latest version of the stream before deleting it,
 * you can specify the stream version. Kinesis Video Streams assigns a version
 * to each stream. When you update a stream, Kinesis Video Streams assigns a new
 * version number. To get the latest stream version, use the
 * <code>DescribeStream</code> API.
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>KinesisVideo:DeleteStream</code> action.
 * </p>
 */
public class DeleteStreamRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     */
    private String streamARN;

    /**
     * <p>
     * Optional: The version of the stream that you want to delete.
     * </p>
     * <p>
     * Specify the version as a safeguard to ensure that your are deleting the
     * correct stream. To get the stream version, use the
     * <code>DescribeStream</code> API.
     * </p>
     * <p>
     * If not specified, only the <code>CreationTime</code> is checked before
     * deleting the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     */
    private String currentVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the stream that you want to
     *         delete.
     *         </p>
     */
    public String getStreamARN() {
        return streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the stream that you want to
     *            delete.
     *            </p>
     */
    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the stream that you want to
     *            delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteStreamRequest withStreamARN(String streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    /**
     * <p>
     * Optional: The version of the stream that you want to delete.
     * </p>
     * <p>
     * Specify the version as a safeguard to ensure that your are deleting the
     * correct stream. To get the stream version, use the
     * <code>DescribeStream</code> API.
     * </p>
     * <p>
     * If not specified, only the <code>CreationTime</code> is checked before
     * deleting the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @return <p>
     *         Optional: The version of the stream that you want to delete.
     *         </p>
     *         <p>
     *         Specify the version as a safeguard to ensure that your are
     *         deleting the correct stream. To get the stream version, use the
     *         <code>DescribeStream</code> API.
     *         </p>
     *         <p>
     *         If not specified, only the <code>CreationTime</code> is checked
     *         before deleting the stream.
     *         </p>
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    /**
     * <p>
     * Optional: The version of the stream that you want to delete.
     * </p>
     * <p>
     * Specify the version as a safeguard to ensure that your are deleting the
     * correct stream. To get the stream version, use the
     * <code>DescribeStream</code> API.
     * </p>
     * <p>
     * If not specified, only the <code>CreationTime</code> is checked before
     * deleting the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @param currentVersion <p>
     *            Optional: The version of the stream that you want to delete.
     *            </p>
     *            <p>
     *            Specify the version as a safeguard to ensure that your are
     *            deleting the correct stream. To get the stream version, use
     *            the <code>DescribeStream</code> API.
     *            </p>
     *            <p>
     *            If not specified, only the <code>CreationTime</code> is
     *            checked before deleting the stream.
     *            </p>
     */
    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * Optional: The version of the stream that you want to delete.
     * </p>
     * <p>
     * Specify the version as a safeguard to ensure that your are deleting the
     * correct stream. To get the stream version, use the
     * <code>DescribeStream</code> API.
     * </p>
     * <p>
     * If not specified, only the <code>CreationTime</code> is checked before
     * deleting the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @param currentVersion <p>
     *            Optional: The version of the stream that you want to delete.
     *            </p>
     *            <p>
     *            Specify the version as a safeguard to ensure that your are
     *            deleting the correct stream. To get the stream version, use
     *            the <code>DescribeStream</code> API.
     *            </p>
     *            <p>
     *            If not specified, only the <code>CreationTime</code> is
     *            checked before deleting the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteStreamRequest withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
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
        if (getStreamARN() != null)
            sb.append("StreamARN: " + getStreamARN() + ",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: " + getCurrentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteStreamRequest == false)
            return false;
        DeleteStreamRequest other = (DeleteStreamRequest) obj;

        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null
                && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null
                && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        return true;
    }
}
