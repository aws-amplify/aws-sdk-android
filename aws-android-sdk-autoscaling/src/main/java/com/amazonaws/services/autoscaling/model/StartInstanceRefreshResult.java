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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

public class StartInstanceRefreshResult implements Serializable {
    /**
     * <p>
     * A unique ID for tracking the progress of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String instanceRefreshId;

    /**
     * <p>
     * A unique ID for tracking the progress of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A unique ID for tracking the progress of the request.
     *         </p>
     */
    public String getInstanceRefreshId() {
        return instanceRefreshId;
    }

    /**
     * <p>
     * A unique ID for tracking the progress of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceRefreshId <p>
     *            A unique ID for tracking the progress of the request.
     *            </p>
     */
    public void setInstanceRefreshId(String instanceRefreshId) {
        this.instanceRefreshId = instanceRefreshId;
    }

    /**
     * <p>
     * A unique ID for tracking the progress of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceRefreshId <p>
     *            A unique ID for tracking the progress of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartInstanceRefreshResult withInstanceRefreshId(String instanceRefreshId) {
        this.instanceRefreshId = instanceRefreshId;
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
        if (getInstanceRefreshId() != null)
            sb.append("InstanceRefreshId: " + getInstanceRefreshId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceRefreshId() == null) ? 0 : getInstanceRefreshId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartInstanceRefreshResult == false)
            return false;
        StartInstanceRefreshResult other = (StartInstanceRefreshResult) obj;

        if (other.getInstanceRefreshId() == null ^ this.getInstanceRefreshId() == null)
            return false;
        if (other.getInstanceRefreshId() != null
                && other.getInstanceRefreshId().equals(this.getInstanceRefreshId()) == false)
            return false;
        return true;
    }
}
