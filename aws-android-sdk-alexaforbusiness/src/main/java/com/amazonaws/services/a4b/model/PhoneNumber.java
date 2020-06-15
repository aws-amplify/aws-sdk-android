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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * The phone number for the contact containing the raw number and phone number
 * type.
 * </p>
 */
public class PhoneNumber implements Serializable {
    /**
     * <p>
     * The raw value of the phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     * <b>Pattern: </b>^[\+0-9\#\,\(][\+0-9\-\.\/\(\)\,\#\s]+$<br/>
     */
    private String number;

    /**
     * <p>
     * The type of the phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MOBILE, WORK, HOME
     */
    private String type;

    /**
     * <p>
     * The raw value of the phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     * <b>Pattern: </b>^[\+0-9\#\,\(][\+0-9\-\.\/\(\)\,\#\s]+$<br/>
     *
     * @return <p>
     *         The raw value of the phone number.
     *         </p>
     */
    public String getNumber() {
        return number;
    }

    /**
     * <p>
     * The raw value of the phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     * <b>Pattern: </b>^[\+0-9\#\,\(][\+0-9\-\.\/\(\)\,\#\s]+$<br/>
     *
     * @param number <p>
     *            The raw value of the phone number.
     *            </p>
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * <p>
     * The raw value of the phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     * <b>Pattern: </b>^[\+0-9\#\,\(][\+0-9\-\.\/\(\)\,\#\s]+$<br/>
     *
     * @param number <p>
     *            The raw value of the phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumber withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * <p>
     * The type of the phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MOBILE, WORK, HOME
     *
     * @return <p>
     *         The type of the phone number.
     *         </p>
     * @see PhoneNumberType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MOBILE, WORK, HOME
     *
     * @param type <p>
     *            The type of the phone number.
     *            </p>
     * @see PhoneNumberType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MOBILE, WORK, HOME
     *
     * @param type <p>
     *            The type of the phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberType
     */
    public PhoneNumber withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MOBILE, WORK, HOME
     *
     * @param type <p>
     *            The type of the phone number.
     *            </p>
     * @see PhoneNumberType
     */
    public void setType(PhoneNumberType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MOBILE, WORK, HOME
     *
     * @param type <p>
     *            The type of the phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberType
     */
    public PhoneNumber withType(PhoneNumberType type) {
        this.type = type.toString();
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
        if (getNumber() != null)
            sb.append("Number: " + getNumber() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumber() == null) ? 0 : getNumber().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhoneNumber == false)
            return false;
        PhoneNumber other = (PhoneNumber) obj;

        if (other.getNumber() == null ^ this.getNumber() == null)
            return false;
        if (other.getNumber() != null && other.getNumber().equals(this.getNumber()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
