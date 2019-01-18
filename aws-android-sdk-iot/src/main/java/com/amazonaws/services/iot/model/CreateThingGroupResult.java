/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class CreateThingGroupResult implements Serializable {
    /**
     * <p>
     * The thing group name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingGroupName;

    /**
     * <p>
     * The thing group ARN.
     * </p>
     */
    private String thingGroupArn;

    /**
     * <p>
     * The thing group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     */
    private String thingGroupId;

    /**
     * <p>
     * The thing group name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The thing group name.
     *         </p>
     */
    public String getThingGroupName() {
        return thingGroupName;
    }

    /**
     * <p>
     * The thing group name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingGroupName <p>
     *            The thing group name.
     *            </p>
     */
    public void setThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
    }

    /**
     * <p>
     * The thing group name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingGroupName <p>
     *            The thing group name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateThingGroupResult withThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
        return this;
    }

    /**
     * <p>
     * The thing group ARN.
     * </p>
     *
     * @return <p>
     *         The thing group ARN.
     *         </p>
     */
    public String getThingGroupArn() {
        return thingGroupArn;
    }

    /**
     * <p>
     * The thing group ARN.
     * </p>
     *
     * @param thingGroupArn <p>
     *            The thing group ARN.
     *            </p>
     */
    public void setThingGroupArn(String thingGroupArn) {
        this.thingGroupArn = thingGroupArn;
    }

    /**
     * <p>
     * The thing group ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroupArn <p>
     *            The thing group ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateThingGroupResult withThingGroupArn(String thingGroupArn) {
        this.thingGroupArn = thingGroupArn;
        return this;
    }

    /**
     * <p>
     * The thing group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @return <p>
     *         The thing group ID.
     *         </p>
     */
    public String getThingGroupId() {
        return thingGroupId;
    }

    /**
     * <p>
     * The thing group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param thingGroupId <p>
     *            The thing group ID.
     *            </p>
     */
    public void setThingGroupId(String thingGroupId) {
        this.thingGroupId = thingGroupId;
    }

    /**
     * <p>
     * The thing group ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param thingGroupId <p>
     *            The thing group ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateThingGroupResult withThingGroupId(String thingGroupId) {
        this.thingGroupId = thingGroupId;
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
        if (getThingGroupName() != null)
            sb.append("thingGroupName: " + getThingGroupName() + ",");
        if (getThingGroupArn() != null)
            sb.append("thingGroupArn: " + getThingGroupArn() + ",");
        if (getThingGroupId() != null)
            sb.append("thingGroupId: " + getThingGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getThingGroupName() == null) ? 0 : getThingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getThingGroupArn() == null) ? 0 : getThingGroupArn().hashCode());
        hashCode = prime * hashCode
                + ((getThingGroupId() == null) ? 0 : getThingGroupId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateThingGroupResult == false)
            return false;
        CreateThingGroupResult other = (CreateThingGroupResult) obj;

        if (other.getThingGroupName() == null ^ this.getThingGroupName() == null)
            return false;
        if (other.getThingGroupName() != null
                && other.getThingGroupName().equals(this.getThingGroupName()) == false)
            return false;
        if (other.getThingGroupArn() == null ^ this.getThingGroupArn() == null)
            return false;
        if (other.getThingGroupArn() != null
                && other.getThingGroupArn().equals(this.getThingGroupArn()) == false)
            return false;
        if (other.getThingGroupId() == null ^ this.getThingGroupId() == null)
            return false;
        if (other.getThingGroupId() != null
                && other.getThingGroupId().equals(this.getThingGroupId()) == false)
            return false;
        return true;
    }
}
