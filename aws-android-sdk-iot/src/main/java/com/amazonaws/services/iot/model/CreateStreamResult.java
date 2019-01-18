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

public class CreateStreamResult implements Serializable {
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
     * The stream ARN.
     * </p>
     */
    private String streamArn;

    /**
     * <p>
     * A description of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     */
    private String description;

    /**
     * <p>
     * The version of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     */
    private Integer streamVersion;

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
    public CreateStreamResult withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * <p>
     * The stream ARN.
     * </p>
     *
     * @return <p>
     *         The stream ARN.
     *         </p>
     */
    public String getStreamArn() {
        return streamArn;
    }

    /**
     * <p>
     * The stream ARN.
     * </p>
     *
     * @param streamArn <p>
     *            The stream ARN.
     *            </p>
     */
    public void setStreamArn(String streamArn) {
        this.streamArn = streamArn;
    }

    /**
     * <p>
     * The stream ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamArn <p>
     *            The stream ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamResult withStreamArn(String streamArn) {
        this.streamArn = streamArn;
        return this;
    }

    /**
     * <p>
     * A description of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @return <p>
     *         A description of the stream.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            A description of the stream.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            A description of the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The version of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @return <p>
     *         The version of the stream.
     *         </p>
     */
    public Integer getStreamVersion() {
        return streamVersion;
    }

    /**
     * <p>
     * The version of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param streamVersion <p>
     *            The version of the stream.
     *            </p>
     */
    public void setStreamVersion(Integer streamVersion) {
        this.streamVersion = streamVersion;
    }

    /**
     * <p>
     * The version of the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param streamVersion <p>
     *            The version of the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamResult withStreamVersion(Integer streamVersion) {
        this.streamVersion = streamVersion;
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
        if (getStreamArn() != null)
            sb.append("streamArn: " + getStreamArn() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getStreamVersion() != null)
            sb.append("streamVersion: " + getStreamVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getStreamVersion() == null) ? 0 : getStreamVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStreamResult == false)
            return false;
        CreateStreamResult other = (CreateStreamResult) obj;

        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null
                && other.getStreamArn().equals(this.getStreamArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStreamVersion() == null ^ this.getStreamVersion() == null)
            return false;
        if (other.getStreamVersion() != null
                && other.getStreamVersion().equals(this.getStreamVersion()) == false)
            return false;
        return true;
    }
}
