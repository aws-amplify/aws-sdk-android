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

public class UpdateBotResult implements Serializable {
    /**
     * <p>
     * The updated bot details.
     * </p>
     */
    private Bot bot;

    /**
     * <p>
     * The updated bot details.
     * </p>
     *
     * @return <p>
     *         The updated bot details.
     *         </p>
     */
    public Bot getBot() {
        return bot;
    }

    /**
     * <p>
     * The updated bot details.
     * </p>
     *
     * @param bot <p>
     *            The updated bot details.
     *            </p>
     */
    public void setBot(Bot bot) {
        this.bot = bot;
    }

    /**
     * <p>
     * The updated bot details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bot <p>
     *            The updated bot details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateBotResult withBot(Bot bot) {
        this.bot = bot;
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
        if (getBot() != null)
            sb.append("Bot: " + getBot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBot() == null) ? 0 : getBot().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBotResult == false)
            return false;
        UpdateBotResult other = (UpdateBotResult) obj;

        if (other.getBot() == null ^ this.getBot() == null)
            return false;
        if (other.getBot() != null && other.getBot().equals(this.getBot()) == false)
            return false;
        return true;
    }
}
