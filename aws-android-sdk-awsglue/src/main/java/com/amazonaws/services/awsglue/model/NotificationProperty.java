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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies configuration properties of a notification.
 * </p>
 */
public class NotificationProperty implements Serializable {
    /**
     * <p>
     * After a job run starts, the number of minutes to wait before sending a
     * job run delay notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer notifyDelayAfter;

    /**
     * <p>
     * After a job run starts, the number of minutes to wait before sending a
     * job run delay notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         After a job run starts, the number of minutes to wait before
     *         sending a job run delay notification.
     *         </p>
     */
    public Integer getNotifyDelayAfter() {
        return notifyDelayAfter;
    }

    /**
     * <p>
     * After a job run starts, the number of minutes to wait before sending a
     * job run delay notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param notifyDelayAfter <p>
     *            After a job run starts, the number of minutes to wait before
     *            sending a job run delay notification.
     *            </p>
     */
    public void setNotifyDelayAfter(Integer notifyDelayAfter) {
        this.notifyDelayAfter = notifyDelayAfter;
    }

    /**
     * <p>
     * After a job run starts, the number of minutes to wait before sending a
     * job run delay notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param notifyDelayAfter <p>
     *            After a job run starts, the number of minutes to wait before
     *            sending a job run delay notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationProperty withNotifyDelayAfter(Integer notifyDelayAfter) {
        this.notifyDelayAfter = notifyDelayAfter;
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
        if (getNotifyDelayAfter() != null)
            sb.append("NotifyDelayAfter: " + getNotifyDelayAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNotifyDelayAfter() == null) ? 0 : getNotifyDelayAfter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationProperty == false)
            return false;
        NotificationProperty other = (NotificationProperty) obj;

        if (other.getNotifyDelayAfter() == null ^ this.getNotifyDelayAfter() == null)
            return false;
        if (other.getNotifyDelayAfter() != null
                && other.getNotifyDelayAfter().equals(this.getNotifyDelayAfter()) == false)
            return false;
        return true;
    }
}
