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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the configuration and other settings for an activity in a journey.
 * </p>
 */
public class Activity implements Serializable {
    /**
     * <p>
     * The settings for a custom message activity. This type of activity calls
     * an AWS Lambda function or web hook that sends messages to participants.
     * </p>
     */
    private CustomMessageActivity cUSTOM;

    /**
     * <p>
     * The settings for a yes/no split activity. This type of activity sends
     * participants down one of two paths in a journey, based on conditions that
     * you specify.
     * </p>
     */
    private ConditionalSplitActivity conditionalSplit;

    /**
     * <p>
     * The custom description of the activity.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The settings for an email activity. This type of activity sends an email
     * message to participants.
     * </p>
     */
    private EmailMessageActivity eMAIL;

    /**
     * <p>
     * The settings for a holdout activity. This type of activity stops a
     * journey for a specified percentage of participants.
     * </p>
     */
    private HoldoutActivity holdout;

    /**
     * <p>
     * The settings for a multivariate split activity. This type of activity
     * sends participants down one of as many as five paths (including a default
     * <i>Else</i> path) in a journey, based on conditions that you specify.
     * </p>
     */
    private MultiConditionalSplitActivity multiCondition;

    /**
     * <p>
     * The settings for a push notification activity. This type of activity
     * sends a push notification to participants.
     * </p>
     */
    private PushMessageActivity pUSH;

    /**
     * <p>
     * The settings for a random split activity. This type of activity randomly
     * sends specified percentages of participants down one of as many as five
     * paths in a journey, based on conditions that you specify.
     * </p>
     */
    private RandomSplitActivity randomSplit;

    /**
     * <p>
     * The settings for an SMS activity. This type of activity sends a text
     * message to participants.
     * </p>
     */
    private SMSMessageActivity sMS;

    /**
     * <p>
     * The settings for a wait activity. This type of activity waits for a
     * certain amount of time or until a specific date and time before moving
     * participants to the next activity in a journey.
     * </p>
     */
    private WaitActivity wait;

    /**
     * <p>
     * The settings for a custom message activity. This type of activity calls
     * an AWS Lambda function or web hook that sends messages to participants.
     * </p>
     *
     * @return <p>
     *         The settings for a custom message activity. This type of activity
     *         calls an AWS Lambda function or web hook that sends messages to
     *         participants.
     *         </p>
     */
    public CustomMessageActivity getCUSTOM() {
        return cUSTOM;
    }

    /**
     * <p>
     * The settings for a custom message activity. This type of activity calls
     * an AWS Lambda function or web hook that sends messages to participants.
     * </p>
     *
     * @param cUSTOM <p>
     *            The settings for a custom message activity. This type of
     *            activity calls an AWS Lambda function or web hook that sends
     *            messages to participants.
     *            </p>
     */
    public void setCUSTOM(CustomMessageActivity cUSTOM) {
        this.cUSTOM = cUSTOM;
    }

    /**
     * <p>
     * The settings for a custom message activity. This type of activity calls
     * an AWS Lambda function or web hook that sends messages to participants.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cUSTOM <p>
     *            The settings for a custom message activity. This type of
     *            activity calls an AWS Lambda function or web hook that sends
     *            messages to participants.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Activity withCUSTOM(CustomMessageActivity cUSTOM) {
        this.cUSTOM = cUSTOM;
        return this;
    }

    /**
     * <p>
     * The settings for a yes/no split activity. This type of activity sends
     * participants down one of two paths in a journey, based on conditions that
     * you specify.
     * </p>
     *
     * @return <p>
     *         The settings for a yes/no split activity. This type of activity
     *         sends participants down one of two paths in a journey, based on
     *         conditions that you specify.
     *         </p>
     */
    public ConditionalSplitActivity getConditionalSplit() {
        return conditionalSplit;
    }

    /**
     * <p>
     * The settings for a yes/no split activity. This type of activity sends
     * participants down one of two paths in a journey, based on conditions that
     * you specify.
     * </p>
     *
     * @param conditionalSplit <p>
     *            The settings for a yes/no split activity. This type of
     *            activity sends participants down one of two paths in a
     *            journey, based on conditions that you specify.
     *            </p>
     */
    public void setConditionalSplit(ConditionalSplitActivity conditionalSplit) {
        this.conditionalSplit = conditionalSplit;
    }

