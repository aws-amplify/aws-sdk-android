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
 * Removes one or more tags from a stream. In the request, specify only a tag
 * key or keys; don't specify the value. If you specify a tag key that does not
 * exist, it's ignored.
 * </p>
 * <p>
 * In the request, you must provide the <code>StreamName</code> or
 * <code>StreamARN</code>.
 * </p>
 */
public class UntagStreamRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to remove tags
     * from.
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
     * The name of the stream that you want to remove tags from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * A list of the keys of the tags that you want to remove.
     * </p>
     */
    private java.util.List<String> tagKeyList = new java.util.ArrayList<String>();

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to remove tags
     * from.
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
     *         remove tags from.
     *         </p>
     */
    public String getStreamARN() {
        return streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to remove tags
     * from.
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
     *            remove tags from.
     *            </p>
     */
    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to remove tags
     * from.
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
     *            remove tags from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagStreamRequest withStreamARN(String streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    /**
     * <p>
     * The name of the stream that you want to remove tags from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream that you want to remove tags from.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream that you want to remove tags from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream that you want to remove tags from.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream that you want to remove tags from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream that you want to remove tags from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagStreamRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * A list of the keys of the tags that you want to remove.
     * </p>
     *
     * @return <p>
     *         A list of the keys of the tags that you want to remove.
     *         </p>
     */
    public java.util.List<String> getTagKeyList() {
        return tagKeyList;
    }

    /**
     * <p>
     * A list of the keys of the tags that you want to remove.
     * </p>
     *
     * @param tagKeyList <p>
     *            A list of the keys of the tags that you want to remove.
     *            </p>
     */
    public void setTagKeyList(java.util.Collection<String> tagKeyList) {
        if (tagKeyList == null) {
            this.tagKeyList = null;
            return;
        }

        this.tagKeyList = new java.util.ArrayList<String>(tagKeyList);
    }

    /**
     * <p>
     * A list of the keys of the tags that you want to remove.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeyList <p>
     *            A list of the keys of the tags that you want to remove.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagStreamRequest withTagKeyList(String... tagKeyList) {
        if (getTagKeyList() == null) {
            this.tagKeyList = new java.util.ArrayList<String>(tagKeyList.length);
        }
        for (String value : tagKeyList) {
            this.tagKeyList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the keys of the tags that you want to remove.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeyList <p>
     *            A list of the keys of the tags that you want to remove.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagStreamRequest withTagKeyList(java.util.Collection<String> tagKeyList) {
        setTagKeyList(tagKeyList);
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
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getTagKeyList() != null)
            sb.append("TagKeyList: " + getTagKeyList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getTagKeyList() == null) ? 0 : getTagKeyList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagStreamRequest == false)
            return false;
        UntagStreamRequest other = (UntagStreamRequest) obj;

        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null
                && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getTagKeyList() == null ^ this.getTagKeyList() == null)
            return false;
        if (other.getTagKeyList() != null
                && other.getTagKeyList().equals(this.getTagKeyList()) == false)
            return false;
        return true;
    }
}
