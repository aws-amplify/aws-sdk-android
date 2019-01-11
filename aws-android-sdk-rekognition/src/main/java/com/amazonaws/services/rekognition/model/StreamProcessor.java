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

/**
 * <p>
 * An object that recognizes faces in a streaming video. An Amazon Rekognition
 * stream processor is created by a call to . The request parameters for
 * <code>CreateStreamProcessor</code> describe the Kinesis video stream source
 * for the streaming video, face recognition parameters, and where to stream the
 * analysis resullts.
 * </p>
 */
public class StreamProcessor implements Serializable {
    /**
     * <p>
     * Name of the Amazon Rekognition stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String name;

    /**
     * <p>
     * Current status of the Amazon Rekognition stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STOPPED, STARTING, RUNNING, FAILED, STOPPING
     */
    private String status;

    /**
     * <p>
     * Name of the Amazon Rekognition stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @return <p>
     *         Name of the Amazon Rekognition stream processor.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Name of the Amazon Rekognition stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param name <p>
     *            Name of the Amazon Rekognition stream processor.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the Amazon Rekognition stream processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param name <p>
     *            Name of the Amazon Rekognition stream processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamProcessor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Current status of the Amazon Rekognition stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STOPPED, STARTING, RUNNING, FAILED, STOPPING
     *
     * @return <p>
     *         Current status of the Amazon Rekognition stream processor.
     *         </p>
     * @see StreamProcessorStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Current status of the Amazon Rekognition stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STOPPED, STARTING, RUNNING, FAILED, STOPPING
     *
     * @param status <p>
     *            Current status of the Amazon Rekognition stream processor.
     *            </p>
     * @see StreamProcessorStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the Amazon Rekognition stream processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STOPPED, STARTING, RUNNING, FAILED, STOPPING
     *
     * @param status <p>
     *            Current status of the Amazon Rekognition stream processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StreamProcessorStatus
     */
    public StreamProcessor withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Current status of the Amazon Rekognition stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STOPPED, STARTING, RUNNING, FAILED, STOPPING
     *
     * @param status <p>
     *            Current status of the Amazon Rekognition stream processor.
     *            </p>
     * @see StreamProcessorStatus
     */
    public void setStatus(StreamProcessorStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Current status of the Amazon Rekognition stream processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STOPPED, STARTING, RUNNING, FAILED, STOPPING
     *
     * @param status <p>
     *            Current status of the Amazon Rekognition stream processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StreamProcessorStatus
     */
    public StreamProcessor withStatus(StreamProcessorStatus status) {
        this.status = status.toString();
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamProcessor == false)
            return false;
        StreamProcessor other = (StreamProcessor) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
