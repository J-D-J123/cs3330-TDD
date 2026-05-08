package edu.oop.guild.log;

/**
 * Author:          Jack Belleville
 * Date:            05/07/2026
 * File:            GuildLog.java
 * Desc:            Singleton log of guild delivery activity. Entries are
 *                  exposed via an unmodifiable view.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class GuildLog {
	private static final GuildLog INSTANCE = new GuildLog();
	private final List<String> entries = new ArrayList<>();

	private GuildLog() {}

	public static GuildLog getInstance() {
		return INSTANCE;
	}

	public void record(String entry) {
		Objects.requireNonNull(entry);
		entries.add(entry);
	}

	public List<String> entries() {
		return Collections.unmodifiableList(entries);
	}

	public int size() {
		return entries.size();
	}

	public void clear() {
		entries.clear();
	}
}
