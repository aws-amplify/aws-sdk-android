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

package com.amazonaws.services.lexrts.model;

import java.io.Serializable;

/**
 * <p>
 * Represents an option rendered to the user when a prompt is shown. It could be
 * an image, a button, a link, or text.
 * </p>
 */
public class GenericAttachment implements Serializable {
    /**
     * <p>
     * The title of the option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 80<br/>
     */
    private String title;

    /**
     * <p>
     * The subtitle shown below the title.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 80<br/>
     */
    private String subTitle;

    /**
     * <p>
     * The URL of an attachment to the response card.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String attachmentLinkUrl;

    /**
     * <p>
     * The URL of an image that is displayed to the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String imageUrl;

    /**
     * <p>
     * The list of options to show to the user.
     * </p>
     */
    private java.util.List<Button> buttons;

    /**
     * <p>
     * The title of the option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 80<br/>
     *
     * @return <p>
     *         The title of the option.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The title of the option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 80<br/>
     *
     * @param title <p>
     *            The title of the option.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 80<br/>
     *
     * @param title <p>
     *            The title of the option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenericAttachment withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The subtitle shown below the title.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 80<br/>
     *
     * @return <p>
     *         The subtitle shown below the title.
     *         </p>
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * <p>
     * The subtitle shown below the title.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 80<br/>
     *
     * @param subTitle <p>
     *            The subtitle shown below the title.
     *            </p>
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    /**
     * <p>
     * The subtitle shown below the title.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 80<br/>
     *
     * @param subTitle <p>
     *            The subtitle shown below the title.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenericAttachment withSubTitle(String subTitle) {
        this.subTitle = subTitle;
        return this;
    }

    /**
     * <p>
     * The URL of an attachment to the response card.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The URL of an attachment to the response card.
     *         </p>
     */
    public String getAttachmentLinkUrl() {
        return attachmentLinkUrl;
    }

    /**
     * <p>
     * The URL of an attachment to the response card.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param attachmentLinkUrl <p>
     *            The URL of an attachment to the response card.
     *            </p>
     */
    public void setAttachmentLinkUrl(String attachmentLinkUrl) {
        this.attachmentLinkUrl = attachmentLinkUrl;
    }

    /**
     * <p>
     * The URL of an attachment to the response card.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param attachmentLinkUrl <p>
     *            The URL of an attachment to the response card.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenericAttachment withAttachmentLinkUrl(String attachmentLinkUrl) {
        this.attachmentLinkUrl = attachmentLinkUrl;
        return this;
    }

    /**
     * <p>
     * The URL of an image that is displayed to the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The URL of an image that is displayed to the user.
     *         </p>
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * <p>
     * The URL of an image that is displayed to the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param imageUrl <p>
     *            The URL of an image that is displayed to the user.
     *            </p>
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * <p>
     * The URL of an image that is displayed to the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param imageUrl <p>
     *            The URL of an image that is displayed to the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenericAttachment withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * <p>
     * The list of options to show to the user.
     * </p>
     *
     * @return <p>
     *         The list of options to show to the user.
     *         </p>
     */
    public java.util.List<Button> getButtons() {
        return buttons;
    }

    /**
     * <p>
     * The list of options to show to the user.
     * </p>
     *
     * @param buttons <p>
     *            The list of options to show to the user.
     *            </p>
     */
    public void setButtons(java.util.Collection<Button> buttons) {
        if (buttons == null) {
            this.buttons = null;
            return;
        }

        this.buttons = new java.util.ArrayList<Button>(buttons);
    }

    /**
     * <p>
     * The list of options to show to the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buttons <p>
     *            The list of options to show to the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenericAttachment withButtons(Button... buttons) {
        if (getButtons() == null) {
            this.buttons = new java.util.ArrayList<Button>(buttons.length);
        }
        for (Button value : buttons) {
            this.buttons.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of options to show to the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buttons <p>
     *            The list of options to show to the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenericAttachment withButtons(java.util.Collection<Button> buttons) {
        setButtons(buttons);
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
        if (getTitle() != null)
            sb.append("title: " + getTitle() + ",");
        if (getSubTitle() != null)
            sb.append("subTitle: " + getSubTitle() + ",");
        if (getAttachmentLinkUrl() != null)
            sb.append("attachmentLinkUrl: " + getAttachmentLinkUrl() + ",");
        if (getImageUrl() != null)
            sb.append("imageUrl: " + getImageUrl() + ",");
        if (getButtons() != null)
            sb.append("buttons: " + getButtons());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getSubTitle() == null) ? 0 : getSubTitle().hashCode());
        hashCode = prime * hashCode
                + ((getAttachmentLinkUrl() == null) ? 0 : getAttachmentLinkUrl().hashCode());
        hashCode = prime * hashCode + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        hashCode = prime * hashCode + ((getButtons() == null) ? 0 : getButtons().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenericAttachment == false)
            return false;
        GenericAttachment other = (GenericAttachment) obj;

        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getSubTitle() == null ^ this.getSubTitle() == null)
            return false;
        if (other.getSubTitle() != null && other.getSubTitle().equals(this.getSubTitle()) == false)
            return false;
        if (other.getAttachmentLinkUrl() == null ^ this.getAttachmentLinkUrl() == null)
            return false;
        if (other.getAttachmentLinkUrl() != null
                && other.getAttachmentLinkUrl().equals(this.getAttachmentLinkUrl()) == false)
            return false;
        if (other.getImageUrl() == null ^ this.getImageUrl() == null)
            return false;
        if (other.getImageUrl() != null && other.getImageUrl().equals(this.getImageUrl()) == false)
            return false;
        if (other.getButtons() == null ^ this.getButtons() == null)
            return false;
        if (other.getButtons() != null && other.getButtons().equals(this.getButtons()) == false)
            return false;
        return true;
    }
}
