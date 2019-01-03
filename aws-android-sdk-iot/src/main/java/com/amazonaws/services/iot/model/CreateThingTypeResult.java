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

/**
 * <p>
 * The output of the CreateThingType operation.
 * </p>
 */
public class CreateThingTypeResult implements Serializable {
    /**
     * <p>
     * The name of the thing type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingTypeName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the thing type.
     * </p>
     */
    private String thingTypeArn;

    /**
     * <p>
     * The thing type ID.
     * </p>
     */
    private String thingTypeId;

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the thing type.
     *         </p>
     */
    public String getThingTypeName() {
        return thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingTypeName <p>
     *            The name of the thing type.
     *            </p>
     */
    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingTypeName <p>
     *            The name of the thing type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateThingTypeResult withThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the thing type.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the thing type.
     *         </p>
     */
    public String getThingTypeArn() {
        return thingTypeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the thing type.
     * </p>
     *
     * @param thingTypeArn <p>
     *            The Amazon Resource Name (ARN) of the thing type.
     *            </p>
     */
    public void setThingTypeArn(String thingTypeArn) {
        this.thingTypeArn = thingTypeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the thing type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingTypeArn <p>
     *            The Amazon Resource Name (ARN) of the thing type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateThingTypeResult withThingTypeArn(String thingTypeArn) {
        this.thingTypeArn = thingTypeArn;
        return this;
    }

    /**
     * <p>
     * The thing type ID.
     * </p>
     *
     * @return <p>
     *         The thing type ID.
     *         </p>
     */
    public String getThingTypeId() {
        return thingTypeId;
    }

    /**
     * <p>
     * The thing type ID.
     * </p>
     *
     * @param thingTypeId <p>
     *            The thing type ID.
     *            </p>
     */
    public void setThingTypeId(String thingTypeId) {
        this.thingTypeId = thingTypeId;
    }

    /**
     * <p>
     * The thing type ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingTypeId <p>
     *            The thing type ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateThingTypeResult withThingTypeId(String thingTypeId) {
        this.thingTypeId = thingTypeId;
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
        if (getThingTypeName() != null)
            sb.append("thingTypeName: " + getThingTypeName() + ",");
        if (getThingTypeArn() != null)
            sb.append("thingTypeArn: " + getThingTypeArn() + ",");
        if (getThingTypeId() != null)
            sb.append("thingTypeId: " + getThingTypeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        hashCode = prime * hashCode
                + ((getThingTypeArn() == null) ? 0 : getThingTypeArn().hashCode());
        hashCode = prime * hashCode
                + ((getThingTypeId() == null) ? 0 : getThingTypeId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateThingTypeResult == false)
            return false;
        CreateThingTypeResult other = (CreateThingTypeResult) obj;

        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null
                && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        if (other.getThingTypeArn() == null ^ this.getThingTypeArn() == null)
            return false;
        if (other.getThingTypeArn() != null
                && other.getThingTypeArn().equals(this.getThingTypeArn()) == false)
            return false;
        if (other.getThingTypeId() == null ^ this.getThingTypeId() == null)
            return false;
        if (other.getThingTypeId() != null
                && other.getThingTypeId().equals(this.getThingTypeId()) == false)
            return false;
        return true;
    }
}