    /**
     * <p>
     * The settings for a yes/no split activity. This type of activity sends
     * participants down one of two paths in a journey, based on conditions that
     * you specify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conditionalSplit <p>
     *            The settings for a yes/no split activity. This type of
     *            activity sends participants down one of two paths in a
     *            journey, based on conditions that you specify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Activity withConditionalSplit(ConditionalSplitActivity conditionalSplit) {
        this.conditionalSplit = conditionalSplit;
        return this;
    }

    /**
     * <p>
     * The custom description of the activity.
     * </p>
     *
     * @return <p>
     *         The custom description of the activity.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The custom description of the activity.
     * </p>
     *
     * @param description <p>
     *            The custom description of the activity.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The custom description of the activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The custom description of the activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Activity withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The settings for an email activity. This type of activity sends an email
     * message to participants.
     * </p>
     *
     * @return <p>
     *         The settings for an email activity. This type of activity sends
     *         an email message to participants.
     *         </p>
     */
    public EmailMessageActivity getEMAIL() {
        return eMAIL;
    }

    /**
     * <p>
     * The settings for an email activity. This type of activity sends an email
     * message to participants.
     * </p>
     *
     * @param eMAIL <p>
     *            The settings for an email activity. This type of activity
     *            sends an email message to participants.
     *            </p>
     */
    public void setEMAIL(EmailMessageActivity eMAIL) {
        this.eMAIL = eMAIL;
    }

    /**
     * <p>
     * The settings for an email activity. This type of activity sends an email
     * message to participants.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eMAIL <p>
     *            The settings for an email activity. This type of activity
     *            sends an email message to participants.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Activity withEMAIL(EmailMessageActivity eMAIL) {
        this.eMAIL = eMAIL;
        return this;
    }

    /**
     * <p>
     * The settings for a holdout activity. This type of activity stops a
     * journey for a specified percentage of participants.
     * </p>
     *
     * @return <p>
     *         The settings for a holdout activity. This type of activity stops
     *         a journey for a specified percentage of participants.
     *         </p>
     */
    public HoldoutActivity getHoldout() {
        return holdout;
    }

    /**
     * <p>
     * The settings for a holdout activity. This type of activity stops a
     * journey for a specified percentage of participants.
     * </p>
     *
     * @param holdout <p>
     *            The settings for a holdout activity. This type of activity
     *            stops a journey for a specified percentage of participants.
     *            </p>
     */
    public void setHoldout(HoldoutActivity holdout) {
        this.holdout = holdout;
    }

    /**
     * <p>
     * The settings for a holdout activity. This type of activity stops a
     * journey for a specified percentage of participants.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param holdout <p>
     *            The settings for a holdout activity. This type of activity
     *            stops a journey for a specified percentage of participants.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Activity withHoldout(HoldoutActivity holdout) {
        this.holdout = holdout;
        return this;
    }

    /**
     * <p>
     * The settings for a multivariate split activity. This type of activity
     * sends participants down one of as many as five paths (including a default
     * <i>Else</i> path) in a journey, based on conditions that you specify.
     * </p>
     *
     * @return <p>
     *         The settings for a multivariate split activity. This type of
     *         activity sends participants down one of as many as five paths
     *         (including a default <i>Else</i> path) in a journey, based on
     *         conditions that you specify.
     *         </p>
     */
    public MultiConditionalSplitActivity getMultiCondition() {
        return multiCondition;
    }

    /**
     * <p>
     * The settings for a multivariate split activity. This type of activity
     * sends participants down one of as many as five paths (including a default
     * <i>Else</i> path) in a journey, based on conditions that you specify.
     * </p>
     *
     * @param multiCondition <p>
     *            The settings for a multivariate split activity. This type of
     *            activity sends participants down one of as many as five paths
     *            (including a default <i>Else</i> path) in a journey, based on
     *            conditions that you specify.
     *            </p>
     */
    public void setMultiCondition(MultiConditionalSplitActivity multiCondition) {
        this.multiCondition = multiCondition;
    }

