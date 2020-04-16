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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * DVB Sub Source Settings
 */
public class DvbSubSourceSettings implements Serializable {
    /**
     * When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source
     * content. Unused for DVB-Sub passthrough. All DVB-Sub content is passed
     * through, regardless of selectors.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer pid;

    /**
     * When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source
     * content. Unused for DVB-Sub passthrough. All DVB-Sub content is passed
     * through, regardless of selectors.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @return When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the
     *         source content. Unused for DVB-Sub passthrough. All DVB-Sub
     *         content is passed through, regardless of selectors.
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source
     * content. Unused for DVB-Sub passthrough. All DVB-Sub content is passed
     * through, regardless of selectors.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param pid When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for
     *            the source content. Unused for DVB-Sub passthrough. All
     *            DVB-Sub content is passed through, regardless of selectors.
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source
     * content. Unused for DVB-Sub passthrough. All DVB-Sub content is passed
     * through, regardless of selectors.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param pid When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for
     *            the source content. Unused for DVB-Sub passthrough. All
     *            DVB-Sub content is passed through, regardless of selectors.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DvbSubSourceSettings withPid(Integer pid) {
        this.pid = pid;
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
        if (getPid() != null)
            sb.append("Pid: " + getPid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPid() == null) ? 0 : getPid().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DvbSubSourceSettings == false)
            return false;
        DvbSubSourceSettings other = (DvbSubSourceSettings) obj;

        if (other.getPid() == null ^ this.getPid() == null)
            return false;
        if (other.getPid() != null && other.getPid().equals(this.getPid()) == false)
            return false;
        return true;
    }
}
