package org.jraf.android.prefwrapper.sample;

import java.util.Set;

import android.content.Context;

import org.jraf.android.prefwrapper.DefaultInt;
import org.jraf.android.prefwrapper.DefaultStringSet;
import org.jraf.android.prefwrapper.Mode;
import org.jraf.android.prefwrapper.Name;
import org.jraf.android.prefwrapper.PrefWrapper;

@PrefWrapper
@Name("settings")
@Mode(Context.MODE_PRIVATE)
public class SettingsPreferences {
    @DefaultInt(0xFFBB00DD)
    Integer preferredColor;

    /**
     * The week days that the user prefers.
     */
    @DefaultStringSet({"Friday", "Saturday"})
    Set<String> weekDays;

}
