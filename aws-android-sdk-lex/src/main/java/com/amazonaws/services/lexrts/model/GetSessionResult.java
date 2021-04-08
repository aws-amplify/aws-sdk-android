/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lexrts.model;

import java.io.Serializable;

public class GetSessionResult implements Serializable {
    /**
     * <p>
     * An array of information about the intents used in the session. The array
     * can contain a maximum of three summaries. If more than three intents are
     * used in the session, the <code>recentIntentSummaryView</code> operation
     * contains information about the last three intents used.
     * </p>
     * <p>
     * If you set the <code>checkpointLabelFilter</code> parameter in the
     * request, the array contains only the intents with the specified label.
     * </p>
     */
    private java.util.List<IntentSummary> recentIntentSummaryView;

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context
     * information. It contains application information passed between Amazon
     * Lex and a client application.
     * </p>
     */
    private java.util.Map<String, String> sessionAttributes;

    /**
     * <p>
     * A unique identifier for the session.
     * </p>
     */
    private String sessionId;

    /**
     * <p>
     * Describes the current state of the bot.
     * </p>
     */
    private DialogAction dialogAction;

    /**
     * <p>
     * A list of active contexts for the session. A context can be set when an
     * intent is fulfilled or by calling the <code>PostContent</code>,
     * <code>PostText</code>, or <code>PutSession</code> operation.
     * </p>
     * <p>
     * You can use a context to control the intents that can follow up an
     * intent, or to modify the operation of your application.
     * </p>
     */
    private java.util.List<ActiveContext> activeContexts;

    /**
     * <p>
     * An array of information about the intents used in the session. The array
     * can contain a maximum of three summaries. If more than three intents are
     * used in the session, the <code>recentIntentSummaryView</code> operation
     * contains information about the last three intents used.
     * </p>
     * <p>
     * If you set the <code>checkpointLabelFilter</code> parameter in the
     * request, the array contains only the intents with the specified label.
     * </p>
     *
     * @return <p>
     *         An array of information about the intents used in the session.
     *         The array can contain a maximum of three summaries. If more than
     *         three intents are used in the session, the
     *         <code>recentIntentSummaryView</code> operation contains
     *         information about the last three intents used.
     *         </p>
     *         <p>
     *         If you set the <code>checkpointLabelFilter</code> parameter in
     *         the request, the array contains only the intents with the
     *         specified label.
     *         </p>
     */
    public java.util.List<IntentSummary> getRecentIntentSummaryView() {
        return recentIntentSummaryView;
    }

    /**
     * <p>
     * An array of information about the intents used in the session. The array
     * can contain a maximum of three summaries. If more than three intents are
     * used in the session, the <code>recentIntentSummaryView</code> operation
     * contains information about the last three intents used.
     * </p>
     * <p>
     * If you set the <code>checkpointLabelFilter</code> parameter in the
     * request, the array contains only the intents with the specified label.
     * </p>
     *
     * @param recentIntentSummaryView <p>
     *            An array of information about the intents used in the session.
     *            The array can contain a maximum of three summaries. If more
     *            than three intents are used in the session, the
     *            <code>recentIntentSummaryView</code> operation contains
     *            information about the last three intents used.
     *            </p>
     *            <p>
     *            If you set the <code>checkpointLabelFilter</code> parameter in
     *            the request, the array contains only the intents with the
     *            specified label.
     *            </p>
     */
    public void setRecentIntentSummaryView(
            java.util.Collection<IntentSummary> recentIntentSummaryView) {
        if (recentIntentSummaryView == null) {
            this.recentIntentSummaryView = null;
            return;
        }

        this.recentIntentSummaryView = new java.util.ArrayList<IntentSummary>(
                recentIntentSummaryView);
    }

