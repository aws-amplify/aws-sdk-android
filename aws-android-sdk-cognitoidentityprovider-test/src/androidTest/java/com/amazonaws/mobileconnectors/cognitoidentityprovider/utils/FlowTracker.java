package com.amazonaws.mobileconnectors.cognitoidentityprovider.utils;

// A helper class to track the control flow with callbacks
public class FlowTracker {
	// This stores the next expected label
	private String next;

	// This indicates if this check has to be made
	private boolean active;
	
	// Constructor with a next label
	public FlowTracker(String next) {
		this.next = new String(next);
		this.active = false;
	}
	
	// Constructor without a next label
	public FlowTracker() {
		this.next = "checkpoint unknown";
		this.active = false;
	}
	
	// Sets the next label to expect
	public void setNext(String next) {
		this.next = next;
	}
	
	// Checks of the current label is whats expected
	public boolean check(String current) {
		if (active) {
			return this.next.equals(current);
		}
		else {
			return true;
		}
	}

	// Activates the tracker
	public void activate() {
		this.active = true;
	}

	// De-activates the tracker
	public void deactivate() {
		this.active = false;
	}
}