/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about Amazon Connect Wisdom.
 * </p>
 */
public class WisdomInfo implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom session.
     * </p>
     */
    private String sessionArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom session.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Wisdom session.
     *         </p>
     */
    public String getSessionArn() {
        return sessionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom session.
     * </p>
     *
     * @param sessionArn <p>
     *            The Amazon Resource Name (ARN) of the Wisdom session.
     *            </p>
     */
    public void setSessionArn(String sessionArn) {
        this.sessionArn = sessionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionArn <p>
     *            The Amazon Resource Name (ARN) of the Wisdom session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WisdomInfo withSessionArn(String sessionArn) {
        this.sessionArn = sessionArn;
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
        if (getSessionArn() != null)
            sb.append("SessionArn: " + getSessionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionArn() == null) ? 0 : getSessionArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WisdomInfo == false)
            return false;
        WisdomInfo other = (WisdomInfo) obj;

        if (other.getSessionArn() == null ^ this.getSessionArn() == null)
            return false;
        if (other.getSessionArn() != null
                && other.getSessionArn().equals(this.getSessionArn()) == false)
            return false;
        return true;
    }
}
