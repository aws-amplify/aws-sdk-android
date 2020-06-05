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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the "From" address for an email message that's sent to participants
 * in a journey.
 * </p>
 */
public class JourneyEmailMessage implements Serializable {
    /**
     * <p>
     * The verified email address to send the email message from. The default
     * address is the FromAddress specified for the email channel for the
     * application.
     * </p>
     */
    private String fromAddress;

    /**
     * <p>
     * The verified email address to send the email message from. The default
     * address is the FromAddress specified for the email channel for the
     * application.
     * </p>
     *
     * @return <p>
     *         The verified email address to send the email message from. The
     *         default address is the FromAddress specified for the email
     *         channel for the application.
     *         </p>
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * <p>
     * The verified email address to send the email message from. The default
     * address is the FromAddress specified for the email channel for the
     * application.
     * </p>
     *
     * @param fromAddress <p>
     *            The verified email address to send the email message from. The
     *            default address is the FromAddress specified for the email
     *            channel for the application.
     *            </p>
     */
    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * <p>
     * The verified email address to send the email message from. The default
     * address is the FromAddress specified for the email channel for the
     * application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromAddress <p>
     *            The verified email address to send the email message from. The
     *            default address is the FromAddress specified for the email
     *            channel for the application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JourneyEmailMessage withFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
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
        if (getFromAddress() != null)
            sb.append("FromAddress: " + getFromAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFromAddress() == null) ? 0 : getFromAddress().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JourneyEmailMessage == false)
            return false;
        JourneyEmailMessage other = (JourneyEmailMessage) obj;

        if (other.getFromAddress() == null ^ this.getFromAddress() == null)
            return false;
        if (other.getFromAddress() != null
                && other.getFromAddress().equals(this.getFromAddress()) == false)
            return false;
        return true;
    }
}
