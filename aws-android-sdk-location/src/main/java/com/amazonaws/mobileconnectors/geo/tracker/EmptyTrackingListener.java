package com.amazonaws.mobileconnectors.geo.tracker;

/**
 * Empty implementation of Tracking Listener used as a placeholder if the user doesn't care about receiving events.
 */
public class EmptyTrackingListener implements TrackingListener {
    @Override
    public void onStop() {}

    @Override
    public void onDataPublished(TrackingPublishedEvent event) {}

    @Override
    public void onDataPublicationError(TrackingError error) {}
}
