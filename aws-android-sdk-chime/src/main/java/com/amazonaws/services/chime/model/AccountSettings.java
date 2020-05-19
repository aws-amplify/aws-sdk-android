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
 * Settings related to the Amazon Chime account. This includes settings that
 * start or stop remote control of shared screens, or start or stop the dial-out
 * option in the Amazon Chime web application. For more information about these
 * settings, see <a
 * href="https://docs.aws.amazon.com/chime/latest/ag/policies.html">Use the
 * Policies Page</a> in the <i>Amazon Chime Administration Guide</i>.
 * </p>
 */
public class AccountSettings implements Serializable {
    /**
     * <p>
     * Setting that stops or starts remote control of shared screens during
     * meetings.
     * </p>
     */
    private Boolean disableRemoteControl;

    /**
     * <p>
     * Setting that allows meeting participants to choose the <b>Call me at a
     * phone number</b> option. For more information, see <a href=
     * "https://docs.aws.amazon.com/chime/latest/ug/chime-join-meeting.html"
     * >Join a Meeting without the Amazon Chime App</a>.
     * </p>
     */
    private Boolean enableDialOut;

    /**
     * <p>
     * Setting that stops or starts remote control of shared screens during
     * meetings.
     * </p>
     *
     * @return <p>
     *         Setting that stops or starts remote control of shared screens
     *         during meetings.
     *         </p>
     */
    public Boolean isDisableRemoteControl() {
        return disableRemoteControl;
    }

    /**
     * <p>
     * Setting that stops or starts remote control of shared screens during
     * meetings.
     * </p>
     *
     * @return <p>
     *         Setting that stops or starts remote control of shared screens
     *         during meetings.
     *         </p>
     */
    public Boolean getDisableRemoteControl() {
        return disableRemoteControl;
    }

    /**
     * <p>
     * Setting that stops or starts remote control of shared screens during
     * meetings.
     * </p>
     *
     * @param disableRemoteControl <p>
     *            Setting that stops or starts remote control of shared screens
     *            during meetings.
     *            </p>
     */
    public void setDisableRemoteControl(Boolean disableRemoteControl) {
        this.disableRemoteControl = disableRemoteControl;
    }

    /**
     * <p>
     * Setting that stops or starts remote control of shared screens during
     * meetings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableRemoteControl <p>
     *            Setting that stops or starts remote control of shared screens
     *            during meetings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountSettings withDisableRemoteControl(Boolean disableRemoteControl) {
        this.disableRemoteControl = disableRemoteControl;
        return this;
    }

    /**
     * <p>
     * Setting that allows meeting participants to choose the <b>Call me at a
     * phone number</b> option. For more information, see <a href=
     * "https://docs.aws.amazon.com/chime/latest/ug/chime-join-meeting.html"
     * >Join a Meeting without the Amazon Chime App</a>.
     * </p>
     *
     * @return <p>
     *         Setting that allows meeting participants to choose the <b>Call me
     *         at a phone number</b> option. For more information, see <a href=
     *         "https://docs.aws.amazon.com/chime/latest/ug/chime-join-meeting.html"
     *         >Join a Meeting without the Amazon Chime App</a>.
     *         </p>
     */
    public Boolean isEnableDialOut() {
        return enableDialOut;
    }

    /**
     * <p>
     * Setting that allows meeting participants to choose the <b>Call me at a
     * phone number</b> option. For more information, see <a href=
     * "https://docs.aws.amazon.com/chime/latest/ug/chime-join-meeting.html"
     * >Join a Meeting without the Amazon Chime App</a>.
     * </p>
     *
     * @return <p>
     *         Setting that allows meeting participants to choose the <b>Call me
     *         at a phone number</b> option. For more information, see <a href=
     *         "https://docs.aws.amazon.com/chime/latest/ug/chime-join-meeting.html"
     *         >Join a Meeting without the Amazon Chime App</a>.
     *         </p>
     */
    public Boolean getEnableDialOut() {
        return enableDialOut;
    }

    /**
     * <p>
     * Setting that allows meeting participants to choose the <b>Call me at a
     * phone number</b> option. For more information, see <a href=
     * "https://docs.aws.amazon.com/chime/latest/ug/chime-join-meeting.html"
     * >Join a Meeting without the Amazon Chime App</a>.
     * </p>
     *
     * @param enableDialOut <p>
     *            Setting that allows meeting participants to choose the <b>Call
     *            me at a phone number</b> option. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/chime/latest/ug/chime-join-meeting.html"
     *            >Join a Meeting without the Amazon Chime App</a>.
     *            </p>
     */
    public void setEnableDialOut(Boolean enableDialOut) {
        this.enableDialOut = enableDialOut;
    }

    /**
     * <p>
     * Setting that allows meeting participants to choose the <b>Call me at a
     * phone number</b> option. For more information, see <a href=
     * "https://docs.aws.amazon.com/chime/latest/ug/chime-join-meeting.html"
     * >Join a Meeting without the Amazon Chime App</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableDialOut <p>
     *            Setting that allows meeting participants to choose the <b>Call
     *            me at a phone number</b> option. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/chime/latest/ug/chime-join-meeting.html"
     *            >Join a Meeting without the Amazon Chime App</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountSettings withEnableDialOut(Boolean enableDialOut) {
        this.enableDialOut = enableDialOut;
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
        if (getDisableRemoteControl() != null)
            sb.append("DisableRemoteControl: " + getDisableRemoteControl() + ",");
        if (getEnableDialOut() != null)
            sb.append("EnableDialOut: " + getEnableDialOut());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDisableRemoteControl() == null) ? 0 : getDisableRemoteControl().hashCode());
        hashCode = prime * hashCode
                + ((getEnableDialOut() == null) ? 0 : getEnableDialOut().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountSettings == false)
            return false;
        AccountSettings other = (AccountSettings) obj;

        if (other.getDisableRemoteControl() == null ^ this.getDisableRemoteControl() == null)
            return false;
        if (other.getDisableRemoteControl() != null
                && other.getDisableRemoteControl().equals(this.getDisableRemoteControl()) == false)
            return false;
        if (other.getEnableDialOut() == null ^ this.getEnableDialOut() == null)
            return false;
        if (other.getEnableDialOut() != null
                && other.getEnableDialOut().equals(this.getEnableDialOut()) == false)
            return false;
        return true;
    }
}