    /**
     * <p>
     * An array of information about the intents used in the session. The array
     * can contain a maximum of three summaries. If more than three intents are
     * used in the session, the <code>recentIntentSummaryView</code> operation
     * contains information about the last three intents used.
     * </p>
     * <p>
     * If you set the <code>checkpointLabelFilter</code> parameter in the
     * request, the array contains only the intents with the specified label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recentIntentSummaryView <p>
     *            An array of information about the intents used in the session.
     *            The array can contain a maximum of three summaries. If more
     *            than three intents are used in the session, the
     *            <code>recentIntentSummaryView</code> operation contains
     *            information about the last three intents used.
     *            </p>
     *            <p>
     *            If you set the <code>checkpointLabelFilter</code> parameter in
     *            the request, the array contains only the intents with the
     *            specified label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSessionResult withRecentIntentSummaryView(IntentSummary... recentIntentSummaryView) {
        if (getRecentIntentSummaryView() == null) {
            this.recentIntentSummaryView = new java.util.ArrayList<IntentSummary>(
                    recentIntentSummaryView.length);
        }
        for (IntentSummary value : recentIntentSummaryView) {
            this.recentIntentSummaryView.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of information about the intents used in the session. The array
     * can contain a maximum of three summaries. If more than three intents are
     * used in the session, the <code>recentIntentSummaryView</code> operation
     * contains information about the last three intents used.
     * </p>
     * <p>
     * If you set the <code>checkpointLabelFilter</code> parameter in the
     * request, the array contains only the intents with the specified label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recentIntentSummaryView <p>
     *            An array of information about the intents used in the session.
     *            The array can contain a maximum of three summaries. If more
     *            than three intents are used in the session, the
     *            <code>recentIntentSummaryView</code> operation contains
     *            information about the last three intents used.
     *            </p>
     *            <p>
     *            If you set the <code>checkpointLabelFilter</code> parameter in
     *            the request, the array contains only the intents with the
     *            specified label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSessionResult withRecentIntentSummaryView(
            java.util.Collection<IntentSummary> recentIntentSummaryView) {
        setRecentIntentSummaryView(recentIntentSummaryView);
        return this;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context
     * information. It contains application information passed between Amazon
     * Lex and a client application.
     * </p>
     *
     * @return <p>
     *         Map of key/value pairs representing the session-specific context
     *         information. It contains application information passed between
     *         Amazon Lex and a client application.
     *         </p>
     */
    public java.util.Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context
     * information. It contains application information passed between Amazon
     * Lex and a client application.
     * </p>
     *
     * @param sessionAttributes <p>
     *            Map of key/value pairs representing the session-specific
     *            context information. It contains application information
     *            passed between Amazon Lex and a client application.
     *            </p>
     */
    public void setSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context
     * information. It contains application information passed between Amazon
     * Lex and a client application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionAttributes <p>
     *            Map of key/value pairs representing the session-specific
     *            context information. It contains application information
     *            passed between Amazon Lex and a client application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSessionResult withSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
        return this;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context
     * information. It contains application information passed between Amazon
     * Lex and a client application.
     * </p>
     * <p>
     * The method adds a new key-value pair into sessionAttributes parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into sessionAttributes.
     * @param value The corresponding value of the entry to be added into
     *            sessionAttributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSessionResult addsessionAttributesEntry(String key, String value) {
        if (null == this.sessionAttributes) {
            this.sessionAttributes = new java.util.HashMap<String, String>();
        }
        if (this.sessionAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.sessionAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into sessionAttributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetSessionResult clearsessionAttributesEntries() {
        this.sessionAttributes = null;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the session.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the session.
     *         </p>
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * <p>
     * A unique identifier for the session.
     * </p>
     *
     * @param sessionId <p>
     *            A unique identifier for the session.
     *            </p>
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * A unique identifier for the session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionId <p>
     *            A unique identifier for the session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSessionResult withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * <p>
     * Describes the current state of the bot.
     * </p>
     *
     * @return <p>
     *         Describes the current state of the bot.
     *         </p>
     */
    public DialogAction getDialogAction() {
        return dialogAction;
    }

    /**
     * <p>
     * Describes the current state of the bot.
     * </p>
     *
     * @param dialogAction <p>
     *            Describes the current state of the bot.
     *            </p>
     */
    public void setDialogAction(DialogAction dialogAction) {
        this.dialogAction = dialogAction;
    }

    /**
     * <p>
     * Describes the current state of the bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dialogAction <p>
     *            Describes the current state of the bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSessionResult withDialogAction(DialogAction dialogAction) {
        this.dialogAction = dialogAction;
        return this;
    }

    /**
     * <p>
     * A list of active contexts for the session. A context can be set when an
     * intent is fulfilled or by calling the <code>PostContent</code>,
     * <code>PostText</code>, or <code>PutSession</code> operation.
     * </p>
     * <p>
     * You can use a context to control the intents that can follow up an
     * intent, or to modify the operation of your application.
     * </p>
     *
     * @return <p>
     *         A list of active contexts for the session. A context can be set
     *         when an intent is fulfilled or by calling the
     *         <code>PostContent</code>, <code>PostText</code>, or
     *         <code>PutSession</code> operation.
     *         </p>
     *         <p>
     *         You can use a context to control the intents that can follow up
     *         an intent, or to modify the operation of your application.
     *         </p>
     */
    public java.util.List<ActiveContext> getActiveContexts() {
        return activeContexts;
    }

    /**
     * <p>
     * A list of active contexts for the session. A context can be set when an
     * intent is fulfilled or by calling the <code>PostContent</code>,
     * <code>PostText</code>, or <code>PutSession</code> operation.
     * </p>
     * <p>
     * You can use a context to control the intents that can follow up an
     * intent, or to modify the operation of your application.
     * </p>
     *
     * @param activeContexts <p>
     *            A list of active contexts for the session. A context can be
     *            set when an intent is fulfilled or by calling the
     *            <code>PostContent</code>, <code>PostText</code>, or
     *            <code>PutSession</code> operation.
     *            </p>
     *            <p>
     *            You can use a context to control the intents that can follow
     *            up an intent, or to modify the operation of your application.
     *            </p>
     */
    public void setActiveContexts(java.util.Collection<ActiveContext> activeContexts) {
        if (activeContexts == null) {
            this.activeContexts = null;
            return;
        }

        this.activeContexts = new java.util.ArrayList<ActiveContext>(activeContexts);
    }

    /**
     * <p>
     * A list of active contexts for the session. A context can be set when an
     * intent is fulfilled or by calling the <code>PostContent</code>,
     * <code>PostText</code>, or <code>PutSession</code> operation.
     * </p>
     * <p>
     * You can use a context to control the intents that can follow up an
     * intent, or to modify the operation of your application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activeContexts <p>
     *            A list of active contexts for the session. A context can be
     *            set when an intent is fulfilled or by calling the
     *            <code>PostContent</code>, <code>PostText</code>, or
     *            <code>PutSession</code> operation.
     *            </p>
     *            <p>
     *            You can use a context to control the intents that can follow
     *            up an intent, or to modify the operation of your application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSessionResult withActiveContexts(ActiveContext... activeContexts) {
        if (getActiveContexts() == null) {
            this.activeContexts = new java.util.ArrayList<ActiveContext>(activeContexts.length);
        }
        for (ActiveContext value : activeContexts) {
            this.activeContexts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of active contexts for the session. A context can be set when an
     * intent is fulfilled or by calling the <code>PostContent</code>,
     * <code>PostText</code>, or <code>PutSession</code> operation.
     * </p>
     * <p>
     * You can use a context to control the intents that can follow up an
     * intent, or to modify the operation of your application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activeContexts <p>
     *            A list of active contexts for the session. A context can be
     *            set when an intent is fulfilled or by calling the
     *            <code>PostContent</code>, <code>PostText</code>, or
     *            <code>PutSession</code> operation.
     *            </p>
     *            <p>
     *            You can use a context to control the intents that can follow
     *            up an intent, or to modify the operation of your application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSessionResult withActiveContexts(java.util.Collection<ActiveContext> activeContexts) {
        setActiveContexts(activeContexts);
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
        if (getRecentIntentSummaryView() != null)
            sb.append("recentIntentSummaryView: " + getRecentIntentSummaryView() + ",");
        if (getSessionAttributes() != null)
            sb.append("sessionAttributes: " + getSessionAttributes() + ",");
        if (getSessionId() != null)
            sb.append("sessionId: " + getSessionId() + ",");
        if (getDialogAction() != null)
            sb.append("dialogAction: " + getDialogAction() + ",");
        if (getActiveContexts() != null)
            sb.append("activeContexts: " + getActiveContexts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRecentIntentSummaryView() == null) ? 0 : getRecentIntentSummaryView()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSessionAttributes() == null) ? 0 : getSessionAttributes().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode
                + ((getDialogAction() == null) ? 0 : getDialogAction().hashCode());
        hashCode = prime * hashCode
                + ((getActiveContexts() == null) ? 0 : getActiveContexts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSessionResult == false)
            return false;
        GetSessionResult other = (GetSessionResult) obj;

        if (other.getRecentIntentSummaryView() == null ^ this.getRecentIntentSummaryView() == null)
            return false;
        if (other.getRecentIntentSummaryView() != null
                && other.getRecentIntentSummaryView().equals(this.getRecentIntentSummaryView()) == false)
            return false;
        if (other.getSessionAttributes() == null ^ this.getSessionAttributes() == null)
            return false;
        if (other.getSessionAttributes() != null
                && other.getSessionAttributes().equals(this.getSessionAttributes()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null
                && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getDialogAction() == null ^ this.getDialogAction() == null)
            return false;
        if (other.getDialogAction() != null
                && other.getDialogAction().equals(this.getDialogAction()) == false)
            return false;
        if (other.getActiveContexts() == null ^ this.getActiveContexts() == null)
            return false;
        if (other.getActiveContexts() != null
                && other.getActiveContexts().equals(this.getActiveContexts()) == false)
            return false;
        return true;
    }
}
