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

package com.amazonaws.services.workmail.model;

import java.io.Serializable;

public class DescribeResourceResult implements Serializable {
    /**
     * <p>
     * The identifier of the described resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^r-[0-9a-f]{32}$<br/>
     */
    private String resourceId;

    /**
     * <p>
     * The email of the described resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 254<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}<br/>
     */
    private String email;

    /**
     * <p>
     * The name of the described resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[\w\-.]+(@[a-zA-Z0-9.\-]+\.[a-zA-Z0-9]{2,})?<br/>
     */
    private String name;

    /**
     * <p>
     * The type of the described resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROOM, EQUIPMENT
     */
    private String type;

    /**
     * <p>
     * The booking options for the described resource.
     * </p>
     */
    private BookingOptions bookingOptions;

    /**
     * <p>
     * The state of the resource: enabled (registered to Amazon WorkMail),
     * disabled (deregistered or never registered to WorkMail), or deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     */
    private String state;

    /**
     * <p>
     * The date and time when a resource was enabled for WorkMail, in UNIX epoch
     * time format.
     * </p>
     */
    private java.util.Date enabledDate;

    /**
     * <p>
     * The date and time when a resource was disabled from WorkMail, in UNIX
     * epoch time format.
     * </p>
     */
    private java.util.Date disabledDate;