    /**
     * <p>
     * The settings for a multivariate split activity. This type of activity
     * sends participants down one of as many as five paths (including a default
     * <i>Else</i> path) in a journey, based on conditions that you specify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiCondition <p>
     *            The settings for a multivariate split activity. This type of
     *            activity sends participants down one of as many as five paths
     *            (including a default <i>Else</i> path) in a journey, based on
     *            conditions that you specify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Activity withMultiCondition(MultiConditionalSplitActivity multiCondition) {
        this.multiCondition = multiCondition;
        return this;
    }

    /**
     * <p>
     * The settings for a push notification activity. This type of activity
     * sends a push notification to participants.
     * </p>
     *
     * @return <p>
     *         The settings for a push notification activity. This type of
     *         activity sends a push notification to participants.
     *         </p>
     */
    public PushMessageActivity getPUSH() {
        return pUSH;
    }

    /**
     * <p>
     * The settings for a push notification activity. This type of activity
     * sends a push notification to participants.
     * </p>
     *
     * @param pUSH <p>
     *            The settings for a push notification activity. This type of
     *            activity sends a push notification to participants.
     *            </p>
     */
    public void setPUSH(PushMessageActivity pUSH) {
        this.pUSH = pUSH;
    }

    /**
     * <p>
     * The settings for a push notification activity. This type of activity
     * sends a push notification to participants.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pUSH <p>
     *            The settings for a push notification activity. This type of
     *            activity sends a push notification to participants.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Activity withPUSH(PushMessageActivity pUSH) {
        this.pUSH = pUSH;
        return this;
    }

    /**
     * <p>
     * The settings for a random split activity. This type of activity randomly
     * sends specified percentages of participants down one of as many as five
     * paths in a journey, based on conditions that you specify.
     * </p>
     *
     * @return <p>
     *         The settings for a random split activity. This type of activity
     *         randomly sends specified percentages of participants down one of
     *         as many as five paths in a journey, based on conditions that you
     *         specify.
     *         </p>
     */
    public RandomSplitActivity getRandomSplit() {
        return randomSplit;
    }

    /**
     * <p>
     * The settings for a random split activity. This type of activity randomly
     * sends specified percentages of participants down one of as many as five
     * paths in a journey, based on conditions that you specify.
     * </p>
     *
     * @param randomSplit <p>
     *            The settings for a random split activity. This type of
     *            activity randomly sends specified percentages of participants
     *            down one of as many as five paths in a journey, based on
     *            conditions that you specify.
     *            </p>
     */
    public void setRandomSplit(RandomSplitActivity randomSplit) {
        this.randomSplit = randomSplit;
    }

    /**
     * <p>
     * The settings for a random split activity. This type of activity randomly
     * sends specified percentages of participants down one of as many as five
     * paths in a journey, based on conditions that you specify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param randomSplit <p>
     *            The settings for a random split activity. This type of
     *            activity randomly sends specified percentages of participants
     *            down one of as many as five paths in a journey, based on
     *            conditions that you specify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Activity withRandomSplit(RandomSplitActivity randomSplit) {
        this.randomSplit = randomSplit;
        return this;
    }

    /**
     * <p>
     * The settings for an SMS activity. This type of activity sends a text
     * message to participants.
     * </p>
     *
     * @return <p>
     *         The settings for an SMS activity. This type of activity sends a
     *         text message to participants.
     *         </p>
     */
    public SMSMessageActivity getSMS() {
        return sMS;
    }

    /**
     * <p>
     * The settings for an SMS activity. This type of activity sends a text
     * message to participants.
     * </p>
     *
     * @param sMS <p>
     *            The settings for an SMS activity. This type of activity sends
     *            a text message to participants.
     *            </p>
     */
    public void setSMS(SMSMessageActivity sMS) {
        this.sMS = sMS;
    }

    /**
     * <p>
     * The settings for an SMS activity. This type of activity sends a text
     * message to participants.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sMS <p>
     *            The settings for an SMS activity. This type of activity sends
     *            a text message to participants.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Activity withSMS(SMSMessageActivity sMS) {
        this.sMS = sMS;
        return this;
    }

    /**
     * <p>
     * The settings for a wait activity. This type of activity waits for a
     * certain amount of time or until a specific date and time before moving
     * participants to the next activity in a journey.
     * </p>
     *
     * @return <p>
     *         The settings for a wait activity. This type of activity waits for
     *         a certain amount of time or until a specific date and time before
     *         moving participants to the next activity in a journey.
     *         </p>
     */
    public WaitActivity getWait() {
        return wait;
    }

