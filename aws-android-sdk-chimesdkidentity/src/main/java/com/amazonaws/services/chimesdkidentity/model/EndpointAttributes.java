/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;

/**
 * <p>
 * The attributes of an <code>Endpoint</code>.
 * </p>
 */
public class EndpointAttributes implements Serializable {
    /**
     * <p>
     * The device token for the GCM, APNS, and APNS_SANDBOX endpoint types.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String deviceToken;

    /**
     * <p>
     * The VOIP device token for the APNS and APNS_SANDBOX endpoint types.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String voipDeviceToken;

    /**
     * <p>
     * The device token for the GCM, APNS, and APNS_SANDBOX endpoint types.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The device token for the GCM, APNS, and APNS_SANDBOX endpoint
     *         types.
     *         </p>
     */
    public String getDeviceToken() {
        return deviceToken;
    }

    /**
     * <p>
     * The device token for the GCM, APNS, and APNS_SANDBOX endpoint types.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param deviceToken <p>
     *            The device token for the GCM, APNS, and APNS_SANDBOX endpoint
     *            types.
     *            </p>
     */
    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    /**
     * <p>
     * The device token for the GCM, APNS, and APNS_SANDBOX endpoint types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param deviceToken <p>
     *            The device token for the GCM, APNS, and APNS_SANDBOX endpoint
     *            types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointAttributes withDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
        return this;
    }

    /**
     * <p>
     * The VOIP device token for the APNS and APNS_SANDBOX endpoint types.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The VOIP device token for the APNS and APNS_SANDBOX endpoint
     *         types.
     *         </p>
     */
    public String getVoipDeviceToken() {
        return voipDeviceToken;
    }

    /**
     * <p>
     * The VOIP device token for the APNS and APNS_SANDBOX endpoint types.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param voipDeviceToken <p>
     *            The VOIP device token for the APNS and APNS_SANDBOX endpoint
     *            types.
     *            </p>
     */
    public void setVoipDeviceToken(String voipDeviceToken) {
        this.voipDeviceToken = voipDeviceToken;
    }

    /**
     * <p>
     * The VOIP device token for the APNS and APNS_SANDBOX endpoint types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param voipDeviceToken <p>
     *            The VOIP device token for the APNS and APNS_SANDBOX endpoint
     *            types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointAttributes withVoipDeviceToken(String voipDeviceToken) {
        this.voipDeviceToken = voipDeviceToken;
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
        if (getDeviceToken() != null)
            sb.append("DeviceToken: " + getDeviceToken() + ",");
        if (getVoipDeviceToken() != null)
            sb.append("VoipDeviceToken: " + getVoipDeviceToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeviceToken() == null) ? 0 : getDeviceToken().hashCode());
        hashCode = prime * hashCode
                + ((getVoipDeviceToken() == null) ? 0 : getVoipDeviceToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointAttributes == false)
            return false;
        EndpointAttributes other = (EndpointAttributes) obj;

        if (other.getDeviceToken() == null ^ this.getDeviceToken() == null)
            return false;
        if (other.getDeviceToken() != null
                && other.getDeviceToken().equals(this.getDeviceToken()) == false)
            return false;
        if (other.getVoipDeviceToken() == null ^ this.getVoipDeviceToken() == null)
            return false;
        if (other.getVoipDeviceToken() != null
                && other.getVoipDeviceToken().equals(this.getVoipDeviceToken()) == false)
            return false;
        return true;
    }
}
