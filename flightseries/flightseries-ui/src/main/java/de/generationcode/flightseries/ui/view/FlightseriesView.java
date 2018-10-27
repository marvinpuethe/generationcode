package de.generationcode.flightseries.ui.view;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class FlightseriesView extends VerticalLayout {

	public FlightseriesView() {
		add(new Button("Click me", e -> Notification.show("Hello Spring+Vaadin user!")));
		add(new Label("Hier steht was..."));
	}
}
