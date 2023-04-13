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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * The stream processor settings that you want to update.
 * <code>ConnectedHome</code> settings can be updated to detect different labels
 * with a different minimum confidence.
 * </p>
 */
public class StreamProcessorSettingsForUpdate implements Serializable {
    /**
     * <p>
     * The label detection settings you want to use for your stream processor.
     * </p>
     */
    private ConnectedHomeSettingsForUpdate connectedHomeForUpdate;

    /**
     * <p>
     * The label detection settings you want to use for your stream processor.
     * </p>
     *
     * @return <p>
     *         The label detection settings you want to use for your stream
     *         processor.
     *         </p>
     */
    public ConnectedHomeSettingsForUpdate getConnectedHomeForUpdate() {
        return connectedHomeForUpdate;
    }

    /**
     * <p>
     * The label detection settings you want to use for your stream processor.
     * </p>
     *
     * @param connectedHomeForUpdate <p>
     *            The label detection settings you want to use for your stream
     *            processor.
     *            </p>
     */
    public void setConnectedHomeForUpdate(ConnectedHomeSettingsForUpdate connectedHomeForUpdate) {
        this.connectedHomeForUpdate = connectedHomeForUpdate;
    }

    /**
     * <p>
     * The label detection settings you want to use for your stream processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectedHomeForUpdate <p>
     *            The label detection settings you want to use for your stream
     *            processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamProcessorSettingsForUpdate withConnectedHomeForUpdate(
            ConnectedHomeSettingsForUpdate connectedHomeForUpdate) {
        this.connectedHomeForUpdate = connectedHomeForUpdate;
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
        if (getConnectedHomeForUpdate() != null)
            sb.append("ConnectedHomeForUpdate: " + getConnectedHomeForUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getConnectedHomeForUpdate() == null) ? 0 : getConnectedHomeForUpdate()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamProcessorSettingsForUpdate == false)
            return false;
        StreamProcessorSettingsForUpdate other = (StreamProcessorSettingsForUpdate) obj;

        if (other.getConnectedHomeForUpdate() == null ^ this.getConnectedHomeForUpdate() == null)
            return false;
        if (other.getConnectedHomeForUpdate() != null
                && other.getConnectedHomeForUpdate().equals(this.getConnectedHomeForUpdate()) == false)
            return false;
        return true;
    }
}
