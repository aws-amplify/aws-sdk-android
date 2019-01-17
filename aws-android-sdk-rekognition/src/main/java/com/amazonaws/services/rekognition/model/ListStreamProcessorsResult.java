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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

public class ListStreamProcessorsResult implements Serializable {
    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token
     * that you can use in the subsequent request to retrieve the next set of
     * stream processors.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String nextToken;

    /**
     * <p>
     * List of stream processors that you have created.
     * </p>
     */
    private java.util.List<StreamProcessor> streamProcessors;

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token
     * that you can use in the subsequent request to retrieve the next set of
     * stream processors.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon Rekognition Video returns
     *         this token that you can use in the subsequent request to retrieve
     *         the next set of stream processors.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token
     * that you can use in the subsequent request to retrieve the next set of
     * stream processors.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon Rekognition Video returns
     *            this token that you can use in the subsequent request to
     *            retrieve the next set of stream processors.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token
     * that you can use in the subsequent request to retrieve the next set of
     * stream processors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon Rekognition Video returns
     *            this token that you can use in the subsequent request to
     *            retrieve the next set of stream processors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStreamProcessorsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * List of stream processors that you have created.
     * </p>
     *
     * @return <p>
     *         List of stream processors that you have created.
     *         </p>
     */
    public java.util.List<StreamProcessor> getStreamProcessors() {
        return streamProcessors;
    }

    /**
     * <p>
     * List of stream processors that you have created.
     * </p>
     *
     * @param streamProcessors <p>
     *            List of stream processors that you have created.
     *            </p>
     */
    public void setStreamProcessors(java.util.Collection<StreamProcessor> streamProcessors) {
        if (streamProcessors == null) {
            this.streamProcessors = null;
            return;
        }

        this.streamProcessors = new java.util.ArrayList<StreamProcessor>(streamProcessors);
    }

    /**
     * <p>
     * List of stream processors that you have created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamProcessors <p>
     *            List of stream processors that you have created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStreamProcessorsResult withStreamProcessors(StreamProcessor... streamProcessors) {
        if (getStreamProcessors() == null) {
            this.streamProcessors = new java.util.ArrayList<StreamProcessor>(
                    streamProcessors.length);
        }
        for (StreamProcessor value : streamProcessors) {
            this.streamProcessors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of stream processors that you have created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamProcessors <p>
     *            List of stream processors that you have created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStreamProcessorsResult withStreamProcessors(
            java.util.Collection<StreamProcessor> streamProcessors) {
        setStreamProcessors(streamProcessors);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getStreamProcessors() != null)
            sb.append("StreamProcessors: " + getStreamProcessors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getStreamProcessors() == null) ? 0 : getStreamProcessors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStreamProcessorsResult == false)
            return false;
        ListStreamProcessorsResult other = (ListStreamProcessorsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStreamProcessors() == null ^ this.getStreamProcessors() == null)
            return false;
        if (other.getStreamProcessors() != null
                && other.getStreamProcessors().equals(this.getStreamProcessors()) == false)
            return false;
        return true;
    }
}