    /**
     * <p>
     * The settings for a wait activity. This type of activity waits for a
     * certain amount of time or until a specific date and time before moving
     * participants to the next activity in a journey.
     * </p>
     *
     * @param wait <p>
     *            The settings for a wait activity. This type of activity waits
     *            for a certain amount of time or until a specific date and time
     *            before moving participants to the next activity in a journey.
     *            </p>
     */
    public void setWait(WaitActivity wait) {
        this.wait = wait;
    }

    /**
     * <p>
     * The settings for a wait activity. This type of activity waits for a
     * certain amount of time or until a specific date and time before moving
     * participants to the next activity in a journey.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param wait <p>
     *            The settings for a wait activity. This type of activity waits
     *            for a certain amount of time or until a specific date and time
     *            before moving participants to the next activity in a journey.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Activity withWait(WaitActivity wait) {
        this.wait = wait;
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
        if (getCUSTOM() != null)
            sb.append("CUSTOM: " + getCUSTOM() + ",");
        if (getConditionalSplit() != null)
            sb.append("ConditionalSplit: " + getConditionalSplit() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getEMAIL() != null)
            sb.append("EMAIL: " + getEMAIL() + ",");
        if (getHoldout() != null)
            sb.append("Holdout: " + getHoldout() + ",");
        if (getMultiCondition() != null)
            sb.append("MultiCondition: " + getMultiCondition() + ",");
        if (getPUSH() != null)
            sb.append("PUSH: " + getPUSH() + ",");
        if (getRandomSplit() != null)
            sb.append("RandomSplit: " + getRandomSplit() + ",");
        if (getSMS() != null)
            sb.append("SMS: " + getSMS() + ",");
        if (getWait() != null)
            sb.append("Wait: " + getWait());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCUSTOM() == null) ? 0 : getCUSTOM().hashCode());
        hashCode = prime * hashCode
                + ((getConditionalSplit() == null) ? 0 : getConditionalSplit().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEMAIL() == null) ? 0 : getEMAIL().hashCode());
        hashCode = prime * hashCode + ((getHoldout() == null) ? 0 : getHoldout().hashCode());
        hashCode = prime * hashCode
                + ((getMultiCondition() == null) ? 0 : getMultiCondition().hashCode());
        hashCode = prime * hashCode + ((getPUSH() == null) ? 0 : getPUSH().hashCode());
        hashCode = prime * hashCode
                + ((getRandomSplit() == null) ? 0 : getRandomSplit().hashCode());
        hashCode = prime * hashCode + ((getSMS() == null) ? 0 : getSMS().hashCode());
        hashCode = prime * hashCode + ((getWait() == null) ? 0 : getWait().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Activity == false)
            return false;
        Activity other = (Activity) obj;

        if (other.getCUSTOM() == null ^ this.getCUSTOM() == null)
            return false;
        if (other.getCUSTOM() != null && other.getCUSTOM().equals(this.getCUSTOM()) == false)
            return false;
        if (other.getConditionalSplit() == null ^ this.getConditionalSplit() == null)
            return false;
        if (other.getConditionalSplit() != null
                && other.getConditionalSplit().equals(this.getConditionalSplit()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEMAIL() == null ^ this.getEMAIL() == null)
            return false;
        if (other.getEMAIL() != null && other.getEMAIL().equals(this.getEMAIL()) == false)
            return false;
        if (other.getHoldout() == null ^ this.getHoldout() == null)
            return false;
        if (other.getHoldout() != null && other.getHoldout().equals(this.getHoldout()) == false)
            return false;
        if (other.getMultiCondition() == null ^ this.getMultiCondition() == null)
            return false;
        if (other.getMultiCondition() != null
                && other.getMultiCondition().equals(this.getMultiCondition()) == false)
            return false;
        if (other.getPUSH() == null ^ this.getPUSH() == null)
            return false;
        if (other.getPUSH() != null && other.getPUSH().equals(this.getPUSH()) == false)
            return false;
        if (other.getRandomSplit() == null ^ this.getRandomSplit() == null)
            return false;
        if (other.getRandomSplit() != null
                && other.getRandomSplit().equals(this.getRandomSplit()) == false)
            return false;
        if (other.getSMS() == null ^ this.getSMS() == null)
            return false;
        if (other.getSMS() != null && other.getSMS().equals(this.getSMS()) == false)
            return false;
        if (other.getWait() == null ^ this.getWait() == null)
            return false;
        if (other.getWait() != null && other.getWait().equals(this.getWait()) == false)
            return false;
        return true;
    }
}
