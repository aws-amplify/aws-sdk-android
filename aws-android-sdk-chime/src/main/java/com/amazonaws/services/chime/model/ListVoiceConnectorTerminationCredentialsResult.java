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

public class ListVoiceConnectorTerminationCredentialsResult implements Serializable {
    /**
     * <p>
     * A list of user names.
     * </p>
     */
    private java.util.List<String> usernames;

    /**
     * <p>
     * A list of user names.
     * </p>
     *
     * @return <p>
     *         A list of user names.
     *         </p>
     */
    public java.util.List<String> getUsernames() {
        return usernames;
    }

    /**
     * <p>
     * A list of user names.
     * </p>
     *
     * @param usernames <p>
     *            A list of user names.
     *            </p>
     */
    public void setUsernames(java.util.Collection<String> usernames) {
        if (usernames == null) {
            this.usernames = null;
            return;
        }

        this.usernames = new java.util.ArrayList<String>(usernames);
    }

    /**
     * <p>
     * A list of user names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usernames <p>
     *            A list of user names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVoiceConnectorTerminationCredentialsResult withUsernames(String... usernames) {
        if (getUsernames() == null) {
            this.usernames = new java.util.ArrayList<String>(usernames.length);
        }
        for (String value : usernames) {
            this.usernames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of user names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usernames <p>
     *            A list of user names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVoiceConnectorTerminationCredentialsResult withUsernames(
            java.util.Collection<String> usernames) {
        setUsernames(usernames);
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
        if (getUsernames() != null)
            sb.append("Usernames: " + getUsernames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsernames() == null) ? 0 : getUsernames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVoiceConnectorTerminationCredentialsResult == false)
            return false;
        ListVoiceConnectorTerminationCredentialsResult other = (ListVoiceConnectorTerminationCredentialsResult) obj;

        if (other.getUsernames() == null ^ this.getUsernames() == null)
            return false;
        if (other.getUsernames() != null
                && other.getUsernames().equals(this.getUsernames()) == false)
            return false;
        return true;
    }
}
