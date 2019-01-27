package com.company.autocomplete.web.gui.components;

import com.haulmont.cuba.gui.components.TextField;

import java.util.List;

public interface AutocompleteTextField extends TextField {
    String NAME = "autocompleteTextField";

    int getMinSearchStringLength();

    void setMinSearchStringLength(int minSearchStringLength);

    int getAsyncSearchDelayMs();

    void setAsyncSearchDelayMs(int delay);

    int getSuggestionsLimit();

    void setSuggestionsLimit(int limit);

    void setSuggestionProvider(SuggestionProvider suggestionProvider);

    interface SuggestionProvider {
        List<String> getSuggestions(String currentValue, int limit);
    }
}