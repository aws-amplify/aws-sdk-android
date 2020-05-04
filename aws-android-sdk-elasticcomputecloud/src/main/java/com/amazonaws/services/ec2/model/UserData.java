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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the user data for an instance.
 * </p>
 */
public class UserData implements Serializable {
    /**
     * <p>
     * The user data. If you are using an AWS SDK or command line tool,
     * Base64-encoding is performed for you, and you can load the text from a
     * file. Otherwise, you must provide Base64-encoded text.
     * </p>
     */
    private String data;

    /**
     * <p>
     * The user data. If you are using an AWS SDK or command line tool,
     * Base64-encoding is performed for you, and you can load the text from a
     * file. Otherwise, you must provide Base64-encoded text.
     * </p>
     *
     * @return <p>
     *         The user data. If you are using an AWS SDK or command line tool,
     *         Base64-encoding is performed for you, and you can load the text
     *         from a file. Otherwise, you must provide Base64-encoded text.
     *         </p>
     */
    public String getData() {
        return data;
    }

    /**
     * <p>
     * The user data. If you are using an AWS SDK or command line tool,
     * Base64-encoding is performed for you, and you can load the text from a
     * file. Otherwise, you must provide Base64-encoded text.
     * </p>
     *
     * @param data <p>
     *            The user data. If you are using an AWS SDK or command line
     *            tool, Base64-encoding is performed for you, and you can load
     *            the text from a file. Otherwise, you must provide
     *            Base64-encoded text.
     *            </p>
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * <p>
     * The user data. If you are using an AWS SDK or command line tool,
     * Base64-encoding is performed for you, and you can load the text from a
     * file. Otherwise, you must provide Base64-encoded text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param data <p>
     *            The user data. If you are using an AWS SDK or command line
     *            tool, Base64-encoding is performed for you, and you can load
     *            the text from a file. Otherwise, you must provide
     *            Base64-encoded text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData withData(String data) {
        this.data = data;
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
        if (getData() != null)
            sb.append("Data: " + getData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserData == false)
            return false;
        UserData other = (UserData) obj;

        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        return true;
    }
}
