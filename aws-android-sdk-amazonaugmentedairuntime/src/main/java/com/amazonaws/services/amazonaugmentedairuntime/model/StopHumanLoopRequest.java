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

package com.amazonaws.services.amazonaugmentedairuntime.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Stops the specified human loop.
 * </p>
 */
public class StopHumanLoopRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the human loop that you want to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*$<br/>
     */
    private String humanLoopName;

    /**
     * <p>
     * The name of the human loop that you want to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the human loop that you want to stop.
     *         </p>
     */
    public String getHumanLoopName() {
        return humanLoopName;
    }

    /**
     * <p>
     * The name of the human loop that you want to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*$<br/>
     *
     * @param humanLoopName <p>
     *            The name of the human loop that you want to stop.
     *            </p>
     */
    public void setHumanLoopName(String humanLoopName) {
        this.humanLoopName = humanLoopName;
    }

    /**
     * <p>
     * The name of the human loop that you want to stop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*$<br/>
     *
     * @param humanLoopName <p>
     *            The name of the human loop that you want to stop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopHumanLoopRequest withHumanLoopName(String humanLoopName) {
        this.humanLoopName = humanLoopName;
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
        if (getHumanLoopName() != null)
            sb.append("HumanLoopName: " + getHumanLoopName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHumanLoopName() == null) ? 0 : getHumanLoopName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopHumanLoopRequest == false)
            return false;
        StopHumanLoopRequest other = (StopHumanLoopRequest) obj;

        if (other.getHumanLoopName() == null ^ this.getHumanLoopName() == null)
            return false;
        if (other.getHumanLoopName() != null
                && other.getHumanLoopName().equals(this.getHumanLoopName()) == false)
            return false;
        return true;
    }
}
