/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A structure that encapsulates, or contains, the media storage configuration
 * properties.
 * </p>
 */
public class MappedResourceConfigurationListItem implements Serializable {
    /**
     * <p>
     * The type of the associated resource for the kinesis video stream.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis Video Stream resource,
     * associated with the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     */
    private String aRN;

    /**
     * <p>
     * The type of the associated resource for the kinesis video stream.
     * </p>
     *
     * @return <p>
     *         The type of the associated resource for the kinesis video stream.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the associated resource for the kinesis video stream.
     * </p>
     *
     * @param type <p>
     *            The type of the associated resource for the kinesis video
     *            stream.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the associated resource for the kinesis video stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The type of the associated resource for the kinesis video
     *            stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MappedResourceConfigurationListItem withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis Video Stream resource,
     * associated with the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Kinesis Video Stream
     *         resource, associated with the stream.
     *         </p>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis Video Stream resource,
     * associated with the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param aRN <p>
     *            The Amazon Resource Name (ARN) of the Kinesis Video Stream
     *            resource, associated with the stream.
     *            </p>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis Video Stream resource,
     * associated with the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param aRN <p>
     *            The Amazon Resource Name (ARN) of the Kinesis Video Stream
     *            resource, associated with the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MappedResourceConfigurationListItem withARN(String aRN) {
        this.aRN = aRN;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getARN() != null)
            sb.append("ARN: " + getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MappedResourceConfigurationListItem == false)
            return false;
        MappedResourceConfigurationListItem other = (MappedResourceConfigurationListItem) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }
}
