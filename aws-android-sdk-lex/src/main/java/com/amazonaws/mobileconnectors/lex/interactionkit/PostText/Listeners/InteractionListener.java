package com.example.prakritibansal.posttextrequest.Listeners;

/**
 * Created by prakritibansal on 12/28/17.
 */

import com.example.prakritibansal.posttextrequest.Continuations.LexServiceContinuation;
import com.example.prakritibansal.posttextrequest.TextResponse;

/**
 * Interaction listener.
 */
public interface InteractionListener {

    /**
     * This is invoked when all information required to fulfill a transaction
     * has been recovered.
     *
     * @param response {@link TextResponse}, contains the service
     *            response.
     */
    public void onReadyForFulfillment(final TextResponse response);

    /**
     * This is invoked when input is required from the user.
     *
     * @param response {@link TextResponse}, contains the service
     *            response.
     * @param continuation {@link LexServiceContinuation}, allows to
     *            continue with the current transaction.
     */
    public void promptUserToRespond(final TextResponse response,
                                    final LexServiceContinuation continuation);

    /**
     * This method is invoked on error.
     *
     * @param response {@link TextResponse}, contains the service
     *            response.
     * @param e error reported as {@link Exception}.
     */
    public void onInteractionError(final TextResponse response, final Exception e);
}

