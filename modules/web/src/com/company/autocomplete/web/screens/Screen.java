package com.company.autocomplete.web.screens;

import com.company.autocomplete.web.gui.components.AutocompleteTextField;
import com.haulmont.cuba.core.global.UuidProvider;
import com.haulmont.cuba.gui.components.AbstractWindow;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Screen extends AbstractWindow {

    @Inject
    private AutocompleteTextField a;

    @Override
    public void init(Map<String, Object> params) {
        a.setMinSearchStringLength(2);
        a.setAsyncSearchDelayMs(200);
        a.setSuggestionsLimit(15);
        a.setSuggestionProvider(new AutocompleteTextField.SuggestionProvider() {
            @Override
            public List<String> getSuggestions(String currentValue, int limit) {
                List<String> result = new ArrayList<>();
                for (int i = 0; i < limit; i++) {
                    result.add(currentValue + UuidProvider.createUuid());
                }
                return result;
            }
        });
        a.addValueChangeListener(new ValueChangeListener() {
            @Override
            public void valueChanged(ValueChangeEvent e) {
                int h = 0;
            }
        });
        a.setRequired(true);
    }
}