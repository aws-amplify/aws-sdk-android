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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * HTTP URL destination configuration used by the topic rule's HTTP action.
 * </p>
 */
public class HttpUrlDestinationConfiguration implements Serializable {
    /**
     * <p>
     * The URL AWS IoT uses to confirm ownership of or access to the topic rule
     * destination URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     */
    private String confirmationUrl;

    /**
     * <p>
     * The URL AWS IoT uses to confirm ownership of or access to the topic rule
     * destination URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @return <p>
     *         The URL AWS IoT uses to confirm ownership of or access to the
     *         topic rule destination URL.
     *         </p>
     */
    public String getConfirmationUrl() {
        return confirmationUrl;
    }

    /**
     * <p>
     * The URL AWS IoT uses to confirm ownership of or access to the topic rule
     * destination URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param confirmationUrl <p>
     *            The URL AWS IoT uses to confirm ownership of or access to the
     *            topic rule destination URL.
     *            </p>
     */
    public void setConfirmationUrl(String confirmationUrl) {
        this.confirmationUrl = confirmationUrl;
    }

    /**
     * <p>
     * The URL AWS IoT uses to confirm ownership of or access to the topic rule
     * destination URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param confirmationUrl <p>
     *            The URL AWS IoT uses to confirm ownership of or access to the
     *            topic rule destination URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpUrlDestinationConfiguration withConfirmationUrl(String confirmationUrl) {
        this.confirmationUrl = confirmationUrl;
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
        if (getConfirmationUrl() != null)
            sb.append("confirmationUrl: " + getConfirmationUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfirmationUrl() == null) ? 0 : getConfirmationUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpUrlDestinationConfiguration == false)
            return false;
        HttpUrlDestinationConfiguration other = (HttpUrlDestinationConfiguration) obj;

        if (other.getConfirmationUrl() == null ^ this.getConfirmationUrl() == null)
            return false;
        if (other.getConfirmationUrl() != null
                && other.getConfirmationUrl().equals(this.getConfirmationUrl()) == false)
            return false;
        return true;
    }
}
