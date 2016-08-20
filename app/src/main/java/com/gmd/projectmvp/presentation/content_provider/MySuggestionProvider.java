package com.gmd.projectmvp.presentation.content_provider;

import android.content.SearchRecentSuggestionsProvider;

/**
 * Created by tincio on 26/07/2016.
 */
public class MySuggestionProvider extends SearchRecentSuggestionsProvider {

    public final static String AUTHORITY = "com.gmd.projectmvp.presentation.content_provider.MySuggestionProvider";
    public final static int MODE = DATABASE_MODE_QUERIES;

    public MySuggestionProvider() {
        setupSuggestions(AUTHORITY, MODE);
    }

}
