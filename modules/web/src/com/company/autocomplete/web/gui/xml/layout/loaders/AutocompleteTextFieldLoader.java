package com.company.autocomplete.web.gui.xml.layout.loaders;

import com.company.autocomplete.web.gui.components.AutocompleteTextField;
import com.haulmont.cuba.gui.xml.layout.loaders.AbstractComponentLoader;

public class AutocompleteTextFieldLoader extends AbstractComponentLoader<AutocompleteTextField> {
    @Override
    public void createComponent() {
        resultComponent = factory.createComponent(AutocompleteTextField.class);
        loadId(resultComponent, element);
    }

    @Override
    public void loadComponent() {
    }
}
