/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes tags from the specified Amazon Kinesis stream. Removed tags are
 * deleted and cannot be recovered after this operation successfully completes.
 * </p>
 * <p>
 * If you specify a tag that does not exist, it is ignored.
 * </p>
 */
public class RemoveTagsFromStreamRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * A list of tag keys. Each corresponding tag is removed from the stream.
     * </p>
     */
    private java.util.List<String> tagKeys = new java.util.ArrayList<String>();

    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsFromStreamRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * A list of tag keys. Each corresponding tag is removed from the stream.
     * </p>
     *
     * @return <p>
     *         A list of tag keys. Each corresponding tag is removed from the
     *         stream.
     *         </p>
     */
    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * A list of tag keys. Each corresponding tag is removed from the stream.
     * </p>
     *
     * @param tagKeys <p>
     *            A list of tag keys. Each corresponding tag is removed from the
     *            stream.
     *            </p>
     */
    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * A list of tag keys. Each corresponding tag is removed from the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            A list of tag keys. Each corresponding tag is removed from the
     *            stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsFromStreamRequest withTagKeys(String... tagKeys) {
        if (getTagKeys() == null) {
            this.tagKeys = new java.util.ArrayList<String>(tagKeys.length);
        }
        for (String value : tagKeys) {
            this.tagKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag keys. Each corresponding tag is removed from the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            A list of tag keys. Each corresponding tag is removed from the
     *            stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsFromStreamRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveTagsFromStreamRequest == false)
            return false;
        RemoveTagsFromStreamRequest other = (RemoveTagsFromStreamRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }
}
