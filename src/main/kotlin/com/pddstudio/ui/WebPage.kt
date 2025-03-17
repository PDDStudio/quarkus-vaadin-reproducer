package com.pddstudio.ui

import com.vaadin.flow.component.html.H1
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.router.Route
import com.vaadin.flow.theme.lumo.LumoUtility.FontSize
import com.vaadin.flow.theme.lumo.LumoUtility.Margin
import com.vaadin.flow.theme.lumo.LumoUtility.TextColor

@Route("/")
class WebPage : HorizontalLayout() {

    init {
        val heading = H1("Welcome to quarkus-reproducer").apply {
            addClassNames(
                FontSize.XXXLARGE,
                Margin.Bottom.MEDIUM,
                TextColor.PRIMARY
            )
        }
        add(heading)
    }
}
