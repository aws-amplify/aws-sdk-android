package com.amazonaws.mobileconnectors.lex.interactionkit.PostText;

/**
 * Created by prakritibansal on 12/28/17.
 */


import com.amazonaws.services.lexrts.model.PostTextResult;
import com.amazonaws.services.lexrts.model.ResponseCard;

import java.util.Map;


public class TextResponse {
    private final PostTextResult result;

    /**
     * Uses the service response to create an instance of this class.
     * @param result response from the service.
     */
    protected TextResponse(PostTextResult result) {
        this.result = result;
    }

    /**
     * Returns the dialog state. The dialog states represent the service's
     * intent in this response, that is what the service expects from the user.
     * There are five dialog states.
     *
     * @return dialog state as {@link String}.
     */
    public String getDialogState() {
        return result.getDialogState();
    }

    /**
     * Returns session attributes.
     * @return session attributes, as {@link Map}.
     */
    public Map<String, String> getSessionAttributes() {
        return result.getSessionAttributes();
    }


    /**
     * Returns a text response from the service.
     * @return text response, as {@link String}.
     */
    public String getTextResponse() {
        return  result.getMessage();
    }

    /**
     * Returns the name of the slot which is required from the user.
     *
     * @return parameter required from user, as {@link String}.
     */
    public String getSlotToIllicit() {
        return result.getSlotToElicit();
    }

    /**
     *
     * @return
     */
    public String getIntentName() {
        return result.getIntentName();
    }

    /**
     * Returns a Map of key value pair of the slots which are filled.
     *
     * @return
     */
    public Map<String, String> getSlots() {
        return result.getSlots();
    }

    /**
     * Returns a CardResponse
     *
     * @return ResponseCard
     */

    public ResponseCard getResponseCard(){
        return result.getResponseCard();
    }


}
