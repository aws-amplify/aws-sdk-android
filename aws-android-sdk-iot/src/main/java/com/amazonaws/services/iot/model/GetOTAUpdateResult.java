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

public class GetOTAUpdateResult implements Serializable {
    /**
     * <p>
     * The OTA update info.
     * </p>
     */
    private OTAUpdateInfo otaUpdateInfo;

    /**
     * <p>
     * The OTA update info.
     * </p>
     *
     * @return <p>
     *         The OTA update info.
     *         </p>
     */
    public OTAUpdateInfo getOtaUpdateInfo() {
        return otaUpdateInfo;
    }

    /**
     * <p>
     * The OTA update info.
     * </p>
     *
     * @param otaUpdateInfo <p>
     *            The OTA update info.
     *            </p>
     */
    public void setOtaUpdateInfo(OTAUpdateInfo otaUpdateInfo) {
        this.otaUpdateInfo = otaUpdateInfo;
    }

    /**
     * <p>
     * The OTA update info.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param otaUpdateInfo <p>
     *            The OTA update info.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOTAUpdateResult withOtaUpdateInfo(OTAUpdateInfo otaUpdateInfo) {
        this.otaUpdateInfo = otaUpdateInfo;
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
        if (getOtaUpdateInfo() != null)
            sb.append("otaUpdateInfo: " + getOtaUpdateInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOtaUpdateInfo() == null) ? 0 : getOtaUpdateInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOTAUpdateResult == false)
            return false;
        GetOTAUpdateResult other = (GetOTAUpdateResult) obj;

        if (other.getOtaUpdateInfo() == null ^ this.getOtaUpdateInfo() == null)
            return false;
        if (other.getOtaUpdateInfo() != null
                && other.getOtaUpdateInfo().equals(this.getOtaUpdateInfo()) == false)
            return false;
        return true;
    }
}
