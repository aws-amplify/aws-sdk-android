package com.amazonaws.mobileconnectors.lex.interactionkit.PostText.Listeners;



import com.amazonaws.mobileconnectors.lex.interactionkit.PostText.Continuations.LexServiceContinuation;
import com.amazonaws.mobileconnectors.lex.interactionkit.PostText.TextResponse;

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

