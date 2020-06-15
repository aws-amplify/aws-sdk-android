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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * The Alexa for Business metadata associated with an Amazon Chime user, used to
 * integrate Alexa for Business with a device.
 * </p>
 */
public class AlexaForBusinessMetadata implements Serializable {
    /**
     * <p>
     * Starts or stops Alexa for Business.
     * </p>
     */
    private Boolean isAlexaForBusinessEnabled;

    /**
     * <p>
     * The ARN of the room resource.
     * </p>
     */
    private String alexaForBusinessRoomArn;

    /**
     * <p>
     * Starts or stops Alexa for Business.
     * </p>
     *
     * @return <p>
     *         Starts or stops Alexa for Business.
     *         </p>
     */
    public Boolean isIsAlexaForBusinessEnabled() {
        return isAlexaForBusinessEnabled;
    }

    /**
     * <p>
     * Starts or stops Alexa for Business.
     * </p>
     *
     * @return <p>
     *         Starts or stops Alexa for Business.
     *         </p>
     */
    public Boolean getIsAlexaForBusinessEnabled() {
        return isAlexaForBusinessEnabled;
    }

    /**
     * <p>
     * Starts or stops Alexa for Business.
     * </p>
     *
     * @param isAlexaForBusinessEnabled <p>
     *            Starts or stops Alexa for Business.
     *            </p>
     */
    public void setIsAlexaForBusinessEnabled(Boolean isAlexaForBusinessEnabled) {
        this.isAlexaForBusinessEnabled = isAlexaForBusinessEnabled;
    }

    /**
     * <p>
     * Starts or stops Alexa for Business.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isAlexaForBusinessEnabled <p>
     *            Starts or stops Alexa for Business.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlexaForBusinessMetadata withIsAlexaForBusinessEnabled(Boolean isAlexaForBusinessEnabled) {
        this.isAlexaForBusinessEnabled = isAlexaForBusinessEnabled;
        return this;
    }

    /**
     * <p>
     * The ARN of the room resource.
     * </p>
     *
     * @return <p>
     *         The ARN of the room resource.
     *         </p>
     */
    public String getAlexaForBusinessRoomArn() {
        return alexaForBusinessRoomArn;
    }

    /**
     * <p>
     * The ARN of the room resource.
     * </p>
     *
     * @param alexaForBusinessRoomArn <p>
     *            The ARN of the room resource.
     *            </p>
     */
    public void setAlexaForBusinessRoomArn(String alexaForBusinessRoomArn) {
        this.alexaForBusinessRoomArn = alexaForBusinessRoomArn;
    }

    /**
     * <p>
     * The ARN of the room resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alexaForBusinessRoomArn <p>
     *            The ARN of the room resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlexaForBusinessMetadata withAlexaForBusinessRoomArn(String alexaForBusinessRoomArn) {
        this.alexaForBusinessRoomArn = alexaForBusinessRoomArn;
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
        if (getIsAlexaForBusinessEnabled() != null)
            sb.append("IsAlexaForBusinessEnabled: " + getIsAlexaForBusinessEnabled() + ",");
        if (getAlexaForBusinessRoomArn() != null)
            sb.append("AlexaForBusinessRoomArn: " + getAlexaForBusinessRoomArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getIsAlexaForBusinessEnabled() == null) ? 0 : getIsAlexaForBusinessEnabled()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAlexaForBusinessRoomArn() == null) ? 0 : getAlexaForBusinessRoomArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlexaForBusinessMetadata == false)
            return false;
        AlexaForBusinessMetadata other = (AlexaForBusinessMetadata) obj;

        if (other.getIsAlexaForBusinessEnabled() == null
                ^ this.getIsAlexaForBusinessEnabled() == null)
            return false;
        if (other.getIsAlexaForBusinessEnabled() != null
                && other.getIsAlexaForBusinessEnabled().equals(this.getIsAlexaForBusinessEnabled()) == false)
            return false;
        if (other.getAlexaForBusinessRoomArn() == null ^ this.getAlexaForBusinessRoomArn() == null)
            return false;
        if (other.getAlexaForBusinessRoomArn() != null
                && other.getAlexaForBusinessRoomArn().equals(this.getAlexaForBusinessRoomArn()) == false)
            return false;
        return true;
    }
}
