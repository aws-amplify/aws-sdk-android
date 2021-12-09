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

package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;

public class SendMessageResult implements Serializable {
    /**
     * <p>
     * The ID of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String id;

    /**
     * <p>
     * The time when the message was sent.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String absoluteTime;

    /**
     * <p>
     * The ID of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The ID of the message.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param id <p>
     *            The ID of the message.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param id <p>
     *            The ID of the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The time when the message was sent.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The time when the message was sent.
     *         </p>
     *         <p>
     *         It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For
     *         example, 2019-11-08T02:41:28.172Z.
     *         </p>
     */
    public String getAbsoluteTime() {
        return absoluteTime;
    }

    /**
     * <p>
     * The time when the message was sent.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param absoluteTime <p>
     *            The time when the message was sent.
     *            </p>
     *            <p>
     *            It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ.
     *            For example, 2019-11-08T02:41:28.172Z.
     *            </p>
     */
    public void setAbsoluteTime(String absoluteTime) {
        this.absoluteTime = absoluteTime;
    }

    /**
     * <p>
     * The time when the message was sent.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param absoluteTime <p>
     *            The time when the message was sent.
     *            </p>
     *            <p>
     *            It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ.
     *            For example, 2019-11-08T02:41:28.172Z.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageResult withAbsoluteTime(String absoluteTime) {
        this.absoluteTime = absoluteTime;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getAbsoluteTime() != null)
            sb.append("AbsoluteTime: " + getAbsoluteTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getAbsoluteTime() == null) ? 0 : getAbsoluteTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendMessageResult == false)
            return false;
        SendMessageResult other = (SendMessageResult) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAbsoluteTime() == null ^ this.getAbsoluteTime() == null)
            return false;
        if (other.getAbsoluteTime() != null
                && other.getAbsoluteTime().equals(this.getAbsoluteTime()) == false)
            return false;
        return true;
    }
}
