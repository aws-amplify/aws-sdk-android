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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * Account takeover action type.
 * </p>
 */
public class AccountTakeoverActionType implements Serializable {
    /**
     * <p>
     * Flag specifying whether to send a notification.
     * </p>
     */
    private Boolean notify;

    /**
     * <p>
     * The event action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BLOCK</code> Choosing this action will block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has configured
     * it, else allow the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_REQUIRED</code> Throw MFA challenge if user has configured it,
     * else block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ACTION</code> Allow the user sign-in.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLOCK, MFA_IF_CONFIGURED, MFA_REQUIRED, NO_ACTION
     */
    private String eventAction;

    /**
     * <p>
     * Flag specifying whether to send a notification.
     * </p>
     *
     * @return <p>
     *         Flag specifying whether to send a notification.
     *         </p>
     */
    public Boolean isNotify() {
        return notify;
    }

    /**
     * <p>
     * Flag specifying whether to send a notification.
     * </p>
     *
     * @return <p>
     *         Flag specifying whether to send a notification.
     *         </p>
     */
    public Boolean getNotify() {
        return notify;
    }

    /**
     * <p>
     * Flag specifying whether to send a notification.
     * </p>
     *
     * @param notify <p>
     *            Flag specifying whether to send a notification.
     *            </p>
     */
    public void setNotify(Boolean notify) {
        this.notify = notify;
    }

    /**
     * <p>
     * Flag specifying whether to send a notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notify <p>
     *            Flag specifying whether to send a notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountTakeoverActionType withNotify(Boolean notify) {
        this.notify = notify;
        return this;
    }

    /**
     * <p>
     * The event action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BLOCK</code> Choosing this action will block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has configured
     * it, else allow the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_REQUIRED</code> Throw MFA challenge if user has configured it,
     * else block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ACTION</code> Allow the user sign-in.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLOCK, MFA_IF_CONFIGURED, MFA_REQUIRED, NO_ACTION
     *
     * @return <p>
     *         The event action.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BLOCK</code> Choosing this action will block the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has
     *         configured it, else allow the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MFA_REQUIRED</code> Throw MFA challenge if user has
     *         configured it, else block the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NO_ACTION</code> Allow the user sign-in.
     *         </p>
     *         </li>
     *         </ul>
     * @see AccountTakeoverEventActionType
     */
    public String getEventAction() {
        return eventAction;
    }

    /**
     * <p>
     * The event action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BLOCK</code> Choosing this action will block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has configured
     * it, else allow the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_REQUIRED</code> Throw MFA challenge if user has configured it,
     * else block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ACTION</code> Allow the user sign-in.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLOCK, MFA_IF_CONFIGURED, MFA_REQUIRED, NO_ACTION
     *
     * @param eventAction <p>
     *            The event action.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>BLOCK</code> Choosing this action will block the
     *            request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has
     *            configured it, else allow the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MFA_REQUIRED</code> Throw MFA challenge if user has
     *            configured it, else block the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NO_ACTION</code> Allow the user sign-in.
     *            </p>
     *            </li>
     *            </ul>
     * @see AccountTakeoverEventActionType
     */
    public void setEventAction(String eventAction) {
        this.eventAction = eventAction;
    }

    /**
     * <p>
     * The event action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BLOCK</code> Choosing this action will block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has configured
     * it, else allow the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_REQUIRED</code> Throw MFA challenge if user has configured it,
     * else block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ACTION</code> Allow the user sign-in.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLOCK, MFA_IF_CONFIGURED, MFA_REQUIRED, NO_ACTION
     *
     * @param eventAction <p>
     *            The event action.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>BLOCK</code> Choosing this action will block the
     *            request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has
     *            configured it, else allow the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MFA_REQUIRED</code> Throw MFA challenge if user has
     *            configured it, else block the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NO_ACTION</code> Allow the user sign-in.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccountTakeoverEventActionType
     */
    public AccountTakeoverActionType withEventAction(String eventAction) {
        this.eventAction = eventAction;
        return this;
    }

    /**
     * <p>
     * The event action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BLOCK</code> Choosing this action will block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has configured
     * it, else allow the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_REQUIRED</code> Throw MFA challenge if user has configured it,
     * else block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ACTION</code> Allow the user sign-in.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLOCK, MFA_IF_CONFIGURED, MFA_REQUIRED, NO_ACTION
     *
     * @param eventAction <p>
     *            The event action.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>BLOCK</code> Choosing this action will block the
     *            request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has
     *            configured it, else allow the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MFA_REQUIRED</code> Throw MFA challenge if user has
     *            configured it, else block the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NO_ACTION</code> Allow the user sign-in.
     *            </p>
     *            </li>
     *            </ul>
     * @see AccountTakeoverEventActionType
     */
    public void setEventAction(AccountTakeoverEventActionType eventAction) {
        this.eventAction = eventAction.toString();
    }

    /**
     * <p>
     * The event action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BLOCK</code> Choosing this action will block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has configured
     * it, else allow the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MFA_REQUIRED</code> Throw MFA challenge if user has configured it,
     * else block the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_ACTION</code> Allow the user sign-in.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLOCK, MFA_IF_CONFIGURED, MFA_REQUIRED, NO_ACTION
     *
     * @param eventAction <p>
     *            The event action.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>BLOCK</code> Choosing this action will block the
     *            request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MFA_IF_CONFIGURED</code> Throw MFA challenge if user has
     *            configured it, else allow the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MFA_REQUIRED</code> Throw MFA challenge if user has
     *            configured it, else block the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NO_ACTION</code> Allow the user sign-in.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccountTakeoverEventActionType
     */
    public AccountTakeoverActionType withEventAction(AccountTakeoverEventActionType eventAction) {
        this.eventAction = eventAction.toString();
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
        if (getNotify() != null)
            sb.append("Notify: " + getNotify() + ",");
        if (getEventAction() != null)
            sb.append("EventAction: " + getEventAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotify() == null) ? 0 : getNotify().hashCode());
        hashCode = prime * hashCode
                + ((getEventAction() == null) ? 0 : getEventAction().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountTakeoverActionType == false)
            return false;
        AccountTakeoverActionType other = (AccountTakeoverActionType) obj;

        if (other.getNotify() == null ^ this.getNotify() == null)
            return false;
        if (other.getNotify() != null && other.getNotify().equals(this.getNotify()) == false)
            return false;
        if (other.getEventAction() == null ^ this.getEventAction() == null)
            return false;
        if (other.getEventAction() != null
                && other.getEventAction().equals(this.getEventAction()) == false)
            return false;
        return true;
    }
}