    /**
     * <p>
     * The identifier of the described resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^r-[0-9a-f]{32}$<br/>
     *
     * @return <p>
     *         The identifier of the described resource.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The identifier of the described resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^r-[0-9a-f]{32}$<br/>
     *
     * @param resourceId <p>
     *            The identifier of the described resource.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the described resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^r-[0-9a-f]{32}$<br/>
     *
     * @param resourceId <p>
     *            The identifier of the described resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResourceResult withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * The email of the described resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 254<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}<br/>
     *
     * @return <p>
     *         The email of the described resource.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The email of the described resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 254<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}<br/>
     *
     * @param email <p>
     *            The email of the described resource.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email of the described resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 254<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}<br/>
     *
     * @param email <p>
     *            The email of the described resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResourceResult withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * <p>
     * The name of the described resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[\w\-.]+(@[a-zA-Z0-9.\-]+\.[a-zA-Z0-9]{2,})?<br/>
     *
     * @return <p>
     *         The name of the described resource.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the described resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[\w\-.]+(@[a-zA-Z0-9.\-]+\.[a-zA-Z0-9]{2,})?<br/>
     *
     * @param name <p>
     *            The name of the described resource.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the described resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[\w\-.]+(@[a-zA-Z0-9.\-]+\.[a-zA-Z0-9]{2,})?<br/>
     *
     * @param name <p>
     *            The name of the described resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResourceResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of the described resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROOM, EQUIPMENT
     *
     * @return <p>
     *         The type of the described resource.
     *         </p>
     * @see ResourceType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the described resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROOM, EQUIPMENT
     *
     * @param type <p>
     *            The type of the described resource.
     *            </p>
     * @see ResourceType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the described resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROOM, EQUIPMENT
     *
     * @param type <p>
     *            The type of the described resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public DescribeResourceResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the described resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROOM, EQUIPMENT
     *
     * @param type <p>
     *            The type of the described resource.
     *            </p>
     * @see ResourceType
     */
    public void setType(ResourceType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the described resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROOM, EQUIPMENT
     *
     * @param type <p>
     *            The type of the described resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public DescribeResourceResult withType(ResourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The booking options for the described resource.
     * </p>
     *
     * @return <p>
     *         The booking options for the described resource.
     *         </p>
     */
    public BookingOptions getBookingOptions() {
        return bookingOptions;
    }

    /**
     * <p>
     * The booking options for the described resource.
     * </p>
     *
     * @param bookingOptions <p>
     *            The booking options for the described resource.
     *            </p>
     */
    public void setBookingOptions(BookingOptions bookingOptions) {
        this.bookingOptions = bookingOptions;
    }

    /**
     * <p>
     * The booking options for the described resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bookingOptions <p>
     *            The booking options for the described resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResourceResult withBookingOptions(BookingOptions bookingOptions) {
        this.bookingOptions = bookingOptions;
        return this;
    }

    /**
     * <p>
     * The state of the resource: enabled (registered to Amazon WorkMail),
     * disabled (deregistered or never registered to WorkMail), or deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @return <p>
     *         The state of the resource: enabled (registered to Amazon
     *         WorkMail), disabled (deregistered or never registered to
     *         WorkMail), or deleted.
     *         </p>
     * @see EntityState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the resource: enabled (registered to Amazon WorkMail),
     * disabled (deregistered or never registered to WorkMail), or deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @param state <p>
     *            The state of the resource: enabled (registered to Amazon
     *            WorkMail), disabled (deregistered or never registered to
     *            WorkMail), or deleted.
     *            </p>
     * @see EntityState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the resource: enabled (registered to Amazon WorkMail),
     * disabled (deregistered or never registered to WorkMail), or deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @param state <p>
     *            The state of the resource: enabled (registered to Amazon
     *            WorkMail), disabled (deregistered or never registered to
     *            WorkMail), or deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntityState
     */
    public DescribeResourceResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the resource: enabled (registered to Amazon WorkMail),
     * disabled (deregistered or never registered to WorkMail), or deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @param state <p>
     *            The state of the resource: enabled (registered to Amazon
     *            WorkMail), disabled (deregistered or never registered to
     *            WorkMail), or deleted.
     *            </p>
     * @see EntityState
     */
    public void setState(EntityState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the resource: enabled (registered to Amazon WorkMail),
     * disabled (deregistered or never registered to WorkMail), or deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @param state <p>
     *            The state of the resource: enabled (registered to Amazon
     *            WorkMail), disabled (deregistered or never registered to
     *            WorkMail), or deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntityState
     */
    public DescribeResourceResult withState(EntityState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when a resource was enabled for WorkMail, in UNIX epoch
     * time format.
     * </p>
     *
     * @return <p>
     *         The date and time when a resource was enabled for WorkMail, in
     *         UNIX epoch time format.
     *         </p>
     */
    public java.util.Date getEnabledDate() {
        return enabledDate;
    }

    /**
     * <p>
     * The date and time when a resource was enabled for WorkMail, in UNIX epoch
     * time format.
     * </p>
     *
     * @param enabledDate <p>
     *            The date and time when a resource was enabled for WorkMail, in
     *            UNIX epoch time format.
     *            </p>
     */
    public void setEnabledDate(java.util.Date enabledDate) {
        this.enabledDate = enabledDate;
    }

    /**
     * <p>
     * The date and time when a resource was enabled for WorkMail, in UNIX epoch
     * time format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabledDate <p>
     *            The date and time when a resource was enabled for WorkMail, in
     *            UNIX epoch time format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResourceResult withEnabledDate(java.util.Date enabledDate) {
        this.enabledDate = enabledDate;
        return this;
    }

    /**
     * <p>
     * The date and time when a resource was disabled from WorkMail, in UNIX
     * epoch time format.
     * </p>
     *
     * @return <p>
     *         The date and time when a resource was disabled from WorkMail, in
     *         UNIX epoch time format.
     *         </p>
     */
    public java.util.Date getDisabledDate() {
        return disabledDate;
    }

    /**
     * <p>
     * The date and time when a resource was disabled from WorkMail, in UNIX
     * epoch time format.
     * </p>
     *
     * @param disabledDate <p>
     *            The date and time when a resource was disabled from WorkMail,
     *            in UNIX epoch time format.
     *            </p>
     */
    public void setDisabledDate(java.util.Date disabledDate) {
        this.disabledDate = disabledDate;
    }

    /**
     * <p>
     * The date and time when a resource was disabled from WorkMail, in UNIX
     * epoch time format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disabledDate <p>
     *            The date and time when a resource was disabled from WorkMail,
     *            in UNIX epoch time format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResourceResult withDisabledDate(java.util.Date disabledDate) {
        this.disabledDate = disabledDate;
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
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getEmail() != null)
            sb.append("Email: " + getEmail() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getBookingOptions() != null)
            sb.append("BookingOptions: " + getBookingOptions() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getEnabledDate() != null)
            sb.append("EnabledDate: " + getEnabledDate() + ",");
        if (getDisabledDate() != null)
            sb.append("DisabledDate: " + getDisabledDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getBookingOptions() == null) ? 0 : getBookingOptions().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getEnabledDate() == null) ? 0 : getEnabledDate().hashCode());
        hashCode = prime * hashCode
                + ((getDisabledDate() == null) ? 0 : getDisabledDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeResourceResult == false)
            return false;
        DescribeResourceResult other = (DescribeResourceResult) obj;

        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getBookingOptions() == null ^ this.getBookingOptions() == null)
            return false;
        if (other.getBookingOptions() != null
                && other.getBookingOptions().equals(this.getBookingOptions()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getEnabledDate() == null ^ this.getEnabledDate() == null)
            return false;
        if (other.getEnabledDate() != null
                && other.getEnabledDate().equals(this.getEnabledDate()) == false)
            return false;
        if (other.getDisabledDate() == null ^ this.getDisabledDate() == null)
            return false;
        if (other.getDisabledDate() != null
                && other.getDisabledDate().equals(this.getDisabledDate()) == false)
            return false;
        return true;
    }
}
