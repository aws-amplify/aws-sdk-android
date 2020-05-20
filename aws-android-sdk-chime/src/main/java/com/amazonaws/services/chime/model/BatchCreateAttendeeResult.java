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

public class BatchCreateAttendeeResult implements Serializable {
    /**
     * <p>
     * The attendee information, including attendees IDs and join tokens.
     * </p>
     */
    private java.util.List<Attendee> attendees;

    /**
     * <p>
     * If the action fails for one or more of the attendees in the request, a
     * list of the attendees is returned, along with error codes and error
     * messages.
     * </p>
     */
    private java.util.List<CreateAttendeeError> errors;

    /**
     * <p>
     * The attendee information, including attendees IDs and join tokens.
     * </p>
     *
     * @return <p>
     *         The attendee information, including attendees IDs and join
     *         tokens.
     *         </p>
     */
    public java.util.List<Attendee> getAttendees() {
        return attendees;
    }

    /**
     * <p>
     * The attendee information, including attendees IDs and join tokens.
     * </p>
     *
     * @param attendees <p>
     *            The attendee information, including attendees IDs and join
     *            tokens.
     *            </p>
     */
    public void setAttendees(java.util.Collection<Attendee> attendees) {
        if (attendees == null) {
            this.attendees = null;
            return;
        }

        this.attendees = new java.util.ArrayList<Attendee>(attendees);
    }

    /**
     * <p>
     * The attendee information, including attendees IDs and join tokens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attendees <p>
     *            The attendee information, including attendees IDs and join
     *            tokens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCreateAttendeeResult withAttendees(Attendee... attendees) {
        if (getAttendees() == null) {
            this.attendees = new java.util.ArrayList<Attendee>(attendees.length);
        }
        for (Attendee value : attendees) {
            this.attendees.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The attendee information, including attendees IDs and join tokens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attendees <p>
     *            The attendee information, including attendees IDs and join
     *            tokens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCreateAttendeeResult withAttendees(java.util.Collection<Attendee> attendees) {
        setAttendees(attendees);
        return this;
    }

    /**
     * <p>
     * If the action fails for one or more of the attendees in the request, a
     * list of the attendees is returned, along with error codes and error
     * messages.
     * </p>
     *
     * @return <p>
     *         If the action fails for one or more of the attendees in the
     *         request, a list of the attendees is returned, along with error
     *         codes and error messages.
     *         </p>
     */
    public java.util.List<CreateAttendeeError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * If the action fails for one or more of the attendees in the request, a
     * list of the attendees is returned, along with error codes and error
     * messages.
     * </p>
     *
     * @param errors <p>
     *            If the action fails for one or more of the attendees in the
     *            request, a list of the attendees is returned, along with error
     *            codes and error messages.
     *            </p>
     */
    public void setErrors(java.util.Collection<CreateAttendeeError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<CreateAttendeeError>(errors);
    }

    /**
     * <p>
     * If the action fails for one or more of the attendees in the request, a
     * list of the attendees is returned, along with error codes and error
     * messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            If the action fails for one or more of the attendees in the
     *            request, a list of the attendees is returned, along with error
     *            codes and error messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCreateAttendeeResult withErrors(CreateAttendeeError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<CreateAttendeeError>(errors.length);
        }
        for (CreateAttendeeError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If the action fails for one or more of the attendees in the request, a
     * list of the attendees is returned, along with error codes and error
     * messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            If the action fails for one or more of the attendees in the
     *            request, a list of the attendees is returned, along with error
     *            codes and error messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCreateAttendeeResult withErrors(java.util.Collection<CreateAttendeeError> errors) {
        setErrors(errors);
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
        if (getAttendees() != null)
            sb.append("Attendees: " + getAttendees() + ",");
        if (getErrors() != null)
            sb.append("Errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttendees() == null) ? 0 : getAttendees().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCreateAttendeeResult == false)
            return false;
        BatchCreateAttendeeResult other = (BatchCreateAttendeeResult) obj;

        if (other.getAttendees() == null ^ this.getAttendees() == null)
            return false;
        if (other.getAttendees() != null
                && other.getAttendees().equals(this.getAttendees()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}
