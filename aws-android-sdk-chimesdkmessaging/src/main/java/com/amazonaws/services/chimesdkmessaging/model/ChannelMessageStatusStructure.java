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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

/**
 * <p>
 * Stores information about a message status.
 * </p>
 */
public class ChannelMessageStatusStructure implements Serializable {
    /**
     * <p>
     * The message status value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SENT, PENDING, FAILED, DENIED
     */
    private String value;

    /**
     * <p>
     * Contains more details about the messasge status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String detail;

    /**
     * <p>
     * The message status value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SENT, PENDING, FAILED, DENIED
     *
     * @return <p>
     *         The message status value.
     *         </p>
     * @see ChannelMessageStatus
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The message status value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SENT, PENDING, FAILED, DENIED
     *
     * @param value <p>
     *            The message status value.
     *            </p>
     * @see ChannelMessageStatus
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The message status value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SENT, PENDING, FAILED, DENIED
     *
     * @param value <p>
     *            The message status value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMessageStatus
     */
    public ChannelMessageStatusStructure withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The message status value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SENT, PENDING, FAILED, DENIED
     *
     * @param value <p>
     *            The message status value.
     *            </p>
     * @see ChannelMessageStatus
     */
    public void setValue(ChannelMessageStatus value) {
        this.value = value.toString();
    }

    /**
     * <p>
     * The message status value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SENT, PENDING, FAILED, DENIED
     *
     * @param value <p>
     *            The message status value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMessageStatus
     */
    public ChannelMessageStatusStructure withValue(ChannelMessageStatus value) {
        this.value = value.toString();
        return this;
    }

    /**
     * <p>
     * Contains more details about the messasge status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         Contains more details about the messasge status.
     *         </p>
     */
    public String getDetail() {
        return detail;
    }

    /**
     * <p>
     * Contains more details about the messasge status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param detail <p>
     *            Contains more details about the messasge status.
     *            </p>
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * <p>
     * Contains more details about the messasge status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param detail <p>
     *            Contains more details about the messasge status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMessageStatusStructure withDetail(String detail) {
        this.detail = detail;
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
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getDetail() != null)
            sb.append("Detail: " + getDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getDetail() == null) ? 0 : getDetail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelMessageStatusStructure == false)
            return false;
        ChannelMessageStatusStructure other = (ChannelMessageStatusStructure) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getDetail() == null ^ this.getDetail() == null)
            return false;
        if (other.getDetail() != null && other.getDetail().equals(this.getDetail()) == false)
            return false;
        return true;
    }
}
